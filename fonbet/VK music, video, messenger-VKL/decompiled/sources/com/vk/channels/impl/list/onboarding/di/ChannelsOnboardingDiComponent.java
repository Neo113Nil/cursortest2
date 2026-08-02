package com.vk.channels.impl.list.onboarding.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.fz5;
import xsna.nwy;
import xsna.qcy;
import xsna.qe3;

/* compiled from: ChannelsOnboardingDiComponent.kt */
/* loaded from: classes16.dex */
public final class ChannelsOnboardingDiComponent implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final fz5 a;
    public final nwy b = new nwy(new qe3(7));

    /* compiled from: ChannelsOnboardingDiComponent.kt */
    public static final class a implements b7m<ChannelsOnboardingDiComponent> {
        public final fz5 a;

        public a(fz5 fz5Var) {
            this.a = fz5Var;
        }

        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ChannelsOnboardingDiComponent(this.a);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ChannelsOnboardingDiComponent.class, "channelsOnboardingVisibilityStore", "getChannelsOnboardingVisibilityStore()Lcom/vk/channels/impl/list/onboarding/ChannelsOnboardingVisibilityStoreImpl;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public ChannelsOnboardingDiComponent(fz5 fz5Var) {
        this.a = fz5Var;
    }
}
