package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseButtonDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: AppsMiniappsCatalogDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogDto> CREATOR = new a();

    @pmi0("actions")
    private final List<ExploreWidgetsBaseButtonDto> actions;

    @pmi0("apps")
    private final List<AppsAppDto> apps;

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AppsMiniappsCatalogItemDto> items;

    /* compiled from: AppsMiniappsCatalogDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(AppsMiniappsCatalogItemDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = bo.b(AppsMiniappsCatalogDto.class, parcel, arrayList3, i3, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(ExploreWidgetsBaseButtonDto.CREATOR, parcel, arrayList4, i, 1);
                }
                arrayList = arrayList4;
            }
            return new AppsMiniappsCatalogDto(arrayList2, readInt2, arrayList3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogDto[] newArray(int i) {
            return new AppsMiniappsCatalogDto[i];
        }
    }

    public AppsMiniappsCatalogDto(List<AppsMiniappsCatalogItemDto> list, int i, List<AppsAppDto> list2, List<ExploreWidgetsBaseButtonDto> list3) {
        this.items = list;
        this.count = i;
        this.apps = list2;
        this.actions = list3;
    }

    public final List<AppsAppDto> d() {
        return this.apps;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AppsMiniappsCatalogItemDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsCatalogDto)) {
            return false;
        }
        AppsMiniappsCatalogDto appsMiniappsCatalogDto = (AppsMiniappsCatalogDto) obj;
        return epx.f(this.items, appsMiniappsCatalogDto.items) && this.count == appsMiniappsCatalogDto.count && epx.f(this.apps, appsMiniappsCatalogDto.apps) && epx.f(this.actions, appsMiniappsCatalogDto.actions);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(shy.a(this.count, this.items.hashCode() * 31, 31), 31, this.apps);
        List<ExploreWidgetsBaseButtonDto> list = this.actions;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniappsCatalogDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", apps=");
        sb.append(this.apps);
        sb.append(", actions=");
        return ms9.a(')', sb, this.actions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AppsMiniappsCatalogItemDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
        Iterator a3 = ao.a(parcel, this.apps);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        List<ExploreWidgetsBaseButtonDto> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((ExploreWidgetsBaseButtonDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsMiniappsCatalogDto(List list, int i, List list2, List list3, int i2, zcl zclVar) {
        this(list, i, list2, (i2 & 8) != 0 ? null : list3);
    }
}
