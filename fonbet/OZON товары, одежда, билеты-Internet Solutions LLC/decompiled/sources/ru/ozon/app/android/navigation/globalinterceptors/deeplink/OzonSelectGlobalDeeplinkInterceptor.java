package ru.ozon.app.android.navigation.globalinterceptors.deeplink;

import GZ.j;
import KZ.c;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.utils.CollectionExtKt;
import ru.ozon.app.android.utils.ContextUtilsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001b\u0010\u000f\u001a\u00020\b2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00060\fj\u0002`\r2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/navigation/globalinterceptors/deeplink/OzonSelectGlobalDeeplinkInterceptor;", "LKZ/c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/net/Uri;", "deeplink", "", "isHomeDeeplink", "(Landroid/net/Uri;)Z", "isHomeDeeplinkWithEmptyAuthority", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canIntercept", "(LGZ/j;)Z", "intercept", "(LGZ/j;)LGZ/j;", "Landroid/content/Context;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonSelectGlobalDeeplinkInterceptor implements c {

    @NotNull
    private final Context context;

    public OzonSelectGlobalDeeplinkInterceptor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final boolean isHomeDeeplink(Uri deeplink) {
        return Intrinsics.d(deeplink.getAuthority(), "home") || isHomeDeeplinkWithEmptyAuthority(deeplink);
    }

    private final boolean isHomeDeeplinkWithEmptyAuthority(Uri deeplink) {
        String authority = deeplink.getAuthority();
        return (authority == null || authority.length() == 0) && CollectionExtKt.isNullOrEmpty(deeplink.getQueryParameterNames());
    }

    @Override // KZ.c
    public boolean canIntercept(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return ContextUtilsKt.isOzonSelectApplication(this.context) && isHomeDeeplink(route.b());
    }

    @Override // KZ.a
    @NotNull
    public j intercept(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return j.a(route, LinkGenerator.INSTANCE.home());
    }
}
