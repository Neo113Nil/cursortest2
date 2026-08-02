package com.vk.profile.user.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.profile.user.api.di.ProfileOnboardingComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.bpn0;
import xsna.e7m;
import xsna.fpf0;
import xsna.k0e0;
import xsna.nwy;
import xsna.o0e0;
import xsna.qcy;
import xsna.sy50;
import xsna.t210;

/* compiled from: ProfileOnboardingComponentImpl.kt */
/* loaded from: classes5.dex */
public final class ProfileOnboardingComponentImpl implements ProfileOnboardingComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final bpn0 a;
    public final nwy b = new nwy(new t210(this, 26));

    /* compiled from: ProfileOnboardingComponentImpl.kt */
    public static final class a implements b7m<ProfileOnboardingComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ProfileOnboardingComponentImpl(new bpn0(new sy50(e7mVar, 22)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ProfileOnboardingComponentImpl.class, "profileTooltipManager", "getProfileTooltipManager()Lcom/vk/profile/user/impl/ui/onboarding/ProfileTooltipManagerImpl;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public ProfileOnboardingComponentImpl(bpn0 bpn0Var) {
        this.a = bpn0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.user.api.di.ProfileOnboardingComponent
    public final k0e0 Fe() {
        qcy<Object> qcyVar = c[0];
        return (o0e0) this.b.c();
    }
}
