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

/* compiled from: AppsCatalogListDto.kt */
/* loaded from: classes14.dex */
public final class AppsCatalogListDto implements Parcelable {
    public static final Parcelable.Creator<AppsCatalogListDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("description")
    private final String description;

    @pmi0("description_title")
    private final String descriptionTitle;

    @pmi0("games_items")
    private final List<AppsMiniappsCatalogGameDto> gamesItems;

    @pmi0("items")
    private final List<AppsAppDto> items;

    @pmi0("profiles")
    private final List<UsersUserMinDto> profiles;

    @pmi0("section_name")
    private final String sectionName;

    @pmi0("seo_description")
    private final AppsSeoDescriptionDto seoDescription;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: AppsCatalogListDto.kt */
    public static final class a implements Parcelable.Creator<AppsCatalogListDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsCatalogListDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(AppsCatalogListDto.class, parcel, arrayList3, i, 1);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int i2 = 0;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
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
                while (i2 != readInt4) {
                    i2 = bo.b(AppsCatalogListDto.class, parcel, arrayList2, i2, 1);
                }
            }
            return new AppsCatalogListDto(readInt, arrayList3, readString, readString2, readString3, readString4, readString5, arrayList, arrayList2, parcel.readInt() != 0 ? AppsSeoDescriptionDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsCatalogListDto[] newArray(int i) {
            return new AppsCatalogListDto[i];
        }
    }

    public AppsCatalogListDto(int i, List<AppsAppDto> list, String str, String str2, String str3, String str4, String str5, List<AppsMiniappsCatalogGameDto> list2, List<UsersUserMinDto> list3, AppsSeoDescriptionDto appsSeoDescriptionDto) {
        this.count = i;
        this.items = list;
        this.trackCode = str;
        this.title = str2;
        this.sectionName = str3;
        this.description = str4;
        this.descriptionTitle = str5;
        this.gamesItems = list2;
        this.profiles = list3;
        this.seoDescription = appsSeoDescriptionDto;
    }

    public final List<AppsMiniappsCatalogGameDto> d() {
        return this.gamesItems;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AppsAppDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsCatalogListDto)) {
            return false;
        }
        AppsCatalogListDto appsCatalogListDto = (AppsCatalogListDto) obj;
        return this.count == appsCatalogListDto.count && epx.f(this.items, appsCatalogListDto.items) && epx.f(this.trackCode, appsCatalogListDto.trackCode) && epx.f(this.title, appsCatalogListDto.title) && epx.f(this.sectionName, appsCatalogListDto.sectionName) && epx.f(this.description, appsCatalogListDto.description) && epx.f(this.descriptionTitle, appsCatalogListDto.descriptionTitle) && epx.f(this.gamesItems, appsCatalogListDto.gamesItems) && epx.f(this.profiles, appsCatalogListDto.profiles) && epx.f(this.seoDescription, appsCatalogListDto.seoDescription);
    }

    public final int getCount() {
        return this.count;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        String str = this.trackCode;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sectionName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.descriptionTitle;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<AppsMiniappsCatalogGameDto> list = this.gamesItems;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserMinDto> list2 = this.profiles;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AppsSeoDescriptionDto appsSeoDescriptionDto = this.seoDescription;
        return hashCode7 + (appsSeoDescriptionDto != null ? appsSeoDescriptionDto.hashCode() : 0);
    }

    public final String toString() {
        return "AppsCatalogListDto(count=" + this.count + ", items=" + this.items + ", trackCode=" + this.trackCode + ", title=" + this.title + ", sectionName=" + this.sectionName + ", description=" + this.description + ", descriptionTitle=" + this.descriptionTitle + ", gamesItems=" + this.gamesItems + ", profiles=" + this.profiles + ", seoDescription=" + this.seoDescription + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.trackCode);
        parcel.writeString(this.title);
        parcel.writeString(this.sectionName);
        parcel.writeString(this.description);
        parcel.writeString(this.descriptionTitle);
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
        AppsSeoDescriptionDto appsSeoDescriptionDto = this.seoDescription;
        if (appsSeoDescriptionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsSeoDescriptionDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsCatalogListDto(int i, List list, String str, String str2, String str3, String str4, String str5, List list2, List list3, AppsSeoDescriptionDto appsSeoDescriptionDto, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : list2, (i2 & 256) != 0 ? null : list3, (i2 & 512) != 0 ? null : appsSeoDescriptionDto);
    }
}
