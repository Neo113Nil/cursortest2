package com.vk.stat.scheme;

import com.ironsource.O6;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;

/* compiled from: MobileOfficialAppsCoreDeviceStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCoreDeviceStat$DeviceInfoItem {
    public final transient String a;
    public final transient String b;

    @pmi0("build_number")
    private final int buildNumber;
    public final transient String c;
    public final transient String d;

    @pmi0("device_id")
    private final String deviceId;

    @pmi0("device_brand")
    private final FilteredString filteredDeviceBrand;

    @pmi0(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL)
    private final FilteredString filteredDeviceModel;

    @pmi0(O6.F)
    private final FilteredString filteredOs;

    @pmi0("os_version")
    private final FilteredString filteredOsVersion;

    /* compiled from: MobileOfficialAppsCoreDeviceStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsCoreDeviceStat$DeviceInfoItem>, a9y<MobileOfficialAppsCoreDeviceStat$DeviceInfoItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsCoreDeviceStat$DeviceInfoItem(fai.p(x9yVar, "build_number"), fai.s(x9yVar, "device_id"), fai.s(x9yVar, "device_brand"), fai.s(x9yVar, AnalyticsBaseParamsConstantsKt.DEVICE_MODEL), fai.s(x9yVar, O6.F), fai.s(x9yVar, "os_version"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem = (MobileOfficialAppsCoreDeviceStat$DeviceInfoItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("build_number", Integer.valueOf(mobileOfficialAppsCoreDeviceStat$DeviceInfoItem.a()));
            x9yVar.o("device_id", mobileOfficialAppsCoreDeviceStat$DeviceInfoItem.b());
            x9yVar.o("device_brand", mobileOfficialAppsCoreDeviceStat$DeviceInfoItem.a);
            x9yVar.o(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, mobileOfficialAppsCoreDeviceStat$DeviceInfoItem.b);
            x9yVar.o(O6.F, mobileOfficialAppsCoreDeviceStat$DeviceInfoItem.c);
            x9yVar.o("os_version", mobileOfficialAppsCoreDeviceStat$DeviceInfoItem.d);
            return x9yVar;
        }
    }

    public MobileOfficialAppsCoreDeviceStat$DeviceInfoItem(int i, String str, String str2, String str3, String str4, String str5) {
        this.buildNumber = i;
        this.deviceId = str;
        this.a = str2;
        this.b = str3;
        this.c = str4;
        this.d = str5;
        FilteredString filteredString = new FilteredString(lhg.b(128));
        this.filteredDeviceBrand = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(256));
        this.filteredDeviceModel = filteredString2;
        FilteredString filteredString3 = new FilteredString(lhg.b(16));
        this.filteredOs = filteredString3;
        FilteredString filteredString4 = new FilteredString(lhg.b(128));
        this.filteredOsVersion = filteredString4;
        filteredString.a(str2);
        filteredString2.a(str3);
        filteredString3.a(str4);
        filteredString4.a(str5);
    }

    public final int a() {
        return this.buildNumber;
    }

    public final String b() {
        return this.deviceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreDeviceStat$DeviceInfoItem)) {
            return false;
        }
        MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem = (MobileOfficialAppsCoreDeviceStat$DeviceInfoItem) obj;
        return this.buildNumber == mobileOfficialAppsCoreDeviceStat$DeviceInfoItem.buildNumber && epx.f(this.deviceId, mobileOfficialAppsCoreDeviceStat$DeviceInfoItem.deviceId) && epx.f(this.a, mobileOfficialAppsCoreDeviceStat$DeviceInfoItem.a) && epx.f(this.b, mobileOfficialAppsCoreDeviceStat$DeviceInfoItem.b) && epx.f(this.c, mobileOfficialAppsCoreDeviceStat$DeviceInfoItem.c) && epx.f(this.d, mobileOfficialAppsCoreDeviceStat$DeviceInfoItem.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(Integer.hashCode(this.buildNumber) * 31, 31, this.deviceId), 31, this.a), 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceInfoItem(buildNumber=");
        sb.append(this.buildNumber);
        sb.append(", deviceId=");
        sb.append(this.deviceId);
        sb.append(", deviceBrand=");
        sb.append(this.a);
        sb.append(", deviceModel=");
        sb.append(this.b);
        sb.append(", os=");
        sb.append(this.c);
        sb.append(", osVersion=");
        return ho8.a(sb, this.d, ')');
    }
}
