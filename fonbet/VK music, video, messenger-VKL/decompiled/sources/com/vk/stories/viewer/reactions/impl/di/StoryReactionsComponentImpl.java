package com.vk.stories.viewer.reactions.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.stories.viewer.reactions.api.di.StoryReactionsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.dei0;
import xsna.e7m;
import xsna.ewy;
import xsna.fbm0;
import xsna.fp;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.wzb0;

/* compiled from: StoryReactionsComponentImpl.kt */
/* loaded from: classes6.dex */
public final class StoryReactionsComponentImpl implements StoryReactionsComponent {
    public static final /* synthetic */ qcy<Object>[] d = {new PropertyReference1Impl(StoryReactionsComponentImpl.class, "repository", "getRepository()Lcom/vk/stories/viewer/reactions/impl/domain/repository/StoryReactionsRepository;", 0), fp.c(0, StoryReactionsComponentImpl.class, "interactor", "getInteractor()Lcom/vk/stories/viewer/reactions/api/domain/StoryReactionsInteractor;", fpf0.a)};
    public final AppContextDiComponent a;
    public final nwy b = new nwy(new wzb0(this, 14));
    public final ewy c = new ewy(new dei0(this, 12));

    /* compiled from: StoryReactionsComponentImpl.kt */
    public static final class a implements b7m<StoryReactionsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new StoryReactionsComponentImpl((AppContextDiComponent) e7mVar.a(fpf0.a(AppContextDiComponent.class)));
        }
    }

    public StoryReactionsComponentImpl(AppContextDiComponent appContextDiComponent) {
        this.a = appContextDiComponent;
    }

    @Override // com.vk.stories.viewer.reactions.api.di.StoryReactionsComponent
    public final fbm0 b() {
        qcy<Object> qcyVar = d[1];
        return (fbm0) this.c.c();
    }
}
