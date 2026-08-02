package com.vk.api.generated.docs.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: DocsDocPreviewGraffitiDto.kt */
/* loaded from: classes14.dex */
public final class DocsDocPreviewGraffitiDto implements Parcelable {
    public static final Parcelable.Creator<DocsDocPreviewGraffitiDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("src")
    private final String src;

    @pmi0("width")
    private final int width;

    /* compiled from: DocsDocPreviewGraffitiDto.kt */
    public static final class a implements Parcelable.Creator<DocsDocPreviewGraffitiDto> {
        @Override // android.os.Parcelable.Creator
        public final DocsDocPreviewGraffitiDto createFromParcel(Parcel parcel) {
            return new DocsDocPreviewGraffitiDto(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DocsDocPreviewGraffitiDto[] newArray(int i) {
            return new DocsDocPreviewGraffitiDto[i];
        }
    }

    public DocsDocPreviewGraffitiDto(String str, int i, int i2) {
        this.src = str;
        this.width = i;
        this.height = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocPreviewGraffitiDto)) {
            return false;
        }
        DocsDocPreviewGraffitiDto docsDocPreviewGraffitiDto = (DocsDocPreviewGraffitiDto) obj;
        return epx.f(this.src, docsDocPreviewGraffitiDto.src) && this.width == docsDocPreviewGraffitiDto.width && this.height == docsDocPreviewGraffitiDto.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return Integer.hashCode(this.height) + shy.a(this.width, this.src.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DocsDocPreviewGraffitiDto(src=");
        sb.append(this.src);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return vu5.b(sb, this.height, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.src);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}
