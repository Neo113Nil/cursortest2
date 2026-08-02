package com.vk.biometrics.lock.impl.di;

import android.content.Context;
import com.ironsource.X3;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.biometrics.lock.impl.di.BiometricsLockComponentImpl;
import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b87;
import xsna.c8m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gzs;
import xsna.hpf0;
import xsna.mb3;
import xsna.nwy;
import xsna.ox4;
import xsna.p97;
import xsna.pwj0;
import xsna.qcy;
import xsna.v57;

/* compiled from: BiometricsLockComponentImpl.kt */
/* loaded from: classes.dex */
public final class BiometricsLockComponentImpl implements BiometricsLockComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy a = new nwy(new mb3(1));
    public final nwy b = new nwy(new ox4(1));
    public final nwy c;

    /* compiled from: BiometricsLockComponentImpl.kt */
    public static final class a implements c8m<BiometricsLockComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new BiometricsLockComponentImpl((AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(BiometricsLockComponentImpl.class, "router", "getRouter()Lcom/vk/biometrics/lock/api/domain/interactor/BiometricsLockRouter;", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, BiometricsLockComponentImpl.class, X3.a.k, "getStorage()Lcom/vk/biometrics/lock/api/data/sharedpref/BiometricsLockStorage;", hpf0Var), ep.a(0, BiometricsLockComponentImpl.class, "interactor", "getInteractor()Lcom/vk/biometrics/lock/api/domain/interactor/BiometricsLockInteractor;", hpf0Var)};
    }

    public BiometricsLockComponentImpl(final AppContextDiComponent appContextDiComponent) {
        this.c = new nwy(new gzs() { // from class: xsna.u57
            @Override // xsna.gzs
            public final Object invoke() {
                qcy<Object>[] qcyVarArr = BiometricsLockComponentImpl.d;
                Context context = AppContextDiComponent.this.a;
                BiometricsLockComponentImpl biometricsLockComponentImpl = this;
                return new k67(context, biometricsLockComponentImpl.a(), biometricsLockComponentImpl.H());
            }
        });
    }

    @Override // com.vk.biometrics.lock.api.di.BiometricsLockComponent
    public final p97 H() {
        qcy<Object> qcyVar = d[1];
        return (p97) this.b.c();
    }

    @Override // com.vk.biometrics.lock.api.di.BiometricsLockComponent
    public final b87 a() {
        qcy<Object> qcyVar = d[0];
        return (b87) this.a.c();
    }

    @Override // com.vk.biometrics.lock.api.di.BiometricsLockComponent
    public final v57 b() {
        qcy<Object> qcyVar = d[2];
        return (v57) this.c.c();
    }
}
