package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: DonutGetOneTimePaymentsResponseDto.kt */
/* loaded from: classes14.dex */
public final class DonutGetOneTimePaymentsResponseDto implements Parcelable {
    public static final Parcelable.Creator<DonutGetOneTimePaymentsResponseDto> CREATOR = new a();

    @pmi0("friends_amount")
    private final Integer friendsAmount;

    @pmi0("friends_count")
    private final Integer friendsCount;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("payments")
    private final List<DonutOneTimePaymentDto> payments;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("total_amount")
    private final int totalAmount;

    @pmi0("total_count")
    private final int totalCount;

    /* compiled from: DonutGetOneTimePaymentsResponseDto.kt */
    public static final class a implements Parcelable.Creator<DonutGetOneTimePaymentsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGetOneTimePaymentsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(DonutOneTimePaymentDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(DonutGetOneTimePaymentsResponseDto.class, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new DonutGetOneTimePaymentsResponseDto(arrayList, readInt2, readInt3, valueOf, valueOf2, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGetOneTimePaymentsResponseDto[] newArray(int i) {
            return new DonutGetOneTimePaymentsResponseDto[i];
        }
    }

    public DonutGetOneTimePaymentsResponseDto(List<DonutOneTimePaymentDto> list, int i, int i2, Integer num, Integer num2, List<UsersUserFullDto> list2, String str) {
        this.payments = list;
        this.totalAmount = i;
        this.totalCount = i2;
        this.friendsAmount = num;
        this.friendsCount = num2;
        this.profiles = list2;
        this.nextFrom = str;
    }

    public final String d() {
        return this.nextFrom;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<DonutOneTimePaymentDto> e() {
        return this.payments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutGetOneTimePaymentsResponseDto)) {
            return false;
        }
        DonutGetOneTimePaymentsResponseDto donutGetOneTimePaymentsResponseDto = (DonutGetOneTimePaymentsResponseDto) obj;
        return epx.f(this.payments, donutGetOneTimePaymentsResponseDto.payments) && this.totalAmount == donutGetOneTimePaymentsResponseDto.totalAmount && this.totalCount == donutGetOneTimePaymentsResponseDto.totalCount && epx.f(this.friendsAmount, donutGetOneTimePaymentsResponseDto.friendsAmount) && epx.f(this.friendsCount, donutGetOneTimePaymentsResponseDto.friendsCount) && epx.f(this.profiles, donutGetOneTimePaymentsResponseDto.profiles) && epx.f(this.nextFrom, donutGetOneTimePaymentsResponseDto.nextFrom);
    }

    public final List<UsersUserFullDto> f() {
        return this.profiles;
    }

    public final int g() {
        return this.totalAmount;
    }

    public final int hashCode() {
        int a2 = shy.a(this.totalCount, shy.a(this.totalAmount, this.payments.hashCode() * 31, 31), 31);
        Integer num = this.friendsAmount;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.friendsCount;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.nextFrom;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final int i() {
        return this.totalCount;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutGetOneTimePaymentsResponseDto(payments=");
        sb.append(this.payments);
        sb.append(", totalAmount=");
        sb.append(this.totalAmount);
        sb.append(", totalCount=");
        sb.append(this.totalCount);
        sb.append(", friendsAmount=");
        sb.append(this.friendsAmount);
        sb.append(", friendsCount=");
        sb.append(this.friendsCount);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.payments);
        while (a2.hasNext()) {
            ((DonutOneTimePaymentDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.totalAmount);
        parcel.writeInt(this.totalCount);
        Integer num = this.friendsAmount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.friendsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ DonutGetOneTimePaymentsResponseDto(List list, int i, int i2, Integer num, Integer num2, List list2, String str, int i3, zcl zclVar) {
        this(list, i, i2, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : num2, (i3 & 32) != 0 ? null : list2, (i3 & 64) != 0 ? null : str);
    }
}
