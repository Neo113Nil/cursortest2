package com.vk.search.communities.map.api.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.search.communities.map.api.router.SearchCommunitiesOnMapRouter;

/* compiled from: SearchCommunitiesOnMapComponent.kt */
/* loaded from: classes5.dex */
public interface SearchCommunitiesOnMapComponent extends DiUnscopedComponent {
    public static final /* synthetic */ Companion Companion = Companion.a;

    /* compiled from: SearchCommunitiesOnMapComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final SearchCommunitiesOnMapComponent STUB = new SearchCommunitiesOnMapComponent() { // from class: com.vk.search.communities.map.api.di.SearchCommunitiesOnMapComponent$Companion$STUB$1
            @Override // com.vk.search.communities.map.api.di.SearchCommunitiesOnMapComponent
            public final SearchCommunitiesOnMapRouter ma() {
                return SearchCommunitiesOnMapRouter.a.a.getSTUB();
            }
        };

        public final SearchCommunitiesOnMapComponent getSTUB() {
            return STUB;
        }
    }

    SearchCommunitiesOnMapRouter ma();
}
