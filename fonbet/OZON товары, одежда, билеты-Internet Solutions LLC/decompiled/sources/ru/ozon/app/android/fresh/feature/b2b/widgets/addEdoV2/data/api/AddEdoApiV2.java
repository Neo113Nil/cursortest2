package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.api;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/api/AddEdoApiV2;", "", "", "actionName", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/api/AddEdoRequestV2;", "request", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/api/AddEdoResponseV2;", "addEdo", "(Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/api/AddEdoRequestV2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AddEdoApiV2 {
    @POST("composer-api.bx/_action/{actionName}")
    Object addEdo(@Path("actionName") @NotNull String str, @Body @NotNull AddEdoRequestV2 addEdoRequestV2, @NotNull d<? super AddEdoResponseV2> dVar);
}
