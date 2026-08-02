package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.D1;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShortVideoAdActionButtonDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoAdActionButtonDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoAdActionButtonDto> CREATOR = new a();

    @pmi0("app_deeplink")
    private final String appDeeplink;

    @pmi0("app_package_name")
    private final String appPackageName;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("url")
    private final String url;

    @pmi0("url_target")
    private final UrlTargetDto urlTarget;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoAdActionButtonDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("link")
        public static final TypeDto LINK;

        @pmi0("subscribe")
        public static final TypeDto SUBSCRIBE;

        @pmi0("write")
        public static final TypeDto WRITE;
        private final String value;

        /* compiled from: ShortVideoAdActionButtonDto.kt */
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
            TypeDto typeDto = new TypeDto("LINK", 0, "link");
            LINK = typeDto;
            TypeDto typeDto2 = new TypeDto("SUBSCRIBE", 1, "subscribe");
            SUBSCRIBE = typeDto2;
            TypeDto typeDto3 = new TypeDto("WRITE", 2, "write");
            WRITE = typeDto3;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoAdActionButtonDto.kt */
    public static final class UrlTargetDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UrlTargetDto[] $VALUES;
        public static final Parcelable.Creator<UrlTargetDto> CREATOR;

        @pmi0(D1.e)
        public static final UrlTargetDto EXTERNAL;

        @pmi0("internal")
        public static final UrlTargetDto INTERNAL;

        @pmi0("internal_hidden")
        public static final UrlTargetDto INTERNAL_HIDDEN;
        private final String value;

        /* compiled from: ShortVideoAdActionButtonDto.kt */
        public static final class a implements Parcelable.Creator<UrlTargetDto> {
            @Override // android.os.Parcelable.Creator
            public final UrlTargetDto createFromParcel(Parcel parcel) {
                return UrlTargetDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final UrlTargetDto[] newArray(int i) {
                return new UrlTargetDto[i];
            }
        }

        static {
            UrlTargetDto urlTargetDto = new UrlTargetDto("INTERNAL", 0, "internal");
            INTERNAL = urlTargetDto;
            UrlTargetDto urlTargetDto2 = new UrlTargetDto("EXTERNAL", 1, D1.e);
            EXTERNAL = urlTargetDto2;
            UrlTargetDto urlTargetDto3 = new UrlTargetDto("INTERNAL_HIDDEN", 2, "internal_hidden");
            INTERNAL_HIDDEN = urlTargetDto3;
            UrlTargetDto[] urlTargetDtoArr = {urlTargetDto, urlTargetDto2, urlTargetDto3};
            $VALUES = urlTargetDtoArr;
            $ENTRIES = new asp(urlTargetDtoArr);
            CREATOR = new a();
        }

        private UrlTargetDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static UrlTargetDto valueOf(String str) {
            return (UrlTargetDto) Enum.valueOf(UrlTargetDto.class, str);
        }

        public static UrlTargetDto[] values() {
            return (UrlTargetDto[]) $VALUES.clone();
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

    /* compiled from: ShortVideoAdActionButtonDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoAdActionButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoAdActionButtonDto createFromParcel(Parcel parcel) {
            return new ShortVideoAdActionButtonDto(parcel.readString(), parcel.readString(), TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UrlTargetDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoAdActionButtonDto[] newArray(int i) {
            return new ShortVideoAdActionButtonDto[i];
        }
    }

    public ShortVideoAdActionButtonDto(String str, String str2, TypeDto typeDto, String str3, String str4, UrlTargetDto urlTargetDto) {
        this.title = str;
        this.url = str2;
        this.type = typeDto;
        this.appPackageName = str3;
        this.appDeeplink = str4;
        this.urlTarget = urlTargetDto;
    }

    public final String d() {
        return this.appDeeplink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.appPackageName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoAdActionButtonDto)) {
            return false;
        }
        ShortVideoAdActionButtonDto shortVideoAdActionButtonDto = (ShortVideoAdActionButtonDto) obj;
        return epx.f(this.title, shortVideoAdActionButtonDto.title) && epx.f(this.url, shortVideoAdActionButtonDto.url) && this.type == shortVideoAdActionButtonDto.type && epx.f(this.appPackageName, shortVideoAdActionButtonDto.appPackageName) && epx.f(this.appDeeplink, shortVideoAdActionButtonDto.appDeeplink) && this.urlTarget == shortVideoAdActionButtonDto.urlTarget;
    }

    public final TypeDto f() {
        return this.type;
    }

    public final UrlTargetDto g() {
        return this.urlTarget;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.url)) * 31;
        String str = this.appPackageName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appDeeplink;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlTargetDto urlTargetDto = this.urlTarget;
        return hashCode3 + (urlTargetDto != null ? urlTargetDto.hashCode() : 0);
    }

    public final String toString() {
        return "ShortVideoAdActionButtonDto(title=" + this.title + ", url=" + this.url + ", type=" + this.type + ", appPackageName=" + this.appPackageName + ", appDeeplink=" + this.appDeeplink + ", urlTarget=" + this.urlTarget + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.appPackageName);
        parcel.writeString(this.appDeeplink);
        UrlTargetDto urlTargetDto = this.urlTarget;
        if (urlTargetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            urlTargetDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ShortVideoAdActionButtonDto(String str, String str2, TypeDto typeDto, String str3, String str4, UrlTargetDto urlTargetDto, int i, zcl zclVar) {
        this(str, str2, typeDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : urlTargetDto);
    }
}
