package com.vk.common.links.spans.impl;

import com.vk.common.links.spans.api.di.LinksSpansComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.Lazy;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.aik0;
import xsna.bpn0;
import xsna.btq;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.pxv;
import xsna.qcy;

/* compiled from: LinksSpansComponentImpl.kt */
/* loaded from: classes.dex */
public final class LinksSpansComponentImpl implements LinksSpansComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a;

    /* compiled from: LinksSpansComponentImpl.kt */
    public static final class a implements c8m<LinksSpansComponent, pwj0> {
        public final Lazy<btq> a;

        public a(bpn0 bpn0Var) {
            this.a = bpn0Var;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new LinksSpansComponentImpl(this.a);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(LinksSpansComponentImpl.class, "spanMenuLauncher", "getSpanMenuLauncher()Lcom/vk/common/links/spans/api/SpanMenuLauncher;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public LinksSpansComponentImpl() {
        throw null;
    }

    public LinksSpansComponentImpl(Lazy lazy) {
        this.a = new nwy(new pxv(lazy, 2));
    }

    @Override // com.vk.common.links.spans.api.di.LinksSpansComponent
    public final aik0 z5() {
        qcy<Object> qcyVar = b[0];
        return (aik0) this.a.c();
    }
}
