package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.zcl;

/* compiled from: AudioAdsConfigDto.kt */
/* loaded from: classes14.dex */
public final class AudioAdsConfigDto implements Parcelable {
    public static final Parcelable.Creator<AudioAdsConfigDto> CREATOR = new a();

    @pmi0("day_limit")
    private final int dayLimit;

    @pmi0("day_limit_reached")
    private final Boolean dayLimitReached;

    @pmi0("sections")
    private final List<String> sections;

    @pmi0("sign")
    private final String sign;

    @pmi0("track_limit")
    private final int trackLimit;

    @pmi0("types_allowed")
    private final List<String> typesAllowed;

    /* compiled from: AudioAdsConfigDto.kt */
    public static final class a implements Parcelable.Creator<AudioAdsConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioAdsConfigDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AudioAdsConfigDto(readInt, readInt2, createStringArrayList, createStringArrayList2, valueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAdsConfigDto[] newArray(int i) {
            return new AudioAdsConfigDto[i];
        }
    }

    public AudioAdsConfigDto(int i, int i2, List<String> list, List<String> list2, Boolean bool, String str) {
        this.dayLimit = i;
        this.trackLimit = i2;
        this.typesAllowed = list;
        this.sections = list2;
        this.dayLimitReached = bool;
        this.sign = str;
    }

    public final int d() {
        return this.dayLimit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.sections;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAdsConfigDto)) {
            return false;
        }
        AudioAdsConfigDto audioAdsConfigDto = (AudioAdsConfigDto) obj;
        return this.dayLimit == audioAdsConfigDto.dayLimit && this.trackLimit == audioAdsConfigDto.trackLimit && epx.f(this.typesAllowed, audioAdsConfigDto.typesAllowed) && epx.f(this.sections, audioAdsConfigDto.sections) && epx.f(this.dayLimitReached, audioAdsConfigDto.dayLimitReached) && epx.f(this.sign, audioAdsConfigDto.sign);
    }

    public final int f() {
        return this.trackLimit;
    }

    public final List<String> g() {
        return this.typesAllowed;
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(shy.a(this.trackLimit, Integer.hashCode(this.dayLimit) * 31, 31), 31, this.typesAllowed), 31, this.sections);
        Boolean bool = this.dayLimitReached;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.sign;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAdsConfigDto(dayLimit=");
        sb.append(this.dayLimit);
        sb.append(", trackLimit=");
        sb.append(this.trackLimit);
        sb.append(", typesAllowed=");
        sb.append(this.typesAllowed);
        sb.append(", sections=");
        sb.append(this.sections);
        sb.append(", dayLimitReached=");
        sb.append(this.dayLimitReached);
        sb.append(", sign=");
        return ho8.a(sb, this.sign, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.dayLimit);
        parcel.writeInt(this.trackLimit);
        parcel.writeStringList(this.typesAllowed);
        parcel.writeStringList(this.sections);
        Boolean bool = this.dayLimitReached;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.sign);
    }

    public /* synthetic */ AudioAdsConfigDto(int i, int i2, List list, List list2, Boolean bool, String str, int i3, zcl zclVar) {
        this(i, i2, list, list2, (i3 & 16) != 0 ? null : bool, (i3 & 32) != 0 ? null : str);
    }
}
