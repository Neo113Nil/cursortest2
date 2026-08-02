package com.vk.api.generated.account.dto;

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

/* compiled from: AccountGetTogglesAnonymResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetTogglesAnonymResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetTogglesAnonymResponseDto> CREATOR = new a();

    @pmi0("toggles")
    private final List<AccountToggleDto> toggles;

    /* compiled from: AccountGetTogglesAnonymResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetTogglesAnonymResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetTogglesAnonymResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AccountToggleDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AccountGetTogglesAnonymResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetTogglesAnonymResponseDto[] newArray(int i) {
            return new AccountGetTogglesAnonymResponseDto[i];
        }
    }

    public AccountGetTogglesAnonymResponseDto(List<AccountToggleDto> list) {
        this.toggles = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountGetTogglesAnonymResponseDto) && epx.f(this.toggles, ((AccountGetTogglesAnonymResponseDto) obj).toggles);
    }

    public final int hashCode() {
        return this.toggles.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AccountGetTogglesAnonymResponseDto(toggles="), this.toggles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.toggles);
        while (a2.hasNext()) {
            ((AccountToggleDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
