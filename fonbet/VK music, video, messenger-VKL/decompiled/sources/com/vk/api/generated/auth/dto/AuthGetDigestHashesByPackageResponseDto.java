package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AuthGetDigestHashesByPackageResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetDigestHashesByPackageResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetDigestHashesByPackageResponseDto> CREATOR = new a();

    @pmi0("valid_hashes")
    private final List<String> validHashes;

    /* compiled from: AuthGetDigestHashesByPackageResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetDigestHashesByPackageResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetDigestHashesByPackageResponseDto createFromParcel(Parcel parcel) {
            return new AuthGetDigestHashesByPackageResponseDto(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetDigestHashesByPackageResponseDto[] newArray(int i) {
            return new AuthGetDigestHashesByPackageResponseDto[i];
        }
    }

    public AuthGetDigestHashesByPackageResponseDto(List<String> list) {
        this.validHashes = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthGetDigestHashesByPackageResponseDto) && epx.f(this.validHashes, ((AuthGetDigestHashesByPackageResponseDto) obj).validHashes);
    }

    public final int hashCode() {
        return this.validHashes.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AuthGetDigestHashesByPackageResponseDto(validHashes="), this.validHashes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.validHashes);
    }
}
