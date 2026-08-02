package com.vk.design.inspector;

import com.vk.di.component.DiScopedComponent;
import xsna.bpn0;
import xsna.c8m;
import xsna.e5x;
import xsna.g8m;
import xsna.o6;
import xsna.pwj0;
import xsna.q5x;

/* compiled from: DesignInspectorComponentImpl.kt */
/* loaded from: classes18.dex */
public final class DesignInspectorComponentImpl implements DesignInspectorComponent {
    public final bpn0 a = new bpn0(new o6(13));

    /* compiled from: DesignInspectorComponentImpl.kt */
    public static final class a implements c8m<DesignInspectorComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new DesignInspectorComponentImpl();
        }
    }

    @Override // com.vk.design.inspector.DesignInspectorComponent
    public final e5x n() {
        return (q5x) this.a.getValue();
    }
}
