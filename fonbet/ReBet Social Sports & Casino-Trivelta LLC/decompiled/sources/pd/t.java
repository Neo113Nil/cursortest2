package pd;

import com.twilio.voice.EventGroupType;
import com.twilio.voice.VoiceURLConnection;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import java.net.HttpURLConnection;
import java.util.HashMap;
import okhttp3.HttpUrl;
import zf.C6966g;

/* loaded from: classes4.dex */
public class t extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public String f63172a;

    /* renamed from: b, reason: collision with root package name */
    public String f63173b;

    /* renamed from: c, reason: collision with root package name */
    public String f63174c;

    /* renamed from: d, reason: collision with root package name */
    public String f63175d;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f63176a;

        public a(SalesIQChat salesIQChat) {
            this.f63176a = salesIQChat;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ZohoSalesIQ.Chat.getListener() == null || this.f63176a == null) {
                return;
            }
            if (t.this.f63175d != null && t.this.f63175d.length() > 0) {
                this.f63176a.setRating(t.this.f63175d.equalsIgnoreCase("sad") ? 1 : t.this.f63175d.equalsIgnoreCase("neutral") ? 2 : t.this.f63175d.equalsIgnoreCase("happy") ? 3 : 0);
                if (t.this.f63174c != null && t.this.f63174c.length() > 0) {
                    this.f63176a.setFeedback(t.this.f63174c);
                }
                com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(this.f63176a);
                LiveChatUtil.triggerChatListener("CHAT_RATING", this.f63176a);
            }
            if (t.this.f63174c == null || t.this.f63174c.length() <= 0) {
                return;
            }
            this.f63176a.setFeedback(t.this.f63174c);
            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(this.f63176a);
            LiveChatUtil.triggerChatListener("CHAT_FEEDBACK", this.f63176a);
        }
    }

    public t(String str, String str2, String str3, String str4) {
        this.f63173b = str;
        this.f63172a = str2;
        this.f63174c = str3;
        this.f63175d = str4;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            if (this.f63172a != null) {
                HttpUrl.Builder g10 = Yd.a.g("visitor/v2/%1$s/conversations/%2$s/feedback", LiveChatUtil.getScreenName(), this.f63172a);
                LiveChatUtil.log("Visitor FeedBack | url: " + g10);
                HttpURLConnection g11 = sd.d.g(g10);
                g11.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
                HashMap hashMap = new HashMap();
                String str = this.f63174c;
                if (str != null && !str.isEmpty()) {
                    hashMap.put(EventGroupType.FEEDBACK_EVENT_GROUP, this.f63174c);
                }
                String str2 = this.f63175d;
                if (str2 != null && !str2.isEmpty()) {
                    hashMap.put("rating", this.f63175d);
                }
                og.i.v(g11.getOutputStream(), hashMap);
                int responseCode = g11.getResponseCode();
                LiveChatUtil.log("Visitor FeedBack | status code: " + responseCode);
                if (responseCode != 204) {
                    LiveChatUtil.log("Visitor FeedBack | response " + og.i.t(g11.getErrorStream()));
                    return;
                }
                try {
                    C6966g.E0(this.f63172a, Message.g.Feedback, Message.f.Sent);
                    ZohoLiveChat.getApplicationManager().p().post(new a(LiveChatUtil.getChat(this.f63173b)));
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                }
            }
        } catch (Exception e11) {
            LiveChatUtil.log(e11);
        }
    }
}
