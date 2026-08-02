package com.vk.auth.smartflow.impl.mail;

import com.vk.auth.smartflow.mail.MailSmartflowComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.lz2;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: MailSmartflowComponentImpl.kt */
/* loaded from: classes15.dex */
public final class MailSmartflowComponentImpl implements MailSmartflowComponent {
    public static final /* synthetic */ qcy<Object>[] a;

    /* compiled from: MailSmartflowComponentImpl.kt */
    public static final class a implements c8m<MailSmartflowComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MailSmartflowComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MailSmartflowComponentImpl.class, "router", "getRouter()Lcom/vk/auth/smartflow/mail/MailSmartflowRouter;", 0);
        fpf0.a.getClass();
        a = new qcy[]{propertyReference1Impl};
    }

    public MailSmartflowComponentImpl() {
        new nwy(new lz2(15));
    }
}
