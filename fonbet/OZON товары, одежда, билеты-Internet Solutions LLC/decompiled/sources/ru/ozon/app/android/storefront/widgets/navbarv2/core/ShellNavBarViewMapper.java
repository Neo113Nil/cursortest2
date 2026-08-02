package ru.ozon.app.android.storefront.widgets.navbarv2.core;

import A00.a;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.domain.flags.NavBarV2CornersV2Enabled;
import ru.ozon.app.android.domain.flags.RedesignedSearchBarEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storefront.navBar.RefreshNavBarWidgetUpdateKey;
import ru.ozon.app.android.storefront.navBar.v2.event.RichPromoScrollNotVisibleEvent;
import ru.ozon.app.android.storefront.navBar.v2.event.RichPromoScrollVisibleEvent;
import ru.ozon.app.android.storefront.widgets.navbarv2.data.ShellNavBarDTO;
import ru.ozon.app.android.storefront.widgets.navbarv2.di.ShellNavBarComponent;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.ShellNavBarOverlayViewHolder;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.ShellNavBarViewModel;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornerManager;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornersManagerImpl;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornersManagerV2Impl;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarFloorManager;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.placeholder.ShellNavBarPlaceholderMapper;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views.ShellNavBarBgView;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.RichPromoSettings;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R(\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\"0+0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/core/ShellNavBarViewMapper;", "Lc20/r;", "Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "Lru/ozon/app/android/storefront/widgets/navbarv2/di/ShellNavBarComponent;", "component", "<init>", "(Lru/ozon/app/android/storefront/widgets/navbarv2/di/ShellNavBarComponent;)V", "Ll10/i;", "container", "", "hasBackButton", "(Ll10/i;)Z", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Landroid/view/ViewGroup;", "composerRootView", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbar", "stickyContainer", "Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarCornerManager;", "getCornerManager", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Landroid/view/ViewGroup;Lcom/google/android/material/appbar/CollapsingToolbarLayout;Landroid/view/ViewGroup;Lcom/google/android/material/appbar/AppBarLayout;)Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarCornerManager;", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;)Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "Lru/ozon/app/android/storefront/widgets/navbarv2/di/ShellNavBarComponent;", "", "toolbarHeight", "I", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Lru/ozon/app/android/storefront/widgets/navbarv2/core/ShellNavBarMapper;", "getMapper", "()Lru/ozon/app/android/storefront/widgets/navbarv2/core/ShellNavBarMapper;", "mapper", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShellNavBarViewMapper extends r<ShellNavBarDTO, ShellNavBarVO> {

    @NotNull
    private final ShellNavBarComponent component;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;
    private final int toolbarHeight;

    @NotNull
    private final r.a viewType;

    public ShellNavBarViewMapper(@NotNull ShellNavBarComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.toolbarHeight = ResourceExtKt.toPx(44);
        this.supportedUpdates = C7714v.b0(RefreshNavBarWidgetUpdateKey.class, RichPromoScrollNotVisibleEvent.class, RichPromoScrollVisibleEvent.class);
        this.viewType = r.a.SINGLE;
    }

    private final ShellNavBarCornerManager getCornerManager(FeatureChecker featureChecker, ViewGroup composerRootView, CollapsingToolbarLayout collapsingToolbar, ViewGroup stickyContainer, AppBarLayout appBar) {
        return featureChecker.isEnabled(NavBarV2CornersV2Enabled.INSTANCE) ? new ShellNavBarCornersManagerV2Impl(composerRootView, collapsingToolbar, stickyContainer) : new ShellNavBarCornersManagerImpl(composerRootView, collapsingToolbar, appBar, stickyContainer, featureChecker);
    }

    private final ShellNavBarMapper getMapper() {
        return this.component.getMapper();
    }

    private final boolean hasBackButton(i container) {
        G parentFragmentManager;
        ComponentCallbacksC5392m b11 = container.K().b();
        boolean z11 = ((b11 == null || (parentFragmentManager = b11.getParentFragmentManager()) == null) ? 0 : parentFragmentManager.l0()) <= 1;
        Toolbar composerToolbar = ComposerViewExtensionKt.composerToolbar(container.Z());
        boolean z12 = (composerToolbar != null ? composerToolbar.getNavigationIcon() : null) != null;
        if (z11 && z12) {
            return true;
        }
        return (z11 || z12) && !z11;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ShellNavBarVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ViewGroup Z11 = container.Z();
        CollapsingToolbarLayout composerCollapsingToolbar = ComposerViewExtensionKt.composerCollapsingToolbar(Z11);
        if (composerCollapsingToolbar == null) {
            AbstractC6065b.INSTANCE.getClass();
            return AbstractC6065b.Companion.a();
        }
        Toolbar composerToolbar = ComposerViewExtensionKt.composerToolbar(Z11);
        if (composerToolbar == null) {
            AbstractC6065b.INSTANCE.getClass();
            return AbstractC6065b.Companion.a();
        }
        ViewGroup.LayoutParams layoutParams = composerToolbar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams");
        }
        CollapsingToolbarLayout.a aVar = (CollapsingToolbarLayout.a) layoutParams;
        ((FrameLayout.LayoutParams) aVar).height = this.toolbarHeight;
        composerToolbar.setLayoutParams(aVar);
        AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(Z11);
        if (composerAppbar == null) {
            AbstractC6065b.INSTANCE.getClass();
            return AbstractC6065b.Companion.a();
        }
        composerAppbar.setFocusable(true);
        composerAppbar.setClickable(true);
        ViewGroup composerStickyContainer = ComposerViewExtensionKt.composerStickyContainer(Z11);
        if (composerStickyContainer == null) {
            AbstractC6065b.INSTANCE.getClass();
            return AbstractC6065b.Companion.a();
        }
        Context context = Z11.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ShellNavBarBgView shellNavBarBgView = new ShellNavBarBgView(context, null, 0, 6, null);
        shellNavBarBgView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        shellNavBarBgView.setRecyclerComposer(ComposerViewExtensionKt.composerRecyclerView(container.Y()));
        shellNavBarBgView.setStickyWidgetsContainer(composerStickyContainer);
        ShellNavBarViewModel shellNavBarViewModel = (ShellNavBarViewModel) new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.core.ShellNavBarViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                ShellNavBarComponent shellNavBarComponent;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                shellNavBarComponent = ShellNavBarViewMapper.this.component;
                ShellNavBarViewModel viewModel = shellNavBarComponent.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(ShellNavBarViewModel.class);
        ShellNavBarPlaceholderMapper shellNavBarPlaceholderMapper = new ShellNavBarPlaceholderMapper(container, composerCollapsingToolbar, hasBackButton(container), this.component.getViewedPond(), this.component.getFeatureChecker().isEnabled(RedesignedSearchBarEnabled.INSTANCE));
        return new ShellNavBarOverlayViewHolder(container, shellNavBarBgView, composerToolbar, composerCollapsingToolbar, composerAppbar, shellNavBarPlaceholderMapper, shellNavBarViewModel, getCornerManager(this.component.getFeatureChecker(), Z11, composerCollapsingToolbar, composerStickyContainer, composerAppbar), new ShellNavBarFloorManager(container, composerCollapsingToolbar, composerToolbar, shellNavBarPlaceholderMapper), this.component.getComposerStore(), this.component.getTokenizedAnalytics());
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // c20.r, I00.d
    @NotNull
    public ShellNavBarVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull ShellNavBarVO oldItem) {
        ShellNavBarVO copy;
        ShellNavBarVO copy2;
        ShellNavBarVO copy3;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof RichPromoScrollNotVisibleEvent) {
            copy3 = oldItem.copy((r32 & 1) != 0 ? oldItem.id : oldItem.hashCode(), (r32 & 2) != 0 ? oldItem.backgroundColor : null, (r32 & 4) != 0 ? oldItem.overlayColor : null, (r32 & 8) != 0 ? oldItem.forceWhiteStatusBar : false, (r32 & 16) != 0 ? oldItem.backgroundImage : null, (r32 & 32) != 0 ? oldItem.darkBackgroundImage : null, (r32 & 64) != 0 ? oldItem.backIconVO : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.isRounded : true, (r32 & 256) != 0 ? oldItem.disableRounding : false, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.isStickyThirdLevel : false, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.spacings : null, (r32 & 2048) != 0 ? oldItem.showFullNavbarMode : null, (r32 & 4096) != 0 ? oldItem.teeth : null, (r32 & 8192) != 0 ? oldItem.isSelectApp : false);
            copy3.setRichPromoSettings(new RichPromoSettings(true, true));
            return copy3;
        }
        if (!(update instanceof RichPromoScrollVisibleEvent)) {
            copy = oldItem.copy((r32 & 1) != 0 ? oldItem.id : oldItem.hashCode(), (r32 & 2) != 0 ? oldItem.backgroundColor : null, (r32 & 4) != 0 ? oldItem.overlayColor : null, (r32 & 8) != 0 ? oldItem.forceWhiteStatusBar : false, (r32 & 16) != 0 ? oldItem.backgroundImage : null, (r32 & 32) != 0 ? oldItem.darkBackgroundImage : null, (r32 & 64) != 0 ? oldItem.backIconVO : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.isRounded : false, (r32 & 256) != 0 ? oldItem.disableRounding : false, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.isStickyThirdLevel : false, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.spacings : null, (r32 & 2048) != 0 ? oldItem.showFullNavbarMode : null, (r32 & 4096) != 0 ? oldItem.teeth : null, (r32 & 8192) != 0 ? oldItem.isSelectApp : false);
            return copy;
        }
        copy2 = oldItem.copy((r32 & 1) != 0 ? oldItem.id : oldItem.hashCode(), (r32 & 2) != 0 ? oldItem.backgroundColor : null, (r32 & 4) != 0 ? oldItem.overlayColor : null, (r32 & 8) != 0 ? oldItem.forceWhiteStatusBar : false, (r32 & 16) != 0 ? oldItem.backgroundImage : null, (r32 & 32) != 0 ? oldItem.darkBackgroundImage : null, (r32 & 64) != 0 ? oldItem.backIconVO : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.isRounded : false, (r32 & 256) != 0 ? oldItem.disableRounding : false, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.isStickyThirdLevel : false, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.spacings : null, (r32 & 2048) != 0 ? oldItem.showFullNavbarMode : null, (r32 & 4096) != 0 ? oldItem.teeth : null, (r32 & 8192) != 0 ? oldItem.isSelectApp : false);
        copy2.setRichPromoSettings(new RichPromoSettings(true, false));
        return copy2;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ShellNavBarVO> map(@NotNull ShellNavBarDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
