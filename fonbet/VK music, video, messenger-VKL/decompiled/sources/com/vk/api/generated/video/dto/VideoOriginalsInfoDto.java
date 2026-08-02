package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoOriginalsInfoDto.kt */
/* loaded from: classes15.dex */
public final class VideoOriginalsInfoDto implements Parcelable {
    public static final Parcelable.Creator<VideoOriginalsInfoDto> CREATOR = new a();

    @pmi0("avg_duration")
    private final Integer avgDuration;

    @pmi0("hide_views_count")
    private final BaseBoolIntDto hideViewsCount;

    @pmi0("playlist_id")
    private final Integer playlistId;

    @pmi0("playlist_owner_id")
    private final UserId playlistOwnerId;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoOriginalsInfoDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("episode")
        public static final TypeDto EPISODE;

        @pmi0("trailer")
        public static final TypeDto TRAILER;
        private final String value;

        /* compiled from: VideoOriginalsInfoDto.kt */
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
            TypeDto typeDto = new TypeDto("TRAILER", 0, "trailer");
            TRAILER = typeDto;
            TypeDto typeDto2 = new TypeDto("EPISODE", 1, "episode");
            EPISODE = typeDto2;
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

    /* compiled from: VideoOriginalsInfoDto.kt */
    public static final class a implements Parcelable.Creator<VideoOriginalsInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoOriginalsInfoDto createFromParcel(Parcel parcel) {
            return new VideoOriginalsInfoDto(parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(VideoOriginalsInfoDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoOriginalsInfoDto[] newArray(int i) {
            return new VideoOriginalsInfoDto[i];
        }
    }

    public VideoOriginalsInfoDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoOriginalsInfoDto)) {
            return false;
        }
        VideoOriginalsInfoDto videoOriginalsInfoDto = (VideoOriginalsInfoDto) obj;
        return this.type == videoOriginalsInfoDto.type && epx.f(this.playlistOwnerId, videoOriginalsInfoDto.playlistOwnerId) && epx.f(this.playlistId, videoOriginalsInfoDto.playlistId) && epx.f(this.title, videoOriginalsInfoDto.title) && this.hideViewsCount == videoOriginalsInfoDto.hideViewsCount && epx.f(this.avgDuration, videoOriginalsInfoDto.avgDuration);
    }

    public final int hashCode() {
        TypeDto typeDto = this.type;
        int hashCode = (typeDto == null ? 0 : typeDto.hashCode()) * 31;
        UserId userId = this.playlistOwnerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num = this.playlistId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.title;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.hideViewsCount;
        int hashCode5 = (hashCode4 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        Integer num2 = this.avgDuration;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoOriginalsInfoDto(type=");
        sb.append(this.type);
        sb.append(", playlistOwnerId=");
        sb.append(this.playlistOwnerId);
        sb.append(", playlistId=");
        sb.append(this.playlistId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", hideViewsCount=");
        sb.append(this.hideViewsCount);
        sb.append(", avgDuration=");
        return uqi.b(sb, this.avgDuration, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.playlistOwnerId, i);
        Integer num = this.playlistId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.title);
        BaseBoolIntDto baseBoolIntDto = this.hideViewsCount;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.avgDuration;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public VideoOriginalsInfoDto(TypeDto typeDto, UserId userId, Integer num, String str, BaseBoolIntDto baseBoolIntDto, Integer num2) {
        this.type = typeDto;
        this.playlistOwnerId = userId;
        this.playlistId = num;
        this.title = str;
        this.hideViewsCount = baseBoolIntDto;
        this.avgDuration = num2;
    }

    public /* synthetic */ VideoOriginalsInfoDto(TypeDto typeDto, UserId userId, Integer num, String str, BaseBoolIntDto baseBoolIntDto, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : typeDto, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : baseBoolIntDto, (i & 32) != 0 ? null : num2);
    }
}
