package com.vk.api.generated.tabbar.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: TabbarItemDto.kt */
/* loaded from: classes15.dex */
public final class TabbarItemDto implements Parcelable {
    public static final Parcelable.Creator<TabbarItemDto> CREATOR = new a();

    @pmi0("animation_choice")
    private final String animationChoice;

    @pmi0("is_editable")
    private final boolean isEditable;

    @pmi0("name")
    private final TabbarItemNameDto name;

    @pmi0("pinned_group_owner_id")
    private final UserId pinnedGroupOwnerId;

    @pmi0("suggest")
    private final TabbarItemSuggestDto suggest;

    @pmi0("title")
    private final String title;

    /* compiled from: TabbarItemDto.kt */
    public static final class a implements Parcelable.Creator<TabbarItemDto> {
        @Override // android.os.Parcelable.Creator
        public final TabbarItemDto createFromParcel(Parcel parcel) {
            return new TabbarItemDto((TabbarItemNameDto) parcel.readParcelable(TabbarItemDto.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : TabbarItemSuggestDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(TabbarItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TabbarItemDto[] newArray(int i) {
            return new TabbarItemDto[i];
        }
    }

    public TabbarItemDto(TabbarItemNameDto tabbarItemNameDto, boolean z, TabbarItemSuggestDto tabbarItemSuggestDto, String str, String str2, UserId userId) {
        this.name = tabbarItemNameDto;
        this.isEditable = z;
        this.suggest = tabbarItemSuggestDto;
        this.title = str;
        this.animationChoice = str2;
        this.pinnedGroupOwnerId = userId;
    }

    public final String d() {
        return this.animationChoice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final TabbarItemNameDto e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabbarItemDto)) {
            return false;
        }
        TabbarItemDto tabbarItemDto = (TabbarItemDto) obj;
        return this.name == tabbarItemDto.name && this.isEditable == tabbarItemDto.isEditable && epx.f(this.suggest, tabbarItemDto.suggest) && epx.f(this.title, tabbarItemDto.title) && epx.f(this.animationChoice, tabbarItemDto.animationChoice) && epx.f(this.pinnedGroupOwnerId, tabbarItemDto.pinnedGroupOwnerId);
    }

    public final UserId f() {
        return this.pinnedGroupOwnerId;
    }

    public final TabbarItemSuggestDto g() {
        return this.suggest;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int b = qoy.b(this.name.hashCode() * 31, 31, this.isEditable);
        TabbarItemSuggestDto tabbarItemSuggestDto = this.suggest;
        int hashCode = (b + (tabbarItemSuggestDto == null ? 0 : tabbarItemSuggestDto.hashCode())) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.animationChoice;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserId userId = this.pinnedGroupOwnerId;
        return hashCode3 + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final boolean i() {
        return this.isEditable;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabbarItemDto(name=");
        sb.append(this.name);
        sb.append(", isEditable=");
        sb.append(this.isEditable);
        sb.append(", suggest=");
        sb.append(this.suggest);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", animationChoice=");
        sb.append(this.animationChoice);
        sb.append(", pinnedGroupOwnerId=");
        return gp.b(sb, this.pinnedGroupOwnerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.name, i);
        parcel.writeInt(this.isEditable ? 1 : 0);
        TabbarItemSuggestDto tabbarItemSuggestDto = this.suggest;
        if (tabbarItemSuggestDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tabbarItemSuggestDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.animationChoice);
        parcel.writeParcelable(this.pinnedGroupOwnerId, i);
    }

    public /* synthetic */ TabbarItemDto(TabbarItemNameDto tabbarItemNameDto, boolean z, TabbarItemSuggestDto tabbarItemSuggestDto, String str, String str2, UserId userId, int i, zcl zclVar) {
        this(tabbarItemNameDto, z, (i & 4) != 0 ? null : tabbarItemSuggestDto, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : userId);
    }
}
