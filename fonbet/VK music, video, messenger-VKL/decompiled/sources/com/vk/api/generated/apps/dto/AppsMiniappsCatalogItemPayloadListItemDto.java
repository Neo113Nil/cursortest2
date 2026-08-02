package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseImageContainerDto;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsMiniappsCatalogItemPayloadListItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadListItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadListItemDto> CREATOR = new a();

    @pmi0("colors")
    private final List<String> colors;

    @pmi0("logo")
    private final ExploreWidgetsBaseImageContainerDto logo;

    @pmi0("section_id")
    private final String sectionId;

    @pmi0("title")
    private final String title;

    /* compiled from: AppsMiniappsCatalogItemPayloadListItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadListItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadListItemDto createFromParcel(Parcel parcel) {
            return new AppsMiniappsCatalogItemPayloadListItemDto(parcel.readString(), parcel.readString(), (ExploreWidgetsBaseImageContainerDto) parcel.readParcelable(AppsMiniappsCatalogItemPayloadListItemDto.class.getClassLoader()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadListItemDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadListItemDto[i];
        }
    }

    public AppsMiniappsCatalogItemPayloadListItemDto(String str, String str2, ExploreWidgetsBaseImageContainerDto exploreWidgetsBaseImageContainerDto, List<String> list) {
        this.title = str;
        this.sectionId = str2;
        this.logo = exploreWidgetsBaseImageContainerDto;
        this.colors = list;
    }

    public final ExploreWidgetsBaseImageContainerDto d() {
        return this.logo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.sectionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsCatalogItemPayloadListItemDto)) {
            return false;
        }
        AppsMiniappsCatalogItemPayloadListItemDto appsMiniappsCatalogItemPayloadListItemDto = (AppsMiniappsCatalogItemPayloadListItemDto) obj;
        return epx.f(this.title, appsMiniappsCatalogItemPayloadListItemDto.title) && epx.f(this.sectionId, appsMiniappsCatalogItemPayloadListItemDto.sectionId) && epx.f(this.logo, appsMiniappsCatalogItemPayloadListItemDto.logo) && epx.f(this.colors, appsMiniappsCatalogItemPayloadListItemDto.colors);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.title.hashCode() * 31, 31, this.sectionId);
        ExploreWidgetsBaseImageContainerDto exploreWidgetsBaseImageContainerDto = this.logo;
        int hashCode = (a2 + (exploreWidgetsBaseImageContainerDto == null ? 0 : exploreWidgetsBaseImageContainerDto.hashCode())) * 31;
        List<String> list = this.colors;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadListItemDto(title=");
        sb.append(this.title);
        sb.append(", sectionId=");
        sb.append(this.sectionId);
        sb.append(", logo=");
        sb.append(this.logo);
        sb.append(", colors=");
        return ms9.a(')', sb, this.colors);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.sectionId);
        parcel.writeParcelable(this.logo, i);
        parcel.writeStringList(this.colors);
    }

    public /* synthetic */ AppsMiniappsCatalogItemPayloadListItemDto(String str, String str2, ExploreWidgetsBaseImageContainerDto exploreWidgetsBaseImageContainerDto, List list, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : exploreWidgetsBaseImageContainerDto, (i & 8) != 0 ? null : list);
    }
}
