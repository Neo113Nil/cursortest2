package com.vk.newsfeed.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.newsfeed.api.di.PostingSettingsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.d2c0;
import xsna.e7m;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.lyk;
import xsna.myk;
import xsna.qc00;
import xsna.qcy;
import xsna.sfc0;
import xsna.zlc0;

/* compiled from: PostingSettingsComponentImpl.kt */
/* loaded from: classes4.dex */
public final class PostingSettingsComponentImpl implements PostingSettingsComponent {
    public static final /* synthetic */ qcy<Object>[] d = {new PropertyReference1Impl(PostingSettingsComponentImpl.class, "settingsRepository", "getSettingsRepository()Lcom/vk/newsfeed/api/posting/settings/PostingSettingsRepository;", 0), fp.c(0, PostingSettingsComponentImpl.class, "postingFragmentBuilderProvider", "getPostingFragmentBuilderProvider()Lcom/vk/newsfeed/api/posting/PostingFragmentBuilderProvider;", fpf0.a)};
    public final myk a;
    public final ewy b = new ewy(new qc00(7));
    public final ewy c = new ewy(new d2c0(2));

    /* compiled from: PostingSettingsComponentImpl.kt */
    public static final class a implements b7m<PostingSettingsComponent> {
        public final myk a;

        public a(myk mykVar) {
            this.a = mykVar;
        }

        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new PostingSettingsComponentImpl(this.a);
        }
    }

    public PostingSettingsComponentImpl(myk mykVar) {
        this.a = mykVar;
    }

    @Override // com.vk.newsfeed.api.di.PostingSettingsComponent
    public final sfc0 Nb() {
        qcy<Object> qcyVar = d[1];
        return (sfc0) this.c.c();
    }

    @Override // com.vk.newsfeed.api.di.PostingSettingsComponent
    public final zlc0 X() {
        qcy<Object> qcyVar = d[0];
        return (zlc0) this.b.c();
    }

    @Override // com.vk.newsfeed.api.di.PostingSettingsComponent
    public final lyk u0() {
        return this.a;
    }
}
