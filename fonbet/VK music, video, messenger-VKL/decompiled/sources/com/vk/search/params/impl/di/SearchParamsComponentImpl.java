package com.vk.search.params.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.search.params.api.di.SearchParamsComponent;
import xsna.c8m;
import xsna.dwh0;
import xsna.g8m;
import xsna.n34;
import xsna.ofc;
import xsna.pwj0;
import xsna.rnh0;
import xsna.ysh0;
import xsna.zwz;

/* compiled from: SearchParamsComponentImpl.kt */
/* loaded from: classes5.dex */
public final class SearchParamsComponentImpl implements SearchParamsComponent {

    /* compiled from: SearchParamsComponentImpl.kt */
    public static final class a implements c8m<SearchParamsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new SearchParamsComponentImpl();
        }
    }

    @Override // com.vk.search.params.api.di.SearchParamsComponent
    public final rnh0 C4() {
        return new rnh0();
    }

    @Override // com.vk.search.params.api.di.SearchParamsComponent
    public final ysh0 Db() {
        return new ysh0();
    }

    @Override // com.vk.search.params.api.di.SearchParamsComponent
    public final zwz M9() {
        return new zwz();
    }

    @Override // com.vk.search.params.api.di.SearchParamsComponent
    public final n34 Ub() {
        return new n34();
    }

    @Override // com.vk.search.params.api.di.SearchParamsComponent
    public final ofc be() {
        return new ofc();
    }

    @Override // com.vk.search.params.api.di.SearchParamsComponent
    public final dwh0 oa() {
        return new dwh0();
    }
}
