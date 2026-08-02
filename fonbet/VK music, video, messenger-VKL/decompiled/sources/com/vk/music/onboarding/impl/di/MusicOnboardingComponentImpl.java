package com.vk.music.onboarding.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.onboarding.api.di.MusicOnboardingComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.er40;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qb8;
import xsna.qcy;

/* compiled from: MusicOnboardingComponentImpl.kt */
/* loaded from: classes.dex */
public final class MusicOnboardingComponentImpl implements MusicOnboardingComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new qb8(4));

    /* compiled from: MusicOnboardingComponentImpl.kt */
    public static final class a implements c8m<MusicOnboardingComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MusicOnboardingComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MusicOnboardingComponentImpl.class, "launcher", "getLauncher()Lcom/vk/music/onboarding/api/MusicOnboardingLauncher;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.music.onboarding.api.di.MusicOnboardingComponent
    public final er40 e() {
        qcy<Object> qcyVar = b[0];
        return (er40) this.a.c();
    }
}
