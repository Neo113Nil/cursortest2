package sd;

import com.zoho.livechat.android.utils.LiveChatUtil;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.HttpUrl;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static a f64856a = a.US;

    public enum a {
        US(".zoho", ".zohopublic", ".com"),
        EU(".zoho", ".zohopublic", ".eu"),
        CN(".zoho", ".zohopublic", ".com.cn"),
        IN(".zoho", ".zohopublic", ".in"),
        AU(".zoho", ".zohopublic", ".com.au"),
        JP(".zoho", ".zohopublic", ".jp"),
        CA(".zohocloud", ".zohopublic", ".ca"),
        SA(".zoho", ".zohopublic", ".sa"),
        UAE(".zoho", ".zohopublic", ".ae"),
        SG(".zoho", ".zohopublic", ".sg"),
        UK(".zoho", ".zohopublic", ".uk"),
        INEC(".zohohq", ".zohopublic", ".in");

        private String domain;
        private String sufix;
        private String trackingDomain;

        a(String str, String str2, String str3) {
            this.domain = str;
            this.trackingDomain = str2;
            this.sufix = str3;
        }

        public String getDomain() {
            return this.domain;
        }

        public String getSufix() {
            return this.sufix;
        }

        public String getTrackingDomain() {
            return this.trackingDomain;
        }
    }

    public static a a() {
        return f64856a;
    }

    public static String b(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d());
        sb2.append(String.format("/visitor/v2/%1$s/downloads/%2$s?purpose=%3$s", LiveChatUtil.getScreenName(), str, z10 ? "bot_image" : "operator_image"));
        return sb2.toString();
    }

    public static String c() {
        String property = System.getProperty("livechat_domain");
        if (property != null) {
            return property;
        }
        return "salesiq" + f64856a.getDomain() + f64856a.getSufix();
    }

    public static String d() {
        return "https://" + c();
    }

    public static HttpsURLConnection e(HttpUrl.Builder builder) {
        return f(builder, true);
    }

    public static HttpsURLConnection f(HttpUrl.Builder builder, boolean z10) {
        try {
            String url = builder.build().getUrl();
            if (url.contains(c())) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(url).openConnection();
                LiveChatUtil.getCommonHeaders(httpsURLConnection, z10);
                return httpsURLConnection;
            }
        } catch (IOException unused) {
        }
        return null;
    }

    public static HttpURLConnection g(HttpUrl.Builder builder) {
        return h(builder, true, false);
    }

    public static HttpURLConnection h(HttpUrl.Builder builder, boolean z10, boolean z11) {
        try {
            String url = builder.build().getUrl();
            if (!url.contains(c()) && !z11) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
            LiveChatUtil.getCommonHeaders(httpURLConnection, z10);
            return httpURLConnection;
        } catch (IOException unused) {
            return null;
        }
    }

    public static void i(a aVar) {
        f64856a = aVar;
    }
}
