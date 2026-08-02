package com.vk.api.generated.narratives.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NarrativesGetCustomCoverUploadServerResponseDto.kt */
/* loaded from: classes15.dex */
public final class NarrativesGetCustomCoverUploadServerResponseDto implements Parcelable {
    public static final Parcelable.Creator<NarrativesGetCustomCoverUploadServerResponseDto> CREATOR = new a();

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    /* compiled from: NarrativesGetCustomCoverUploadServerResponseDto.kt */
    public static final class a implements Parcelable.Creator<NarrativesGetCustomCoverUploadServerResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NarrativesGetCustomCoverUploadServerResponseDto createFromParcel(Parcel parcel) {
            return new NarrativesGetCustomCoverUploadServerResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NarrativesGetCustomCoverUploadServerResponseDto[] newArray(int i) {
            return new NarrativesGetCustomCoverUploadServerResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NarrativesGetCustomCoverUploadServerResponseDto() {
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
        return (obj instanceof NarrativesGetCustomCoverUploadServerResponseDto) && epx.f(this.uploadUrl, ((NarrativesGetCustomCoverUploadServerResponseDto) obj).uploadUrl);
    }

    public final int hashCode() {
        String str = this.uploadUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("NarrativesGetCustomCoverUploadServerResponseDto(uploadUrl="), this.uploadUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uploadUrl);
    }

    public NarrativesGetCustomCoverUploadServerResponseDto(String str) {
        this.uploadUrl = str;
    }

    public /* synthetic */ NarrativesGetCustomCoverUploadServerResponseDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
