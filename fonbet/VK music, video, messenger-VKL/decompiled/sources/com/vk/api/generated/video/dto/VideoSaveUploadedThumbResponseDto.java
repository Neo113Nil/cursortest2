package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoSaveUploadedThumbResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoSaveUploadedThumbResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoSaveUploadedThumbResponseDto> CREATOR = new a();

    @pmi0("image")
    private final List<VideoVideoImageDto> image;

    @pmi0("photo_hash")
    private final String photoHash;

    @pmi0("photo_id")
    private final long photoId;

    @pmi0("photo_owner_id")
    private final UserId photoOwnerId;

    /* compiled from: VideoSaveUploadedThumbResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoSaveUploadedThumbResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSaveUploadedThumbResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(VideoSaveUploadedThumbResponseDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VideoSaveUploadedThumbResponseDto(readLong, readString, arrayList, (UserId) parcel.readParcelable(VideoSaveUploadedThumbResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSaveUploadedThumbResponseDto[] newArray(int i) {
            return new VideoSaveUploadedThumbResponseDto[i];
        }
    }

    public VideoSaveUploadedThumbResponseDto(long j, String str, List<VideoVideoImageDto> list, UserId userId) {
        this.photoId = j;
        this.photoHash = str;
        this.image = list;
        this.photoOwnerId = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSaveUploadedThumbResponseDto)) {
            return false;
        }
        VideoSaveUploadedThumbResponseDto videoSaveUploadedThumbResponseDto = (VideoSaveUploadedThumbResponseDto) obj;
        return this.photoId == videoSaveUploadedThumbResponseDto.photoId && epx.f(this.photoHash, videoSaveUploadedThumbResponseDto.photoHash) && epx.f(this.image, videoSaveUploadedThumbResponseDto.image) && epx.f(this.photoOwnerId, videoSaveUploadedThumbResponseDto.photoOwnerId);
    }

    public final int hashCode() {
        int a2 = urd0.a(Long.hashCode(this.photoId) * 31, 31, this.photoHash);
        List<VideoVideoImageDto> list = this.image;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        UserId userId = this.photoOwnerId;
        return hashCode + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSaveUploadedThumbResponseDto(photoId=");
        sb.append(this.photoId);
        sb.append(", photoHash=");
        sb.append(this.photoHash);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", photoOwnerId=");
        return gp.b(sb, this.photoOwnerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.photoId);
        parcel.writeString(this.photoHash);
        List<VideoVideoImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.photoOwnerId, i);
    }

    public /* synthetic */ VideoSaveUploadedThumbResponseDto(long j, String str, List list, UserId userId, int i, zcl zclVar) {
        this(j, str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : userId);
    }
}
