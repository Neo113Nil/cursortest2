package com.vk.friends.recommendations.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.friends.recommendations.api.di.FriendsRecommendationsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.css;
import xsna.fn4;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: FriendsRecommendationsComponentImpl.kt */
/* loaded from: classes16.dex */
public final class FriendsRecommendationsComponentImpl implements FriendsRecommendationsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new fn4(12));

    /* compiled from: FriendsRecommendationsComponentImpl.kt */
    public static final class a implements c8m<FriendsRecommendationsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new FriendsRecommendationsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(FriendsRecommendationsComponentImpl.class, "router", "getRouter()Lcom/vk/friends/recommendations/api/router/FriendsRecommendationsRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.friends.recommendations.api.di.FriendsRecommendationsComponent
    public final css a() {
        qcy<Object> qcyVar = b[0];
        return (css) this.a.c();
    }
}
