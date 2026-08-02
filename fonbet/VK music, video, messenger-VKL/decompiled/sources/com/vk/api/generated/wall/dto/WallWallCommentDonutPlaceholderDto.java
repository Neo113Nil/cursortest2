package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: WallWallCommentDonutPlaceholderDto.kt */
/* loaded from: classes15.dex */
public final class WallWallCommentDonutPlaceholderDto implements Parcelable {
    public static final Parcelable.Creator<WallWallCommentDonutPlaceholderDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("text")
    private final String text;

    /* compiled from: WallWallCommentDonutPlaceholderDto.kt */
    public static final class a implements Parcelable.Creator<WallWallCommentDonutPlaceholderDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallCommentDonutPlaceholderDto createFromParcel(Parcel parcel) {
            return new WallWallCommentDonutPlaceholderDto(parcel.readString(), (BaseLinkButtonDto) parcel.readParcelable(WallWallCommentDonutPlaceholderDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallCommentDonutPlaceholderDto[] newArray(int i) {
            return new WallWallCommentDonutPlaceholderDto[i];
        }
    }

    public WallWallCommentDonutPlaceholderDto(String str, BaseLinkButtonDto baseLinkButtonDto) {
        this.text = str;
        this.button = baseLinkButtonDto;
    }

    public final BaseLinkButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallCommentDonutPlaceholderDto)) {
            return false;
        }
        WallWallCommentDonutPlaceholderDto wallWallCommentDonutPlaceholderDto = (WallWallCommentDonutPlaceholderDto) obj;
        return epx.f(this.text, wallWallCommentDonutPlaceholderDto.text) && epx.f(this.button, wallWallCommentDonutPlaceholderDto.button);
    }

    public final int hashCode() {
        return this.button.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return "WallWallCommentDonutPlaceholderDto(text=" + this.text + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.button, i);
    }
}
