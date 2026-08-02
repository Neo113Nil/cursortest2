package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: FriendsGetSuggestionsResponseDto.kt */
/* loaded from: classes14.dex */
public final class FriendsGetSuggestionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<FriendsGetSuggestionsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UsersUserFullDto> items;

    /* compiled from: FriendsGetSuggestionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<FriendsGetSuggestionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsGetSuggestionsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(FriendsGetSuggestionsResponseDto.class, parcel, arrayList, i, 1);
            }
            return new FriendsGetSuggestionsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsGetSuggestionsResponseDto[] newArray(int i) {
            return new FriendsGetSuggestionsResponseDto[i];
        }
    }

    public FriendsGetSuggestionsResponseDto(int i, List<UsersUserFullDto> list) {
        this.count = i;
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
        if (!(obj instanceof FriendsGetSuggestionsResponseDto)) {
            return false;
        }
        FriendsGetSuggestionsResponseDto friendsGetSuggestionsResponseDto = (FriendsGetSuggestionsResponseDto) obj;
        return this.count == friendsGetSuggestionsResponseDto.count && epx.f(this.items, friendsGetSuggestionsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsGetSuggestionsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
