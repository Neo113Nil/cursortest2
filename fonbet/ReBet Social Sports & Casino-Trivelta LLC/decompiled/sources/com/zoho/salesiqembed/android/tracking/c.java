package com.zoho.salesiqembed.android.tracking;

import a1.C1908a;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.provider.b;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.Q;
import java.util.ArrayList;
import java.util.Hashtable;
import rd.C6218a;

/* loaded from: classes4.dex */
public class c {

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C6218a.W()) {
                ne.j.q0();
            }
        }
    }

    public void a(Hashtable hashtable) {
        String str;
        if (Q.u() == null || hashtable.get("name") == Q.u()) {
            UTSUtil.updateName(hashtable);
        } else {
            UTSUtil.updateName(Q.u());
        }
        if (Q.t() != null && hashtable.get("email") != Q.t()) {
            UTSUtil.updateEmail(Q.t());
        }
        if (Q.v() != null && hashtable.get("phone") != Q.v()) {
            UTSUtil.updatePhone(Q.v());
        }
        UTSUtil.updateCustomerInfo();
        ContentResolver contentResolver = MobilistenInitProvider.k().getContentResolver();
        if (UTSUtil.isProactiveChatAvailable()) {
            str = LiveChatUtil.getString(hashtable.get("chid"));
            SalesIQChat chat = LiveChatUtil.getChat(str);
            if (chat != null && chat.getChid() != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("STATUS", (Integer) 4);
                if (chat.getType() == SalesIQChat.c.Chat) {
                    LiveChatUtil.removeActiveChatPKID();
                }
                contentResolver.update(b.a.f44269a, contentValues, "CHATID=?", new String[]{str});
                chat.setUnreadCount(0);
                com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat);
                LiveChatUtil.updateBadgeListener(Kf.a.d(), false);
            }
            ZohoLiveChat.getApplicationManager().p().post(new a());
        } else {
            str = null;
            if (UTSUtil.isTriggerChatAvailable() && C6218a.M().contains("executedtriggerid")) {
                UTSUtil.sendTriggerAcknowledgement(C6218a.M().getString("executedtriggerid", null));
                SharedPreferences.Editor edit = C6218a.M().edit();
                edit.remove("executedtriggerid");
                edit.apply();
            }
        }
        if (str != null) {
            Intent intent = new Intent("receivelivechat");
            intent.putExtra("message", "refreshchat");
            intent.putExtra("chid", str);
            intent.putExtra("endchat", true);
            C1908a.b(MobilistenInitProvider.k()).d(intent);
        }
        if (hashtable.containsKey("triggers")) {
            UTSUtil.handleTrigger(hashtable);
        }
    }

    public void b() {
    }

    public void c(int i10, Hashtable hashtable) {
        UTSUtil.updateName(hashtable);
        if (i10 == 100) {
            UTSUtil.handleProactiveChat(hashtable);
        }
        if (hashtable.containsKey("triggers")) {
            UTSUtil.handleTrigger(hashtable);
            return;
        }
        Object obj = hashtable.get("botTriggers");
        if (obj == null || !(obj instanceof ArrayList)) {
            return;
        }
        try {
            UTSUtil.updateBotTriggers((ArrayList) obj);
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public void d(Hashtable hashtable) {
        if (Q.u() == null || hashtable.get("name") == Q.u()) {
            UTSUtil.updateName(hashtable);
        } else {
            UTSUtil.updateName(Q.u());
        }
        if (Q.v() != null && hashtable.get("phone") != Q.v()) {
            UTSUtil.updatePhone(Q.v());
        }
        if (Q.t() != null && hashtable.get("email") != Q.t()) {
            UTSUtil.updateEmail(Q.t());
        }
        UTSUtil.updateCustomerInfo();
        if (C6218a.M().contains("executedtriggerid")) {
            UTSUtil.sendTriggerAcknowledgement(C6218a.M().getString("executedtriggerid", null));
            SharedPreferences.Editor edit = C6218a.M().edit();
            edit.remove("executedtriggerid");
            edit.apply();
        }
        if (hashtable.containsKey("triggers")) {
            UTSUtil.handleTrigger(hashtable);
        }
    }
}
