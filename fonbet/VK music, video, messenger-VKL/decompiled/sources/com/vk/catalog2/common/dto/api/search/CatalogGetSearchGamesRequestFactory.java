package com.vk.catalog2.common.dto.api.search;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.catalog.dto.CatalogGetSearchGamesScreenRefDto;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import io.reactivex.rxjava3.android.schedulers.a;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import xsna.afa;
import xsna.ahn;
import xsna.asp;
import xsna.dz2;
import xsna.e3a;
import xsna.epx;
import xsna.fq;
import xsna.gq;
import xsna.k7;
import xsna.l7;
import xsna.qi3;
import xsna.rsg0;
import xsna.tfx;
import xsna.ud8;
import xsna.wba;
import xsna.wga;
import xsna.xga;
import xsna.yfb;
import xsna.zrp;

/* compiled from: CatalogGetSearchGamesRequestFactory.kt */
/* loaded from: classes16.dex */
public final class CatalogGetSearchGamesRequestFactory extends SearchRequestFactory {
    public final xga p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogGetSearchGamesRequestFactory.kt */
    public static final class SearchGamesEntrypoint implements SearchRequestFactory.a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SearchGamesEntrypoint[] $VALUES;
        public static final SearchGamesEntrypoint GlobalSearchTab;
        public static final SearchGamesEntrypoint SearchInService;
        private final String apiName;

        static {
            SearchGamesEntrypoint searchGamesEntrypoint = new SearchGamesEntrypoint("GlobalSearchTab", 0, CatalogGetSearchGamesScreenRefDto.SEARCH_GAMES.i());
            GlobalSearchTab = searchGamesEntrypoint;
            SearchGamesEntrypoint searchGamesEntrypoint2 = new SearchGamesEntrypoint("SearchInService", 1, CatalogGetSearchGamesScreenRefDto.SEARCH_GAMES_SERVICE.i());
            SearchInService = searchGamesEntrypoint2;
            SearchGamesEntrypoint[] searchGamesEntrypointArr = {searchGamesEntrypoint, searchGamesEntrypoint2};
            $VALUES = searchGamesEntrypointArr;
            $ENTRIES = new asp(searchGamesEntrypointArr);
        }

        public SearchGamesEntrypoint(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static SearchGamesEntrypoint valueOf(String str) {
            return (SearchGamesEntrypoint) Enum.valueOf(SearchGamesEntrypoint.class, str);
        }

        public static SearchGamesEntrypoint[] values() {
            return (SearchGamesEntrypoint[]) $VALUES.clone();
        }

        @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory.a
        public final String h() {
            return this.apiName;
        }
    }

    public CatalogGetSearchGamesRequestFactory(wba wbaVar, SearchGamesEntrypoint searchGamesEntrypoint) {
        super(wbaVar, searchGamesEntrypoint, 4);
        this.p = new xga();
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final m1 g(String str, String str2) {
        afa afaVar = new afa();
        if (str == null) {
            str = "";
        }
        dz2 x = yfb.x(wga.d(this.p, str, null, str2, null, null, null, 32762));
        ahn.D(x);
        return rsg0.T(x).U(new k7(new qi3(1, afaVar, afa.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogSectionResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0, 2), 5)).a0(a.b());
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final q i(String str, boolean z) {
        e3a e3aVar = new e3a();
        SearchRequestFactory.InputMethod inputMethod = this.k;
        CatalogGetSearchGamesScreenRefDto catalogGetSearchGamesScreenRefDto = null;
        String h = inputMethod != null ? inputMethod.h() : null;
        SearchRequestFactory.a aVar = this.d;
        String h2 = aVar != null ? aVar.h() : null;
        CatalogGetSearchGamesScreenRefDto[] values = CatalogGetSearchGamesScreenRefDto.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            CatalogGetSearchGamesScreenRefDto catalogGetSearchGamesScreenRefDto2 = values[i];
            if (epx.f(catalogGetSearchGamesScreenRefDto2.i(), h2)) {
                catalogGetSearchGamesScreenRefDto = catalogGetSearchGamesScreenRefDto2;
                break;
            }
            i++;
        }
        this.p.getClass();
        tfx tfxVar = new tfx("catalog.getSearchGames", new fq(6), new gq(6));
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
        }
        if (h != null) {
            tfx.o(tfxVar, "input_method", h, 0, 0, 12);
            tfxVar = tfxVar;
        }
        if (catalogGetSearchGamesScreenRefDto != null) {
            tfx.o(tfxVar, "screen_ref", catalogGetSearchGamesScreenRefDto.i(), 0, 0, 12);
        }
        return rsg0.T(yfb.x(tfxVar)).U(new l7(new ud8(1, e3aVar, e3a.class, "mapToDefaultSection", "mapToDefaultSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0, 1), 7)).a0(a.b());
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final wga k() {
        return this.p;
    }
}
