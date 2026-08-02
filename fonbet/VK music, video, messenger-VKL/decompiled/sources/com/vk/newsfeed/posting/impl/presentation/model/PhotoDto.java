package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vkontakte.android.attachments.PhotoAttachment;
import xsna.bh10;
import xsna.epx;
import xsna.vu5;
import xsna.zcl;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class PhotoDto implements PostingAttachment, UploadDto {
    public static final Parcelable.Creator<PhotoDto> CREATOR = new a();
    public final int b;
    public final Attachment c;
    public final UserId d;
    public final String e;
    public final UploadDto.UploadState f;
    public final long g;
    public final AttachmentType h;

    /* compiled from: PostingViewState.kt */
    public static final class a implements Parcelable.Creator<PhotoDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotoDto createFromParcel(Parcel parcel) {
            return new PhotoDto(parcel.readInt(), (Attachment) parcel.readParcelable(PhotoDto.class.getClassLoader()), (UserId) parcel.readParcelable(PhotoDto.class.getClassLoader()), parcel.readString(), UploadDto.UploadState.CREATOR.createFromParcel(parcel), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoDto[] newArray(int i) {
            return new PhotoDto[i];
        }
    }

    public PhotoDto(int i, Attachment attachment, UserId userId, String str, UploadDto.UploadState uploadState, long j) {
        this.b = i;
        this.c = attachment;
        this.d = userId;
        this.e = str;
        this.f = uploadState;
        this.g = j;
        this.h = AttachmentType.PHOTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.vk.dto.common.Attachment] */
    public static PhotoDto a(PhotoDto photoDto, PhotoAttachment photoAttachment, UploadDto.UploadState uploadState, int i) {
        int i2 = photoDto.b;
        PhotoAttachment photoAttachment2 = photoAttachment;
        if ((i & 2) != 0) {
            photoAttachment2 = photoDto.c;
        }
        PhotoAttachment photoAttachment3 = photoAttachment2;
        UserId userId = photoDto.d;
        String str = photoDto.e;
        if ((i & 16) != 0) {
            uploadState = photoDto.f;
        }
        long j = photoDto.g;
        photoDto.getClass();
        return new PhotoDto(i2, photoAttachment3, userId, str, uploadState, j);
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
        if (!(obj instanceof PhotoDto)) {
            return false;
        }
        PhotoDto photoDto = (PhotoDto) obj;
        return this.b == photoDto.b && epx.f(this.c, photoDto.c) && epx.f(this.d, photoDto.d) && epx.f(this.e, photoDto.e) && epx.f(this.f, photoDto.f) && this.g == photoDto.g;
    }

    @Override // com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment
    public final int getId() {
        return this.b;
    }

    @Override // com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment
    public final AttachmentType getType() {
        return this.h;
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
        StringBuilder sb = new StringBuilder("PhotoDto(id=");
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
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PhotoDto(int i, Attachment attachment, UserId userId, String str, UploadDto.UploadState uploadState, long j, int i2, zcl zclVar) {
        this(i, attachment, r3, r4, uploadState, j);
        UserId userId2 = (i2 & 4) != 0 ? UserId.d : userId;
        String str2 = (i2 & 8) != 0 ? null : str;
        if ((i2 & 16) != 0) {
            UploadDto.b7.getClass();
            uploadState = UploadDto.a.b;
        }
    }
}
