package com.zoho.livechat.android.modules.conversations.data.wms.handlers;

import Uf.j;
import a1.C1908a;
import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.provider.b;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.Q;
import fg.d;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pd.n;
import ug.e;
import zf.C6966g;

/* loaded from: classes4.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0617a f43101a = new C0617a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final List f43102b = new ArrayList(CollectionsKt.mutableListOf("acctranschat", "addsupportrep", "acceptforward", "forwardsupport", "joinsupport", "transchat", "reopen", "missed", "updatechatparticipant", "desktopsharing", "close", "MEDIA"));

    /* renamed from: com.zoho.livechat.android.modules.conversations.data.wms.handlers.a$a, reason: collision with other inner class name */
    public static final class C0617a {
        public /* synthetic */ C0617a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0617a() {
        }
    }

    @Override // fg.d
    public void a(String str, Object obj) {
        super.a(str, obj);
        LiveChatUtil.log("PEX | onACSMessage: " + obj);
    }

    @Override // fg.d
    public void b(e eVar, Object obj) {
        super.b(eVar, obj);
        LiveChatUtil.log("PEX | onCrossProductMessage: " + obj);
    }

    @Override // fg.d
    public void c(Object obj) {
        String str;
        super.c(obj);
        LiveChatUtil.log("PEX | onCustomMessage: " + obj);
        Hashtable hashtable = obj instanceof Hashtable ? (Hashtable) obj : null;
        if (hashtable != null && hashtable.containsKey("module")) {
            if (Intrinsics.areEqual(hashtable.get("module"), "pickupsupport")) {
                Q.n();
                if (hashtable.containsKey("chid")) {
                    WmsConversationsEventsHandler.f42873j.a().a0(hashtable);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(hashtable.get("module"), "sendcusmsg")) {
                WmsConversationsEventsHandler.f42873j.a().R(hashtable);
                return;
            }
            if (Intrinsics.areEqual(hashtable.get("module"), "actendsession")) {
                MobilistenInitProvider.Companion companion = MobilistenInitProvider.INSTANCE;
                Application e10 = companion.e();
                ContentResolver contentResolver = e10 != null ? e10.getContentResolver() : null;
                ContentValues contentValues = new ContentValues();
                Intent intent = new Intent("receivelivechat");
                boolean z10 = LiveChatUtil.getBoolean(hashtable.get("cleartimer"));
                String chatid = LiveChatUtil.getChatid(LiveChatUtil.getString(hashtable.get("chid")));
                SalesIQChat chat = LiveChatUtil.getChat(chatid);
                String str2 = "0";
                if (z10 || chat == null) {
                    intent.putExtra("chat_id", chatid);
                    if (chat != null) {
                        intent.putExtra("acknowledgement_key", chat.getConvID());
                    }
                    intent.putExtra("message", "endchattimer");
                    str = "0";
                } else {
                    if (StringsKt.equals(LiveChatUtil.getString(hashtable.get("timer")), "-1", true)) {
                        str = "0";
                    } else {
                        Object obj2 = hashtable.get("timer");
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj2;
                        String string = LiveChatUtil.getString(Long.valueOf(rd.b.f()));
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        str2 = string;
                        str = str3;
                    }
                    intent.putExtra("message", "chattimerstart");
                }
                contentValues.put("TIMER_START_TIME", str2);
                contentValues.put("TIMER_END_TIME", str);
                if (contentResolver != null) {
                    contentResolver.update(b.a.f44269a, contentValues, "CHATID=?", new String[]{chatid});
                }
                intent.putExtra("endtimerstart", str2);
                intent.putExtra("endtimertime", str);
                intent.putExtra("chid", chatid);
                Application e11 = companion.e();
                Intrinsics.checkNotNull(e11);
                C1908a.b(e11).d(intent);
                return;
            }
            if (Intrinsics.areEqual(hashtable.get("module"), "missed")) {
                if (hashtable.containsKey("chid")) {
                    WmsConversationsEventsHandler.f42873j.a().Y(hashtable);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(hashtable.get("module"), "addvisitor") || Intrinsics.areEqual(hashtable.get("module"), "chat_queue")) {
                WmsConversationsEventsHandler.f42873j.a().m0(hashtable);
                return;
            }
            if (Intrinsics.areEqual(hashtable.get("module"), "botbusy") || Intrinsics.areEqual(hashtable.get("module"), "bottransfermissed")) {
                String chatid2 = LiveChatUtil.getChatid(LiveChatUtil.getString(hashtable.get("chid")));
                SalesIQChat chat2 = LiveChatUtil.getChat(chatid2);
                if (chat2 != null && !Intrinsics.areEqual(hashtable.get("module"), "bottransfermissed")) {
                    chat2.setIsBotAttender(true);
                    new n(chat2.getVisitorid(), false).c();
                }
                if (chatid2 == null || chatid2.length() <= 0) {
                    return;
                }
                hashtable.put("chid", chatid2);
                WmsConversationsEventsHandler.f42873j.a().Y(hashtable);
                return;
            }
            if (Intrinsics.areEqual("dequeue_chat", hashtable.get("module")) || Intrinsics.areEqual("dequeue_call", hashtable.get("module"))) {
                rd.b.e().f(hashtable);
                if (Intrinsics.areEqual("dequeue_chat", hashtable.get("module"))) {
                    com.zoho.livechat.android.modules.brand.ui.helpers.a.T(new Md.a[]{Md.a.Chat}, false, null, 6, null);
                    return;
                } else {
                    if (Intrinsics.areEqual("dequeue_call", hashtable.get("module"))) {
                        com.zoho.livechat.android.modules.brand.ui.helpers.a.T(new Md.a[]{Md.a.Call}, false, null, 6, null);
                        return;
                    }
                    return;
                }
            }
            if (Intrinsics.areEqual(hashtable.get("module"), "current_queue_position")) {
                rd.b.e().m(hashtable);
                return;
            }
            if (Intrinsics.areEqual(hashtable.get("module"), "vtranslanguage")) {
                String chatid3 = LiveChatUtil.getChatid(LiveChatUtil.getString(hashtable.get("chid")));
                Intent intent2 = new Intent("receivelivechat");
                intent2.putExtra("message", "refreshchat");
                intent2.putExtra("chid", chatid3);
                intent2.putExtra("lang", LiveChatUtil.getString(hashtable.get("lang")));
                intent2.putExtra("istranslated", true);
                Application e12 = MobilistenInitProvider.INSTANCE.e();
                Intrinsics.checkNotNull(e12);
                C1908a.b(e12).d(intent2);
                return;
            }
            if (StringsKt.equals("media", (String) hashtable.get("module"), true)) {
                Qd.a.H(Qd.a.f9637h.a(), hashtable, false, 2, null);
            } else if (StringsKt.equals("joinsupport", (String) hashtable.get("module"), true)) {
                WmsConversationsEventsHandler.f42873j.a().W(hashtable);
            } else if (StringsKt.equals("conversation_transferred", (String) hashtable.get("module"), true)) {
                WmsConversationsEventsHandler.f42873j.a().d0(hashtable);
            }
        }
    }

    @Override // fg.d
    public void d(Integer num, Object obj) {
        long j10;
        SalesIQChat chat;
        super.d(num, obj);
        LiveChatUtil.log("PEX | onMessage: mtype: " + num + " | msg: " + obj);
        Hashtable hashtable = obj instanceof Hashtable ? (Hashtable) obj : null;
        if (hashtable == null) {
            return;
        }
        if (num != null && num.intValue() == 114) {
            String string = LiveChatUtil.getString(hashtable.get("module"));
            String string2 = LiveChatUtil.getString(hashtable.get("chid"));
            if (f43102b.contains(string)) {
                WmsConversationsEventsHandler.f42873j.a().g0(hashtable, string2);
            }
            if (Intrinsics.areEqual(string, "blockip")) {
                rd.b.e().i();
                LiveChatUtil.triggerSalesIQListener("IP_BLOCK", null, null);
                return;
            } else {
                if (Intrinsics.areEqual(string, "VISITORNAMECHANGE")) {
                    WmsConversationsEventsHandler.f42873j.a().r0(hashtable);
                    return;
                }
                return;
            }
        }
        boolean z10 = true;
        if (num != null && num.intValue() == 113) {
            Hashtable hashtable2 = (Hashtable) hashtable.get("msg");
            String str = (String) (hashtable2 != null ? hashtable2.get("mode") : null);
            if (hashtable.containsKey("chid") && StringsKt.equals(str, "END_SUPPORT", true)) {
                String string3 = LiveChatUtil.getString(hashtable.get("sender"));
                String chatid = LiveChatUtil.getChatid(LiveChatUtil.getString(hashtable.get("chid")));
                if (LiveChatUtil.isBotSender(string3)) {
                    chat = LiveChatUtil.getChat(chatid);
                    if (chat != null) {
                        chat.setLastmsgtime(rd.b.f());
                    }
                    com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat);
                    rd.b.e().g(chatid, g(hashtable));
                } else {
                    chat = LiveChatUtil.getChat(chatid);
                    if (chat != null) {
                        chat.setLastmsgtime(rd.b.f());
                    }
                    com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat);
                    rd.b.e().g(chatid, g(hashtable));
                }
                SalesIQChat salesIQChat = chat;
                Q.C(chatid);
                Hashtable hashtable3 = (Hashtable) hashtable.get("msg");
                Intrinsics.checkNotNull(hashtable3);
                long j11 = LiveChatUtil.getLong(hashtable3.get("typing_delay"));
                if (salesIQChat != null) {
                    salesIQChat.setStatus(4);
                }
                C6966g.s0(j.n(), salesIQChat, LiveChatUtil.getLong(hashtable.get("time")), j11, null, 16, null);
                return;
            }
            return;
        }
        if (num == null || num.intValue() != 35) {
            if (num != null && num.intValue() == 71) {
                WmsConversationsEventsHandler.f42873j.a().l0(hashtable);
                return;
            }
            if (num != null && num.intValue() == 64) {
                WmsConversationsEventsHandler.f42873j.a().k0(hashtable);
                return;
            }
            if (num != null && num.intValue() == 63) {
                WmsConversationsEventsHandler.f42873j.a().j0(hashtable);
                return;
            } else {
                if (num != null && num.intValue() == 29) {
                    Qd.a.H(Qd.a.f9637h.a(), hashtable, false, 2, null);
                    return;
                }
                return;
            }
        }
        if (!hashtable.containsKey("module")) {
            Intent intent = new Intent("receivelivechat");
            intent.putExtra("message", "ontyping");
            intent.putExtra("typing", false);
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            C1908a.b(e10).d(intent);
            return;
        }
        if (StringsKt.equals(LiveChatUtil.getString(hashtable.get("module")), "leavesupport", true)) {
            String chatid2 = LiveChatUtil.getChatid(LiveChatUtil.getString(hashtable.get("chid")));
            SalesIQChat chat2 = LiveChatUtil.getChat(chatid2);
            long j12 = 0;
            if (hashtable.containsKey("msg")) {
                Hashtable hashtable4 = (Hashtable) hashtable.get("msg");
                boolean z11 = (hashtable4 != null && hashtable4.containsKey("action") && StringsKt.equals(String.valueOf(hashtable4.get("action")), "content_moderation_end", true)) ? false : true;
                if (hashtable4 != null && hashtable4.containsKey("time")) {
                    j12 = LiveChatUtil.getLong(hashtable4.get("time"));
                }
                j10 = j12;
                z10 = z11;
            } else {
                j10 = 0;
            }
            if (z10) {
                if (chat2 != null) {
                    chat2.setStatus(4);
                }
                C6966g.s0(j.n(), chat2, j10, 0L, null, 16, null);
            }
            Q.C(chatid2);
            rd.b.e().h(chatid2, g(hashtable));
        }
    }

    @Override // fg.d
    public void e(Object obj) {
        super.e(obj);
        LiveChatUtil.log("PEX | onPresenceChange: " + obj);
    }

    @Override // fg.d
    public void f(e eVar, Object obj, String str, String str2, String str3, String str4, Object obj2, String str5, String str6, String str7, String str8, String str9) {
        super.f(eVar, obj, str, str2, str3, str4, obj2, str5, str6, str7, str8, str9);
        LiveChatUtil.log("PEX | onZohoMessage: " + obj);
    }

    public final Long g(Hashtable wmsMessageTable) {
        Hashtable hashtable;
        Intrinsics.checkNotNullParameter(wmsMessageTable, "wmsMessageTable");
        if (!wmsMessageTable.containsKey("msg") || (hashtable = (Hashtable) wmsMessageTable.get("msg")) == null || !hashtable.containsKey("utsdetails")) {
            return null;
        }
        Hashtable hashtable2 = (Hashtable) hashtable.get("utsdetails");
        if (hashtable2 != null && hashtable2.containsKey("chatetime")) {
            return Long.valueOf(LiveChatUtil.getLong(hashtable2.get("chatetime")));
        }
        if (wmsMessageTable.containsKey("time")) {
            return Long.valueOf(LiveChatUtil.getLong(wmsMessageTable.get("time")));
        }
        return null;
    }
}
