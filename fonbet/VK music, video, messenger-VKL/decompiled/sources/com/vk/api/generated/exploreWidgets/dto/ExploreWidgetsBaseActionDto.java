package com.vk.api.generated.exploreWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ExploreWidgetsBaseActionDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetsBaseActionDto implements Parcelable {
    public static final Parcelable.Creator<ExploreWidgetsBaseActionDto> CREATOR = new a();

    @pmi0("app_launch_params")
    private final ExploreWidgetsBaseAppLaunchParamsDto appLaunchParams;

    @pmi0(CampaignEx.JSON_KEY_DEEP_LINK_URL)
    private final String deepLink;

    @pmi0("fallback_action")
    private final ExploreWidgetsBaseActionDto fallbackAction;

    @pmi0("games_catalog_section")
    private final ExploreWidgetsBaseGamesCatalogSectionDto gamesCatalogSection;

    @pmi0("item_id")
    private final Integer itemId;

    @pmi0("message")
    private final ExploreWidgetsBaseSendMessageDto message;

    @pmi0("needed_permissions")
    private final List<ExploreWidgetsPermissionsDto> neededPermissions;

    @pmi0("package_name")
    private final String packageName;

    @pmi0("peer_id")
    private final Integer peerId;

    @pmi0("section_id")
    private final String sectionId;

    @pmi0("type")
    private final ExploreWidgetsBaseActionTypeDto type;

    @pmi0("url")
    private final String url;

    /* compiled from: ExploreWidgetsBaseActionDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetsBaseActionDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseActionDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ExploreWidgetsBaseActionTypeDto createFromParcel = ExploreWidgetsBaseActionTypeDto.CREATOR.createFromParcel(parcel);
            ExploreWidgetsBaseAppLaunchParamsDto createFromParcel2 = parcel.readInt() == 0 ? null : ExploreWidgetsBaseAppLaunchParamsDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(ExploreWidgetsPermissionsDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new ExploreWidgetsBaseActionDto(createFromParcel, createFromParcel2, readString, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ExploreWidgetsBaseSendMessageDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : ExploreWidgetsBaseGamesCatalogSectionDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ExploreWidgetsBaseActionDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseActionDto[] newArray(int i) {
            return new ExploreWidgetsBaseActionDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExploreWidgetsBaseActionDto(ExploreWidgetsBaseActionTypeDto exploreWidgetsBaseActionTypeDto, ExploreWidgetsBaseAppLaunchParamsDto exploreWidgetsBaseAppLaunchParamsDto, String str, List<? extends ExploreWidgetsPermissionsDto> list, Integer num, Integer num2, ExploreWidgetsBaseSendMessageDto exploreWidgetsBaseSendMessageDto, String str2, ExploreWidgetsBaseGamesCatalogSectionDto exploreWidgetsBaseGamesCatalogSectionDto, String str3, String str4, ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto) {
        this.type = exploreWidgetsBaseActionTypeDto;
        this.appLaunchParams = exploreWidgetsBaseAppLaunchParamsDto;
        this.url = str;
        this.neededPermissions = list;
        this.peerId = num;
        this.itemId = num2;
        this.message = exploreWidgetsBaseSendMessageDto;
        this.sectionId = str2;
        this.gamesCatalogSection = exploreWidgetsBaseGamesCatalogSectionDto;
        this.packageName = str3;
        this.deepLink = str4;
        this.fallbackAction = exploreWidgetsBaseActionDto;
    }

    public final ExploreWidgetsBaseAppLaunchParamsDto d() {
        return this.appLaunchParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.deepLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreWidgetsBaseActionDto)) {
            return false;
        }
        ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto = (ExploreWidgetsBaseActionDto) obj;
        return this.type == exploreWidgetsBaseActionDto.type && epx.f(this.appLaunchParams, exploreWidgetsBaseActionDto.appLaunchParams) && epx.f(this.url, exploreWidgetsBaseActionDto.url) && epx.f(this.neededPermissions, exploreWidgetsBaseActionDto.neededPermissions) && epx.f(this.peerId, exploreWidgetsBaseActionDto.peerId) && epx.f(this.itemId, exploreWidgetsBaseActionDto.itemId) && epx.f(this.message, exploreWidgetsBaseActionDto.message) && epx.f(this.sectionId, exploreWidgetsBaseActionDto.sectionId) && epx.f(this.gamesCatalogSection, exploreWidgetsBaseActionDto.gamesCatalogSection) && epx.f(this.packageName, exploreWidgetsBaseActionDto.packageName) && epx.f(this.deepLink, exploreWidgetsBaseActionDto.deepLink) && epx.f(this.fallbackAction, exploreWidgetsBaseActionDto.fallbackAction);
    }

    public final ExploreWidgetsBaseActionDto f() {
        return this.fallbackAction;
    }

    public final ExploreWidgetsBaseGamesCatalogSectionDto g() {
        return this.gamesCatalogSection;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        ExploreWidgetsBaseAppLaunchParamsDto exploreWidgetsBaseAppLaunchParamsDto = this.appLaunchParams;
        int hashCode2 = (hashCode + (exploreWidgetsBaseAppLaunchParamsDto == null ? 0 : exploreWidgetsBaseAppLaunchParamsDto.hashCode())) * 31;
        String str = this.url;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<ExploreWidgetsPermissionsDto> list = this.neededPermissions;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.peerId;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.itemId;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ExploreWidgetsBaseSendMessageDto exploreWidgetsBaseSendMessageDto = this.message;
        int hashCode7 = (hashCode6 + (exploreWidgetsBaseSendMessageDto == null ? 0 : exploreWidgetsBaseSendMessageDto.hashCode())) * 31;
        String str2 = this.sectionId;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ExploreWidgetsBaseGamesCatalogSectionDto exploreWidgetsBaseGamesCatalogSectionDto = this.gamesCatalogSection;
        int hashCode9 = (hashCode8 + (exploreWidgetsBaseGamesCatalogSectionDto == null ? 0 : exploreWidgetsBaseGamesCatalogSectionDto.hashCode())) * 31;
        String str3 = this.packageName;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deepLink;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto = this.fallbackAction;
        return hashCode11 + (exploreWidgetsBaseActionDto != null ? exploreWidgetsBaseActionDto.hashCode() : 0);
    }

    public final ExploreWidgetsBaseSendMessageDto i() {
        return this.message;
    }

    public final List<ExploreWidgetsPermissionsDto> j() {
        return this.neededPermissions;
    }

    public final String k() {
        return this.packageName;
    }

    public final Integer l() {
        return this.peerId;
    }

    public final String n() {
        return this.sectionId;
    }

    public final ExploreWidgetsBaseActionTypeDto o() {
        return this.type;
    }

    public final String toString() {
        return "ExploreWidgetsBaseActionDto(type=" + this.type + ", appLaunchParams=" + this.appLaunchParams + ", url=" + this.url + ", neededPermissions=" + this.neededPermissions + ", peerId=" + this.peerId + ", itemId=" + this.itemId + ", message=" + this.message + ", sectionId=" + this.sectionId + ", gamesCatalogSection=" + this.gamesCatalogSection + ", packageName=" + this.packageName + ", deepLink=" + this.deepLink + ", fallbackAction=" + this.fallbackAction + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        ExploreWidgetsBaseAppLaunchParamsDto exploreWidgetsBaseAppLaunchParamsDto = this.appLaunchParams;
        if (exploreWidgetsBaseAppLaunchParamsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreWidgetsBaseAppLaunchParamsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.url);
        List<ExploreWidgetsPermissionsDto> list = this.neededPermissions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((ExploreWidgetsPermissionsDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.peerId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.itemId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        ExploreWidgetsBaseSendMessageDto exploreWidgetsBaseSendMessageDto = this.message;
        if (exploreWidgetsBaseSendMessageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreWidgetsBaseSendMessageDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.sectionId);
        ExploreWidgetsBaseGamesCatalogSectionDto exploreWidgetsBaseGamesCatalogSectionDto = this.gamesCatalogSection;
        if (exploreWidgetsBaseGamesCatalogSectionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreWidgetsBaseGamesCatalogSectionDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.packageName);
        parcel.writeString(this.deepLink);
        ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto = this.fallbackAction;
        if (exploreWidgetsBaseActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreWidgetsBaseActionDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ExploreWidgetsBaseActionDto(ExploreWidgetsBaseActionTypeDto exploreWidgetsBaseActionTypeDto, ExploreWidgetsBaseAppLaunchParamsDto exploreWidgetsBaseAppLaunchParamsDto, String str, List list, Integer num, Integer num2, ExploreWidgetsBaseSendMessageDto exploreWidgetsBaseSendMessageDto, String str2, ExploreWidgetsBaseGamesCatalogSectionDto exploreWidgetsBaseGamesCatalogSectionDto, String str3, String str4, ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto, int i, zcl zclVar) {
        this(exploreWidgetsBaseActionTypeDto, (i & 2) != 0 ? null : exploreWidgetsBaseAppLaunchParamsDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : exploreWidgetsBaseSendMessageDto, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : exploreWidgetsBaseGamesCatalogSectionDto, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : exploreWidgetsBaseActionDto);
    }
}
