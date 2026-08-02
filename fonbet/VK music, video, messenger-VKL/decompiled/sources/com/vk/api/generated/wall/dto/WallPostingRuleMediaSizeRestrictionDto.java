package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: WallPostingRuleMediaSizeRestrictionDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingRuleMediaSizeRestrictionDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingRuleMediaSizeRestrictionDto> CREATOR = new a();

    @pmi0("max_ratio")
    private final Float maxRatio;

    @pmi0("media_type")
    private final String mediaType;

    @pmi0("min_ratio")
    private final Float minRatio;

    @pmi0("min_width")
    private final Integer minWidth;

    /* compiled from: WallPostingRuleMediaSizeRestrictionDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingRuleMediaSizeRestrictionDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingRuleMediaSizeRestrictionDto createFromParcel(Parcel parcel) {
            return new WallPostingRuleMediaSizeRestrictionDto(parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingRuleMediaSizeRestrictionDto[] newArray(int i) {
            return new WallPostingRuleMediaSizeRestrictionDto[i];
        }
    }

    public WallPostingRuleMediaSizeRestrictionDto(String str, Float f, Float f2, Integer num) {
        this.mediaType = str;
        this.minRatio = f;
        this.maxRatio = f2;
        this.minWidth = num;
    }

    public final Float d() {
        return this.maxRatio;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.mediaType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingRuleMediaSizeRestrictionDto)) {
            return false;
        }
        WallPostingRuleMediaSizeRestrictionDto wallPostingRuleMediaSizeRestrictionDto = (WallPostingRuleMediaSizeRestrictionDto) obj;
        return epx.f(this.mediaType, wallPostingRuleMediaSizeRestrictionDto.mediaType) && epx.f(this.minRatio, wallPostingRuleMediaSizeRestrictionDto.minRatio) && epx.f(this.maxRatio, wallPostingRuleMediaSizeRestrictionDto.maxRatio) && epx.f(this.minWidth, wallPostingRuleMediaSizeRestrictionDto.minWidth);
    }

    public final Float f() {
        return this.minRatio;
    }

    public final Integer g() {
        return this.minWidth;
    }

    public final int hashCode() {
        int hashCode = this.mediaType.hashCode() * 31;
        Float f = this.minRatio;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.maxRatio;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.minWidth;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPostingRuleMediaSizeRestrictionDto(mediaType=");
        sb.append(this.mediaType);
        sb.append(", minRatio=");
        sb.append(this.minRatio);
        sb.append(", maxRatio=");
        sb.append(this.maxRatio);
        sb.append(", minWidth=");
        return uqi.b(sb, this.minWidth, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mediaType);
        Float f = this.minRatio;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.maxRatio;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        Integer num = this.minWidth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ WallPostingRuleMediaSizeRestrictionDto(String str, Float f, Float f2, Integer num, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2, (i & 8) != 0 ? null : num);
    }
}
