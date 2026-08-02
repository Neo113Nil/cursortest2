package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.fresh.cart.R$layout;
import ru.ozon.app.android.fresh.cart.databinding.WidgetStickyTotalBinding;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.data.StickyTotalDTO;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.di.StickyTotalComponent;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalMapper;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalStateUpdate;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalVO;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp.StickyTotalPDPViewMapper;
import ru.ozon.app.android.fresh.common.flags.StickyTotalPDPCounterRefactoring;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\b\u001a\u00020\u00032\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001b2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/pdp/StickyTotalPDPViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/di/StickyTotalComponent;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalStateUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StickyTotalPDPViewMapper extends OverlayWidgetScreenViewItemMapper2<StickyTotalComponent, StickyTotalDTO, StickyTotalVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<StickyTotalStateUpdate>> supportedUpdates = C7714v.a0(StickyTotalStateUpdate.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(WidgetStickyTotalBinding widgetStickyTotalBinding, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FrameLayout constraintLayout = widgetStickyTotalBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return component().getFeatureChecker().isEnabled(StickyTotalPDPCounterRefactoring.INSTANCE) && (state instanceof StickyTotalDTO) && StickyTotalMapper.INSTANCE.getStickyTotalTypeFromDTO((StickyTotalDTO) state) == StickyTotalVO.Type.PDP;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<StickyTotalVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        final WidgetStickyTotalBinding bind = WidgetStickyTotalBinding.bind(ViewGroupExtKt.inflate(container.Z(), R$layout.widget_sticky_total));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        w0 a11 = new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp.StickyTotalPDPViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                StickyTotalPDPViewModel stickyTotalPDPViewModel = StickyTotalPDPViewMapper.this.component().getViewModelPDPProvider().get();
                Intrinsics.g(stickyTotalPDPViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return stickyTotalPDPViewModel;
            }
        }).a(StickyTotalPDPViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "createViewModel(...)");
        StickyTotalPDPViewModel stickyTotalPDPViewModel = (StickyTotalPDPViewModel) a11;
        w0 a12 = new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp.StickyTotalPDPViewMapper$createHolder$$inlined$createViewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TotalVisibilityViewModel totalVisibilityViewModel = StickyTotalPDPViewMapper.this.component().getCartTotalVisibilityViewModelProvider().get();
                Intrinsics.g(totalVisibilityViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return totalVisibilityViewModel;
            }
        }).a(TotalVisibilityViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "createViewModel(...)");
        return new StickyTotalPDPViewHolder(container, bind, stickyTotalPDPViewModel, (TotalVisibilityViewModel) a12, component().getCustomActionHandlersStoreFactory(), new InterfaceC6068e() { // from class: Qt.b
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$2;
                createHolder$lambda$2 = StickyTotalPDPViewMapper.createHolder$lambda$2(WidgetStickyTotalBinding.this, (LinearLayout) viewGroup);
                return createHolder$lambda$2;
            }
        });
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<StickyTotalStateUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<StickyTotalComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return StickyTotalComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<StickyTotalVO> map(@NotNull StickyTotalDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
