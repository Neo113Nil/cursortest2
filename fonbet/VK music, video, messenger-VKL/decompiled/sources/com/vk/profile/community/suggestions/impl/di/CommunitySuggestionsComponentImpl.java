package com.vk.profile.community.suggestions.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.profile.community.suggestions.api.di.CommunitySuggestionsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.l3i;
import xsna.l63;
import xsna.nwy;
import xsna.qcy;

/* compiled from: CommunitySuggestionsComponentImpl.kt */
/* loaded from: classes5.dex */
public final class CommunitySuggestionsComponentImpl implements CommunitySuggestionsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new l63(10));

    /* compiled from: CommunitySuggestionsComponentImpl.kt */
    public static final class a implements b7m<CommunitySuggestionsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new CommunitySuggestionsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CommunitySuggestionsComponentImpl.class, "router", "getRouter()Lcom/vk/profile/community/suggestions/api/router/CommunitySuggestionsRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.profile.community.suggestions.api.di.CommunitySuggestionsComponent
    public final l3i a() {
        qcy<Object> qcyVar = b[0];
        return (l3i) this.a.c();
    }
}
