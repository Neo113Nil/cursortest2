package com.vk.clips.config.viewers.impl.di;

import android.content.Context;
import com.ironsource.C4641xe;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.config.viewers.impl.di.ClipsConfigViewersComponentImpl;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bod;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.gzs;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.zof;

/* compiled from: ClipsConfigViewersComponentImpl.kt */
/* loaded from: classes.dex */
public final class ClipsConfigViewersComponentImpl implements ClipsConfigViewersComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a;

    /* compiled from: ClipsConfigViewersComponentImpl.kt */
    public static final class a implements c8m<ClipsConfigViewersComponent, pwj0> {
        public final Context a;
        public final bod b;

        public a(Context context) {
            bod bodVar = new bod(0);
            this.a = context;
            this.b = bodVar;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsConfigViewersComponentImpl(this.a, (AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)), this.b);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsConfigViewersComponentImpl.class, C4641xe.d, "getExperiments()Lcom/vk/clips/config/viewers/api/experiments/ClipsViewersExperiments;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public ClipsConfigViewersComponentImpl(final Context context, final AuthBridgeComponent authBridgeComponent, final bod bodVar) {
        this.a = new nwy(new gzs() { // from class: xsna.aod
            @Override // xsna.gzs
            public final Object invoke() {
                qcy<Object>[] qcyVarArr = ClipsConfigViewersComponentImpl.b;
                return new dpf(context, authBridgeComponent.s(), bodVar);
            }
        });
    }

    @Override // com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent
    public final zof getExperiments() {
        qcy<Object> qcyVar = b[0];
        return (zof) this.a.c();
    }
}
