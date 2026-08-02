package com.braze.communication;

import com.braze.support.BrazeLogger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f485a = new g();
    public static final f b;

    static {
        try {
            b = new f();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f485a, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.communication.g$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.a();
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
                f fVar = b;
                if (fVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("socketFactory");
                    fVar = null;
                }
                httpsURLConnection.setSSLSocketFactory(fVar);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.communication.g$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g.b();
                    }
                }, 4, (Object) null);
            }
        }
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }
}
