package com.vk.search.integration.friends.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.search.integration.friends.api.di.SearchFriendsIntegrationComponent;
import xsna.b7m;
import xsna.e7m;

/* compiled from: SearchFriendsIntegrationComponentImpl.kt */
/* loaded from: classes5.dex */
public final class SearchFriendsIntegrationComponentImpl implements SearchFriendsIntegrationComponent {

    /* compiled from: SearchFriendsIntegrationComponentImpl.kt */
    public static final class a implements b7m<SearchFriendsIntegrationComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new SearchFriendsIntegrationComponentImpl();
        }
    }
}
