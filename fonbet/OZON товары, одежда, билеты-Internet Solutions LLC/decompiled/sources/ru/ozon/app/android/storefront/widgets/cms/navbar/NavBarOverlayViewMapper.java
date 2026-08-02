package ru.ozon.app.android.storefront.widgets.cms.navbar;

import A00.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import c20.r;
import d20.AbstractC6065b;
import gk0.q;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.storefront.navBar.NavBarDTO;
import ru.ozon.app.android.storefront.navBar.NavBarMapper;
import ru.ozon.app.android.storefront.navBar.NavBarOverlayViewHolder;
import ru.ozon.app.android.storefront.navBar.NavBarVO;
import ru.ozon.app.android.storefront.navBar.R$layout;
import ru.ozon.app.android.storefront.navBar.RefreshNavBarWidgetUpdateKey;
import ru.ozon.app.android.storefront.widgets.cms.di.NavBarComponent;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001fj\b\u0012\u0004\u0012\u00020\u0002` 2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0016¢\u0006\u0004\b!\u0010\"R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/navbar/NavBarOverlayViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/storefront/widgets/cms/di/NavBarComponent;", "Lru/ozon/app/android/storefront/navBar/NavBarDTO;", "Lru/ozon/app/android/storefront/navBar/NavBarVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "composerRootView", "Landroid/view/View;", "createWidget", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/storefront/navBar/NavBarDTO;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/storefront/navBar/NavBarVO;)Lru/ozon/app/android/storefront/navBar/NavBarVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Ljava/lang/Class;", "Lru/ozon/app/android/storefront/navBar/RefreshNavBarWidgetUpdateKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Lru/ozon/app/android/storefront/navBar/NavBarMapper;", "getMapper", "()Lru/ozon/app/android/storefront/navBar/NavBarMapper;", "mapper", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavBarOverlayViewMapper extends OverlayWidgetScreenViewItemMapper2<NavBarComponent, NavBarDTO, NavBarVO> {

    @NotNull
    private final List<Class<RefreshNavBarWidgetUpdateKey>> supportedUpdates = C7714v.a0(RefreshNavBarWidgetUpdateKey.class);

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    private final View createWidget(ViewGroup composerRootView) {
        View h11 = q.f64554a.h(R$layout.widget_navbar);
        if (h11 == null) {
            return ViewGroupExtKt.inflate(composerRootView, R$layout.widget_navbar);
        }
        h11.setLayoutParams(new Toolbar.g(-1, UiExtKt.toPx(48)));
        return h11;
    }

    private final NavBarMapper getMapper() {
        return component().getMapper();
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<NavBarVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ViewGroup Z11 = container.Z();
        return new NavBarOverlayViewHolder(container, createWidget(Z11), ComposerViewExtensionKt.composerToolbar(Z11), ComposerViewExtensionKt.composerCollapsingToolbar(Z11), ComposerViewExtensionKt.composerAppbar(Z11), component().getRouter(), container.d0(), component().getWidgetTokenizedAnalytics(), component().getFeatureChecker());
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<RefreshNavBarWidgetUpdateKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<NavBarComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return NavBarComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    @NotNull
    public NavBarVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull NavBarVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return NavBarVO.copy$default(oldItem, oldItem.hashCode(), false, null, null, null, false, 62, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<NavBarVO> map(@NotNull NavBarDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
