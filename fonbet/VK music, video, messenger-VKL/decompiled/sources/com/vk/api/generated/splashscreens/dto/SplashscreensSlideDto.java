package com.vk.api.generated.splashscreens.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SplashscreensSlideDto.kt */
/* loaded from: classes15.dex */
public final class SplashscreensSlideDto implements Parcelable {
    public static final Parcelable.Creator<SplashscreensSlideDto> CREATOR = new a();

    @pmi0("aspect_ratio")
    private final String aspectRatio;

    @pmi0(X3.i.I0)
    private final SplashscreensSlideMediaDto media;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final String type;

    /* compiled from: SplashscreensSlideDto.kt */
    public static final class a implements Parcelable.Creator<SplashscreensSlideDto> {
        @Override // android.os.Parcelable.Creator
        public final SplashscreensSlideDto createFromParcel(Parcel parcel) {
            return new SplashscreensSlideDto(parcel.readString(), SplashscreensSlideMediaDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SplashscreensSlideDto[] newArray(int i) {
            return new SplashscreensSlideDto[i];
        }
    }

    public SplashscreensSlideDto(String str, SplashscreensSlideMediaDto splashscreensSlideMediaDto, String str2, String str3) {
        this.type = str;
        this.media = splashscreensSlideMediaDto;
        this.aspectRatio = str2;
        this.text = str3;
    }

    public final String d() {
        return this.aspectRatio;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final SplashscreensSlideMediaDto e() {
        return this.media;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplashscreensSlideDto)) {
            return false;
        }
        SplashscreensSlideDto splashscreensSlideDto = (SplashscreensSlideDto) obj;
        return epx.f(this.type, splashscreensSlideDto.type) && epx.f(this.media, splashscreensSlideDto.media) && epx.f(this.aspectRatio, splashscreensSlideDto.aspectRatio) && epx.f(this.text, splashscreensSlideDto.text);
    }

    public final String f() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = urd0.a((this.media.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.aspectRatio);
        String str = this.text;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplashscreensSlideDto(type=");
        sb.append(this.type);
        sb.append(", media=");
        sb.append(this.media);
        sb.append(", aspectRatio=");
        sb.append(this.aspectRatio);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        this.media.writeToParcel(parcel, i);
        parcel.writeString(this.aspectRatio);
        parcel.writeString(this.text);
    }

    public /* synthetic */ SplashscreensSlideDto(String str, SplashscreensSlideMediaDto splashscreensSlideMediaDto, String str2, String str3, int i, zcl zclVar) {
        this(str, splashscreensSlideMediaDto, str2, (i & 8) != 0 ? null : str3);
    }
}
