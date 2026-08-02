package com.vk.api.generated.multiaccount.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MultiaccountCheckRelatedUserPinCodeResponseDto.kt */
/* loaded from: classes15.dex */
public final class MultiaccountCheckRelatedUserPinCodeResponseDto implements Parcelable {
    public static final Parcelable.Creator<MultiaccountCheckRelatedUserPinCodeResponseDto> CREATOR = new a();

    @pmi0("hash")
    private final String hash;

    @pmi0("success")
    private final boolean success;

    /* compiled from: MultiaccountCheckRelatedUserPinCodeResponseDto.kt */
    public static final class a implements Parcelable.Creator<MultiaccountCheckRelatedUserPinCodeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MultiaccountCheckRelatedUserPinCodeResponseDto createFromParcel(Parcel parcel) {
            return new MultiaccountCheckRelatedUserPinCodeResponseDto(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiaccountCheckRelatedUserPinCodeResponseDto[] newArray(int i) {
            return new MultiaccountCheckRelatedUserPinCodeResponseDto[i];
        }
    }

    public MultiaccountCheckRelatedUserPinCodeResponseDto(boolean z, String str) {
        this.success = z;
        this.hash = str;
    }

    public final boolean d() {
        return this.success;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiaccountCheckRelatedUserPinCodeResponseDto)) {
            return false;
        }
        MultiaccountCheckRelatedUserPinCodeResponseDto multiaccountCheckRelatedUserPinCodeResponseDto = (MultiaccountCheckRelatedUserPinCodeResponseDto) obj;
        return this.success == multiaccountCheckRelatedUserPinCodeResponseDto.success && epx.f(this.hash, multiaccountCheckRelatedUserPinCodeResponseDto.hash);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.success) * 31;
        String str = this.hash;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiaccountCheckRelatedUserPinCodeResponseDto(success=");
        sb.append(this.success);
        sb.append(", hash=");
        return ho8.a(sb, this.hash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.success ? 1 : 0);
        parcel.writeString(this.hash);
    }

    public /* synthetic */ MultiaccountCheckRelatedUserPinCodeResponseDto(boolean z, String str, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : str);
    }
}
