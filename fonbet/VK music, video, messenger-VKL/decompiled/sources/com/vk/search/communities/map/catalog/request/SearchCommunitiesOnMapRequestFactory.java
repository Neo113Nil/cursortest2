package com.vk.search.communities.map.catalog.request;

import android.os.Bundle;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.catalog.dto.CatalogGetSearchGroupsMapScreenRefDto;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.movika.sdk.base.hooks.f;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.n0;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ahn;
import xsna.asp;
import xsna.dr;
import xsna.dz2;
import xsna.e3a;
import xsna.epx;
import xsna.hda;
import xsna.izs;
import xsna.rsg0;
import xsna.tfx;
import xsna.u96;
import xsna.yfb;
import xsna.zrp;

/* compiled from: SearchCommunitiesOnMapRequestFactory.kt */
/* loaded from: classes5.dex */
public final class SearchCommunitiesOnMapRequestFactory extends u96 {
    public final SearchRequestFactory.a c;
    public final String d;
    public String e;
    public Float f;
    public Float g;
    public Integer h;
    public final e3a i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchCommunitiesOnMapRequestFactory.kt */
    public static final class SearchCommunitiesOnMapEntrypoint implements SearchRequestFactory.a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SearchCommunitiesOnMapEntrypoint[] $VALUES;
        public static final SearchCommunitiesOnMapEntrypoint GlobalSearchTab;
        public static final SearchCommunitiesOnMapEntrypoint SearchInService;
        private final String apiName;

        static {
            SearchCommunitiesOnMapEntrypoint searchCommunitiesOnMapEntrypoint = new SearchCommunitiesOnMapEntrypoint("GlobalSearchTab", 0, CatalogGetSearchGroupsMapScreenRefDto.SEARCH_GROUPS_MAP.j());
            GlobalSearchTab = searchCommunitiesOnMapEntrypoint;
            SearchCommunitiesOnMapEntrypoint searchCommunitiesOnMapEntrypoint2 = new SearchCommunitiesOnMapEntrypoint("SearchInService", 1, CatalogGetSearchGroupsMapScreenRefDto.GROUPS_LIST_SEARCH_MAP.j());
            SearchInService = searchCommunitiesOnMapEntrypoint2;
            SearchCommunitiesOnMapEntrypoint[] searchCommunitiesOnMapEntrypointArr = {searchCommunitiesOnMapEntrypoint, searchCommunitiesOnMapEntrypoint2};
            $VALUES = searchCommunitiesOnMapEntrypointArr;
            $ENTRIES = new asp(searchCommunitiesOnMapEntrypointArr);
        }

        public SearchCommunitiesOnMapEntrypoint(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static SearchCommunitiesOnMapEntrypoint valueOf(String str) {
            return (SearchCommunitiesOnMapEntrypoint) Enum.valueOf(SearchCommunitiesOnMapEntrypoint.class, str);
        }

        public static SearchCommunitiesOnMapEntrypoint[] values() {
            return (SearchCommunitiesOnMapEntrypoint[]) $VALUES.clone();
        }

        @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory.a
        public final String h() {
            return this.apiName;
        }
    }

    /* compiled from: SearchCommunitiesOnMapRequestFactory.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<CatalogCatalogResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
            ((e3a) this.receiver).getClass();
            return e3a.c(catalogCatalogResponseObjectDto);
        }
    }

    public SearchCommunitiesOnMapRequestFactory(SearchCommunitiesOnMapEntrypoint searchCommunitiesOnMapEntrypoint, String str) {
        super(null);
        this.c = searchCommunitiesOnMapEntrypoint;
        this.d = str;
        this.i = new e3a();
    }

    @Override // xsna.gda
    public final q d(String str, String str2, String str3, boolean z, Integer num) {
        Object obj;
        String str4 = this.e;
        Float f = this.f;
        Float f2 = this.g;
        Integer num2 = this.h;
        Iterator<E> it = CatalogGetSearchGroupsMapScreenRefDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String j = ((CatalogGetSearchGroupsMapScreenRefDto) next).j();
            SearchRequestFactory.a aVar = this.c;
            if (epx.f(j, aVar != null ? aVar.h() : null)) {
                obj = next;
                break;
            }
        }
        CatalogGetSearchGroupsMapScreenRefDto catalogGetSearchGroupsMapScreenRefDto = (CatalogGetSearchGroupsMapScreenRefDto) obj;
        tfx tfxVar = new tfx("catalog.getSearchGroupsMap", new n0(9), new dr(8));
        if (f != null) {
            tfxVar.h("latitude", f.floatValue(), -90.0d, 90.0d);
        }
        if (f2 != null) {
            tfxVar.h("longitude", f2.floatValue(), -180.0d, 180.0d);
        }
        if (str4 != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str4, 0, 255, 4);
            tfxVar = tfxVar;
        }
        if (num2 != null) {
            tfxVar.f(num2.intValue(), 0, 1000000, "radius");
        }
        if (catalogGetSearchGroupsMapScreenRefDto != null) {
            tfx.o(tfxVar, "screen_ref", catalogGetSearchGroupsMapScreenRefDto.j(), 0, 0, 12);
        }
        tfx.o(tfxVar, "from_trackcode", this.d, 0, 0, 12);
        dz2 x = yfb.x(tfxVar);
        ahn.D(x);
        return rsg0.T(x).U(new f(new a(1, this.i, e3a.class, "mapToDefaultSection", "mapToDefaultSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 28));
    }

    @Override // xsna.u96, xsna.gda
    public final void c(Bundle bundle) {
    }
}
