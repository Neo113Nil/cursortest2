package com.zoho.livechat.android.utils;

import a1.C1908a;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.data.remote.responses.MessageResponse;
import com.zoho.livechat.android.modules.messages.data.repository.mapper.MessageRoomToDomainKt;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Hashtable;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import og.AbstractC5895g;
import okhttp3.HttpUrl;
import ug.AbstractC6574b;
import vf.AbstractC6688b;
import xe.C6822a;
import zf.C6966g;

/* loaded from: classes4.dex */
public class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public String f44575a;

    /* renamed from: b, reason: collision with root package name */
    public String f44576b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f44577c;

    /* renamed from: d, reason: collision with root package name */
    public String f44578d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f44579e = false;

    public x(String str, String str2, Function1 function1) {
        this.f44575a = str;
        this.f44576b = str2;
        this.f44577c = function1;
    }

    public static /* synthetic */ void b(SalesIQChat salesIQChat, int i10, String str) {
        String Y10;
        if (salesIQChat != null) {
            if (("temp_chid".equals(salesIQChat.getChid()) || "proactive_chid".equals(salesIQChat.getChid()) || "trigger_temp_chid".equals(salesIQChat.getChid()) || ((salesIQChat.getStatus() != 2 && i10 == 2) || !(salesIQChat.getConvID() == null || salesIQChat.getConvID().isEmpty()))) && (Y10 = C6966g.Y(salesIQChat.getConvID())) != null) {
                C6966g.B0(Y10, str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x042d, code lost:
    
        if (r13.getStatus() != 2) goto L165;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(boolean z10, Hashtable hashtable, boolean z11) {
        boolean z12;
        long j10;
        long j11;
        long j12;
        SalesIQChat salesIQChat;
        boolean z13;
        String str;
        Hashtable hashtable2;
        Hashtable hashtable3;
        int i10;
        Integer num;
        if (hashtable.containsKey("chat_id") && hashtable.containsKey(StackTraceHelper.ID_KEY) && hashtable.containsKey("chat_status")) {
            final String string = LiveChatUtil.getString(hashtable.get("chat_id"));
            String string2 = LiveChatUtil.getString(hashtable.get(StackTraceHelper.ID_KEY));
            String string3 = hashtable.containsKey("ack_key") ? LiveChatUtil.getString(hashtable.get("ack_key")) : null;
            Hashtable hashtable4 = (Hashtable) hashtable.get("chat_status");
            final int intValue = LiveChatUtil.getInteger(hashtable4.get("state")).intValue();
            String string4 = LiveChatUtil.getString(hashtable4.get("status_key"));
            SalesIQChat.c from = SalesIQChat.c.from(LiveChatUtil.getString(hashtable.get("type")));
            j10 = 0;
            long j13 = hashtable.containsKey("last_modified_time") ? LiveChatUtil.getLong(hashtable.get("last_modified_time")) : hashtable.containsKey("end_time") ? LiveChatUtil.getLong(hashtable.get("end_time")) : hashtable.containsKey("missed_time") ? LiveChatUtil.getLong(hashtable.get("missed_time")) : hashtable.containsKey("start_time") ? LiveChatUtil.getLong(hashtable.get("start_time")) : 0L;
            long j14 = hashtable.containsKey("start_time") ? LiveChatUtil.getLong(hashtable.get("start_time")) : 0L;
            final SalesIQChat chatFromConvID = string3 != null ? LiveChatUtil.getChatFromConvID(string3) : LiveChatUtil.getChat(string);
            LiveChatUtil.submitTaskToExecutorServiceSafely(new Runnable() { // from class: com.zoho.livechat.android.utils.w
                @Override // java.lang.Runnable
                public final void run() {
                    x.b(SalesIQChat.this, intValue, string);
                }
            });
            if (chatFromConvID == null) {
                if (string3 != null) {
                    long j15 = j13;
                    chatFromConvID = new SalesIQChat(string3, string, string2, j15, intValue, from);
                    j12 = j15;
                    i10 = intValue;
                } else {
                    SalesIQChat salesIQChat2 = new SalesIQChat(string, string2, j13, intValue, from);
                    j12 = j13;
                    i10 = intValue;
                    chatFromConvID = salesIQChat2;
                }
                num = null;
            } else {
                i10 = intValue;
                j12 = j13;
                Integer valueOf = Integer.valueOf(chatFromConvID.getStatus());
                chatFromConvID.setChid(string);
                chatFromConvID.setVisitorid(string2);
                chatFromConvID.setTime(j12);
                chatFromConvID.setStatus(i10);
                chatFromConvID.setType(from);
                num = valueOf;
            }
            chatFromConvID.setMissedTime(LiveChatUtil.getLong(hashtable.get("missed_time")));
            chatFromConvID.setStatusKey(string4);
            if (hashtable.containsKey("media")) {
                chatFromConvID.setMedia((SalesIQChat.Media) AbstractC5895g.b(Yd.a.j(), Yd.a.j().v(hashtable.get("media")), SalesIQChat.Media.class));
            }
            if (hashtable.containsKey("end_time")) {
                chatFromConvID.setChatEndTime(LiveChatUtil.getLong(hashtable.get("end_time")));
                C6966g.r0(MobilistenInitProvider.k(), chatFromConvID, rd.b.f(), 0L, num);
            }
            j11 = chatFromConvID.getLastmsgtime();
            chatFromConvID.setChatLastInitiatedTime(Long.valueOf(j14));
            chatFromConvID.setLastmsgtime(Math.max(j12, chatFromConvID.getLastmsgtime()));
            if (i10 == 4 || i10 == 3) {
                z12 = false;
                chatFromConvID.setUnreadCount(0);
            } else {
                z12 = false;
            }
            if (!hashtable.containsKey("queue_type") && chatFromConvID.canShowQueue()) {
                chatFromConvID.showQueue(z12);
            }
            if (hashtable.containsKey("unread_chats")) {
                chatFromConvID.setUnreadChat(LiveChatUtil.getBoolean(hashtable.get("unread_chats")));
            }
            salesIQChat = chatFromConvID;
        } else {
            z12 = false;
            j10 = 0;
            if (hashtable.size() == 1 && hashtable.containsKey(StackTraceHelper.ID_KEY)) {
                com.zoho.livechat.android.provider.a.INSTANCE.deleteConversation(MobilistenInitProvider.k().getContentResolver(), LiveChatUtil.getString(hashtable.get(StackTraceHelper.ID_KEY)), "", true, false);
            }
            j11 = 0;
            j12 = 0;
            salesIQChat = null;
        }
        if (salesIQChat != null) {
            String string5 = LiveChatUtil.getString(hashtable.get("wms_chat_id"));
            if (!TextUtils.isEmpty(string5)) {
                salesIQChat.setRchatid(string5);
            }
            String string6 = LiveChatUtil.getString(hashtable.get("reference_id"));
            if (!TextUtils.isEmpty(string6)) {
                salesIQChat.setVisitid(string6);
            }
            String string7 = LiveChatUtil.getString(hashtable.get("question"));
            if (!TextUtils.isEmpty(string7)) {
                salesIQChat.setQuestion(string7);
            }
            if (salesIQChat.getUnreadCount() == 0 && salesIQChat.getStatus() != 4 && salesIQChat.getStatus() != 3) {
                if (LiveChatUtil.getBoolean(hashtable.get("unread_chats"))) {
                    salesIQChat.setUnreadCount(1);
                } else {
                    salesIQChat.setUnreadCount(-1);
                }
            }
            if (hashtable.containsKey("last_message_info") && (hashtable2 = (Hashtable) hashtable.get("last_message_info")) != null && (hashtable3 = (Hashtable) hashtable2.get("message")) != null && (!TextUtils.isEmpty(LiveChatUtil.getString(hashtable3.get("text"))) || hashtable3.containsKey("mode") || !hashtable2.isEmpty())) {
                long j16 = LiveChatUtil.getLong(hashtable3.get("time"));
                if (j16 == j10) {
                    j16 = LiveChatUtil.getLong(hashtable2.get("time"));
                }
                if (salesIQChat.getLastMessage() == null || j11 <= j16) {
                    salesIQChat.setLastmsgtime(j12);
                    if (MobilistenInitProvider.k() != null) {
                        MessageResponse messageResponse = (MessageResponse) AbstractC5895g.b(Yd.a.j(), Yd.a.j().B(hashtable2).toString(), MessageResponse.class);
                        salesIQChat.setLastMessage(MessageRoomToDomainKt.d(messageResponse != null ? AbstractC6688b.a(messageResponse, false, MobilistenInitProvider.k(), salesIQChat, salesIQChat.getConvID(), salesIQChat.getVisitorid(), salesIQChat.getChid(), salesIQChat.getRchatid(), LiveChatUtil.getAnnonID(), Yd.a.j()) : vf.c.e(hashtable3, salesIQChat.getRchatid()), MobilistenInitProvider.k(), Yd.a.j()));
                    }
                }
            }
            str = "";
            if (hashtable.containsKey("attender")) {
                Hashtable hashtable5 = (Hashtable) hashtable.get("attender");
                str = hashtable.containsKey("attender_imgkey") ? LiveChatUtil.getString(hashtable5.get("image_key")) : "";
                z12 = LiveChatUtil.getBoolean(hashtable5.get("call_enabled"));
            }
            String str2 = str;
            salesIQChat.setCallEnabledForAttender(z12);
            if (TextUtils.isEmpty(str2)) {
                salesIQChat.setAttenderImgkey(str2);
            }
            Hashtable hashtable6 = (Hashtable) hashtable.get("attender");
            if (hashtable6 != null) {
                String string8 = LiveChatUtil.getString(hashtable6.get(StackTraceHelper.ID_KEY));
                if (!TextUtils.isEmpty(string8)) {
                    salesIQChat.setAttenderid(string8);
                }
                String string9 = LiveChatUtil.getString(hashtable6.get("name"));
                if (!TextUtils.isEmpty(string9)) {
                    salesIQChat.setAttenderName(string9);
                }
                String string10 = LiveChatUtil.getString(hashtable6.get("email"));
                if (!TextUtils.isEmpty(string10)) {
                    salesIQChat.setAttenderEmail(string10);
                }
                String string11 = LiveChatUtil.getString(hashtable6.get("image_key"));
                if (!TextUtils.isEmpty(string11)) {
                    salesIQChat.setAttenderImgkey(string11);
                }
                salesIQChat.setIsBotAttender(LiveChatUtil.getBoolean(hashtable6.get("is_bot")));
            }
            String string12 = LiveChatUtil.getString(hashtable.get("departmentname"));
            if (!TextUtils.isEmpty(string12)) {
                salesIQChat.setDepartmentName(string12);
            }
            Hashtable hashtable7 = (Hashtable) hashtable.get("department");
            if (hashtable7 != null) {
                String string13 = LiveChatUtil.getString(hashtable7.get(StackTraceHelper.ID_KEY));
                if (!TextUtils.isEmpty(string13)) {
                    salesIQChat.setDeptid(string13);
                }
                String string14 = LiveChatUtil.getString(hashtable7.get("name"));
                if (!TextUtils.isEmpty(string14)) {
                    salesIQChat.setDepartmentName(string14);
                }
            }
            if (hashtable.containsKey("unread_chats")) {
                salesIQChat.setUnreadChat(LiveChatUtil.getBoolean(hashtable.get("unread_chats")));
            }
            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(salesIQChat, true, z11);
            if ((hashtable.containsKey("queue_type") || hashtable.containsKey("queue_intime")) && (LiveChatUtil.getString(hashtable.get("queue_type")).equalsIgnoreCase("chat") || hashtable.containsKey("queue_intime"))) {
                ZohoLiveChat.d.b(LiveChatUtil.getString(hashtable.get(StackTraceHelper.ID_KEY)));
            }
            if (!z10) {
                z13 = true;
                if (salesIQChat.getStatus() != 1) {
                }
                Ue.a.d(salesIQChat);
                return z13;
            }
        }
        z13 = z10;
        Ue.a.d(salesIQChat);
        return z13;
    }

    public void c(String str) {
        this.f44578d = str;
    }

    public void d(boolean z10) {
        this.f44579e = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z10;
        Hashtable hashtable;
        if (this.f44575a == null || LiveChatUtil.getScreenName() == null) {
            this.f44577c.invoke(Boolean.FALSE);
            return;
        }
        try {
            try {
                Thread.sleep(Integer.parseInt(System.getProperty("mobilisten_conversations_delay", "0")));
                String str = this.f44578d;
                HttpUrl.Builder g10 = (str == null || str.isEmpty()) ? Yd.a.g("visitor/v2/%1$s/conversations", LiveChatUtil.getScreenName()) : Yd.a.g("visitor/v2/%1$s/conversations/%2$s", LiveChatUtil.getScreenName(), this.f44578d);
                String str2 = this.f44575a;
                if (str2 != null) {
                    g10.addQueryParameter("avuid", str2);
                }
                String str3 = this.f44576b;
                if (str3 != null) {
                    g10.addQueryParameter("cvuid", str3);
                }
                if (LiveChatUtil.getAppID() != null) {
                    g10.addQueryParameter(PublisherMetadata.APP_ID, LiveChatUtil.getAppID());
                }
                g10.addQueryParameter("include_deleted", "true");
                LiveChatUtil.log("GetConversationsUtil | urlString: " + g10);
                HttpURLConnection g11 = sd.d.g(g10);
                g11.setConnectTimeout(30000);
                g11.setReadTimeout(30000);
                g11.setInstanceFollowRedirects(true);
                int responseCode = g11.getResponseCode();
                LiveChatUtil.log("GetConversationsUtil | response code: " + responseCode);
                if (responseCode == 200) {
                    Hashtable hashtable2 = (Hashtable) AbstractC6574b.d(og.i.t(g11.getInputStream()));
                    Object obj = hashtable2.get(EventKeys.DATA);
                    int i10 = 0;
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) hashtable2.get(EventKeys.DATA);
                        if (arrayList != null) {
                            Te.a.D(CollectionsKt.map(arrayList, new Function1() { // from class: com.zoho.livechat.android.utils.v
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    Object obj3;
                                    obj3 = ((Hashtable) obj2).get(StackTraceHelper.ID_KEY);
                                    return obj3;
                                }
                            }));
                            boolean z11 = !Q.B() && this.f44578d == null;
                            int i11 = 0;
                            z10 = false;
                            while (i11 < arrayList.size()) {
                                if (z11 && (hashtable = (Hashtable) ((Hashtable) arrayList.get(0)).get("visitor")) != null) {
                                    String string = LiveChatUtil.getString(hashtable.get("name"));
                                    if (!TextUtils.isEmpty(string) && !LiveChatUtil.isAnnonVisitorbyName(string)) {
                                        Ye.d.r(De.a.VisitorName, string).b(true);
                                        z11 = false;
                                    }
                                }
                                z10 = e(z10, (Hashtable) arrayList.get(i11), arrayList.size() - 1 == i11);
                                i11++;
                            }
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            rd.b.b();
                        }
                    } else if (obj instanceof Hashtable) {
                        e(true, (Hashtable) obj, true);
                    }
                    if ((LiveChatUtil.isChatQueueEnabled() || (C6822a.m() != null && C6822a.m().getCallConfigurations() != null && C6822a.m().getCallConfigurations().getCallWaitingQueue() != null && C6822a.m().getCallConfigurations().getCallWaitingQueue().getEnabled() == Boolean.TRUE)) && ZohoLiveChat.d.c() != null && ZohoLiveChat.d.c().size() > 0) {
                        ArrayList c10 = ZohoLiveChat.d.c();
                        ArrayList arrayList2 = new ArrayList();
                        if (c10.size() <= 10) {
                            new pd.r(c10).a();
                        } else {
                            while (i10 < c10.size()) {
                                int min = Math.min(i10 + 10, c10.size());
                                arrayList2.addAll(c10.subList(i10, min));
                                new pd.r(new ArrayList(arrayList2)).a();
                                arrayList2.clear();
                                i10 = min;
                            }
                        }
                    }
                    Intent intent = new Intent("receivelivechat");
                    intent.putExtra("message", "sync_conv");
                    C1908a.b(MobilistenInitProvider.k()).d(intent);
                    Intent intent2 = new Intent("receivelivechat");
                    intent2.putExtra("message", "refreshchat");
                    intent2.putExtra("chid", LiveChatUtil.getCurrentChatID());
                    C1908a.b(MobilistenInitProvider.k()).d(intent2);
                }
                Q.f44447F.f44467b = true;
                if (this.f44579e) {
                    C6966g.k0();
                }
                this.f44577c.invoke(Boolean.valueOf(Q.f44447F.f44467b));
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                this.f44577c.invoke(Boolean.valueOf(Q.f44447F.f44467b));
            }
        } catch (Throwable th2) {
            this.f44577c.invoke(Boolean.valueOf(Q.f44447F.f44467b));
            throw th2;
        }
    }
}
