package ru.ozon.app.android.cart.deeplink;

import C.J;
import GZ.j;
import IZ.c;
import android.content.Context;
import i10.h;
import i10.l;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.cart.common.interceptor.CartDeeplinkInterceptor;
import ru.ozon.app.android.cart.configurator.AddToCartLoaderConfigurator;
import ru.ozon.app.android.cart.configurator.AsyncCartConfigurator;
import ru.ozon.app.android.cart.configurator.CartRestoreItemConfigurator;
import ru.ozon.app.android.cart.configurator.CartSplitSwipeConfigurator;
import ru.ozon.app.android.cart.configurator.FamilyCartConfigurator;
import ru.ozon.app.android.cart.configurator.FamilyCartOnScreenEventHandlerConfigurator;
import ru.ozon.app.android.cart.configurator.FamilyCartRefreshEventConfigurator;
import ru.ozon.app.android.cart.configurator.interceptors.CartComposerInterceptor;
import ru.ozon.app.android.cart.configurator.preCreating.CartPreCreateViewConfiguratorV2;
import ru.ozon.app.android.cart.domain.utils.FamilyCartDeeplinkValidator;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cart/deeplink/FamilyCartDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/cart/common/interceptor/CartDeeplinkInterceptor;", "cartDeeplinkInterceptor", "<init>", "(Lru/ozon/app/android/cart/common/interceptor/CartDeeplinkInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FamilyCartDeeplinkHandler extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyCartDeeplinkHandler(@NotNull CartDeeplinkInterceptor cartDeeplinkInterceptor) {
        super(null, cartDeeplinkInterceptor, 1, null);
        Intrinsics.checkNotNullParameter(cartDeeplinkInterceptor, "cartDeeplinkInterceptor");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return FamilyCartDeeplinkValidator.INSTANCE.validateScreen(route.b());
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        LinkedHashSet e11 = e0.e(FamilyCartConfigurator.class, FamilyCartOnScreenEventHandlerConfigurator.class, CartPreCreateViewConfiguratorV2.class, AddToCartLoaderConfigurator.class, CartRestoreItemConfigurator.class, CartSplitSwipeConfigurator.class, FamilyCartRefreshEventConfigurator.class, AsyncCartConfigurator.class);
        int i11 = R$color.layer_floor_0;
        Set h11 = e0.h(CartComposerInterceptor.class);
        return new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), null, false, null, true, false, false, false, new ComposerScreenConfig.RefreshByAuthConfig.Enabled(e0.h(ComposerScreenConfig.RefreshByAuthConfig.Enabled.ReasonRefresh.Login.INSTANCE)), false, false, true, e11, h11, Integer.valueOf(i11), null, false, new ComposerScreenConfig.AppearanceConfig(new l.a.b(0L, null, 2)), null, null, false, false, null, null, 16615148, null), a11, null, false, false, null, false, false, null, 508, null);
    }
}
