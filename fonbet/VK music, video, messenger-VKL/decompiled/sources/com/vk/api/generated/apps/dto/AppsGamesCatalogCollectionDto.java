package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseGamesCatalogSectionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: AppsGamesCatalogCollectionDto.kt */
/* loaded from: classes14.dex */
public final class AppsGamesCatalogCollectionDto implements Parcelable {
    public static final Parcelable.Creator<AppsGamesCatalogCollectionDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("header")
    private final AppsMiniappsCatalogItemHeaderDto header;

    @pmi0("id")
    private final String id;

    @pmi0("items")
    private final List<AppsMiniappsCatalogGameDto> items;

    @pmi0("section_info")
    private final ExploreWidgetsBaseGamesCatalogSectionDto sectionInfo;

    @pmi0("trackcode")
    private final String trackcode;

    /* compiled from: AppsGamesCatalogCollectionDto.kt */
    public static final class a implements Parcelable.Creator<AppsGamesCatalogCollectionDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGamesCatalogCollectionDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            AppsMiniappsCatalogItemHeaderDto createFromParcel = AppsMiniappsCatalogItemHeaderDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(AppsMiniappsCatalogGameDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppsGamesCatalogCollectionDto(readString, createFromParcel, readInt, arrayList, (ExploreWidgetsBaseGamesCatalogSectionDto) parcel.readParcelable(AppsGamesCatalogCollectionDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGamesCatalogCollectionDto[] newArray(int i) {
            return new AppsGamesCatalogCollectionDto[i];
        }
    }

    public AppsGamesCatalogCollectionDto(String str, AppsMiniappsCatalogItemHeaderDto appsMiniappsCatalogItemHeaderDto, int i, List<AppsMiniappsCatalogGameDto> list, ExploreWidgetsBaseGamesCatalogSectionDto exploreWidgetsBaseGamesCatalogSectionDto, String str2) {
        this.id = str;
        this.header = appsMiniappsCatalogItemHeaderDto;
        this.count = i;
        this.items = list;
        this.sectionInfo = exploreWidgetsBaseGamesCatalogSectionDto;
        this.trackcode = str2;
    }

    public final AppsMiniappsCatalogItemHeaderDto d() {
        return this.header;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AppsMiniappsCatalogGameDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGamesCatalogCollectionDto)) {
            return false;
        }
        AppsGamesCatalogCollectionDto appsGamesCatalogCollectionDto = (AppsGamesCatalogCollectionDto) obj;
        return epx.f(this.id, appsGamesCatalogCollectionDto.id) && epx.f(this.header, appsGamesCatalogCollectionDto.header) && this.count == appsGamesCatalogCollectionDto.count && epx.f(this.items, appsGamesCatalogCollectionDto.items) && epx.f(this.sectionInfo, appsGamesCatalogCollectionDto.sectionInfo) && epx.f(this.trackcode, appsGamesCatalogCollectionDto.trackcode);
    }

    public final ExploreWidgetsBaseGamesCatalogSectionDto f() {
        return this.sectionInfo;
    }

    public final String g() {
        return this.trackcode;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = fw3.a(shy.a(this.count, (this.header.hashCode() + (this.id.hashCode() * 31)) * 31, 31), 31, this.items);
        ExploreWidgetsBaseGamesCatalogSectionDto exploreWidgetsBaseGamesCatalogSectionDto = this.sectionInfo;
        int hashCode = (a2 + (exploreWidgetsBaseGamesCatalogSectionDto == null ? 0 : exploreWidgetsBaseGamesCatalogSectionDto.hashCode())) * 31;
        String str = this.trackcode;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGamesCatalogCollectionDto(id=");
        sb.append(this.id);
        sb.append(", header=");
        sb.append(this.header);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", sectionInfo=");
        sb.append(this.sectionInfo);
        sb.append(", trackcode=");
        return ho8.a(sb, this.trackcode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        this.header.writeToParcel(parcel, i);
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AppsMiniappsCatalogGameDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.sectionInfo, i);
        parcel.writeString(this.trackcode);
    }

    public /* synthetic */ AppsGamesCatalogCollectionDto(String str, AppsMiniappsCatalogItemHeaderDto appsMiniappsCatalogItemHeaderDto, int i, List list, ExploreWidgetsBaseGamesCatalogSectionDto exploreWidgetsBaseGamesCatalogSectionDto, String str2, int i2, zcl zclVar) {
        this(str, appsMiniappsCatalogItemHeaderDto, i, list, (i2 & 16) != 0 ? null : exploreWidgetsBaseGamesCatalogSectionDto, (i2 & 32) != 0 ? null : str2);
    }
}
