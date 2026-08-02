package com.vk.profile.community.newsfeed.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.profile.community.newsfeed.api.di.CommunityNewsfeedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a5i;
import xsna.abh;
import xsna.b5i;
import xsna.b7m;
import xsna.bbh;
import xsna.e7m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.i9;
import xsna.nwy;
import xsna.pr1;
import xsna.qcy;
import xsna.uz;
import xsna.ych;
import xsna.zch;

/* compiled from: CommunityNewsfeedComponentImpl.kt */
/* loaded from: classes5.dex */
public final class CommunityNewsfeedComponentImpl implements CommunityNewsfeedComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy a = new nwy(new uz(8));
    public final nwy b = new nwy(new pr1(11));
    public final nwy c = new nwy(new i9(16));

    /* compiled from: CommunityNewsfeedComponentImpl.kt */
    public static final class a implements b7m<CommunityNewsfeedComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new CommunityNewsfeedComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CommunityNewsfeedComponentImpl.class, "communityPostsSubscriptionBus", "getCommunityPostsSubscriptionBus()Lcom/vk/profile/community/newsfeed/impl/events/CommunityPostsSubscriptionRxBusImpl;", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, CommunityNewsfeedComponentImpl.class, "communityWallBus", "getCommunityWallBus()Lcom/vk/profile/community/newsfeed/impl/events/CommunityWallBusImpl;", hpf0Var), ep.a(0, CommunityNewsfeedComponentImpl.class, "communityNewsfeedRouter", "getCommunityNewsfeedRouter()Lcom/vk/profile/community/newsfeed/impl/router/CommunityNewsfeedRouterImpl;", hpf0Var)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.community.newsfeed.api.di.CommunityNewsfeedComponent
    public final ych Jb() {
        qcy<Object> qcyVar = d[0];
        return (zch) this.a.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.community.newsfeed.api.di.CommunityNewsfeedComponent
    public final abh Q3() {
        qcy<Object> qcyVar = d[2];
        return (bbh) this.c.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.community.newsfeed.api.di.CommunityNewsfeedComponent
    public final a5i ba() {
        qcy<Object> qcyVar = d[1];
        return (b5i) this.b.c();
    }
}
