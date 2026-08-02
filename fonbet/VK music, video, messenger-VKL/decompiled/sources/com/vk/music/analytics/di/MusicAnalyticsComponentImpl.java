package com.vk.music.analytics.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.u35;
import xsna.w950;

/* compiled from: MusicAnalyticsComponentImpl.kt */
/* loaded from: classes.dex */
public final class MusicAnalyticsComponentImpl implements MusicAnalyticsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new u35(7));

    /* compiled from: MusicAnalyticsComponentImpl.kt */
    public static final class a implements c8m<MusicAnalyticsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MusicAnalyticsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MusicAnalyticsComponentImpl.class, "tapsTracker", "getTapsTracker()Lcom/vk/music/analytics/api/taps/MusicTapsTracker;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.music.analytics.api.di.MusicAnalyticsComponent
    public final w950 Bd() {
        qcy<Object> qcyVar = b[0];
        return (w950) this.a.c();
    }
}
