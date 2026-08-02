package com.vk.api.generated.ecosystem.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: EcosystemGetMaxSessionStatusResponseDto.kt */
/* loaded from: classes14.dex */
public final class EcosystemGetMaxSessionStatusResponseDto implements Parcelable {
    public static final Parcelable.Creator<EcosystemGetMaxSessionStatusResponseDto> CREATOR = new a();

    @pmi0("code")
    private final String code;

    @pmi0("status")
    private final int status;

    /* compiled from: EcosystemGetMaxSessionStatusResponseDto.kt */
    public static final class a implements Parcelable.Creator<EcosystemGetMaxSessionStatusResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final EcosystemGetMaxSessionStatusResponseDto createFromParcel(Parcel parcel) {
            return new EcosystemGetMaxSessionStatusResponseDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EcosystemGetMaxSessionStatusResponseDto[] newArray(int i) {
            return new EcosystemGetMaxSessionStatusResponseDto[i];
        }
    }

    public EcosystemGetMaxSessionStatusResponseDto(int i, String str) {
        this.status = i;
        this.code = str;
    }

    public final String d() {
        return this.code;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcosystemGetMaxSessionStatusResponseDto)) {
            return false;
        }
        EcosystemGetMaxSessionStatusResponseDto ecosystemGetMaxSessionStatusResponseDto = (EcosystemGetMaxSessionStatusResponseDto) obj;
        return this.status == ecosystemGetMaxSessionStatusResponseDto.status && epx.f(this.code, ecosystemGetMaxSessionStatusResponseDto.code);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.status) * 31;
        String str = this.code;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EcosystemGetMaxSessionStatusResponseDto(status=");
        sb.append(this.status);
        sb.append(", code=");
        return ho8.a(sb, this.code, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.status);
        parcel.writeString(this.code);
    }

    public /* synthetic */ EcosystemGetMaxSessionStatusResponseDto(int i, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str);
    }
}
