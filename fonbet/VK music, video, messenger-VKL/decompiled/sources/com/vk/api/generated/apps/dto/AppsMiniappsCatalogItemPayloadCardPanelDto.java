package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseButtonDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsMiniappsCatalogItemPayloadCardPanelDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadCardPanelDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadCardPanelDto> CREATOR = new a();

    @pmi0("arrow_color")
    private final List<String> arrowColor;

    @pmi0("background_color")
    private final List<String> backgroundColor;

    @pmi0("button")
    private final ExploreWidgetsBaseButtonDto button;

    @pmi0("subtitle")
    private final AppsMiniappsCatalogItemTextDto subtitle;

    @pmi0("title")
    private final AppsMiniappsCatalogItemTextDto title;

    /* compiled from: AppsMiniappsCatalogItemPayloadCardPanelDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadCardPanelDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadCardPanelDto createFromParcel(Parcel parcel) {
            Parcelable.Creator<AppsMiniappsCatalogItemTextDto> creator = AppsMiniappsCatalogItemTextDto.CREATOR;
            return new AppsMiniappsCatalogItemPayloadCardPanelDto(creator.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readInt() != 0 ? ExploreWidgetsBaseButtonDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadCardPanelDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadCardPanelDto[i];
        }
    }

    public AppsMiniappsCatalogItemPayloadCardPanelDto(AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto, List<String> list, AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto2, List<String> list2, ExploreWidgetsBaseButtonDto exploreWidgetsBaseButtonDto) {
        this.title = appsMiniappsCatalogItemTextDto;
        this.backgroundColor = list;
        this.subtitle = appsMiniappsCatalogItemTextDto2;
        this.arrowColor = list2;
        this.button = exploreWidgetsBaseButtonDto;
    }

    public final List<String> d() {
        return this.arrowColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.backgroundColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsCatalogItemPayloadCardPanelDto)) {
            return false;
        }
        AppsMiniappsCatalogItemPayloadCardPanelDto appsMiniappsCatalogItemPayloadCardPanelDto = (AppsMiniappsCatalogItemPayloadCardPanelDto) obj;
        return epx.f(this.title, appsMiniappsCatalogItemPayloadCardPanelDto.title) && epx.f(this.backgroundColor, appsMiniappsCatalogItemPayloadCardPanelDto.backgroundColor) && epx.f(this.subtitle, appsMiniappsCatalogItemPayloadCardPanelDto.subtitle) && epx.f(this.arrowColor, appsMiniappsCatalogItemPayloadCardPanelDto.arrowColor) && epx.f(this.button, appsMiniappsCatalogItemPayloadCardPanelDto.button);
    }

    public final AppsMiniappsCatalogItemTextDto f() {
        return this.subtitle;
    }

    public final AppsMiniappsCatalogItemTextDto g() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = fw3.a(this.title.hashCode() * 31, 31, this.backgroundColor);
        AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto = this.subtitle;
        int hashCode = (a2 + (appsMiniappsCatalogItemTextDto == null ? 0 : appsMiniappsCatalogItemTextDto.hashCode())) * 31;
        List<String> list = this.arrowColor;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ExploreWidgetsBaseButtonDto exploreWidgetsBaseButtonDto = this.button;
        return hashCode2 + (exploreWidgetsBaseButtonDto != null ? exploreWidgetsBaseButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "AppsMiniappsCatalogItemPayloadCardPanelDto(title=" + this.title + ", backgroundColor=" + this.backgroundColor + ", subtitle=" + this.subtitle + ", arrowColor=" + this.arrowColor + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.title.writeToParcel(parcel, i);
        parcel.writeStringList(this.backgroundColor);
        AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto = this.subtitle;
        if (appsMiniappsCatalogItemTextDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsMiniappsCatalogItemTextDto.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.arrowColor);
        ExploreWidgetsBaseButtonDto exploreWidgetsBaseButtonDto = this.button;
        if (exploreWidgetsBaseButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreWidgetsBaseButtonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsMiniappsCatalogItemPayloadCardPanelDto(AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto, List list, AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto2, List list2, ExploreWidgetsBaseButtonDto exploreWidgetsBaseButtonDto, int i, zcl zclVar) {
        this(appsMiniappsCatalogItemTextDto, list, (i & 4) != 0 ? null : appsMiniappsCatalogItemTextDto2, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : exploreWidgetsBaseButtonDto);
    }
}
