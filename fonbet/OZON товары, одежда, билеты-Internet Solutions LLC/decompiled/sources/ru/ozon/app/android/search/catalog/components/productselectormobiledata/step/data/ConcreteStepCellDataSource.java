package ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.data;

import BF.b;
import Mc.a;
import Nc.C3667a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.p;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\b\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\n0\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/data/ConcreteStepCellDataSource;", "", "<init>", "()V", "Lio/reactivex/p;", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "kotlin.jvm.PlatformType", "subscribeCells", "()Lio/reactivex/p;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "setFilterValue", "(Ljava/lang/String;)V", "cells", "setCells", "(Ljava/util/List;)V", "LNc/a;", "filterSubject", "LNc/a;", "Ljava/util/List;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ConcreteStepCellDataSource {

    @NotNull
    private List<? extends AtomDTO> cells;

    @NotNull
    private final C3667a<String> filterSubject;

    public ConcreteStepCellDataSource() {
        C3667a<String> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.filterSubject = d11;
        this.cells = K.f71697a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List subscribeCells$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (List) function1.invoke(p02);
    }

    public final void setCells(@NotNull List<? extends AtomDTO> cells) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.cells = cells;
        C3667a<String> c3667a = this.filterSubject;
        String f7 = c3667a.f();
        if (f7 == null) {
            f7 = "";
        }
        c3667a.onNext(f7);
    }

    public final void setFilterValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.filterSubject.onNext(value);
    }

    public final p<List<AtomDTO>> subscribeCells() {
        return this.filterSubject.debounce(300L, TimeUnit.MILLISECONDS).observeOn(a.b()).map(new b(new ConcreteStepCellDataSource$subscribeCells$1(this), 7));
    }
}
