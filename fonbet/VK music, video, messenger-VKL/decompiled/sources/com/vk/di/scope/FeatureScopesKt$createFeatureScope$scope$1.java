package com.vk.di.scope;

import com.vk.di.component.DiScopedWithParamsComponent;
import xsna.f8m;
import xsna.fgm;
import xsna.g8m;
import xsna.l9i;
import xsna.o8m;
import xsna.oi6;
import xsna.pwj0;
import xsna.rfc;
import xsna.uaj0;
import xsna.x7m;
import xsna.yzs;

/* compiled from: FeatureScopes.kt */
/* loaded from: classes18.dex */
public final class FeatureScopesKt$createFeatureScope$scope$1 extends FeatureScope<Object, Object, Object> {
    public final x7m<Object, ?> b;
    public final /* synthetic */ rfc c;
    public final /* synthetic */ yzs<f8m<Object>, Object, Object, Object> d;

    /* compiled from: FeatureScopes.kt */
    public static final class a implements o8m<Object, Object, Object> {
        public final /* synthetic */ yzs<f8m<Object>, Object, Object, Object> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(yzs<? super f8m<Object>, Object, Object, Object> yzsVar) {
            this.a = yzsVar;
        }

        @Override // xsna.o8m
        public final DiScopedWithParamsComponent a(l9i l9iVar, g8m g8mVar, pwj0 pwj0Var) {
            return (DiScopedWithParamsComponent) this.a.invoke(g8mVar, (uaj0) pwj0Var, l9iVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureScopesKt$createFeatureScope$scope$1(x7m x7mVar, uaj0 uaj0Var, rfc rfcVar, yzs yzsVar) {
        super(uaj0Var);
        this.c = rfcVar;
        this.d = yzsVar;
        this.b = x7mVar;
    }

    @Override // xsna.x7m
    public final x7m<Object, ?> b() {
        return this.b;
    }

    @Override // xsna.x7m
    public final void c(oi6 oi6Var) {
        oi6Var.f(this.c, new fgm(this.d, 7));
    }
}
