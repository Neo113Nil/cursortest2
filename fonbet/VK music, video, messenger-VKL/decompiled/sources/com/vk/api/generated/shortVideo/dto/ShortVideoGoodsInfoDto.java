package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ShortVideoGoodsInfoDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGoodsInfoDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGoodsInfoDto> CREATOR = new a();

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("image")
    private final String image;

    @pmi0("restriction")
    private final String restriction;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: ShortVideoGoodsInfoDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGoodsInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGoodsInfoDto createFromParcel(Parcel parcel) {
            return new ShortVideoGoodsInfoDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGoodsInfoDto[] newArray(int i) {
            return new ShortVideoGoodsInfoDto[i];
        }
    }

    public ShortVideoGoodsInfoDto(String str, String str2, String str3, String str4, String str5) {
        this.title = str;
        this.url = str2;
        this.image = str3;
        this.restriction = str4;
        this.buttonText = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoGoodsInfoDto)) {
            return false;
        }
        ShortVideoGoodsInfoDto shortVideoGoodsInfoDto = (ShortVideoGoodsInfoDto) obj;
        return epx.f(this.title, shortVideoGoodsInfoDto.title) && epx.f(this.url, shortVideoGoodsInfoDto.url) && epx.f(this.image, shortVideoGoodsInfoDto.image) && epx.f(this.restriction, shortVideoGoodsInfoDto.restriction) && epx.f(this.buttonText, shortVideoGoodsInfoDto.buttonText);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.url), 31, this.image);
        String str = this.restriction;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buttonText;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoGoodsInfoDto(title=");
        sb.append(this.title);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", restriction=");
        sb.append(this.restriction);
        sb.append(", buttonText=");
        return ho8.a(sb, this.buttonText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.image);
        parcel.writeString(this.restriction);
        parcel.writeString(this.buttonText);
    }

    public /* synthetic */ ShortVideoGoodsInfoDto(String str, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
