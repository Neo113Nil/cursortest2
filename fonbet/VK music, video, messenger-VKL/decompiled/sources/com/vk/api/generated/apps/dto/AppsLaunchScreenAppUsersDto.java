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
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsLaunchScreenAppUsersDto.kt */
/* loaded from: classes14.dex */
public final class AppsLaunchScreenAppUsersDto implements Parcelable {
    public static final Parcelable.Creator<AppsLaunchScreenAppUsersDto> CREATOR = new a();

    @pmi0("count")
    private final String count;

    @pmi0("friends_count")
    private final Integer friendsCount;

    @pmi0("text")
    private final String text;

    @pmi0("top_users")
    private final List<AppsLaunchScreenAppUsersTopUserDto> topUsers;

    @pmi0("type")
    private final String type;

    /* compiled from: AppsLaunchScreenAppUsersDto.kt */
    public static final class a implements Parcelable.Creator<AppsLaunchScreenAppUsersDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsLaunchScreenAppUsersDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsLaunchScreenAppUsersTopUserDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new AppsLaunchScreenAppUsersDto(readString, readString2, valueOf, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsLaunchScreenAppUsersDto[] newArray(int i) {
            return new AppsLaunchScreenAppUsersDto[i];
        }
    }

    public AppsLaunchScreenAppUsersDto(String str, String str2, Integer num, String str3, List<AppsLaunchScreenAppUsersTopUserDto> list) {
        this.type = str;
        this.text = str2;
        this.friendsCount = num;
        this.count = str3;
        this.topUsers = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsLaunchScreenAppUsersDto)) {
            return false;
        }
        AppsLaunchScreenAppUsersDto appsLaunchScreenAppUsersDto = (AppsLaunchScreenAppUsersDto) obj;
        return epx.f(this.type, appsLaunchScreenAppUsersDto.type) && epx.f(this.text, appsLaunchScreenAppUsersDto.text) && epx.f(this.friendsCount, appsLaunchScreenAppUsersDto.friendsCount) && epx.f(this.count, appsLaunchScreenAppUsersDto.count) && epx.f(this.topUsers, appsLaunchScreenAppUsersDto.topUsers);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.type.hashCode() * 31, 31, this.text);
        Integer num = this.friendsCount;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.count;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<AppsLaunchScreenAppUsersTopUserDto> list = this.topUsers;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsLaunchScreenAppUsersDto(type=");
        sb.append(this.type);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", friendsCount=");
        sb.append(this.friendsCount);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", topUsers=");
        return ms9.a(')', sb, this.topUsers);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.text);
        Integer num = this.friendsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.count);
        List<AppsLaunchScreenAppUsersTopUserDto> list = this.topUsers;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AppsLaunchScreenAppUsersTopUserDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsLaunchScreenAppUsersDto(String str, String str2, Integer num, String str3, List list, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list);
    }
}
