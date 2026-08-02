package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ShortVideoTemplateFragmentDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoTemplateFragmentDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoTemplateFragmentDto> CREATOR = new a();

    @pmi0(TtmlNode.END)
    private final int end;

    @pmi0("start")
    private final int start;

    /* compiled from: ShortVideoTemplateFragmentDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoTemplateFragmentDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoTemplateFragmentDto createFromParcel(Parcel parcel) {
            return new ShortVideoTemplateFragmentDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoTemplateFragmentDto[] newArray(int i) {
            return new ShortVideoTemplateFragmentDto[i];
        }
    }

    public ShortVideoTemplateFragmentDto(int i, int i2) {
        this.start = i;
        this.end = i2;
    }

    public final int d() {
        return this.end;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.start;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoTemplateFragmentDto)) {
            return false;
        }
        ShortVideoTemplateFragmentDto shortVideoTemplateFragmentDto = (ShortVideoTemplateFragmentDto) obj;
        return this.start == shortVideoTemplateFragmentDto.start && this.end == shortVideoTemplateFragmentDto.end;
    }

    public final int hashCode() {
        return Integer.hashCode(this.end) + (Integer.hashCode(this.start) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoTemplateFragmentDto(start=");
        sb.append(this.start);
        sb.append(", end=");
        return vu5.b(sb, this.end, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
    }
}
