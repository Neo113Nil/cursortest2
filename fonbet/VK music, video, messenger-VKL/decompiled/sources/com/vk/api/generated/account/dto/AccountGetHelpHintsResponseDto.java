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
import xsna.vu5;

/* compiled from: AccountGetHelpHintsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetHelpHintsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetHelpHintsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AccountHelpHintDto> items;

    /* compiled from: AccountGetHelpHintsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetHelpHintsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetHelpHintsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AccountHelpHintDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AccountGetHelpHintsResponseDto(arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetHelpHintsResponseDto[] newArray(int i) {
            return new AccountGetHelpHintsResponseDto[i];
        }
    }

    public AccountGetHelpHintsResponseDto(List<AccountHelpHintDto> list, int i) {
        this.items = list;
        this.count = i;
    }

    public final List<AccountHelpHintDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountGetHelpHintsResponseDto)) {
            return false;
        }
        AccountGetHelpHintsResponseDto accountGetHelpHintsResponseDto = (AccountGetHelpHintsResponseDto) obj;
        return epx.f(this.items, accountGetHelpHintsResponseDto.items) && this.count == accountGetHelpHintsResponseDto.count;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count) + (this.items.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountGetHelpHintsResponseDto(items=");
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
