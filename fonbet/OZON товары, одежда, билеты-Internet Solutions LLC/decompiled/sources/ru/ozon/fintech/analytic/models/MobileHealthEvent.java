package ru.ozon.fintech.analytic.models;

import E0.C2942q;
import G.g;
import N3.C3660k;
import Pk0.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\t\u00106\u001a\u00020\fHÆ\u0003J\t\u00107\u001a\u00020\u000eHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0095\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006D"}, d2 = {"Lru/ozon/fintech/analytic/models/MobileHealthEvent;", "", "domain", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "clazz", "deviceTimestamp", "", "ozonId", "applicationInfo", "Lru/ozon/fintech/analytic/models/HealthApplicationInfo;", "deviceInfo", "Lru/ozon/fintech/analytic/models/HealthDeviceInfo;", "runInfo", "Lru/ozon/fintech/analytic/models/HealthRunInfo;", "accessibilityInfo", "Lru/ozon/fintech/analytic/models/HealthAccessibilityInfo;", "data", "Lru/ozon/fintech/analytic/models/HealthData;", "code", "networkInfo", "Lru/ozon/fintech/analytic/models/HealthNetworkInfo;", "screenInfo", "Lru/ozon/fintech/analytic/models/HealthScreenInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLru/ozon/fintech/analytic/models/HealthApplicationInfo;Lru/ozon/fintech/analytic/models/HealthDeviceInfo;Lru/ozon/fintech/analytic/models/HealthRunInfo;Lru/ozon/fintech/analytic/models/HealthAccessibilityInfo;Lru/ozon/fintech/analytic/models/HealthData;Ljava/lang/String;Lru/ozon/fintech/analytic/models/HealthNetworkInfo;Lru/ozon/fintech/analytic/models/HealthScreenInfo;)V", "getDomain", "()Ljava/lang/String;", "getName", "getClazz", "getDeviceTimestamp", "()J", "getOzonId", "getApplicationInfo", "()Lru/ozon/fintech/analytic/models/HealthApplicationInfo;", "getDeviceInfo", "()Lru/ozon/fintech/analytic/models/HealthDeviceInfo;", "getRunInfo", "()Lru/ozon/fintech/analytic/models/HealthRunInfo;", "getAccessibilityInfo", "()Lru/ozon/fintech/analytic/models/HealthAccessibilityInfo;", "getData", "()Lru/ozon/fintech/analytic/models/HealthData;", "getCode", "getNetworkInfo", "()Lru/ozon/fintech/analytic/models/HealthNetworkInfo;", "getScreenInfo", "()Lru/ozon/fintech/analytic/models/HealthScreenInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MobileHealthEvent {

    @i(name = "accessibility_info")
    private final HealthAccessibilityInfo accessibilityInfo;

    @i(name = "application_info")
    @NotNull
    private final HealthApplicationInfo applicationInfo;

    @i(name = "class")
    @NotNull
    private final String clazz;

    @i(name = "code")
    private final String code;

    @i(name = "data")
    private final HealthData data;

    @i(name = "device_info")
    @NotNull
    private final HealthDeviceInfo deviceInfo;

    @i(name = "device_timestamp")
    private final long deviceTimestamp;

    @i(name = "domain")
    @NotNull
    private final String domain;

    @i(name = AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @i(name = "network_info")
    private final HealthNetworkInfo networkInfo;

    @i(name = "ozon_id")
    private final long ozonId;

    @i(name = "run_info")
    @NotNull
    private final HealthRunInfo runInfo;

    @i(name = "screen_info")
    private final HealthScreenInfo screenInfo;

    public MobileHealthEvent(@NotNull String domain, @NotNull String name, @NotNull String clazz, long j11, long j12, @NotNull HealthApplicationInfo applicationInfo, @NotNull HealthDeviceInfo deviceInfo, @NotNull HealthRunInfo runInfo, HealthAccessibilityInfo healthAccessibilityInfo, HealthData healthData, String str, HealthNetworkInfo healthNetworkInfo, HealthScreenInfo healthScreenInfo) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(runInfo, "runInfo");
        this.domain = domain;
        this.name = name;
        this.clazz = clazz;
        this.deviceTimestamp = j11;
        this.ozonId = j12;
        this.applicationInfo = applicationInfo;
        this.deviceInfo = deviceInfo;
        this.runInfo = runInfo;
        this.accessibilityInfo = healthAccessibilityInfo;
        this.data = healthData;
        this.code = str;
        this.networkInfo = healthNetworkInfo;
        this.screenInfo = healthScreenInfo;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    /* renamed from: component10, reason: from getter */
    public final HealthData getData() {
        return this.data;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component12, reason: from getter */
    public final HealthNetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final HealthScreenInfo getScreenInfo() {
        return this.screenInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getClazz() {
        return this.clazz;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDeviceTimestamp() {
        return this.deviceTimestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final long getOzonId() {
        return this.ozonId;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final HealthApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final HealthDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final HealthRunInfo getRunInfo() {
        return this.runInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final HealthAccessibilityInfo getAccessibilityInfo() {
        return this.accessibilityInfo;
    }

    @NotNull
    public final MobileHealthEvent copy(@NotNull String domain, @NotNull String name, @NotNull String clazz, long deviceTimestamp, long ozonId, @NotNull HealthApplicationInfo applicationInfo, @NotNull HealthDeviceInfo deviceInfo, @NotNull HealthRunInfo runInfo, HealthAccessibilityInfo accessibilityInfo, HealthData data, String code, HealthNetworkInfo networkInfo, HealthScreenInfo screenInfo) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(runInfo, "runInfo");
        return new MobileHealthEvent(domain, name, clazz, deviceTimestamp, ozonId, applicationInfo, deviceInfo, runInfo, accessibilityInfo, data, code, networkInfo, screenInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileHealthEvent)) {
            return false;
        }
        MobileHealthEvent mobileHealthEvent = (MobileHealthEvent) other;
        return Intrinsics.d(this.domain, mobileHealthEvent.domain) && Intrinsics.d(this.name, mobileHealthEvent.name) && Intrinsics.d(this.clazz, mobileHealthEvent.clazz) && this.deviceTimestamp == mobileHealthEvent.deviceTimestamp && this.ozonId == mobileHealthEvent.ozonId && Intrinsics.d(this.applicationInfo, mobileHealthEvent.applicationInfo) && Intrinsics.d(this.deviceInfo, mobileHealthEvent.deviceInfo) && Intrinsics.d(this.runInfo, mobileHealthEvent.runInfo) && Intrinsics.d(this.accessibilityInfo, mobileHealthEvent.accessibilityInfo) && Intrinsics.d(this.data, mobileHealthEvent.data) && Intrinsics.d(this.code, mobileHealthEvent.code) && Intrinsics.d(this.networkInfo, mobileHealthEvent.networkInfo) && Intrinsics.d(this.screenInfo, mobileHealthEvent.screenInfo);
    }

    public final HealthAccessibilityInfo getAccessibilityInfo() {
        return this.accessibilityInfo;
    }

    @NotNull
    public final HealthApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    @NotNull
    public final String getClazz() {
        return this.clazz;
    }

    public final String getCode() {
        return this.code;
    }

    public final HealthData getData() {
        return this.data;
    }

    @NotNull
    public final HealthDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final long getDeviceTimestamp() {
        return this.deviceTimestamp;
    }

    @NotNull
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final HealthNetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    public final long getOzonId() {
        return this.ozonId;
    }

    @NotNull
    public final HealthRunInfo getRunInfo() {
        return this.runInfo;
    }

    public final HealthScreenInfo getScreenInfo() {
        return this.screenInfo;
    }

    public int hashCode() {
        int hashCode = (this.runInfo.hashCode() + ((this.deviceInfo.hashCode() + ((this.applicationInfo.hashCode() + c.a(c.a(g.a(g.a(this.domain.hashCode() * 31, 31, this.name), 31, this.clazz), 31, this.deviceTimestamp), 31, this.ozonId)) * 31)) * 31)) * 31;
        HealthAccessibilityInfo healthAccessibilityInfo = this.accessibilityInfo;
        int hashCode2 = (hashCode + (healthAccessibilityInfo == null ? 0 : healthAccessibilityInfo.hashCode())) * 31;
        HealthData healthData = this.data;
        int hashCode3 = (hashCode2 + (healthData == null ? 0 : healthData.hashCode())) * 31;
        String str = this.code;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        HealthNetworkInfo healthNetworkInfo = this.networkInfo;
        int hashCode5 = (hashCode4 + (healthNetworkInfo == null ? 0 : healthNetworkInfo.hashCode())) * 31;
        HealthScreenInfo healthScreenInfo = this.screenInfo;
        return hashCode5 + (healthScreenInfo != null ? healthScreenInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.domain;
        String str2 = this.name;
        String str3 = this.clazz;
        long j11 = this.deviceTimestamp;
        long j12 = this.ozonId;
        HealthApplicationInfo healthApplicationInfo = this.applicationInfo;
        HealthDeviceInfo healthDeviceInfo = this.deviceInfo;
        HealthRunInfo healthRunInfo = this.runInfo;
        HealthAccessibilityInfo healthAccessibilityInfo = this.accessibilityInfo;
        HealthData healthData = this.data;
        String str4 = this.code;
        HealthNetworkInfo healthNetworkInfo = this.networkInfo;
        HealthScreenInfo healthScreenInfo = this.screenInfo;
        StringBuilder d11 = C3660k.d("MobileHealthEvent(domain=", str, ", name=", str2, ", clazz=");
        d11.append(str3);
        d11.append(", deviceTimestamp=");
        d11.append(j11);
        C2942q.f(d11, ", ozonId=", j12, ", applicationInfo=");
        d11.append(healthApplicationInfo);
        d11.append(", deviceInfo=");
        d11.append(healthDeviceInfo);
        d11.append(", runInfo=");
        d11.append(healthRunInfo);
        d11.append(", accessibilityInfo=");
        d11.append(healthAccessibilityInfo);
        d11.append(", data=");
        d11.append(healthData);
        d11.append(", code=");
        d11.append(str4);
        d11.append(", networkInfo=");
        d11.append(healthNetworkInfo);
        d11.append(", screenInfo=");
        d11.append(healthScreenInfo);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ MobileHealthEvent(String str, String str2, String str3, long j11, long j12, HealthApplicationInfo healthApplicationInfo, HealthDeviceInfo healthDeviceInfo, HealthRunInfo healthRunInfo, HealthAccessibilityInfo healthAccessibilityInfo, HealthData healthData, String str4, HealthNetworkInfo healthNetworkInfo, HealthScreenInfo healthScreenInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j11, j12, healthApplicationInfo, healthDeviceInfo, healthRunInfo, (i11 & 256) != 0 ? null : healthAccessibilityInfo, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : healthData, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str4, (i11 & 2048) != 0 ? null : healthNetworkInfo, (i11 & 4096) != 0 ? null : healthScreenInfo);
    }
}
