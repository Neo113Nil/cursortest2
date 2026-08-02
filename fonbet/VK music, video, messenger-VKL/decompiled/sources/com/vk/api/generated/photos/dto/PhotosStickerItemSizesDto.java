package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PhotosStickerItemSizesDto.kt */
/* loaded from: classes15.dex */
public final class PhotosStickerItemSizesDto implements Parcelable {
    public static final Parcelable.Creator<PhotosStickerItemSizesDto> CREATOR = new a();

    /* renamed from: 128, reason: not valid java name */
    @pmi0("128")
    private final String f14128;

    /* renamed from: 128b, reason: not valid java name */
    @pmi0("128b")
    private final String f15128b;

    /* renamed from: 256, reason: not valid java name */
    @pmi0("256")
    private final String f16256;

    /* renamed from: 256b, reason: not valid java name */
    @pmi0("256b")
    private final String f17256b;

    /* renamed from: 512, reason: not valid java name */
    @pmi0("512")
    private final String f18512;

    /* renamed from: 512b, reason: not valid java name */
    @pmi0("512b")
    private final String f19512b;

    /* renamed from: 64, reason: not valid java name */
    @pmi0("64")
    private final String f2064;

    /* renamed from: 64b, reason: not valid java name */
    @pmi0("64b")
    private final String f2164b;

    @pmi0("thumb")
    private final String thumb;

    /* compiled from: PhotosStickerItemSizesDto.kt */
    public static final class a implements Parcelable.Creator<PhotosStickerItemSizesDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosStickerItemSizesDto createFromParcel(Parcel parcel) {
            return new PhotosStickerItemSizesDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosStickerItemSizesDto[] newArray(int i) {
            return new PhotosStickerItemSizesDto[i];
        }
    }

    public PhotosStickerItemSizesDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosStickerItemSizesDto)) {
            return false;
        }
        PhotosStickerItemSizesDto photosStickerItemSizesDto = (PhotosStickerItemSizesDto) obj;
        return epx.f(this.f2064, photosStickerItemSizesDto.f2064) && epx.f(this.f2164b, photosStickerItemSizesDto.f2164b) && epx.f(this.f14128, photosStickerItemSizesDto.f14128) && epx.f(this.f15128b, photosStickerItemSizesDto.f15128b) && epx.f(this.f16256, photosStickerItemSizesDto.f16256) && epx.f(this.f17256b, photosStickerItemSizesDto.f17256b) && epx.f(this.f18512, photosStickerItemSizesDto.f18512) && epx.f(this.f19512b, photosStickerItemSizesDto.f19512b) && epx.f(this.thumb, photosStickerItemSizesDto.thumb);
    }

    public final int hashCode() {
        String str = this.f2064;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2164b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14128;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f15128b;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f16256;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f17256b;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f18512;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f19512b;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.thumb;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosStickerItemSizesDto(64=");
        sb.append(this.f2064);
        sb.append(", 64b=");
        sb.append(this.f2164b);
        sb.append(", 128=");
        sb.append(this.f14128);
        sb.append(", 128b=");
        sb.append(this.f15128b);
        sb.append(", 256=");
        sb.append(this.f16256);
        sb.append(", 256b=");
        sb.append(this.f17256b);
        sb.append(", 512=");
        sb.append(this.f18512);
        sb.append(", 512b=");
        sb.append(this.f19512b);
        sb.append(", thumb=");
        return ho8.a(sb, this.thumb, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2064);
        parcel.writeString(this.f2164b);
        parcel.writeString(this.f14128);
        parcel.writeString(this.f15128b);
        parcel.writeString(this.f16256);
        parcel.writeString(this.f17256b);
        parcel.writeString(this.f18512);
        parcel.writeString(this.f19512b);
        parcel.writeString(this.thumb);
    }

    public PhotosStickerItemSizesDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f2064 = str;
        this.f2164b = str2;
        this.f14128 = str3;
        this.f15128b = str4;
        this.f16256 = str5;
        this.f17256b = str6;
        this.f18512 = str7;
        this.f19512b = str8;
        this.thumb = str9;
    }

    public /* synthetic */ PhotosStickerItemSizesDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9);
    }
}
