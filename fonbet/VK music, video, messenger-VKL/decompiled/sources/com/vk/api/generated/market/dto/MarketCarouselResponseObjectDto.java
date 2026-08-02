package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
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

/* compiled from: MarketCarouselResponseObjectDto.kt */
/* loaded from: classes15.dex */
public final class MarketCarouselResponseObjectDto implements Parcelable {
    public static final Parcelable.Creator<MarketCarouselResponseObjectDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MarketCarouselItemObjectDto> items;

    @pmi0("profiles")
    private final List<UsersUserDto> profiles;

    @pmi0("title")
    private final String title;

    @pmi0("view_more_title")
    private final String viewMoreTitle;

    @pmi0("view_more_url")
    private final String viewMoreUrl;

    /* compiled from: MarketCarouselResponseObjectDto.kt */
    public static final class a implements Parcelable.Creator<MarketCarouselResponseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCarouselResponseObjectDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MarketCarouselItemObjectDto.CREATOR, parcel, arrayList, i, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(MarketCarouselResponseObjectDto.class, parcel, arrayList2, i2, 1);
            }
            int readInt3 = parcel.readInt();
            int i3 = 0;
            ArrayList arrayList3 = new ArrayList(readInt3);
            while (i3 != readInt3) {
                i3 = bo.b(MarketCarouselResponseObjectDto.class, parcel, arrayList3, i3, 1);
            }
            return new MarketCarouselResponseObjectDto(readString, arrayList, arrayList2, arrayList3, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCarouselResponseObjectDto[] newArray(int i) {
            return new MarketCarouselResponseObjectDto[i];
        }
    }

    public MarketCarouselResponseObjectDto(String str, List<MarketCarouselItemObjectDto> list, List<GroupsGroupFullDto> list2, List<UsersUserDto> list3, String str2, String str3) {
        this.title = str;
        this.items = list;
        this.groups = list2;
        this.profiles = list3;
        this.viewMoreUrl = str2;
        this.viewMoreTitle = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCarouselResponseObjectDto)) {
            return false;
        }
        MarketCarouselResponseObjectDto marketCarouselResponseObjectDto = (MarketCarouselResponseObjectDto) obj;
        return epx.f(this.title, marketCarouselResponseObjectDto.title) && epx.f(this.items, marketCarouselResponseObjectDto.items) && epx.f(this.groups, marketCarouselResponseObjectDto.groups) && epx.f(this.profiles, marketCarouselResponseObjectDto.profiles) && epx.f(this.viewMoreUrl, marketCarouselResponseObjectDto.viewMoreUrl) && epx.f(this.viewMoreTitle, marketCarouselResponseObjectDto.viewMoreTitle);
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(fw3.a(this.title.hashCode() * 31, 31, this.items), 31, this.groups), 31, this.profiles);
        String str = this.viewMoreUrl;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.viewMoreTitle;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCarouselResponseObjectDto(title=");
        sb.append(this.title);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", viewMoreUrl=");
        sb.append(this.viewMoreUrl);
        sb.append(", viewMoreTitle=");
        return ho8.a(sb, this.viewMoreTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarketCarouselItemObjectDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.groups);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        Iterator a4 = ao.a(parcel, this.profiles);
        while (a4.hasNext()) {
            parcel.writeParcelable((Parcelable) a4.next(), i);
        }
        parcel.writeString(this.viewMoreUrl);
        parcel.writeString(this.viewMoreTitle);
    }

    public /* synthetic */ MarketCarouselResponseObjectDto(String str, List list, List list2, List list3, String str2, String str3, int i, zcl zclVar) {
        this(str, list, list2, list3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
    }
}
