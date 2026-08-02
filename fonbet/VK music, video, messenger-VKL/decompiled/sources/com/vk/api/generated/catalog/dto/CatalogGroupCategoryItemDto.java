package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogGroupCategoryItemDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGroupCategoryItemDto implements Parcelable {
    public static final Parcelable.Creator<CatalogGroupCategoryItemDto> CREATOR = new a();

    @pmi0("groups_count")
    private final Integer groupsCount;

    @pmi0("icon")
    private final String icon;

    @pmi0("id")
    private final String id;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("link_text")
    private final String linkText;

    @pmi0("name")
    private final String name;

    @pmi0("subtext")
    private final String subtext;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: CatalogGroupCategoryItemDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGroupCategoryItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGroupCategoryItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(CatalogGroupCategoryItemDto.class, parcel, arrayList, i, 1);
                }
            }
            return new CatalogGroupCategoryItemDto(readString, readString2, readString3, readString4, readString5, valueOf, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGroupCategoryItemDto[] newArray(int i) {
            return new CatalogGroupCategoryItemDto[i];
        }
    }

    public CatalogGroupCategoryItemDto(String str, String str2, String str3, String str4, String str5, Integer num, List<BaseImageDto> list, String str6) {
        this.id = str;
        this.name = str2;
        this.subtext = str3;
        this.linkText = str4;
        this.icon = str5;
        this.groupsCount = num;
        this.images = list;
        this.trackCode = str6;
    }

    public final Integer d() {
        return this.groupsCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogGroupCategoryItemDto)) {
            return false;
        }
        CatalogGroupCategoryItemDto catalogGroupCategoryItemDto = (CatalogGroupCategoryItemDto) obj;
        return epx.f(this.id, catalogGroupCategoryItemDto.id) && epx.f(this.name, catalogGroupCategoryItemDto.name) && epx.f(this.subtext, catalogGroupCategoryItemDto.subtext) && epx.f(this.linkText, catalogGroupCategoryItemDto.linkText) && epx.f(this.icon, catalogGroupCategoryItemDto.icon) && epx.f(this.groupsCount, catalogGroupCategoryItemDto.groupsCount) && epx.f(this.images, catalogGroupCategoryItemDto.images) && epx.f(this.trackCode, catalogGroupCategoryItemDto.trackCode);
    }

    public final List<BaseImageDto> f() {
        return this.images;
    }

    public final String g() {
        return this.linkText;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtext;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.linkText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.groupsCount;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.trackCode;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String i() {
        return this.name;
    }

    public final String j() {
        return this.subtext;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogGroupCategoryItemDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", subtext=");
        sb.append(this.subtext);
        sb.append(", linkText=");
        sb.append(this.linkText);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", groupsCount=");
        sb.append(this.groupsCount);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.subtext);
        parcel.writeString(this.linkText);
        parcel.writeString(this.icon);
        Integer num = this.groupsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ CatalogGroupCategoryItemDto(String str, String str2, String str3, String str4, String str5, Integer num, List list, String str6, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str6);
    }
}
