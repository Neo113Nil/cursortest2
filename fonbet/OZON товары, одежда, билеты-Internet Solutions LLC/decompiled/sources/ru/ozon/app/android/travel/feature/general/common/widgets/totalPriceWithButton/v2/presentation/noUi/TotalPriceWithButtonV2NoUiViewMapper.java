package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.noUi;

import a00.j;
import androidx.lifecycle.w0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l10.v;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.data.TotalPriceWithButtonV2DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.di.TotalPriceWithButtonV2Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2ViewModel;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/noUi/TotalPriceWithButtonV2NoUiViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2DTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/noUi/TotalPriceWithButtonV2TimerVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/di/TotalPriceWithButtonV2Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/di/TotalPriceWithButtonV2Component;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/di/TotalPriceWithButtonV2Component;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TotalPriceWithButtonV2NoUiViewMapper extends r<TotalPriceWithButtonV2DTO, TotalPriceWithButtonV2TimerVO> {

    @NotNull
    private final TotalPriceWithButtonV2Component component;

    @NotNull
    private final r.a viewType;

    public TotalPriceWithButtonV2NoUiViewMapper(@NotNull TotalPriceWithButtonV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof TotalPriceWithButtonV2DTO) && ((TotalPriceWithButtonV2DTO) state).getCountdownTime() != null;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<TotalPriceWithButtonV2TimerVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        v b02 = container.b0();
        final TotalPriceWithButtonV2Component totalPriceWithButtonV2Component = this.component;
        return new TotalPriceWithButtonV2NoUiWidgetViewHolder((TotalPriceWithButtonV2ViewModel) ((w0) j.a(b02.a(), N.b(TotalPriceWithButtonV2ViewModel.class), new C(totalPriceWithButtonV2Component) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.noUi.TotalPriceWithButtonV2NoUiViewMapper$createHolder$1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                return ((TotalPriceWithButtonV2Component) this.receiver).getWidgetViewModel();
            }
        }).getValue()));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<TotalPriceWithButtonV2TimerVO> map(@NotNull TotalPriceWithButtonV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getTimerMapper().invoke(state, info);
    }
}
