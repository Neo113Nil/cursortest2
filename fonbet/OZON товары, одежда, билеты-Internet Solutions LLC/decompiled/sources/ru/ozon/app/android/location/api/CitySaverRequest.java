package ru.ozon.app.android.location.api;

import B0.A0;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/location/api/CitySaverRequest;", "", "addressUid", "", "<init>", "(Ljava/lang/String;)V", "getAddressUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "location_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CitySaverRequest {

    @NotNull
    private final String addressUid;

    public CitySaverRequest(@i(name = "address_uid") @NotNull String addressUid) {
        Intrinsics.checkNotNullParameter(addressUid, "addressUid");
        this.addressUid = addressUid;
    }

    public static /* synthetic */ CitySaverRequest copy$default(CitySaverRequest citySaverRequest, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = citySaverRequest.addressUid;
        }
        return citySaverRequest.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAddressUid() {
        return this.addressUid;
    }

    @NotNull
    public final CitySaverRequest copy(@i(name = "address_uid") @NotNull String addressUid) {
        Intrinsics.checkNotNullParameter(addressUid, "addressUid");
        return new CitySaverRequest(addressUid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CitySaverRequest) && Intrinsics.d(this.addressUid, ((CitySaverRequest) other).addressUid);
    }

    @NotNull
    public final String getAddressUid() {
        return this.addressUid;
    }

    public int hashCode() {
        return this.addressUid.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("CitySaverRequest(addressUid=", this.addressUid, ")");
    }
}
