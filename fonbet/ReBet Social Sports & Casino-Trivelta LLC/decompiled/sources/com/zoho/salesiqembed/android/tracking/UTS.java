package com.zoho.salesiqembed.android.tracking;

import Q2.L;
import Q2.w;
import android.content.SharedPreferences;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.Q;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import rd.C6218a;
import ug.AbstractC6574b;
import wg.C6751f;
import wg.InterfaceC6747b;
import zg.AbstractC6991a;
import zg.AbstractC6992b;

/* loaded from: classes4.dex */
public class UTS {
    private static final UTS UTSINSTANCE = new UTS();
    private Thread callbacksThread;
    private InterfaceC6747b conhandler;
    private Thread readingThread;
    private String sid;
    private String sockurl;
    private AbstractC6991a ws;
    private String zldp;
    private String zldt;
    private int pex_conn_status = -1;
    private final Object conLock = new Object();
    private a wshandler = new a();
    private UUID webSocketConnectionUUID = null;

    public class a implements zg.c {
        public a() {
        }

        @Override // zg.c
        public HashMap a() {
            LiveChatUtil.log("UTS | getRequestConnectionHeaders");
            return new HashMap();
        }

        @Override // zg.c
        public void b() {
            LiveChatUtil.log("UTS | onConnectStart");
        }

        @Override // zg.c
        public void c() {
            UTS.this.pex_conn_status = 1;
            UTS.this.conhandler.j();
            LiveChatUtil.log("UTS | onOpen");
        }

        @Override // zg.c
        public void d(int i10) {
            LiveChatUtil.log("UTS | onClose");
            UTS.this.pex_conn_status = 0;
            UTS.this.conhandler.i();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00fa A[Catch: Exception -> 0x00ec, TryCatch #2 {Exception -> 0x00ec, blocks: (B:3:0x0010, B:5:0x002c, B:7:0x0030, B:8:0x0036, B:10:0x003c, B:12:0x0049, B:14:0x0059, B:16:0x0061, B:19:0x0071, B:27:0x00f4, B:29:0x00fa, B:31:0x0100, B:33:0x0110, B:34:0x0115, B:35:0x0118, B:37:0x011e, B:42:0x0146, B:43:0x0149, B:45:0x014f, B:50:0x0177, B:53:0x0183, B:55:0x018b, B:56:0x01af, B:59:0x01bd, B:60:0x01d3, B:70:0x00e8, B:47:0x015a, B:39:0x0129), top: B:2:0x0010, inners: #3, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0110 A[Catch: Exception -> 0x00ec, TryCatch #2 {Exception -> 0x00ec, blocks: (B:3:0x0010, B:5:0x002c, B:7:0x0030, B:8:0x0036, B:10:0x003c, B:12:0x0049, B:14:0x0059, B:16:0x0061, B:19:0x0071, B:27:0x00f4, B:29:0x00fa, B:31:0x0100, B:33:0x0110, B:34:0x0115, B:35:0x0118, B:37:0x011e, B:42:0x0146, B:43:0x0149, B:45:0x014f, B:50:0x0177, B:53:0x0183, B:55:0x018b, B:56:0x01af, B:59:0x01bd, B:60:0x01d3, B:70:0x00e8, B:47:0x015a, B:39:0x0129), top: B:2:0x0010, inners: #3, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x011e A[Catch: Exception -> 0x00ec, TRY_LEAVE, TryCatch #2 {Exception -> 0x00ec, blocks: (B:3:0x0010, B:5:0x002c, B:7:0x0030, B:8:0x0036, B:10:0x003c, B:12:0x0049, B:14:0x0059, B:16:0x0061, B:19:0x0071, B:27:0x00f4, B:29:0x00fa, B:31:0x0100, B:33:0x0110, B:34:0x0115, B:35:0x0118, B:37:0x011e, B:42:0x0146, B:43:0x0149, B:45:0x014f, B:50:0x0177, B:53:0x0183, B:55:0x018b, B:56:0x01af, B:59:0x01bd, B:60:0x01d3, B:70:0x00e8, B:47:0x015a, B:39:0x0129), top: B:2:0x0010, inners: #3, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x014f A[Catch: Exception -> 0x00ec, TRY_LEAVE, TryCatch #2 {Exception -> 0x00ec, blocks: (B:3:0x0010, B:5:0x002c, B:7:0x0030, B:8:0x0036, B:10:0x003c, B:12:0x0049, B:14:0x0059, B:16:0x0061, B:19:0x0071, B:27:0x00f4, B:29:0x00fa, B:31:0x0100, B:33:0x0110, B:34:0x0115, B:35:0x0118, B:37:0x011e, B:42:0x0146, B:43:0x0149, B:45:0x014f, B:50:0x0177, B:53:0x0183, B:55:0x018b, B:56:0x01af, B:59:0x01bd, B:60:0x01d3, B:70:0x00e8, B:47:0x015a, B:39:0x0129), top: B:2:0x0010, inners: #3, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0183 A[Catch: Exception -> 0x00ec, TryCatch #2 {Exception -> 0x00ec, blocks: (B:3:0x0010, B:5:0x002c, B:7:0x0030, B:8:0x0036, B:10:0x003c, B:12:0x0049, B:14:0x0059, B:16:0x0061, B:19:0x0071, B:27:0x00f4, B:29:0x00fa, B:31:0x0100, B:33:0x0110, B:34:0x0115, B:35:0x0118, B:37:0x011e, B:42:0x0146, B:43:0x0149, B:45:0x014f, B:50:0x0177, B:53:0x0183, B:55:0x018b, B:56:0x01af, B:59:0x01bd, B:60:0x01d3, B:70:0x00e8, B:47:0x015a, B:39:0x0129), top: B:2:0x0010, inners: #3, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01bd A[Catch: Exception -> 0x00ec, TryCatch #2 {Exception -> 0x00ec, blocks: (B:3:0x0010, B:5:0x002c, B:7:0x0030, B:8:0x0036, B:10:0x003c, B:12:0x0049, B:14:0x0059, B:16:0x0061, B:19:0x0071, B:27:0x00f4, B:29:0x00fa, B:31:0x0100, B:33:0x0110, B:34:0x0115, B:35:0x0118, B:37:0x011e, B:42:0x0146, B:43:0x0149, B:45:0x014f, B:50:0x0177, B:53:0x0183, B:55:0x018b, B:56:0x01af, B:59:0x01bd, B:60:0x01d3, B:70:0x00e8, B:47:0x015a, B:39:0x0129), top: B:2:0x0010, inners: #3, #4 }] */
        @Override // zg.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onMessage(String str) {
            String str2;
            String str3;
            String str4;
            String str5;
            SharedPreferences.Editor edit;
            String str6 = "_zldt";
            String str7 = "o";
            String str8 = W9.d.f13160a;
            try {
                LiveChatUtil.log("UTS | onMessage: " + str);
                Object d10 = AbstractC6574b.d(str);
                if (d10 == null || !(d10 instanceof ArrayList)) {
                    return;
                }
                Iterator it = ((ArrayList) d10).iterator();
                while (it.hasNext()) {
                    Hashtable hashtable = (Hashtable) it.next();
                    if (hashtable.containsKey(str7)) {
                        int intValue = ((Integer) hashtable.get(str7)).intValue();
                        if (hashtable.containsKey(str8) && (hashtable.get(str8) instanceof Hashtable)) {
                            Hashtable hashtable2 = (Hashtable) hashtable.get(str8);
                            if (hashtable2.containsKey(str6)) {
                                UTS.this.zldt = (String) hashtable2.get(str6);
                                try {
                                    SharedPreferences sharedPreferences = MobilistenInitProvider.k().getSharedPreferences("siq_session", 0);
                                    str2 = str6;
                                    if (sharedPreferences.contains("zldt")) {
                                        str3 = str7;
                                        str4 = str8;
                                        if (!sharedPreferences.getString("zldt", null).equalsIgnoreCase(UTS.this.zldt)) {
                                            SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                            edit2.putString("zldt", UTS.this.zldt);
                                            edit2.putLong("zldtexpiry", rd.b.f());
                                            edit2.remove("handshakekey");
                                            edit2.apply();
                                        }
                                    } else {
                                        try {
                                            edit = sharedPreferences.edit();
                                            edit.putString("zldt", UTS.this.zldt);
                                            str3 = str7;
                                            str4 = str8;
                                        } catch (Exception e10) {
                                            e = e10;
                                            str3 = str7;
                                            str4 = str8;
                                            LiveChatUtil.log(e);
                                            if (hashtable2.containsKey("vwmsid")) {
                                                SharedPreferences.Editor edit3 = C6218a.M().edit();
                                                str5 = (String) hashtable2.get("vwmsid");
                                                if (str5 != null) {
                                                }
                                                edit3.apply();
                                            }
                                            if (hashtable2.containsKey("_zldp")) {
                                            }
                                            if (hashtable2.containsKey("sid")) {
                                            }
                                            if (intValue == 2) {
                                            }
                                            if (intValue == 1) {
                                            }
                                            UTS.this.conhandler.h(hashtable);
                                            str7 = str3;
                                            str6 = str2;
                                            str8 = str4;
                                        }
                                        try {
                                            edit.putLong("zldtexpiry", rd.b.f());
                                            edit.remove("handshakekey");
                                            edit.apply();
                                        } catch (Exception e11) {
                                            e = e11;
                                            LiveChatUtil.log(e);
                                            if (hashtable2.containsKey("vwmsid")) {
                                            }
                                            if (hashtable2.containsKey("_zldp")) {
                                            }
                                            if (hashtable2.containsKey("sid")) {
                                            }
                                            if (intValue == 2) {
                                            }
                                            if (intValue == 1) {
                                            }
                                            UTS.this.conhandler.h(hashtable);
                                            str7 = str3;
                                            str6 = str2;
                                            str8 = str4;
                                        }
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    str2 = str6;
                                }
                            } else {
                                str2 = str6;
                                str3 = str7;
                                str4 = str8;
                            }
                            if (hashtable2.containsKey("vwmsid") && C6218a.M() != null) {
                                SharedPreferences.Editor edit32 = C6218a.M().edit();
                                str5 = (String) hashtable2.get("vwmsid");
                                if (str5 != null) {
                                    edit32.putString("annonid", str5);
                                }
                                edit32.apply();
                            }
                            if (hashtable2.containsKey("_zldp")) {
                                UTS.this.zldp = (String) hashtable2.get("_zldp");
                                try {
                                    SharedPreferences.Editor edit4 = MobilistenInitProvider.k().getSharedPreferences("siq_session", 0).edit();
                                    edit4.putString("zldp", UTS.this.zldp);
                                    edit4.apply();
                                } catch (Exception e13) {
                                    LiveChatUtil.log(e13);
                                }
                            }
                            if (hashtable2.containsKey("sid")) {
                                UTS.this.sid = (String) hashtable2.get("sid");
                                try {
                                    SharedPreferences.Editor edit5 = MobilistenInitProvider.k().getSharedPreferences("siq_session", 0).edit();
                                    edit5.putString("utssid", UTS.this.sid);
                                    edit5.apply();
                                } catch (Exception e14) {
                                    LiveChatUtil.log(e14);
                                }
                            }
                        } else {
                            str2 = str6;
                            str3 = str7;
                            str4 = str8;
                        }
                        if (intValue == 2) {
                            if (UTS.this.zldt != null) {
                                Hashtable hashtable3 = new Hashtable();
                                hashtable3.put("opr", "ack");
                                hashtable3.put("uvid", UTS.this.zldt);
                                UTS.this.ws.m(AbstractC6574b.g(hashtable3));
                            }
                            LiveChatUtil.log("UTS: New visitor");
                            UTSUtil.clearBotTriggers();
                            UTSUtil.clearBotTriggeredActionsList();
                        }
                        if (intValue == 1) {
                            LiveChatUtil.log("UTS: Existing visitor");
                            UTS.this.ws.m("--1--");
                        }
                    } else {
                        str2 = str6;
                        str3 = str7;
                        str4 = str8;
                    }
                    UTS.this.conhandler.h(hashtable);
                    str7 = str3;
                    str6 = str2;
                    str8 = str4;
                }
            } catch (Exception e15) {
                LiveChatUtil.log(e15);
            }
        }
    }

    public static /* synthetic */ Unit a(UTS uts, L l10) {
        uts.getClass();
        w wVar = (w) new w.a(VTSWebSocketKeepAliveWorker.class).a();
        uts.webSocketConnectionUUID = wVar.a();
        l10.b(wVar);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b() {
        LiveChatUtil.log("WorkManager initialization failed, falling back to threads");
        return Unit.INSTANCE;
    }

    private void checkforzldtExpiry() {
        try {
            SharedPreferences sharedPreferences = MobilistenInitProvider.k().getSharedPreferences("siq_session", 0);
            if (this.zldp == null) {
                this.zldp = sharedPreferences.getString("zldp", null);
            }
            if (this.zldt == null) {
                this.zldt = sharedPreferences.getString("zldt", null);
                long j10 = sharedPreferences.getLong("zldtexpiry", 0L);
                if (j10 == 0 || rd.b.f() - j10 < 86400000) {
                    return;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove("zldtexpiry");
                edit.remove("zldt");
                edit.apply();
                this.zldt = null;
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static UTS getInstance() {
        return UTSINSTANCE;
    }

    private String getParamString(String str, Object obj) {
        return "&" + str + "=" + URLEncoder.encode("" + obj);
    }

    private void initiateWorker() {
        com.zoho.messenger.api.g.g("Mobilisten", null, new Function1() { // from class: com.zoho.salesiqembed.android.tracking.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UTS.a(UTS.this, (L) obj);
            }
        }, new Function0() { // from class: com.zoho.salesiqembed.android.tracking.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UTS.b();
            }
        });
    }

    private static void log(String str) {
        boolean z10 = Q.f44448i;
    }

    public void hold() {
        AbstractC6991a abstractC6991a = this.ws;
        if (abstractC6991a != null) {
            abstractC6991a.e();
        }
    }

    public void init(String str, String str2, String str3, String str4, Hashtable hashtable) {
        String str5;
        synchronized (this.conLock) {
            try {
                if (this.pex_conn_status > 0) {
                    return;
                }
                this.pex_conn_status = 2;
                String str6 = str + "?nocache=" + rd.b.f();
                if (C6218a.M().contains("executedtriggerid")) {
                    str6 = str6 + "&source_triggerid=" + C6218a.M().getString("executedtriggerid", "");
                }
                if (str2 != null) {
                    try {
                        str6 = str6 + getParamString("x-appkey", str2);
                    } catch (Exception e10) {
                        LiveChatUtil.log(e10);
                    }
                }
                if (str3 != null) {
                    str6 = str6 + getParamString("x-accesskey", str3);
                }
                String str7 = ((str6 + getParamString("x-bundleid", str4)) + getParamString("x-os", "2")) + getParamString("lang_embed", LiveChatUtil.getLanguage());
                if (hashtable != null) {
                    Enumeration keys = hashtable.keys();
                    while (keys.hasMoreElements()) {
                        String str8 = (String) keys.nextElement();
                        String str9 = (String) hashtable.get(str8);
                        if (str8 != null && str9 != null) {
                            str7 = str7 + getParamString(str8, str9);
                        }
                    }
                }
                this.sockurl = str7;
                if (C6218a.M().contains("utssid")) {
                    this.sid = C6218a.M().getString("utssid", null);
                }
                if (this.sid != null) {
                    str7 = (str7 + getParamString("x-sid", this.sid)) + getParamString("recon", "true");
                }
                checkforzldtExpiry();
                if (!C6218a.M().contains("zldt")) {
                    if (C6218a.M().contains("handshakekey")) {
                        str5 = C6218a.M().getString("handshakekey", null);
                    } else {
                        str5 = System.currentTimeMillis() + "";
                    }
                    str7 = str7 + getParamString("handshakekey", str5);
                }
                if (this.zldp != null) {
                    str7 = str7 + getParamString("_zldp", this.zldp);
                }
                if (this.zldt != null) {
                    str7 = str7 + getParamString("_zldt", this.zldt);
                }
                LiveChatUtil.log("UTS | Connecting to: " + str7);
                AbstractC6991a a10 = AbstractC6992b.a(str7);
                this.ws = a10;
                a10.j(this.wshandler);
                this.conhandler.g();
                this.ws.d();
                initiateWorker();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isHold() {
        AbstractC6991a abstractC6991a = this.ws;
        return abstractC6991a != null && abstractC6991a.f();
    }

    public void reconnect() {
        String str;
        synchronized (this.conLock) {
            try {
                if (this.pex_conn_status > 0) {
                    return;
                }
                this.pex_conn_status = 2;
                String str2 = this.sockurl;
                if (this.sid != null) {
                    str2 = (str2 + getParamString("x-sid", this.sid)) + getParamString("recon", "true");
                }
                checkforzldtExpiry();
                if (!C6218a.M().contains("zldt")) {
                    if (C6218a.M().contains("handshakekey")) {
                        str = C6218a.M().getString("handshakekey", null);
                    } else {
                        str = System.currentTimeMillis() + "";
                    }
                    str2 = str2 + getParamString("handshakekey", str);
                }
                if (this.zldp != null) {
                    str2 = str2 + getParamString("_zldp", this.zldp);
                }
                if (this.zldt != null) {
                    str2 = str2 + getParamString("_zldt", this.zldt);
                }
                LiveChatUtil.log("UTS | Re-Connecting to: " + str2);
                AbstractC6991a a10 = AbstractC6992b.a(str2);
                this.ws = a10;
                a10.j(this.wshandler);
                this.conhandler.g();
                this.ws.d();
                initiateWorker();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void resume() {
        AbstractC6991a abstractC6991a = this.ws;
        if (abstractC6991a != null) {
            abstractC6991a.g();
        }
    }

    public void setHandler(InterfaceC6747b interfaceC6747b) {
        this.conhandler = interfaceC6747b;
    }

    public void shutDown() {
        AbstractC6991a abstractC6991a = this.ws;
        if (abstractC6991a != null) {
            this.sid = null;
            this.zldp = null;
            this.zldt = null;
            abstractC6991a.c();
            try {
                L.g().a(this.webSocketConnectionUUID);
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
            try {
                try {
                    this.readingThread.interrupt();
                } finally {
                    this.readingThread = null;
                }
            } catch (Exception e11) {
                LiveChatUtil.log(e11);
            }
            try {
                try {
                    this.callbacksThread.interrupt();
                } finally {
                    this.callbacksThread = null;
                }
            } catch (Exception e12) {
                LiveChatUtil.log(e12);
            }
        }
    }

    public void startListeningCallbacks() {
        this.ws.k();
    }

    public void startSyncing() {
        this.ws.l();
    }

    public void writeData(Hashtable hashtable) {
        log(Yd.a.j().v(hashtable));
        if (this.pex_conn_status == 1) {
            this.ws.m(AbstractC6574b.g(hashtable));
        } else {
            this.pex_conn_status = -1;
            throw new C6751f(101, "No connection available");
        }
    }
}
