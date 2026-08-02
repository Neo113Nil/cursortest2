package com.vk.coowners.di;

import com.vk.di.component.DiScopedComponent;
import xsna.bpn0;
import xsna.c8m;
import xsna.g8m;
import xsna.pwj0;
import xsna.qe60;
import xsna.uv0;

/* compiled from: NewsfeedCoownersComponentImpl.kt */
/* loaded from: classes17.dex */
public final class NewsfeedCoownersComponentImpl implements NewsfeedCoownersComponent {
    public final bpn0 a = new bpn0(new uv0(24));

    /* compiled from: NewsfeedCoownersComponentImpl.kt */
    public static final class a implements c8m<NewsfeedCoownersComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new NewsfeedCoownersComponentImpl();
        }
    }

    @Override // com.vk.coowners.di.NewsfeedCoownersComponent
    public final qe60 a() {
        return (qe60) this.a.getValue();
    }
}
