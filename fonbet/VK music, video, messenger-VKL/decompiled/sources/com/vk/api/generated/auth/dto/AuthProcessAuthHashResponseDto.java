package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AuthProcessAuthHashResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthProcessAuthHashResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthProcessAuthHashResponseDto> CREATOR = new a();

    @pmi0("status")
    private final Integer status;

    /* compiled from: AuthProcessAuthHashResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthProcessAuthHashResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthProcessAuthHashResponseDto createFromParcel(Parcel parcel) {
            return new AuthProcessAuthHashResponseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthProcessAuthHashResponseDto[] newArray(int i) {
            return new AuthProcessAuthHashResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthProcessAuthHashResponseDto() {
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
        return (obj instanceof AuthProcessAuthHashResponseDto) && epx.f(this.status, ((AuthProcessAuthHashResponseDto) obj).status);
    }

    public final int hashCode() {
        Integer num = this.status;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("AuthProcessAuthHashResponseDto(status="), this.status, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public AuthProcessAuthHashResponseDto(Integer num) {
        this.status = num;
    }

    public /* synthetic */ AuthProcessAuthHashResponseDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
