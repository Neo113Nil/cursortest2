package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.posting.attachments.PendingVideoAttachmentWrapper;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vkontakte.android.attachments.VideoAttachment;
import xsna.bh10;
import xsna.epx;
import xsna.vu5;
import xsna.zcl;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class VideoDto implements PostingAttachment, UploadDto {
    public static final Parcelable.Creator<VideoDto> CREATOR = new a();
    public final int b;
    public final Attachment c;
    public final UserId d;
    public final String e;
    public final UploadDto.UploadState f;
    public final long g;
    public final VideoFile h;
    public final AttachmentType i;
    public final VideoFile j;

    /* compiled from: PostingViewState.kt */
    public static final class a implements Parcelable.Creator<VideoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoDto createFromParcel(Parcel parcel) {
            return new VideoDto(parcel.readInt(), (Attachment) parcel.readParcelable(VideoDto.class.getClassLoader()), (UserId) parcel.readParcelable(VideoDto.class.getClassLoader()), parcel.readString(), UploadDto.UploadState.CREATOR.createFromParcel(parcel), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoDto[] newArray(int i) {
            return new VideoDto[i];
        }
    }

    public VideoDto(int i, Attachment attachment, UserId userId, String str, UploadDto.UploadState uploadState, long j) {
        this.b = i;
        this.c = attachment;
        this.d = userId;
        this.e = str;
        this.f = uploadState;
        this.g = j;
        VideoFile videoFileOld = attachment instanceof VideoAttachment ? ((VideoAttachment) attachment).k : attachment instanceof PendingVideoAttachmentWrapper ? ((PendingVideoAttachmentWrapper) attachment).k : new VideoFileOld();
        this.h = videoFileOld;
        this.i = AttachmentType.VIDEO;
        this.j = videoFileOld;
    }

    public static VideoDto a(VideoDto videoDto, UploadDto.UploadState uploadState) {
        int i = videoDto.b;
        Attachment attachment = videoDto.c;
        UserId userId = videoDto.d;
        String str = videoDto.e;
        long j = videoDto.g;
        videoDto.getClass();
        return new VideoDto(i, attachment, userId, str, uploadState, j);
    }

    @Override // com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto
    public final UploadDto.UploadState I4() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto
    public final long e9() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDto)) {
            return false;
        }
        VideoDto videoDto = (VideoDto) obj;
        return this.b == videoDto.b && epx.f(this.c, videoDto.c) && epx.f(this.d, videoDto.d) && epx.f(this.e, videoDto.e) && epx.f(this.f, videoDto.f) && this.g == videoDto.g;
    }

    @Override // com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment
    public final int getId() {
        return this.b;
    }

    @Override // com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment
    public final AttachmentType getType() {
        return this.i;
    }

    public final int hashCode() {
        int a2 = bh10.a((this.c.hashCode() + (Integer.hashCode(this.b) * 31)) * 31, 31, this.d.b);
        String str = this.e;
        return Long.hashCode(this.g) + ((this.f.hashCode() + ((a2 + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @Override // com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment
    public final Attachment nb() {
        return this.c;
    }

    @Override // com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment
    public final UserId q() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDto(id=");
        sb.append(this.b);
        sb.append(", attachment=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", accessKey=");
        sb.append(this.e);
        sb.append(", uploadState=");
        sb.append(this.f);
        sb.append(", uploadSize=");
        return vu5.a(')', this.g, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        this.f.writeToParcel(parcel, i);
        parcel.writeLong(this.g);
    }

    @Override // com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto
    public final Object x2() {
        return this.j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoDto(int i, Attachment attachment, UserId userId, String str, UploadDto.UploadState uploadState, long j, int i2, zcl zclVar) {
        this(i, attachment, r3, r4, uploadState, j);
        UserId userId2 = (i2 & 4) != 0 ? UserId.d : userId;
        String str2 = (i2 & 8) != 0 ? null : str;
        if ((i2 & 16) != 0) {
            UploadDto.b7.getClass();
            uploadState = UploadDto.a.b;
        }
    }
}
