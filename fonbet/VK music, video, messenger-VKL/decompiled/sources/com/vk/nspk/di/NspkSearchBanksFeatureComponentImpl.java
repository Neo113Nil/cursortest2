package com.vk.nspk.di;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import com.vk.nspk.search.NspkSearchBanksFeatureComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bg6;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.t2h0;
import xsna.v2h0;
import xsna.xsa;

/* compiled from: NspkSearchBanksFeatureComponentImpl.kt */
/* loaded from: classes.dex */
public final class NspkSearchBanksFeatureComponentImpl implements NspkSearchBanksFeatureComponent {
    public static final /* synthetic */ qcy<Object>[] e = {new PropertyReference1Impl(NspkSearchBanksFeatureComponentImpl.class, "appsProvider", "getAppsProvider()Lcom/vk/nspk/search/SbpAppsProvider;", 0), fp.c(0, NspkSearchBanksFeatureComponentImpl.class, "appsListUpdater", "getAppsListUpdater()Lcom/vk/nspk/search/SbpAppsListUpdater;", fpf0.a)};
    public final Context a;
    public final NspkSearchBanksFeatureInnerComponent b;
    public final nwy c = new nwy(new bg6(this, 8));
    public final nwy d = new nwy(new xsa(this, 5));

    /* compiled from: NspkSearchBanksFeatureComponentImpl.kt */
    public static final class a implements c8m<NspkSearchBanksFeatureComponent, pwj0> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new NspkSearchBanksFeatureComponentImpl(this.a, (NspkSearchBanksFeatureInnerComponent) g8mVar.a(fpf0.a(NspkSearchBanksFeatureInnerComponent.class)));
        }
    }

    public NspkSearchBanksFeatureComponentImpl(Context context, NspkSearchBanksFeatureInnerComponent nspkSearchBanksFeatureInnerComponent) {
        this.a = context;
        this.b = nspkSearchBanksFeatureInnerComponent;
    }

    @Override // com.vk.nspk.search.NspkSearchBanksFeatureComponent
    public final t2h0 mf() {
        qcy<Object> qcyVar = e[1];
        return (t2h0) this.d.c();
    }

    @Override // com.vk.nspk.search.NspkSearchBanksFeatureComponent
    public final v2h0 ya() {
        qcy<Object> qcyVar = e[0];
        return (v2h0) this.c.c();
    }
}
