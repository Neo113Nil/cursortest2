package com.vk.im.ui.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.di.ImUiPreferencesComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nm0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.yzp0;

/* compiled from: ImUiPreferencesComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImUiPreferencesComponentImpl implements ImUiPreferencesComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new nm0(20));

    /* compiled from: ImUiPreferencesComponentImpl.kt */
    public static final class a implements c8m<ImUiPreferencesComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImUiPreferencesComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImUiPreferencesComponentImpl.class, "uiPrefs", "getUiPrefs()Lcom/vk/im/engine/config/UiPrefs;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.im.engine.di.ImUiPreferencesComponent
    public final yzp0 Z6() {
        qcy<Object> qcyVar = b[0];
        return (yzp0) this.a.c();
    }
}
