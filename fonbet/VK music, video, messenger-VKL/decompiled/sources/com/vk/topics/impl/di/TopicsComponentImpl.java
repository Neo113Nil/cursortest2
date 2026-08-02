package com.vk.topics.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.topics.api.di.TopicsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.j55;
import xsna.ji7;
import xsna.k55;
import xsna.ki7;
import xsna.n9p0;
import xsna.nwy;
import xsna.pwj0;
import xsna.q9p0;
import xsna.qcy;

/* compiled from: TopicsComponentImpl.kt */
/* loaded from: classes11.dex */
public final class TopicsComponentImpl implements TopicsComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(TopicsComponentImpl.class, "topicsRouter", "getTopicsRouter()Lcom/vk/topics/impl/router/TopicsRouterImpl;", 0), fp.c(0, TopicsComponentImpl.class, "topicsController", "getTopicsController()Lcom/vk/topics/impl/BoardTopicControllerImpl;", fpf0.a)};
    public final nwy a = new nwy(new j55(13));
    public final nwy b = new nwy(new k55(8));

    /* compiled from: TopicsComponentImpl.kt */
    public static final class a implements c8m<TopicsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new TopicsComponentImpl();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.topics.api.di.TopicsComponent
    public final ji7 fe() {
        qcy<Object> qcyVar = c[1];
        return (ki7) this.b.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.topics.api.di.TopicsComponent
    public final n9p0 n8() {
        qcy<Object> qcyVar = c[0];
        return (q9p0) this.a.c();
    }
}
