package com.vk.im.engine.di.experiments;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.di.ImExperimentsScopedComponent;
import com.vk.im.engine.models.c;
import xsna.acw;
import xsna.c8m;
import xsna.g8m;
import xsna.pwj0;
import xsna.sdy;

/* compiled from: ImExperimentsScopedComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImExperimentsScopedComponentImpl implements ImExperimentsScopedComponent, DiScopedComponent<acw> {
    public final acw a;

    /* compiled from: ImExperimentsScopedComponentImpl.kt */
    public static final class a implements c8m<ImExperimentsScopedComponent, acw> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImExperimentsScopedComponentImpl((acw) pwj0Var);
        }
    }

    public ImExperimentsScopedComponentImpl(acw acwVar) {
        this.a = acwVar;
    }

    @Override // com.vk.im.engine.di.ImExperimentsScopedComponent
    public final c getExperiments() {
        return sdy.n(this.a).r().h;
    }
}
