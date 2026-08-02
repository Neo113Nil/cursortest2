package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsGetBirthdaysSectionProfileDto.kt */
/* loaded from: classes14.dex */
public final class FriendsGetBirthdaysSectionProfileDto implements Parcelable {
    public static final Parcelable.Creator<FriendsGetBirthdaysSectionProfileDto> CREATOR = new a();

    @pmi0("buttons")
    private final List<FriendsGetBirthdaysSectionProfileButtonDto> buttons;

    @pmi0("text")
    private final String text;

    @pmi0("user")
    private final UsersUserFullDto user;

    /* compiled from: FriendsGetBirthdaysSectionProfileDto.kt */
    public static final class a implements Parcelable.Creator<FriendsGetBirthdaysSectionProfileDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsGetBirthdaysSectionProfileDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            UsersUserFullDto usersUserFullDto = (UsersUserFullDto) parcel.readParcelable(FriendsGetBirthdaysSectionProfileDto.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(FriendsGetBirthdaysSectionProfileButtonDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new FriendsGetBirthdaysSectionProfileDto(usersUserFullDto, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsGetBirthdaysSectionProfileDto[] newArray(int i) {
            return new FriendsGetBirthdaysSectionProfileDto[i];
        }
    }

    public FriendsGetBirthdaysSectionProfileDto() {
        this(null, null, null, 7, null);
    }

    public final List<FriendsGetBirthdaysSectionProfileButtonDto> d() {
        return this.buttons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsGetBirthdaysSectionProfileDto)) {
            return false;
        }
        FriendsGetBirthdaysSectionProfileDto friendsGetBirthdaysSectionProfileDto = (FriendsGetBirthdaysSectionProfileDto) obj;
        return epx.f(this.user, friendsGetBirthdaysSectionProfileDto.user) && epx.f(this.text, friendsGetBirthdaysSectionProfileDto.text) && epx.f(this.buttons, friendsGetBirthdaysSectionProfileDto.buttons);
    }

    public final UsersUserFullDto f() {
        return this.user;
    }

    public final int hashCode() {
        UsersUserFullDto usersUserFullDto = this.user;
        int hashCode = (usersUserFullDto == null ? 0 : usersUserFullDto.hashCode()) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<FriendsGetBirthdaysSectionProfileButtonDto> list = this.buttons;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsGetBirthdaysSectionProfileDto(user=");
        sb.append(this.user);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", buttons=");
        return ms9.a(')', sb, this.buttons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.user, i);
        parcel.writeString(this.text);
        List<FriendsGetBirthdaysSectionProfileButtonDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((FriendsGetBirthdaysSectionProfileButtonDto) f.next()).writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendsGetBirthdaysSectionProfileDto(UsersUserFullDto usersUserFullDto, String str, List<? extends FriendsGetBirthdaysSectionProfileButtonDto> list) {
        this.user = usersUserFullDto;
        this.text = str;
        this.buttons = list;
    }

    public /* synthetic */ FriendsGetBirthdaysSectionProfileDto(UsersUserFullDto usersUserFullDto, String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : usersUserFullDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}
