package pd;

import a1.C1908a;
import android.content.Intent;
import com.twilio.voice.EventKeys;
import com.twilio.voice.VoiceURLConnection;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.Q;
import com.zoho.livechat.android.utils.x;
import java.net.HttpURLConnection;
import java.util.Hashtable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;
import sd.EnumC6362b;
import ug.AbstractC6574b;

/* loaded from: classes4.dex */
public class n extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public String f63155a;

    /* renamed from: b, reason: collision with root package name */
    public String f63156b = "";

    /* renamed from: c, reason: collision with root package name */
    public boolean f63157c;

    public n(String str, boolean z10) {
        this.f63155a = str;
        this.f63157c = z10;
    }

    public void c() {
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        String chatidfromVisitorID;
        Hashtable hashtable;
        try {
            try {
                Q.f44447F.f44472g.addIfAbsent(this.f63155a);
                chatidfromVisitorID = LiveChatUtil.getChatidfromVisitorID(this.f63155a);
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
            if (this.f63157c) {
                if (Xf.b.b(chatidfromVisitorID)) {
                    Xf.b.c(chatidfromVisitorID);
                }
            }
            if (this.f63155a != null) {
                HttpUrl.Builder g10 = Yd.a.g("visitor/v2/%1$s/conversations/%2$s/missed", LiveChatUtil.getScreenName(), this.f63155a);
                LiveChatUtil.log("Visitor Missed | url: " + g10);
                HttpURLConnection g11 = sd.d.g(g10);
                if (this.f63157c) {
                    g11.setRequestProperty("X-Operation-Trigger", "waiting_timer");
                }
                g11.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
                if (g11.getResponseCode() == 200) {
                    String t10 = og.i.t(g11.getInputStream());
                    this.f63156b = t10;
                    Hashtable hashtable2 = (Hashtable) AbstractC6574b.d(t10);
                    if (hashtable2 != null && hashtable2.containsKey(EventKeys.DATA) && (hashtable = (Hashtable) hashtable2.get(EventKeys.DATA)) != null) {
                        String string = LiveChatUtil.getString(hashtable.get("chat_id"));
                        long j10 = LiveChatUtil.getLong(hashtable.get("missed_time"));
                        SalesIQChat chat = LiveChatUtil.getChat(string);
                        chat.setStatus(3);
                        chat.setLastmsgtime(j10);
                        com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat);
                        Intent intent = new Intent("receivelivechat");
                        intent.putExtra("message", "refreshchat");
                        intent.putExtra("chid", string);
                        C1908a.b(MobilistenInitProvider.k()).d(intent);
                    }
                    ne.j.q0();
                } else {
                    String t11 = og.i.t(g11.getErrorStream());
                    this.f63156b = t11;
                    int a10 = o.a(t11);
                    if (a10 == EnumC6362b.CONNECT_CHAT_CANNOT_BE_MISSED.code) {
                        x xVar = new x(LiveChatUtil.getAVUID(), LiveChatUtil.getCVUID(), new Function1() { // from class: pd.l
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit unit;
                                unit = Unit.INSTANCE;
                                return unit;
                            }
                        });
                        xVar.c(this.f63155a);
                        LiveChatUtil.submitTaskToExecutorServiceSafely(xVar);
                    } else if (a10 == EnumC6362b.SPECIFIED_CONVERSATION_IS_ALREADY_MARKED_AS_MISSED.code) {
                        SalesIQChat chat2 = LiveChatUtil.getChat(LiveChatUtil.getChatidfromVisitorID(this.f63155a));
                        if (chat2 != null) {
                            chat2.setStatus(3);
                            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat2);
                        }
                        x xVar2 = new x(LiveChatUtil.getAVUID(), LiveChatUtil.getCVUID(), new Function1() { // from class: pd.m
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit unit;
                                unit = Unit.INSTANCE;
                                return unit;
                            }
                        });
                        xVar2.c(this.f63155a);
                        LiveChatUtil.submitTaskToExecutorServiceSafely(xVar2);
                    }
                }
                LiveChatUtil.log("MISSED | response:" + this.f63156b);
            }
        } finally {
            Q.f44447F.f44472g.remove(this.f63155a);
        }
    }
}
