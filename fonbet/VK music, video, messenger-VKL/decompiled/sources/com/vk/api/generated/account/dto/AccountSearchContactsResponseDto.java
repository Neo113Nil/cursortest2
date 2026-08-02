package com.vk.api.generated.account.dto;

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

/* compiled from: AccountSearchContactsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountSearchContactsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountSearchContactsResponseDto> CREATOR = new a();

    @pmi0("found")
    private final List<AccountSearchContactsFoundObjectDto> found;

    @pmi0("other")
    private final List<AccountSearchContactsOtherObjectDto> other;

    /* compiled from: AccountSearchContactsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountSearchContactsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSearchContactsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(AccountSearchContactsFoundObjectDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(AccountSearchContactsOtherObjectDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new AccountSearchContactsResponseDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSearchContactsResponseDto[] newArray(int i) {
            return new AccountSearchContactsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountSearchContactsResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSearchContactsResponseDto)) {
            return false;
        }
        AccountSearchContactsResponseDto accountSearchContactsResponseDto = (AccountSearchContactsResponseDto) obj;
        return epx.f(this.found, accountSearchContactsResponseDto.found) && epx.f(this.other, accountSearchContactsResponseDto.other);
    }

    public final int hashCode() {
        List<AccountSearchContactsFoundObjectDto> list = this.found;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AccountSearchContactsOtherObjectDto> list2 = this.other;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountSearchContactsResponseDto(found=");
        sb.append(this.found);
        sb.append(", other=");
        return ms9.a(')', sb, this.other);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AccountSearchContactsFoundObjectDto> list = this.found;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AccountSearchContactsFoundObjectDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountSearchContactsOtherObjectDto> list2 = this.other;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((AccountSearchContactsOtherObjectDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public AccountSearchContactsResponseDto(List<AccountSearchContactsFoundObjectDto> list, List<AccountSearchContactsOtherObjectDto> list2) {
        this.found = list;
        this.other = list2;
    }

    public /* synthetic */ AccountSearchContactsResponseDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
