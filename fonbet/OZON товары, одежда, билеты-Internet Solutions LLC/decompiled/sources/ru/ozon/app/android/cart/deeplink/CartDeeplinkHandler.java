package ru.ozon.app.android.cart.deeplink;

import C.J;
import GZ.j;
import IZ.c;
import android.content.Context;
import i10.h;
import i10.l;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.cart.CartSharedViewPoolSizeSetterConfigurator;
import ru.ozon.app.android.cart.common.interceptor.CartDeeplinkInterceptor;
import ru.ozon.app.android.cart.configurator.AddToCartLoaderConfigurator;
import ru.ozon.app.android.cart.configurator.AsyncCartConfigurator;
import ru.ozon.app.android.cart.configurator.CartConfigurator;
import ru.ozon.app.android.cart.configurator.CartKeyboardInsetConfigurator;
import ru.ozon.app.android.cart.configurator.CartOnScreenEventHandlerConfigurator;
import ru.ozon.app.android.cart.configurator.CartPrefetchConfigurator;
import ru.ozon.app.android.cart.configurator.CartRefreshEventConfigurator;
import ru.ozon.app.android.cart.configurator.CartRestoreItemConfigurator;
import ru.ozon.app.android.cart.configurator.CartScreenStateConfigurator;
import ru.ozon.app.android.cart.configurator.CartSplitSwipeConfigurator;
import ru.ozon.app.android.cart.configurator.FreshCartConfigurator;
import ru.ozon.app.android.cart.configurator.ResetCartModeConfigurator;
import ru.ozon.app.android.cart.configurator.interceptors.CartComposerInterceptor;
import ru.ozon.app.android.cart.configurator.interceptors.skuPromo.SkuPromoCartComposerInterceptor;
import ru.ozon.app.android.cart.configurator.interceptors.skuPromo.SkuPromoCommonKt;
import ru.ozon.app.android.cart.configurator.preCreating.CartPreCreateViewConfiguratorV2;
import ru.ozon.app.android.cart.domain.flags.CartProductSelectMode;
import ru.ozon.app.android.cart.domain.utils.CartDeeplinkValidator;
import ru.ozon.app.android.cart.feature.R$string;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.fresh.common.flags.FreshMainTabbarVisibleFlag;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\f2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/cart/deeplink/CartDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/cart/common/interceptor/CartDeeplinkInterceptor;", "cartDeeplinkInterceptor", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/cart/common/interceptor/CartDeeplinkInterceptor;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/utils/AppType;)V", "", "isInModal", "", "deeplink", "isRootScreen", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "screenConfig", "LpZ/f;", "resolveDestination", "(ZLjava/lang/String;ZLru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;)LpZ/f;", "", "minHeight", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;", "getBottomSheetConfig", "(ZLjava/lang/Integer;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/utils/AppType;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartDeeplinkHandler extends c {

    @NotNull
    private final AppType appType;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/deeplink/CartDeeplinkHandler$Companion;", "", "<init>", "()V", "PARAM_MIN_HEIGHT", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartDeeplinkHandler(@NotNull CartDeeplinkInterceptor cartDeeplinkInterceptor, @NotNull FeatureChecker featureChecker, @NotNull FeatureService featureService, @NotNull AppType appType) {
        super(null, cartDeeplinkInterceptor, 1, null);
        Intrinsics.checkNotNullParameter(cartDeeplinkInterceptor, "cartDeeplinkInterceptor");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.featureChecker = featureChecker;
        this.featureService = featureService;
        this.appType = appType;
    }

    private final ComposerScreenConfig.BottomSheetConfig getBottomSheetConfig(boolean isInModal, Integer minHeight) {
        if (isInModal) {
            return new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, null, minHeight != null ? minHeight.intValue() : ComposerScreenConfig.BottomSheetConfig.INSTANCE.getMIN_HEIGHT_DEFAULT(), false, false, false, false, false, false, 2030, null);
        }
        return null;
    }

    private final f resolveDestination(boolean isInModal, String deeplink, boolean isRootScreen, ComposerScreenConfig screenConfig) {
        if (!isInModal) {
            return new ComposerTabFragmentDestination(screenConfig, deeplink, R$id.menu_cart, null, false, isRootScreen, null, 88, null);
        }
        return new BottomSheetComposerFragmentDestination(deeplink, screenConfig, null, null, 9001, null, 44, null);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return CartDeeplinkValidator.INSTANCE.validateScreen(route.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        boolean z11;
        boolean z12;
        Integer num;
        String str;
        ComposerScreenConfig.ToolbarConfig.DefaultState defaultState;
        Integer w02;
        String queryParameter;
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.default_margin);
        LinkedHashSet e11 = e0.e(ResetCartModeConfigurator.class, CartConfigurator.class, CartOnScreenEventHandlerConfigurator.class, CartRefreshEventConfigurator.class, CartScreenStateConfigurator.class, CartPreCreateViewConfiguratorV2.class, AddToCartLoaderConfigurator.class, CartKeyboardInsetConfigurator.class, CartSharedViewPoolSizeSetterConfigurator.class, CartRestoreItemConfigurator.class, CartSplitSwipeConfigurator.class, CartPrefetchConfigurator.class, AsyncCartConfigurator.class, FreshCartConfigurator.class);
        boolean isExpress = MiniAppExtKt.isExpress(route.b());
        if (this.featureChecker.isEnabled(FreshMainTabbarVisibleFlag.INSTANCE) || !isExpress) {
            z11 = true;
            z12 = false;
        } else {
            z11 = false;
            z12 = true;
        }
        boolean z13 = this.featureService.getStringKey(CartProductSelectMode.INSTANCE).length() > 0;
        if (z13 || (queryParameter = route.b().getQueryParameter("miniapp")) == null || queryParameter.length() == 0) {
            num = null;
            str = "miniapp";
            defaultState = null;
        } else {
            str = "miniapp";
            num = null;
            defaultState = new ComposerScreenConfig.ToolbarConfig.DefaultState(0, z12, StringProvider.getString(R$string.cart), ComposerScreenConfig.ToolbarConfig.ToolbarTitleAlign.CENTER, Integer.valueOf(R$color.layer_floor_1), null, 33, null);
        }
        if (Intrinsics.d(route.b().getQueryParameter(str), "apparel") || z13 || isExpress) {
            dimensionPixelSize = 0;
        }
        boolean z14 = this.appType == AppType.SELECT;
        int i11 = z14 ? R$color.bg_dark_key : R$color.layer_floor_0;
        boolean validateModalAuthority = CartDeeplinkValidator.INSTANCE.validateModalAuthority(route.b());
        Object obj = route.e().get("minHeight");
        String str2 = obj instanceof String ? (String) obj : num;
        Integer valueOf = (str2 == 0 || (w02 = h.w0(str2)) == null) ? num : Integer.valueOf(ResourceExtKt.toPx(w02.intValue()));
        Tc.j builder = new Tc.j();
        builder.add(CartComposerInterceptor.class);
        if (z14) {
            builder.add(SkuPromoCartComposerInterceptor.class);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.j b11 = builder.b();
        String removeSkuPromoQueryParams = SkuPromoCommonKt.removeSkuPromoQueryParams(route.b());
        return resolveDestination(validateModalAuthority, a11, z11, new ComposerScreenConfig(new h.c.a(a11, removeSkuPromoQueryParams, removeSkuPromoQueryParams, 8), new ComposerScreenConfig.ToolbarConfig(defaultState, dimensionPixelSize), false, getBottomSheetConfig(validateModalAuthority, valueOf), true, false, false, false, new ComposerScreenConfig.RefreshByAuthConfig.Enabled(e0.h(ComposerScreenConfig.RefreshByAuthConfig.Enabled.ReasonRefresh.Login.INSTANCE)), false, false, false, e11, b11, Integer.valueOf(i11), null, false, new ComposerScreenConfig.AppearanceConfig(new l.a.b(0L, num, 2)), null, null, false, false, null, null, 14520036, null));
    }
}
