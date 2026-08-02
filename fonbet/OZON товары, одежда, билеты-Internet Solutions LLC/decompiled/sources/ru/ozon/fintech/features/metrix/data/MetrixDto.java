package ru.ozon.fintech.features.metrix.data;

import G.g;
import I0.C3173b;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import androidx.annotation.Keep;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003Jw\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u0010.\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015¨\u00063"}, d2 = {"Lru/ozon/fintech/features/metrix/data/MetrixDto;", "", "app", "", "appVer", "deviceInfo", "Lru/ozon/fintech/features/metrix/data/DeviceInfo;", "etalonData", "Lru/ozon/fintech/features/metrix/data/EtalonData;", "events", "", "Lru/ozon/fintech/features/metrix/data/Event;", "newArch", "", "os", "osVer", "sessionId", "serviceName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/features/metrix/data/DeviceInfo;Lru/ozon/fintech/features/metrix/data/EtalonData;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApp", "()Ljava/lang/String;", "getAppVer", "getDeviceInfo", "()Lru/ozon/fintech/features/metrix/data/DeviceInfo;", "getEtalonData", "()Lru/ozon/fintech/features/metrix/data/EtalonData;", "getEvents", "()Ljava/util/List;", "getNewArch", "()Z", "getOs", "getOsVer", "getSessionId", "getServiceName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "metrix_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MetrixDto {

    @i(name = "app")
    @NotNull
    private final String app;

    @i(name = "app_ver")
    @NotNull
    private final String appVer;

    @i(name = "device_info")
    @NotNull
    private final DeviceInfo deviceInfo;

    @i(name = "etalon_data")
    private final EtalonData etalonData;

    @i(name = "events")
    private final List<Event> events;

    @i(name = "new_arch")
    private final boolean newArch;

    @i(name = "os")
    @NotNull
    private final String os;

    @i(name = "os_ver")
    @NotNull
    private final String osVer;

    @i(name = "service_name")
    @NotNull
    private final String serviceName;

    @i(name = "session_id")
    @NotNull
    private final String sessionId;

    public MetrixDto(@NotNull String app, @NotNull String appVer, @NotNull DeviceInfo deviceInfo, EtalonData etalonData, List<Event> list, boolean z11, @NotNull String os, @NotNull String osVer, @NotNull String sessionId, @NotNull String serviceName) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(appVer, "appVer");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osVer, "osVer");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        this.app = app;
        this.appVer = appVer;
        this.deviceInfo = deviceInfo;
        this.etalonData = etalonData;
        this.events = list;
        this.newArch = z11;
        this.os = os;
        this.osVer = osVer;
        this.sessionId = sessionId;
        this.serviceName = serviceName;
    }

    public static /* synthetic */ MetrixDto copy$default(MetrixDto metrixDto, String str, String str2, DeviceInfo deviceInfo, EtalonData etalonData, List list, boolean z11, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = metrixDto.app;
        }
        if ((i11 & 2) != 0) {
            str2 = metrixDto.appVer;
        }
        if ((i11 & 4) != 0) {
            deviceInfo = metrixDto.deviceInfo;
        }
        if ((i11 & 8) != 0) {
            etalonData = metrixDto.etalonData;
        }
        if ((i11 & 16) != 0) {
            list = metrixDto.events;
        }
        if ((i11 & 32) != 0) {
            z11 = metrixDto.newArch;
        }
        if ((i11 & 64) != 0) {
            str3 = metrixDto.os;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str4 = metrixDto.osVer;
        }
        if ((i11 & 256) != 0) {
            str5 = metrixDto.sessionId;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str6 = metrixDto.serviceName;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        List list2 = list;
        boolean z12 = z11;
        return metrixDto.copy(str, str2, deviceInfo, etalonData, list2, z12, str9, str10, str7, str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getApp() {
        return this.app;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getServiceName() {
        return this.serviceName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAppVer() {
        return this.appVer;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final EtalonData getEtalonData() {
        return this.etalonData;
    }

    public final List<Event> component5() {
        return this.events;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getNewArch() {
        return this.newArch;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getOsVer() {
        return this.osVer;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final MetrixDto copy(@NotNull String app, @NotNull String appVer, @NotNull DeviceInfo deviceInfo, EtalonData etalonData, List<Event> events, boolean newArch, @NotNull String os, @NotNull String osVer, @NotNull String sessionId, @NotNull String serviceName) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(appVer, "appVer");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osVer, "osVer");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        return new MetrixDto(app, appVer, deviceInfo, etalonData, events, newArch, os, osVer, sessionId, serviceName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetrixDto)) {
            return false;
        }
        MetrixDto metrixDto = (MetrixDto) other;
        return Intrinsics.d(this.app, metrixDto.app) && Intrinsics.d(this.appVer, metrixDto.appVer) && Intrinsics.d(this.deviceInfo, metrixDto.deviceInfo) && Intrinsics.d(this.etalonData, metrixDto.etalonData) && Intrinsics.d(this.events, metrixDto.events) && this.newArch == metrixDto.newArch && Intrinsics.d(this.os, metrixDto.os) && Intrinsics.d(this.osVer, metrixDto.osVer) && Intrinsics.d(this.sessionId, metrixDto.sessionId) && Intrinsics.d(this.serviceName, metrixDto.serviceName);
    }

    @NotNull
    public final String getApp() {
        return this.app;
    }

    @NotNull
    public final String getAppVer() {
        return this.appVer;
    }

    @NotNull
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final EtalonData getEtalonData() {
        return this.etalonData;
    }

    public final List<Event> getEvents() {
        return this.events;
    }

    public final boolean getNewArch() {
        return this.newArch;
    }

    @NotNull
    public final String getOs() {
        return this.os;
    }

    @NotNull
    public final String getOsVer() {
        return this.osVer;
    }

    @NotNull
    public final String getServiceName() {
        return this.serviceName;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int hashCode = (this.deviceInfo.hashCode() + g.a(this.app.hashCode() * 31, 31, this.appVer)) * 31;
        EtalonData etalonData = this.etalonData;
        int hashCode2 = (hashCode + (etalonData == null ? 0 : etalonData.hashCode())) * 31;
        List<Event> list = this.events;
        return this.serviceName.hashCode() + g.a(g.a(g.a(C3532b.a((hashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.newArch), 31, this.os), 31, this.osVer), 31, this.sessionId);
    }

    @NotNull
    public String toString() {
        String str = this.app;
        String str2 = this.appVer;
        DeviceInfo deviceInfo = this.deviceInfo;
        EtalonData etalonData = this.etalonData;
        List<Event> list = this.events;
        boolean z11 = this.newArch;
        String str3 = this.os;
        String str4 = this.osVer;
        String str5 = this.sessionId;
        String str6 = this.serviceName;
        StringBuilder d11 = C3660k.d("MetrixDto(app=", str, ", appVer=", str2, ", deviceInfo=");
        d11.append(deviceInfo);
        d11.append(", etalonData=");
        d11.append(etalonData);
        d11.append(", events=");
        d11.append(list);
        d11.append(", newArch=");
        d11.append(z11);
        d11.append(", os=");
        a.h(d11, str3, ", osVer=", str4, ", sessionId=");
        return C3173b.c(d11, str5, ", serviceName=", str6, ")");
    }
}
