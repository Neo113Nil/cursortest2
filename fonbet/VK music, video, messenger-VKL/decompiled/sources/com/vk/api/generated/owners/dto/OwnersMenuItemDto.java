package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsMenuItemTypeDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: OwnersMenuItemDto.kt */
/* loaded from: classes15.dex */
public final class OwnersMenuItemDto implements Parcelable {
    public static final Parcelable.Creator<OwnersMenuItemDto> CREATOR = new a();

    @pmi0("cover")
    private final List<OwnersMenuItemCoverDto> cover;

    @pmi0("id")
    private final int id;

    @pmi0("settings")
    private final OwnersMenuItemSettingsDto settings;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final GroupsMenuItemTypeDto type;

    @pmi0("url")
    private final String url;

    /* compiled from: OwnersMenuItemDto.kt */
    public static final class a implements Parcelable.Creator<OwnersMenuItemDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersMenuItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            GroupsMenuItemTypeDto groupsMenuItemTypeDto = (GroupsMenuItemTypeDto) parcel.readParcelable(OwnersMenuItemDto.class.getClassLoader());
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(OwnersMenuItemCoverDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new OwnersMenuItemDto(readInt, readString, groupsMenuItemTypeDto, readString2, arrayList, parcel.readInt() != 0 ? OwnersMenuItemSettingsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersMenuItemDto[] newArray(int i) {
            return new OwnersMenuItemDto[i];
        }
    }

    public OwnersMenuItemDto(int i, String str, GroupsMenuItemTypeDto groupsMenuItemTypeDto, String str2, List<OwnersMenuItemCoverDto> list, OwnersMenuItemSettingsDto ownersMenuItemSettingsDto) {
        this.id = i;
        this.title = str;
        this.type = groupsMenuItemTypeDto;
        this.url = str2;
        this.cover = list;
        this.settings = ownersMenuItemSettingsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnersMenuItemDto)) {
            return false;
        }
        OwnersMenuItemDto ownersMenuItemDto = (OwnersMenuItemDto) obj;
        return this.id == ownersMenuItemDto.id && epx.f(this.title, ownersMenuItemDto.title) && this.type == ownersMenuItemDto.type && epx.f(this.url, ownersMenuItemDto.url) && epx.f(this.cover, ownersMenuItemDto.cover) && epx.f(this.settings, ownersMenuItemDto.settings);
    }

    public final int hashCode() {
        int a2 = urd0.a((this.type.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.title)) * 31, 31, this.url);
        List<OwnersMenuItemCoverDto> list = this.cover;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        OwnersMenuItemSettingsDto ownersMenuItemSettingsDto = this.settings;
        return hashCode + (ownersMenuItemSettingsDto != null ? ownersMenuItemSettingsDto.hashCode() : 0);
    }

    public final String toString() {
        return "OwnersMenuItemDto(id=" + this.id + ", title=" + this.title + ", type=" + this.type + ", url=" + this.url + ", cover=" + this.cover + ", settings=" + this.settings + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.type, i);
        parcel.writeString(this.url);
        List<OwnersMenuItemCoverDto> list = this.cover;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((OwnersMenuItemCoverDto) f.next()).writeToParcel(parcel, i);
            }
        }
        OwnersMenuItemSettingsDto ownersMenuItemSettingsDto = this.settings;
        if (ownersMenuItemSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownersMenuItemSettingsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ OwnersMenuItemDto(int i, String str, GroupsMenuItemTypeDto groupsMenuItemTypeDto, String str2, List list, OwnersMenuItemSettingsDto ownersMenuItemSettingsDto, int i2, zcl zclVar) {
        this(i, str, groupsMenuItemTypeDto, str2, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : ownersMenuItemSettingsDto);
    }
}
