package ru.ozon.app.android.pdp.ui.configurators.comparison.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import ru.ozon.app.android.comparison.AddToComparisonResponse;
import ru.ozon.app.android.comparison.RemoveFromComparisonResponse;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0003H§@¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u000e\u001a\u00020\r2\u001a\b\u0001\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f0\u0002H§@¢\u0006\u0004\b\u000e\u0010\bJ&\u0010\u000f\u001a\u00020\r2\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonApi;", "", "", "", "", "params", "Lru/ozon/app/android/comparison/AddToComparisonResponse;", "addToComparison", "(Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/comparison/RemoveFromComparisonResponse;", "removeFromComparison", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "", "addKeyCharacteristics", "deleteComparisonList", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ComparisonApi {
    @POST("composer-api.bx/_action/compareApiAddKeyCharacteristicsV1")
    Object addKeyCharacteristics(@Body @NotNull Map<String, List<String>> map, @NotNull d<Unit> dVar);

    @POST("composer-api.bx/_action/compareApiAddToCompareV2")
    Object addToComparison(@Body @NotNull Map<String, Long> map, @NotNull d<? super AddToComparisonResponse> dVar);

    @POST("composer-api.bx/_action/compareApiRemoveSkusFromCompareV1")
    Object deleteComparisonList(@Body @NotNull Map<String, String> map, @NotNull d<? super Unit> dVar);

    @POST("composer-api.bx/_action/compareApiRemoveFromCompareV2")
    Object removeFromComparison(@Body @NotNull String str, @NotNull d<? super RemoveFromComparisonResponse> dVar);
}
