package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserMinDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsGetCollectionAppsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetCollectionAppsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetCollectionAppsResponseDto> CREATOR = new a();

    @pmi0("collection")
    private final AppsCollectionItemDto collection;

    @pmi0("count")
    private final int count;

    @pmi0("games_items")
    private final List<AppsMiniappsCatalogGameDto> gamesItems;

    @pmi0("items")
    private final List<AppsAppDto> items;

    @pmi0("profiles")
    private final List<UsersUserMinDto> profiles;

    /* compiled from: AppsGetCollectionAppsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetCollectionAppsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetCollectionAppsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(AppsGetCollectionAppsResponseDto.class, parcel, arrayList3, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(AppsMiniappsCatalogGameDto.CREATOR, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(AppsGetCollectionAppsResponseDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new AppsGetCollectionAppsResponseDto(readInt, arrayList3, arrayList, arrayList2, parcel.readInt() != 0 ? AppsCollectionItemDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetCollectionAppsResponseDto[] newArray(int i) {
            return new AppsGetCollectionAppsResponseDto[i];
        }
    }

    public AppsGetCollectionAppsResponseDto(int i, List<AppsAppDto> list, List<AppsMiniappsCatalogGameDto> list2, List<UsersUserMinDto> list3, AppsCollectionItemDto appsCollectionItemDto) {
        this.count = i;
        this.items = list;
        this.gamesItems = list2;
        this.profiles = list3;
        this.collection = appsCollectionItemDto;
    }

    public final AppsCollectionItemDto d() {
        return this.collection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AppsMiniappsCatalogGameDto> e() {
        return this.gamesItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetCollectionAppsResponseDto)) {
            return false;
        }
        AppsGetCollectionAppsResponseDto appsGetCollectionAppsResponseDto = (AppsGetCollectionAppsResponseDto) obj;
        return this.count == appsGetCollectionAppsResponseDto.count && epx.f(this.items, appsGetCollectionAppsResponseDto.items) && epx.f(this.gamesItems, appsGetCollectionAppsResponseDto.gamesItems) && epx.f(this.profiles, appsGetCollectionAppsResponseDto.profiles) && epx.f(this.collection, appsGetCollectionAppsResponseDto.collection);
    }

    public final List<AppsAppDto> f() {
        return this.items;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<AppsMiniappsCatalogGameDto> list = this.gamesItems;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserMinDto> list2 = this.profiles;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        AppsCollectionItemDto appsCollectionItemDto = this.collection;
        return hashCode2 + (appsCollectionItemDto != null ? appsCollectionItemDto.hashCode() : 0);
    }

    public final String toString() {
        return "AppsGetCollectionAppsResponseDto(count=" + this.count + ", items=" + this.items + ", gamesItems=" + this.gamesItems + ", profiles=" + this.profiles + ", collection=" + this.collection + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        List<AppsMiniappsCatalogGameDto> list = this.gamesItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AppsMiniappsCatalogGameDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<UsersUserMinDto> list2 = this.profiles;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        AppsCollectionItemDto appsCollectionItemDto = this.collection;
        if (appsCollectionItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsCollectionItemDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsGetCollectionAppsResponseDto(int i, List list, List list2, List list3, AppsCollectionItemDto appsCollectionItemDto, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : appsCollectionItemDto);
    }
}
