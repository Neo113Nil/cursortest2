package com.vk.music.subscription.impl.bridge.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.subscriptions.js.bridge.api.di.MiniAppSubscriptionComponent;
import xsna.c8m;
import xsna.g8m;
import xsna.jq20;
import xsna.kq20;
import xsna.pwj0;

/* compiled from: MiniAppSubscriptionComponentImpl.kt */
/* loaded from: classes3.dex */
public final class MiniAppSubscriptionComponentImpl implements MiniAppSubscriptionComponent {

    /* compiled from: MiniAppSubscriptionComponentImpl.kt */
    public static final class a implements c8m<MiniAppSubscriptionComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MiniAppSubscriptionComponentImpl();
        }
    }

    @Override // com.vk.superapp.subscriptions.js.bridge.api.di.MiniAppSubscriptionComponent
    public final jq20 u2() {
        return new kq20();
    }
}
