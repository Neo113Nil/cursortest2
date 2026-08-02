package com.vk.music.analytics.api.di;

import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.w950;
import xsna.z34;

/* compiled from: MusicAnalyticsComponent.kt */
/* loaded from: classes3.dex */
public final class MusicAnalyticsComponent$Companion$STUB$1 implements MusicAnalyticsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new z34(22));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MusicAnalyticsComponent$Companion$STUB$1.class, "tapsTracker", "getTapsTracker()Lcom/vk/music/analytics/api/taps/MusicTapsTracker;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.music.analytics.api.di.MusicAnalyticsComponent
    public final w950 Bd() {
        qcy<Object> qcyVar = b[0];
        return (w950) this.a.c();
    }
}
