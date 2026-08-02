package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseImageContainerDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsMiniappsCatalogItemPayloadCardDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadCardDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadCardDto> CREATOR = new a();

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsMiniappsCatalogAppDto f66app;

    @pmi0("background_color")
    private final List<String> backgroundColor;

    @pmi0("background_image")
    private final ExploreWidgetsBaseImageContainerDto backgroundImage;

    @pmi0("description")
    private final AppsMiniappsCatalogItemTextDto description;

    @pmi0("footer")
    private final AppsMiniappsCatalogItemPayloadGamesUserStackDto footer;

    @pmi0("panel")
    private final AppsMiniappsCatalogItemPayloadCardPanelDto panel;

    @pmi0("profiles_ids")
    private final List<UserId> profilesIds;

    @pmi0("section_id")
    private final String sectionId;

    @pmi0("subtitle")
    private final AppsMiniappsCatalogItemTextDto subtitle;

    @pmi0("title")
    private final AppsMiniappsCatalogItemTextDto title;

    @pmi0("type")
    private final AppsMiniappsCatalogItemPayloadCardTypeDto type;

    /* compiled from: AppsMiniappsCatalogItemPayloadCardDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadCardDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadCardDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AppsMiniappsCatalogItemPayloadCardTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadCardTypeDto.CREATOR.createFromParcel(parcel);
            ExploreWidgetsBaseImageContainerDto exploreWidgetsBaseImageContainerDto = (ExploreWidgetsBaseImageContainerDto) parcel.readParcelable(AppsMiniappsCatalogItemPayloadCardDto.class.getClassLoader());
            Parcelable.Creator<AppsMiniappsCatalogItemTextDto> creator = AppsMiniappsCatalogItemTextDto.CREATOR;
            AppsMiniappsCatalogItemTextDto createFromParcel2 = creator.createFromParcel(parcel);
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            AppsMiniappsCatalogAppDto createFromParcel3 = AppsMiniappsCatalogAppDto.CREATOR.createFromParcel(parcel);
            AppsMiniappsCatalogItemPayloadCardPanelDto createFromParcel4 = parcel.readInt() == 0 ? null : AppsMiniappsCatalogItemPayloadCardPanelDto.CREATOR.createFromParcel(parcel);
            AppsMiniappsCatalogItemTextDto createFromParcel5 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            AppsMiniappsCatalogItemTextDto createFromParcel6 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            String readString = parcel.readString();
            AppsMiniappsCatalogItemPayloadGamesUserStackDto createFromParcel7 = parcel.readInt() == 0 ? null : AppsMiniappsCatalogItemPayloadGamesUserStackDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AppsMiniappsCatalogItemPayloadCardDto.class, parcel, arrayList, i, 1);
                }
            }
            return new AppsMiniappsCatalogItemPayloadCardDto(createFromParcel, exploreWidgetsBaseImageContainerDto, createFromParcel2, createStringArrayList, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, readString, createFromParcel7, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadCardDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadCardDto[i];
        }
    }

    public AppsMiniappsCatalogItemPayloadCardDto(AppsMiniappsCatalogItemPayloadCardTypeDto appsMiniappsCatalogItemPayloadCardTypeDto, ExploreWidgetsBaseImageContainerDto exploreWidgetsBaseImageContainerDto, AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto, List<String> list, AppsMiniappsCatalogAppDto appsMiniappsCatalogAppDto, AppsMiniappsCatalogItemPayloadCardPanelDto appsMiniappsCatalogItemPayloadCardPanelDto, AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto2, AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto3, String str, AppsMiniappsCatalogItemPayloadGamesUserStackDto appsMiniappsCatalogItemPayloadGamesUserStackDto, List<UserId> list2) {
        this.type = appsMiniappsCatalogItemPayloadCardTypeDto;
        this.backgroundImage = exploreWidgetsBaseImageContainerDto;
        this.title = appsMiniappsCatalogItemTextDto;
        this.backgroundColor = list;
        this.f66app = appsMiniappsCatalogAppDto;
        this.panel = appsMiniappsCatalogItemPayloadCardPanelDto;
        this.subtitle = appsMiniappsCatalogItemTextDto2;
        this.description = appsMiniappsCatalogItemTextDto3;
        this.sectionId = str;
        this.footer = appsMiniappsCatalogItemPayloadGamesUserStackDto;
        this.profilesIds = list2;
    }

    public final AppsMiniappsCatalogAppDto d() {
        return this.f66app;
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
        if (!(obj instanceof AppsMiniappsCatalogItemPayloadCardDto)) {
            return false;
        }
        AppsMiniappsCatalogItemPayloadCardDto appsMiniappsCatalogItemPayloadCardDto = (AppsMiniappsCatalogItemPayloadCardDto) obj;
        return this.type == appsMiniappsCatalogItemPayloadCardDto.type && epx.f(this.backgroundImage, appsMiniappsCatalogItemPayloadCardDto.backgroundImage) && epx.f(this.title, appsMiniappsCatalogItemPayloadCardDto.title) && epx.f(this.backgroundColor, appsMiniappsCatalogItemPayloadCardDto.backgroundColor) && epx.f(this.f66app, appsMiniappsCatalogItemPayloadCardDto.f66app) && epx.f(this.panel, appsMiniappsCatalogItemPayloadCardDto.panel) && epx.f(this.subtitle, appsMiniappsCatalogItemPayloadCardDto.subtitle) && epx.f(this.description, appsMiniappsCatalogItemPayloadCardDto.description) && epx.f(this.sectionId, appsMiniappsCatalogItemPayloadCardDto.sectionId) && epx.f(this.footer, appsMiniappsCatalogItemPayloadCardDto.footer) && epx.f(this.profilesIds, appsMiniappsCatalogItemPayloadCardDto.profilesIds);
    }

    public final ExploreWidgetsBaseImageContainerDto f() {
        return this.backgroundImage;
    }

    public final AppsMiniappsCatalogItemPayloadCardPanelDto g() {
        return this.panel;
    }

    public final int hashCode() {
        int hashCode = (this.f66app.hashCode() + fw3.a((this.title.hashCode() + ((this.backgroundImage.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31, 31, this.backgroundColor)) * 31;
        AppsMiniappsCatalogItemPayloadCardPanelDto appsMiniappsCatalogItemPayloadCardPanelDto = this.panel;
        int hashCode2 = (hashCode + (appsMiniappsCatalogItemPayloadCardPanelDto == null ? 0 : appsMiniappsCatalogItemPayloadCardPanelDto.hashCode())) * 31;
        AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto = this.subtitle;
        int hashCode3 = (hashCode2 + (appsMiniappsCatalogItemTextDto == null ? 0 : appsMiniappsCatalogItemTextDto.hashCode())) * 31;
        AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto2 = this.description;
        int hashCode4 = (hashCode3 + (appsMiniappsCatalogItemTextDto2 == null ? 0 : appsMiniappsCatalogItemTextDto2.hashCode())) * 31;
        String str = this.sectionId;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        AppsMiniappsCatalogItemPayloadGamesUserStackDto appsMiniappsCatalogItemPayloadGamesUserStackDto = this.footer;
        int hashCode6 = (hashCode5 + (appsMiniappsCatalogItemPayloadGamesUserStackDto == null ? 0 : appsMiniappsCatalogItemPayloadGamesUserStackDto.hashCode())) * 31;
        List<UserId> list = this.profilesIds;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final AppsMiniappsCatalogItemTextDto i() {
        return this.subtitle;
    }

    public final AppsMiniappsCatalogItemTextDto j() {
        return this.title;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadCardDto(type=");
        sb.append(this.type);
        sb.append(", backgroundImage=");
        sb.append(this.backgroundImage);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", app=");
        sb.append(this.f66app);
        sb.append(", panel=");
        sb.append(this.panel);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", sectionId=");
        sb.append(this.sectionId);
        sb.append(", footer=");
        sb.append(this.footer);
        sb.append(", profilesIds=");
        return ms9.a(')', sb, this.profilesIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.backgroundImage, i);
        this.title.writeToParcel(parcel, i);
        parcel.writeStringList(this.backgroundColor);
        this.f66app.writeToParcel(parcel, i);
        AppsMiniappsCatalogItemPayloadCardPanelDto appsMiniappsCatalogItemPayloadCardPanelDto = this.panel;
        if (appsMiniappsCatalogItemPayloadCardPanelDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsMiniappsCatalogItemPayloadCardPanelDto.writeToParcel(parcel, i);
        }
        AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto = this.subtitle;
        if (appsMiniappsCatalogItemTextDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsMiniappsCatalogItemTextDto.writeToParcel(parcel, i);
        }
        AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto2 = this.description;
        if (appsMiniappsCatalogItemTextDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsMiniappsCatalogItemTextDto2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.sectionId);
        AppsMiniappsCatalogItemPayloadGamesUserStackDto appsMiniappsCatalogItemPayloadGamesUserStackDto = this.footer;
        if (appsMiniappsCatalogItemPayloadGamesUserStackDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsMiniappsCatalogItemPayloadGamesUserStackDto.writeToParcel(parcel, i);
        }
        List<UserId> list = this.profilesIds;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ AppsMiniappsCatalogItemPayloadCardDto(AppsMiniappsCatalogItemPayloadCardTypeDto appsMiniappsCatalogItemPayloadCardTypeDto, ExploreWidgetsBaseImageContainerDto exploreWidgetsBaseImageContainerDto, AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto, List list, AppsMiniappsCatalogAppDto appsMiniappsCatalogAppDto, AppsMiniappsCatalogItemPayloadCardPanelDto appsMiniappsCatalogItemPayloadCardPanelDto, AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto2, AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto3, String str, AppsMiniappsCatalogItemPayloadGamesUserStackDto appsMiniappsCatalogItemPayloadGamesUserStackDto, List list2, int i, zcl zclVar) {
        this(appsMiniappsCatalogItemPayloadCardTypeDto, exploreWidgetsBaseImageContainerDto, appsMiniappsCatalogItemTextDto, list, appsMiniappsCatalogAppDto, (i & 32) != 0 ? null : appsMiniappsCatalogItemPayloadCardPanelDto, (i & 64) != 0 ? null : appsMiniappsCatalogItemTextDto2, (i & 128) != 0 ? null : appsMiniappsCatalogItemTextDto3, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : appsMiniappsCatalogItemPayloadGamesUserStackDto, (i & 1024) != 0 ? null : list2);
    }
}
