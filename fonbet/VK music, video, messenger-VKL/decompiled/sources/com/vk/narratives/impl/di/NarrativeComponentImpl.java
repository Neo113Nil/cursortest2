package com.vk.narratives.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.movika.sdk.base.model.props.c;
import com.vk.narratives.api.di.NarrativeComponent;
import xsna.bpn0;
import xsna.c8m;
import xsna.cy20;
import xsna.e550;
import xsna.f4;
import xsna.g8m;
import xsna.iu50;
import xsna.k6v;
import xsna.ou50;
import xsna.pwj0;
import xsna.s6y;
import xsna.tu50;
import xsna.vu50;

/* compiled from: NarrativeComponentImpl.kt */
/* loaded from: classes3.dex */
public final class NarrativeComponentImpl implements NarrativeComponent {
    public final bpn0 a = new bpn0(new f4(25));
    public final bpn0 b = new bpn0(new c(23));
    public final bpn0 c = new bpn0(new cy20(2));
    public final bpn0 d = new bpn0(new e550(this, 1));
    public final bpn0 e = new bpn0(new s6y(this, 14));

    /* compiled from: NarrativeComponentImpl.kt */
    public static final class a implements c8m<NarrativeComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new NarrativeComponentImpl();
        }
    }

    @Override // com.vk.narratives.api.di.NarrativeComponent
    public final vu50 Ic() {
        return (vu50) this.d.getValue();
    }

    @Override // com.vk.narratives.api.di.NarrativeComponent
    public final iu50 V7() {
        return (iu50) this.e.getValue();
    }

    @Override // com.vk.narratives.api.di.NarrativeComponent
    public final ou50 c6() {
        return (ou50) this.c.getValue();
    }

    @Override // com.vk.narratives.api.di.NarrativeComponent
    public final tu50 h3() {
        return (tu50) this.b.getValue();
    }

    @Override // com.vk.narratives.api.di.NarrativeComponent
    public final k6v n4() {
        return (k6v) this.a.getValue();
    }
}
