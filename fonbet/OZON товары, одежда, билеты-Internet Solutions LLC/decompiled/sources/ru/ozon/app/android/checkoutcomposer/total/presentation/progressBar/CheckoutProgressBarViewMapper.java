package ru.ozon.app.android.checkoutcomposer.total.presentation.progressBar;

import android.view.LayoutInflater;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.databinding.HighloadProgressBarBinding;
import ru.ozon.app.android.checkoutcomposer.total.TotalMappersKt;
import ru.ozon.app.android.checkoutcomposer.total.di.TotalWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.total.models.CheckoutProgressBarVO;
import ru.ozon.app.android.checkoutcomposer.total.models.TotalDTO;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/presentation/progressBar/CheckoutProgressBarViewMapper;", "Lc20/r;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$ProgressBar;", "Lru/ozon/app/android/checkoutcomposer/total/models/CheckoutProgressBarVO;", "Lru/ozon/app/android/checkoutcomposer/total/di/TotalWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/total/di/TotalWidgetComponent;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$ProgressBar;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/total/di/TotalWidgetComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckoutProgressBarViewMapper extends r<TotalDTO.ProgressBar, CheckoutProgressBarVO> {

    @NotNull
    private final TotalWidgetComponent component;

    @NotNull
    private final r.a viewType;

    public CheckoutProgressBarViewMapper(@NotNull TotalWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof TotalDTO.ProgressBar;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<CheckoutProgressBarVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        HighloadProgressBarBinding inflate = HighloadProgressBarBinding.inflate(LayoutInflater.from(container.L()), container.Z(), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new CheckoutProgressBarViewHolder(inflate, container, (CreateAndPayViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.total.presentation.progressBar.CheckoutProgressBarViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TotalWidgetComponent totalWidgetComponent;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                totalWidgetComponent = CheckoutProgressBarViewMapper.this.component;
                CreateAndPayViewModel createAndPayViewModel = totalWidgetComponent.getCreateAndPayViewModel();
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

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CheckoutProgressBarVO> map(@NotNull TotalDTO.ProgressBar state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.c0(TotalMappersKt.toVO(state, info.d()));
    }
}
