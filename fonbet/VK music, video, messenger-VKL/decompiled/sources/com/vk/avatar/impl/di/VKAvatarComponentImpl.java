package com.vk.avatar.impl.di;

import com.vk.avatar.api.di.VKAvatarComponent;
import com.vk.di.component.DiScopedComponent;
import xsna.bpn0;
import xsna.c8m;
import xsna.g8m;
import xsna.hn;
import xsna.ib3;
import xsna.pwj0;

/* compiled from: VKAvatarComponentImpl.kt */
/* loaded from: classes.dex */
public final class VKAvatarComponentImpl implements VKAvatarComponent {
    public final bpn0 a = new bpn0(new ib3(14));

    /* compiled from: VKAvatarComponentImpl.kt */
    public static final class a implements c8m<VKAvatarComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VKAvatarComponentImpl();
        }
    }

    @Override // com.vk.avatar.api.di.VKAvatarComponent
    public final hn nc() {
        return (hn) this.a.getValue();
    }
}
