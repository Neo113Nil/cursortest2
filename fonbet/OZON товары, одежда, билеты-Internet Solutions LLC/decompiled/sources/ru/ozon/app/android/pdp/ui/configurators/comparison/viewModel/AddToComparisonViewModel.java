package ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import androidx.lifecycle.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.comparison.AddToComparisonResponse;
import ru.ozon.app.android.comparison.RemoveFromComparisonResponse;
import ru.ozon.app.android.pdp.ui.configurators.comparison.data.ComparisonRepository;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/AddToComparisonViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonRepository;", "comparisonRepository", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonRepository;)V", "", "", "params", "LAe/h;", "Lru/ozon/app/android/comparison/AddToComparisonResponse;", "addToComparison", "(Ljava/util/Map;)LAe/h;", "Lru/ozon/app/android/comparison/RemoveFromComparisonResponse;", "removeFromComparison", "(Ljava/lang/String;)LAe/h;", "encodeData", "", "deleteComparisonList", "Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonRepository;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddToComparisonViewModel extends w0 {

    @NotNull
    private final ComparisonRepository comparisonRepository;

    public AddToComparisonViewModel(@NotNull ComparisonRepository comparisonRepository) {
        Intrinsics.checkNotNullParameter(comparisonRepository, "comparisonRepository");
        this.comparisonRepository = comparisonRepository;
    }

    @NotNull
    public final InterfaceC2395h<AddToComparisonResponse> addToComparison(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return C2399j.A(new AddToComparisonViewModel$addToComparison$1(this, params, null));
    }

    @NotNull
    public final InterfaceC2395h<Unit> deleteComparisonList(@NotNull String encodeData) {
        Intrinsics.checkNotNullParameter(encodeData, "encodeData");
        return C2399j.A(new AddToComparisonViewModel$deleteComparisonList$1(this, encodeData, null));
    }

    @NotNull
    public final InterfaceC2395h<RemoveFromComparisonResponse> removeFromComparison(@NotNull String params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return C2399j.A(new AddToComparisonViewModel$removeFromComparison$1(this, params, null));
    }
}
