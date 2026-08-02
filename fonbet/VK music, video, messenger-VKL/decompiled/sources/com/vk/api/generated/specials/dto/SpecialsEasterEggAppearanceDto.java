package com.vk.api.generated.specials.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: SpecialsEasterEggAppearanceDto.kt */
/* loaded from: classes15.dex */
public final class SpecialsEasterEggAppearanceDto implements Parcelable {
    public static final Parcelable.Creator<SpecialsEasterEggAppearanceDto> CREATOR = new a();

    @pmi0("bottom")
    private final Integer bottom;

    @pmi0("fixed")
    private final Boolean fixed;

    @pmi0(TtmlNode.LEFT)
    private final Integer left;

    @pmi0(TtmlNode.RIGHT)
    private final Integer right;

    @pmi0("top")
    private final Integer top;

    /* compiled from: SpecialsEasterEggAppearanceDto.kt */
    public static final class a implements Parcelable.Creator<SpecialsEasterEggAppearanceDto> {
        @Override // android.os.Parcelable.Creator
        public final SpecialsEasterEggAppearanceDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SpecialsEasterEggAppearanceDto(valueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SpecialsEasterEggAppearanceDto[] newArray(int i) {
            return new SpecialsEasterEggAppearanceDto[i];
        }
    }

    public SpecialsEasterEggAppearanceDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final Integer d() {
        return this.bottom;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.fixed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialsEasterEggAppearanceDto)) {
            return false;
        }
        SpecialsEasterEggAppearanceDto specialsEasterEggAppearanceDto = (SpecialsEasterEggAppearanceDto) obj;
        return epx.f(this.fixed, specialsEasterEggAppearanceDto.fixed) && epx.f(this.top, specialsEasterEggAppearanceDto.top) && epx.f(this.left, specialsEasterEggAppearanceDto.left) && epx.f(this.right, specialsEasterEggAppearanceDto.right) && epx.f(this.bottom, specialsEasterEggAppearanceDto.bottom);
    }

    public final Integer f() {
        return this.left;
    }

    public final Integer g() {
        return this.right;
    }

    public final int hashCode() {
        Boolean bool = this.fixed;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.top;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.left;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.right;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.bottom;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final Integer i() {
        return this.top;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialsEasterEggAppearanceDto(fixed=");
        sb.append(this.fixed);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", left=");
        sb.append(this.left);
        sb.append(", right=");
        sb.append(this.right);
        sb.append(", bottom=");
        return uqi.b(sb, this.bottom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.fixed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.top;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.left;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.right;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.bottom;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public SpecialsEasterEggAppearanceDto(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4) {
        this.fixed = bool;
        this.top = num;
        this.left = num2;
        this.right = num3;
        this.bottom = num4;
    }

    public /* synthetic */ SpecialsEasterEggAppearanceDto(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4);
    }
}
