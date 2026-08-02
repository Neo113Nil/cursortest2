package com.playtika.sharedsdk.shaded.okhttp3;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.playtika.sharedsdk.shaded.okhttp3.internal.authenticator.JavaNetAuthenticator;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Authenticator.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/Authenticator;", "", "authenticate", "Lcom/playtika/sharedsdk/shaded/okhttp3/Request;", "route", "Lcom/playtika/sharedsdk/shaded/okhttp3/Route;", "response", "Lcom/playtika/sharedsdk/shaded/okhttp3/Response;", k.M, "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Authenticator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final Authenticator NONE = new Companion.AuthenticatorNone();
    public static final Authenticator JAVA_NET_AUTHENTICATOR = new JavaNetAuthenticator(null, 1, null);

    Request authenticate(Route route, Response response) throws IOException;

    /* compiled from: Authenticator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\b"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/Authenticator$Companion;", "", "<init>", "()V", "NONE", "Lcom/playtika/sharedsdk/shaded/okhttp3/Authenticator;", "JAVA_NET_AUTHENTICATOR", "AuthenticatorNone", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: Authenticator.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/Authenticator$Companion$AuthenticatorNone;", "Lcom/playtika/sharedsdk/shaded/okhttp3/Authenticator;", "<init>", "()V", "authenticate", "Lcom/playtika/sharedsdk/shaded/okhttp3/Request;", "route", "Lcom/playtika/sharedsdk/shaded/okhttp3/Route;", "response", "Lcom/playtika/sharedsdk/shaded/okhttp3/Response;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        private static final class AuthenticatorNone implements Authenticator {
            @Override // com.playtika.sharedsdk.shaded.okhttp3.Authenticator
            public Request authenticate(Route route, Response response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
        }

        private Companion() {
        }
    }
}
