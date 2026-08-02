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

/* compiled from: AccountSideMenuDto.kt */
/* loaded from: classes14.dex */
public final class AccountSideMenuDto implements Parcelable {
    public static final Parcelable.Creator<AccountSideMenuDto> CREATOR = new a();

    @pmi0("sections")
    private final List<AccountSideMenuSectionDto> sections;

    /* compiled from: AccountSideMenuDto.kt */
    public static final class a implements Parcelable.Creator<AccountSideMenuDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSideMenuDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AccountSideMenuSectionDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AccountSideMenuDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSideMenuDto[] newArray(int i) {
            return new AccountSideMenuDto[i];
        }
    }

    public AccountSideMenuDto(List<AccountSideMenuSectionDto> list) {
        this.sections = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSideMenuDto) && epx.f(this.sections, ((AccountSideMenuDto) obj).sections);
    }

    public final int hashCode() {
        return this.sections.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AccountSideMenuDto(sections="), this.sections);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.sections);
        while (a2.hasNext()) {
            ((AccountSideMenuSectionDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
