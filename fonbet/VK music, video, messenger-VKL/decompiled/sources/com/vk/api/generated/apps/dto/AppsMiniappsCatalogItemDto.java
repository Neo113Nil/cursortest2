package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseFooterDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseGamesCatalogSectionDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsMiniappsCatalogItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogItemDto> CREATOR = new a();

    @pmi0("footer")
    private final ExploreWidgetsBaseFooterDto footer;

    @pmi0("header")
    private final AppsMiniappsCatalogItemHeaderDto header;

    @pmi0("id")
    private final int id;

    @pmi0("payload")
    private final AppsMiniappsCatalogItemPayloadDto payload;

    @pmi0("section_info")
    private final ExploreWidgetsBaseGamesCatalogSectionDto sectionInfo;

    @pmi0("trackcode")
    private final String trackcode;

    /* compiled from: AppsMiniappsCatalogItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemDto createFromParcel(Parcel parcel) {
            return new AppsMiniappsCatalogItemDto(parcel.readInt(), (AppsMiniappsCatalogItemPayloadDto) parcel.readParcelable(AppsMiniappsCatalogItemDto.class.getClassLoader()), parcel.readString(), (ExploreWidgetsBaseGamesCatalogSectionDto) parcel.readParcelable(AppsMiniappsCatalogItemDto.class.getClassLoader()), parcel.readInt() == 0 ? null : AppsMiniappsCatalogItemHeaderDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ExploreWidgetsBaseFooterDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemDto[i];
        }
    }

    public AppsMiniappsCatalogItemDto(int i, AppsMiniappsCatalogItemPayloadDto appsMiniappsCatalogItemPayloadDto, String str, ExploreWidgetsBaseGamesCatalogSectionDto exploreWidgetsBaseGamesCatalogSectionDto, AppsMiniappsCatalogItemHeaderDto appsMiniappsCatalogItemHeaderDto, ExploreWidgetsBaseFooterDto exploreWidgetsBaseFooterDto) {
        this.id = i;
        this.payload = appsMiniappsCatalogItemPayloadDto;
        this.trackcode = str;
        this.sectionInfo = exploreWidgetsBaseGamesCatalogSectionDto;
        this.header = appsMiniappsCatalogItemHeaderDto;
        this.footer = exploreWidgetsBaseFooterDto;
    }

    public final ExploreWidgetsBaseFooterDto d() {
        return this.footer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AppsMiniappsCatalogItemHeaderDto e() {
        return this.header;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsCatalogItemDto)) {
            return false;
        }
        AppsMiniappsCatalogItemDto appsMiniappsCatalogItemDto = (AppsMiniappsCatalogItemDto) obj;
        return this.id == appsMiniappsCatalogItemDto.id && epx.f(this.payload, appsMiniappsCatalogItemDto.payload) && epx.f(this.trackcode, appsMiniappsCatalogItemDto.trackcode) && epx.f(this.sectionInfo, appsMiniappsCatalogItemDto.sectionInfo) && epx.f(this.header, appsMiniappsCatalogItemDto.header) && epx.f(this.footer, appsMiniappsCatalogItemDto.footer);
    }

    public final AppsMiniappsCatalogItemPayloadDto f() {
        return this.payload;
    }

    public final ExploreWidgetsBaseGamesCatalogSectionDto g() {
        return this.sectionInfo;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = (this.payload.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
        String str = this.trackcode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ExploreWidgetsBaseGamesCatalogSectionDto exploreWidgetsBaseGamesCatalogSectionDto = this.sectionInfo;
        int hashCode3 = (hashCode2 + (exploreWidgetsBaseGamesCatalogSectionDto == null ? 0 : exploreWidgetsBaseGamesCatalogSectionDto.hashCode())) * 31;
        AppsMiniappsCatalogItemHeaderDto appsMiniappsCatalogItemHeaderDto = this.header;
        int hashCode4 = (hashCode3 + (appsMiniappsCatalogItemHeaderDto == null ? 0 : appsMiniappsCatalogItemHeaderDto.hashCode())) * 31;
        ExploreWidgetsBaseFooterDto exploreWidgetsBaseFooterDto = this.footer;
        return hashCode4 + (exploreWidgetsBaseFooterDto != null ? exploreWidgetsBaseFooterDto.hashCode() : 0);
    }

    public final String i() {
        return this.trackcode;
    }

    public final String toString() {
        return "AppsMiniappsCatalogItemDto(id=" + this.id + ", payload=" + this.payload + ", trackcode=" + this.trackcode + ", sectionInfo=" + this.sectionInfo + ", header=" + this.header + ", footer=" + this.footer + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.payload, i);
        parcel.writeString(this.trackcode);
        parcel.writeParcelable(this.sectionInfo, i);
        AppsMiniappsCatalogItemHeaderDto appsMiniappsCatalogItemHeaderDto = this.header;
        if (appsMiniappsCatalogItemHeaderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsMiniappsCatalogItemHeaderDto.writeToParcel(parcel, i);
        }
        ExploreWidgetsBaseFooterDto exploreWidgetsBaseFooterDto = this.footer;
        if (exploreWidgetsBaseFooterDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreWidgetsBaseFooterDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsMiniappsCatalogItemDto(int i, AppsMiniappsCatalogItemPayloadDto appsMiniappsCatalogItemPayloadDto, String str, ExploreWidgetsBaseGamesCatalogSectionDto exploreWidgetsBaseGamesCatalogSectionDto, AppsMiniappsCatalogItemHeaderDto appsMiniappsCatalogItemHeaderDto, ExploreWidgetsBaseFooterDto exploreWidgetsBaseFooterDto, int i2, zcl zclVar) {
        this(i, appsMiniappsCatalogItemPayloadDto, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : exploreWidgetsBaseGamesCatalogSectionDto, (i2 & 16) != 0 ? null : appsMiniappsCatalogItemHeaderDto, (i2 & 32) != 0 ? null : exploreWidgetsBaseFooterDto);
    }
}
