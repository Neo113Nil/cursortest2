package com.vk.api.generated.docs.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: DocsDocPreviewVideoDto.kt */
/* loaded from: classes14.dex */
public final class DocsDocPreviewVideoDto implements Parcelable {
    public static final Parcelable.Creator<DocsDocPreviewVideoDto> CREATOR = new a();

    @pmi0("file_size")
    private final int fileSize;

    @pmi0("height")
    private final int height;

    @pmi0("src")
    private final String src;

    @pmi0("width")
    private final int width;

    /* compiled from: DocsDocPreviewVideoDto.kt */
    public static final class a implements Parcelable.Creator<DocsDocPreviewVideoDto> {
        @Override // android.os.Parcelable.Creator
        public final DocsDocPreviewVideoDto createFromParcel(Parcel parcel) {
            return new DocsDocPreviewVideoDto(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DocsDocPreviewVideoDto[] newArray(int i) {
            return new DocsDocPreviewVideoDto[i];
        }
    }

    public DocsDocPreviewVideoDto(String str, int i, int i2, int i3) {
        this.src = str;
        this.width = i;
        this.height = i2;
        this.fileSize = i3;
    }

    public final String d() {
        return this.src;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocPreviewVideoDto)) {
            return false;
        }
        DocsDocPreviewVideoDto docsDocPreviewVideoDto = (DocsDocPreviewVideoDto) obj;
        return epx.f(this.src, docsDocPreviewVideoDto.src) && this.width == docsDocPreviewVideoDto.width && this.height == docsDocPreviewVideoDto.height && this.fileSize == docsDocPreviewVideoDto.fileSize;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return Integer.hashCode(this.fileSize) + shy.a(this.height, shy.a(this.width, this.src.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DocsDocPreviewVideoDto(src=");
        sb.append(this.src);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", fileSize=");
        return vu5.b(sb, this.fileSize, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.src);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.fileSize);
    }
}
