package ru.ozon.app.android.cart.common.interceptor;

import GZ.j;
import HZ.d;
import KZ.a;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.flags.CartRemoveInvalidSlashFromUrlEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.utils.UriExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0012\u001a\u00060\u000fj\u0002`\u00102\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cart/common/interceptor/CartDeeplinkInterceptor;", "LKZ/a;", "LHZ/d;", "deeplinkMiniAppMapper", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "cartNavigationService", "<init>", "(LHZ/d;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/cart/common/domain/CartNavigationService;)V", "Landroid/net/Uri;", "link", "updateMiniApp", "(Landroid/net/Uri;)Landroid/net/Uri;", "removeInvalidSlashIfNeed", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "intercept", "(LGZ/j;)LGZ/j;", "LHZ/d;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartDeeplinkInterceptor implements a {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final CartNavigationService cartNavigationService;

    @NotNull
    private final d deeplinkMiniAppMapper;

    @NotNull
    private final FeatureChecker featureChecker;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cart/common/interceptor/CartDeeplinkInterceptor$Companion;", "", "<init>", "()V", "SCROLL_TO_TOP_PARAM_KEY", "", "INVALID_SLASH", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CartDeeplinkInterceptor(@NotNull d deeplinkMiniAppMapper, @NotNull FeatureChecker featureChecker, @NotNull CartNavigationService cartNavigationService) {
        Intrinsics.checkNotNullParameter(deeplinkMiniAppMapper, "deeplinkMiniAppMapper");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(cartNavigationService, "cartNavigationService");
        this.deeplinkMiniAppMapper = deeplinkMiniAppMapper;
        this.featureChecker = featureChecker;
        this.cartNavigationService = cartNavigationService;
    }

    private final Uri removeInvalidSlashIfNeed(Uri uri) {
        if (!this.featureChecker.isEnabled(CartRemoveInvalidSlashFromUrlEnabled.INSTANCE)) {
            return uri;
        }
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        if (!h.t(uri2, "/?", false)) {
            return uri;
        }
        String uri3 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri3, "toString(...)");
        return Uri.parse(h.X(uri3, "/?", "?", false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Uri updateMiniApp(Uri link) {
        String a11 = this.deeplinkMiniAppMapper.a();
        String queryParameter = link.getQueryParameter("miniapp");
        if (Intrinsics.d(a11, "main") && Intrinsics.d(queryParameter, a11)) {
            queryParameter = null;
        }
        if (queryParameter == null) {
            queryParameter = "";
        }
        Uri.Builder buildUpon = UriExtKt.removeQueryParameter(UriExtKt.removeQueryParameter(removeInvalidSlashIfNeed(link), "miniapp"), "scrollToTop").buildUpon();
        if (!h.K(queryParameter)) {
            buildUpon.appendQueryParameter("miniapp", queryParameter);
        }
        Uri build = buildUpon.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @Override // KZ.a
    @NotNull
    public j intercept(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return j.a(route, this.cartNavigationService.resolveDeeplink(route.b(), route.b(), new CartDeeplinkInterceptor$intercept$finalUri$1(this)));
    }
}
