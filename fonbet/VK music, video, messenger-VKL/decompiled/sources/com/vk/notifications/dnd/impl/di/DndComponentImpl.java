package com.vk.notifications.dnd.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.notifications.dnd.api.di.DndComponent;
import xsna.bpn0;
import xsna.c8m;
import xsna.dv2;
import xsna.g8m;
import xsna.msn;
import xsna.pwj0;

/* compiled from: DndComponentImpl.kt */
/* loaded from: classes4.dex */
public final class DndComponentImpl implements DndComponent {
    public final bpn0 a = new bpn0(new dv2(13));

    /* compiled from: DndComponentImpl.kt */
    public static final class a implements c8m<DndComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new DndComponentImpl();
        }
    }

    @Override // com.vk.notifications.dnd.api.di.DndComponent
    public final msn Ta() {
        return (msn) this.a.getValue();
    }
}
