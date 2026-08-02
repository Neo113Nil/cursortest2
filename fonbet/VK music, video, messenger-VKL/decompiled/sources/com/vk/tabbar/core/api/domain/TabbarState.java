package com.vk.tabbar.core.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: TabbarState.kt */
/* loaded from: classes11.dex */
public final class TabbarState implements Parcelable {
    public static final Parcelable.Creator<TabbarState> CREATOR = new a();

    @pmi0("is_title_visible")
    private final Boolean isTitleVisible;

    @pmi0("items")
    private final List<TabbarItem> items;

    /* compiled from: TabbarState.kt */
    public static final class a implements Parcelable.Creator<TabbarState> {
        @Override // android.os.Parcelable.Creator
        public final TabbarState createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(TabbarItem.CREATOR, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TabbarState(arrayList, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final TabbarState[] newArray(int i) {
            return new TabbarState[i];
        }
    }

    public TabbarState() {
        this(null, null, 3, null);
    }

    public static TabbarState a(TabbarState tabbarState, List list) {
        Boolean bool = tabbarState.isTitleVisible;
        tabbarState.getClass();
        return new TabbarState(list, bool);
    }

    public final List<TabbarItem> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isTitleVisible;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabbarState)) {
            return false;
        }
        TabbarState tabbarState = (TabbarState) obj;
        return epx.f(this.items, tabbarState.items) && epx.f(this.isTitleVisible, tabbarState.isTitleVisible);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Boolean bool = this.isTitleVisible;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabbarState(items=");
        sb.append(this.items);
        sb.append(", isTitleVisible=");
        return tn.a(sb, this.isTitleVisible, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((TabbarItem) a2.next()).writeToParcel(parcel, i);
        }
        Boolean bool = this.isTitleVisible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public TabbarState(List<TabbarItem> list, Boolean bool) {
        this.items = list;
        this.isTitleVisible = bool;
    }

    public TabbarState(List list, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list, (i & 2) != 0 ? null : bool);
    }
}
