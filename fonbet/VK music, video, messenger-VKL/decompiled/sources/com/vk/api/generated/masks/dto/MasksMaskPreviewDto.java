package com.vk.api.generated.masks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MasksMaskPreviewDto.kt */
/* loaded from: classes15.dex */
public final class MasksMaskPreviewDto implements Parcelable {
    public static final Parcelable.Creator<MasksMaskPreviewDto> CREATOR = new a();

    @pmi0("preview_150")
    private final String preview150;

    @pmi0("preview_300")
    private final String preview300;

    /* compiled from: MasksMaskPreviewDto.kt */
    public static final class a implements Parcelable.Creator<MasksMaskPreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final MasksMaskPreviewDto createFromParcel(Parcel parcel) {
            return new MasksMaskPreviewDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MasksMaskPreviewDto[] newArray(int i) {
            return new MasksMaskPreviewDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MasksMaskPreviewDto() {
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
        if (!(obj instanceof MasksMaskPreviewDto)) {
            return false;
        }
        MasksMaskPreviewDto masksMaskPreviewDto = (MasksMaskPreviewDto) obj;
        return epx.f(this.preview150, masksMaskPreviewDto.preview150) && epx.f(this.preview300, masksMaskPreviewDto.preview300);
    }

    public final int hashCode() {
        String str = this.preview150;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.preview300;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasksMaskPreviewDto(preview150=");
        sb.append(this.preview150);
        sb.append(", preview300=");
        return ho8.a(sb, this.preview300, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.preview150);
        parcel.writeString(this.preview300);
    }

    public MasksMaskPreviewDto(String str, String str2) {
        this.preview150 = str;
        this.preview300 = str2;
    }

    public /* synthetic */ MasksMaskPreviewDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
