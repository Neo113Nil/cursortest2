package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsGetFriendsDeletionSuggestionsResponseDto.kt */
/* loaded from: classes14.dex */
public final class FriendsGetFriendsDeletionSuggestionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<FriendsGetFriendsDeletionSuggestionsResponseDto> CREATOR = new a();

    @pmi0("mutuals")
    private final List<UsersUserFullDto> mutuals;

    @pmi0("profiles")
    private final FriendsProfilesListDto profiles;

    @pmi0("text")
    private final String text;

    /* compiled from: FriendsGetFriendsDeletionSuggestionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<FriendsGetFriendsDeletionSuggestionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsGetFriendsDeletionSuggestionsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            FriendsProfilesListDto createFromParcel = FriendsProfilesListDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(FriendsGetFriendsDeletionSuggestionsResponseDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new FriendsGetFriendsDeletionSuggestionsResponseDto(readString, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsGetFriendsDeletionSuggestionsResponseDto[] newArray(int i) {
            return new FriendsGetFriendsDeletionSuggestionsResponseDto[i];
        }
    }

    public FriendsGetFriendsDeletionSuggestionsResponseDto(String str, FriendsProfilesListDto friendsProfilesListDto, List<UsersUserFullDto> list) {
        this.text = str;
        this.profiles = friendsProfilesListDto;
        this.mutuals = list;
    }

    public final List<UsersUserFullDto> d() {
        return this.mutuals;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final FriendsProfilesListDto e() {
        return this.profiles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsGetFriendsDeletionSuggestionsResponseDto)) {
            return false;
        }
        FriendsGetFriendsDeletionSuggestionsResponseDto friendsGetFriendsDeletionSuggestionsResponseDto = (FriendsGetFriendsDeletionSuggestionsResponseDto) obj;
        return epx.f(this.text, friendsGetFriendsDeletionSuggestionsResponseDto.text) && epx.f(this.profiles, friendsGetFriendsDeletionSuggestionsResponseDto.profiles) && epx.f(this.mutuals, friendsGetFriendsDeletionSuggestionsResponseDto.mutuals);
    }

    public final String f() {
        return this.text;
    }

    public final int hashCode() {
        int hashCode = (this.profiles.hashCode() + (this.text.hashCode() * 31)) * 31;
        List<UsersUserFullDto> list = this.mutuals;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsGetFriendsDeletionSuggestionsResponseDto(text=");
        sb.append(this.text);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", mutuals=");
        return ms9.a(')', sb, this.mutuals);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        this.profiles.writeToParcel(parcel, i);
        List<UsersUserFullDto> list = this.mutuals;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ FriendsGetFriendsDeletionSuggestionsResponseDto(String str, FriendsProfilesListDto friendsProfilesListDto, List list, int i, zcl zclVar) {
        this(str, friendsProfilesListDto, (i & 4) != 0 ? null : list);
    }
}
