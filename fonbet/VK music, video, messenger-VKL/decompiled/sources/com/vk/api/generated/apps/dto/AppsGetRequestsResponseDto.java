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
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;

/* compiled from: AppsGetRequestsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetRequestsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetRequestsResponseDto> CREATOR = new a();

    @pmi0("apps")
    private final List<AppsAppDto> apps;

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AppsRequestItemDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: AppsGetRequestsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetRequestsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetRequestsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(AppsRequestItemDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = bo.b(AppsGetRequestsResponseDto.class, parcel, arrayList2, i3, 1);
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt4);
            while (i != readInt4) {
                i = bo.b(AppsGetRequestsResponseDto.class, parcel, arrayList3, i, 1);
            }
            return new AppsGetRequestsResponseDto(arrayList, readInt2, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetRequestsResponseDto[] newArray(int i) {
            return new AppsGetRequestsResponseDto[i];
        }
    }

    public AppsGetRequestsResponseDto(List<AppsRequestItemDto> list, int i, List<UsersUserFullDto> list2, List<AppsAppDto> list3) {
        this.items = list;
        this.count = i;
        this.profiles = list2;
        this.apps = list3;
    }

    public final List<AppsAppDto> d() {
        return this.apps;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AppsRequestItemDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetRequestsResponseDto)) {
            return false;
        }
        AppsGetRequestsResponseDto appsGetRequestsResponseDto = (AppsGetRequestsResponseDto) obj;
        return epx.f(this.items, appsGetRequestsResponseDto.items) && this.count == appsGetRequestsResponseDto.count && epx.f(this.profiles, appsGetRequestsResponseDto.profiles) && epx.f(this.apps, appsGetRequestsResponseDto.apps);
    }

    public final List<UsersUserFullDto> f() {
        return this.profiles;
    }

    public final int hashCode() {
        return this.apps.hashCode() + fw3.a(shy.a(this.count, this.items.hashCode() * 31, 31), 31, this.profiles);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetRequestsResponseDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", apps=");
        return ms9.a(')', sb, this.apps);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AppsRequestItemDto) a2.next()).writeToParcel(parcel, i);
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
    }
}
