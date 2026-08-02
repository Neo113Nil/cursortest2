package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AuthGetCredentialsForServiceMultiResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetCredentialsForServiceMultiResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetCredentialsForServiceMultiResponseDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_ERRORS)
    private final List<AuthSilentTokenIndexedErrorDto> errors;

    @pmi0("success")
    private final List<AuthSilentTokenIndexedDto> success;

    /* compiled from: AuthGetCredentialsForServiceMultiResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetCredentialsForServiceMultiResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetCredentialsForServiceMultiResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(AuthSilentTokenIndexedDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(AuthSilentTokenIndexedErrorDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new AuthGetCredentialsForServiceMultiResponseDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetCredentialsForServiceMultiResponseDto[] newArray(int i) {
            return new AuthGetCredentialsForServiceMultiResponseDto[i];
        }
    }

    public AuthGetCredentialsForServiceMultiResponseDto(List<AuthSilentTokenIndexedDto> list, List<AuthSilentTokenIndexedErrorDto> list2) {
        this.success = list;
        this.errors = list2;
    }

    public final List<AuthSilentTokenIndexedErrorDto> d() {
        return this.errors;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AuthSilentTokenIndexedDto> e() {
        return this.success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetCredentialsForServiceMultiResponseDto)) {
            return false;
        }
        AuthGetCredentialsForServiceMultiResponseDto authGetCredentialsForServiceMultiResponseDto = (AuthGetCredentialsForServiceMultiResponseDto) obj;
        return epx.f(this.success, authGetCredentialsForServiceMultiResponseDto.success) && epx.f(this.errors, authGetCredentialsForServiceMultiResponseDto.errors);
    }

    public final int hashCode() {
        return this.errors.hashCode() + (this.success.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetCredentialsForServiceMultiResponseDto(success=");
        sb.append(this.success);
        sb.append(", errors=");
        return ms9.a(')', sb, this.errors);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.success);
        while (a2.hasNext()) {
            ((AuthSilentTokenIndexedDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.errors);
        while (a3.hasNext()) {
            ((AuthSilentTokenIndexedErrorDto) a3.next()).writeToParcel(parcel, i);
        }
    }
}
