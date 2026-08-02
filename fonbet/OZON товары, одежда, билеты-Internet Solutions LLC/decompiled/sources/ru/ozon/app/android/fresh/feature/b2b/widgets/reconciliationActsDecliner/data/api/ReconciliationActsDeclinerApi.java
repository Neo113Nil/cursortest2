package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.api;

import We.D;
import We.K;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api.SingleDocumentResponseDTO;
import ru.ozon.app.android.network.interceptors.LongPollingAnnotation;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/ReconciliationActsDeclinerApi;", "", "LWe/K;", "documentType", "LWe/D$c;", "file", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO;", "loadDocument", "(LWe/K;LWe/D$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "actionName", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/RejectReconciliationActRequestDTO;", "request", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/RejectReconciliationActResponseDTO;", "rejectReconciliationAct", "(Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/RejectReconciliationActRequestDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ReconciliationActsDeclinerApi {
    @LongPollingAnnotation
    @POST("composer-api.bx/_action/b2bUploadFileByType")
    @Multipart
    Object loadDocument(@NotNull @Part("typeId") K k11, @NotNull @Part D.c cVar, @NotNull d<? super SingleDocumentResponseDTO> dVar);

    @POST("composer-api.bx/_action/{actionName}")
    Object rejectReconciliationAct(@Path("actionName") @NotNull String str, @Body @NotNull RejectReconciliationActRequestDTO rejectReconciliationActRequestDTO, @NotNull d<? super RejectReconciliationActResponseDTO> dVar);
}
