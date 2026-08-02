package com.vk.music.bottomsheets.settings.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.mix.MixSettingsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.f53;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.q4v0;
import xsna.qcy;
import xsna.sq6;
import xsna.t4v0;

/* compiled from: MixSettingsComponentImpl.kt */
/* loaded from: classes.dex */
public final class MixSettingsComponentImpl implements MixSettingsComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(MixSettingsComponentImpl.class, "vkMixInteractor", "getVkMixInteractor()Lcom/vk/music/mix/VkMixSettingsInteractor;", 0), fp.c(0, MixSettingsComponentImpl.class, "vkMixRepository", "getVkMixRepository()Lcom/vk/music/bottomsheets/data/repository/VkMixSettingsRepository;", fpf0.a)};
    public final nwy a = new nwy(new f53(this, 9));
    public final nwy b = new nwy(new sq6(10));

    /* compiled from: MixSettingsComponentImpl.kt */
    public static final class a implements c8m<MixSettingsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MixSettingsComponentImpl();
        }
    }

    @Override // com.vk.music.mix.MixSettingsComponent
    public final t4v0 E0() {
        qcy<Object> qcyVar = c[1];
        return (t4v0) this.b.c();
    }

    @Override // com.vk.music.mix.MixSettingsComponent
    public final q4v0 af() {
        qcy<Object> qcyVar = c[0];
        return (q4v0) this.a.c();
    }
}
