package com.vk.im.engine.di;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.acw;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.rkt;

/* compiled from: ImReportersScopedComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImReportersScopedComponentImpl implements DiScopedComponent<acw> {
    public static final /* synthetic */ qcy<Object>[] b;
    public final acw a;

    /* compiled from: ImReportersScopedComponentImpl.kt */
    public static final class a implements c8m<Object, acw> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImReportersScopedComponentImpl((acw) pwj0Var);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImReportersScopedComponentImpl.class, "reporters", "getReporters()Lcom/vk/im/reporters/api/ImReporters;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public ImReportersScopedComponentImpl(acw acwVar) {
        this.a = acwVar;
        new nwy(new rkt(this, 4));
    }
}
