package ru.ozon.app.android.favorites.wishlistMultiselect.presentation;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProductsManagerVmWrapper;
import ru.ozon.app.android.favorites.wishlistMultiselect.data.WishlistMultiselectDTO;
import ru.ozon.app.android.favorites.wishlistMultiselect.di.WishlistMultiselectWidgetComponent;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001b2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/favorites/wishlistMultiselect/presentation/WishlistMultiselectNoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/favorites/wishlistMultiselect/di/WishlistMultiselectWidgetComponent;", "Lru/ozon/app/android/favorites/wishlistMultiselect/data/WishlistMultiselectDTO;", "Lru/ozon/app/android/favorites/wishlistMultiselect/presentation/WishlistMultiselectVO;", "<init>", "()V", "", "stateId", "toVo", "(Lru/ozon/app/android/favorites/wishlistMultiselect/data/WishlistMultiselectDTO;Ljava/lang/String;)Lru/ozon/app/android/favorites/wishlistMultiselect/presentation/WishlistMultiselectVO;", "state", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/favorites/wishlistMultiselect/data/WishlistMultiselectDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WishlistMultiselectNoUiViewMapper extends OverlayWidgetScreenViewItemMapper2<WishlistMultiselectWidgetComponent, WishlistMultiselectDTO, WishlistMultiselectVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    private final WishlistMultiselectVO toVo(WishlistMultiselectDTO wishlistMultiselectDTO, String str) {
        return new WishlistMultiselectVO(str.hashCode(), wishlistMultiselectDTO.getSubmitButton(), wishlistMultiselectDTO.getLimit(), wishlistMultiselectDTO.getSubtextParts(), wishlistMultiselectDTO.getNotificationWarning());
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<WishlistMultiselectVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.favorites.wishlistMultiselect.presentation.WishlistMultiselectNoUiViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SelectedProductsManagerVmWrapper selectedProductsManagerVmWrapper = WishlistMultiselectNoUiViewMapper.this.component().getViewModelProvider().get();
                Intrinsics.g(selectedProductsManagerVmWrapper, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return selectedProductsManagerVmWrapper;
            }
        }).a(SelectedProductsManagerVmWrapper.class);
        return new WishlistMultiselectOverlayViewHolder(container, component().getSelectedProductsManager(), component().getFavListInteractor(), component().getFavoriteEventManager(), component().getRouter(), component().getWishlistEventManager(), new WishlistMultiselectNoUiViewMapper$createHolder$2(container));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<WishlistMultiselectWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return WishlistMultiselectWidgetComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<WishlistMultiselectVO> map(@NotNull WishlistMultiselectDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVo(state, info.d()));
    }
}
