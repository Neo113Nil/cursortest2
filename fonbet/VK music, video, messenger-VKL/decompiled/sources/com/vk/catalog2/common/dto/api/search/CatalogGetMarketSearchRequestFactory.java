package com.vk.catalog2.common.dto.api.search;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.catalog.dto.CatalogGetSearchMarketCatalogContextDto;
import com.vk.api.generated.catalog.dto.CatalogGetSearchMarketDeliveryTypeDto;
import com.vk.api.generated.catalog.dto.CatalogGetSearchMarketScreenRefDto;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.search.params.api.SearchParams;
import com.vk.search.params.api.VkMarketSearchParams;
import com.vk.search.params.api.domain.model.MarketSearchDeliveryType;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import xsna.asp;
import xsna.e10;
import xsna.e3a;
import xsna.epx;
import xsna.fxh0;
import xsna.g6a;
import xsna.rsg0;
import xsna.tfx;
import xsna.yfb;
import xsna.zq;
import xsna.zrp;

/* compiled from: CatalogGetMarketSearchRequestFactory.kt */
/* loaded from: classes16.dex */
public final class CatalogGetMarketSearchRequestFactory extends SearchRequestFactory {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogGetMarketSearchRequestFactory.kt */
    public static final class SearchMarketEntrypoint implements SearchRequestFactory.a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SearchMarketEntrypoint[] $VALUES;
        public static final SearchMarketEntrypoint GlobalSearchTab;
        public static final SearchMarketEntrypoint SearchInService;
        private final String apiName;

        static {
            SearchMarketEntrypoint searchMarketEntrypoint = new SearchMarketEntrypoint("GlobalSearchTab", 0, CatalogGetSearchMarketScreenRefDto.SEARCH_MARKET.i());
            GlobalSearchTab = searchMarketEntrypoint;
            SearchMarketEntrypoint searchMarketEntrypoint2 = new SearchMarketEntrypoint("SearchInService", 1, CatalogGetSearchMarketScreenRefDto.SEARCH_MARKET_SERVICE.i());
            SearchInService = searchMarketEntrypoint2;
            SearchMarketEntrypoint[] searchMarketEntrypointArr = {searchMarketEntrypoint, searchMarketEntrypoint2};
            $VALUES = searchMarketEntrypointArr;
            $ENTRIES = new asp(searchMarketEntrypointArr);
        }

        public SearchMarketEntrypoint(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static SearchMarketEntrypoint valueOf(String str) {
            return (SearchMarketEntrypoint) Enum.valueOf(SearchMarketEntrypoint.class, str);
        }

        public static SearchMarketEntrypoint[] values() {
            return (SearchMarketEntrypoint[]) $VALUES.clone();
        }

        @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory.a
        public final String h() {
            return this.apiName;
        }
    }

    /* compiled from: CatalogGetMarketSearchRequestFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketSearchDeliveryType.values().length];
            try {
                iArr[MarketSearchDeliveryType.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketSearchDeliveryType.PICKUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketSearchDeliveryType.COURIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final q h(String str, SearchParams searchParams, SearchRequestFactory.a aVar, boolean z) {
        CatalogGetSearchMarketCatalogContextDto catalogGetSearchMarketCatalogContextDto;
        CatalogGetSearchMarketScreenRefDto catalogGetSearchMarketScreenRefDto;
        tfx tfxVar;
        tfx tfxVar2;
        tfx tfxVar3;
        MarketSearchDeliveryType marketSearchDeliveryType;
        String h;
        fxh0<Integer> fxh0Var;
        CatalogGetSearchMarketDeliveryTypeDto catalogGetSearchMarketDeliveryTypeDto = null;
        VkMarketSearchParams vkMarketSearchParams = searchParams instanceof VkMarketSearchParams ? (VkMarketSearchParams) searchParams : null;
        e3a e3aVar = new e3a();
        Integer valueOf = vkMarketSearchParams != null ? Integer.valueOf(vkMarketSearchParams.d()) : null;
        Integer num = vkMarketSearchParams != null ? vkMarketSearchParams.g : null;
        Integer num2 = vkMarketSearchParams != null ? vkMarketSearchParams.h : null;
        Integer num3 = (vkMarketSearchParams == null || (fxh0Var = vkMarketSearchParams.d) == null) ? null : fxh0Var.a;
        String str2 = vkMarketSearchParams != null ? vkMarketSearchParams.e : null;
        String str3 = vkMarketSearchParams != null ? vkMarketSearchParams.f : null;
        if (str3 != null) {
            for (CatalogGetSearchMarketCatalogContextDto catalogGetSearchMarketCatalogContextDto2 : CatalogGetSearchMarketCatalogContextDto.values()) {
                if (epx.f(catalogGetSearchMarketCatalogContextDto2.i(), str3)) {
                    catalogGetSearchMarketCatalogContextDto = catalogGetSearchMarketCatalogContextDto2;
                    break;
                }
            }
        }
        catalogGetSearchMarketCatalogContextDto = null;
        String str4 = vkMarketSearchParams != null ? vkMarketSearchParams.c : null;
        if (aVar != null && (h = aVar.h()) != null) {
            CatalogGetSearchMarketScreenRefDto[] values = CatalogGetSearchMarketScreenRefDto.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                catalogGetSearchMarketScreenRefDto = values[i];
                if (epx.f(catalogGetSearchMarketScreenRefDto.i(), h)) {
                    break;
                }
            }
        }
        catalogGetSearchMarketScreenRefDto = null;
        Boolean bool = vkMarketSearchParams != null ? vkMarketSearchParams.k : null;
        Float f = vkMarketSearchParams != null ? vkMarketSearchParams.i : null;
        Float f2 = vkMarketSearchParams != null ? vkMarketSearchParams.j : null;
        Integer num4 = vkMarketSearchParams != null ? vkMarketSearchParams.l : null;
        String str5 = vkMarketSearchParams != null ? vkMarketSearchParams.m : null;
        Boolean bool2 = vkMarketSearchParams != null ? vkMarketSearchParams.n : null;
        Boolean bool3 = vkMarketSearchParams != null ? vkMarketSearchParams.o : null;
        Boolean bool4 = vkMarketSearchParams != null ? vkMarketSearchParams.p : null;
        Boolean bool5 = vkMarketSearchParams != null ? vkMarketSearchParams.q : null;
        Boolean bool6 = vkMarketSearchParams != null ? vkMarketSearchParams.r : null;
        if (vkMarketSearchParams != null && (marketSearchDeliveryType = vkMarketSearchParams.s) != null) {
            int i2 = a.$EnumSwitchMapping$0[marketSearchDeliveryType.ordinal()];
            if (i2 == 1) {
                catalogGetSearchMarketDeliveryTypeDto = CatalogGetSearchMarketDeliveryTypeDto.ANY;
            } else if (i2 == 2) {
                catalogGetSearchMarketDeliveryTypeDto = CatalogGetSearchMarketDeliveryTypeDto.PICKUP;
            } else if (i2 == 3) {
                catalogGetSearchMarketDeliveryTypeDto = CatalogGetSearchMarketDeliveryTypeDto.COURIER;
            }
        }
        tfx tfxVar4 = new tfx("catalog.getSearchMarket", new n(5), new zq(7));
        if (str != null) {
            tfxVar = tfxVar4;
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
        } else {
            tfxVar = tfxVar4;
        }
        if (num != null) {
            tfx.l(tfxVar, "price_from", num.intValue(), 0, 0, 8);
        }
        if (num2 != null) {
            tfx.l(tfxVar, "price_to", num2.intValue(), 0, 0, 8);
        }
        if (catalogGetSearchMarketScreenRefDto != null) {
            tfx.o(tfxVar, "screen_ref", catalogGetSearchMarketScreenRefDto.i(), 0, 0, 12);
        }
        if (valueOf != null) {
            tfx.l(tfxVar, "city_id", valueOf.intValue(), 0, 0, 8);
        }
        if (num3 != null) {
            tfx.l(tfxVar, "category_id", num3.intValue(), 0, 0, 8);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "category_ids", str2, 0, 0, 12);
        }
        if (f != null) {
            tfxVar.h("latitude", f.floatValue(), -90.0d, 90.0d);
        }
        if (f2 != null) {
            tfxVar.h("longitude", f2.floatValue(), -180.0d, 180.0d);
        }
        if (num4 != null) {
            tfx.l(tfxVar, "distance_max", num4.intValue(), -1, 0, 8);
        }
        if (str5 != null) {
            tfx tfxVar5 = tfxVar;
            tfx.o(tfxVar5, "location_name", str5, 0, 0, 12);
            tfxVar2 = tfxVar5;
        } else {
            tfxVar2 = tfxVar;
        }
        if (bool != null) {
            tfxVar2.j("is_save_geo", bool.booleanValue());
        }
        if (catalogGetSearchMarketCatalogContextDto != null) {
            tfx.o(tfxVar2, "catalog_context", catalogGetSearchMarketCatalogContextDto.i(), 0, 0, 12);
        }
        if (bool2 != null) {
            tfxVar2.j("online_payment", bool2.booleanValue());
        }
        if (bool3 != null) {
            tfxVar2.j("discount", bool3.booleanValue());
        }
        if (bool4 != null) {
            tfxVar2.j("seller_high_rating", bool4.booleanValue());
        }
        if (bool5 != null) {
            tfxVar2.j("friends_reviews", bool5.booleanValue());
        }
        if (bool6 != null) {
            tfxVar2.j("friends_wishlist", bool6.booleanValue());
        }
        if (catalogGetSearchMarketDeliveryTypeDto != null) {
            tfxVar3 = tfxVar2;
            tfx.o(tfxVar3, "delivery_type", catalogGetSearchMarketDeliveryTypeDto.i(), 0, 0, 12);
        } else {
            tfxVar3 = tfxVar2;
        }
        if (str4 != null) {
            tfx.o(tfxVar3, "sorting_option_id", str4, 0, 0, 12);
        }
        return rsg0.T(yfb.x(tfxVar3)).U(new e10(new g6a(1, e3aVar, e3a.class, "mapToDefaultSection", "mapToDefaultSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 9)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final q i(String str, boolean z) {
        return h(str, null, this.d, z);
    }
}
