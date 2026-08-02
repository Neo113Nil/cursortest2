package ru.ozon.app.android.checkoutcomposer.addressPartsInput.data;

import B0.C2454a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.data.api.AddressPartsInputApi;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.data.api.AddressPartsInputRequest;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.data.api.AddressPartsInputResponse;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/AddressPartsInputRepositoryImpl;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/AddressPartsInputRepository;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/api/AddressPartsInputApi;", "api", "<init>", "(Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/api/AddressPartsInputApi;)V", "", "link", "", "queryMap", "fieldName", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lio/reactivex/y;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/api/AddressPartsInputResponse;", "updateAddressParts", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/y;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/api/AddressPartsInputApi;", "getApi", "()Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/api/AddressPartsInputApi;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressPartsInputRepositoryImpl implements AddressPartsInputRepository {

    @NotNull
    private final AddressPartsInputApi api;

    public AddressPartsInputRepositoryImpl(@NotNull AddressPartsInputApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.addressPartsInput.data.AddressPartsInputRepository
    @NotNull
    public y<AddressPartsInputResponse> updateAddressParts(@NotNull String link, @NotNull Map<String, String> queryMap, @NotNull String fieldName, @NotNull String value) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(queryMap, "queryMap");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.api.updateAddressParts(link, queryMap, new AddressPartsInputRequest(C2454a.b(fieldName, value)));
    }
}
