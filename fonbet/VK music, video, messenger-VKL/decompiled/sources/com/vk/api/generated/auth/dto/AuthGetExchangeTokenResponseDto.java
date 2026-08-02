package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthGetExchangeTokenResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetExchangeTokenResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetExchangeTokenResponseDto> CREATOR = new a();

    @pmi0("users_exchange_tokens")
    private final List<AuthUserExchangeTokenDto> usersExchangeTokens;

    /* compiled from: AuthGetExchangeTokenResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetExchangeTokenResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetExchangeTokenResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AuthUserExchangeTokenDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AuthGetExchangeTokenResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetExchangeTokenResponseDto[] newArray(int i) {
            return new AuthGetExchangeTokenResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthGetExchangeTokenResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<AuthUserExchangeTokenDto> d() {
        return this.usersExchangeTokens;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthGetExchangeTokenResponseDto) && epx.f(this.usersExchangeTokens, ((AuthGetExchangeTokenResponseDto) obj).usersExchangeTokens);
    }

    public final int hashCode() {
        List<AuthUserExchangeTokenDto> list = this.usersExchangeTokens;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AuthGetExchangeTokenResponseDto(usersExchangeTokens="), this.usersExchangeTokens);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AuthUserExchangeTokenDto> list = this.usersExchangeTokens;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AuthUserExchangeTokenDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public AuthGetExchangeTokenResponseDto(List<AuthUserExchangeTokenDto> list) {
        this.usersExchangeTokens = list;
    }

    public /* synthetic */ AuthGetExchangeTokenResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
