package com.vk.api.generated.reports.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ReportsFormSnippetPhotoDto.kt */
/* loaded from: classes15.dex */
public final class ReportsFormSnippetPhotoDto implements Parcelable {
    public static final Parcelable.Creator<ReportsFormSnippetPhotoDto> CREATOR = new a();

    @pmi0("big")
    private final String big;

    @pmi0("medium")
    private final String medium;

    @pmi0("photo_id")
    private final String photoId;

    @pmi0("small")
    private final String small;

    /* compiled from: ReportsFormSnippetPhotoDto.kt */
    public static final class a implements Parcelable.Creator<ReportsFormSnippetPhotoDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsFormSnippetPhotoDto createFromParcel(Parcel parcel) {
            return new ReportsFormSnippetPhotoDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsFormSnippetPhotoDto[] newArray(int i) {
            return new ReportsFormSnippetPhotoDto[i];
        }
    }

    public ReportsFormSnippetPhotoDto(String str, String str2, String str3, String str4) {
        this.big = str;
        this.medium = str2;
        this.small = str3;
        this.photoId = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportsFormSnippetPhotoDto)) {
            return false;
        }
        ReportsFormSnippetPhotoDto reportsFormSnippetPhotoDto = (ReportsFormSnippetPhotoDto) obj;
        return epx.f(this.big, reportsFormSnippetPhotoDto.big) && epx.f(this.medium, reportsFormSnippetPhotoDto.medium) && epx.f(this.small, reportsFormSnippetPhotoDto.small) && epx.f(this.photoId, reportsFormSnippetPhotoDto.photoId);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.big.hashCode() * 31, 31, this.medium);
        String str = this.small;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photoId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportsFormSnippetPhotoDto(big=");
        sb.append(this.big);
        sb.append(", medium=");
        sb.append(this.medium);
        sb.append(", small=");
        sb.append(this.small);
        sb.append(", photoId=");
        return ho8.a(sb, this.photoId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.big);
        parcel.writeString(this.medium);
        parcel.writeString(this.small);
        parcel.writeString(this.photoId);
    }

    public /* synthetic */ ReportsFormSnippetPhotoDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
