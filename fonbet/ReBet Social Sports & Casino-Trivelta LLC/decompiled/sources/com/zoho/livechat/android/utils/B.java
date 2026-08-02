package com.zoho.livechat.android.utils;

import a1.C1908a;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.listeners.InitListener;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.provider.b;
import java.util.ArrayList;
import java.util.Hashtable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import od.AbstractC5884j;
import og.AbstractC5892d;
import rd.C6218a;
import zf.C6966g;

/* loaded from: classes4.dex */
public class B extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public Handler f44371a;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f44372b = null;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            B.this.c();
        }
    }

    public class b implements Runnable {

        public class a implements androidx.lifecycle.C {
            public a() {
            }

            @Override // androidx.lifecycle.C
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onChanged(Boolean bool) {
                if (bool.booleanValue()) {
                    return;
                }
                ZohoLiveChat.getApplicationManager();
                if (Uf.j.n() instanceof Yf.c) {
                    return;
                }
                rd.b.i().removeObserver(this);
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            rd.b.i().observeForever(new a());
            ZohoLiveChat.getApplicationManager();
            ne.j.t0(Uf.j.n());
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Hashtable f44376a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ nd.e f44377b;

        public c(Hashtable hashtable, nd.e eVar) {
            this.f44376a = hashtable;
            this.f44377b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (rd.b.d() != null) {
                    rd.b.d().a("libraryproperties", this.f44376a);
                }
                Ye.a.r(true, this.f44377b);
                ne.j.q0();
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
        }
    }

    public static /* synthetic */ Unit b(Boolean bool) {
        LiveChatUtil.log("Conversations call completed");
        p();
        return Unit.INSTANCE;
    }

    public static void d(String str, SalesIQChat salesIQChat) {
        if (LiveChatUtil.isConversationAllowedFromSalesIQ()) {
            return;
        }
        if ((C6218a.y() == null || !C6218a.y().equals(str)) && salesIQChat != null) {
            com.zoho.livechat.android.provider.a.INSTANCE.deleteConversation(MobilistenInitProvider.k().getContentResolver(), salesIQChat.getVisitorid(), str, true, false);
        }
    }

    public static void p() {
        ArrayList<String> allOpenChatIds = LiveChatUtil.getAllOpenChatIds();
        int i10 = 0;
        for (int i11 = 0; i11 < allOpenChatIds.size(); i11++) {
            SalesIQChat chat = LiveChatUtil.getChat(allOpenChatIds.get(i11));
            if (chat != null) {
                if (chat.getStatus() == 7) {
                    C6966g.x0(chat.getConvID(), chat.getVisitorid(), chat.getChid(), chat.getRchatid(), true, null);
                } else if (chat.getStatus() == 2) {
                    new qd.g().g(chat.getChid());
                    if (i10 < 25 && chat.getVisitorid() != null) {
                        Te.a.v0(chat.getChid(), chat.getVisitorid());
                        i10++;
                    }
                } else if (chat.getStatus() == 1 || chat.getStatus() == 5) {
                    if (chat.getVisitorid() != null) {
                        if (System.getProperty("fetch_messages") != null) {
                            System.clearProperty("fetch_messages");
                            C6966g.x0(chat.getConvID(), chat.getVisitorid(), chat.getChid(), chat.getRchatid(), false, null);
                        }
                    } else if (rd.b.c() != null) {
                        rd.b.c().start();
                        rd.b.l(null);
                    }
                }
                Intent intent = new Intent("receivelivechat");
                intent.putExtra("message", "wmsconnect");
                intent.putExtra("status", true);
                C1908a.b(MobilistenInitProvider.k()).d(intent);
            }
        }
    }

    public void c() {
        try {
            if (!C6218a.c0()) {
                if (!C6218a.J().equals("") && !C6218a.J().equals("9")) {
                    return;
                }
                Intent intent = new Intent("receivelivechat");
                intent.putExtra("message", "onPXRUserStatus");
                intent.putExtra("status", "nonetwork");
                C1908a.b(MobilistenInitProvider.k()).d(intent);
                return;
            }
            if (LiveChatUtil.getAnnonID() != null) {
                if (!qd.c.j()) {
                    qd.c.c();
                    return;
                }
                qd.c.m();
                ArrayList<String> allOpenChatIds = LiveChatUtil.getAllOpenChatIds();
                for (int i10 = 0; i10 < allOpenChatIds.size(); i10++) {
                    SalesIQChat chat = LiveChatUtil.getChat(allOpenChatIds.get(i10));
                    if (chat != null) {
                        if (chat.getStatus() == 7) {
                            C6966g.x0(chat.getConvID(), chat.getVisitorid(), chat.getChid(), chat.getRchatid(), true, null);
                        } else if (chat.getStatus() == 2) {
                            new qd.g().g(chat.getChid());
                        }
                    }
                }
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public Function1 e() {
        return this.f44372b;
    }

    public void f(Hashtable hashtable) {
        String chatid = LiveChatUtil.getChatid(LiveChatUtil.getString(hashtable.get("chid")));
        SalesIQChat chat = LiveChatUtil.getChat(chatid);
        if (chat != null) {
            chat.showQueue(false);
            chat.setQueueStartTime(0L);
            chat.setQueueEndTime(0L);
            chat.setQueuePosition(-1);
            long j10 = LiveChatUtil.getLong(hashtable.get("time"));
            if (j10 > 0) {
                chat.setLastmsgtime(j10);
            }
            chat.setWaitingTimerStartTime(rd.b.f());
            ZohoLiveChat.d.a(chat.getVisitorid());
            if (chat.getType() == SalesIQChat.c.Chat) {
                Ue.a.d(chat);
            }
            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat);
            chat.setQueuePosition(-1);
            LiveChatUtil.triggerChatListener("QUEUE_POSITION", chat);
            Intent intent = new Intent("receivelivechat");
            intent.putExtra("message", "refreshchat");
            intent.putExtra("chid", chatid);
            intent.putExtra("StartWaitingTimer", true);
            C1908a.b(MobilistenInitProvider.k()).d(intent);
        }
    }

    public void g(String str, Long l10) {
        if (str != null) {
            Q.k(str);
        }
        C6966g.z(str);
        SalesIQChat chat = LiveChatUtil.getChat(str);
        if (chat != null && chat.getStatus() != 4) {
            chat.setStatus(4);
            chat.showContinueChat(true);
            chat.setUnreadCount(0);
            chat.setQueuePosition(-1);
            chat.setQueueStartTime(-1L);
            chat.setQueueEndTime(-1L);
            chat.showQueue(false);
            if (l10 != null) {
                chat.setChatEndTime(l10.longValue());
            }
            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat);
            LiveChatUtil.updateBadgeListener(Kf.a.d(), false);
            if (chat.getType() == SalesIQChat.c.Chat) {
                LiveChatUtil.triggerChatListener("CHAT_CLOSE", chat);
                LiveChatUtil.removeActiveChatPKID();
            }
            Ue.a.t(chat);
            Intent intent = new Intent("receivelivechat");
            intent.putExtra("message", "refreshchat");
            intent.putExtra("chid", chat.getChid());
            intent.putExtra("endchat", true);
            C1908a.b(MobilistenInitProvider.k()).d(intent);
        }
        d(str, chat);
        ne.j.q0();
    }

    public void h(String str, Long l10) {
        if (str != null) {
            Q.k(str);
        }
        C6966g.z(str);
        SalesIQChat chat = LiveChatUtil.getChat(str);
        if (chat != null && chat.getStatus() != 4) {
            chat.setStatus(4);
            chat.showContinueChat(true);
            chat.setUnreadCount(0);
            chat.setQueuePosition(-1);
            chat.setQueueStartTime(-1L);
            chat.setQueueEndTime(-1L);
            chat.showQueue(false);
            if (l10 != null) {
                chat.setChatEndTime(l10.longValue());
            }
            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat);
            LiveChatUtil.updateBadgeListener(Kf.a.d(), false);
            if (chat.getType() == SalesIQChat.c.Chat) {
                LiveChatUtil.triggerChatListener("CHAT_CLOSE", chat);
                LiveChatUtil.removeActiveChatPKID();
            }
            Ue.a.t(chat);
            Intent intent = new Intent("receivelivechat");
            intent.putExtra("message", "refreshchat");
            intent.putExtra("chid", chat.getChid());
            intent.putExtra("endchat", true);
            C1908a.b(MobilistenInitProvider.k()).d(intent);
        }
        d(str, chat);
        ne.j.q0();
    }

    public void i() {
        ContentResolver contentResolver = MobilistenInitProvider.k().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("STATUS", (Integer) 4);
        contentValues.put("UNREAD_COUNT", (Integer) 0);
        LiveChatUtil.removeActiveChatPKID();
        LiveChatUtil.removeCurrentChatPKID();
        contentResolver.update(b.a.f44269a, contentValues, null, null);
        SharedPreferences.Editor edit = C6218a.M().edit();
        edit.putBoolean("embednotallowed", true);
        edit.putBoolean("ip_blocked", true);
        edit.apply();
        com.zoho.livechat.android.provider.a.INSTANCE.delete(contentResolver, b.c.f44270a, null, null);
        AbstractC5884j.g();
        Intent intent = new Intent("receivelivechat");
        intent.putExtra("message", "closeui");
        C1908a.b(MobilistenInitProvider.k()).d(intent);
        if (Ye.d.c(De.a.FcmToken) && C6218a.M().contains("pushstatus")) {
            LiveChatUtil.unRegisterDevice();
        }
        ZohoLiveChat.getApplicationManager().p().post(new b());
    }

    public void j(Hashtable hashtable, InitListener initListener, nd.e eVar) {
        Q.E(true);
        x xVar = new x(LiveChatUtil.getAVUID(), LiveChatUtil.getCVUID(), new Function1() { // from class: com.zoho.livechat.android.utils.A
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        });
        xVar.d(true);
        xVar.run();
        if (LiveChatUtil.canConnectToWMS()) {
            rd.b.b();
        }
        try {
            ZohoLiveChat.getApplicationManager().p().post(new c(hashtable, eVar));
            LiveChatUtil.triggerInitListener(true, null, initListener);
            if (ZohoLiveChat.getApplicationManager().w() != null) {
                ZohoLiveChat.getApplicationManager().w().onSuccess();
                ZohoLiveChat.getApplicationManager().W(null);
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(Hashtable hashtable) {
        String str;
        String str2;
        int update;
        SalesIQChat chat;
        String string = LiveChatUtil.getString(hashtable.get("chid"));
        String string2 = LiveChatUtil.getString(hashtable.get("rchid"));
        String string3 = LiveChatUtil.getString(hashtable.get("attender"));
        String string4 = LiveChatUtil.getString(hashtable.get("attendername"));
        String string5 = LiveChatUtil.getString(hashtable.get("visitid"));
        String string6 = LiveChatUtil.getString(hashtable.get("image_fkey"));
        String string7 = LiveChatUtil.getString(hashtable.get("visitorid"));
        String string8 = LiveChatUtil.getString(hashtable.get("ack_key"));
        boolean z10 = LiveChatUtil.getBoolean(hashtable.get("attender_callenabled"));
        long j10 = LiveChatUtil.getLong(hashtable.get("pickuptime"));
        Te.a.V0(string, j10);
        SalesIQChat chat2 = LiveChatUtil.getChat(string);
        Ue.a.t(chat2);
        Ue.a.s(chat2);
        if (chat2 == null) {
            chat2 = LiveChatUtil.getChatFromConvID(string8);
            str = "temp_chid";
            if (chat2 == null) {
                chat2 = LiveChatUtil.getChat("temp_chid");
            }
            if (chat2 == null) {
                str = "trigger_temp_chid";
                chat2 = LiveChatUtil.getChat("trigger_temp_chid");
            }
        } else {
            str = string;
        }
        String chid = chat2 != null ? chat2.getChid() : null;
        if (chat2 != null) {
            ContentResolver contentResolver = MobilistenInitProvider.k().getContentResolver();
            ContentValues contentValues = new ContentValues();
            contentValues.put("CHATID", string);
            if (chat2.getType() != null && chat2.getType() == SalesIQChat.c.Call) {
                if (chat2.getMedia() == null) {
                    com.google.gson.k kVar = new com.google.gson.k();
                    str2 = string8;
                    kVar.o("pickup_time", Long.valueOf(j10));
                    contentValues.put("MEDIA", kVar.toString());
                    contentValues.put("RCHATID", !string2.isEmpty() ? LiveChatUtil.getWmsChatid(string) : string2);
                    contentValues.put("ATTENDER", string4);
                    if (!string7.isEmpty()) {
                        contentValues.put("VISITORID", string7);
                    }
                    if (!string5.isEmpty()) {
                        contentValues.put("VISITID", string5);
                    }
                    contentValues.put("STATUS", (Integer) 2);
                    contentValues.put("ATTENDER_IMGKEY", string6);
                    if (hashtable.containsKey("isbotpickup")) {
                        contentValues.put("ISBOTATTENDER", Boolean.valueOf(LiveChatUtil.getBoolean(hashtable.get("isbotpickup"))));
                    }
                    contentValues.put("ATTENDER_ID", string3);
                    contentValues.put("IS_CALL_ENABLED_FOR_ATTENDER", Boolean.valueOf(z10));
                    if (hashtable.containsKey("attenderemail")) {
                        contentValues.put("ATTENDER_EMAIL", LiveChatUtil.getString(hashtable.get("attenderemail")));
                    }
                    contentValues.put("WAITING_TIMER_START_TIME", (Integer) 0);
                    if (j10 > 0) {
                        contentValues.put("LMTIME", Long.valueOf(j10));
                    }
                    update = contentResolver.update(b.a.f44269a, contentValues, "CHATID=?", new String[]{str});
                    LiveChatUtil.log("onChatPickup handled");
                    if (update == 0 && contentResolver.update(b.a.f44269a, contentValues, "CHATID=?", new String[]{string}) == 0 && !str2.isEmpty()) {
                        contentResolver.update(b.a.f44269a, contentValues, "CONVID=?", new String[]{str2});
                    }
                    if (C6218a.k() && chid != null && chid.equals(C6218a.y())) {
                        C6218a.i0(true, string);
                    }
                    C6966g.B0(str, string);
                    chat = LiveChatUtil.getChat(string);
                    if (chat != null) {
                        if (chat.getVisitorid() != null) {
                            Te.a.v0(string, chat.getVisitorid());
                        }
                        LiveChatUtil.triggerChatListener("CHAT_ATTENDED", chat);
                    }
                    ne.j.q0();
                    if (LiveChatUtil.isMultipleChatsDisabled() && LiveChatUtil.isTriggerChatAvailable()) {
                        LiveChatUtil.deleteTriggerChat();
                    }
                    Intent intent = new Intent("receivelivechat");
                    intent.putExtra("message", "refreshchat");
                    intent.putExtra("chid", string);
                    if (!str2.isEmpty()) {
                        intent.putExtra("conversation_id", str2);
                    }
                    if (chat != null && chat.getType() == SalesIQChat.c.Chat) {
                        AbstractC5892d.n(MobilistenInitProvider.k(), new long[]{0, 120, 1000, 0});
                    }
                    intent.putExtra("show_connected_to_banner", true);
                    intent.putExtra("attender_name", string4);
                    intent.putExtra("EndWaitingTimer", true);
                    C1908a.b(MobilistenInitProvider.k()).d(intent);
                }
                SalesIQChat.Media media = chat2.getMedia();
                media.setPickupTime(Long.valueOf(j10));
                contentValues.put("MEDIA", Yd.a.j().v(media));
            }
            str2 = string8;
            contentValues.put("RCHATID", !string2.isEmpty() ? LiveChatUtil.getWmsChatid(string) : string2);
            contentValues.put("ATTENDER", string4);
            if (!string7.isEmpty()) {
            }
            if (!string5.isEmpty()) {
            }
            contentValues.put("STATUS", (Integer) 2);
            contentValues.put("ATTENDER_IMGKEY", string6);
            if (hashtable.containsKey("isbotpickup")) {
            }
            contentValues.put("ATTENDER_ID", string3);
            contentValues.put("IS_CALL_ENABLED_FOR_ATTENDER", Boolean.valueOf(z10));
            if (hashtable.containsKey("attenderemail")) {
            }
            contentValues.put("WAITING_TIMER_START_TIME", (Integer) 0);
            if (j10 > 0) {
            }
            update = contentResolver.update(b.a.f44269a, contentValues, "CHATID=?", new String[]{str});
            LiveChatUtil.log("onChatPickup handled");
            if (update == 0) {
                contentResolver.update(b.a.f44269a, contentValues, "CONVID=?", new String[]{str2});
            }
            if (C6218a.k()) {
                C6218a.i0(true, string);
            }
            C6966g.B0(str, string);
            chat = LiveChatUtil.getChat(string);
            if (chat != null) {
            }
            ne.j.q0();
            if (LiveChatUtil.isMultipleChatsDisabled()) {
                LiveChatUtil.deleteTriggerChat();
            }
            Intent intent2 = new Intent("receivelivechat");
            intent2.putExtra("message", "refreshchat");
            intent2.putExtra("chid", string);
            if (!str2.isEmpty()) {
            }
            if (chat != null) {
                AbstractC5892d.n(MobilistenInitProvider.k(), new long[]{0, 120, 1000, 0});
            }
            intent2.putExtra("show_connected_to_banner", true);
            intent2.putExtra("attender_name", string4);
            intent2.putExtra("EndWaitingTimer", true);
            C1908a.b(MobilistenInitProvider.k()).d(intent2);
        }
    }

    public void l(Hashtable hashtable) {
        ArrayList arrayList;
        if (hashtable == null || (arrayList = (ArrayList) hashtable.get("queue")) == null) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Hashtable hashtable2 = (Hashtable) arrayList.get(i10);
            String string = LiveChatUtil.getString(hashtable2.get(StackTraceHelper.ID_KEY));
            int intValue = LiveChatUtil.getInteger(hashtable2.get(ViewProps.POSITION)).intValue();
            if (intValue == 0) {
                intValue = -1;
            }
            String string2 = LiveChatUtil.getString(hashtable2.get("average_response_time"));
            long j10 = (string2 == null || string2.length() <= 0 || LiveChatUtil.getLong(string2) / 1000 <= 0) ? 60L : LiveChatUtil.getLong(string2) / 1000;
            SalesIQChat chat = LiveChatUtil.getChat(LiveChatUtil.getChatidfromVisitorID(string));
            if (chat != null) {
                chat.showQueue(true);
                if (chat.getQueueStartTime() == 0) {
                    chat.setQueueStartTime(rd.b.f());
                }
                chat.setQueueEndTime(j10);
                chat.setQueuePosition(intValue);
                com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat);
                LiveChatUtil.triggerChatListener("QUEUE_POSITION", chat);
                Intent intent = new Intent("receivelivechat");
                intent.putExtra("message", "refreshchat");
                intent.putExtra("chid", chat.getChid());
                C1908a.b(MobilistenInitProvider.k()).d(intent);
            }
        }
    }

    public void m(Hashtable hashtable) {
        String chatid = LiveChatUtil.getChatid(LiveChatUtil.getString(hashtable.get("chid")));
        SalesIQChat chat = LiveChatUtil.getChat(chatid);
        int intValue = LiveChatUtil.getInteger(hashtable.get("current_position")).intValue();
        if (intValue == 0) {
            intValue = -1;
        }
        if (chat.getType() != null && chat.getType() == SalesIQChat.c.Call) {
            Td.e.T0(intValue);
        }
        String string = LiveChatUtil.getString(hashtable.get("average_response_time"));
        boolean z10 = (intValue == chat.getQueuePosition() && ((string == null || string.length() <= 0 || ((LiveChatUtil.getLong(string) / 1000) > 0L ? 1 : ((LiveChatUtil.getLong(string) / 1000) == 0L ? 0 : -1)) <= 0) ? 60L : LiveChatUtil.getLong(string) / 1000) == chat.getQueueEndTime()) ? false : true;
        chat.showQueue(true);
        chat.setQueuePosition(intValue);
        chat.setLastmsgtime(rd.b.f());
        com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat);
        if (z10) {
            LiveChatUtil.triggerChatListener("QUEUE_POSITION", chat);
        }
        Intent intent = new Intent("receivelivechat");
        intent.putExtra("message", "refreshchat");
        intent.putExtra("chid", chatid);
        C1908a.b(MobilistenInitProvider.k()).d(intent);
    }

    public void n(boolean z10) {
        Function1 function1 = this.f44372b;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z10));
            this.f44372b = null;
        }
    }

    public void o(boolean z10) {
        LiveChatUtil.log("PEX | onWMSConnect");
        Intent intent = new Intent("receivelivechat");
        intent.putExtra("message", "wmsconnect");
        intent.putExtra("status", true);
        C1908a.b(MobilistenInitProvider.k()).d(intent);
        n(true);
        if (!z10) {
            p();
            return;
        }
        try {
            LiveChatUtil.submitTaskToExecutorServiceSafely(new x(LiveChatUtil.getAVUID(), LiveChatUtil.getCVUID(), new Function1() { // from class: com.zoho.livechat.android.utils.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return B.b((Boolean) obj);
                }
            }));
        } catch (Exception unused) {
            p();
        }
    }

    public void q(Function1 function1) {
        this.f44372b = function1;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        a aVar = new a();
        this.f44371a = aVar;
        aVar.sendEmptyMessage(0);
        Looper.loop();
    }
}
