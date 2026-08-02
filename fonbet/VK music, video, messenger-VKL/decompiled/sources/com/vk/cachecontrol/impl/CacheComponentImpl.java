package com.vk.cachecontrol.impl;

import com.vk.cachecontrol.api.CacheComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.fw8;
import xsna.g8m;
import xsna.gx8;
import xsna.hpf0;
import xsna.ib8;
import xsna.lv8;
import xsna.nwy;
import xsna.ov8;
import xsna.pwj0;
import xsna.qcy;
import xsna.yp6;

/* compiled from: CacheComponentImpl.kt */
/* loaded from: classes.dex */
public final class CacheComponentImpl implements CacheComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy a = new nwy(new yp6(2));
    public final nwy b = new nwy(new ib8(this, 1));
    public final nwy c;

    /* compiled from: CacheComponentImpl.kt */
    public static final class a implements c8m<CacheComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new CacheComponentImpl((AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CacheComponentImpl.class, "cacheRegistry", "getCacheRegistry()Lcom/vk/cachecontrol/api/CacheRegistry;", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, CacheComponentImpl.class, "cacheAnalyzer", "getCacheAnalyzer()Lcom/vk/cachecontrol/api/CacheAnalyzer;", hpf0Var), ep.a(0, CacheComponentImpl.class, "cacheDisposer", "getCacheDisposer()Lcom/vk/cachecontrol/api/CacheDisposer;", hpf0Var)};
    }

    public CacheComponentImpl(AppContextDiComponent appContextDiComponent) {
        this.c = new nwy(new ov8(0, appContextDiComponent, this));
    }

    @Override // com.vk.cachecontrol.api.CacheComponent
    public final fw8 ic() {
        qcy<Object> qcyVar = d[2];
        return (fw8) this.c.c();
    }

    @Override // com.vk.cachecontrol.api.CacheComponent
    public final lv8 ve() {
        qcy<Object> qcyVar = d[1];
        return (lv8) this.b.c();
    }

    @Override // com.vk.cachecontrol.api.CacheComponent
    public final gx8 yc() {
        qcy<Object> qcyVar = d[0];
        return (gx8) this.a.c();
    }
}
