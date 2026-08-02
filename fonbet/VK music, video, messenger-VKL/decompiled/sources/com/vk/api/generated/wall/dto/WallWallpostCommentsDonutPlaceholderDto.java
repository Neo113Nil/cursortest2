package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallWallpostCommentsDonutPlaceholderDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostCommentsDonutPlaceholderDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostCommentsDonutPlaceholderDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("text")
    private final String text;

    /* compiled from: WallWallpostCommentsDonutPlaceholderDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostCommentsDonutPlaceholderDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostCommentsDonutPlaceholderDto createFromParcel(Parcel parcel) {
            return new WallWallpostCommentsDonutPlaceholderDto(parcel.readString(), (BaseLinkButtonDto) parcel.readParcelable(WallWallpostCommentsDonutPlaceholderDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostCommentsDonutPlaceholderDto[] newArray(int i) {
            return new WallWallpostCommentsDonutPlaceholderDto[i];
        }
    }

    public WallWallpostCommentsDonutPlaceholderDto(String str, BaseLinkButtonDto baseLinkButtonDto) {
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
        if (!(obj instanceof WallWallpostCommentsDonutPlaceholderDto)) {
            return false;
        }
        WallWallpostCommentsDonutPlaceholderDto wallWallpostCommentsDonutPlaceholderDto = (WallWallpostCommentsDonutPlaceholderDto) obj;
        return epx.f(this.text, wallWallpostCommentsDonutPlaceholderDto.text) && epx.f(this.button, wallWallpostCommentsDonutPlaceholderDto.button);
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        return hashCode + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode());
    }

    public final String toString() {
        return "WallWallpostCommentsDonutPlaceholderDto(text=" + this.text + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.button, i);
    }

    public /* synthetic */ WallWallpostCommentsDonutPlaceholderDto(String str, BaseLinkButtonDto baseLinkButtonDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : baseLinkButtonDto);
    }
}
