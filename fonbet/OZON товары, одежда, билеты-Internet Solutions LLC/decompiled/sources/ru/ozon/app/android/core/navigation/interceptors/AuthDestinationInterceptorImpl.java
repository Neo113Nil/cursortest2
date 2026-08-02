package ru.ozon.app.android.core.navigation.interceptors;

import Fb0.b;
import GZ.j;
import Ob0.a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.C8880a;
import pZ.f;
import ru.ozon.app.android.account.authEvents.AuthEventsCollector;
import ru.ozon.app.android.account.authEvents.AuthResultActions;
import ru.ozon.app.android.initializers.user.OzonIdActivityCallback;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.storage.auth.AuthStateStorage;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJe\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJS\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJS\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b \u0010!J-\u0010%\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\n\u0010$\u001a\u00060\"j\u0002`#H\u0016¢\u0006\u0004\b%\u0010&J?\u0010'\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/core/navigation/interceptors/AuthDestinationInterceptorImpl;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/initializers/user/OzonIdActivityCallback;", "ozonIdActivityCallback", "Lru/ozon/app/android/account/authEvents/AuthEventsCollector;", "authEventsCollector", "LOb0/a;", "ozonIdAppApi", "<init>", "(Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/initializers/user/OzonIdActivityCallback;Lru/ozon/app/android/account/authEvents/AuthEventsCollector;LOb0/a;)V", "Landroid/content/Context;", "context", "", "deeplink", "successRedirectDeeplink", "", "", "successRedirectProperties", "failureRedirectDeeplink", "LpZ/f;", "destination", "LFb0/b;", "extraPage", "internalCreateAuthDestination", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;LpZ/f;LFb0/b;)LpZ/f;", "Landroid/app/Activity;", "chooseAuthDestination", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;LFb0/b;)LpZ/f;", "activity", "Landroid/content/Intent;", "startOzonIdSdkAuth", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;LFb0/b;)Landroid/content/Intent;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "intercept", "(Landroid/content/Context;LpZ/f;LGZ/j;)LpZ/f;", "createAuthDestination", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LFb0/b;)LpZ/f;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/initializers/user/OzonIdActivityCallback;", "Lru/ozon/app/android/account/authEvents/AuthEventsCollector;", "LOb0/a;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthDestinationInterceptorImpl extends AuthDestinationInterceptor {

    @NotNull
    private final AuthEventsCollector authEventsCollector;

    @NotNull
    private final AuthStateStorage authStateStorage;

    @NotNull
    private final OzonIdActivityCallback ozonIdActivityCallback;

    @NotNull
    private final a ozonIdAppApi;

    public AuthDestinationInterceptorImpl(@NotNull AuthStateStorage authStateStorage, @NotNull OzonIdActivityCallback ozonIdActivityCallback, @NotNull AuthEventsCollector authEventsCollector, @NotNull a ozonIdAppApi) {
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        Intrinsics.checkNotNullParameter(ozonIdActivityCallback, "ozonIdActivityCallback");
        Intrinsics.checkNotNullParameter(authEventsCollector, "authEventsCollector");
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        this.authStateStorage = authStateStorage;
        this.ozonIdActivityCallback = ozonIdActivityCallback;
        this.authEventsCollector = authEventsCollector;
        this.ozonIdAppApi = ozonIdAppApi;
    }

    private final f chooseAuthDestination(Activity context, String deeplink, String successRedirectDeeplink, Map<String, ? extends Object> successRedirectProperties, String failureRedirectDeeplink, b extraPage) {
        Intent startOzonIdSdkAuth = startOzonIdSdkAuth(context, deeplink, successRedirectDeeplink, successRedirectProperties, failureRedirectDeeplink, extraPage);
        if (startOzonIdSdkAuth != null) {
            return new C8880a(startOzonIdSdkAuth);
        }
        return null;
    }

    private final f internalCreateAuthDestination(Context context, String deeplink, String successRedirectDeeplink, Map<String, ? extends Object> successRedirectProperties, String failureRedirectDeeplink, f destination, b extraPage) {
        if (this.authStateStorage.isAuthenticated() && destination != null) {
            return destination;
        }
        if (this.ozonIdActivityCallback.getOzonIdActivityOnScreen()) {
            return null;
        }
        Intrinsics.g(context, "null cannot be cast to non-null type android.app.Activity");
        return chooseAuthDestination((Activity) context, deeplink, successRedirectDeeplink, successRedirectProperties, failureRedirectDeeplink, extraPage);
    }

    static /* synthetic */ f internalCreateAuthDestination$default(AuthDestinationInterceptorImpl authDestinationInterceptorImpl, Context context, String str, String str2, Map map, String str3, f fVar, b bVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = AuthDestinationInterceptor.Companion.getDEFAULT_AUTH_DEEPLINK();
        }
        String str4 = str;
        if ((i11 & 8) != 0) {
            map = U.c();
        }
        return authDestinationInterceptorImpl.internalCreateAuthDestination(context, str4, str2, map, (i11 & 16) != 0 ? null : str3, fVar, (i11 & 64) != 0 ? null : bVar);
    }

    private final Intent startOzonIdSdkAuth(Activity activity, String deeplink, String successRedirectDeeplink, Map<String, ? extends Object> successRedirectProperties, String failureRedirectDeeplink, b extraPage) {
        this.authEventsCollector.setAuthResultActions(new AuthResultActions(deeplink, successRedirectDeeplink, successRedirectProperties, failureRedirectDeeplink, null, null, null, 112, null));
        return this.ozonIdAppApi.t(new AuthDestinationInterceptorImpl$startOzonIdSdkAuth$1(activity, deeplink, extraPage));
    }

    @Override // ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor
    public f createAuthDestination(@NotNull Context context, @NotNull String deeplink, String successRedirectDeeplink, String failureRedirectDeeplink, b extraPage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return internalCreateAuthDestination$default(this, context, deeplink, successRedirectDeeplink, null, failureRedirectDeeplink, null, extraPage, 8, null);
    }

    @Override // ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor, KZ.b
    public f intercept(@NotNull Context context, @NotNull f destination, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(route, "route");
        return internalCreateAuthDestination$default(this, context, null, route.b().toString(), route.e(), null, destination, null, 82, null);
    }
}
