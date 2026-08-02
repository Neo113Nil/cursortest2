package ru.ozon.app.android.marketing.domain;

import C.C2702w;
import Pk0.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/marketing/domain/ChangeSettingRequest;", "", "settingId", "", "commId", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(JJJ)V", "getSettingId", "()J", "getCommId", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChangeSettingRequest {
    public static final int $stable = 0;
    private final long commId;
    private final long settingId;
    private final long value;

    public ChangeSettingRequest(@i(name = "ns_type") long j11, @i(name = "comm_type") long j12, long j13) {
        this.settingId = j11;
        this.commId = j12;
        this.value = j13;
    }

    public static /* synthetic */ ChangeSettingRequest copy$default(ChangeSettingRequest changeSettingRequest, long j11, long j12, long j13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = changeSettingRequest.settingId;
        }
        long j14 = j11;
        if ((i11 & 2) != 0) {
            j12 = changeSettingRequest.commId;
        }
        long j15 = j12;
        if ((i11 & 4) != 0) {
            j13 = changeSettingRequest.value;
        }
        return changeSettingRequest.copy(j14, j15, j13);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSettingId() {
        return this.settingId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCommId() {
        return this.commId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    @NotNull
    public final ChangeSettingRequest copy(@i(name = "ns_type") long settingId, @i(name = "comm_type") long commId, long value) {
        return new ChangeSettingRequest(settingId, commId, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeSettingRequest)) {
            return false;
        }
        ChangeSettingRequest changeSettingRequest = (ChangeSettingRequest) other;
        return this.settingId == changeSettingRequest.settingId && this.commId == changeSettingRequest.commId && this.value == changeSettingRequest.value;
    }

    public final long getCommId() {
        return this.commId;
    }

    public final long getSettingId() {
        return this.settingId;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.value) + c.a(Long.hashCode(this.settingId) * 31, 31, this.commId);
    }

    @NotNull
    public String toString() {
        long j11 = this.settingId;
        long j12 = this.commId;
        long j13 = this.value;
        StringBuilder d11 = C2702w.d(j11, "ChangeSettingRequest(settingId=", ", commId=");
        d11.append(j12);
        d11.append(", value=");
        d11.append(j13);
        d11.append(")");
        return d11.toString();
    }
}
