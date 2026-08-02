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

/* compiled from: AppsAdsSlotsMobwebInterstitialSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AppsAdsSlotsMobwebInterstitialSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AppsAdsSlotsMobwebInterstitialSettingsDto> CREATOR = new a();

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

    @pmi0("url")
    private final String url;

    /* compiled from: AppsAdsSlotsMobwebInterstitialSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AppsAdsSlotsMobwebInterstitialSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAdsSlotsMobwebInterstitialSettingsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = pm0.b(parcel, arrayList2, i2, 1);
            }
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
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
            return new AppsAdsSlotsMobwebInterstitialSettingsDto(arrayList2, readInt2, readString, valueOf, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAdsSlotsMobwebInterstitialSettingsDto[] newArray(int i) {
            return new AppsAdsSlotsMobwebInterstitialSettingsDto[i];
        }
    }

    public AppsAdsSlotsMobwebInterstitialSettingsDto(List<Integer> list, int i, String str, Integer num, List<AppsAdsSlotsSettingsMappingDto> list2, Integer num2) {
        this.slotIds = list;
        this.timeoutMs = i;
        this.url = str;
        this.limitMs = num;
        this.slotMappings = list2;
        this.preloadTtl = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAdsSlotsMobwebInterstitialSettingsDto)) {
            return false;
        }
        AppsAdsSlotsMobwebInterstitialSettingsDto appsAdsSlotsMobwebInterstitialSettingsDto = (AppsAdsSlotsMobwebInterstitialSettingsDto) obj;
        return epx.f(this.slotIds, appsAdsSlotsMobwebInterstitialSettingsDto.slotIds) && this.timeoutMs == appsAdsSlotsMobwebInterstitialSettingsDto.timeoutMs && epx.f(this.url, appsAdsSlotsMobwebInterstitialSettingsDto.url) && epx.f(this.limitMs, appsAdsSlotsMobwebInterstitialSettingsDto.limitMs) && epx.f(this.slotMappings, appsAdsSlotsMobwebInterstitialSettingsDto.slotMappings) && epx.f(this.preloadTtl, appsAdsSlotsMobwebInterstitialSettingsDto.preloadTtl);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = shy.a(this.timeoutMs, this.slotIds.hashCode() * 31, 31);
        String str = this.url;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.limitMs;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<AppsAdsSlotsSettingsMappingDto> list = this.slotMappings;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.preloadTtl;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsAdsSlotsMobwebInterstitialSettingsDto(slotIds=");
        sb.append(this.slotIds);
        sb.append(", timeoutMs=");
        sb.append(this.timeoutMs);
        sb.append(", url=");
        sb.append(this.url);
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
        parcel.writeString(this.url);
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

    public /* synthetic */ AppsAdsSlotsMobwebInterstitialSettingsDto(List list, int i, String str, Integer num, List list2, Integer num2, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? null : num2);
    }
}
