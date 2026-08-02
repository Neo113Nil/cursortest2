package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.badges.dto.BadgesBadgeDto;
import com.vk.api.generated.discover.dto.DiscoverHashtagDto;
import com.vk.api.generated.discover.dto.DiscoverPostDetailsDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: NewsfeedGenericResponseDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGenericResponseDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedGenericResponseDto> CREATOR = new a();

    @pmi0("ads_compact")
    private final Boolean adsCompact;

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("cache_config")
    private final NewsfeedCacheConfigDto cacheConfig;

    @pmi0("direct_games_ids")
    private final List<Integer> directGamesIds;

    @pmi0("expiration_time")
    private final Integer expirationTime;

    @pmi0("feed_type")
    private final String feedType;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("hashtags")
    private final List<DiscoverHashtagDto> hashtags;

    @pmi0("item_2_template")
    private final Map<String, String> item2Template;

    @pmi0("items")
    private final List<NewsfeedNewsfeedItemDto> items;

    @pmi0("lazy_load")
    private final NewsfeedDiscoverLazyLoadDto lazyLoad;

    @pmi0("lives_items")
    private final List<NewsfeedNewsfeedItemDto> livesItems;

    @pmi0("mini_apps_ids")
    private final List<Integer> miniAppsIds;

    @pmi0("new_returned_news_items_count")
    private final Integer newReturnedNewsItemsCount;

    @pmi0("news_custom_title")
    private final String newsCustomTitle;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("page_size")
    private final Integer pageSize;

    @pmi0("post_2_details")
    private final Map<String, DiscoverPostDetailsDto> post2Details;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    @pmi0("ref")
    private final String ref;

    @pmi0("referer")
    private final String referer;

    @pmi0(SignalingTransport.URL_TYPE_RETRY)
    private final NewsfeedRetryConfigDto retry;

    @pmi0("trace_id")
    private final String traceId;

    /* compiled from: NewsfeedGenericResponseDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGenericResponseDto> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v3 */
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGenericResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Integer num;
            Map linkedHashMap;
            LinkedHashMap linkedHashMap2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            String str;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            Boolean bool;
            ArrayList arrayList8;
            int readInt = parcel.readInt();
            ArrayList arrayList9 = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(NewsfeedGenericResponseDto.class, parcel, arrayList9, i, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList10 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(NewsfeedGenericResponseDto.class, parcel, arrayList10, i2, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList11 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = bo.b(NewsfeedGenericResponseDto.class, parcel, arrayList11, i3, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                num = null;
                arrayList2 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList2 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList2, i5, 1);
                }
                num = null;
            }
            String readString = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                linkedHashMap = num;
            } else {
                int readInt6 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt6);
                for (int i6 = 0; i6 != readInt6; i6++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int readInt7 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(readInt7);
                for (int i7 = 0; i7 != readInt7; i7++) {
                    linkedHashMap2.put(parcel.readString(), DiscoverPostDetailsDto.CREATOR.createFromParcel(parcel));
                }
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt8 = parcel.readInt();
                arrayList3 = new ArrayList(readInt8);
                int i8 = 0;
                while (i8 != readInt8) {
                    i8 = bo.b(NewsfeedGenericResponseDto.class, parcel, arrayList3, i8, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt9 = parcel.readInt();
                arrayList4 = new ArrayList(readInt9);
                int i9 = 0;
                while (true) {
                    str = readString2;
                    if (i9 == readInt9) {
                        break;
                    }
                    i9 = en.a(DiscoverHashtagDto.CREATOR, parcel, arrayList4, i9, 1);
                    readString2 = str;
                }
            } else {
                arrayList4 = null;
                str = readString2;
            }
            NewsfeedDiscoverLazyLoadDto createFromParcel = parcel.readInt() == 0 ? null : NewsfeedDiscoverLazyLoadDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList6 = arrayList9;
                arrayList5 = null;
            } else {
                int readInt10 = parcel.readInt();
                arrayList5 = new ArrayList(readInt10);
                arrayList6 = arrayList9;
                int i10 = 0;
                while (i10 != readInt10) {
                    i10 = pm0.b(parcel, arrayList5, i10, 1);
                }
            }
            Boolean valueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() != 0) {
                int readInt11 = parcel.readInt();
                arrayList7 = new ArrayList(readInt11);
                bool = valueOf2;
                int i11 = 0;
                while (true) {
                    arrayList8 = arrayList5;
                    if (i11 == readInt11) {
                        break;
                    }
                    i11 = pm0.b(parcel, arrayList7, i11, 1);
                    arrayList5 = arrayList8;
                }
            } else {
                bool = valueOf2;
                arrayList7 = null;
                arrayList8 = arrayList5;
            }
            return new NewsfeedGenericResponseDto(arrayList6, arrayList10, arrayList11, arrayList, arrayList2, readString, valueOf, linkedHashMap, linkedHashMap2, str, arrayList3, arrayList4, createFromParcel, arrayList8, bool, arrayList7, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : NewsfeedCacheConfigDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : NewsfeedRetryConfigDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGenericResponseDto[] newArray(int i) {
            return new NewsfeedGenericResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedGenericResponseDto(List<? extends NewsfeedNewsfeedItemDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<LikesReactionSetDto> list4, List<BadgesBadgeDto> list5, String str, Integer num, Map<String, String> map, Map<String, DiscoverPostDetailsDto> map2, String str2, List<? extends NewsfeedNewsfeedItemDto> list6, List<DiscoverHashtagDto> list7, NewsfeedDiscoverLazyLoadDto newsfeedDiscoverLazyLoadDto, List<Integer> list8, Boolean bool, List<Integer> list9, Integer num2, String str3, String str4, NewsfeedCacheConfigDto newsfeedCacheConfigDto, String str5, Integer num3, String str6, NewsfeedRetryConfigDto newsfeedRetryConfigDto) {
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.reactionSets = list4;
        this.badges = list5;
        this.nextFrom = str;
        this.newReturnedNewsItemsCount = num;
        this.item2Template = map;
        this.post2Details = map2;
        this.ref = str2;
        this.livesItems = list6;
        this.hashtags = list7;
        this.lazyLoad = newsfeedDiscoverLazyLoadDto;
        this.miniAppsIds = list8;
        this.adsCompact = bool;
        this.directGamesIds = list9;
        this.expirationTime = num2;
        this.referer = str3;
        this.newsCustomTitle = str4;
        this.cacheConfig = newsfeedCacheConfigDto;
        this.feedType = str5;
        this.pageSize = num3;
        this.traceId = str6;
        this.retry = newsfeedRetryConfigDto;
    }

    public final String d() {
        return this.feedType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GroupsGroupFullDto> e() {
        return this.groups;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGenericResponseDto)) {
            return false;
        }
        NewsfeedGenericResponseDto newsfeedGenericResponseDto = (NewsfeedGenericResponseDto) obj;
        return epx.f(this.items, newsfeedGenericResponseDto.items) && epx.f(this.profiles, newsfeedGenericResponseDto.profiles) && epx.f(this.groups, newsfeedGenericResponseDto.groups) && epx.f(this.reactionSets, newsfeedGenericResponseDto.reactionSets) && epx.f(this.badges, newsfeedGenericResponseDto.badges) && epx.f(this.nextFrom, newsfeedGenericResponseDto.nextFrom) && epx.f(this.newReturnedNewsItemsCount, newsfeedGenericResponseDto.newReturnedNewsItemsCount) && epx.f(this.item2Template, newsfeedGenericResponseDto.item2Template) && epx.f(this.post2Details, newsfeedGenericResponseDto.post2Details) && epx.f(this.ref, newsfeedGenericResponseDto.ref) && epx.f(this.livesItems, newsfeedGenericResponseDto.livesItems) && epx.f(this.hashtags, newsfeedGenericResponseDto.hashtags) && epx.f(this.lazyLoad, newsfeedGenericResponseDto.lazyLoad) && epx.f(this.miniAppsIds, newsfeedGenericResponseDto.miniAppsIds) && epx.f(this.adsCompact, newsfeedGenericResponseDto.adsCompact) && epx.f(this.directGamesIds, newsfeedGenericResponseDto.directGamesIds) && epx.f(this.expirationTime, newsfeedGenericResponseDto.expirationTime) && epx.f(this.referer, newsfeedGenericResponseDto.referer) && epx.f(this.newsCustomTitle, newsfeedGenericResponseDto.newsCustomTitle) && epx.f(this.cacheConfig, newsfeedGenericResponseDto.cacheConfig) && epx.f(this.feedType, newsfeedGenericResponseDto.feedType) && epx.f(this.pageSize, newsfeedGenericResponseDto.pageSize) && epx.f(this.traceId, newsfeedGenericResponseDto.traceId) && epx.f(this.retry, newsfeedGenericResponseDto.retry);
    }

    public final List<NewsfeedNewsfeedItemDto> f() {
        return this.items;
    }

    public final String g() {
        return this.nextFrom;
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(this.items.hashCode() * 31, 31, this.profiles), 31, this.groups);
        List<LikesReactionSetDto> list = this.reactionSets;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BadgesBadgeDto> list2 = this.badges;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.nextFrom;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.newReturnedNewsItemsCount;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, String> map = this.item2Template;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, DiscoverPostDetailsDto> map2 = this.post2Details;
        int hashCode6 = (hashCode5 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str2 = this.ref;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<NewsfeedNewsfeedItemDto> list3 = this.livesItems;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<DiscoverHashtagDto> list4 = this.hashtags;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        NewsfeedDiscoverLazyLoadDto newsfeedDiscoverLazyLoadDto = this.lazyLoad;
        int hashCode10 = (hashCode9 + (newsfeedDiscoverLazyLoadDto == null ? 0 : newsfeedDiscoverLazyLoadDto.hashCode())) * 31;
        List<Integer> list5 = this.miniAppsIds;
        int hashCode11 = (hashCode10 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool = this.adsCompact;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Integer> list6 = this.directGamesIds;
        int hashCode13 = (hashCode12 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Integer num2 = this.expirationTime;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.referer;
        int hashCode15 = (hashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.newsCustomTitle;
        int hashCode16 = (hashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        NewsfeedCacheConfigDto newsfeedCacheConfigDto = this.cacheConfig;
        int hashCode17 = (hashCode16 + (newsfeedCacheConfigDto == null ? 0 : newsfeedCacheConfigDto.hashCode())) * 31;
        String str5 = this.feedType;
        int hashCode18 = (hashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.pageSize;
        int hashCode19 = (hashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.traceId;
        int hashCode20 = (hashCode19 + (str6 == null ? 0 : str6.hashCode())) * 31;
        NewsfeedRetryConfigDto newsfeedRetryConfigDto = this.retry;
        return hashCode20 + (newsfeedRetryConfigDto != null ? newsfeedRetryConfigDto.hashCode() : 0);
    }

    public final List<UsersUserFullDto> i() {
        return this.profiles;
    }

    public final String toString() {
        return "NewsfeedGenericResponseDto(items=" + this.items + ", profiles=" + this.profiles + ", groups=" + this.groups + ", reactionSets=" + this.reactionSets + ", badges=" + this.badges + ", nextFrom=" + this.nextFrom + ", newReturnedNewsItemsCount=" + this.newReturnedNewsItemsCount + ", item2Template=" + this.item2Template + ", post2Details=" + this.post2Details + ", ref=" + this.ref + ", livesItems=" + this.livesItems + ", hashtags=" + this.hashtags + ", lazyLoad=" + this.lazyLoad + ", miniAppsIds=" + this.miniAppsIds + ", adsCompact=" + this.adsCompact + ", directGamesIds=" + this.directGamesIds + ", expirationTime=" + this.expirationTime + ", referer=" + this.referer + ", newsCustomTitle=" + this.newsCustomTitle + ", cacheConfig=" + this.cacheConfig + ", feedType=" + this.feedType + ", pageSize=" + this.pageSize + ", traceId=" + this.traceId + ", retry=" + this.retry + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.profiles);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        Iterator a4 = ao.a(parcel, this.groups);
        while (a4.hasNext()) {
            parcel.writeParcelable((Parcelable) a4.next(), i);
        }
        List<LikesReactionSetDto> list = this.reactionSets;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((LikesReactionSetDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<BadgesBadgeDto> list2 = this.badges;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((BadgesBadgeDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.nextFrom);
        Integer num = this.newReturnedNewsItemsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Map<String, String> map = this.item2Template;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        Map<String, DiscoverPostDetailsDto> map2 = this.post2Details;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, DiscoverPostDetailsDto> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                entry2.getValue().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.ref);
        List<NewsfeedNewsfeedItemDto> list3 = this.livesItems;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<DiscoverHashtagDto> list4 = this.hashtags;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((DiscoverHashtagDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        NewsfeedDiscoverLazyLoadDto newsfeedDiscoverLazyLoadDto = this.lazyLoad;
        if (newsfeedDiscoverLazyLoadDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedDiscoverLazyLoadDto.writeToParcel(parcel, i);
        }
        List<Integer> list5 = this.miniAppsIds;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeInt(((Number) f5.next()).intValue());
            }
        }
        Boolean bool = this.adsCompact;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<Integer> list6 = this.directGamesIds;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                parcel.writeInt(((Number) f6.next()).intValue());
            }
        }
        Integer num2 = this.expirationTime;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.referer);
        parcel.writeString(this.newsCustomTitle);
        NewsfeedCacheConfigDto newsfeedCacheConfigDto = this.cacheConfig;
        if (newsfeedCacheConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedCacheConfigDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.feedType);
        Integer num3 = this.pageSize;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.traceId);
        NewsfeedRetryConfigDto newsfeedRetryConfigDto = this.retry;
        if (newsfeedRetryConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedRetryConfigDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ NewsfeedGenericResponseDto(List list, List list2, List list3, List list4, List list5, String str, Integer num, Map map, Map map2, String str2, List list6, List list7, NewsfeedDiscoverLazyLoadDto newsfeedDiscoverLazyLoadDto, List list8, Boolean bool, List list9, Integer num2, String str3, String str4, NewsfeedCacheConfigDto newsfeedCacheConfigDto, String str5, Integer num3, String str6, NewsfeedRetryConfigDto newsfeedRetryConfigDto, int i, zcl zclVar) {
        this(list, list2, list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : map, (i & 256) != 0 ? null : map2, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : list6, (i & 2048) != 0 ? null : list7, (i & 4096) != 0 ? null : newsfeedDiscoverLazyLoadDto, (i & 8192) != 0 ? null : list8, (i & 16384) != 0 ? null : bool, (32768 & i) != 0 ? null : list9, (65536 & i) != 0 ? null : num2, (131072 & i) != 0 ? null : str3, (262144 & i) != 0 ? null : str4, (524288 & i) != 0 ? null : newsfeedCacheConfigDto, (1048576 & i) != 0 ? null : str5, (2097152 & i) != 0 ? null : num3, (4194304 & i) != 0 ? null : str6, (i & 8388608) != 0 ? null : newsfeedRetryConfigDto);
    }
}
