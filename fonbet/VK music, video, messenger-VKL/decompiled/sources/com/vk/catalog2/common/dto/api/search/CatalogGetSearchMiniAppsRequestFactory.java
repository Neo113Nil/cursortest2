package com.vk.catalog2.common.dto.api.search;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.catalog.dto.CatalogGetSearchMiniAppsScreenRefDto;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import io.reactivex.rxjava3.android.schedulers.a;
import io.reactivex.rxjava3.core.q;
import xsna.asp;
import xsna.e3a;
import xsna.ee8;
import xsna.epx;
import xsna.qq;
import xsna.rq;
import xsna.rsg0;
import xsna.s7;
import xsna.tfx;
import xsna.wba;
import xsna.wga;
import xsna.xga;
import xsna.yfb;
import xsna.zrp;

/* compiled from: CatalogGetSearchMiniAppsRequestFactory.kt */
/* loaded from: classes16.dex */
public final class CatalogGetSearchMiniAppsRequestFactory extends SearchRequestFactory {
    public final xga p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogGetSearchMiniAppsRequestFactory.kt */
    public static final class SearchMiniAppsEntrypoint implements SearchRequestFactory.a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SearchMiniAppsEntrypoint[] $VALUES;
        public static final SearchMiniAppsEntrypoint GlobalSearchTab;
        public static final SearchMiniAppsEntrypoint SearchInService;
        private final String apiName;

        static {
            SearchMiniAppsEntrypoint searchMiniAppsEntrypoint = new SearchMiniAppsEntrypoint("GlobalSearchTab", 0, CatalogGetSearchMiniAppsScreenRefDto.SEARCH_MINI_APPS.i());
            GlobalSearchTab = searchMiniAppsEntrypoint;
            SearchMiniAppsEntrypoint searchMiniAppsEntrypoint2 = new SearchMiniAppsEntrypoint("SearchInService", 1, CatalogGetSearchMiniAppsScreenRefDto.SEARCH_MINI_APPS_SERVICE.i());
            SearchInService = searchMiniAppsEntrypoint2;
            SearchMiniAppsEntrypoint[] searchMiniAppsEntrypointArr = {searchMiniAppsEntrypoint, searchMiniAppsEntrypoint2};
            $VALUES = searchMiniAppsEntrypointArr;
            $ENTRIES = new asp(searchMiniAppsEntrypointArr);
        }

        public SearchMiniAppsEntrypoint(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static SearchMiniAppsEntrypoint valueOf(String str) {
            return (SearchMiniAppsEntrypoint) Enum.valueOf(SearchMiniAppsEntrypoint.class, str);
        }

        public static SearchMiniAppsEntrypoint[] values() {
            return (SearchMiniAppsEntrypoint[]) $VALUES.clone();
        }

        @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory.a
        public final String h() {
            return this.apiName;
        }
    }

    public CatalogGetSearchMiniAppsRequestFactory(wba wbaVar, SearchMiniAppsEntrypoint searchMiniAppsEntrypoint) {
        super(wbaVar, searchMiniAppsEntrypoint, 4);
        this.p = new xga();
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final q i(String str, boolean z) {
        e3a e3aVar = new e3a();
        SearchRequestFactory.InputMethod inputMethod = this.k;
        CatalogGetSearchMiniAppsScreenRefDto catalogGetSearchMiniAppsScreenRefDto = null;
        String h = inputMethod != null ? inputMethod.h() : null;
        SearchRequestFactory.a aVar = this.d;
        String h2 = aVar != null ? aVar.h() : null;
        CatalogGetSearchMiniAppsScreenRefDto[] values = CatalogGetSearchMiniAppsScreenRefDto.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            CatalogGetSearchMiniAppsScreenRefDto catalogGetSearchMiniAppsScreenRefDto2 = values[i];
            if (epx.f(catalogGetSearchMiniAppsScreenRefDto2.i(), h2)) {
                catalogGetSearchMiniAppsScreenRefDto = catalogGetSearchMiniAppsScreenRefDto2;
                break;
            }
            i++;
        }
        this.p.getClass();
        tfx tfxVar = new tfx("catalog.getSearchMiniApps", new qq(4), new rq(6));
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
        }
        if (h != null) {
            tfx.o(tfxVar, "input_method", h, 0, 0, 12);
            tfxVar = tfxVar;
        }
        if (catalogGetSearchMiniAppsScreenRefDto != null) {
            tfx.o(tfxVar, "screen_ref", catalogGetSearchMiniAppsScreenRefDto.i(), 0, 0, 12);
        }
        return rsg0.T(yfb.x(tfxVar)).U(new s7(new ee8(1, e3aVar, e3a.class, "mapToDefaultSection", "mapToDefaultSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0, 1), 4)).a0(a.b());
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final wga k() {
        return this.p;
    }
}
