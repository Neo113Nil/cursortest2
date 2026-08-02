package com.vk.im.engine.di.experiments;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.di.ImExperimentsComponent;
import com.vk.im.engine.models.c;
import xsna.a1w;
import xsna.c8m;
import xsna.g8m;
import xsna.pwj0;
import xsna.q1w;

/* compiled from: ImExperimentsComponentImpl.kt */
/* loaded from: classes.dex */
public final class ImExperimentsComponentImpl implements ImExperimentsComponent {

    /* compiled from: ImExperimentsComponentImpl.kt */
    public static final class a implements c8m<ImExperimentsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImExperimentsComponentImpl();
        }
    }

    @Override // com.vk.im.engine.di.ImExperimentsComponent
    public final c getExperiments() {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        return a1wVar.r().h;
    }
}
