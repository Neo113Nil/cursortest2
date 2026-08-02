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

/* compiled from: AppsAdsSlotsSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AppsAdsSlotsSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AppsAdsSlotsSettingsDto> CREATOR = new a();

    @pmi0("limit_ms")
    private final Integer limitMs;

    @pmi0("preload_ttl")
    private final Integer preloadTtl;

    @pmi0("slot_ids")
    private final List<Integer> slotIds;

    @pmi0("slot_mappings")
    private final List<AppsAdsSlotsSettingsMappingDto> slotMappings;

    @pmi0("timeout_ms")
    private final int timeoutMs;

    /* compiled from: AppsAdsSlotsSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AppsAdsSlotsSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAdsSlotsSettingsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = pm0.b(parcel, arrayList2, i2, 1);
            }
            int readInt2 = parcel.readInt();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(AppsAdsSlotsSettingsMappingDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new AppsAdsSlotsSettingsDto(arrayList2, readInt2, valueOf, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAdsSlotsSettingsDto[] newArray(int i) {
            return new AppsAdsSlotsSettingsDto[i];
        }
    }

    public AppsAdsSlotsSettingsDto(List<Integer> list, int i, Integer num, List<AppsAdsSlotsSettingsMappingDto> list2, Integer num2) {
        this.slotIds = list;
        this.timeoutMs = i;
        this.limitMs = num;
        this.slotMappings = list2;
        this.preloadTtl = num2;
    }

    public final Integer d() {
        return this.limitMs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.preloadTtl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAdsSlotsSettingsDto)) {
            return false;
        }
        AppsAdsSlotsSettingsDto appsAdsSlotsSettingsDto = (AppsAdsSlotsSettingsDto) obj;
        return epx.f(this.slotIds, appsAdsSlotsSettingsDto.slotIds) && this.timeoutMs == appsAdsSlotsSettingsDto.timeoutMs && epx.f(this.limitMs, appsAdsSlotsSettingsDto.limitMs) && epx.f(this.slotMappings, appsAdsSlotsSettingsDto.slotMappings) && epx.f(this.preloadTtl, appsAdsSlotsSettingsDto.preloadTtl);
    }

    public final List<Integer> f() {
        return this.slotIds;
    }

    public final List<AppsAdsSlotsSettingsMappingDto> g() {
        return this.slotMappings;
    }

    public final int hashCode() {
        int a2 = shy.a(this.timeoutMs, this.slotIds.hashCode() * 31, 31);
        Integer num = this.limitMs;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        List<AppsAdsSlotsSettingsMappingDto> list = this.slotMappings;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.preloadTtl;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final int i() {
        return this.timeoutMs;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsAdsSlotsSettingsDto(slotIds=");
        sb.append(this.slotIds);
        sb.append(", timeoutMs=");
        sb.append(this.timeoutMs);
        sb.append(", limitMs=");
        sb.append(this.limitMs);
        sb.append(", slotMappings=");
        sb.append(this.slotMappings);
        sb.append(", preloadTtl=");
        return uqi.b(sb, this.preloadTtl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.slotIds);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        parcel.writeInt(this.timeoutMs);
        Integer num = this.limitMs;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<AppsAdsSlotsSettingsMappingDto> list = this.slotMappings;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AppsAdsSlotsSettingsMappingDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num2 = this.preloadTtl;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ AppsAdsSlotsSettingsDto(List list, int i, Integer num, List list2, Integer num2, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : num2);
    }
}
