package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesUploadResultDto.kt */
/* loaded from: classes15.dex */
public final class StoriesUploadResultDto implements Parcelable {
    public static final Parcelable.Creator<StoriesUploadResultDto> CREATOR = new a();

    @pmi0("upload_result")
    private final String uploadResult;

    /* compiled from: StoriesUploadResultDto.kt */
    public static final class a implements Parcelable.Creator<StoriesUploadResultDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesUploadResultDto createFromParcel(Parcel parcel) {
            return new StoriesUploadResultDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesUploadResultDto[] newArray(int i) {
            return new StoriesUploadResultDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoriesUploadResultDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoriesUploadResultDto) && epx.f(this.uploadResult, ((StoriesUploadResultDto) obj).uploadResult);
    }

    public final int hashCode() {
        String str = this.uploadResult;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("StoriesUploadResultDto(uploadResult="), this.uploadResult, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uploadResult);
    }

    public StoriesUploadResultDto(String str) {
        this.uploadResult = str;
    }

    public /* synthetic */ StoriesUploadResultDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
