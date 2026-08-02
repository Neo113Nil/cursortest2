package com.vk.popupmanager.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.popupmanager.api.di.PopupManagerComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.y56;
import xsna.ywb0;

/* compiled from: PopupManagerComponentImpl.kt */
/* loaded from: classes.dex */
public final class PopupManagerComponentImpl implements PopupManagerComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new y56(4));

    /* compiled from: PopupManagerComponentImpl.kt */
    public static final class a implements c8m<PopupManagerComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new PopupManagerComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PopupManagerComponentImpl.class, "popupManager", "getPopupManager()Lcom/vk/popupmanager/api/PopupManager;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.popupmanager.api.di.PopupManagerComponent
    public final ywb0 Dc() {
        qcy<Object> qcyVar = b[0];
        return (ywb0) this.a.c();
    }
}
