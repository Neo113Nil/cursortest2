package com.vk.clips.sdk.stats.pixels.impl.di;

import com.vk.clips.sdk.stats.pixels.api.di.AdStatPixelsComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.movika.sdk.base.logic.interactor.g;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ak80;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.ki0;
import xsna.lt0;
import xsna.mi0;
import xsna.ni0;
import xsna.nwy;
import xsna.oi0;
import xsna.pwj0;
import xsna.qcy;
import xsna.ti0;
import xsna.wi0;
import xsna.zi0;

/* compiled from: AdStatPixelsComponentImpl.kt */
/* loaded from: classes17.dex */
public final class AdStatPixelsComponentImpl implements AdStatPixelsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a;

    /* compiled from: AdStatPixelsComponentImpl.kt */
    public static final class a implements c8m<AdStatPixelsComponent, pwj0> {
        public final g a;
        public final lt0 b;

        public a(g gVar, lt0 lt0Var) {
            this.a = gVar;
            this.b = lt0Var;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new AdStatPixelsComponentImpl(this.a, (oi0) this.b.invoke(g8mVar));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AdStatPixelsComponentImpl.class, "executor", "getExecutor()Lcom/vk/clips/sdk/stats/pixels/impl/executor/AdStatPixelsExecutor;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public AdStatPixelsComponentImpl(g gVar, oi0 oi0Var) {
        this.a = new nwy(new ni0(0, oi0Var, gVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.clips.sdk.stats.pixels.api.di.AdStatPixelsComponent
    public final ak80 A3(zi0 zi0Var) {
        qcy<Object> qcyVar = b[0];
        return new wi0((ti0) this.a.c(), zi0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.clips.sdk.stats.pixels.api.di.AdStatPixelsComponent
    public final ki0 R1() {
        qcy<Object> qcyVar = b[0];
        return new mi0((ti0) this.a.c());
    }
}
