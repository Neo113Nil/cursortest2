package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AppsAdsBannerSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AppsAdsBannerSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AppsAdsBannerSettingsDto> CREATOR = new a();

    @pmi0("autoupdate_ms")
    private final int autoupdateMs;

    @pmi0("limit_ms")
    private final int limitMs;

    @pmi0("load_threshold_ms")
    private final Integer loadThresholdMs;

    @pmi0("preload_ttl")
    private final Integer preloadTtl;

    @pmi0("slot_ids")
    private final List<Integer> slotIds;

    @pmi0("slot_mappings")
    private final List<AppsAdsSlotsSettingsMappingDto> slotMappings;

    /* compiled from: AppsAdsBannerSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AppsAdsBannerSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAdsBannerSettingsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = pm0.b(parcel, arrayList2, i2, 1);
            }
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(AppsAdsSlotsSettingsMappingDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new AppsAdsBannerSettingsDto(arrayList2, readInt2, readInt3, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAdsBannerSettingsDto[] newArray(int i) {
            return new AppsAdsBannerSettingsDto[i];
        }
    }

    public AppsAdsBannerSettingsDto(List<Integer> list, int i, int i2, List<AppsAdsSlotsSettingsMappingDto> list2, Integer num, Integer num2) {
        this.slotIds = list;
        this.limitMs = i;
        this.autoupdateMs = i2;
        this.slotMappings = list2;
        this.preloadTtl = num;
        this.loadThresholdMs = num2;
    }

    public final int d() {
        return this.autoupdateMs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.limitMs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAdsBannerSettingsDto)) {
            return false;
        }
        AppsAdsBannerSettingsDto appsAdsBannerSettingsDto = (AppsAdsBannerSettingsDto) obj;
        return epx.f(this.slotIds, appsAdsBannerSettingsDto.slotIds) && this.limitMs == appsAdsBannerSettingsDto.limitMs && this.autoupdateMs == appsAdsBannerSettingsDto.autoupdateMs && epx.f(this.slotMappings, appsAdsBannerSettingsDto.slotMappings) && epx.f(this.preloadTtl, appsAdsBannerSettingsDto.preloadTtl) && epx.f(this.loadThresholdMs, appsAdsBannerSettingsDto.loadThresholdMs);
    }

    public final Integer f() {
        return this.preloadTtl;
    }

    public final List<Integer> g() {
        return this.slotIds;
    }

    public final int hashCode() {
        int a2 = shy.a(this.autoupdateMs, shy.a(this.limitMs, this.slotIds.hashCode() * 31, 31), 31);
        List<AppsAdsSlotsSettingsMappingDto> list = this.slotMappings;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.preloadTtl;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.loadThresholdMs;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final List<AppsAdsSlotsSettingsMappingDto> i() {
        return this.slotMappings;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsAdsBannerSettingsDto(slotIds=");
        sb.append(this.slotIds);
        sb.append(", limitMs=");
        sb.append(this.limitMs);
        sb.append(", autoupdateMs=");
        sb.append(this.autoupdateMs);
        sb.append(", slotMappings=");
        sb.append(this.slotMappings);
        sb.append(", preloadTtl=");
        sb.append(this.preloadTtl);
        sb.append(", loadThresholdMs=");
        return uqi.b(sb, this.loadThresholdMs, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.slotIds);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        parcel.writeInt(this.limitMs);
        parcel.writeInt(this.autoupdateMs);
        List<AppsAdsSlotsSettingsMappingDto> list = this.slotMappings;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AppsAdsSlotsSettingsMappingDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.preloadTtl;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.loadThresholdMs;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ AppsAdsBannerSettingsDto(List list, int i, int i2, List list2, Integer num, Integer num2, int i3, zcl zclVar) {
        this(list, i, i2, (i3 & 8) != 0 ? null : list2, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2);
    }
}
