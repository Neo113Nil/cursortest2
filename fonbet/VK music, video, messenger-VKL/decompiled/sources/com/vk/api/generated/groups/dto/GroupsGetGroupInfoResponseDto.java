package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.audio.dto.AudioEventArtistsDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.database.dto.DatabaseCityByIdDto;
import com.vk.api.generated.database.dto.DatabaseStationDto;
import com.vk.api.generated.market.dto.MarketServiceRatingBenefitsDto;
import com.vk.api.generated.status.dto.StatusStatusDto;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGetGroupInfoResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetGroupInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetGroupInfoResponseDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final GroupsAddressDto address;

    @pmi0("artists")
    private final List<AudioEventArtistsDto> artists;

    @pmi0("banner")
    private final GroupsBannerDto banner;

    @pmi0("benefits")
    private final MarketServiceRatingBenefitsDto benefits;

    @pmi0("city")
    private final DatabaseCityByIdDto city;

    @pmi0("country")
    private final BaseCountryDto country;

    @pmi0("creation_onboarding")
    private final GroupsCreationOnboardingDto creationOnboarding;

    @pmi0("group")
    private final GroupsGroupFullDto group;

    @pmi0("is_member_extended")
    private final GroupsIsMemberExtendedDto isMemberExtended;

    @pmi0("live_covers")
    private final List<StoriesStoryDto> liveCovers;

    @pmi0("market_cart_total_quantity")
    private final Integer marketCartTotalQuantity;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("station")
    private final DatabaseStationDto station;

    @pmi0("status")
    private final StatusStatusDto status;

    @pmi0("suggestions")
    private final GroupsSuggestionsDto suggestions;

    @pmi0("unread_conversation_count")
    private final Integer unreadConversationCount;

    @pmi0("widget")
    private final GroupsAppWidgetDto widget;

    /* compiled from: GroupsGetGroupInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetGroupInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetGroupInfoResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            GroupsBannerDto groupsBannerDto;
            ArrayList arrayList3;
            GroupsGroupFullDto groupsGroupFullDto;
            GroupsGroupFullDto groupsGroupFullDto2 = (GroupsGroupFullDto) parcel.readParcelable(GroupsGetGroupInfoResponseDto.class.getClassLoader());
            GroupsIsMemberExtendedDto createFromParcel = parcel.readInt() == 0 ? null : GroupsIsMemberExtendedDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(GroupsGetGroupInfoResponseDto.class, parcel, arrayList, i, 1);
                }
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsCreationOnboardingDto createFromParcel2 = parcel.readInt() == 0 ? null : GroupsCreationOnboardingDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(AudioEventArtistsDto.CREATOR, parcel, arrayList2, i2, 1);
                }
            }
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MarketServiceRatingBenefitsDto createFromParcel3 = parcel.readInt() == 0 ? null : MarketServiceRatingBenefitsDto.CREATOR.createFromParcel(parcel);
            GroupsSuggestionsDto createFromParcel4 = parcel.readInt() == 0 ? null : GroupsSuggestionsDto.CREATOR.createFromParcel(parcel);
            StatusStatusDto createFromParcel5 = parcel.readInt() == 0 ? null : StatusStatusDto.CREATOR.createFromParcel(parcel);
            GroupsAppWidgetDto createFromParcel6 = parcel.readInt() == 0 ? null : GroupsAppWidgetDto.CREATOR.createFromParcel(parcel);
            GroupsBannerDto groupsBannerDto2 = (GroupsBannerDto) parcel.readParcelable(GroupsGetGroupInfoResponseDto.class.getClassLoader());
            GroupsAddressDto groupsAddressDto = (GroupsAddressDto) parcel.readParcelable(GroupsGetGroupInfoResponseDto.class.getClassLoader());
            DatabaseStationDto databaseStationDto = (DatabaseStationDto) parcel.readParcelable(GroupsGetGroupInfoResponseDto.class.getClassLoader());
            Integer num = valueOf;
            DatabaseCityByIdDto databaseCityByIdDto = (DatabaseCityByIdDto) parcel.readParcelable(GroupsGetGroupInfoResponseDto.class.getClassLoader());
            BaseCountryDto baseCountryDto = (BaseCountryDto) parcel.readParcelable(GroupsGetGroupInfoResponseDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                groupsBannerDto = groupsBannerDto2;
                groupsGroupFullDto = groupsGroupFullDto2;
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                groupsBannerDto = groupsBannerDto2;
                arrayList3 = new ArrayList(readInt3);
                groupsGroupFullDto = groupsGroupFullDto2;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(GroupsGetGroupInfoResponseDto.class, parcel, arrayList3, i3, 1);
                    readInt3 = readInt3;
                }
            }
            return new GroupsGetGroupInfoResponseDto(groupsGroupFullDto, createFromParcel, arrayList, num, createFromParcel2, arrayList2, valueOf2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, groupsBannerDto, groupsAddressDto, databaseStationDto, databaseCityByIdDto, baseCountryDto, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetGroupInfoResponseDto[] newArray(int i) {
            return new GroupsGetGroupInfoResponseDto[i];
        }
    }

    public GroupsGetGroupInfoResponseDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetGroupInfoResponseDto)) {
            return false;
        }
        GroupsGetGroupInfoResponseDto groupsGetGroupInfoResponseDto = (GroupsGetGroupInfoResponseDto) obj;
        return epx.f(this.group, groupsGetGroupInfoResponseDto.group) && epx.f(this.isMemberExtended, groupsGetGroupInfoResponseDto.isMemberExtended) && epx.f(this.liveCovers, groupsGetGroupInfoResponseDto.liveCovers) && epx.f(this.unreadConversationCount, groupsGetGroupInfoResponseDto.unreadConversationCount) && epx.f(this.creationOnboarding, groupsGetGroupInfoResponseDto.creationOnboarding) && epx.f(this.artists, groupsGetGroupInfoResponseDto.artists) && epx.f(this.marketCartTotalQuantity, groupsGetGroupInfoResponseDto.marketCartTotalQuantity) && epx.f(this.benefits, groupsGetGroupInfoResponseDto.benefits) && epx.f(this.suggestions, groupsGetGroupInfoResponseDto.suggestions) && epx.f(this.status, groupsGetGroupInfoResponseDto.status) && epx.f(this.widget, groupsGetGroupInfoResponseDto.widget) && epx.f(this.banner, groupsGetGroupInfoResponseDto.banner) && epx.f(this.address, groupsGetGroupInfoResponseDto.address) && epx.f(this.station, groupsGetGroupInfoResponseDto.station) && epx.f(this.city, groupsGetGroupInfoResponseDto.city) && epx.f(this.country, groupsGetGroupInfoResponseDto.country) && epx.f(this.profiles, groupsGetGroupInfoResponseDto.profiles);
    }

    public final int hashCode() {
        GroupsGroupFullDto groupsGroupFullDto = this.group;
        int hashCode = (groupsGroupFullDto == null ? 0 : groupsGroupFullDto.hashCode()) * 31;
        GroupsIsMemberExtendedDto groupsIsMemberExtendedDto = this.isMemberExtended;
        int hashCode2 = (hashCode + (groupsIsMemberExtendedDto == null ? 0 : groupsIsMemberExtendedDto.hashCode())) * 31;
        List<StoriesStoryDto> list = this.liveCovers;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.unreadConversationCount;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        GroupsCreationOnboardingDto groupsCreationOnboardingDto = this.creationOnboarding;
        int hashCode5 = (hashCode4 + (groupsCreationOnboardingDto == null ? 0 : groupsCreationOnboardingDto.hashCode())) * 31;
        List<AudioEventArtistsDto> list2 = this.artists;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.marketCartTotalQuantity;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        MarketServiceRatingBenefitsDto marketServiceRatingBenefitsDto = this.benefits;
        int hashCode8 = (hashCode7 + (marketServiceRatingBenefitsDto == null ? 0 : marketServiceRatingBenefitsDto.hashCode())) * 31;
        GroupsSuggestionsDto groupsSuggestionsDto = this.suggestions;
        int hashCode9 = (hashCode8 + (groupsSuggestionsDto == null ? 0 : groupsSuggestionsDto.hashCode())) * 31;
        StatusStatusDto statusStatusDto = this.status;
        int hashCode10 = (hashCode9 + (statusStatusDto == null ? 0 : statusStatusDto.hashCode())) * 31;
        GroupsAppWidgetDto groupsAppWidgetDto = this.widget;
        int hashCode11 = (hashCode10 + (groupsAppWidgetDto == null ? 0 : groupsAppWidgetDto.hashCode())) * 31;
        GroupsBannerDto groupsBannerDto = this.banner;
        int hashCode12 = (hashCode11 + (groupsBannerDto == null ? 0 : groupsBannerDto.hashCode())) * 31;
        GroupsAddressDto groupsAddressDto = this.address;
        int hashCode13 = (hashCode12 + (groupsAddressDto == null ? 0 : groupsAddressDto.hashCode())) * 31;
        DatabaseStationDto databaseStationDto = this.station;
        int hashCode14 = (hashCode13 + (databaseStationDto == null ? 0 : databaseStationDto.hashCode())) * 31;
        DatabaseCityByIdDto databaseCityByIdDto = this.city;
        int hashCode15 = (hashCode14 + (databaseCityByIdDto == null ? 0 : databaseCityByIdDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode16 = (hashCode15 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        List<UsersUserFullDto> list3 = this.profiles;
        return hashCode16 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetGroupInfoResponseDto(group=");
        sb.append(this.group);
        sb.append(", isMemberExtended=");
        sb.append(this.isMemberExtended);
        sb.append(", liveCovers=");
        sb.append(this.liveCovers);
        sb.append(", unreadConversationCount=");
        sb.append(this.unreadConversationCount);
        sb.append(", creationOnboarding=");
        sb.append(this.creationOnboarding);
        sb.append(", artists=");
        sb.append(this.artists);
        sb.append(", marketCartTotalQuantity=");
        sb.append(this.marketCartTotalQuantity);
        sb.append(", benefits=");
        sb.append(this.benefits);
        sb.append(", suggestions=");
        sb.append(this.suggestions);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", widget=");
        sb.append(this.widget);
        sb.append(", banner=");
        sb.append(this.banner);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", station=");
        sb.append(this.station);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.group, i);
        GroupsIsMemberExtendedDto groupsIsMemberExtendedDto = this.isMemberExtended;
        if (groupsIsMemberExtendedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsIsMemberExtendedDto.writeToParcel(parcel, i);
        }
        List<StoriesStoryDto> list = this.liveCovers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num = this.unreadConversationCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        GroupsCreationOnboardingDto groupsCreationOnboardingDto = this.creationOnboarding;
        if (groupsCreationOnboardingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreationOnboardingDto.writeToParcel(parcel, i);
        }
        List<AudioEventArtistsDto> list2 = this.artists;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((AudioEventArtistsDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        Integer num2 = this.marketCartTotalQuantity;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        MarketServiceRatingBenefitsDto marketServiceRatingBenefitsDto = this.benefits;
        if (marketServiceRatingBenefitsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketServiceRatingBenefitsDto.writeToParcel(parcel, i);
        }
        GroupsSuggestionsDto groupsSuggestionsDto = this.suggestions;
        if (groupsSuggestionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsSuggestionsDto.writeToParcel(parcel, i);
        }
        StatusStatusDto statusStatusDto = this.status;
        if (statusStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusStatusDto.writeToParcel(parcel, i);
        }
        GroupsAppWidgetDto groupsAppWidgetDto = this.widget;
        if (groupsAppWidgetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAppWidgetDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.banner, i);
        parcel.writeParcelable(this.address, i);
        parcel.writeParcelable(this.station, i);
        parcel.writeParcelable(this.city, i);
        parcel.writeParcelable(this.country, i);
        List<UsersUserFullDto> list3 = this.profiles;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            parcel.writeParcelable((Parcelable) f3.next(), i);
        }
    }

    public GroupsGetGroupInfoResponseDto(GroupsGroupFullDto groupsGroupFullDto, GroupsIsMemberExtendedDto groupsIsMemberExtendedDto, List<StoriesStoryDto> list, Integer num, GroupsCreationOnboardingDto groupsCreationOnboardingDto, List<AudioEventArtistsDto> list2, Integer num2, MarketServiceRatingBenefitsDto marketServiceRatingBenefitsDto, GroupsSuggestionsDto groupsSuggestionsDto, StatusStatusDto statusStatusDto, GroupsAppWidgetDto groupsAppWidgetDto, GroupsBannerDto groupsBannerDto, GroupsAddressDto groupsAddressDto, DatabaseStationDto databaseStationDto, DatabaseCityByIdDto databaseCityByIdDto, BaseCountryDto baseCountryDto, List<UsersUserFullDto> list3) {
        this.group = groupsGroupFullDto;
        this.isMemberExtended = groupsIsMemberExtendedDto;
        this.liveCovers = list;
        this.unreadConversationCount = num;
        this.creationOnboarding = groupsCreationOnboardingDto;
        this.artists = list2;
        this.marketCartTotalQuantity = num2;
        this.benefits = marketServiceRatingBenefitsDto;
        this.suggestions = groupsSuggestionsDto;
        this.status = statusStatusDto;
        this.widget = groupsAppWidgetDto;
        this.banner = groupsBannerDto;
        this.address = groupsAddressDto;
        this.station = databaseStationDto;
        this.city = databaseCityByIdDto;
        this.country = baseCountryDto;
        this.profiles = list3;
    }

    public /* synthetic */ GroupsGetGroupInfoResponseDto(GroupsGroupFullDto groupsGroupFullDto, GroupsIsMemberExtendedDto groupsIsMemberExtendedDto, List list, Integer num, GroupsCreationOnboardingDto groupsCreationOnboardingDto, List list2, Integer num2, MarketServiceRatingBenefitsDto marketServiceRatingBenefitsDto, GroupsSuggestionsDto groupsSuggestionsDto, StatusStatusDto statusStatusDto, GroupsAppWidgetDto groupsAppWidgetDto, GroupsBannerDto groupsBannerDto, GroupsAddressDto groupsAddressDto, DatabaseStationDto databaseStationDto, DatabaseCityByIdDto databaseCityByIdDto, BaseCountryDto baseCountryDto, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : groupsGroupFullDto, (i & 2) != 0 ? null : groupsIsMemberExtendedDto, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : groupsCreationOnboardingDto, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : marketServiceRatingBenefitsDto, (i & 256) != 0 ? null : groupsSuggestionsDto, (i & 512) != 0 ? null : statusStatusDto, (i & 1024) != 0 ? null : groupsAppWidgetDto, (i & 2048) != 0 ? null : groupsBannerDto, (i & 4096) != 0 ? null : groupsAddressDto, (i & 8192) != 0 ? null : databaseStationDto, (i & 16384) != 0 ? null : databaseCityByIdDto, (i & 32768) != 0 ? null : baseCountryDto, (i & 65536) != 0 ? null : list3);
    }
}
