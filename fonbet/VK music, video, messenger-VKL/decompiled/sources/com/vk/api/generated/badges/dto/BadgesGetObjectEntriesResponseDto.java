package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BadgesGetObjectEntriesResponseDto.kt */
/* loaded from: classes14.dex */
public final class BadgesGetObjectEntriesResponseDto implements Parcelable {
    public static final Parcelable.Creator<BadgesGetObjectEntriesResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("donut_miniapp_url")
    private final String donutMiniappUrl;

    @pmi0("entries")
    private final List<BadgesEntryDto> entries;

    @pmi0("next_query")
    private final String nextQuery;

    @pmi0("users")
    private final List<UsersUserFullDto> users;

    /* compiled from: BadgesGetObjectEntriesResponseDto.kt */
    public static final class a implements Parcelable.Creator<BadgesGetObjectEntriesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesGetObjectEntriesResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i = 0;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(BadgesEntryDto.CREATOR, parcel, arrayList4, i2, 1);
                }
                arrayList = arrayList4;
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList5, i3, 1);
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(BadgesGetObjectEntriesResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new BadgesGetObjectEntriesResponseDto(arrayList, readString, readString2, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesGetObjectEntriesResponseDto[] newArray(int i) {
            return new BadgesGetObjectEntriesResponseDto[i];
        }
    }

    public BadgesGetObjectEntriesResponseDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesGetObjectEntriesResponseDto)) {
            return false;
        }
        BadgesGetObjectEntriesResponseDto badgesGetObjectEntriesResponseDto = (BadgesGetObjectEntriesResponseDto) obj;
        return epx.f(this.entries, badgesGetObjectEntriesResponseDto.entries) && epx.f(this.nextQuery, badgesGetObjectEntriesResponseDto.nextQuery) && epx.f(this.donutMiniappUrl, badgesGetObjectEntriesResponseDto.donutMiniappUrl) && epx.f(this.badges, badgesGetObjectEntriesResponseDto.badges) && epx.f(this.users, badgesGetObjectEntriesResponseDto.users);
    }

    public final int hashCode() {
        List<BadgesEntryDto> list = this.entries;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextQuery;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.donutMiniappUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BadgesBadgeDto> list2 = this.badges;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UsersUserFullDto> list3 = this.users;
        return hashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesGetObjectEntriesResponseDto(entries=");
        sb.append(this.entries);
        sb.append(", nextQuery=");
        sb.append(this.nextQuery);
        sb.append(", donutMiniappUrl=");
        sb.append(this.donutMiniappUrl);
        sb.append(", badges=");
        sb.append(this.badges);
        sb.append(", users=");
        return ms9.a(')', sb, this.users);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<BadgesEntryDto> list = this.entries;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BadgesEntryDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.nextQuery);
        parcel.writeString(this.donutMiniappUrl);
        List<BadgesBadgeDto> list2 = this.badges;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((BadgesBadgeDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<UsersUserFullDto> list3 = this.users;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            parcel.writeParcelable((Parcelable) f3.next(), i);
        }
    }

    public BadgesGetObjectEntriesResponseDto(List<BadgesEntryDto> list, String str, String str2, List<BadgesBadgeDto> list2, List<UsersUserFullDto> list3) {
        this.entries = list;
        this.nextQuery = str;
        this.donutMiniappUrl = str2;
        this.badges = list2;
        this.users = list3;
    }

    public /* synthetic */ BadgesGetObjectEntriesResponseDto(List list, String str, String str2, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3);
    }
}
