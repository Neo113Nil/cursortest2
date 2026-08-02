package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketProductLinkedContentItemDto.kt */
/* loaded from: classes15.dex */
public final class MarketProductLinkedContentItemDto implements Parcelable {
    public static final Parcelable.Creator<MarketProductLinkedContentItemDto> CREATOR = new a();

    @pmi0("content_type")
    private final ContentTypeDto contentType;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("source")
    private final MarketLinkedContentSourceDto source;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("video")
    private final VideoVideoFullDto video;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketProductLinkedContentItemDto.kt */
    public static final class ContentTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentTypeDto[] $VALUES;
        public static final Parcelable.Creator<ContentTypeDto> CREATOR;

        @pmi0("photo")
        public static final ContentTypeDto PHOTO;

        @pmi0("video")
        public static final ContentTypeDto VIDEO;
        private final String value;

        /* compiled from: MarketProductLinkedContentItemDto.kt */
        public static final class a implements Parcelable.Creator<ContentTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ContentTypeDto createFromParcel(Parcel parcel) {
                return ContentTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ContentTypeDto[] newArray(int i) {
                return new ContentTypeDto[i];
            }
        }

        static {
            ContentTypeDto contentTypeDto = new ContentTypeDto("PHOTO", 0, "photo");
            PHOTO = contentTypeDto;
            ContentTypeDto contentTypeDto2 = new ContentTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 1, "video");
            VIDEO = contentTypeDto2;
            ContentTypeDto[] contentTypeDtoArr = {contentTypeDto, contentTypeDto2};
            $VALUES = contentTypeDtoArr;
            $ENTRIES = new asp(contentTypeDtoArr);
            CREATOR = new a();
        }

        private ContentTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ContentTypeDto valueOf(String str) {
            return (ContentTypeDto) Enum.valueOf(ContentTypeDto.class, str);
        }

        public static ContentTypeDto[] values() {
            return (ContentTypeDto[]) $VALUES.clone();
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

    /* compiled from: MarketProductLinkedContentItemDto.kt */
    public static final class a implements Parcelable.Creator<MarketProductLinkedContentItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketProductLinkedContentItemDto createFromParcel(Parcel parcel) {
            return new MarketProductLinkedContentItemDto((UserId) parcel.readParcelable(MarketProductLinkedContentItemDto.class.getClassLoader()), parcel.readString(), ContentTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MarketLinkedContentSourceDto.CREATOR.createFromParcel(parcel), (PhotosPhotoDto) parcel.readParcelable(MarketProductLinkedContentItemDto.class.getClassLoader()), (VideoVideoFullDto) parcel.readParcelable(MarketProductLinkedContentItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketProductLinkedContentItemDto[] newArray(int i) {
            return new MarketProductLinkedContentItemDto[i];
        }
    }

    public MarketProductLinkedContentItemDto(UserId userId, String str, ContentTypeDto contentTypeDto, MarketLinkedContentSourceDto marketLinkedContentSourceDto, PhotosPhotoDto photosPhotoDto, VideoVideoFullDto videoVideoFullDto) {
        this.ownerId = userId;
        this.trackCode = str;
        this.contentType = contentTypeDto;
        this.source = marketLinkedContentSourceDto;
        this.photo = photosPhotoDto;
        this.video = videoVideoFullDto;
    }

    public final ContentTypeDto d() {
        return this.contentType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final PhotosPhotoDto e() {
        return this.photo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketProductLinkedContentItemDto)) {
            return false;
        }
        MarketProductLinkedContentItemDto marketProductLinkedContentItemDto = (MarketProductLinkedContentItemDto) obj;
        return epx.f(this.ownerId, marketProductLinkedContentItemDto.ownerId) && epx.f(this.trackCode, marketProductLinkedContentItemDto.trackCode) && this.contentType == marketProductLinkedContentItemDto.contentType && epx.f(this.source, marketProductLinkedContentItemDto.source) && epx.f(this.photo, marketProductLinkedContentItemDto.photo) && epx.f(this.video, marketProductLinkedContentItemDto.video);
    }

    public final MarketLinkedContentSourceDto f() {
        return this.source;
    }

    public final VideoVideoFullDto g() {
        return this.video;
    }

    public final int hashCode() {
        int hashCode = (this.contentType.hashCode() + urd0.a(Long.hashCode(this.ownerId.b) * 31, 31, this.trackCode)) * 31;
        MarketLinkedContentSourceDto marketLinkedContentSourceDto = this.source;
        int hashCode2 = (hashCode + (marketLinkedContentSourceDto == null ? 0 : marketLinkedContentSourceDto.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode3 = (hashCode2 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto = this.video;
        return hashCode3 + (videoVideoFullDto != null ? videoVideoFullDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketProductLinkedContentItemDto(ownerId=" + this.ownerId + ", trackCode=" + this.trackCode + ", contentType=" + this.contentType + ", source=" + this.source + ", photo=" + this.photo + ", video=" + this.video + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.trackCode);
        this.contentType.writeToParcel(parcel, i);
        MarketLinkedContentSourceDto marketLinkedContentSourceDto = this.source;
        if (marketLinkedContentSourceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketLinkedContentSourceDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.photo, i);
        parcel.writeParcelable(this.video, i);
    }

    public /* synthetic */ MarketProductLinkedContentItemDto(UserId userId, String str, ContentTypeDto contentTypeDto, MarketLinkedContentSourceDto marketLinkedContentSourceDto, PhotosPhotoDto photosPhotoDto, VideoVideoFullDto videoVideoFullDto, int i, zcl zclVar) {
        this(userId, str, contentTypeDto, (i & 8) != 0 ? null : marketLinkedContentSourceDto, (i & 16) != 0 ? null : photosPhotoDto, (i & 32) != 0 ? null : videoVideoFullDto);
    }
}
