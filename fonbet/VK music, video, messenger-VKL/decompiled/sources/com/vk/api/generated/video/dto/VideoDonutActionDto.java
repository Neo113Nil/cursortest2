package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoDonutActionDto.kt */
/* loaded from: classes15.dex */
public final class VideoDonutActionDto implements Parcelable {
    public static final Parcelable.Creator<VideoDonutActionDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoDonutActionDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final TypeDto CLOSE;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("edit_privacy")
        public static final TypeDto EDIT_PRIVACY;

        @pmi0("higher_level")
        public static final TypeDto HIGHER_LEVEL;
        private final String value;

        /* compiled from: VideoDonutActionDto.kt */
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
            TypeDto typeDto = new TypeDto("HIGHER_LEVEL", 0, "higher_level");
            HIGHER_LEVEL = typeDto;
            TypeDto typeDto2 = new TypeDto("EDIT_PRIVACY", 1, "edit_privacy");
            EDIT_PRIVACY = typeDto2;
            TypeDto typeDto3 = new TypeDto("CLOSE", 2, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
            CLOSE = typeDto3;
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

    /* compiled from: VideoDonutActionDto.kt */
    public static final class a implements Parcelable.Creator<VideoDonutActionDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoDonutActionDto createFromParcel(Parcel parcel) {
            return new VideoDonutActionDto(parcel.readString(), TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoDonutActionDto[] newArray(int i) {
            return new VideoDonutActionDto[i];
        }
    }

    public VideoDonutActionDto(String str, TypeDto typeDto, String str2) {
        this.title = str;
        this.type = typeDto;
        this.url = str2;
    }

    public final TypeDto d() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDonutActionDto)) {
            return false;
        }
        VideoDonutActionDto videoDonutActionDto = (VideoDonutActionDto) obj;
        return epx.f(this.title, videoDonutActionDto.title) && this.type == videoDonutActionDto.type && epx.f(this.url, videoDonutActionDto.url);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + (this.title.hashCode() * 31)) * 31;
        String str = this.url;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDonutActionDto(title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.url);
    }

    public /* synthetic */ VideoDonutActionDto(String str, TypeDto typeDto, String str2, int i, zcl zclVar) {
        this(str, typeDto, (i & 4) != 0 ? null : str2);
    }
}
