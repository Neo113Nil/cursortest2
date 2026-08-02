package ru.ozon.app.android.pdp.ui.configurators.comparison;

import Ae.B0;
import Ae.C2399j;
import Ae.E0;
import Ae.w0;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.comparison.Refresh;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/comparison/RefreshObject;", "", "<init>", "()V", "LAe/B0;", "Lru/ozon/app/android/pdp/ui/configurators/comparison/Refresh;", "observeRefreshState", "()LAe/B0;", "", "sku", "", "isInComparison", "", "setRefreshComparisonState", "(Ljava/lang/Long;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/w0;", "sharedFlow", "LAe/w0;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RefreshObject {

    @NotNull
    public static final RefreshObject INSTANCE = new RefreshObject();

    @NotNull
    private static final w0<Refresh> sharedFlow = E0.b(0, 0, null, 7);
    public static final int $stable = 8;

    private RefreshObject() {
    }

    @NotNull
    public final B0<Refresh> observeRefreshState() {
        return C2399j.a(sharedFlow);
    }

    public final Object setRefreshComparisonState(Long l11, boolean z11, @NotNull d<? super Unit> dVar) {
        Object emit = sharedFlow.emit(new Refresh.ComparisonDiff(l11, z11), dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }
}
