package ru.ozon.app.android.checkoutcomposer.totalV3.progressBar;

import android.content.Context;
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
import ru.ozon.app.android.checkoutcomposer.totalV3.di.TotalV3WidgetComponent;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarViewMapper;", "Lc20/r;", "Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarDTO;", "Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarVO;", "Lru/ozon/app/android/checkoutcomposer/totalV3/di/TotalV3WidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/totalV3/di/TotalV3WidgetComponent;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/totalV3/di/TotalV3WidgetComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProgressBarViewMapper extends r<ProgressBarDTO, ProgressBarVO> {

    @NotNull
    private final TotalV3WidgetComponent component;

    @NotNull
    private final r.a viewType;

    public ProgressBarViewMapper(@NotNull TotalV3WidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ProgressBarDTO;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ProgressBarVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        return new ProgressBarViewHolder(new ProgressBarView(L11, null, 0, 6, null), container, (CreateAndPayViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.totalV3.progressBar.ProgressBarViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TotalV3WidgetComponent totalV3WidgetComponent;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                totalV3WidgetComponent = ProgressBarViewMapper.this.component;
                CreateAndPayViewModel createAndPayViewModel = totalV3WidgetComponent.getCreateAndPayViewModel();
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
    public List<ProgressBarVO> map(@NotNull ProgressBarDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.c0(ProgressBarMapperKt.toVO(state, info));
    }
}
