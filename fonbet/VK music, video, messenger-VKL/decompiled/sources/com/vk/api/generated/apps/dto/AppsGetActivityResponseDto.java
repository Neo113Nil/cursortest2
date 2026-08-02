package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: AppsGetActivityResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetActivityResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetActivityResponseDto> CREATOR = new a();

    @pmi0("apps")
    private final List<AppsAppDto> apps;

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AppsActivityItemDto> items;

    @pmi0("next_from")
    private final Integer nextFrom;

    @pmi0("offset_news")
    private final String offsetNews;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: AppsGetActivityResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetActivityResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetActivityResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(AppsActivityItemDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = bo.b(AppsGetActivityResponseDto.class, parcel, arrayList2, i3, 1);
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt4);
            while (i != readInt4) {
                i = bo.b(AppsGetActivityResponseDto.class, parcel, arrayList3, i, 1);
            }
            return new AppsGetActivityResponseDto(arrayList, readInt2, arrayList2, arrayList3, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetActivityResponseDto[] newArray(int i) {
            return new AppsGetActivityResponseDto[i];
        }
    }

    public AppsGetActivityResponseDto(List<AppsActivityItemDto> list, int i, List<UsersUserFullDto> list2, List<AppsAppDto> list3, Integer num, String str) {
        this.items = list;
        this.count = i;
        this.profiles = list2;
        this.apps = list3;
        this.nextFrom = num;
        this.offsetNews = str;
    }

    public final List<AppsAppDto> d() {
        return this.apps;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AppsActivityItemDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetActivityResponseDto)) {
            return false;
        }
        AppsGetActivityResponseDto appsGetActivityResponseDto = (AppsGetActivityResponseDto) obj;
        return epx.f(this.items, appsGetActivityResponseDto.items) && this.count == appsGetActivityResponseDto.count && epx.f(this.profiles, appsGetActivityResponseDto.profiles) && epx.f(this.apps, appsGetActivityResponseDto.apps) && epx.f(this.nextFrom, appsGetActivityResponseDto.nextFrom) && epx.f(this.offsetNews, appsGetActivityResponseDto.offsetNews);
    }

    public final List<UsersUserFullDto> f() {
        return this.profiles;
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(shy.a(this.count, this.items.hashCode() * 31, 31), 31, this.profiles), 31, this.apps);
        Integer num = this.nextFrom;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.offsetNews;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetActivityResponseDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", apps=");
        sb.append(this.apps);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", offsetNews=");
        return ho8.a(sb, this.offsetNews, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AppsActivityItemDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
        Iterator a3 = ao.a(parcel, this.profiles);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        Iterator a4 = ao.a(parcel, this.apps);
        while (a4.hasNext()) {
            parcel.writeParcelable((Parcelable) a4.next(), i);
        }
        Integer num = this.nextFrom;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.offsetNews);
    }

    public /* synthetic */ AppsGetActivityResponseDto(List list, int i, List list2, List list3, Integer num, String str, int i2, zcl zclVar) {
        this(list, i, list2, list3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : str);
    }
}
