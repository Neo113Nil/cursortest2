package com.vk.search.communities.map.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.search.communities.map.api.di.SearchCommunitiesOnMapComponent;
import com.vk.search.communities.map.api.router.SearchCommunitiesOnMapRouter;
import xsna.b7m;
import xsna.e7m;
import xsna.uoh0;

/* compiled from: SearchCommunitiesOnMapComponentImpl.kt */
/* loaded from: classes5.dex */
public final class SearchCommunitiesOnMapComponentImpl implements SearchCommunitiesOnMapComponent {

    /* compiled from: SearchCommunitiesOnMapComponentImpl.kt */
    public static final class a implements b7m<SearchCommunitiesOnMapComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new SearchCommunitiesOnMapComponentImpl();
        }
    }

    @Override // com.vk.search.communities.map.api.di.SearchCommunitiesOnMapComponent
    public final SearchCommunitiesOnMapRouter ma() {
        return new uoh0();
    }
}
