package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsFriendsStackDto.kt */
/* loaded from: classes14.dex */
public final class AppsFriendsStackDto implements Parcelable {
    public static final Parcelable.Creator<AppsFriendsStackDto> CREATOR = new a();

    @pmi0("friends")
    private final List<AppsLaunchScreenAppUsersTopUserDto> friends;

    @pmi0("friends_count")
    private final Integer friendsCount;

    @pmi0("text")
    private final String text;

    /* compiled from: AppsFriendsStackDto.kt */
    public static final class a implements Parcelable.Creator<AppsFriendsStackDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsFriendsStackDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsLaunchScreenAppUsersTopUserDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AppsFriendsStackDto(readString, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsFriendsStackDto[] newArray(int i) {
            return new AppsFriendsStackDto[i];
        }
    }

    public AppsFriendsStackDto(String str, Integer num, List<AppsLaunchScreenAppUsersTopUserDto> list) {
        this.text = str;
        this.friendsCount = num;
        this.friends = list;
    }

    public final List<AppsLaunchScreenAppUsersTopUserDto> d() {
        return this.friends;
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
        if (!(obj instanceof AppsFriendsStackDto)) {
            return false;
        }
        AppsFriendsStackDto appsFriendsStackDto = (AppsFriendsStackDto) obj;
        return epx.f(this.text, appsFriendsStackDto.text) && epx.f(this.friendsCount, appsFriendsStackDto.friendsCount) && epx.f(this.friends, appsFriendsStackDto.friends);
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Integer num = this.friendsCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<AppsLaunchScreenAppUsersTopUserDto> list = this.friends;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsFriendsStackDto(text=");
        sb.append(this.text);
        sb.append(", friendsCount=");
        sb.append(this.friendsCount);
        sb.append(", friends=");
        return ms9.a(')', sb, this.friends);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        Integer num = this.friendsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<AppsLaunchScreenAppUsersTopUserDto> list = this.friends;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AppsLaunchScreenAppUsersTopUserDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsFriendsStackDto(String str, Integer num, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list);
    }
}
