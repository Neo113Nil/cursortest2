package com.vk.api.generated.money.dto;

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

/* compiled from: MoneyGetNspkMembersResponseDto.kt */
/* loaded from: classes15.dex */
public final class MoneyGetNspkMembersResponseDto implements Parcelable {
    public static final Parcelable.Creator<MoneyGetNspkMembersResponseDto> CREATOR = new a();

    @pmi0("members")
    private final List<MoneyNspkMemberDto> members;

    /* compiled from: MoneyGetNspkMembersResponseDto.kt */
    public static final class a implements Parcelable.Creator<MoneyGetNspkMembersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyGetNspkMembersResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MoneyNspkMemberDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MoneyGetNspkMembersResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyGetNspkMembersResponseDto[] newArray(int i) {
            return new MoneyGetNspkMembersResponseDto[i];
        }
    }

    public MoneyGetNspkMembersResponseDto(List<MoneyNspkMemberDto> list) {
        this.members = list;
    }

    public final List<MoneyNspkMemberDto> d() {
        return this.members;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoneyGetNspkMembersResponseDto) && epx.f(this.members, ((MoneyGetNspkMembersResponseDto) obj).members);
    }

    public final int hashCode() {
        return this.members.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MoneyGetNspkMembersResponseDto(members="), this.members);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.members);
        while (a2.hasNext()) {
            ((MoneyNspkMemberDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
