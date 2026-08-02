package com.vk.local.storage.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.local.storage.js.bridge.api.di.LocalStorageComponent;
import xsna.c8m;
import xsna.g8m;
import xsna.pp20;
import xsna.pwj0;
import xsna.yp20;

/* compiled from: LocalStorageComponentImpl.kt */
/* loaded from: classes3.dex */
public final class LocalStorageComponentImpl implements LocalStorageComponent {

    /* compiled from: LocalStorageComponentImpl.kt */
    public static final class a implements c8m<LocalStorageComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new LocalStorageComponentImpl();
        }
    }

    @Override // com.vk.superapp.local.storage.js.bridge.api.di.LocalStorageComponent
    public final pp20 R6() {
        return yp20.b;
    }
}
