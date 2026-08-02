package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ClassifiedsUploadedPhotoThumbnailDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsUploadedPhotoThumbnailDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsUploadedPhotoThumbnailDto> CREATOR = new a();

    @pmi0(SharedKt.PARAM_ATTACHMENT)
    private final String attachment;

    @pmi0("url")
    private final String url;

    /* compiled from: ClassifiedsUploadedPhotoThumbnailDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsUploadedPhotoThumbnailDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsUploadedPhotoThumbnailDto createFromParcel(Parcel parcel) {
            return new ClassifiedsUploadedPhotoThumbnailDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsUploadedPhotoThumbnailDto[] newArray(int i) {
            return new ClassifiedsUploadedPhotoThumbnailDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClassifiedsUploadedPhotoThumbnailDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsUploadedPhotoThumbnailDto)) {
            return false;
        }
        ClassifiedsUploadedPhotoThumbnailDto classifiedsUploadedPhotoThumbnailDto = (ClassifiedsUploadedPhotoThumbnailDto) obj;
        return epx.f(this.attachment, classifiedsUploadedPhotoThumbnailDto.attachment) && epx.f(this.url, classifiedsUploadedPhotoThumbnailDto.url);
    }

    public final int hashCode() {
        String str = this.attachment;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsUploadedPhotoThumbnailDto(attachment=");
        sb.append(this.attachment);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.attachment);
        parcel.writeString(this.url);
    }

    public ClassifiedsUploadedPhotoThumbnailDto(String str, String str2) {
        this.attachment = str;
        this.url = str2;
    }

    public /* synthetic */ ClassifiedsUploadedPhotoThumbnailDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
