package ru.ozon.app.android.fresh.feature.b2b.domain;

import Sc.InterfaceC4008j;
import Sc.k;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0017\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryRepository;", "", "Lretrofit2/Retrofit;", "retrofit", "<init>", "(Lretrofit2/Retrofit;)V", "", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lio/reactivex/y;", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryAddressResponse;", "checkDocsDeliveryAddress", "(Ljava/lang/String;)Lio/reactivex/y;", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryRequest;", "docsDeliveryRequest", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryResponse;", "requestDocsDelivery", "(Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryRequest;)Lio/reactivex/y;", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryApi;", "kotlin.jvm.PlatformType", "api$delegate", "LSc/j;", "getApi", "()Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryApi;", "api", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DocsDeliveryRepository {

    /* renamed from: api$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j api;

    public DocsDeliveryRepository(@NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.api = k.b(new DocsDeliveryRepository$api$2(retrofit));
    }

    private final DocsDeliveryApi getApi() {
        return (DocsDeliveryApi) this.api.getValue();
    }

    @NotNull
    public final y<DocsDeliveryAddressResponse> checkDocsDeliveryAddress(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return getApi().checkDocsDeliveryAddress(new DocsDeliveryAddressRequest(address));
    }

    @NotNull
    public final y<DocsDeliveryResponse> requestDocsDelivery(@NotNull DocsDeliveryRequest docsDeliveryRequest) {
        Intrinsics.checkNotNullParameter(docsDeliveryRequest, "docsDeliveryRequest");
        return getApi().requestDocsDelivery(docsDeliveryRequest);
    }
}
