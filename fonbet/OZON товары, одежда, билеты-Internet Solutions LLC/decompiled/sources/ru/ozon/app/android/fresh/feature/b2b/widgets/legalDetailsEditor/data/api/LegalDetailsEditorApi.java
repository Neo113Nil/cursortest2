package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api;

import We.D;
import We.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import ru.ozon.app.android.network.interceptors.LongPollingAnnotation;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/LegalDetailsEditorApi;", "", "", "", "params", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/LegalDetailsEditorResponseDTO;", "sendAllEdit", "(Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LWe/K;", "documentType", "LWe/D$c;", "file", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO;", "loadDocument", "(LWe/K;LWe/D$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface LegalDetailsEditorApi {
    @LongPollingAnnotation
    @POST("composer-api.bx/_action/b2bUploadFileByType")
    @Multipart
    Object loadDocument(@NotNull @Part("typeId") K k11, @NotNull @Part D.c cVar, @NotNull d<? super SingleDocumentResponseDTO> dVar);

    @POST("composer-api.bx/_action/b2bChangingCompanyDetails")
    Object sendAllEdit(@Body @NotNull Map<String, String> map, @NotNull d<? super LegalDetailsEditorResponseDTO> dVar);
}
