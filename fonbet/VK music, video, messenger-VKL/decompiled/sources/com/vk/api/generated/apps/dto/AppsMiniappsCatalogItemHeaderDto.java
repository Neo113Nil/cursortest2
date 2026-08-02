package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseButtonDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseTextDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsMiniappsCatalogItemHeaderDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemHeaderDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogItemHeaderDto> CREATOR = new a();

    @pmi0("additional_button")
    private final ExploreWidgetsBaseButtonDto additionalButton;

    @pmi0("button")
    private final ExploreWidgetsBaseButtonDto button;

    @pmi0("subtitle")
    private final ExploreWidgetsBaseTextDto subtitle;

    @pmi0("title")
    private final ExploreWidgetsBaseTextDto title;

    /* compiled from: AppsMiniappsCatalogItemHeaderDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemHeaderDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemHeaderDto createFromParcel(Parcel parcel) {
            Parcelable.Creator<ExploreWidgetsBaseTextDto> creator = ExploreWidgetsBaseTextDto.CREATOR;
            return new AppsMiniappsCatalogItemHeaderDto(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : ExploreWidgetsBaseButtonDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ExploreWidgetsBaseButtonDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemHeaderDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemHeaderDto[i];
        }
    }

    public AppsMiniappsCatalogItemHeaderDto(ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto, ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto2, ExploreWidgetsBaseButtonDto exploreWidgetsBaseButtonDto, ExploreWidgetsBaseButtonDto exploreWidgetsBaseButtonDto2) {
        this.title = exploreWidgetsBaseTextDto;
        this.subtitle = exploreWidgetsBaseTextDto2;
        this.button = exploreWidgetsBaseButtonDto;
        this.additionalButton = exploreWidgetsBaseButtonDto2;
    }

    public final ExploreWidgetsBaseButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ExploreWidgetsBaseTextDto e() {
        return this.subtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsCatalogItemHeaderDto)) {
            return false;
        }
        AppsMiniappsCatalogItemHeaderDto appsMiniappsCatalogItemHeaderDto = (AppsMiniappsCatalogItemHeaderDto) obj;
        return epx.f(this.title, appsMiniappsCatalogItemHeaderDto.title) && epx.f(this.subtitle, appsMiniappsCatalogItemHeaderDto.subtitle) && epx.f(this.button, appsMiniappsCatalogItemHeaderDto.button) && epx.f(this.additionalButton, appsMiniappsCatalogItemHeaderDto.additionalButton);
    }

    public final ExploreWidgetsBaseTextDto f() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto = this.subtitle;
        int hashCode2 = (hashCode + (exploreWidgetsBaseTextDto == null ? 0 : exploreWidgetsBaseTextDto.hashCode())) * 31;
        ExploreWidgetsBaseButtonDto exploreWidgetsBaseButtonDto = this.button;
        int hashCode3 = (hashCode2 + (exploreWidgetsBaseButtonDto == null ? 0 : exploreWidgetsBaseButtonDto.hashCode())) * 31;
        ExploreWidgetsBaseButtonDto exploreWidgetsBaseButtonDto2 = this.additionalButton;
        return hashCode3 + (exploreWidgetsBaseButtonDto2 != null ? exploreWidgetsBaseButtonDto2.hashCode() : 0);
    }

    public final String toString() {
        return "AppsMiniappsCatalogItemHeaderDto(title=" + this.title + ", subtitle=" + this.subtitle + ", button=" + this.button + ", additionalButton=" + this.additionalButton + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.title.writeToParcel(parcel, i);
        ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto = this.subtitle;
        if (exploreWidgetsBaseTextDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreWidgetsBaseTextDto.writeToParcel(parcel, i);
        }
        ExploreWidgetsBaseButtonDto exploreWidgetsBaseButtonDto = this.button;
        if (exploreWidgetsBaseButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreWidgetsBaseButtonDto.writeToParcel(parcel, i);
        }
        ExploreWidgetsBaseButtonDto exploreWidgetsBaseButtonDto2 = this.additionalButton;
        if (exploreWidgetsBaseButtonDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreWidgetsBaseButtonDto2.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsMiniappsCatalogItemHeaderDto(ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto, ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto2, ExploreWidgetsBaseButtonDto exploreWidgetsBaseButtonDto, ExploreWidgetsBaseButtonDto exploreWidgetsBaseButtonDto2, int i, zcl zclVar) {
        this(exploreWidgetsBaseTextDto, (i & 2) != 0 ? null : exploreWidgetsBaseTextDto2, (i & 4) != 0 ? null : exploreWidgetsBaseButtonDto, (i & 8) != 0 ? null : exploreWidgetsBaseButtonDto2);
    }
}
