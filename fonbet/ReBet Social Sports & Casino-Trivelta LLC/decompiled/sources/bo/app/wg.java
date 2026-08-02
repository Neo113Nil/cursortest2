package bo.app;

import bo.app.wg;
import com.braze.support.BrazeLogger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wg {

    /* renamed from: a, reason: collision with root package name */
    public static final wg f26209a = new wg();

    /* renamed from: b, reason: collision with root package name */
    public static final nf f26210b;

    static {
        try {
            f26210b = new nf();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f26209a, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Mb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return wg.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a() {
        return "Exception initializing static TLS socket factory.";
    }

    public static final String b() {
        return "Exception setting TLS socket factory on url connection.";
    }

    public final HttpURLConnection a(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        URLConnection openConnection = url.openConnection();
        if (Intrinsics.areEqual(url.getProtocol(), "https")) {
            try {
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                nf nfVar = f26210b;
                if (nfVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("socketFactory");
                    nfVar = null;
                }
                httpsURLConnection.setSSLSocketFactory(nfVar);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Nb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return wg.b();
                    }
                }, 4, (Object) null);
            }
        }
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }
}
