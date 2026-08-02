package ru.ozon.app.android.fresh.feature.b2b.domain;

import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryApi;", "", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryRequest;", "body", "Lio/reactivex/y;", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryResponse;", "requestDocsDelivery", "(Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryRequest;)Lio/reactivex/y;", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryAddressRequest;", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryAddressResponse;", "checkDocsDeliveryAddress", "(Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryAddressRequest;)Lio/reactivex/y;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DocsDeliveryApi {
    @POST("composer-api.bx/_action/b2bCheckAddressDocumentsDelivery")
    @NotNull
    y<DocsDeliveryAddressResponse> checkDocsDeliveryAddress(@Body @NotNull DocsDeliveryAddressRequest body);

    @POST("composer-api.bx/_action/b2bAccompanyingDocumentsDelivery")
    @NotNull
    y<DocsDeliveryResponse> requestDocsDelivery(@Body @NotNull DocsDeliveryRequest body);
}
