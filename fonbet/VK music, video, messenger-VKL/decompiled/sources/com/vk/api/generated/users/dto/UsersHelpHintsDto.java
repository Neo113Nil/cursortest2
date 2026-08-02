package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.account.dto.AccountHelpHintDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: UsersHelpHintsDto.kt */
/* loaded from: classes15.dex */
public final class UsersHelpHintsDto implements Parcelable {
    public static final Parcelable.Creator<UsersHelpHintsDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AccountHelpHintDto> items;

    /* compiled from: UsersHelpHintsDto.kt */
    public static final class a implements Parcelable.Creator<UsersHelpHintsDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersHelpHintsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AccountHelpHintDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new UsersHelpHintsDto(arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersHelpHintsDto[] newArray(int i) {
            return new UsersHelpHintsDto[i];
        }
    }

    public UsersHelpHintsDto(List<AccountHelpHintDto> list, int i) {
        this.items = list;
        this.count = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersHelpHintsDto)) {
            return false;
        }
        UsersHelpHintsDto usersHelpHintsDto = (UsersHelpHintsDto) obj;
        return epx.f(this.items, usersHelpHintsDto.items) && this.count == usersHelpHintsDto.count;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count) + (this.items.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersHelpHintsDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        return vu5.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AccountHelpHintDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
    }
}
