package com.vk.tabbar.core.api.domain;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: TabbarSuggest.kt */
/* loaded from: classes6.dex */
public final class TabbarSuggest implements Parcelable {
    public static final Parcelable.Creator<TabbarSuggest> CREATOR = new a();
    public final String b;
    public final String c;
    public final TabbarItem d;

    /* compiled from: TabbarSuggest.kt */
    public static final class a implements Parcelable.Creator<TabbarSuggest> {
        @Override // android.os.Parcelable.Creator
        public final TabbarSuggest createFromParcel(Parcel parcel) {
            return new TabbarSuggest(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TabbarItem.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TabbarSuggest[] newArray(int i) {
            return new TabbarSuggest[i];
        }
    }

    public TabbarSuggest(String str, String str2, TabbarItem tabbarItem) {
        this.b = str;
        this.c = str2;
        this.d = tabbarItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        TabbarItem tabbarItem = this.d;
        if (tabbarItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tabbarItem.writeToParcel(parcel, i);
        }
    }
}
