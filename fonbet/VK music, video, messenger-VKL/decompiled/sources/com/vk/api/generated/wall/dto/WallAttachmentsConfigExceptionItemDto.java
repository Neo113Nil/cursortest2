package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.pmi0;

/* compiled from: WallAttachmentsConfigExceptionItemDto.kt */
/* loaded from: classes15.dex */
public final class WallAttachmentsConfigExceptionItemDto implements Parcelable {
    public static final Parcelable.Creator<WallAttachmentsConfigExceptionItemDto> CREATOR = new a();

    @pmi0(TtmlNode.TAG_STYLE)
    private final WallWallpostAttachmentStyleDto style;

    @pmi0("type")
    private final String type;

    /* compiled from: WallAttachmentsConfigExceptionItemDto.kt */
    public static final class a implements Parcelable.Creator<WallAttachmentsConfigExceptionItemDto> {
        @Override // android.os.Parcelable.Creator
        public final WallAttachmentsConfigExceptionItemDto createFromParcel(Parcel parcel) {
            return new WallAttachmentsConfigExceptionItemDto(parcel.readString(), (WallWallpostAttachmentStyleDto) parcel.readParcelable(WallAttachmentsConfigExceptionItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WallAttachmentsConfigExceptionItemDto[] newArray(int i) {
            return new WallAttachmentsConfigExceptionItemDto[i];
        }
    }

    public WallAttachmentsConfigExceptionItemDto(String str, WallWallpostAttachmentStyleDto wallWallpostAttachmentStyleDto) {
        this.type = str;
        this.style = wallWallpostAttachmentStyleDto;
    }

    public final WallWallpostAttachmentStyleDto d() {
        return this.style;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallAttachmentsConfigExceptionItemDto)) {
            return false;
        }
        WallAttachmentsConfigExceptionItemDto wallAttachmentsConfigExceptionItemDto = (WallAttachmentsConfigExceptionItemDto) obj;
        return epx.f(this.type, wallAttachmentsConfigExceptionItemDto.type) && this.style == wallAttachmentsConfigExceptionItemDto.style;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.style.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "WallAttachmentsConfigExceptionItemDto(type=" + this.type + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeParcelable(this.style, i);
    }
}
