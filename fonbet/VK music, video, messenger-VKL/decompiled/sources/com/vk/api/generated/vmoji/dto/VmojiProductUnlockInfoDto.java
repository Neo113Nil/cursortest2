package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VmojiProductUnlockInfoDto.kt */
/* loaded from: classes15.dex */
public final class VmojiProductUnlockInfoDto implements Parcelable {
    public static final Parcelable.Creator<VmojiProductUnlockInfoDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: VmojiProductUnlockInfoDto.kt */
    public static final class a implements Parcelable.Creator<VmojiProductUnlockInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiProductUnlockInfoDto createFromParcel(Parcel parcel) {
            return new VmojiProductUnlockInfoDto(parcel.readString(), parcel.readString(), (BaseLinkButtonDto) parcel.readParcelable(VmojiProductUnlockInfoDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiProductUnlockInfoDto[] newArray(int i) {
            return new VmojiProductUnlockInfoDto[i];
        }
    }

    public VmojiProductUnlockInfoDto(String str, String str2, BaseLinkButtonDto baseLinkButtonDto) {
        this.title = str;
        this.text = str2;
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
        if (!(obj instanceof VmojiProductUnlockInfoDto)) {
            return false;
        }
        VmojiProductUnlockInfoDto vmojiProductUnlockInfoDto = (VmojiProductUnlockInfoDto) obj;
        return epx.f(this.title, vmojiProductUnlockInfoDto.title) && epx.f(this.text, vmojiProductUnlockInfoDto.text) && epx.f(this.button, vmojiProductUnlockInfoDto.button);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.title.hashCode() * 31, 31, this.text);
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        return a2 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode());
    }

    public final String toString() {
        return "VmojiProductUnlockInfoDto(title=" + this.title + ", text=" + this.text + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.button, i);
    }

    public /* synthetic */ VmojiProductUnlockInfoDto(String str, String str2, BaseLinkButtonDto baseLinkButtonDto, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : baseLinkButtonDto);
    }
}
