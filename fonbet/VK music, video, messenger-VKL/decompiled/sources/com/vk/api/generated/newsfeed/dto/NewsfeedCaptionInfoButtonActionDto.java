package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: NewsfeedCaptionInfoButtonActionDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedCaptionInfoButtonActionDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedCaptionInfoButtonActionDto> CREATOR = new a();

    @pmi0("target")
    private final TargetDto target;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedCaptionInfoButtonActionDto.kt */
    public static final class TargetDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TargetDto[] $VALUES;
        public static final Parcelable.Creator<TargetDto> CREATOR;

        @pmi0("internal")
        public static final TargetDto INTERNAL;
        private final String value;

        /* compiled from: NewsfeedCaptionInfoButtonActionDto.kt */
        public static final class a implements Parcelable.Creator<TargetDto> {
            @Override // android.os.Parcelable.Creator
            public final TargetDto createFromParcel(Parcel parcel) {
                return TargetDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TargetDto[] newArray(int i) {
                return new TargetDto[i];
            }
        }

        static {
            TargetDto targetDto = new TargetDto("INTERNAL", 0, "internal");
            INTERNAL = targetDto;
            TargetDto[] targetDtoArr = {targetDto};
            $VALUES = targetDtoArr;
            $ENTRIES = new asp(targetDtoArr);
            CREATOR = new a();
        }

        private TargetDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TargetDto valueOf(String str) {
            return (TargetDto) Enum.valueOf(TargetDto.class, str);
        }

        public static TargetDto[] values() {
            return (TargetDto[]) $VALUES.clone();
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
    /* compiled from: NewsfeedCaptionInfoButtonActionDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("open_url")
        public static final TypeDto OPEN_URL;
        private final String value;

        /* compiled from: NewsfeedCaptionInfoButtonActionDto.kt */
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
            TypeDto typeDto = new TypeDto("OPEN_URL", 0, "open_url");
            OPEN_URL = typeDto;
            TypeDto[] typeDtoArr = {typeDto};
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

    /* compiled from: NewsfeedCaptionInfoButtonActionDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedCaptionInfoButtonActionDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedCaptionInfoButtonActionDto createFromParcel(Parcel parcel) {
            return new NewsfeedCaptionInfoButtonActionDto(TypeDto.CREATOR.createFromParcel(parcel), TargetDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedCaptionInfoButtonActionDto[] newArray(int i) {
            return new NewsfeedCaptionInfoButtonActionDto[i];
        }
    }

    public NewsfeedCaptionInfoButtonActionDto(TypeDto typeDto, TargetDto targetDto, String str) {
        this.type = typeDto;
        this.target = targetDto;
        this.url = str;
    }

    public final TargetDto d() {
        return this.target;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedCaptionInfoButtonActionDto)) {
            return false;
        }
        NewsfeedCaptionInfoButtonActionDto newsfeedCaptionInfoButtonActionDto = (NewsfeedCaptionInfoButtonActionDto) obj;
        return this.type == newsfeedCaptionInfoButtonActionDto.type && this.target == newsfeedCaptionInfoButtonActionDto.target && epx.f(this.url, newsfeedCaptionInfoButtonActionDto.url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.url.hashCode() + ((this.target.hashCode() + (this.type.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedCaptionInfoButtonActionDto(type=");
        sb.append(this.type);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        this.target.writeToParcel(parcel, i);
        parcel.writeString(this.url);
    }
}
