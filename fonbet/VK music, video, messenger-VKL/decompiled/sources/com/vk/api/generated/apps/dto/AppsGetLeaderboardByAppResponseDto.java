package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsGetLeaderboardByAppResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetLeaderboardByAppResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetLeaderboardByAppResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AppsLeaderboardDto> items;

    @pmi0("profiles")
    private final List<UsersUserDto> profiles;

    @pmi0("user_result")
    private final String userResult;

    /* compiled from: AppsGetLeaderboardByAppResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetLeaderboardByAppResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetLeaderboardByAppResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(AppsLeaderboardDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            while (i != readInt3) {
                i = bo.b(AppsGetLeaderboardByAppResponseDto.class, parcel, arrayList2, i, 1);
            }
            return new AppsGetLeaderboardByAppResponseDto(readInt, arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetLeaderboardByAppResponseDto[] newArray(int i) {
            return new AppsGetLeaderboardByAppResponseDto[i];
        }
    }

    public AppsGetLeaderboardByAppResponseDto(int i, List<AppsLeaderboardDto> list, List<UsersUserDto> list2, String str) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.userResult = str;
    }

    public final List<AppsLeaderboardDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<UsersUserDto> e() {
        return this.profiles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetLeaderboardByAppResponseDto)) {
            return false;
        }
        AppsGetLeaderboardByAppResponseDto appsGetLeaderboardByAppResponseDto = (AppsGetLeaderboardByAppResponseDto) obj;
        return this.count == appsGetLeaderboardByAppResponseDto.count && epx.f(this.items, appsGetLeaderboardByAppResponseDto.items) && epx.f(this.profiles, appsGetLeaderboardByAppResponseDto.profiles) && epx.f(this.userResult, appsGetLeaderboardByAppResponseDto.userResult);
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.profiles);
        String str = this.userResult;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetLeaderboardByAppResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", userResult=");
        return ho8.a(sb, this.userResult, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AppsLeaderboardDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.profiles);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        parcel.writeString(this.userResult);
    }

    public /* synthetic */ AppsGetLeaderboardByAppResponseDto(int i, List list, List list2, String str, int i2, zcl zclVar) {
        this(i, list, list2, (i2 & 8) != 0 ? null : str);
    }
}
