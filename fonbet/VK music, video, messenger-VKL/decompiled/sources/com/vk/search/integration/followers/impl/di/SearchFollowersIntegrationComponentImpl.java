package com.vk.search.integration.followers.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.search.integration.followers.api.di.SearchFollowersIntegrationComponent;
import xsna.b7m;
import xsna.e7m;

/* compiled from: SearchFollowersIntegrationComponentImpl.kt */
/* loaded from: classes5.dex */
public final class SearchFollowersIntegrationComponentImpl implements SearchFollowersIntegrationComponent {

    /* compiled from: SearchFollowersIntegrationComponentImpl.kt */
    public static final class a implements b7m<SearchFollowersIntegrationComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new SearchFollowersIntegrationComponentImpl();
        }
    }
}
