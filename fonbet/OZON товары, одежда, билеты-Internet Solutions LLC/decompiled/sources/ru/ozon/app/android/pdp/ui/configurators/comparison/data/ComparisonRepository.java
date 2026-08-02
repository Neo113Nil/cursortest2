package ru.ozon.app.android.pdp.ui.configurators.comparison.data;

import He.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.comparison.AddToComparisonResponse;
import ru.ozon.app.android.comparison.RemoveFromComparisonResponse;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0086@¢\u0006\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonRepository;", "", "Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonApi;", "comparisonApi", "Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonMapper;", "comparisonMapper", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonApi;Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonMapper;)V", "", "", "params", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/comparison/AddToComparisonResponse;", "addToComparison", "(Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/comparison/RemoveFromComparisonResponse;", "removeFromComparison", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "selectedCharacteristics", "", "submitSelectedCharacteristics", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "deleteComparisonList", "Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonApi;", "Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonMapper;", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComparisonRepository {

    @NotNull
    private final ComparisonApi comparisonApi;

    @NotNull
    private final ComparisonMapper comparisonMapper;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonRepository$Companion;", "", "<init>", "()V", "KEYS", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ComparisonRepository(@NotNull ComparisonApi comparisonApi, @NotNull ComparisonMapper comparisonMapper) {
        Intrinsics.checkNotNullParameter(comparisonApi, "comparisonApi");
        Intrinsics.checkNotNullParameter(comparisonMapper, "comparisonMapper");
        this.comparisonApi = comparisonApi;
        this.comparisonMapper = comparisonMapper;
    }

    public final Object addToComparison(@NotNull Map<String, String> map, @NotNull d<? super Result<AddToComparisonResponse>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new ComparisonRepository$addToComparison$$inlined$runCatchingWithDispatchers$default$1(this, null, map), dVar);
    }

    public final Object deleteComparisonList(@NotNull Map<String, String> map, @NotNull d<? super Result<Unit>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new ComparisonRepository$deleteComparisonList$$inlined$runCatchingWithDispatchers$default$1(this, null, map), dVar);
    }

    public final Object removeFromComparison(@NotNull String str, @NotNull d<? super Result<RemoveFromComparisonResponse>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new ComparisonRepository$removeFromComparison$$inlined$runCatchingWithDispatchers$default$1(this, null, str), dVar);
    }

    public final Object submitSelectedCharacteristics(@NotNull List<String> list, @NotNull d<? super Result<Unit>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new ComparisonRepository$submitSelectedCharacteristics$$inlined$runCatchingWithDispatchers$default$1(this, null, list), dVar);
    }
}
