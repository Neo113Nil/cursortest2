package ru.ozon.app.android.cart.installment.presentation;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.cart.flags.CartInstallmentComposeUiEnabler;
import ru.ozon.app.android.cart.installment.data.InstallmentDTO;
import ru.ozon.app.android.cart.installment.data.InstallmentMapper;
import ru.ozon.app.android.cart.installment.di.InstallmentComponent;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/cart/installment/presentation/InstallmentViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/cart/installment/di/InstallmentComponent;", "Lru/ozon/app/android/cart/installment/data/InstallmentDTO;", "Lru/ozon/app/android/cart/installment/presentation/InstallmentVO;", "<init>", "()V", "Ll10/i;", "container", "Lru/ozon/app/android/cart/installment/presentation/InstallmentViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/cart/installment/presentation/InstallmentViewHolder;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/cart/installment/data/InstallmentDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/cart/installment/data/InstallmentMapper;", "getMapper", "()Lru/ozon/app/android/cart/installment/data/InstallmentMapper;", "mapper", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InstallmentViewMapper extends OverlayWidgetScreenViewItemMapper2<InstallmentComponent, InstallmentDTO, InstallmentVO> {
    private final InstallmentMapper getMapper() {
        return component().getMapper();
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return !component().getFeatureChecker().isEnabled(CartInstallmentComposeUiEnabler.INSTANCE);
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<InstallmentComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return InstallmentComponent.INSTANCE.create(storage);
    }

    @Override // c20.r
    @NotNull
    public InstallmentViewHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new InstallmentViewHolder((TotalVisibilityViewModel) new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.cart.installment.presentation.InstallmentViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TotalVisibilityViewModel totalVisibilityViewModel = InstallmentViewMapper.this.component().getTotalVisibilityViewModel();
                Intrinsics.g(totalVisibilityViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return totalVisibilityViewModel;
            }
        }).a(TotalVisibilityViewModel.class), container, component().getCustomActionHandlersStoreFactory(), new InstallmentViewMapper$createHolder$2(container));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<InstallmentVO> map(@NotNull InstallmentDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
