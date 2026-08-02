package com.vk.search.ui.impl.catalog.feed;

import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.search.params.api.SearchParams;
import com.vk.search.params.api.VkFeedSearchParams;
import com.vk.search.ui.impl.catalog.feed.CatalogGetSearchStatuses;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import io.reactivex.rxjava3.core.q;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.ozl;
import xsna.rsg0;
import xsna.zrp;

/* compiled from: CatalogGetSearchStatusesRequestFactory.kt */
@ozl
/* loaded from: classes5.dex */
public final class CatalogGetSearchStatusesRequestFactory extends SearchRequestFactory {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogGetSearchStatusesRequestFactory.kt */
    public static final class SearchFeedEntrypoint implements SearchRequestFactory.a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SearchFeedEntrypoint[] $VALUES;
        public static final SearchFeedEntrypoint GlobalSearchTab;
        private final String apiName;

        static {
            SearchFeedEntrypoint searchFeedEntrypoint = new SearchFeedEntrypoint(t0.a(MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_NEWS));
            GlobalSearchTab = searchFeedEntrypoint;
            SearchFeedEntrypoint[] searchFeedEntrypointArr = {searchFeedEntrypoint};
            $VALUES = searchFeedEntrypointArr;
            $ENTRIES = new asp(searchFeedEntrypointArr);
        }

        public SearchFeedEntrypoint(String str) {
            this.apiName = str;
        }

        public static SearchFeedEntrypoint valueOf(String str) {
            return (SearchFeedEntrypoint) Enum.valueOf(SearchFeedEntrypoint.class, str);
        }

        public static SearchFeedEntrypoint[] values() {
            return (SearchFeedEntrypoint[]) $VALUES.clone();
        }

        @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory.a
        public final String h() {
            return this.apiName;
        }
    }

    /* compiled from: CatalogGetSearchStatusesRequestFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchRequestFactory.InputMethod.values().length];
            try {
                iArr[SearchRequestFactory.InputMethod.Keyboard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchRequestFactory.InputMethod.GoogleVoice.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchRequestFactory.InputMethod.Preset.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchRequestFactory.InputMethod.Suggest.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchRequestFactory.InputMethod.QueryViewClick.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SearchRequestFactory.InputMethod.Marusia.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final q h(String str, SearchParams searchParams, SearchRequestFactory.a aVar, boolean z) {
        CatalogGetSearchStatuses.InputMethod inputMethod;
        CatalogGetSearchStatuses.InputMethod inputMethod2;
        VkFeedSearchParams vkFeedSearchParams = searchParams instanceof VkFeedSearchParams ? (VkFeedSearchParams) searchParams : null;
        String str2 = this.i;
        SearchRequestFactory.InputMethod inputMethod3 = this.k;
        switch (inputMethod3 == null ? -1 : a.$EnumSwitchMapping$0[inputMethod3.ordinal()]) {
            case -1:
                inputMethod = null;
                return rsg0.y0(new CatalogGetSearchStatuses(this.c, str, str2, vkFeedSearchParams, inputMethod, z), null, null, 3);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                inputMethod2 = CatalogGetSearchStatuses.InputMethod.Keyboard;
                inputMethod = inputMethod2;
                return rsg0.y0(new CatalogGetSearchStatuses(this.c, str, str2, vkFeedSearchParams, inputMethod, z), null, null, 3);
            case 2:
                inputMethod2 = CatalogGetSearchStatuses.InputMethod.GoogleVoice;
                inputMethod = inputMethod2;
                return rsg0.y0(new CatalogGetSearchStatuses(this.c, str, str2, vkFeedSearchParams, inputMethod, z), null, null, 3);
            case 3:
                inputMethod2 = CatalogGetSearchStatuses.InputMethod.Preset;
                inputMethod = inputMethod2;
                return rsg0.y0(new CatalogGetSearchStatuses(this.c, str, str2, vkFeedSearchParams, inputMethod, z), null, null, 3);
            case 4:
                inputMethod2 = CatalogGetSearchStatuses.InputMethod.Suggest;
                inputMethod = inputMethod2;
                return rsg0.y0(new CatalogGetSearchStatuses(this.c, str, str2, vkFeedSearchParams, inputMethod, z), null, null, 3);
            case 5:
                inputMethod2 = CatalogGetSearchStatuses.InputMethod.QueryViewClick;
                inputMethod = inputMethod2;
                return rsg0.y0(new CatalogGetSearchStatuses(this.c, str, str2, vkFeedSearchParams, inputMethod, z), null, null, 3);
            case 6:
                inputMethod2 = CatalogGetSearchStatuses.InputMethod.Marusia;
                inputMethod = inputMethod2;
                return rsg0.y0(new CatalogGetSearchStatuses(this.c, str, str2, vkFeedSearchParams, inputMethod, z), null, null, 3);
        }
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final q i(String str, boolean z) {
        return h(str, null, null, false);
    }
}
