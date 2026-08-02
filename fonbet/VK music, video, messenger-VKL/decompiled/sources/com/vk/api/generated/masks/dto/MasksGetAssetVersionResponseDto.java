package com.vk.api.generated.masks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MasksGetAssetVersionResponseDto.kt */
/* loaded from: classes15.dex */
public final class MasksGetAssetVersionResponseDto implements Parcelable {
    public static final Parcelable.Creator<MasksGetAssetVersionResponseDto> CREATOR = new a();

    @pmi0("doc_id")
    private final String docId;

    @pmi0("doc_url")
    private final String docUrl;

    @pmi0("version_id")
    private final Integer versionId;

    /* compiled from: MasksGetAssetVersionResponseDto.kt */
    public static final class a implements Parcelable.Creator<MasksGetAssetVersionResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MasksGetAssetVersionResponseDto createFromParcel(Parcel parcel) {
            return new MasksGetAssetVersionResponseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MasksGetAssetVersionResponseDto[] newArray(int i) {
            return new MasksGetAssetVersionResponseDto[i];
        }
    }

    public MasksGetAssetVersionResponseDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.docUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.versionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasksGetAssetVersionResponseDto)) {
            return false;
        }
        MasksGetAssetVersionResponseDto masksGetAssetVersionResponseDto = (MasksGetAssetVersionResponseDto) obj;
        return epx.f(this.versionId, masksGetAssetVersionResponseDto.versionId) && epx.f(this.docId, masksGetAssetVersionResponseDto.docId) && epx.f(this.docUrl, masksGetAssetVersionResponseDto.docUrl);
    }

    public final int hashCode() {
        Integer num = this.versionId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.docId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.docUrl;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasksGetAssetVersionResponseDto(versionId=");
        sb.append(this.versionId);
        sb.append(", docId=");
        sb.append(this.docId);
        sb.append(", docUrl=");
        return ho8.a(sb, this.docUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.versionId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.docId);
        parcel.writeString(this.docUrl);
    }

    public MasksGetAssetVersionResponseDto(Integer num, String str, String str2) {
        this.versionId = num;
        this.docId = str;
        this.docUrl = str2;
    }

    public /* synthetic */ MasksGetAssetVersionResponseDto(Integer num, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
