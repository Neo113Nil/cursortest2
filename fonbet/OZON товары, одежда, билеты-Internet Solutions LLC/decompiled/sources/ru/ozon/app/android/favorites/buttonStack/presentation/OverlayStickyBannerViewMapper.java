package ru.ozon.app.android.favorites.buttonStack.presentation;

import Vg.d;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.favorites.buttonStack.data.ButtonStackDTO;
import ru.ozon.app.android.favorites.buttonStack.di.ButtonStackWidgetComponent;
import ru.ozon.app.android.favorites.buttonStack.presentation.OverlayStickyBannerViewMapper;
import ru.ozon.app.android.favorites.ui.wishlists.DeleteWishlistViewModel;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001bj\b\u0012\u0004\u0012\u00020\u0002`\u001c2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/favorites/buttonStack/presentation/OverlayStickyBannerViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/favorites/buttonStack/di/ButtonStackWidgetComponent;", "Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO;", "Lru/ozon/app/android/favorites/buttonStack/presentation/ButtonStackVO;", "<init>", "()V", "dto", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OverlayStickyBannerViewMapper extends OverlayWidgetScreenViewItemMapper2<ButtonStackWidgetComponent, ButtonStackDTO, ButtonStackVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Context context = it.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonStackViewV2 buttonStackViewV2 = new ButtonStackViewV2(context, null, 0, 6, null);
        buttonStackViewV2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return buttonStackViewV2;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof ButtonStackDTO) && Intrinsics.d(((ButtonStackDTO) state).isSticky(), Boolean.TRUE);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ButtonStackVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        d customActionHandlersStoreFactory = component().getCustomActionHandlersStoreFactory();
        w0 a11 = new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.favorites.buttonStack.presentation.OverlayStickyBannerViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                DeleteWishlistViewModel deleteWishlistViewModel = OverlayStickyBannerViewMapper.this.component().getDeleteWishlistViewModelProvider().get();
                Intrinsics.g(deleteWishlistViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return deleteWishlistViewModel;
            }
        }).a(DeleteWishlistViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        DeleteWishlistViewModel deleteWishlistViewModel = (DeleteWishlistViewModel) a11;
        ComposerNavigator navigator = component().getNavigator();
        return new OverlayStickyBannerViewHolder(new InterfaceC6068e() { // from class: Ws.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$2;
                createHolder$lambda$2 = OverlayStickyBannerViewMapper.createHolder$lambda$2((LinearLayout) viewGroup);
                return createHolder$lambda$2;
            }
        }, customActionHandlersStoreFactory, container, container.M(), deleteWishlistViewModel, navigator);
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ButtonStackWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ButtonStackWidgetComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ButtonStackVO> map(@NotNull ButtonStackDTO dto, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        ButtonV3DTO leftButton = dto.getLeftButton();
        ButtonV3DTO rightButton = dto.getRightButton();
        List<IconButtonV3DTO> additionalButtons = dto.getAdditionalButtons();
        return C7714v.a0(new ButtonStackVO(hashCode, leftButton, rightButton, additionalButtons != null ? (IconButtonV3DTO) C7714v.M(additionalButtons) : null, dto.isSticky(), dto.getPaddings()));
    }
}
