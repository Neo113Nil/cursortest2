package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseImageContainerDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AppsMiniappsCatalogItemPayloadGameActivityFeedDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadGameActivityFeedDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGameActivityFeedDto> CREATOR = new a();

    @pmi0("app_id")
    private final int appId;

    @pmi0("banner")
    private final ExploreWidgetsBaseImageContainerDto banner;

    @pmi0("friends_count")
    private final Integer friendsCount;

    @pmi0("items")
    private final List<AppsActivityItemDto> items;

    /* compiled from: AppsMiniappsCatalogItemPayloadGameActivityFeedDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGameActivityFeedDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGameActivityFeedDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(AppsActivityItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppsMiniappsCatalogItemPayloadGameActivityFeedDto(readInt, arrayList, (ExploreWidgetsBaseImageContainerDto) parcel.readParcelable(AppsMiniappsCatalogItemPayloadGameActivityFeedDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGameActivityFeedDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadGameActivityFeedDto[i];
        }
    }

    public AppsMiniappsCatalogItemPayloadGameActivityFeedDto(int i, List<AppsActivityItemDto> list, ExploreWidgetsBaseImageContainerDto exploreWidgetsBaseImageContainerDto, Integer num) {
        this.appId = i;
        this.items = list;
        this.banner = exploreWidgetsBaseImageContainerDto;
        this.friendsCount = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsCatalogItemPayloadGameActivityFeedDto)) {
            return false;
        }
        AppsMiniappsCatalogItemPayloadGameActivityFeedDto appsMiniappsCatalogItemPayloadGameActivityFeedDto = (AppsMiniappsCatalogItemPayloadGameActivityFeedDto) obj;
        return this.appId == appsMiniappsCatalogItemPayloadGameActivityFeedDto.appId && epx.f(this.items, appsMiniappsCatalogItemPayloadGameActivityFeedDto.items) && epx.f(this.banner, appsMiniappsCatalogItemPayloadGameActivityFeedDto.banner) && epx.f(this.friendsCount, appsMiniappsCatalogItemPayloadGameActivityFeedDto.friendsCount);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.appId) * 31, 31, this.items);
        ExploreWidgetsBaseImageContainerDto exploreWidgetsBaseImageContainerDto = this.banner;
        int hashCode = (a2 + (exploreWidgetsBaseImageContainerDto == null ? 0 : exploreWidgetsBaseImageContainerDto.hashCode())) * 31;
        Integer num = this.friendsCount;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadGameActivityFeedDto(appId=");
        sb.append(this.appId);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", banner=");
        sb.append(this.banner);
        sb.append(", friendsCount=");
        return uqi.b(sb, this.friendsCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.appId);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AppsActivityItemDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.banner, i);
        Integer num = this.friendsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ AppsMiniappsCatalogItemPayloadGameActivityFeedDto(int i, List list, ExploreWidgetsBaseImageContainerDto exploreWidgetsBaseImageContainerDto, Integer num, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : exploreWidgetsBaseImageContainerDto, (i2 & 8) != 0 ? null : num);
    }
}
