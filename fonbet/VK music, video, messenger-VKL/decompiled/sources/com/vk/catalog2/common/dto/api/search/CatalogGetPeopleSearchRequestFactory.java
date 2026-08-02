package com.vk.catalog2.common.dto.api.search;

import com.vk.api.generated.catalog.dto.CatalogGetPeopleSearchSexDto;
import com.vk.api.generated.catalog.dto.CatalogGetPeopleSearchStatusDto;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.dto.common.id.UserId;
import com.vk.search.models.VkRelation;
import com.vk.search.params.api.SearchParams;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.search.params.api.domain.model.education.EducationParam;
import com.vk.search.params.api.domain.model.education.EducationalInstitution;
import com.vk.search.params.api.domain.model.education.School;
import com.vk.search.params.api.domain.model.education.University;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ahn;
import xsna.asp;
import xsna.e3a;
import xsna.e7;
import xsna.hda;
import xsna.i6a;
import xsna.izs;
import xsna.j6a;
import xsna.k6a;
import xsna.pf;
import xsna.q5a;
import xsna.r6a;
import xsna.rsg0;
import xsna.wba;
import xsna.wga;
import xsna.xga;
import xsna.yfb;
import xsna.zrp;

/* compiled from: CatalogGetPeopleSearchRequestFactory.kt */
/* loaded from: classes16.dex */
public final class CatalogGetPeopleSearchRequestFactory extends SearchRequestFactory {
    public final UserId p;
    public final UserId q;
    public final izs<hda, hda> r;
    public final xga s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogGetPeopleSearchRequestFactory.kt */
    public static final class SearchPeopleEntrypoint implements SearchRequestFactory.a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SearchPeopleEntrypoint[] $VALUES;
        public static final SearchPeopleEntrypoint GlobalSearchTab;
        public static final SearchPeopleEntrypoint SearchFollowers;
        public static final SearchPeopleEntrypoint SearchFriendFriends;
        public static final SearchPeopleEntrypoint SearchInService;
        public static final SearchPeopleEntrypoint SearchPeopleCommunityMembers;
        private final String apiName;

        static {
            SearchPeopleEntrypoint searchPeopleEntrypoint = new SearchPeopleEntrypoint("GlobalSearchTab", 0, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_PEOPLE));
            GlobalSearchTab = searchPeopleEntrypoint;
            SearchPeopleEntrypoint searchPeopleEntrypoint2 = new SearchPeopleEntrypoint("SearchInService", 1, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_SERVICE_SEARCH));
            SearchInService = searchPeopleEntrypoint2;
            SearchPeopleEntrypoint searchPeopleEntrypoint3 = new SearchPeopleEntrypoint("SearchFriendFriends", 2, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FRIEND_FRIENDS_SEARCH));
            SearchFriendFriends = searchPeopleEntrypoint3;
            SearchPeopleEntrypoint searchPeopleEntrypoint4 = new SearchPeopleEntrypoint("SearchFollowers", 3, "followers_search");
            SearchFollowers = searchPeopleEntrypoint4;
            SearchPeopleEntrypoint searchPeopleEntrypoint5 = new SearchPeopleEntrypoint("SearchPeopleCommunityMembers", 4, "search_people_community_members");
            SearchPeopleCommunityMembers = searchPeopleEntrypoint5;
            SearchPeopleEntrypoint[] searchPeopleEntrypointArr = {searchPeopleEntrypoint, searchPeopleEntrypoint2, searchPeopleEntrypoint3, searchPeopleEntrypoint4, searchPeopleEntrypoint5};
            $VALUES = searchPeopleEntrypointArr;
            $ENTRIES = new asp(searchPeopleEntrypointArr);
        }

        public SearchPeopleEntrypoint(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static SearchPeopleEntrypoint valueOf(String str) {
            return (SearchPeopleEntrypoint) Enum.valueOf(SearchPeopleEntrypoint.class, str);
        }

        public static SearchPeopleEntrypoint[] values() {
            return (SearchPeopleEntrypoint[]) $VALUES.clone();
        }

        @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory.a
        public final String h() {
            return this.apiName;
        }
    }

    /* compiled from: CatalogGetPeopleSearchRequestFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkRelation.values().length];
            try {
                iArr[VkRelation.single.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkRelation.relationship.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkRelation.engaged.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkRelation.married.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkRelation.civilUnion.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VkRelation.complicated.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VkRelation.activelySearching.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VkRelation.inLove.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogGetPeopleSearchRequestFactory(wba wbaVar, SearchRequestFactory.a aVar, UserId userId, UserId userId2, q5a q5aVar, int i) {
        super(wbaVar, aVar, 4);
        userId = (i & 4) != 0 ? null : userId;
        userId2 = (i & 8) != 0 ? null : userId2;
        izs pfVar = (i & 16) != 0 ? new pf(6) : q5aVar;
        this.p = userId;
        this.q = userId2;
        this.r = pfVar;
        this.s = new xga();
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final m1 g(String str, String str2) {
        if (str == null) {
            str = "";
        }
        r6a r6aVar = new r6a(this.c, str, str2, false, null, null, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
        ahn.D(r6aVar);
        return rsg0.T(r6aVar).U(new i6a(this.r, 0)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0049  */
    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q h(String str, SearchParams searchParams, SearchRequestFactory.a aVar, boolean z) {
        CatalogGetPeopleSearchSexDto catalogGetPeopleSearchSexDto;
        CatalogGetPeopleSearchSexDto catalogGetPeopleSearchSexDto2;
        VkRelation vkRelation;
        CatalogGetPeopleSearchStatusDto catalogGetPeopleSearchStatusDto;
        CatalogGetPeopleSearchStatusDto catalogGetPeopleSearchStatusDto2;
        Integer num;
        Integer num2;
        EducationParam educationParam;
        EducationParam educationParam2;
        EducationParam educationParam3;
        EducationParam educationParam4;
        VkPeopleSearchParams vkPeopleSearchParams = (VkPeopleSearchParams) searchParams;
        e3a e3aVar = new e3a();
        Integer valueOf = vkPeopleSearchParams != null ? Integer.valueOf(vkPeopleSearchParams.d()) : null;
        Integer valueOf2 = vkPeopleSearchParams != null ? Integer.valueOf(vkPeopleSearchParams.c) : null;
        if (valueOf2 != null && valueOf2.intValue() == 1) {
            catalogGetPeopleSearchSexDto2 = CatalogGetPeopleSearchSexDto.FEMALE;
        } else {
            if (valueOf2 == null || valueOf2.intValue() != 2) {
                catalogGetPeopleSearchSexDto = null;
                Integer valueOf3 = vkPeopleSearchParams == null ? Integer.valueOf(vkPeopleSearchParams.d) : null;
                Integer valueOf4 = vkPeopleSearchParams == null ? Integer.valueOf(vkPeopleSearchParams.e) : null;
                vkRelation = vkPeopleSearchParams == null ? vkPeopleSearchParams.f : null;
                switch (vkRelation != null ? -1 : a.$EnumSwitchMapping$0[vkRelation.ordinal()]) {
                    case 1:
                        catalogGetPeopleSearchStatusDto = CatalogGetPeopleSearchStatusDto.NOT_MARRIED;
                        catalogGetPeopleSearchStatusDto2 = catalogGetPeopleSearchStatusDto;
                        break;
                    case 2:
                        catalogGetPeopleSearchStatusDto = CatalogGetPeopleSearchStatusDto.MEETS;
                        catalogGetPeopleSearchStatusDto2 = catalogGetPeopleSearchStatusDto;
                        break;
                    case 3:
                        catalogGetPeopleSearchStatusDto = CatalogGetPeopleSearchStatusDto.ENGAGED;
                        catalogGetPeopleSearchStatusDto2 = catalogGetPeopleSearchStatusDto;
                        break;
                    case 4:
                        catalogGetPeopleSearchStatusDto = CatalogGetPeopleSearchStatusDto.MARRIED;
                        catalogGetPeopleSearchStatusDto2 = catalogGetPeopleSearchStatusDto;
                        break;
                    case 5:
                        catalogGetPeopleSearchStatusDto = CatalogGetPeopleSearchStatusDto.CIVIL_MARRIAGE;
                        catalogGetPeopleSearchStatusDto2 = catalogGetPeopleSearchStatusDto;
                        break;
                    case 6:
                        catalogGetPeopleSearchStatusDto = CatalogGetPeopleSearchStatusDto.COMPLICATED;
                        catalogGetPeopleSearchStatusDto2 = catalogGetPeopleSearchStatusDto;
                        break;
                    case 7:
                        catalogGetPeopleSearchStatusDto = CatalogGetPeopleSearchStatusDto.ACTIVELY_LOOKING;
                        catalogGetPeopleSearchStatusDto2 = catalogGetPeopleSearchStatusDto;
                        break;
                    case 8:
                        catalogGetPeopleSearchStatusDto = CatalogGetPeopleSearchStatusDto.IN_LOVE;
                        catalogGetPeopleSearchStatusDto2 = catalogGetPeopleSearchStatusDto;
                        break;
                    default:
                        catalogGetPeopleSearchStatusDto2 = null;
                        break;
                }
                String h = aVar == null ? aVar.h() : null;
                EducationalInstitution educationalInstitution = (vkPeopleSearchParams != null || (educationParam4 = vkPeopleSearchParams.g) == null) ? null : educationParam4.b;
                School school = !(educationalInstitution instanceof School) ? (School) educationalInstitution : null;
                Integer valueOf5 = school == null ? Integer.valueOf(school.c) : null;
                if (vkPeopleSearchParams != null || (educationParam3 = vkPeopleSearchParams.g) == null) {
                    num = null;
                } else {
                    num = educationParam3.b instanceof School ? educationParam3.d : null;
                }
                EducationalInstitution educationalInstitution2 = (vkPeopleSearchParams != null || (educationParam2 = vkPeopleSearchParams.g) == null) ? null : educationParam2.b;
                University university = !(educationalInstitution2 instanceof University) ? (University) educationalInstitution2 : null;
                Integer valueOf6 = university == null ? Integer.valueOf(university.c) : null;
                if (vkPeopleSearchParams != null || (educationParam = vkPeopleSearchParams.g) == null) {
                    num2 = null;
                } else {
                    num2 = educationParam.b instanceof University ? educationParam.d : null;
                }
                return rsg0.T(yfb.x(wga.c(this.s, str, valueOf, catalogGetPeopleSearchSexDto, valueOf3, valueOf4, catalogGetPeopleSearchStatusDto2, valueOf5, num, valueOf6, num2, vkPeopleSearchParams != null ? vkPeopleSearchParams.h : null, this.p, this.q, h, Boolean.valueOf(this.j), 1207945242, 5))).U(new e7(new k6a(1, e3aVar, e3a.class, "mapToDefaultSection", "mapToDefaultSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 8)).U(new j6a(this.r, 0)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            }
            catalogGetPeopleSearchSexDto2 = CatalogGetPeopleSearchSexDto.MALE;
        }
        catalogGetPeopleSearchSexDto = catalogGetPeopleSearchSexDto2;
        if (vkPeopleSearchParams == null) {
        }
        if (vkPeopleSearchParams == null) {
        }
        if (vkPeopleSearchParams == null) {
        }
        switch (vkRelation != null ? -1 : a.$EnumSwitchMapping$0[vkRelation.ordinal()]) {
        }
        if (aVar == null) {
        }
        if (vkPeopleSearchParams != null) {
        }
        if (!(educationalInstitution instanceof School)) {
        }
        if (school == null) {
        }
        if (vkPeopleSearchParams != null) {
        }
        num = null;
        if (vkPeopleSearchParams != null) {
        }
        if (!(educationalInstitution2 instanceof University)) {
        }
        if (university == null) {
        }
        if (vkPeopleSearchParams != null) {
        }
        num2 = null;
        return rsg0.T(yfb.x(wga.c(this.s, str, valueOf, catalogGetPeopleSearchSexDto, valueOf3, valueOf4, catalogGetPeopleSearchStatusDto2, valueOf5, num, valueOf6, num2, vkPeopleSearchParams != null ? vkPeopleSearchParams.h : null, this.p, this.q, h, Boolean.valueOf(this.j), 1207945242, 5))).U(new e7(new k6a(1, e3aVar, e3a.class, "mapToDefaultSection", "mapToDefaultSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 8)).U(new j6a(this.r, 0)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final q i(String str, boolean z) {
        return h(str, null, this.d, z);
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final wga k() {
        return this.s;
    }
}
