package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: ShortVideoFloatingAdPositionDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoFloatingAdPositionDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoFloatingAdPositionDto> CREATOR = new a();

    @pmi0("bottom")
    private final Integer bottom;

    @pmi0(TtmlNode.LEFT)
    private final Integer left;

    /* compiled from: ShortVideoFloatingAdPositionDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoFloatingAdPositionDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoFloatingAdPositionDto createFromParcel(Parcel parcel) {
            return new ShortVideoFloatingAdPositionDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoFloatingAdPositionDto[] newArray(int i) {
            return new ShortVideoFloatingAdPositionDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoFloatingAdPositionDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Integer d() {
        return this.bottom;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.left;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoFloatingAdPositionDto)) {
            return false;
        }
        ShortVideoFloatingAdPositionDto shortVideoFloatingAdPositionDto = (ShortVideoFloatingAdPositionDto) obj;
        return epx.f(this.left, shortVideoFloatingAdPositionDto.left) && epx.f(this.bottom, shortVideoFloatingAdPositionDto.bottom);
    }

    public final int hashCode() {
        Integer num = this.left;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.bottom;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoFloatingAdPositionDto(left=");
        sb.append(this.left);
        sb.append(", bottom=");
        return uqi.b(sb, this.bottom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.left;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.bottom;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public ShortVideoFloatingAdPositionDto(Integer num, Integer num2) {
        this.left = num;
        this.bottom = num2;
    }

    public /* synthetic */ ShortVideoFloatingAdPositionDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
