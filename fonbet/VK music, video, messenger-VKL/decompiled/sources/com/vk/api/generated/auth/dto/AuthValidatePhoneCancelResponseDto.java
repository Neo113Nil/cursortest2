package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AuthValidatePhoneCancelResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidatePhoneCancelResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthValidatePhoneCancelResponseDto> CREATOR = new a();

    @pmi0("success")
    private final Integer success;

    /* compiled from: AuthValidatePhoneCancelResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidatePhoneCancelResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthValidatePhoneCancelResponseDto createFromParcel(Parcel parcel) {
            return new AuthValidatePhoneCancelResponseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthValidatePhoneCancelResponseDto[] newArray(int i) {
            return new AuthValidatePhoneCancelResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthValidatePhoneCancelResponseDto() {
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
        return (obj instanceof AuthValidatePhoneCancelResponseDto) && epx.f(this.success, ((AuthValidatePhoneCancelResponseDto) obj).success);
    }

    public final int hashCode() {
        Integer num = this.success;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("AuthValidatePhoneCancelResponseDto(success="), this.success, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.success;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public AuthValidatePhoneCancelResponseDto(Integer num) {
        this.success = num;
    }

    public /* synthetic */ AuthValidatePhoneCancelResponseDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
