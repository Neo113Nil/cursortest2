package com.vk.search.integration.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.search.integration.api.di.SearchComponent;
import com.vk.search.ui.api.di.SearchUiComponent;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.kqh0;
import xsna.lqh0;

/* compiled from: SearchComponentImpl.kt */
/* loaded from: classes5.dex */
public final class SearchComponentImpl implements SearchComponent {
    public final SearchUiComponent a;

    /* compiled from: SearchComponentImpl.kt */
    public static final class a implements b7m<SearchComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new SearchComponentImpl((SearchUiComponent) e7mVar.a(fpf0.a(SearchUiComponent.class)));
        }
    }

    public SearchComponentImpl(SearchUiComponent searchUiComponent) {
        this.a = searchUiComponent;
    }

    @Override // com.vk.search.integration.api.di.SearchComponent
    public final kqh0 V3() {
        return new lqh0(this.a.Td());
    }
}
