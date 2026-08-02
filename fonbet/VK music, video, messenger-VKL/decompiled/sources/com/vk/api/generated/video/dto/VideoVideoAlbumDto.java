package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoVideoAlbumDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoAlbumDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoAlbumDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("parent_id")
    private final Integer parentId;

    @pmi0(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE)
    private final ResponseTypeDto responseType;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final Integer type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoVideoAlbumDto.kt */
    public static final class ResponseTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ResponseTypeDto[] $VALUES;
        public static final Parcelable.Creator<ResponseTypeDto> CREATOR;

        @pmi0("full")
        public static final ResponseTypeDto FULL;

        @pmi0(UcumUtils.UCUM_MINUTES)
        public static final ResponseTypeDto MIN;
        private final String value;

        /* compiled from: VideoVideoAlbumDto.kt */
        public static final class a implements Parcelable.Creator<ResponseTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ResponseTypeDto createFromParcel(Parcel parcel) {
                return ResponseTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ResponseTypeDto[] newArray(int i) {
                return new ResponseTypeDto[i];
            }
        }

        static {
            ResponseTypeDto responseTypeDto = new ResponseTypeDto("MIN", 0, UcumUtils.UCUM_MINUTES);
            MIN = responseTypeDto;
            ResponseTypeDto responseTypeDto2 = new ResponseTypeDto("FULL", 1, "full");
            FULL = responseTypeDto2;
            ResponseTypeDto[] responseTypeDtoArr = {responseTypeDto, responseTypeDto2};
            $VALUES = responseTypeDtoArr;
            $ENTRIES = new asp(responseTypeDtoArr);
            CREATOR = new a();
        }

        private ResponseTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ResponseTypeDto valueOf(String str) {
            return (ResponseTypeDto) Enum.valueOf(ResponseTypeDto.class, str);
        }

        public static ResponseTypeDto[] values() {
            return (ResponseTypeDto[]) $VALUES.clone();
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

    /* compiled from: VideoVideoAlbumDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoAlbumDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoAlbumDto createFromParcel(Parcel parcel) {
            return new VideoVideoAlbumDto(parcel.readInt(), (UserId) parcel.readParcelable(VideoVideoAlbumDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? ResponseTypeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoAlbumDto[] newArray(int i) {
            return new VideoVideoAlbumDto[i];
        }
    }

    public VideoVideoAlbumDto(int i, UserId userId, String str, Integer num, Integer num2, String str2, ResponseTypeDto responseTypeDto) {
        this.id = i;
        this.ownerId = userId;
        this.title = str;
        this.type = num;
        this.parentId = num2;
        this.trackCode = str2;
        this.responseType = responseTypeDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoAlbumDto)) {
            return false;
        }
        VideoVideoAlbumDto videoVideoAlbumDto = (VideoVideoAlbumDto) obj;
        return this.id == videoVideoAlbumDto.id && epx.f(this.ownerId, videoVideoAlbumDto.ownerId) && epx.f(this.title, videoVideoAlbumDto.title) && epx.f(this.type, videoVideoAlbumDto.type) && epx.f(this.parentId, videoVideoAlbumDto.parentId) && epx.f(this.trackCode, videoVideoAlbumDto.trackCode) && this.responseType == videoVideoAlbumDto.responseType;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.title);
        Integer num = this.type;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.parentId;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ResponseTypeDto responseTypeDto = this.responseType;
        return hashCode3 + (responseTypeDto != null ? responseTypeDto.hashCode() : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        return "VideoVideoAlbumDto(id=" + this.id + ", ownerId=" + this.ownerId + ", title=" + this.title + ", type=" + this.type + ", parentId=" + this.parentId + ", trackCode=" + this.trackCode + ", responseType=" + this.responseType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.parentId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.trackCode);
        ResponseTypeDto responseTypeDto = this.responseType;
        if (responseTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            responseTypeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoVideoAlbumDto(int i, UserId userId, String str, Integer num, Integer num2, String str2, ResponseTypeDto responseTypeDto, int i2, zcl zclVar) {
        this(i, userId, str, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : responseTypeDto);
    }
}
