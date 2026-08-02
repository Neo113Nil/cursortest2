package com.vk.story.viewer.stat.di;

import com.vk.cachecontrol.api.CacheComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.iw00;
import xsna.jfm0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.uy2;

/* compiled from: StoryStatisticsComponentImpl.kt */
/* loaded from: classes11.dex */
public final class StoryStatisticsComponentImpl implements StoryStatisticsComponent {
    public static final /* synthetic */ qcy<Object>[] e = {new PropertyReference1Impl(StoryStatisticsComponentImpl.class, "repository", "getRepository()Lcom/vk/story/viewer/stat/data/StoryStatisticsRepositoryImpl;", 0), fp.c(0, StoryStatisticsComponentImpl.class, "storyStatisticsInteractor", "getStoryStatisticsInteractor()Lcom/vk/story/viewer/stat/domain/StoryStatisticsInteractor;", fpf0.a)};
    public final AppContextDiComponent a;
    public final CacheComponent b;
    public final nwy c = new nwy(new iw00(this, 6));
    public final nwy d = new nwy(new uy2(this, 10));

    /* compiled from: StoryStatisticsComponentImpl.kt */
    public static final class a implements c8m<StoryStatisticsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new StoryStatisticsComponentImpl((AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)), (CacheComponent) g8mVar.a(fpf0.a(CacheComponent.class)));
        }
    }

    public StoryStatisticsComponentImpl(AppContextDiComponent appContextDiComponent, CacheComponent cacheComponent) {
        this.a = appContextDiComponent;
        this.b = cacheComponent;
    }

    @Override // com.vk.story.viewer.stat.di.StoryStatisticsComponent
    public final jfm0 h7() {
        qcy<Object> qcyVar = e[1];
        return (jfm0) this.d.c();
    }
}
