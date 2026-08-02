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

/* compiled from: AuthRefreshTrustedHashesResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthRefreshTrustedHashesResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthRefreshTrustedHashesResponseDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_ERRORS)
    private final List<AuthTrustedHashIndexedErrorDto> errors;

    @pmi0("success")
    private final List<AuthTrustedHashIndexedDto> success;

    /* compiled from: AuthRefreshTrustedHashesResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthRefreshTrustedHashesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthRefreshTrustedHashesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(AuthTrustedHashIndexedDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(AuthTrustedHashIndexedErrorDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new AuthRefreshTrustedHashesResponseDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthRefreshTrustedHashesResponseDto[] newArray(int i) {
            return new AuthRefreshTrustedHashesResponseDto[i];
        }
    }

    public AuthRefreshTrustedHashesResponseDto(List<AuthTrustedHashIndexedDto> list, List<AuthTrustedHashIndexedErrorDto> list2) {
        this.success = list;
        this.errors = list2;
    }

    public final List<AuthTrustedHashIndexedErrorDto> d() {
        return this.errors;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AuthTrustedHashIndexedDto> e() {
        return this.success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthRefreshTrustedHashesResponseDto)) {
            return false;
        }
        AuthRefreshTrustedHashesResponseDto authRefreshTrustedHashesResponseDto = (AuthRefreshTrustedHashesResponseDto) obj;
        return epx.f(this.success, authRefreshTrustedHashesResponseDto.success) && epx.f(this.errors, authRefreshTrustedHashesResponseDto.errors);
    }

    public final int hashCode() {
        return this.errors.hashCode() + (this.success.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthRefreshTrustedHashesResponseDto(success=");
        sb.append(this.success);
        sb.append(", errors=");
        return ms9.a(')', sb, this.errors);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.success);
        while (a2.hasNext()) {
            ((AuthTrustedHashIndexedDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.errors);
        while (a3.hasNext()) {
            ((AuthTrustedHashIndexedErrorDto) a3.next()).writeToParcel(parcel, i);
        }
    }
}
