package com.vk.catalog2.common.dto.api.communities;

import com.vk.api.generated.catalog.dto.CatalogGetSearchGroupsScreenRefDto;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.dto.common.id.UserId;
import com.vk.search.params.api.SearchParams;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.params.api.domain.model.geo.Coordinate;
import io.reactivex.rxjava3.core.q;
import java.util.Optional;
import xsna.asp;
import xsna.dyh0;
import xsna.p6a;
import xsna.rf1;
import xsna.wba;
import xsna.zrp;

/* compiled from: CatalogGetSearchGroupsRequestFactory.kt */
/* loaded from: classes16.dex */
public final class CatalogGetSearchGroupsRequestFactory extends SearchRequestFactory implements dyh0 {
    public final UserId p;
    public final String q;
    public final boolean r;
    public Coordinate s;
    public q<Optional<Coordinate>> t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogGetSearchGroupsRequestFactory.kt */
    public static final class SearchGroupsEntrypoint implements SearchRequestFactory.a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SearchGroupsEntrypoint[] $VALUES;
        public static final SearchGroupsEntrypoint GlobalSearchTab;
        public static final SearchGroupsEntrypoint SearchFriendGroups;
        public static final SearchGroupsEntrypoint SearchInService;
        private final String apiName;

        static {
            SearchGroupsEntrypoint searchGroupsEntrypoint = new SearchGroupsEntrypoint("GlobalSearchTab", 0, CatalogGetSearchGroupsScreenRefDto.SEARCH_GROUPS.j());
            GlobalSearchTab = searchGroupsEntrypoint;
            SearchGroupsEntrypoint searchGroupsEntrypoint2 = new SearchGroupsEntrypoint("SearchInService", 1, CatalogGetSearchGroupsScreenRefDto.GROUPS_LIST_SEARCH.j());
            SearchInService = searchGroupsEntrypoint2;
            SearchGroupsEntrypoint searchGroupsEntrypoint3 = new SearchGroupsEntrypoint("SearchFriendGroups", 2, CatalogGetSearchGroupsScreenRefDto.FRIEND_GROUPS_LIST_SEARCH.j());
            SearchFriendGroups = searchGroupsEntrypoint3;
            SearchGroupsEntrypoint[] searchGroupsEntrypointArr = {searchGroupsEntrypoint, searchGroupsEntrypoint2, searchGroupsEntrypoint3};
            $VALUES = searchGroupsEntrypointArr;
            $ENTRIES = new asp(searchGroupsEntrypointArr);
        }

        public SearchGroupsEntrypoint(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static SearchGroupsEntrypoint valueOf(String str) {
            return (SearchGroupsEntrypoint) Enum.valueOf(SearchGroupsEntrypoint.class, str);
        }

        public static SearchGroupsEntrypoint[] values() {
            return (SearchGroupsEntrypoint[]) $VALUES.clone();
        }

        @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory.a
        public final String h() {
            return this.apiName;
        }
    }

    /* compiled from: CatalogGetSearchGroupsRequestFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VkGroupsSearchParams.CommunityType.values().length];
            try {
                iArr[VkGroupsSearchParams.CommunityType.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkGroupsSearchParams.CommunityType.EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkGroupsSearchParams.CommunityType.PAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkGroupsSearchParams.SortType.values().length];
            try {
                iArr2[VkGroupsSearchParams.SortType.RELEVANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VkGroupsSearchParams.SortType.MEMBERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VkGroupsSearchParams.SortType.POPULARITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogGetSearchGroupsRequestFactory(wba wbaVar, SearchGroupsEntrypoint searchGroupsEntrypoint, UserId userId, String str, boolean z, int i) {
        super(wbaVar, searchGroupsEntrypoint, 4);
        userId = (i & 4) != 0 ? null : userId;
        str = (i & 8) != 0 ? null : str;
        z = (i & 16) != 0 ? false : z;
        this.p = userId;
        this.q = str;
        this.r = z;
        this.t = q.T(Optional.empty());
    }

    public static Integer p(Boolean bool) {
        return (bool == null || !bool.booleanValue()) ? null : 1;
    }

    @Override // xsna.dyh0
    public final void a(Coordinate coordinate) {
        this.s = coordinate;
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final q h(String str, SearchParams searchParams, SearchRequestFactory.a aVar, boolean z) {
        return this.t.L(new rf1(new p6a(this, str, searchParams instanceof VkGroupsSearchParams ? (VkGroupsSearchParams) searchParams : null, aVar, 0), 8), false);
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final q i(String str, boolean z) {
        return h(str, null, this.d, z);
    }
}
