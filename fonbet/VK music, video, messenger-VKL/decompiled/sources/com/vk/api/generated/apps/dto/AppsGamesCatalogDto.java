package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: AppsGamesCatalogDto.kt */
/* loaded from: classes14.dex */
public final class AppsGamesCatalogDto implements Parcelable {
    public static final Parcelable.Creator<AppsGamesCatalogDto> CREATOR = new a();

    @pmi0("achievements_modal_info")
    private final AppsMiniappsAchievementsModalInfoDto achievementsModalInfo;

    @pmi0("apps")
    private final List<AppsAppDto> apps;

    @pmi0("available_experiments")
    private final List<String> availableExperiments;

    @pmi0("available_tabs")
    private final List<String> availableTabs;

    @pmi0("count")
    private final int count;

    @pmi0("gift_icon")
    private final AppsMiniappsGiftIconDto giftIcon;

    @pmi0("has_notifications")
    private final Boolean hasNotifications;

    @pmi0("items")
    private final List<AppsMiniappsCatalogItemDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("pwa_modal_info")
    private final AppsMiniappsCatalogPwaModalInfoDto pwaModalInfo;

    /* compiled from: AppsGamesCatalogDto.kt */
    public static final class a implements Parcelable.Creator<AppsGamesCatalogDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGamesCatalogDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (true) {
                if (i == readInt2) {
                    break;
                }
                i = en.a(AppsMiniappsCatalogItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            int i2 = 0;
            while (i2 != readInt3) {
                i2 = bo.b(AppsGamesCatalogDto.class, parcel, arrayList2, i2, 1);
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt4);
            int i3 = 0;
            while (i3 != readInt4) {
                i3 = bo.b(AppsGamesCatalogDto.class, parcel, arrayList3, i3, 1);
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AppsGamesCatalogDto(readInt, arrayList, arrayList2, arrayList3, valueOf, parcel.readInt() == 0 ? null : AppsMiniappsCatalogPwaModalInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AppsMiniappsAchievementsModalInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AppsMiniappsGiftIconDto.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGamesCatalogDto[] newArray(int i) {
            return new AppsGamesCatalogDto[i];
        }
    }

    public AppsGamesCatalogDto(int i, List<AppsMiniappsCatalogItemDto> list, List<AppsAppDto> list2, List<UsersUserFullDto> list3, Boolean bool, AppsMiniappsCatalogPwaModalInfoDto appsMiniappsCatalogPwaModalInfoDto, AppsMiniappsAchievementsModalInfoDto appsMiniappsAchievementsModalInfoDto, AppsMiniappsGiftIconDto appsMiniappsGiftIconDto, List<String> list4, List<String> list5) {
        this.count = i;
        this.items = list;
        this.apps = list2;
        this.profiles = list3;
        this.hasNotifications = bool;
        this.pwaModalInfo = appsMiniappsCatalogPwaModalInfoDto;
        this.achievementsModalInfo = appsMiniappsAchievementsModalInfoDto;
        this.giftIcon = appsMiniappsGiftIconDto;
        this.availableTabs = list4;
        this.availableExperiments = list5;
    }

    public final AppsMiniappsAchievementsModalInfoDto d() {
        return this.achievementsModalInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AppsAppDto> e() {
        return this.apps;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGamesCatalogDto)) {
            return false;
        }
        AppsGamesCatalogDto appsGamesCatalogDto = (AppsGamesCatalogDto) obj;
        return this.count == appsGamesCatalogDto.count && epx.f(this.items, appsGamesCatalogDto.items) && epx.f(this.apps, appsGamesCatalogDto.apps) && epx.f(this.profiles, appsGamesCatalogDto.profiles) && epx.f(this.hasNotifications, appsGamesCatalogDto.hasNotifications) && epx.f(this.pwaModalInfo, appsGamesCatalogDto.pwaModalInfo) && epx.f(this.achievementsModalInfo, appsGamesCatalogDto.achievementsModalInfo) && epx.f(this.giftIcon, appsGamesCatalogDto.giftIcon) && epx.f(this.availableTabs, appsGamesCatalogDto.availableTabs) && epx.f(this.availableExperiments, appsGamesCatalogDto.availableExperiments);
    }

    public final AppsMiniappsGiftIconDto f() {
        return this.giftIcon;
    }

    public final Boolean g() {
        return this.hasNotifications;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.apps), 31, this.profiles);
        Boolean bool = this.hasNotifications;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        AppsMiniappsCatalogPwaModalInfoDto appsMiniappsCatalogPwaModalInfoDto = this.pwaModalInfo;
        int hashCode2 = (hashCode + (appsMiniappsCatalogPwaModalInfoDto == null ? 0 : appsMiniappsCatalogPwaModalInfoDto.hashCode())) * 31;
        AppsMiniappsAchievementsModalInfoDto appsMiniappsAchievementsModalInfoDto = this.achievementsModalInfo;
        int hashCode3 = (hashCode2 + (appsMiniappsAchievementsModalInfoDto == null ? 0 : appsMiniappsAchievementsModalInfoDto.hashCode())) * 31;
        AppsMiniappsGiftIconDto appsMiniappsGiftIconDto = this.giftIcon;
        int hashCode4 = (hashCode3 + (appsMiniappsGiftIconDto == null ? 0 : appsMiniappsGiftIconDto.hashCode())) * 31;
        List<String> list = this.availableTabs;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.availableExperiments;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final List<AppsMiniappsCatalogItemDto> i() {
        return this.items;
    }

    public final List<UsersUserFullDto> j() {
        return this.profiles;
    }

    public final AppsMiniappsCatalogPwaModalInfoDto k() {
        return this.pwaModalInfo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGamesCatalogDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", apps=");
        sb.append(this.apps);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", hasNotifications=");
        sb.append(this.hasNotifications);
        sb.append(", pwaModalInfo=");
        sb.append(this.pwaModalInfo);
        sb.append(", achievementsModalInfo=");
        sb.append(this.achievementsModalInfo);
        sb.append(", giftIcon=");
        sb.append(this.giftIcon);
        sb.append(", availableTabs=");
        sb.append(this.availableTabs);
        sb.append(", availableExperiments=");
        return ms9.a(')', sb, this.availableExperiments);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AppsMiniappsCatalogItemDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.apps);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        Iterator a4 = ao.a(parcel, this.profiles);
        while (a4.hasNext()) {
            parcel.writeParcelable((Parcelable) a4.next(), i);
        }
        Boolean bool = this.hasNotifications;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        AppsMiniappsCatalogPwaModalInfoDto appsMiniappsCatalogPwaModalInfoDto = this.pwaModalInfo;
        if (appsMiniappsCatalogPwaModalInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsMiniappsCatalogPwaModalInfoDto.writeToParcel(parcel, i);
        }
        AppsMiniappsAchievementsModalInfoDto appsMiniappsAchievementsModalInfoDto = this.achievementsModalInfo;
        if (appsMiniappsAchievementsModalInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsMiniappsAchievementsModalInfoDto.writeToParcel(parcel, i);
        }
        AppsMiniappsGiftIconDto appsMiniappsGiftIconDto = this.giftIcon;
        if (appsMiniappsGiftIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsMiniappsGiftIconDto.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.availableTabs);
        parcel.writeStringList(this.availableExperiments);
    }

    public /* synthetic */ AppsGamesCatalogDto(int i, List list, List list2, List list3, Boolean bool, AppsMiniappsCatalogPwaModalInfoDto appsMiniappsCatalogPwaModalInfoDto, AppsMiniappsAchievementsModalInfoDto appsMiniappsAchievementsModalInfoDto, AppsMiniappsGiftIconDto appsMiniappsGiftIconDto, List list4, List list5, int i2, zcl zclVar) {
        this(i, list, list2, list3, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : appsMiniappsCatalogPwaModalInfoDto, (i2 & 64) != 0 ? null : appsMiniappsAchievementsModalInfoDto, (i2 & 128) != 0 ? null : appsMiniappsGiftIconDto, (i2 & 256) != 0 ? null : list4, (i2 & 512) != 0 ? null : list5);
    }
}
