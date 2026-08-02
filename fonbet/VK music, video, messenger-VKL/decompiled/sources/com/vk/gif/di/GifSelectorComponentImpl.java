package com.vk.gif.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.syt;
import xsna.xis;

/* compiled from: GifSelectorComponentImpl.kt */
/* loaded from: classes2.dex */
public final class GifSelectorComponentImpl implements GifSelectorComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final AppContextDiComponent a;
    public final nwy b = new nwy(new xis(this, 3));

    /* compiled from: GifSelectorComponentImpl.kt */
    public static final class a implements c8m<GifSelectorComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new GifSelectorComponentImpl((AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(GifSelectorComponentImpl.class, "gifInteractor", "getGifInteractor()Lcom/vk/gif/domain/GifInteractor;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public GifSelectorComponentImpl(AppContextDiComponent appContextDiComponent) {
        this.a = appContextDiComponent;
    }

    @Override // com.vk.gif.di.GifSelectorComponent
    public final syt r9() {
        qcy<Object> qcyVar = c[0];
        return (syt) this.b.c();
    }
}
