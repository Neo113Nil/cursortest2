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

/* compiled from: AccountSideMenuSectionDto.kt */
/* loaded from: classes14.dex */
public final class AccountSideMenuSectionDto implements Parcelable {
    public static final Parcelable.Creator<AccountSideMenuSectionDto> CREATOR = new a();

    @pmi0("items")
    private final List<AccountSideMenuItemDto> items;

    /* compiled from: AccountSideMenuSectionDto.kt */
    public static final class a implements Parcelable.Creator<AccountSideMenuSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSideMenuSectionDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AccountSideMenuItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AccountSideMenuSectionDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSideMenuSectionDto[] newArray(int i) {
            return new AccountSideMenuSectionDto[i];
        }
    }

    public AccountSideMenuSectionDto(List<AccountSideMenuItemDto> list) {
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSideMenuSectionDto) && epx.f(this.items, ((AccountSideMenuSectionDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AccountSideMenuSectionDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AccountSideMenuItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
