package com.vk.api.generated.friends.dto;

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

/* compiled from: FriendsGetBirthdaysSectionDto.kt */
/* loaded from: classes14.dex */
public final class FriendsGetBirthdaysSectionDto implements Parcelable {
    public static final Parcelable.Creator<FriendsGetBirthdaysSectionDto> CREATOR = new a();

    @pmi0("profiles")
    private final List<FriendsGetBirthdaysSectionProfileDto> profiles;

    @pmi0("title")
    private final String title;

    /* compiled from: FriendsGetBirthdaysSectionDto.kt */
    public static final class a implements Parcelable.Creator<FriendsGetBirthdaysSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsGetBirthdaysSectionDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(FriendsGetBirthdaysSectionProfileDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new FriendsGetBirthdaysSectionDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsGetBirthdaysSectionDto[] newArray(int i) {
            return new FriendsGetBirthdaysSectionDto[i];
        }
    }

    public FriendsGetBirthdaysSectionDto(String str, List<FriendsGetBirthdaysSectionProfileDto> list) {
        this.title = str;
        this.profiles = list;
    }

    public final List<FriendsGetBirthdaysSectionProfileDto> d() {
        return this.profiles;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsGetBirthdaysSectionDto)) {
            return false;
        }
        FriendsGetBirthdaysSectionDto friendsGetBirthdaysSectionDto = (FriendsGetBirthdaysSectionDto) obj;
        return epx.f(this.title, friendsGetBirthdaysSectionDto.title) && epx.f(this.profiles, friendsGetBirthdaysSectionDto.profiles);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        List<FriendsGetBirthdaysSectionProfileDto> list = this.profiles;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsGetBirthdaysSectionDto(title=");
        sb.append(this.title);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        List<FriendsGetBirthdaysSectionProfileDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((FriendsGetBirthdaysSectionProfileDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ FriendsGetBirthdaysSectionDto(String str, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
