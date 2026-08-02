package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AuthGetSilentTokensResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetSilentTokensResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetSilentTokensResponseDto> CREATOR = new a();

    @pmi0("tokens")
    private final List<AuthSilentTokenDto> tokens;

    /* compiled from: AuthGetSilentTokensResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetSilentTokensResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetSilentTokensResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AuthSilentTokenDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AuthGetSilentTokensResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetSilentTokensResponseDto[] newArray(int i) {
            return new AuthGetSilentTokensResponseDto[i];
        }
    }

    public AuthGetSilentTokensResponseDto(List<AuthSilentTokenDto> list) {
        this.tokens = list;
    }

    public final List<AuthSilentTokenDto> d() {
        return this.tokens;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthGetSilentTokensResponseDto) && epx.f(this.tokens, ((AuthGetSilentTokensResponseDto) obj).tokens);
    }

    public final int hashCode() {
        return this.tokens.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AuthGetSilentTokensResponseDto(tokens="), this.tokens);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.tokens);
        while (a2.hasNext()) {
            ((AuthSilentTokenDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
