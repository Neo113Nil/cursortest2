package com.vk.catalog2.feature.music.search.history.di;

import com.vk.di.component.DiScopedWithParamsComponent;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.music.search.history.di.SearchHistoryRepoComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.fpf0;
import xsna.g8m;
import xsna.gvh0;
import xsna.hvh0;
import xsna.kvh0;
import xsna.l9i;
import xsna.nwy;
import xsna.o8m;
import xsna.pwj0;
import xsna.qcy;
import xsna.v100;
import xsna.vp70;

/* compiled from: SearchHistoryRepoComponentImpl.kt */
/* loaded from: classes16.dex */
public final class SearchHistoryRepoComponentImpl implements SearchHistoryRepoComponent, DiScopedWithParamsComponent<kvh0, hvh0> {
    public static final /* synthetic */ qcy<Object>[] d;
    public final hvh0 a;
    public final MusicPrefsComponent b;
    public final nwy c = new nwy(new v100(this, 27));

    /* compiled from: SearchHistoryRepoComponentImpl.kt */
    public static final class a implements o8m<SearchHistoryRepoComponent, kvh0, hvh0> {
        @Override // xsna.o8m
        public final DiScopedWithParamsComponent a(l9i l9iVar, g8m g8mVar, pwj0 pwj0Var) {
            return new SearchHistoryRepoComponentImpl((hvh0) l9iVar, (MusicPrefsComponent) g8mVar.a(fpf0.a(MusicPrefsComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SearchHistoryRepoComponentImpl.class, "repo", "getRepo()Lcom/vk/music/search/history/SearchHistoryRepo;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public SearchHistoryRepoComponentImpl(hvh0 hvh0Var, MusicPrefsComponent musicPrefsComponent) {
        this.a = hvh0Var;
        this.b = musicPrefsComponent;
    }

    @Override // com.vk.music.search.history.di.SearchHistoryRepoComponent
    public final gvh0<vp70> Mb() {
        qcy<Object> qcyVar = d[0];
        return (gvh0) this.c.c();
    }
}
