package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogVideoShowcaseMenuItemDto.kt */
/* loaded from: classes14.dex */
public final class CatalogVideoShowcaseMenuItemDto implements Parcelable {
    public static final Parcelable.Creator<CatalogVideoShowcaseMenuItemDto> CREATOR = new a();

    @pmi0("collapsed")
    private final Boolean collapsed;

    @pmi0("hint")
    private final CatalogHintDto hint;

    @pmi0("icon")
    private final String icon;

    @pmi0("id")
    private final String id;

    @pmi0("name")
    private final String name;

    @pmi0("open_in_new_tab")
    private final Boolean openInNewTab;

    @pmi0("parent_id")
    private final String parentId;

    @pmi0("right_icon")
    private final String rightIcon;

    @pmi0("separator")
    private final Boolean separator;

    @pmi0("sub_urls")
    private final List<String> subUrls;

    @pmi0("url")
    private final String url;

    /* compiled from: CatalogVideoShowcaseMenuItemDto.kt */
    public static final class a implements Parcelable.Creator<CatalogVideoShowcaseMenuItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogVideoShowcaseMenuItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            CatalogHintDto createFromParcel = parcel.readInt() == 0 ? null : CatalogHintDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CatalogVideoShowcaseMenuItemDto(readString, readString2, readString3, readString4, readString5, valueOf, valueOf2, createStringArrayList, createFromParcel, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogVideoShowcaseMenuItemDto[] newArray(int i) {
            return new CatalogVideoShowcaseMenuItemDto[i];
        }
    }

    public CatalogVideoShowcaseMenuItemDto(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, List<String> list, CatalogHintDto catalogHintDto, Boolean bool3, String str6) {
        this.id = str;
        this.name = str2;
        this.icon = str3;
        this.url = str4;
        this.parentId = str5;
        this.collapsed = bool;
        this.separator = bool2;
        this.subUrls = list;
        this.hint = catalogHintDto;
        this.openInNewTab = bool3;
        this.rightIcon = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogVideoShowcaseMenuItemDto)) {
            return false;
        }
        CatalogVideoShowcaseMenuItemDto catalogVideoShowcaseMenuItemDto = (CatalogVideoShowcaseMenuItemDto) obj;
        return epx.f(this.id, catalogVideoShowcaseMenuItemDto.id) && epx.f(this.name, catalogVideoShowcaseMenuItemDto.name) && epx.f(this.icon, catalogVideoShowcaseMenuItemDto.icon) && epx.f(this.url, catalogVideoShowcaseMenuItemDto.url) && epx.f(this.parentId, catalogVideoShowcaseMenuItemDto.parentId) && epx.f(this.collapsed, catalogVideoShowcaseMenuItemDto.collapsed) && epx.f(this.separator, catalogVideoShowcaseMenuItemDto.separator) && epx.f(this.subUrls, catalogVideoShowcaseMenuItemDto.subUrls) && epx.f(this.hint, catalogVideoShowcaseMenuItemDto.hint) && epx.f(this.openInNewTab, catalogVideoShowcaseMenuItemDto.openInNewTab) && epx.f(this.rightIcon, catalogVideoShowcaseMenuItemDto.rightIcon);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.name), 31, this.icon), 31, this.url);
        String str = this.parentId;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.collapsed;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.separator;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list = this.subUrls;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        CatalogHintDto catalogHintDto = this.hint;
        int hashCode5 = (hashCode4 + (catalogHintDto == null ? 0 : catalogHintDto.hashCode())) * 31;
        Boolean bool3 = this.openInNewTab;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.rightIcon;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogVideoShowcaseMenuItemDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", parentId=");
        sb.append(this.parentId);
        sb.append(", collapsed=");
        sb.append(this.collapsed);
        sb.append(", separator=");
        sb.append(this.separator);
        sb.append(", subUrls=");
        sb.append(this.subUrls);
        sb.append(", hint=");
        sb.append(this.hint);
        sb.append(", openInNewTab=");
        sb.append(this.openInNewTab);
        sb.append(", rightIcon=");
        return ho8.a(sb, this.rightIcon, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.icon);
        parcel.writeString(this.url);
        parcel.writeString(this.parentId);
        Boolean bool = this.collapsed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.separator;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeStringList(this.subUrls);
        CatalogHintDto catalogHintDto = this.hint;
        if (catalogHintDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogHintDto.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.openInNewTab;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeString(this.rightIcon);
    }

    public /* synthetic */ CatalogVideoShowcaseMenuItemDto(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, List list, CatalogHintDto catalogHintDto, Boolean bool3, String str6, int i, zcl zclVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : catalogHintDto, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : str6);
    }
}
