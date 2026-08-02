package ru.ozon.app.android.navigation.interceptors;

import GZ.j;
import KZ.b;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.navigation.LinkGenerator;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH&¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "LKZ/b;", "<init>", "()V", "Landroid/content/Context;", "context", "LpZ/f;", "destination", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "intercept", "(Landroid/content/Context;LpZ/f;LGZ/j;)LpZ/f;", "", "deeplink", "successRedirectDeeplink", "failureRedirectDeeplink", "LFb0/b;", "extraPage", "createAuthDestination", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LFb0/b;)LpZ/f;", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AuthDestinationInterceptor implements b {

    @NotNull
    protected static final Companion Companion = new Companion(null);

    @NotNull
    private static final String DEFAULT_AUTH_DEEPLINK;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor$Companion;", "", "<init>", "()V", "DEFAULT_AUTH_DEEPLINK", "", "getDEFAULT_AUTH_DEEPLINK", "()Ljava/lang/String;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getDEFAULT_AUTH_DEEPLINK() {
            return AuthDestinationInterceptor.DEFAULT_AUTH_DEEPLINK;
        }

        private Companion() {
        }
    }

    static {
        String uri = LinkGenerator.INSTANCE.auth().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        DEFAULT_AUTH_DEEPLINK = uri;
    }

    public static /* synthetic */ f createAuthDestination$default(AuthDestinationInterceptor authDestinationInterceptor, Context context, String str, String str2, String str3, Fb0.b bVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAuthDestination");
        }
        if ((i11 & 2) != 0) {
            str = DEFAULT_AUTH_DEEPLINK;
        }
        return authDestinationInterceptor.createAuthDestination(context, str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : bVar);
    }

    public abstract f createAuthDestination(@NotNull Context context, @NotNull String deeplink, String successRedirectDeeplink, String failureRedirectDeeplink, Fb0.b extraPage);

    @Override // KZ.b
    public abstract f intercept(@NotNull Context context, @NotNull f destination, @NotNull j route);
}
