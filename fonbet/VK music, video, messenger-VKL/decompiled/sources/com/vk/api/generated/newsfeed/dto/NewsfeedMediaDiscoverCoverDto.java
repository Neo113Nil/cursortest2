package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseCropPhotoRectDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import ru.ok.android.sdk.SharedKt;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedMediaDiscoverCoverDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedMediaDiscoverCoverDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedMediaDiscoverCoverDto> CREATOR = new a();

    @pmi0(SharedKt.PARAM_ATTACHMENT)
    private final WallWallpostAttachmentDto attachment;

    @pmi0("crop_rect")
    private final BaseCropPhotoRectDto cropRect;

    @pmi0("icon")
    private final IconDto icon;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedMediaDiscoverCoverDto.kt */
    public static final class IconDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconDto[] $VALUES;
        public static final Parcelable.Creator<IconDto> CREATOR;

        @pmi0("logo_vk_clip")
        public static final IconDto LOGO_VK_CLIP;

        @pmi0("logo_vk_video")
        public static final IconDto LOGO_VK_VIDEO;

        @pmi0("picture_stack")
        public static final IconDto PICTURE_STACK;
        private final String value;

        /* compiled from: NewsfeedMediaDiscoverCoverDto.kt */
        public static final class a implements Parcelable.Creator<IconDto> {
            @Override // android.os.Parcelable.Creator
            public final IconDto createFromParcel(Parcel parcel) {
                return IconDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IconDto[] newArray(int i) {
                return new IconDto[i];
            }
        }

        static {
            IconDto iconDto = new IconDto("LOGO_VK_CLIP", 0, "logo_vk_clip");
            LOGO_VK_CLIP = iconDto;
            IconDto iconDto2 = new IconDto("LOGO_VK_VIDEO", 1, "logo_vk_video");
            LOGO_VK_VIDEO = iconDto2;
            IconDto iconDto3 = new IconDto("PICTURE_STACK", 2, "picture_stack");
            PICTURE_STACK = iconDto3;
            IconDto[] iconDtoArr = {iconDto, iconDto2, iconDto3};
            $VALUES = iconDtoArr;
            $ENTRIES = new asp(iconDtoArr);
            CREATOR = new a();
        }

        private IconDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static IconDto valueOf(String str) {
            return (IconDto) Enum.valueOf(IconDto.class, str);
        }

        public static IconDto[] values() {
            return (IconDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: NewsfeedMediaDiscoverCoverDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedMediaDiscoverCoverDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedMediaDiscoverCoverDto createFromParcel(Parcel parcel) {
            return new NewsfeedMediaDiscoverCoverDto((WallWallpostAttachmentDto) parcel.readParcelable(NewsfeedMediaDiscoverCoverDto.class.getClassLoader()), parcel.readInt() == 0 ? null : IconDto.CREATOR.createFromParcel(parcel), (BaseCropPhotoRectDto) parcel.readParcelable(NewsfeedMediaDiscoverCoverDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedMediaDiscoverCoverDto[] newArray(int i) {
            return new NewsfeedMediaDiscoverCoverDto[i];
        }
    }

    public NewsfeedMediaDiscoverCoverDto() {
        this(null, null, null, 7, null);
    }

    public final WallWallpostAttachmentDto d() {
        return this.attachment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final IconDto e() {
        return this.icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedMediaDiscoverCoverDto)) {
            return false;
        }
        NewsfeedMediaDiscoverCoverDto newsfeedMediaDiscoverCoverDto = (NewsfeedMediaDiscoverCoverDto) obj;
        return epx.f(this.attachment, newsfeedMediaDiscoverCoverDto.attachment) && this.icon == newsfeedMediaDiscoverCoverDto.icon && epx.f(this.cropRect, newsfeedMediaDiscoverCoverDto.cropRect);
    }

    public final int hashCode() {
        WallWallpostAttachmentDto wallWallpostAttachmentDto = this.attachment;
        int hashCode = (wallWallpostAttachmentDto == null ? 0 : wallWallpostAttachmentDto.hashCode()) * 31;
        IconDto iconDto = this.icon;
        int hashCode2 = (hashCode + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
        BaseCropPhotoRectDto baseCropPhotoRectDto = this.cropRect;
        return hashCode2 + (baseCropPhotoRectDto != null ? baseCropPhotoRectDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedMediaDiscoverCoverDto(attachment=" + this.attachment + ", icon=" + this.icon + ", cropRect=" + this.cropRect + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.attachment, i);
        IconDto iconDto = this.icon;
        if (iconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.cropRect, i);
    }

    public NewsfeedMediaDiscoverCoverDto(WallWallpostAttachmentDto wallWallpostAttachmentDto, IconDto iconDto, BaseCropPhotoRectDto baseCropPhotoRectDto) {
        this.attachment = wallWallpostAttachmentDto;
        this.icon = iconDto;
        this.cropRect = baseCropPhotoRectDto;
    }

    public /* synthetic */ NewsfeedMediaDiscoverCoverDto(WallWallpostAttachmentDto wallWallpostAttachmentDto, IconDto iconDto, BaseCropPhotoRectDto baseCropPhotoRectDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : wallWallpostAttachmentDto, (i & 2) != 0 ? null : iconDto, (i & 4) != 0 ? null : baseCropPhotoRectDto);
    }
}
