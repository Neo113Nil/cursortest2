package com.vk.story.archive.impl.di;

import com.vk.archive.api.di.StoryArchiveComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.narratives.api.di.NarrativeComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bpc0;
import xsna.bpn0;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.mqe0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.upl0;

/* compiled from: StoryArchiveComponentImpl.kt */
/* loaded from: classes6.dex */
public final class StoryArchiveComponentImpl implements StoryArchiveComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final NarrativeComponent a;
    public final bpn0 b = new bpn0(new bpc0(5));
    public final nwy c = new nwy(new mqe0(this, 16));

    /* compiled from: StoryArchiveComponentImpl.kt */
    public static final class a implements c8m<StoryArchiveComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new StoryArchiveComponentImpl((NarrativeComponent) g8mVar.a(fpf0.a(NarrativeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StoryArchiveComponentImpl.class, "archiveInteractor", "getArchiveInteractor()Lcom/vk/archive/api/domain/interactor/StoriesArchiveInteractor;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public StoryArchiveComponentImpl(NarrativeComponent narrativeComponent) {
        this.a = narrativeComponent;
    }

    @Override // com.vk.archive.api.di.StoryArchiveComponent
    public final upl0 l1() {
        qcy<Object> qcyVar = d[0];
        return (upl0) this.c.c();
    }
}
