package pd;

import com.twilio.voice.VoiceURLConnection;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.net.HttpURLConnection;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class f extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final String f63137a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63138b;

    /* renamed from: c, reason: collision with root package name */
    public String f63139c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f63140d;

    public f(String str, String str2, boolean z10) {
        this.f63137a = str;
        this.f63138b = str2;
        this.f63140d = z10;
    }

    public void a() {
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            HttpURLConnection g10 = sd.d.g(Yd.a.g("visitor/v2/%1$s/conversations/%2$s/detected_language", LiveChatUtil.getScreenName(), this.f63137a));
            if (this.f63140d) {
                g10.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
                HashMap hashMap = new HashMap();
                hashMap.put("language_code", this.f63138b);
                og.i.v(g10.getOutputStream(), hashMap);
            } else {
                g10.setRequestMethod(VoiceURLConnection.METHOD_TYPE_DELETE);
            }
            int responseCode = g10.getResponseCode();
            if (responseCode == 204 || responseCode == 200) {
                LiveChatUtil.log("Conversation GDPRTranslationConsent | status code: - " + responseCode);
                return;
            }
            LiveChatUtil.log("Conversation GDPRTranslationConsent | status code: - " + responseCode);
            this.f63139c = og.i.t(g10.getErrorStream());
            LiveChatUtil.log("Conversation GDPRTranslationConsent | status response: - " + this.f63139c);
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }
}
