package com.zoho.salesiqembed.android.tracking;

import android.os.Handler;
import android.os.Looper;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import rd.C6218a;
import ug.AbstractC6574b;
import wg.InterfaceC6747b;

/* loaded from: classes4.dex */
public class UTSAdapter {
    private static UTS uts;
    private static c utsMessageHandler;
    private static Status status = Status.DISCONNECTED;
    private static boolean isforcedisconnect = false;
    private static int recvar = 0;
    private static boolean isreconnect = false;
    private static List<Integer> rectime = Arrays.asList(5000, 15000, 30000, 60000, 900000);
    private static Handler handler = new Handler(Looper.getMainLooper());
    static Runnable timedTask = new a();

    public enum Status {
        CONNECTING,
        DISCONNECTED,
        RECONNECTED,
        CONNECTED
    }

    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            UTSAdapter.startReconnect();
            if (UTSAdapter.recvar < 4) {
                UTSAdapter.access$108();
            }
            UTSAdapter.handler.postDelayed(UTSAdapter.timedTask, ((Integer) UTSAdapter.rectime.get(UTSAdapter.recvar)).intValue());
        }
    }

    public static class b implements InterfaceC6747b {
        public b() {
        }

        @Override // wg.InterfaceC6747b
        public HashMap a() {
            LiveChatUtil.log("UTS CONNECTION | getRequestConnectionHeaders");
            return new HashMap();
        }

        @Override // wg.InterfaceC6747b
        public void b() {
            LiveChatUtil.log("UTS CONNECTION | onConnectStart");
        }

        @Override // wg.InterfaceC6747b
        public void c(Hashtable hashtable) {
            LiveChatUtil.log("UTS CONNECTION | onNetworkUp");
        }

        @Override // wg.InterfaceC6747b
        public void d(String str) {
            LiveChatUtil.log("UTS CONNECTION | onLog: " + str);
        }

        @Override // wg.InterfaceC6747b
        public HashMap e() {
            LiveChatUtil.log("UTS CONNECTION | getRequestConnectionParams");
            return new HashMap();
        }

        @Override // wg.InterfaceC6747b
        public void f(Hashtable hashtable) {
            LiveChatUtil.log("UTS CONNECTION | onReconnect");
            Status unused = UTSAdapter.status = Status.CONNECTED;
            boolean unused2 = UTSAdapter.isreconnect = false;
            UTSAdapter.handler.removeCallbacks(UTSAdapter.timedTask);
            int unused3 = UTSAdapter.recvar = 0;
        }

        @Override // wg.InterfaceC6747b
        public void g() {
            LiveChatUtil.log("UTS CONNECTION | onBeforeConnect");
        }

        @Override // wg.InterfaceC6747b
        public void h(Hashtable hashtable) {
            LiveChatUtil.log("UTS CONNECTION | onMessage: " + hashtable);
            if (hashtable.containsKey("o")) {
                int intValue = ((Integer) hashtable.get("o")).intValue();
                Hashtable hashtable2 = (Hashtable) hashtable.get(W9.d.f13160a);
                if (intValue != 0 && intValue != 1) {
                    if (hashtable2 == null || intValue == 2 || UTSAdapter.utsMessageHandler == null) {
                        return;
                    }
                    UTSAdapter.utsMessageHandler.c(intValue, hashtable2);
                    return;
                }
                if (UTSAdapter.utsMessageHandler != null) {
                    if (intValue == 0) {
                        UTSAdapter.utsMessageHandler.a(hashtable2);
                    } else {
                        UTSAdapter.utsMessageHandler.d(hashtable2);
                    }
                }
                if (C6218a.W()) {
                    return;
                }
                UTSAdapter.hold();
            }
        }

        @Override // wg.InterfaceC6747b
        public void i() {
            LiveChatUtil.log("UTS CONNECTION | onDisconnect");
            Status unused = UTSAdapter.status = Status.DISCONNECTED;
            try {
                if (UTSAdapter.isreconnect || UTSAdapter.isforcedisconnect) {
                    if (UTSAdapter.utsMessageHandler != null) {
                        UTSAdapter.utsMessageHandler.b();
                    }
                } else {
                    boolean unused2 = UTSAdapter.isreconnect = true;
                    Status unused3 = UTSAdapter.status = Status.RECONNECTED;
                    UTSAdapter.handler.postDelayed(UTSAdapter.timedTask, ((Integer) UTSAdapter.rectime.get(UTSAdapter.recvar)).intValue());
                }
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
        }

        @Override // wg.InterfaceC6747b
        public void j() {
            LiveChatUtil.log("UTS CONNECTION | onConnect");
            Status unused = UTSAdapter.status = Status.CONNECTED;
            boolean unused2 = UTSAdapter.isreconnect = false;
            UTSAdapter.handler.removeCallbacks(UTSAdapter.timedTask);
            int unused3 = UTSAdapter.recvar = 0;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static /* synthetic */ int access$108() {
        int i10 = recvar;
        recvar = i10 + 1;
        return i10;
    }

    public static void connect(String str, String str2, String str3, String str4, Hashtable hashtable) {
        if (uts == null) {
            UTS uts2 = UTS.getInstance();
            uts = uts2;
            uts2.setHandler(new b(null));
        }
        Status status2 = status;
        Status status3 = Status.CONNECTING;
        if (status2 == status3) {
            isforcedisconnect = false;
        }
        if (status == Status.RECONNECTED) {
            status = Status.DISCONNECTED;
        }
        if (status == Status.DISCONNECTED) {
            isreconnect = false;
            handler.removeCallbacks(timedTask);
            recvar = 0;
            status = status3;
            isreconnect = false;
            isforcedisconnect = false;
            Hashtable hashtable2 = new Hashtable();
            hashtable2.put("os", C6218a.L());
            hashtable2.put("os-version", C6218a.K());
            hashtable2.put("mobilemanufacturer", C6218a.B());
            hashtable2.put("mobileversion", C6218a.N());
            String property = System.getProperty("http.agent");
            if (property != null) {
                hashtable2.put("ua", property);
            }
            hashtable.put("x-uts-agent", AbstractC6574b.g(hashtable2));
            hashtable.put("x-vwmsid", str);
            uts.init(getSocketUrl(), str2, str3, str4, hashtable);
        }
    }

    public static void disconnect() {
        UTSUtil.setTrackingConsentDialogShown(false);
        setNoReconnect();
        try {
            if (uts != null) {
                status = Status.DISCONNECTED;
                uts.shutDown();
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static Status getConnStatus() {
        return status;
    }

    private static String getSocketUrl() {
        String property = System.getProperty("mobilisten_vts_domain");
        if (property != null) {
            return property;
        }
        return "wss://vts" + sd.d.a().getTrackingDomain() + sd.d.a().getSufix() + "/watchws";
    }

    public static void hold() {
        LiveChatUtil.log("UTS | HOLD CALLED");
        setNoReconnect();
        if (status == Status.CONNECTED) {
            try {
                uts.hold();
                LiveChatUtil.log("UTS | HELD");
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
        }
    }

    public static boolean isHold() {
        try {
            return uts.isHold();
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return false;
        }
    }

    public static boolean isUtsConnected() {
        return status == Status.CONNECTED || status == Status.RECONNECTED;
    }

    public static void networkUp() {
        isforcedisconnect = false;
        handler.removeCallbacks(timedTask);
        recvar = 0;
        handler.postDelayed(timedTask, rectime.get(0).intValue());
    }

    public static void resume() {
        LiveChatUtil.log("UTS | RESUME CALLED");
        try {
            if (status == Status.DISCONNECTED || !uts.isHold()) {
                return;
            }
            uts.resume();
            LiveChatUtil.log("UTS | RESUME");
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static void setHandler(c cVar) {
        utsMessageHandler = cVar;
    }

    public static void setNoReconnect() {
        isforcedisconnect = true;
        handler.removeCallbacks(timedTask);
        recvar = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void startReconnect() {
        try {
            uts.reconnect();
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static void writeData(Hashtable hashtable) {
        try {
            uts.writeData(hashtable);
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }
}
