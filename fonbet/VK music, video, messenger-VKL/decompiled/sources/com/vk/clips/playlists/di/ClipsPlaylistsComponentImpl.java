package com.vk.clips.playlists.di;

import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.movika.sdk.base.ui.t;
import com.vk.movika.sdk.base.ui.v;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.awe;
import xsna.b7m;
import xsna.cse;
import xsna.d14;
import xsna.due;
import xsna.e7m;
import xsna.ek;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.fqe;
import xsna.gqe;
import xsna.hpf0;
import xsna.kue;
import xsna.nwy;
import xsna.qcy;
import xsna.v6;
import xsna.vve;
import xsna.xs6;

/* compiled from: ClipsPlaylistsComponentImpl.kt */
/* loaded from: classes16.dex */
public final class ClipsPlaylistsComponentImpl implements ClipsPlaylistsComponent {
    public static final /* synthetic */ qcy<Object>[] h;
    public final ClipsViewerAdapterComponent a;
    public final nwy b = new nwy(new xs6(5));
    public final nwy c = new nwy(new d14(5));
    public final nwy d = new nwy(new t(this, 26));
    public final nwy e = new nwy(new v(9));
    public final nwy f = new nwy(new ek(7));
    public final nwy g = new nwy(new v6(this, 19));

    /* compiled from: ClipsPlaylistsComponentImpl.kt */
    public static final class a implements b7m<ClipsPlaylistsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ClipsPlaylistsComponentImpl((ClipsViewerAdapterComponent) e7mVar.a(fpf0.a(ClipsViewerAdapterComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsPlaylistsComponentImpl.class, "snackbarLauncher", "getSnackbarLauncher$impl_release()Lcom/vk/clips/playlists/ClipsPlaylistsSnackbarLauncher;", 0);
        hpf0 hpf0Var = fpf0.a;
        h = new qcy[]{propertyReference1Impl, fp.c(0, ClipsPlaylistsComponentImpl.class, "launcher", "getLauncher()Lcom/vk/clips/playlists/ClipsPlaylistsLauncher;", hpf0Var), ep.a(0, ClipsPlaylistsComponentImpl.class, "viewsProvider", "getViewsProvider()Lcom/vk/clips/playlists/ClipsPlaylistsViewsProvider;", hpf0Var), ep.a(0, ClipsPlaylistsComponentImpl.class, "eventSources", "getEventSources$impl_release()Lcom/vk/clips/playlists/ClipsPlaylistsEventsSource;", hpf0Var), ep.a(0, ClipsPlaylistsComponentImpl.class, "repository", "getRepository$impl_release()Lcom/vk/clips/playlists/data/ClipsPlaylistsRepository;", hpf0Var), ep.a(0, ClipsPlaylistsComponentImpl.class, "interactor", "getInteractor()Lcom/vk/clips/playlists/ClipsPlaylistsInteractor;", hpf0Var)};
    }

    public ClipsPlaylistsComponentImpl(ClipsViewerAdapterComponent clipsViewerAdapterComponent) {
        this.a = clipsViewerAdapterComponent;
    }

    public final cse Df() {
        qcy<Object> qcyVar = h[3];
        return (cse) this.e.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kue Ef() {
        qcy<Object> qcyVar = h[4];
        return (kue) this.f.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vve Ff() {
        qcy<Object> qcyVar = h[0];
        return (vve) this.b.c();
    }

    @Override // com.vk.clips.playlists.di.ClipsPlaylistsComponent
    public final fqe N9() {
        return new gqe();
    }

    @Override // com.vk.clips.playlists.di.ClipsPlaylistsComponent
    public final awe S0() {
        qcy<Object> qcyVar = h[2];
        return (awe) this.d.c();
    }

    @Override // com.vk.clips.playlists.di.ClipsPlaylistsComponent
    public final due b() {
        qcy<Object> qcyVar = h[5];
        return (due) this.g.c();
    }

    @Override // com.vk.clips.playlists.di.ClipsPlaylistsComponent
    public final com.vk.clips.playlists.a e() {
        qcy<Object> qcyVar = h[1];
        return (com.vk.clips.playlists.a) this.c.c();
    }
}
