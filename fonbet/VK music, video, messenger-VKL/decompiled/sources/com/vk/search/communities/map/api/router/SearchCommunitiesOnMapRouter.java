package com.vk.search.communities.map.api.router;

import android.content.Context;
import xsna.asp;
import xsna.zrp;

/* compiled from: SearchCommunitiesOnMapRouter.kt */
/* loaded from: classes5.dex */
public interface SearchCommunitiesOnMapRouter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchCommunitiesOnMapRouter.kt */
    public static final class MapEntrypoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MapEntrypoint[] $VALUES;
        public static final MapEntrypoint GlobalSearch;
        public static final MapEntrypoint SearchInService;

        static {
            MapEntrypoint mapEntrypoint = new MapEntrypoint("GlobalSearch", 0);
            GlobalSearch = mapEntrypoint;
            MapEntrypoint mapEntrypoint2 = new MapEntrypoint("SearchInService", 1);
            SearchInService = mapEntrypoint2;
            MapEntrypoint[] mapEntrypointArr = {mapEntrypoint, mapEntrypoint2};
            $VALUES = mapEntrypointArr;
            $ENTRIES = new asp(mapEntrypointArr);
        }

        public MapEntrypoint() {
            throw null;
        }

        public static zrp<MapEntrypoint> h() {
            return $ENTRIES;
        }

        public static MapEntrypoint valueOf(String str) {
            return (MapEntrypoint) Enum.valueOf(MapEntrypoint.class, str);
        }

        public static MapEntrypoint[] values() {
            return (MapEntrypoint[]) $VALUES.clone();
        }
    }

    void a(Context context, String str, SearchMapPreviewStateWrapper searchMapPreviewStateWrapper, MapEntrypoint mapEntrypoint, String str2);

    /* compiled from: SearchCommunitiesOnMapRouter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final SearchCommunitiesOnMapRouter STUB = new C1761a();

        public final SearchCommunitiesOnMapRouter getSTUB() {
            return STUB;
        }

        /* compiled from: SearchCommunitiesOnMapRouter.kt */
        /* renamed from: com.vk.search.communities.map.api.router.SearchCommunitiesOnMapRouter$a$a, reason: collision with other inner class name */
        public static final class C1761a implements SearchCommunitiesOnMapRouter {
            @Override // com.vk.search.communities.map.api.router.SearchCommunitiesOnMapRouter
            public final void a(Context context, String str, SearchMapPreviewStateWrapper searchMapPreviewStateWrapper, MapEntrypoint mapEntrypoint, String str2) {
            }
        }
    }
}
