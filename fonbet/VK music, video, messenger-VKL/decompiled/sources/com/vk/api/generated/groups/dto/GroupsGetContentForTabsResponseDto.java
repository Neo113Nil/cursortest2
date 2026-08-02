package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGetContentForTabsResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetContentForTabsResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetContentForTabsResponseDto> CREATOR = new a();

    @pmi0("addresses")
    private final GroupsTabContentAddressesDto addresses;

    @pmi0("articles")
    private final GroupsTabContentArticlesDto articles;

    @pmi0("audios")
    private final GroupsTabContentAudiosDto audios;

    @pmi0("chats")
    private final GroupsTabContentChatsDto chats;

    @pmi0("classifieds")
    private final GroupsTabContentClassifiedsDto classifieds;

    @pmi0("discussions")
    private final GroupsTabContentDiscussionsDto discussions;

    @pmi0("events")
    private final GroupsTabContentEventsDto events;

    @pmi0("files")
    private final GroupsTabContentFilesDto files;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("market")
    private final GroupsTabContentMarketDto market;

    @pmi0("narratives")
    private final GroupsTabContentNarrativesDto narratives;

    @pmi0("photos")
    private final GroupsTabContentPhotosDto photos;

    @pmi0("podcasts")
    private final GroupsTabContentPodcastsDto podcasts;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0(SignalingProtocol.KEY_ROOMS)
    private final GroupsTabContentRoomsDto rooms;

    @pmi0("services")
    private final GroupsTabContentServicesDto services;

    @pmi0("short_videos")
    private final GroupsTabContentShortVideosDto shortVideos;

    @pmi0("tabs")
    private final List<GroupsContentTabsDto> tabs;

    @pmi0("textlives")
    private final GroupsTabContentTextlivesDto textlives;

    @pmi0("videos")
    private final GroupsTabContentVideosDto videos;

    /* compiled from: GroupsGetContentForTabsResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetContentForTabsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetContentForTabsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i = 0;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(GroupsContentTabsDto.CREATOR, parcel, arrayList4, i2, 1);
                }
                arrayList = arrayList4;
            }
            GroupsTabContentPhotosDto createFromParcel = parcel.readInt() == 0 ? null : GroupsTabContentPhotosDto.CREATOR.createFromParcel(parcel);
            GroupsTabContentVideosDto createFromParcel2 = parcel.readInt() == 0 ? null : GroupsTabContentVideosDto.CREATOR.createFromParcel(parcel);
            GroupsTabContentAudiosDto createFromParcel3 = parcel.readInt() == 0 ? null : GroupsTabContentAudiosDto.CREATOR.createFromParcel(parcel);
            GroupsTabContentChatsDto createFromParcel4 = parcel.readInt() == 0 ? null : GroupsTabContentChatsDto.CREATOR.createFromParcel(parcel);
            GroupsTabContentDiscussionsDto createFromParcel5 = parcel.readInt() == 0 ? null : GroupsTabContentDiscussionsDto.CREATOR.createFromParcel(parcel);
            GroupsTabContentFilesDto createFromParcel6 = parcel.readInt() == 0 ? null : GroupsTabContentFilesDto.CREATOR.createFromParcel(parcel);
            GroupsTabContentAddressesDto createFromParcel7 = parcel.readInt() == 0 ? null : GroupsTabContentAddressesDto.CREATOR.createFromParcel(parcel);
            GroupsTabContentEventsDto createFromParcel8 = parcel.readInt() == 0 ? null : GroupsTabContentEventsDto.CREATOR.createFromParcel(parcel);
            GroupsTabContentShortVideosDto createFromParcel9 = parcel.readInt() == 0 ? null : GroupsTabContentShortVideosDto.CREATOR.createFromParcel(parcel);
            GroupsTabContentArticlesDto createFromParcel10 = parcel.readInt() == 0 ? null : GroupsTabContentArticlesDto.CREATOR.createFromParcel(parcel);
            GroupsTabContentNarrativesDto createFromParcel11 = parcel.readInt() == 0 ? null : GroupsTabContentNarrativesDto.CREATOR.createFromParcel(parcel);
            GroupsTabContentMarketDto createFromParcel12 = parcel.readInt() == 0 ? null : GroupsTabContentMarketDto.CREATOR.createFromParcel(parcel);
            GroupsTabContentServicesDto createFromParcel13 = parcel.readInt() == 0 ? null : GroupsTabContentServicesDto.CREATOR.createFromParcel(parcel);
            GroupsTabContentClassifiedsDto createFromParcel14 = parcel.readInt() == 0 ? null : GroupsTabContentClassifiedsDto.CREATOR.createFromParcel(parcel);
            GroupsTabContentTextlivesDto createFromParcel15 = parcel.readInt() == 0 ? null : GroupsTabContentTextlivesDto.CREATOR.createFromParcel(parcel);
            GroupsTabContentPodcastsDto createFromParcel16 = parcel.readInt() == 0 ? null : GroupsTabContentPodcastsDto.CREATOR.createFromParcel(parcel);
            GroupsTabContentRoomsDto createFromParcel17 = parcel.readInt() == 0 ? null : GroupsTabContentRoomsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(GroupsGetContentForTabsResponseDto.class, parcel, arrayList5, i3, 1);
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(GroupsGetContentForTabsResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new GroupsGetContentForTabsResponseDto(arrayList, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, createFromParcel10, createFromParcel11, createFromParcel12, createFromParcel13, createFromParcel14, createFromParcel15, createFromParcel16, createFromParcel17, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetContentForTabsResponseDto[] newArray(int i) {
            return new GroupsGetContentForTabsResponseDto[i];
        }
    }

    public GroupsGetContentForTabsResponseDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public final GroupsTabContentServicesDto B() {
        return this.services;
    }

    public final GroupsTabContentShortVideosDto C() {
        return this.shortVideos;
    }

    public final GroupsTabContentVideosDto D() {
        return this.videos;
    }

    public final GroupsTabContentArticlesDto d() {
        return this.articles;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsTabContentAudiosDto e() {
        return this.audios;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetContentForTabsResponseDto)) {
            return false;
        }
        GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) obj;
        return epx.f(this.tabs, groupsGetContentForTabsResponseDto.tabs) && epx.f(this.photos, groupsGetContentForTabsResponseDto.photos) && epx.f(this.videos, groupsGetContentForTabsResponseDto.videos) && epx.f(this.audios, groupsGetContentForTabsResponseDto.audios) && epx.f(this.chats, groupsGetContentForTabsResponseDto.chats) && epx.f(this.discussions, groupsGetContentForTabsResponseDto.discussions) && epx.f(this.files, groupsGetContentForTabsResponseDto.files) && epx.f(this.addresses, groupsGetContentForTabsResponseDto.addresses) && epx.f(this.events, groupsGetContentForTabsResponseDto.events) && epx.f(this.shortVideos, groupsGetContentForTabsResponseDto.shortVideos) && epx.f(this.articles, groupsGetContentForTabsResponseDto.articles) && epx.f(this.narratives, groupsGetContentForTabsResponseDto.narratives) && epx.f(this.market, groupsGetContentForTabsResponseDto.market) && epx.f(this.services, groupsGetContentForTabsResponseDto.services) && epx.f(this.classifieds, groupsGetContentForTabsResponseDto.classifieds) && epx.f(this.textlives, groupsGetContentForTabsResponseDto.textlives) && epx.f(this.podcasts, groupsGetContentForTabsResponseDto.podcasts) && epx.f(this.rooms, groupsGetContentForTabsResponseDto.rooms) && epx.f(this.profiles, groupsGetContentForTabsResponseDto.profiles) && epx.f(this.groups, groupsGetContentForTabsResponseDto.groups);
    }

    public final GroupsTabContentChatsDto f() {
        return this.chats;
    }

    public final GroupsTabContentDiscussionsDto g() {
        return this.discussions;
    }

    public final int hashCode() {
        List<GroupsContentTabsDto> list = this.tabs;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        GroupsTabContentPhotosDto groupsTabContentPhotosDto = this.photos;
        int hashCode2 = (hashCode + (groupsTabContentPhotosDto == null ? 0 : groupsTabContentPhotosDto.hashCode())) * 31;
        GroupsTabContentVideosDto groupsTabContentVideosDto = this.videos;
        int hashCode3 = (hashCode2 + (groupsTabContentVideosDto == null ? 0 : groupsTabContentVideosDto.hashCode())) * 31;
        GroupsTabContentAudiosDto groupsTabContentAudiosDto = this.audios;
        int hashCode4 = (hashCode3 + (groupsTabContentAudiosDto == null ? 0 : groupsTabContentAudiosDto.hashCode())) * 31;
        GroupsTabContentChatsDto groupsTabContentChatsDto = this.chats;
        int hashCode5 = (hashCode4 + (groupsTabContentChatsDto == null ? 0 : groupsTabContentChatsDto.hashCode())) * 31;
        GroupsTabContentDiscussionsDto groupsTabContentDiscussionsDto = this.discussions;
        int hashCode6 = (hashCode5 + (groupsTabContentDiscussionsDto == null ? 0 : groupsTabContentDiscussionsDto.hashCode())) * 31;
        GroupsTabContentFilesDto groupsTabContentFilesDto = this.files;
        int hashCode7 = (hashCode6 + (groupsTabContentFilesDto == null ? 0 : groupsTabContentFilesDto.hashCode())) * 31;
        GroupsTabContentAddressesDto groupsTabContentAddressesDto = this.addresses;
        int hashCode8 = (hashCode7 + (groupsTabContentAddressesDto == null ? 0 : groupsTabContentAddressesDto.hashCode())) * 31;
        GroupsTabContentEventsDto groupsTabContentEventsDto = this.events;
        int hashCode9 = (hashCode8 + (groupsTabContentEventsDto == null ? 0 : groupsTabContentEventsDto.hashCode())) * 31;
        GroupsTabContentShortVideosDto groupsTabContentShortVideosDto = this.shortVideos;
        int hashCode10 = (hashCode9 + (groupsTabContentShortVideosDto == null ? 0 : groupsTabContentShortVideosDto.hashCode())) * 31;
        GroupsTabContentArticlesDto groupsTabContentArticlesDto = this.articles;
        int hashCode11 = (hashCode10 + (groupsTabContentArticlesDto == null ? 0 : groupsTabContentArticlesDto.hashCode())) * 31;
        GroupsTabContentNarrativesDto groupsTabContentNarrativesDto = this.narratives;
        int hashCode12 = (hashCode11 + (groupsTabContentNarrativesDto == null ? 0 : groupsTabContentNarrativesDto.hashCode())) * 31;
        GroupsTabContentMarketDto groupsTabContentMarketDto = this.market;
        int hashCode13 = (hashCode12 + (groupsTabContentMarketDto == null ? 0 : groupsTabContentMarketDto.hashCode())) * 31;
        GroupsTabContentServicesDto groupsTabContentServicesDto = this.services;
        int hashCode14 = (hashCode13 + (groupsTabContentServicesDto == null ? 0 : groupsTabContentServicesDto.hashCode())) * 31;
        GroupsTabContentClassifiedsDto groupsTabContentClassifiedsDto = this.classifieds;
        int hashCode15 = (hashCode14 + (groupsTabContentClassifiedsDto == null ? 0 : groupsTabContentClassifiedsDto.hashCode())) * 31;
        GroupsTabContentTextlivesDto groupsTabContentTextlivesDto = this.textlives;
        int hashCode16 = (hashCode15 + (groupsTabContentTextlivesDto == null ? 0 : groupsTabContentTextlivesDto.hashCode())) * 31;
        GroupsTabContentPodcastsDto groupsTabContentPodcastsDto = this.podcasts;
        int hashCode17 = (hashCode16 + (groupsTabContentPodcastsDto == null ? 0 : groupsTabContentPodcastsDto.hashCode())) * 31;
        GroupsTabContentRoomsDto groupsTabContentRoomsDto = this.rooms;
        int hashCode18 = (hashCode17 + (groupsTabContentRoomsDto == null ? 0 : groupsTabContentRoomsDto.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode19 = (hashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        return hashCode19 + (list3 != null ? list3.hashCode() : 0);
    }

    public final GroupsTabContentEventsDto i() {
        return this.events;
    }

    public final GroupsTabContentFilesDto j() {
        return this.files;
    }

    public final List<GroupsGroupFullDto> k() {
        return this.groups;
    }

    public final GroupsTabContentMarketDto l() {
        return this.market;
    }

    public final GroupsTabContentNarrativesDto n() {
        return this.narratives;
    }

    public final GroupsTabContentPhotosDto o() {
        return this.photos;
    }

    public final GroupsTabContentPodcastsDto p() {
        return this.podcasts;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetContentForTabsResponseDto(tabs=");
        sb.append(this.tabs);
        sb.append(", photos=");
        sb.append(this.photos);
        sb.append(", videos=");
        sb.append(this.videos);
        sb.append(", audios=");
        sb.append(this.audios);
        sb.append(", chats=");
        sb.append(this.chats);
        sb.append(", discussions=");
        sb.append(this.discussions);
        sb.append(", files=");
        sb.append(this.files);
        sb.append(", addresses=");
        sb.append(this.addresses);
        sb.append(", events=");
        sb.append(this.events);
        sb.append(", shortVideos=");
        sb.append(this.shortVideos);
        sb.append(", articles=");
        sb.append(this.articles);
        sb.append(", narratives=");
        sb.append(this.narratives);
        sb.append(", market=");
        sb.append(this.market);
        sb.append(", services=");
        sb.append(this.services);
        sb.append(", classifieds=");
        sb.append(this.classifieds);
        sb.append(", textlives=");
        sb.append(this.textlives);
        sb.append(", podcasts=");
        sb.append(this.podcasts);
        sb.append(", rooms=");
        sb.append(this.rooms);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    public final List<UsersUserFullDto> u() {
        return this.profiles;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<GroupsContentTabsDto> list = this.tabs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((GroupsContentTabsDto) f.next()).writeToParcel(parcel, i);
            }
        }
        GroupsTabContentPhotosDto groupsTabContentPhotosDto = this.photos;
        if (groupsTabContentPhotosDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentPhotosDto.writeToParcel(parcel, i);
        }
        GroupsTabContentVideosDto groupsTabContentVideosDto = this.videos;
        if (groupsTabContentVideosDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentVideosDto.writeToParcel(parcel, i);
        }
        GroupsTabContentAudiosDto groupsTabContentAudiosDto = this.audios;
        if (groupsTabContentAudiosDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentAudiosDto.writeToParcel(parcel, i);
        }
        GroupsTabContentChatsDto groupsTabContentChatsDto = this.chats;
        if (groupsTabContentChatsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentChatsDto.writeToParcel(parcel, i);
        }
        GroupsTabContentDiscussionsDto groupsTabContentDiscussionsDto = this.discussions;
        if (groupsTabContentDiscussionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentDiscussionsDto.writeToParcel(parcel, i);
        }
        GroupsTabContentFilesDto groupsTabContentFilesDto = this.files;
        if (groupsTabContentFilesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentFilesDto.writeToParcel(parcel, i);
        }
        GroupsTabContentAddressesDto groupsTabContentAddressesDto = this.addresses;
        if (groupsTabContentAddressesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentAddressesDto.writeToParcel(parcel, i);
        }
        GroupsTabContentEventsDto groupsTabContentEventsDto = this.events;
        if (groupsTabContentEventsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentEventsDto.writeToParcel(parcel, i);
        }
        GroupsTabContentShortVideosDto groupsTabContentShortVideosDto = this.shortVideos;
        if (groupsTabContentShortVideosDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentShortVideosDto.writeToParcel(parcel, i);
        }
        GroupsTabContentArticlesDto groupsTabContentArticlesDto = this.articles;
        if (groupsTabContentArticlesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentArticlesDto.writeToParcel(parcel, i);
        }
        GroupsTabContentNarrativesDto groupsTabContentNarrativesDto = this.narratives;
        if (groupsTabContentNarrativesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentNarrativesDto.writeToParcel(parcel, i);
        }
        GroupsTabContentMarketDto groupsTabContentMarketDto = this.market;
        if (groupsTabContentMarketDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentMarketDto.writeToParcel(parcel, i);
        }
        GroupsTabContentServicesDto groupsTabContentServicesDto = this.services;
        if (groupsTabContentServicesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentServicesDto.writeToParcel(parcel, i);
        }
        GroupsTabContentClassifiedsDto groupsTabContentClassifiedsDto = this.classifieds;
        if (groupsTabContentClassifiedsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentClassifiedsDto.writeToParcel(parcel, i);
        }
        GroupsTabContentTextlivesDto groupsTabContentTextlivesDto = this.textlives;
        if (groupsTabContentTextlivesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentTextlivesDto.writeToParcel(parcel, i);
        }
        GroupsTabContentPodcastsDto groupsTabContentPodcastsDto = this.podcasts;
        if (groupsTabContentPodcastsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentPodcastsDto.writeToParcel(parcel, i);
        }
        GroupsTabContentRoomsDto groupsTabContentRoomsDto = this.rooms;
        if (groupsTabContentRoomsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabContentRoomsDto.writeToParcel(parcel, i);
        }
        List<UsersUserFullDto> list2 = this.profiles;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<GroupsGroupFullDto> list3 = this.groups;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            parcel.writeParcelable((Parcelable) f3.next(), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsGetContentForTabsResponseDto(List<? extends GroupsContentTabsDto> list, GroupsTabContentPhotosDto groupsTabContentPhotosDto, GroupsTabContentVideosDto groupsTabContentVideosDto, GroupsTabContentAudiosDto groupsTabContentAudiosDto, GroupsTabContentChatsDto groupsTabContentChatsDto, GroupsTabContentDiscussionsDto groupsTabContentDiscussionsDto, GroupsTabContentFilesDto groupsTabContentFilesDto, GroupsTabContentAddressesDto groupsTabContentAddressesDto, GroupsTabContentEventsDto groupsTabContentEventsDto, GroupsTabContentShortVideosDto groupsTabContentShortVideosDto, GroupsTabContentArticlesDto groupsTabContentArticlesDto, GroupsTabContentNarrativesDto groupsTabContentNarrativesDto, GroupsTabContentMarketDto groupsTabContentMarketDto, GroupsTabContentServicesDto groupsTabContentServicesDto, GroupsTabContentClassifiedsDto groupsTabContentClassifiedsDto, GroupsTabContentTextlivesDto groupsTabContentTextlivesDto, GroupsTabContentPodcastsDto groupsTabContentPodcastsDto, GroupsTabContentRoomsDto groupsTabContentRoomsDto, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.tabs = list;
        this.photos = groupsTabContentPhotosDto;
        this.videos = groupsTabContentVideosDto;
        this.audios = groupsTabContentAudiosDto;
        this.chats = groupsTabContentChatsDto;
        this.discussions = groupsTabContentDiscussionsDto;
        this.files = groupsTabContentFilesDto;
        this.addresses = groupsTabContentAddressesDto;
        this.events = groupsTabContentEventsDto;
        this.shortVideos = groupsTabContentShortVideosDto;
        this.articles = groupsTabContentArticlesDto;
        this.narratives = groupsTabContentNarrativesDto;
        this.market = groupsTabContentMarketDto;
        this.services = groupsTabContentServicesDto;
        this.classifieds = groupsTabContentClassifiedsDto;
        this.textlives = groupsTabContentTextlivesDto;
        this.podcasts = groupsTabContentPodcastsDto;
        this.rooms = groupsTabContentRoomsDto;
        this.profiles = list2;
        this.groups = list3;
    }

    public /* synthetic */ GroupsGetContentForTabsResponseDto(List list, GroupsTabContentPhotosDto groupsTabContentPhotosDto, GroupsTabContentVideosDto groupsTabContentVideosDto, GroupsTabContentAudiosDto groupsTabContentAudiosDto, GroupsTabContentChatsDto groupsTabContentChatsDto, GroupsTabContentDiscussionsDto groupsTabContentDiscussionsDto, GroupsTabContentFilesDto groupsTabContentFilesDto, GroupsTabContentAddressesDto groupsTabContentAddressesDto, GroupsTabContentEventsDto groupsTabContentEventsDto, GroupsTabContentShortVideosDto groupsTabContentShortVideosDto, GroupsTabContentArticlesDto groupsTabContentArticlesDto, GroupsTabContentNarrativesDto groupsTabContentNarrativesDto, GroupsTabContentMarketDto groupsTabContentMarketDto, GroupsTabContentServicesDto groupsTabContentServicesDto, GroupsTabContentClassifiedsDto groupsTabContentClassifiedsDto, GroupsTabContentTextlivesDto groupsTabContentTextlivesDto, GroupsTabContentPodcastsDto groupsTabContentPodcastsDto, GroupsTabContentRoomsDto groupsTabContentRoomsDto, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : groupsTabContentPhotosDto, (i & 4) != 0 ? null : groupsTabContentVideosDto, (i & 8) != 0 ? null : groupsTabContentAudiosDto, (i & 16) != 0 ? null : groupsTabContentChatsDto, (i & 32) != 0 ? null : groupsTabContentDiscussionsDto, (i & 64) != 0 ? null : groupsTabContentFilesDto, (i & 128) != 0 ? null : groupsTabContentAddressesDto, (i & 256) != 0 ? null : groupsTabContentEventsDto, (i & 512) != 0 ? null : groupsTabContentShortVideosDto, (i & 1024) != 0 ? null : groupsTabContentArticlesDto, (i & 2048) != 0 ? null : groupsTabContentNarrativesDto, (i & 4096) != 0 ? null : groupsTabContentMarketDto, (i & 8192) != 0 ? null : groupsTabContentServicesDto, (i & 16384) != 0 ? null : groupsTabContentClassifiedsDto, (i & 32768) != 0 ? null : groupsTabContentTextlivesDto, (i & 65536) != 0 ? null : groupsTabContentPodcastsDto, (i & 131072) != 0 ? null : groupsTabContentRoomsDto, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list2, (i & 524288) != 0 ? null : list3);
    }
}
