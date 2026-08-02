package ru.ozon.app.android.bank.externals.bank;

import GZ.g;
import GZ.j;
import GZ.k;
import HZ.a;
import T80.b;
import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/bank/externals/bank/OzonExternalFintechNavigation;", "LT80/b;", "LHZ/a;", "deeplinkHandlersCache", "LGZ/g;", "ozonRouter", "LGZ/k;", "routeFactory", "<init>", "(LHZ/a;LGZ/g;LGZ/k;)V", "", "deeplink", "", "handleDeeplinkIfCan", "(Ljava/lang/String;)Z", "Landroid/net/Uri;", "uri", "isUriWithOzonScheme", "(Landroid/net/Uri;)Z", "Landroid/app/Activity;", "activity", ImagesContract.URL, "canStartOzonIdRecoveryFlow", "(Landroid/app/Activity;Ljava/lang/String;)Z", "gotoDeeplinkOnlyIntegration", "", "hideBottomNavigation", "(Landroid/app/Activity;)V", "showBottomNavigation", "LHZ/a;", "LGZ/g;", "LGZ/k;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OzonExternalFintechNavigation implements b {

    @NotNull
    private final a deeplinkHandlersCache;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final k routeFactory;

    public OzonExternalFintechNavigation(@NotNull a deeplinkHandlersCache, @NotNull g ozonRouter, @NotNull k routeFactory) {
        Intrinsics.checkNotNullParameter(deeplinkHandlersCache, "deeplinkHandlersCache");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(routeFactory, "routeFactory");
        this.deeplinkHandlersCache = deeplinkHandlersCache;
        this.ozonRouter = ozonRouter;
        this.routeFactory = routeFactory;
    }

    private final boolean handleDeeplinkIfCan(String deeplink) {
        IZ.a b11;
        j b12 = k.b(this.routeFactory, deeplink, null, 6);
        if (b12 == null || (b11 = this.deeplinkHandlersCache.b(b12)) == null || !b11.canHandle(b12)) {
            return false;
        }
        return g.a.a(this.ozonRouter, deeplink, null, null, 6);
    }

    private final boolean isUriWithOzonScheme(Uri uri) {
        return Intrinsics.d(uri.getScheme(), "ozon");
    }

    @Override // T80.b
    public boolean canStartOzonIdRecoveryFlow(Activity activity, String url) {
        j b11;
        IZ.a b12;
        f destination;
        if (activity == null || url == null || (b11 = k.b(this.routeFactory, url, null, 6)) == null || (b12 = this.deeplinkHandlersCache.b(b11)) == null || !b12.canHandle(b11) || (destination = b12.getDestination(activity, b11)) == null) {
            return false;
        }
        return this.ozonRouter.c(new LZ.b(destination), null);
    }

    @Override // T80.b
    public boolean gotoDeeplinkOnlyIntegration(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Uri parse = Uri.parse(deeplink);
        Intrinsics.f(parse);
        return isUriWithOzonScheme(parse) && handleDeeplinkIfCan(deeplink);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // T80.b
    public void hideBottomNavigation(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof BottomNavigationStateController) {
            ((BottomNavigationStateController) activity).hideBottomNavigation();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // T80.b
    public void showBottomNavigation(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof BottomNavigationStateController) {
            ((BottomNavigationStateController) activity).showBottomNavigation();
        }
    }

    @Override // T80.b
    public void startOzonIdSign(@NotNull Activity activity, String str, String str2) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
