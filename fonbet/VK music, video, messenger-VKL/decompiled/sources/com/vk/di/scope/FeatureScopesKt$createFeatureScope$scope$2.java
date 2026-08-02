package com.vk.di.scope;

import com.vk.di.component.DiScopedComponent;
import xsna.c8m;
import xsna.f8m;
import xsna.g8m;
import xsna.maj;
import xsna.oi6;
import xsna.pwj0;
import xsna.rfc;
import xsna.uaj0;
import xsna.wzs;
import xsna.x7m;

/* compiled from: FeatureScopes.kt */
/* loaded from: classes18.dex */
public final class FeatureScopesKt$createFeatureScope$scope$2 extends FeatureScope<Object, Object, Object> {
    public final x7m<Object, ?> b;
    public final /* synthetic */ rfc c;
    public final /* synthetic */ wzs<f8m<Object>, Object, Object> d;

    /* compiled from: FeatureScopes.kt */
    public static final class a implements c8m<Object, Object> {
        public final /* synthetic */ wzs<f8m<Object>, Object, Object> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(wzs<? super f8m<Object>, Object, Object> wzsVar) {
            this.a = wzsVar;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return (DiScopedComponent) this.a.invoke(g8mVar, (uaj0) pwj0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureScopesKt$createFeatureScope$scope$2(x7m x7mVar, uaj0 uaj0Var, rfc rfcVar, wzs wzsVar) {
        super(uaj0Var);
        this.c = rfcVar;
        this.d = wzsVar;
        this.b = x7mVar;
    }

    @Override // xsna.x7m
    public final x7m<Object, ?> b() {
        return this.b;
    }

    @Override // xsna.x7m
    public final void c(oi6 oi6Var) {
        oi6Var.e(this.c, new maj(this.d, 12));
    }
}
