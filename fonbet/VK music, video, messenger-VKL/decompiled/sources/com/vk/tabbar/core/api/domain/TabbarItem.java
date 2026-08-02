package com.vk.tabbar.core.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: TabbarItem.kt */
/* loaded from: classes11.dex */
public final class TabbarItem implements Parcelable {
    public static final Parcelable.Creator<TabbarItem> CREATOR = new a();
    public final transient TabbarSuggest b;

    @pmi0("is_editable")
    private final boolean isEditable;

    @pmi0("name")
    private final String name;

    @pmi0("pinned_group_id")
    private final UserId pinnedGroupId;

    @pmi0("title")
    private final String title;

    /* compiled from: TabbarItem.kt */
    public static final class a implements Parcelable.Creator<TabbarItem> {
        @Override // android.os.Parcelable.Creator
        public final TabbarItem createFromParcel(Parcel parcel) {
            return new TabbarItem(parcel.readString(), parcel.readInt() == 0 ? null : TabbarSuggest.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, (UserId) parcel.readParcelable(TabbarItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TabbarItem[] newArray(int i) {
            return new TabbarItem[i];
        }
    }

    public TabbarItem(String str, TabbarSuggest tabbarSuggest, String str2, boolean z, UserId userId) {
        this.name = str;
        this.b = tabbarSuggest;
        this.title = str2;
        this.isEditable = z;
        this.pinnedGroupId = userId;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final UserId e() {
        return this.pinnedGroupId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabbarItem)) {
            return false;
        }
        TabbarItem tabbarItem = (TabbarItem) obj;
        return epx.f(this.name, tabbarItem.name) && epx.f(this.b, tabbarItem.b) && epx.f(this.title, tabbarItem.title) && this.isEditable == tabbarItem.isEditable && epx.f(this.pinnedGroupId, tabbarItem.pinnedGroupId);
    }

    public final boolean f() {
        return this.isEditable;
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        TabbarSuggest tabbarSuggest = this.b;
        int hashCode2 = (hashCode + (tabbarSuggest == null ? 0 : tabbarSuggest.hashCode())) * 31;
        String str = this.title;
        int b = qoy.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isEditable);
        UserId userId = this.pinnedGroupId;
        return b + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabbarItem(name=");
        sb.append(this.name);
        sb.append(", suggest=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", isEditable=");
        sb.append(this.isEditable);
        sb.append(", pinnedGroupId=");
        return gp.b(sb, this.pinnedGroupId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        TabbarSuggest tabbarSuggest = this.b;
        if (tabbarSuggest == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tabbarSuggest.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeInt(this.isEditable ? 1 : 0);
        parcel.writeParcelable(this.pinnedGroupId, i);
    }

    public /* synthetic */ TabbarItem(String str, TabbarSuggest tabbarSuggest, String str2, boolean z, UserId userId, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : tabbarSuggest, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : userId);
    }
}
