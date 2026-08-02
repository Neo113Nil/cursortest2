package ru.ozon.app.android.checkoutcomposer.addressPartsInput.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.data.api.AddressPartsInputResponse;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JA\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/AddressPartsInputRepository;", "", "", "link", "", "queryMap", "fieldName", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lio/reactivex/y;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/api/AddressPartsInputResponse;", "updateAddressParts", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/y;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AddressPartsInputRepository {
    @NotNull
    y<AddressPartsInputResponse> updateAddressParts(@NotNull String link, @NotNull Map<String, String> queryMap, @NotNull String fieldName, @NotNull String value);
}
