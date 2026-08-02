package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthCheckAuthHashResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthCheckAuthHashResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthCheckAuthHashResponseDto> CREATOR = new a();

    @pmi0("data")
    private final AuthCheckAuthHashDataDto data;

    @pmi0(SharedKt.PARAM_EXPIRES_IN)
    private final Integer expiresIn;

    @pmi0("status")
    private final Integer status;

    /* compiled from: AuthCheckAuthHashResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthCheckAuthHashResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthCheckAuthHashResponseDto createFromParcel(Parcel parcel) {
            return new AuthCheckAuthHashResponseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? AuthCheckAuthHashDataDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthCheckAuthHashResponseDto[] newArray(int i) {
            return new AuthCheckAuthHashResponseDto[i];
        }
    }

    public AuthCheckAuthHashResponseDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthCheckAuthHashResponseDto)) {
            return false;
        }
        AuthCheckAuthHashResponseDto authCheckAuthHashResponseDto = (AuthCheckAuthHashResponseDto) obj;
        return epx.f(this.status, authCheckAuthHashResponseDto.status) && epx.f(this.expiresIn, authCheckAuthHashResponseDto.expiresIn) && epx.f(this.data, authCheckAuthHashResponseDto.data);
    }

    public final int hashCode() {
        Integer num = this.status;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.expiresIn;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        AuthCheckAuthHashDataDto authCheckAuthHashDataDto = this.data;
        return hashCode2 + (authCheckAuthHashDataDto != null ? authCheckAuthHashDataDto.hashCode() : 0);
    }

    public final String toString() {
        return "AuthCheckAuthHashResponseDto(status=" + this.status + ", expiresIn=" + this.expiresIn + ", data=" + this.data + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.expiresIn;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        AuthCheckAuthHashDataDto authCheckAuthHashDataDto = this.data;
        if (authCheckAuthHashDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authCheckAuthHashDataDto.writeToParcel(parcel, i);
        }
    }

    public AuthCheckAuthHashResponseDto(Integer num, Integer num2, AuthCheckAuthHashDataDto authCheckAuthHashDataDto) {
        this.status = num;
        this.expiresIn = num2;
        this.data = authCheckAuthHashDataDto;
    }

    public /* synthetic */ AuthCheckAuthHashResponseDto(Integer num, Integer num2, AuthCheckAuthHashDataDto authCheckAuthHashDataDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : authCheckAuthHashDataDto);
    }
}
