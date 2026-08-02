package com.vk.voip.miniapps.impl.di;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import com.vk.voip.miniapps.api.di.VoipMiniAppCallComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bpn0;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.ip;
import xsna.np;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.usw0;
import xsna.w2x0;

/* compiled from: VoipMiniAppCallComponentImpl.kt */
/* loaded from: classes11.dex */
public final class VoipMiniAppCallComponentImpl implements VoipMiniAppCallComponent {
    public static final /* synthetic */ qcy<Object>[] e = {new PropertyReference1Impl(VoipMiniAppCallComponentImpl.class, "voipMiniAppCallManager", "getVoipMiniAppCallManager()Lcom/vk/voip/miniapps/api/VoipMiniAppCallManager;", 0), fp.c(0, VoipMiniAppCallComponentImpl.class, "uiLauncher", "getUiLauncher()Lcom/vk/voip/api/launcher/VoipUiLauncher;", fpf0.a)};
    public final Context a;
    public final bpn0 b;
    public final nwy c = new nwy(new ip(this, 10));
    public final nwy d = new nwy(new np(this, 10));

    /* compiled from: VoipMiniAppCallComponentImpl.kt */
    public static final class a implements c8m<VoipMiniAppCallComponent, pwj0> {
        public final Context a;
        public final bpn0 b;

        public a(Context context, bpn0 bpn0Var) {
            this.a = context;
            this.b = bpn0Var;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VoipMiniAppCallComponentImpl(this.a, this.b);
        }
    }

    public VoipMiniAppCallComponentImpl(Context context, bpn0 bpn0Var) {
        this.a = context;
        this.b = bpn0Var;
    }

    @Override // com.vk.voip.miniapps.api.di.VoipMiniAppCallComponent
    public final w2x0 M8() {
        qcy<Object> qcyVar = e[1];
        return (w2x0) this.d.c();
    }

    @Override // com.vk.voip.miniapps.api.di.VoipMiniAppCallComponent
    public final usw0 P() {
        qcy<Object> qcyVar = e[0];
        return (usw0) this.c.c();
    }
}
