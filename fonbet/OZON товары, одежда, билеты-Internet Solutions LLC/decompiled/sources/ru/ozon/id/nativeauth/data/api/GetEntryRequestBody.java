package ru.ozon.id.nativeauth.data.api;

import Ak.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/id/nativeauth/data/api/GetEntryRequestBody;", "", "deviceId", "", "supportCountrySelect", "", "<init>", "(Ljava/lang/String;Z)V", "getDeviceId", "()Ljava/lang/String;", "getSupportCountrySelect", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetEntryRequestBody {

    @NotNull
    private final String deviceId;
    private final boolean supportCountrySelect;

    public GetEntryRequestBody(@NotNull String deviceId, boolean z11) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.deviceId = deviceId;
        this.supportCountrySelect = z11;
    }

    public static /* synthetic */ GetEntryRequestBody copy$default(GetEntryRequestBody getEntryRequestBody, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = getEntryRequestBody.deviceId;
        }
        if ((i11 & 2) != 0) {
            z11 = getEntryRequestBody.supportCountrySelect;
        }
        return getEntryRequestBody.copy(str, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSupportCountrySelect() {
        return this.supportCountrySelect;
    }

    @NotNull
    public final GetEntryRequestBody copy(@NotNull String deviceId, boolean supportCountrySelect) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return new GetEntryRequestBody(deviceId, supportCountrySelect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetEntryRequestBody)) {
            return false;
        }
        GetEntryRequestBody getEntryRequestBody = (GetEntryRequestBody) other;
        return Intrinsics.d(this.deviceId, getEntryRequestBody.deviceId) && this.supportCountrySelect == getEntryRequestBody.supportCountrySelect;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final boolean getSupportCountrySelect() {
        return this.supportCountrySelect;
    }

    public int hashCode() {
        return Boolean.hashCode(this.supportCountrySelect) + (this.deviceId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return b.f("GetEntryRequestBody(deviceId=", this.deviceId, ", supportCountrySelect=", ")", this.supportCountrySelect);
    }

    public /* synthetic */ GetEntryRequestBody(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? true : z11);
    }
}
