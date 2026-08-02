package com.vk.catalog2.common.ui.mvp.video;

import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.search.params.api.SearchParams;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import io.reactivex.rxjava3.core.q;
import xsna.asp;
import xsna.cfz;
import xsna.cmc0;
import xsna.h6a;
import xsna.rsg0;
import xsna.set0;
import xsna.wba;
import xsna.x6a;
import xsna.x9s0;
import xsna.y9s0;
import xsna.zrp;

/* compiled from: VideoCatalogSearchRequestFactory.kt */
/* loaded from: classes16.dex */
public final class VideoCatalogSearchRequestFactory extends SearchRequestFactory {
    public final VideoSearchFiltersImpl p;
    public final long q;
    public final VideoSearchFiltersImpl r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoCatalogSearchRequestFactory.kt */
    public static final class VideoEntrypoint implements SearchRequestFactory.a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VideoEntrypoint[] $VALUES;
        public static final VideoEntrypoint GlobalSearchTab;
        public static final VideoEntrypoint SearchInService;
        public static final VideoEntrypoint SearchOwnerVideos;
        private final String apiName;

        static {
            VideoEntrypoint videoEntrypoint = new VideoEntrypoint("GlobalSearchTab", 0, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_VIDEO));
            GlobalSearchTab = videoEntrypoint;
            VideoEntrypoint videoEntrypoint2 = new VideoEntrypoint("SearchOwnerVideos", 1, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_OWNER_VIDEOS));
            SearchOwnerVideos = videoEntrypoint2;
            VideoEntrypoint videoEntrypoint3 = new VideoEntrypoint("SearchInService", 2, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_VIDEO_SERVICE));
            SearchInService = videoEntrypoint3;
            VideoEntrypoint[] videoEntrypointArr = {videoEntrypoint, videoEntrypoint2, videoEntrypoint3};
            $VALUES = videoEntrypointArr;
            $ENTRIES = new asp(videoEntrypointArr);
        }

        public VideoEntrypoint(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static VideoEntrypoint valueOf(String str) {
            return (VideoEntrypoint) Enum.valueOf(VideoEntrypoint.class, str);
        }

        public static VideoEntrypoint[] values() {
            return (VideoEntrypoint[]) $VALUES.clone();
        }

        @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory.a
        public final String h() {
            return this.apiName;
        }
    }

    public /* synthetic */ VideoCatalogSearchRequestFactory(wba wbaVar, VideoSearchFiltersImpl videoSearchFiltersImpl, VideoEntrypoint videoEntrypoint, int i) {
        this(wbaVar, videoSearchFiltersImpl, (SearchRequestFactory.a) ((i & 4) != 0 ? null : videoEntrypoint), 0L);
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final q h(String str, SearchParams searchParams, SearchRequestFactory.a aVar, boolean z) {
        rsg0 x6aVar;
        long j = this.q;
        if (j != 0) {
            x6aVar = new h6a(j, this.c, str, this.h, aVar != null ? aVar.h() : null, this.p, this.j);
        } else {
            SearchRequestFactory.InputMethod inputMethod = this.k;
            x6aVar = new x6a(this.c, str, inputMethod != null ? inputMethod.h() : null, this.i, this.h, aVar != null ? aVar.h() : null, this.p, this.j);
        }
        return rsg0.y0(x6aVar, null, null, 3).U(new cmc0(new x9s0(1, this, VideoCatalogSearchRequestFactory.class, "extractDefaultSection", "extractDefaultSection(Lcom/vk/catalog2/common/dto/api/CatalogResponse;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 4)).U(new cfz(new y9s0(1, this, VideoCatalogSearchRequestFactory.class, "transformResponseAuthorsVideoSearchSlider", "transformResponseAuthorsVideoSearchSlider(Lcom/vk/catalog2/common/dto/api/CatalogResponse;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 18));
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final q i(String str, boolean z) {
        return h(str, this.g, this.d, z);
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final set0 l() {
        return this.r;
    }

    public VideoCatalogSearchRequestFactory(wba wbaVar, VideoSearchFiltersImpl videoSearchFiltersImpl, SearchRequestFactory.a aVar, long j) {
        super(wbaVar, aVar, 4);
        this.p = videoSearchFiltersImpl;
        this.q = j;
        this.r = new VideoSearchFiltersImpl();
    }
}
