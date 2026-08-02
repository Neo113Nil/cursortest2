package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountMenuDto.kt */
/* loaded from: classes14.dex */
public final class AccountMenuDto implements Parcelable {
    public static final Parcelable.Creator<AccountMenuDto> CREATOR = new a();

    @pmi0(X3.i.Z)
    private final List<AccountMenuItemDto> main;

    @pmi0("other")
    private final List<AccountMenuItemDto> other;

    @pmi0("special")
    private final List<AccountMenuItemDto> special;

    /* compiled from: AccountMenuDto.kt */
    public static final class a implements Parcelable.Creator<AccountMenuDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountMenuDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(AccountMenuDto.class, parcel, arrayList2, i2, 1);
            }
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(AccountMenuDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(AccountMenuDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new AccountMenuDto(arrayList2, arrayList, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountMenuDto[] newArray(int i) {
            return new AccountMenuDto[i];
        }
    }

    public AccountMenuDto(List<AccountMenuItemDto> list, List<AccountMenuItemDto> list2, List<AccountMenuItemDto> list3) {
        this.main = list;
        this.other = list2;
        this.special = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountMenuDto)) {
            return false;
        }
        AccountMenuDto accountMenuDto = (AccountMenuDto) obj;
        return epx.f(this.main, accountMenuDto.main) && epx.f(this.other, accountMenuDto.other) && epx.f(this.special, accountMenuDto.special);
    }

    public final int hashCode() {
        int hashCode = this.main.hashCode() * 31;
        List<AccountMenuItemDto> list = this.other;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AccountMenuItemDto> list2 = this.special;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountMenuDto(main=");
        sb.append(this.main);
        sb.append(", other=");
        sb.append(this.other);
        sb.append(", special=");
        return ms9.a(')', sb, this.special);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.main);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        List<AccountMenuItemDto> list = this.other;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<AccountMenuItemDto> list2 = this.special;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public /* synthetic */ AccountMenuDto(List list, List list2, List list3, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}
