package ru.ozon.mapsdk.common.geoproxy.data.model;

import J8.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/GeocodeResponse;", "", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/mapsdk/common/geoproxy/data/model/AddressResponse;", "displayAddressValue", "", "trustCoord", "", "<init>", "(Lru/ozon/mapsdk/common/geoproxy/data/model/AddressResponse;Ljava/lang/String;Z)V", "getAddress", "()Lru/ozon/mapsdk/common/geoproxy/data/model/AddressResponse;", "getDisplayAddressValue", "()Ljava/lang/String;", "getTrustCoord", "()Z", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GeocodeResponse {

    @b(FormPageDTO.Field.FIELD_TYPE_ADDRESS)
    @NotNull
    private final AddressResponse address;

    @b("displayAddressValue")
    private final String displayAddressValue;

    @b("trustCoord")
    private final boolean trustCoord;

    public GeocodeResponse(@NotNull AddressResponse address, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.address = address;
        this.displayAddressValue = str;
        this.trustCoord = z11;
    }

    @NotNull
    public final AddressResponse getAddress() {
        return this.address;
    }

    public final String getDisplayAddressValue() {
        return this.displayAddressValue;
    }

    public final boolean getTrustCoord() {
        return this.trustCoord;
    }
}
