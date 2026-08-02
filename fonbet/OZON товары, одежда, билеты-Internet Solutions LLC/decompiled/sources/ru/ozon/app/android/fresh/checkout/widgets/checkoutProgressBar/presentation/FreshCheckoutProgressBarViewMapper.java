package ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation;

import android.view.LayoutInflater;
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
import ru.ozon.app.android.fresh.checkout.databinding.FreshHighloadProgressBarBinding;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.data.FreshProgressBarDTO;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.di.FreshCheckoutProgressBarWidgetComponent;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshCheckoutProgressBarViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/di/FreshCheckoutProgressBarWidgetComponent;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/data/FreshProgressBarDTO;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshProgressBarVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/data/FreshProgressBarDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshCheckoutProgressBarViewMapper extends OverlayWidgetScreenViewItemMapper2<FreshCheckoutProgressBarWidgetComponent, FreshProgressBarDTO, FreshProgressBarVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof FreshProgressBarDTO;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<FreshProgressBarVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        FreshHighloadProgressBarBinding inflate = FreshHighloadProgressBarBinding.inflate(LayoutInflater.from(container.L()), container.Z(), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new FreshCheckoutProgressBarViewHolder(inflate, container, (CreateAndPayViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation.FreshCheckoutProgressBarViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CreateAndPayViewModel createAndPayViewModel = FreshCheckoutProgressBarViewMapper.this.component().getCreateAndPayViewModel();
                Intrinsics.g(createAndPayViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return createAndPayViewModel;
            }
        }).a(CreateAndPayViewModel.class));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<FreshCheckoutProgressBarWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return FreshCheckoutProgressBarWidgetComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<FreshProgressBarVO> map(@NotNull FreshProgressBarDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.c0(FreshCheckoutProgressBarMapperKt.toVO(state, info.d()));
    }
}
