package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AuthInvalidateExchangeTokenMultiResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthInvalidateExchangeTokenMultiResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthInvalidateExchangeTokenMultiResponseDto> CREATOR = new a();

    @pmi0("results")
    private final List<AuthInvalidateExchangeTokenMultiResultDto> results;

    /* compiled from: AuthInvalidateExchangeTokenMultiResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthInvalidateExchangeTokenMultiResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthInvalidateExchangeTokenMultiResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(AuthInvalidateExchangeTokenMultiResponseDto.class, parcel, arrayList, i, 1);
            }
            return new AuthInvalidateExchangeTokenMultiResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthInvalidateExchangeTokenMultiResponseDto[] newArray(int i) {
            return new AuthInvalidateExchangeTokenMultiResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthInvalidateExchangeTokenMultiResponseDto(List<? extends AuthInvalidateExchangeTokenMultiResultDto> list) {
        this.results = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthInvalidateExchangeTokenMultiResponseDto) && epx.f(this.results, ((AuthInvalidateExchangeTokenMultiResponseDto) obj).results);
    }

    public final int hashCode() {
        return this.results.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AuthInvalidateExchangeTokenMultiResponseDto(results="), this.results);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.results);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
