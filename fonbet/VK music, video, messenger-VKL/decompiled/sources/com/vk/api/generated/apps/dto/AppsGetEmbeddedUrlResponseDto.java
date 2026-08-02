package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppsGetEmbeddedUrlResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetEmbeddedUrlResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetEmbeddedUrlResponseDto> CREATOR = new a();

    @pmi0("app_access_token")
    private final String appAccessToken;

    @pmi0("original_url")
    private final String originalUrl;

    @pmi0("screen_title")
    private final String screenTitle;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("view_url")
    private final String viewUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsGetEmbeddedUrlResponseDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        public static final TypeDto APP;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("game")
        public static final TypeDto GAME;
        private final String value;

        /* compiled from: AppsGetEmbeddedUrlResponseDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("GAME", 0, "game");
            GAME = typeDto;
            TypeDto typeDto2 = new TypeDto("APP", 1, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            APP = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AppsGetEmbeddedUrlResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetEmbeddedUrlResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetEmbeddedUrlResponseDto createFromParcel(Parcel parcel) {
            return new AppsGetEmbeddedUrlResponseDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetEmbeddedUrlResponseDto[] newArray(int i) {
            return new AppsGetEmbeddedUrlResponseDto[i];
        }
    }

    public AppsGetEmbeddedUrlResponseDto(String str, String str2, String str3, String str4, TypeDto typeDto) {
        this.originalUrl = str;
        this.viewUrl = str2;
        this.appAccessToken = str3;
        this.screenTitle = str4;
        this.type = typeDto;
    }

    public final String d() {
        return this.originalUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.viewUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetEmbeddedUrlResponseDto)) {
            return false;
        }
        AppsGetEmbeddedUrlResponseDto appsGetEmbeddedUrlResponseDto = (AppsGetEmbeddedUrlResponseDto) obj;
        return epx.f(this.originalUrl, appsGetEmbeddedUrlResponseDto.originalUrl) && epx.f(this.viewUrl, appsGetEmbeddedUrlResponseDto.viewUrl) && epx.f(this.appAccessToken, appsGetEmbeddedUrlResponseDto.appAccessToken) && epx.f(this.screenTitle, appsGetEmbeddedUrlResponseDto.screenTitle) && this.type == appsGetEmbeddedUrlResponseDto.type;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.originalUrl.hashCode() * 31, 31, this.viewUrl), 31, this.appAccessToken), 31, this.screenTitle);
        TypeDto typeDto = this.type;
        return a2 + (typeDto == null ? 0 : typeDto.hashCode());
    }

    public final String toString() {
        return "AppsGetEmbeddedUrlResponseDto(originalUrl=" + this.originalUrl + ", viewUrl=" + this.viewUrl + ", appAccessToken=" + this.appAccessToken + ", screenTitle=" + this.screenTitle + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.originalUrl);
        parcel.writeString(this.viewUrl);
        parcel.writeString(this.appAccessToken);
        parcel.writeString(this.screenTitle);
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsGetEmbeddedUrlResponseDto(String str, String str2, String str3, String str4, TypeDto typeDto, int i, zcl zclVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : typeDto);
    }
}
