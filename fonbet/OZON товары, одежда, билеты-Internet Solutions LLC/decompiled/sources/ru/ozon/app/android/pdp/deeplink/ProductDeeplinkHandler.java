package ru.ozon.app.android.pdp.deeplink;

import IZ.a;
import IZ.b;
import Kk.c;
import Tc.j;
import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.configurator.RefreshByResultConfigurator;
import ru.ozon.app.android.composer.emptyscreenfactory.DefaultEmptyScreenFactory;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabRequiredFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.favorites.ui.configurators.CreateShoppingListConfigurator;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandler;
import ru.ozon.app.android.navigation.handlers.page.PdpPageInfo;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.flags.PdpOfflineModeFlag;
import ru.ozon.app.android.pdp.offline.PdpOfflineScreenFactory;
import ru.ozon.app.android.pdp.ui.configurators.common.additionalViewPool.AdditionRecycledViewPoolConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.comparison.configurator.ComparisonConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.monetization.shareLinkBloggerCopyResult.ShareLinkBloggerCopyResultConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.pdp.PdpConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReviewConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.question.QuestionsConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.rateItems.ReviewSuccessConfigurator;
import ru.ozon.app.android.pdp.utils.ProductDeeplinkChecker;
import ru.ozon.app.android.pdp.view.pdp.RefreshByAdultStateConfigurator;
import ru.ozon.app.android.pdp.widgets.helpfulHints.configurator.OrderDoneLiteInfoConfigurator;
import ru.ozon.app.android.pdpvideomolecule.presentation.VideoPreloadCleanerConfigurator;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import uZ.C9992d;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/deeplink/ProductDeeplinkHandler;", "LIZ/a;", "LIZ/b;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;", "freshPdpInBottomSheetHandler", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;)V", "", "deeplink", "Landroid/content/Context;", "context", "Lru/ozon/app/android/composer/navigations/destinations/BottomSheetComposerFragmentDestination;", "getFreshDestination", "(Ljava/lang/String;Landroid/content/Context;)Lru/ozon/app/android/composer/navigations/destinations/BottomSheetComposerFragmentDestination;", "LpZ/f;", "getRegularDestination", "(Ljava/lang/String;Landroid/content/Context;)LpZ/f;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;", "bottomSheetConfig", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getScreenConfig", "(Ljava/lang/String;Landroid/content/Context;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "LJZ/a;", "getPageInfo", "()LJZ/a;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductDeeplinkHandler implements a, b {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final FreshPdpInBottomSheetHandler freshPdpInBottomSheetHandler;

    public ProductDeeplinkHandler(@NotNull FeatureChecker featureChecker, @NotNull FreshPdpInBottomSheetHandler freshPdpInBottomSheetHandler) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(freshPdpInBottomSheetHandler, "freshPdpInBottomSheetHandler");
        this.featureChecker = featureChecker;
        this.freshPdpInBottomSheetHandler = freshPdpInBottomSheetHandler;
    }

    private final BottomSheetComposerFragmentDestination getFreshDestination(String deeplink, Context context) {
        return new BottomSheetComposerFragmentDestination(deeplink, getScreenConfig(deeplink, context, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_FULL, true, false, null, 0, false, false, false, false, false, true, 764, null)), new C9992d.b.C2203d("FRESH_PDP"), null, null, null, 56, null);
    }

    private final f getRegularDestination(String deeplink, Context context) {
        return new ComposerTabRequiredFragmentDestination(getScreenConfig$default(this, deeplink, context, null, 4, null), deeplink, null, false, null, false, 60, null);
    }

    private final ComposerScreenConfig getScreenConfig(String deeplink, Context context, ComposerScreenConfig.BottomSheetConfig bottomSheetConfig) {
        boolean isEnabled = this.featureChecker.isEnabled(PdpOfflineModeFlag.INSTANCE);
        if (AndroidPlatformComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentDependencies is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, AndroidPlatformComponentDependencies.class).getDependencyStorage();
        if (AndroidPlatformComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentDependencies is not DiComponent");
        }
        boolean z11 = ((AndroidPlatformComponentDependencies) dependencyStorage.b(AndroidPlatformComponentDependencies.class)).getAppType() == AppType.SELECT;
        h.c.a aVar = new h.c.a(deeplink, (String) null, (String) null, 14);
        j builder = new j();
        builder.add(PdpConfigurator.class);
        builder.add(RefreshByAdultStateConfigurator.class);
        builder.add(ReviewConfigurator.class);
        builder.add(ReviewSuccessConfigurator.class);
        builder.add(RefreshByResultConfigurator.class);
        builder.add(CreateShoppingListConfigurator.class);
        builder.add(QuestionsConfigurator.class);
        builder.add(ComparisonConfigurator.class);
        builder.add(OrderDoneLiteInfoConfigurator.class);
        builder.add(ShareLinkBloggerCopyResultConfigurator.class);
        builder.add(AdditionRecycledViewPoolConfigurator.class);
        builder.add(VideoPreloadCleanerConfigurator.class);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return new ComposerScreenConfig(aVar, new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, false, null, null, z11 ? Integer.valueOf(ThemeExtKt.themeColorRes(context, R$attr.layerFloor0)) : null, z11 ? Integer.valueOf(ThemeExtKt.themeColorRes(context, R$attr.graphicTertiaryOnDark)) : null, 15, null), 0, 2, null), false, bottomSheetConfig, true, false, false, true, null, false, false, false, builder.b(), null, null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor0)), false, null, null, null, false, false, isEnabled ? PdpOfflineScreenFactory.class : DefaultEmptyScreenFactory.class, null, 12545860, null);
    }

    static /* synthetic */ ComposerScreenConfig getScreenConfig$default(ProductDeeplinkHandler productDeeplinkHandler, String str, Context context, ComposerScreenConfig.BottomSheetConfig bottomSheetConfig, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            bottomSheetConfig = null;
        }
        return productDeeplinkHandler.getScreenConfig(str, context, bottomSheetConfig);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull GZ.j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return ProductDeeplinkChecker.INSTANCE.isProductDeeplink(route.b());
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull GZ.j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        if (!MiniAppExtKt.isExpress(route.b())) {
            return getRegularDestination(c.c(route, "toString(...)"), context);
        }
        boolean hasDeeplinkFreshExternalMark = this.freshPdpInBottomSheetHandler.hasDeeplinkFreshExternalMark(route.b());
        boolean shouldOpenInBottomSheet = this.freshPdpInBottomSheetHandler.shouldOpenInBottomSheet(MiniAppExtKt.isExpress(context), hasDeeplinkFreshExternalMark);
        String uri = hasDeeplinkFreshExternalMark ? this.freshPdpInBottomSheetHandler.removeFreshExternalMarkFromDeeplink(route.b()).toString() : route.b().toString();
        Intrinsics.f(uri);
        return (!shouldOpenInBottomSheet || MiniAppExtKt.isExpress(context)) ? shouldOpenInBottomSheet ? getFreshDestination(uri, context) : getRegularDestination(uri, context) : new OZ.h(getFreshDestination(uri, context));
    }

    @Override // IZ.b
    @NotNull
    public JZ.a getPageInfo() {
        return new PdpPageInfo();
    }
}
