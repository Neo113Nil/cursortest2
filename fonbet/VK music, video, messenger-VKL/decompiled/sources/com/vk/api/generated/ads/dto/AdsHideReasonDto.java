package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: AdsHideReasonDto.kt */
/* loaded from: classes14.dex */
public final class AdsHideReasonDto implements Parcelable {
    public static final Parcelable.Creator<AdsHideReasonDto> CREATOR = new a();

    @pmi0("icon")
    private final String icon;

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    @pmi0("shouldCloseAd")
    private final Boolean shouldCloseAd;

    /* compiled from: AdsHideReasonDto.kt */
    public static final class a implements Parcelable.Creator<AdsHideReasonDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsHideReasonDto createFromParcel(Parcel parcel) {
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdsHideReasonDto(valueOf, readString, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdsHideReasonDto[] newArray(int i) {
            return new AdsHideReasonDto[i];
        }
    }

    public AdsHideReasonDto() {
        this(null, null, null, null, 15, null);
    }

    public final Integer d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsHideReasonDto)) {
            return false;
        }
        AdsHideReasonDto adsHideReasonDto = (AdsHideReasonDto) obj;
        return epx.f(this.id, adsHideReasonDto.id) && epx.f(this.name, adsHideReasonDto.name) && epx.f(this.shouldCloseAd, adsHideReasonDto.shouldCloseAd) && epx.f(this.icon, adsHideReasonDto.icon);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.shouldCloseAd;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.icon;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsHideReasonDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", shouldCloseAd=");
        sb.append(this.shouldCloseAd);
        sb.append(", icon=");
        return ho8.a(sb, this.icon, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.name);
        Boolean bool = this.shouldCloseAd;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.icon);
    }

    public AdsHideReasonDto(Integer num, String str, Boolean bool, String str2) {
        this.id = num;
        this.name = str;
        this.shouldCloseAd = bool;
        this.icon = str2;
    }

    public /* synthetic */ AdsHideReasonDto(Integer num, String str, Boolean bool, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2);
    }
}
