package com.vk.clips.clipchecker.impl.di;

import com.vk.clips.clipchecker.api.di.ClipCheckerComponent;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.oo;
import xsna.pwj0;
import xsna.qcy;
import xsna.xmc;

/* compiled from: ClipCheckerComponentImpl.kt */
/* loaded from: classes16.dex */
public final class ClipCheckerComponentImpl implements ClipCheckerComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final ClipsConfigViewersComponent a;
    public final nwy b = new nwy(new oo(this, 15));

    /* compiled from: ClipCheckerComponentImpl.kt */
    public static final class a implements c8m<ClipCheckerComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipCheckerComponentImpl((ClipsConfigViewersComponent) g8mVar.a(fpf0.a(ClipsConfigViewersComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipCheckerComponentImpl.class, "clipChecker", "getClipChecker()Lcom/vk/clips/clipchecker/api/ClipChecker;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public ClipCheckerComponentImpl(ClipsConfigViewersComponent clipsConfigViewersComponent) {
        this.a = clipsConfigViewersComponent;
    }

    @Override // com.vk.clips.clipchecker.api.di.ClipCheckerComponent
    public final xmc B9() {
        qcy<Object> qcyVar = c[0];
        return (xmc) this.b.c();
    }
}
