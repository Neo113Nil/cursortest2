package com.vk.api.generated.friends.dto;

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

/* compiled from: FriendsGetListsResponseDto.kt */
/* loaded from: classes14.dex */
public final class FriendsGetListsResponseDto implements Parcelable {
    public static final Parcelable.Creator<FriendsGetListsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<FriendsFriendsListDto> items;

    /* compiled from: FriendsGetListsResponseDto.kt */
    public static final class a implements Parcelable.Creator<FriendsGetListsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsGetListsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(FriendsFriendsListDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new FriendsGetListsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsGetListsResponseDto[] newArray(int i) {
            return new FriendsGetListsResponseDto[i];
        }
    }

    public FriendsGetListsResponseDto(int i, List<FriendsFriendsListDto> list) {
        this.count = i;
        this.items = list;
    }

    public final List<FriendsFriendsListDto> d() {
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
        if (!(obj instanceof FriendsGetListsResponseDto)) {
            return false;
        }
        FriendsGetListsResponseDto friendsGetListsResponseDto = (FriendsGetListsResponseDto) obj;
        return this.count == friendsGetListsResponseDto.count && epx.f(this.items, friendsGetListsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsGetListsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((FriendsFriendsListDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
