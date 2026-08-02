package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lbo/app/v6;", "", "Ljava/net/URL;", "url", "Ljava/net/HttpURLConnection;", Constants.BRAZE_PUSH_CONTENT_KEY, "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class v6 {
    public static final v6 a = new v6();
    private static z5 b;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exception initializing static TLS socket factory.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exception setting TLS socket factory on url connection.";
        }
    }

    static {
        try {
            b = new z5();
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.E, e, a.b);
        }
    }

    private v6() {
    }

    public final HttpURLConnection a(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        URLConnection openConnection = url.openConnection();
        if (Intrinsics.areEqual(url.getProtocol(), "https")) {
            try {
                if (openConnection == null) {
                    throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                }
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                z5 z5Var = b;
                if (z5Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("socketFactory");
                    z5Var = null;
                }
                httpsURLConnection.setSSLSocketFactory(z5Var);
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
            }
        }
        if (openConnection != null) {
            return (HttpURLConnection) openConnection;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }
}
