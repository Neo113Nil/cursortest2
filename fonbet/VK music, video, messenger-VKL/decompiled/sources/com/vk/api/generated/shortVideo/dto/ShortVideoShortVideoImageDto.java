package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ShortVideoShortVideoImageDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoImageDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoImageDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("is_base")
    private final Boolean isBase;

    @pmi0("padding")
    private final Boolean padding;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    /* compiled from: ShortVideoShortVideoImageDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoImageDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoImageDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShortVideoShortVideoImageDto(readString, readInt, readInt2, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoImageDto[] newArray(int i) {
            return new ShortVideoShortVideoImageDto[i];
        }
    }

    public ShortVideoShortVideoImageDto(String str, int i, int i2, Boolean bool, Boolean bool2) {
        this.url = str;
        this.width = i;
        this.height = i2;
        this.padding = bool;
        this.isBase = bool2;
    }

    public final Boolean d() {
        return this.padding;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isBase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoImageDto)) {
            return false;
        }
        ShortVideoShortVideoImageDto shortVideoShortVideoImageDto = (ShortVideoShortVideoImageDto) obj;
        return epx.f(this.url, shortVideoShortVideoImageDto.url) && this.width == shortVideoShortVideoImageDto.width && this.height == shortVideoShortVideoImageDto.height && epx.f(this.padding, shortVideoShortVideoImageDto.padding) && epx.f(this.isBase, shortVideoShortVideoImageDto.isBase);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        int a2 = shy.a(this.height, shy.a(this.width, this.url.hashCode() * 31, 31), 31);
        Boolean bool = this.padding;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBase;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoImageDto(url=");
        sb.append(this.url);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", isBase=");
        return tn.a(sb, this.isBase, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        Boolean bool = this.padding;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isBase;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ ShortVideoShortVideoImageDto(String str, int i, int i2, Boolean bool, Boolean bool2, int i3, zcl zclVar) {
        this(str, i, i2, (i3 & 8) != 0 ? null : bool, (i3 & 16) != 0 ? null : bool2);
    }
}
