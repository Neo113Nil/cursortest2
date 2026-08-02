package com.vk.clips.coauthors.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hmd;
import xsna.hpf0;
import xsna.jmd;
import xsna.jnd;
import xsna.ng1;
import xsna.nwy;
import xsna.qcy;
import xsna.uw3;
import xsna.yc;

/* compiled from: ClipsCoauthorsComponentImpl.kt */
/* loaded from: classes16.dex */
public final class ClipsCoauthorsComponentImpl implements ClipsCoauthorsComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy a = new nwy(new uw3(9));
    public final nwy b;
    public final nwy c;

    /* compiled from: ClipsCoauthorsComponentImpl.kt */
    public static final class a implements b7m<ClipsCoauthorsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ClipsCoauthorsComponentImpl((ClipsCoauthorsInternalComponent) e7mVar.b(fpf0.a(ClipsCoauthorsInternalComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsCoauthorsComponentImpl.class, "launcher", "getLauncher()Lcom/vk/clips/coauthors/di/ClipsCoauthorsLauncher;", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, ClipsCoauthorsComponentImpl.class, "interactor", "getInteractor()Lcom/vk/clips/coauthors/di/ClipsCoauthorsInteractor;", hpf0Var), ep.a(0, ClipsCoauthorsComponentImpl.class, "uiProvider", "getUiProvider()Lcom/vk/clips/coauthors/di/ClipsCoauthorsUiProvider;", hpf0Var)};
    }

    public ClipsCoauthorsComponentImpl(ClipsCoauthorsInternalComponent clipsCoauthorsInternalComponent) {
        this.b = new nwy(new ng1(clipsCoauthorsInternalComponent, 19));
        this.c = new nwy(new yc(clipsCoauthorsInternalComponent, 22));
    }

    @Override // com.vk.clips.coauthors.di.ClipsCoauthorsComponent
    public final jnd Fc() {
        qcy<Object> qcyVar = d[2];
        return (jnd) this.c.c();
    }

    @Override // com.vk.clips.coauthors.di.ClipsCoauthorsComponent
    public final hmd b() {
        qcy<Object> qcyVar = d[1];
        return (hmd) this.b.c();
    }

    @Override // com.vk.clips.coauthors.di.ClipsCoauthorsComponent
    public final jmd e() {
        qcy<Object> qcyVar = d[0];
        return (jmd) this.a.c();
    }
}
