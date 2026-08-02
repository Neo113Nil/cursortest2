package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ClassifiedsSavePhotoResponseDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsSavePhotoResponseDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsSavePhotoResponseDto> CREATOR = new a();

    @pmi0("attachments")
    private final List<String> attachments;

    @pmi0(SignalingProtocol.KEY_THUMBNAILS)
    private final List<ClassifiedsUploadedPhotoThumbnailDto> thumbnails;

    @pmi0("youla_photo_ids")
    private final List<String> youlaPhotoIds;

    /* compiled from: ClassifiedsSavePhotoResponseDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsSavePhotoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsSavePhotoResponseDto createFromParcel(Parcel parcel) {
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ClassifiedsUploadedPhotoThumbnailDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ClassifiedsSavePhotoResponseDto(createStringArrayList, createStringArrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsSavePhotoResponseDto[] newArray(int i) {
            return new ClassifiedsSavePhotoResponseDto[i];
        }
    }

    public ClassifiedsSavePhotoResponseDto(List<String> list, List<String> list2, List<ClassifiedsUploadedPhotoThumbnailDto> list3) {
        this.attachments = list;
        this.youlaPhotoIds = list2;
        this.thumbnails = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsSavePhotoResponseDto)) {
            return false;
        }
        ClassifiedsSavePhotoResponseDto classifiedsSavePhotoResponseDto = (ClassifiedsSavePhotoResponseDto) obj;
        return epx.f(this.attachments, classifiedsSavePhotoResponseDto.attachments) && epx.f(this.youlaPhotoIds, classifiedsSavePhotoResponseDto.youlaPhotoIds) && epx.f(this.thumbnails, classifiedsSavePhotoResponseDto.thumbnails);
    }

    public final int hashCode() {
        return this.thumbnails.hashCode() + fw3.a(this.attachments.hashCode() * 31, 31, this.youlaPhotoIds);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsSavePhotoResponseDto(attachments=");
        sb.append(this.attachments);
        sb.append(", youlaPhotoIds=");
        sb.append(this.youlaPhotoIds);
        sb.append(", thumbnails=");
        return ms9.a(')', sb, this.thumbnails);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.attachments);
        parcel.writeStringList(this.youlaPhotoIds);
        Iterator a2 = ao.a(parcel, this.thumbnails);
        while (a2.hasNext()) {
            ((ClassifiedsUploadedPhotoThumbnailDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
