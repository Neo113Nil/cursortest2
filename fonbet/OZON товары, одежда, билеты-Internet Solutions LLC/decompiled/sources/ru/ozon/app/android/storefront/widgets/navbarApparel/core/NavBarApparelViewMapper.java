package ru.ozon.app.android.storefront.widgets.navbarApparel.core;

import A00.a;
import Dq.C2878a;
import a00.C4911f;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import c20.r;
import com.google.android.material.appbar.AppBarLayout;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.common.di.SearchPrefetchApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storefront.utils.UtilsKt;
import ru.ozon.app.android.storefront.widgets.navbarApparel.data.NavBarApparelDTO;
import ru.ozon.app.android.storefront.widgets.navbarApparel.di.DaggerNavBarApparelComponent;
import ru.ozon.app.android.storefront.widgets.navbarApparel.di.NavBarApparelComponent;
import ru.ozon.app.android.storefront.widgets.navbarApparel.presentation.NavBarApparelVO;
import ru.ozon.app.android.storefront.widgets.navbarApparel.presentation.NavBarApparelViewHolder;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001ej\b\u0012\u0004\u0012\u00020\u0002`\u001f2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$R&\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarApparel/core/NavBarApparelViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/storefront/widgets/navbarApparel/di/NavBarApparelComponent;", "Lru/ozon/app/android/storefront/widgets/navbarApparel/data/NavBarApparelDTO;", "Lru/ozon/app/android/storefront/widgets/navbarApparel/presentation/NavBarApparelVO;", "<init>", "()V", "La00/f;", "container", "", "isRootFragment", "(La00/f;)Z", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/storefront/widgets/navbarApparel/presentation/NavBarApparelVO;)Lru/ozon/app/android/storefront/widgets/navbarApparel/presentation/NavBarApparelVO;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/storefront/widgets/navbarApparel/data/NavBarApparelDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "canMap", "(Ljava/lang/Object;)Z", "Ljava/lang/Class;", "Lru/ozon/app/android/storefront/widgets/navbarApparel/core/SaveStateEvent;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavBarApparelViewMapper extends OverlayWidgetScreenViewItemMapper2<NavBarApparelComponent, NavBarApparelDTO, NavBarApparelVO> {

    @NotNull
    private final List<Class<SaveStateEvent>> supportedUpdates = C7714v.a0(SaveStateEvent.class);

    private final boolean isRootFragment(C4911f container) {
        G parentFragmentManager;
        ComponentCallbacksC5392m c11 = container.c();
        return ((c11 == null || (parentFragmentManager = c11.getParentFragmentManager()) == null) ? 0 : parentFragmentManager.l0()) <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavBarApparelComponent widgetComponent$lambda$1(C7475g c7475g) {
        return DaggerNavBarApparelComponent.factory().create((RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class), (FavoriteComponentApi) c7475g.getComponent(FavoriteComponentApi.class), (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (SearchPrefetchApi) c7475g.getComponent(SearchPrefetchApi.class), (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class));
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        NavBarApparelDTO navBarApparelDTO = state instanceof NavBarApparelDTO ? (NavBarApparelDTO) state : null;
        if (navBarApparelDTO == null) {
            return false;
        }
        if (navBarApparelDTO.getBackButton() != null) {
            return true;
        }
        List<Object> rightButtons = navBarApparelDTO.getRightButtons();
        return (rightButtons == null || rightButtons.isEmpty()) ? false : true;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<NavBarApparelVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ViewGroup Z11 = container.Z();
        C4911f Q11 = container.Q();
        AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(Z11);
        if (composerAppbar != null) {
            ViewGroup.LayoutParams layoutParams = composerAppbar.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ComponentCallbacksC5392m c11 = container.Q().c();
            marginLayoutParams.topMargin = (c11 != null ? c11.getParentFragment() : null) instanceof BottomSheetComposerFragment ? 0 : UtilsKt.getStatusBarHeight(Q11);
            marginLayoutParams.height = 0;
            composerAppbar.setLayoutParams(marginLayoutParams);
        }
        Z11.setFitsSystemWindows(false);
        return new NavBarApparelViewHolder(container, component().getFavDelegateProvider().get(container), isRootFragment(Q11), component().searchUrlPrefetchService(), component().customActionHandlersStoreFactory());
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<SaveStateEvent>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<NavBarApparelComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(NavBarApparelComponent.class), new C2878a(storage, 6));
    }

    @Override // c20.r, I00.d
    public NavBarApparelVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull NavBarApparelVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof SaveStateEvent) {
            oldItem.setCurrentScrollY(((SaveStateEvent) update).getPositionY());
        }
        return oldItem;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<NavBarApparelVO> map(@NotNull NavBarApparelDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(NavBarApparelMapperKt.toVO(state));
    }
}
