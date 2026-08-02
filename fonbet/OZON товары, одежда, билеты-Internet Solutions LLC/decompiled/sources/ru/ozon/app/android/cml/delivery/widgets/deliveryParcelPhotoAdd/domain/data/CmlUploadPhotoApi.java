package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.data;

import We.D;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import ru.ozon.app.android.network.interceptors.LongPollingAnnotation;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J:\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/CmlUploadPhotoApi;", "", "", "actionName", "LWe/D$c;", "body", "", "params", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO;", "uploadParcelPhoto-2VdDDuI", "(Ljava/lang/String;LWe/D$c;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "uploadParcelPhoto", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CmlUploadPhotoApi {
    @LongPollingAnnotation
    @POST("composer-api.bx/_action/{actionName}")
    @Multipart
    /* renamed from: uploadParcelPhoto-2VdDDuI, reason: not valid java name */
    Object m597uploadParcelPhoto2VdDDuI(@Path("actionName") @NotNull String str, @NotNull @Part D.c cVar, @NotNull @PartMap Map<String, String> map, @NotNull d<? super AttachedPhotoDTO> dVar);
}
