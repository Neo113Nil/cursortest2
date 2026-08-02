package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AccountTabbarDto.kt */
/* loaded from: classes14.dex */
public final class AccountTabbarDto implements Parcelable {
    public static final Parcelable.Creator<AccountTabbarDto> CREATOR = new a();

    @pmi0("hide_titles")
    private final Boolean hideTitles;

    @pmi0("items")
    private final List<AccountTabbarItemDto> items;

    /* compiled from: AccountTabbarDto.kt */
    public static final class a implements Parcelable.Creator<AccountTabbarDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountTabbarDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AccountTabbarItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AccountTabbarDto(arrayList, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountTabbarDto[] newArray(int i) {
            return new AccountTabbarDto[i];
        }
    }

    public AccountTabbarDto(List<AccountTabbarItemDto> list, Boolean bool) {
        this.items = list;
        this.hideTitles = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountTabbarDto)) {
            return false;
        }
        AccountTabbarDto accountTabbarDto = (AccountTabbarDto) obj;
        return epx.f(this.items, accountTabbarDto.items) && epx.f(this.hideTitles, accountTabbarDto.hideTitles);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Boolean bool = this.hideTitles;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountTabbarDto(items=");
        sb.append(this.items);
        sb.append(", hideTitles=");
        return tn.a(sb, this.hideTitles, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AccountTabbarItemDto) a2.next()).writeToParcel(parcel, i);
        }
        Boolean bool = this.hideTitles;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ AccountTabbarDto(List list, Boolean bool, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : bool);
    }
}
