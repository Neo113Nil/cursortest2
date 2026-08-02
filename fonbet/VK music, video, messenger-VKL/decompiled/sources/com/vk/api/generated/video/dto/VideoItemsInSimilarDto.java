package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoItemsInSimilarDto.kt */
/* loaded from: classes15.dex */
public final class VideoItemsInSimilarDto implements Parcelable {
    public static final Parcelable.Creator<VideoItemsInSimilarDto> CREATOR = new a();

    @pmi0("anchor_info")
    private final VideoGetSimilarAnchorInfoDto anchorInfo;

    @pmi0("banner")
    private final VideoDiscoverBannerDto banner;

    @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
    private final VideoContentDto content;

    @pmi0("ref")
    private final String ref;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoItemsInSimilarDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("banner")
        public static final TypeDto BANNER;

        @pmi0("carousel_clips")
        public static final TypeDto CAROUSEL_CLIPS;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("floor_clips")
        public static final TypeDto FLOOR_CLIPS;

        @pmi0("video")
        public static final TypeDto VIDEO;
        private final String value;

        /* compiled from: VideoItemsInSimilarDto.kt */
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
            TypeDto typeDto = new TypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 0, "video");
            VIDEO = typeDto;
            TypeDto typeDto2 = new TypeDto("CAROUSEL_CLIPS", 1, "carousel_clips");
            CAROUSEL_CLIPS = typeDto2;
            TypeDto typeDto3 = new TypeDto("FLOOR_CLIPS", 2, "floor_clips");
            FLOOR_CLIPS = typeDto3;
            TypeDto typeDto4 = new TypeDto("BANNER", 3, "banner");
            BANNER = typeDto4;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4};
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

    /* compiled from: VideoItemsInSimilarDto.kt */
    public static final class a implements Parcelable.Creator<VideoItemsInSimilarDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoItemsInSimilarDto createFromParcel(Parcel parcel) {
            return new VideoItemsInSimilarDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : VideoGetSimilarAnchorInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VideoContentDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? VideoDiscoverBannerDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoItemsInSimilarDto[] newArray(int i) {
            return new VideoItemsInSimilarDto[i];
        }
    }

    public VideoItemsInSimilarDto(TypeDto typeDto, String str, VideoGetSimilarAnchorInfoDto videoGetSimilarAnchorInfoDto, VideoContentDto videoContentDto, VideoDiscoverBannerDto videoDiscoverBannerDto) {
        this.type = typeDto;
        this.ref = str;
        this.anchorInfo = videoGetSimilarAnchorInfoDto;
        this.content = videoContentDto;
        this.banner = videoDiscoverBannerDto;
    }

    public final VideoDiscoverBannerDto d() {
        return this.banner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final VideoContentDto e() {
        return this.content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoItemsInSimilarDto)) {
            return false;
        }
        VideoItemsInSimilarDto videoItemsInSimilarDto = (VideoItemsInSimilarDto) obj;
        return this.type == videoItemsInSimilarDto.type && epx.f(this.ref, videoItemsInSimilarDto.ref) && epx.f(this.anchorInfo, videoItemsInSimilarDto.anchorInfo) && epx.f(this.content, videoItemsInSimilarDto.content) && epx.f(this.banner, videoItemsInSimilarDto.banner);
    }

    public final String f() {
        return this.ref;
    }

    public final TypeDto g() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.ref;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        VideoGetSimilarAnchorInfoDto videoGetSimilarAnchorInfoDto = this.anchorInfo;
        int hashCode3 = (hashCode2 + (videoGetSimilarAnchorInfoDto == null ? 0 : videoGetSimilarAnchorInfoDto.hashCode())) * 31;
        VideoContentDto videoContentDto = this.content;
        int hashCode4 = (hashCode3 + (videoContentDto == null ? 0 : videoContentDto.hashCode())) * 31;
        VideoDiscoverBannerDto videoDiscoverBannerDto = this.banner;
        return hashCode4 + (videoDiscoverBannerDto != null ? videoDiscoverBannerDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoItemsInSimilarDto(type=" + this.type + ", ref=" + this.ref + ", anchorInfo=" + this.anchorInfo + ", content=" + this.content + ", banner=" + this.banner + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.ref);
        VideoGetSimilarAnchorInfoDto videoGetSimilarAnchorInfoDto = this.anchorInfo;
        if (videoGetSimilarAnchorInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoGetSimilarAnchorInfoDto.writeToParcel(parcel, i);
        }
        VideoContentDto videoContentDto = this.content;
        if (videoContentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoContentDto.writeToParcel(parcel, i);
        }
        VideoDiscoverBannerDto videoDiscoverBannerDto = this.banner;
        if (videoDiscoverBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoDiscoverBannerDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoItemsInSimilarDto(TypeDto typeDto, String str, VideoGetSimilarAnchorInfoDto videoGetSimilarAnchorInfoDto, VideoContentDto videoContentDto, VideoDiscoverBannerDto videoDiscoverBannerDto, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : videoGetSimilarAnchorInfoDto, (i & 8) != 0 ? null : videoContentDto, (i & 16) != 0 ? null : videoDiscoverBannerDto);
    }
}
