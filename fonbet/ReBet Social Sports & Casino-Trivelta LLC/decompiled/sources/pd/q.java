package pd;

import a1.C1908a;
import android.content.Intent;
import com.twilio.voice.VoiceURLConnection;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.x;
import java.net.HttpURLConnection;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;
import sd.EnumC6362b;

/* loaded from: classes4.dex */
public class q extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final String f63159a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63160b;

    /* renamed from: c, reason: collision with root package name */
    public final String f63161c;

    /* renamed from: d, reason: collision with root package name */
    public final String f63162d;

    /* renamed from: e, reason: collision with root package name */
    public String f63163e = "";

    public q(String str, String str2, String str3, String str4) {
        this.f63159a = str;
        this.f63160b = str2;
        this.f63161c = str3;
        this.f63162d = str4;
    }

    public void b() {
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        HttpUrl.Builder g10;
        SalesIQChat chat;
        try {
            HashMap hashMap = new HashMap();
            String str = this.f63160b;
            if (str == null || str.isEmpty()) {
                g10 = Yd.a.g("visitor/v2/%1$s/conversations/%2$s/messagetypingstatus", LiveChatUtil.getScreenName(), this.f63159a);
                String str2 = this.f63161c;
                if (str2 != null && !str2.isEmpty()) {
                    hashMap.put("session_id", this.f63161c);
                }
                hashMap.put("status", "idle");
            } else {
                g10 = Yd.a.g("visitor/v2/%1$s/conversations/%2$s/predictmessage", LiveChatUtil.getScreenName(), this.f63159a);
                String str3 = this.f63161c;
                if (str3 != null && !str3.isEmpty()) {
                    hashMap.put("session_id", this.f63161c);
                }
                hashMap.put("message", this.f63160b);
            }
            HttpURLConnection g11 = sd.d.g(g10);
            g11.setConnectTimeout(3000);
            g11.setReadTimeout(3000);
            g11.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
            og.i.v(g11.getOutputStream(), hashMap);
            int responseCode = g11.getResponseCode();
            LiveChatUtil.log("PredictMessage | status code: " + responseCode);
            if (responseCode == 204) {
                this.f63163e = og.i.t(g11.getInputStream());
                String str4 = this.f63160b;
                if (str4 != null && str4.length() > 0 && (chat = LiveChatUtil.getChat(this.f63162d)) != null) {
                    chat.setTimerStartTime(0L);
                    chat.setTimerEndTime(0);
                    com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat);
                    Intent intent = new Intent("receivelivechat");
                    intent.putExtra("chat_id", chat.getChid());
                    intent.putExtra("acknowledgement_key", chat.getConvID());
                    intent.putExtra("message", "endchattimer");
                    C1908a.b(MobilistenInitProvider.k()).d(intent);
                }
            } else {
                String t10 = og.i.t(g11.getErrorStream());
                this.f63163e = t10;
                if (o.a(t10) == EnumC6362b.CONVERSATION_ALREADY_ENDED.code) {
                    SalesIQChat chat2 = LiveChatUtil.getChat(this.f63162d);
                    if (chat2 != null) {
                        chat2.setStatus(4);
                        com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat2);
                    }
                    x xVar = new x(LiveChatUtil.getAVUID(), LiveChatUtil.getCVUID(), new Function1() { // from class: pd.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    });
                    xVar.c(chat2.getVisitorid());
                    LiveChatUtil.submitTaskToExecutorServiceSafely(xVar);
                }
            }
            LiveChatUtil.log("PredictMessage | response | " + this.f63163e);
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }
}
