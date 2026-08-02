package com.vk.video.ui.discovery.minimizable.player.controllers;

import android.content.res.Configuration;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.video.ui.discovery.minimizable.announce.VideoAnnounceState;
import com.vk.video.ui.discovery.minimizable.j;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerState;
import com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController;
import com.vk.video.ui.discovery.minimizable.player.orientation.OrientationManagerImpl;
import defpackage.q0;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.ae8;
import xsna.bh10;
import xsna.bpn0;
import xsna.cty;
import xsna.dbs0;
import xsna.e3m;
import xsna.enj;
import xsna.epx;
import xsna.er20;
import xsna.fm20;
import xsna.fys;
import xsna.h5b0;
import xsna.hgs0;
import xsna.i8z;
import xsna.ibx;
import xsna.k6s0;
import xsna.k7z;
import xsna.kz20;
import xsna.lat0;
import xsna.m2j;
import xsna.m40;
import xsna.n7w;
import xsna.oq80;
import xsna.qbj;
import xsna.qoy;
import xsna.rcx;
import xsna.scx;
import xsna.tvj;
import xsna.xsw;
import xsna.yks0;
import xsna.zcl;
import xsna.zy80;

/* compiled from: MiniPlayerControllersWrapper.kt */
/* loaded from: classes7.dex */
public final class MiniPlayerControllersWrapper implements com.vk.video.ui.discovery.minimizable.player.controllers.a {
    public final ViewGroup b;
    public final ViewGroup c;
    public final er20 d;
    public final yks0.a e;
    public final j f;
    public final ae8 g;
    public final boolean h;
    public final oq80 i;
    public final VideoView.d j;
    public final VideoView.b k;
    public final boolean l;
    public zy80 m;
    public final boolean n;
    public fys o = fys.d.a;
    public VideoMinimizableState p = VideoMinimizableState.Hidden.b;
    public VideoInfo q;
    public Object r;
    public kz20 s;
    public yks0 t;
    public final FragmentActivity u;
    public final com.vk.video.ui.discovery.minimizable.player.a v;
    public boolean w;

    /* compiled from: MiniPlayerControllersWrapper.kt */
    public interface a {
        void a(String str, boolean z);

        void b(String str, boolean z);

        void c();

        void d(VideoPlayerState videoPlayerState);
    }

    /* compiled from: MiniPlayerControllersWrapper.kt */
    public interface b {

        /* compiled from: MiniPlayerControllersWrapper.kt */
        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -387008853;
            }

            public final String toString() {
                return "Interactive";
            }
        }

        /* compiled from: MiniPlayerControllersWrapper.kt */
        /* renamed from: com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper$b$b, reason: collision with other inner class name */
        public static final class C1995b implements b {
            public static final C1995b a = new C1995b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1995b);
            }

            public final int hashCode() {
                return -1293865540;
            }

            public final String toString() {
                return "Linear";
            }
        }

        /* compiled from: MiniPlayerControllersWrapper.kt */
        public static final class c implements b {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 2067925315;
            }

            public final String toString() {
                return "Live";
            }
        }
    }

    public MiniPlayerControllersWrapper(FragmentActivity fragmentActivity, ViewGroup viewGroup, ViewGroup viewGroup2, er20 er20Var, yks0.a aVar, j jVar, ae8 ae8Var, boolean z, oq80 oq80Var, VideoView.d dVar, VideoView.b bVar, boolean z2, OrientationManagerImpl orientationManagerImpl, boolean z3) {
        this.b = viewGroup;
        this.c = viewGroup2;
        this.d = er20Var;
        this.e = aVar;
        this.f = jVar;
        this.g = ae8Var;
        this.h = z;
        this.i = oq80Var;
        this.j = dVar;
        this.k = bVar;
        this.l = z2;
        this.m = orientationManagerImpl;
        this.n = z3;
        bpn0 bpn0Var = enj.a;
        this.u = (FragmentActivity) e3m.h(fragmentActivity);
        this.v = new com.vk.video.ui.discovery.minimizable.player.a(new com.vk.video.ui.discovery.minimizable.player.controllers.b(1, jVar, a.class, "onPlayerStateChanged", "onPlayerStateChanged(Lcom/vk/video/ui/discovery/minimizable/player/VideoPlayerState;)V", 0), er20Var.m.J().a());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void J2() {
        zy80 zy80Var = this.m;
        if (zy80Var != null) {
            zy80Var.a();
        }
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.J2();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void L2(lat0 lat0Var) {
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.L2(lat0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void L3(fys fysVar) {
        this.o = fysVar;
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.L3(fysVar);
        }
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final kz20 Lc() {
        return this.s;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void Q(VideoMinimizableState videoMinimizableState) {
        if (epx.f(this.p, videoMinimizableState)) {
            return;
        }
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.Q(videoMinimizableState);
        }
        this.p = videoMinimizableState;
        i();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void Q5(boolean z) {
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.Q5(z);
        }
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final yks0 W() {
        return this.t;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void Wf(boolean z) {
        zy80 zy80Var = this.m;
        if (zy80Var != null) {
            if (z) {
                zy80Var.d(false);
            } else {
                zy80Var.b(false);
            }
        }
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.Wf(z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void Y2() {
        zy80 zy80Var = this.m;
        if (zy80Var != null) {
            zy80Var.e();
        }
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.Y2();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.l6s0] */
    @Override // xsna.l6s0
    public final k6s0 Y4() {
        ?? r0 = this.r;
        if (r0 != 0) {
            return r0.Y4();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void Z0(PlayerRemoteController.Properties properties) {
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.Z0(properties);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.i2b0] */
    @Override // xsna.i2b0
    public final boolean a() {
        ?? r0 = this.r;
        if (r0 != 0) {
            return r0.a();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void a1() {
        zy80 zy80Var;
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.a1();
        }
        this.q = null;
        this.v.c(null);
        VideoPipStateHolder.a.getClass();
        if (!VideoPipStateHolder.d() && (zy80Var = this.m) != null) {
            zy80Var.reset();
        }
        i();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void a2(VideoAnnounceState videoAnnounceState) {
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.a2(videoAnnounceState);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.i2b0] */
    @Override // xsna.i2b0
    public final Boolean b() {
        ?? r0 = this.r;
        if (r0 != 0) {
            return r0.b();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void b1(VideoInfo videoInfo) {
        e(g(videoInfo.b));
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.b1(videoInfo);
        }
        ?? r02 = this.r;
        this.s = r02 != 0 ? r02.Lc() : null;
        ?? r03 = this.r;
        this.t = r03 != 0 ? r03.W() : null;
        this.q = videoInfo;
        i();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void ba(com.vk.video.ui.discovery.minimizable.b bVar) {
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.ba(bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ebs0] */
    @Override // xsna.ebs0
    public final void bk(dbs0 dbs0Var) {
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.bk(dbs0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void c() {
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.c();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void c1() {
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.c1();
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void d1(VideoInfo videoInfo) {
        VideoFile videoFile;
        VideoInfo videoInfo2 = this.q;
        b g = (videoInfo2 == null || (videoFile = videoInfo2.b) == null) ? null : g(videoFile);
        b g2 = g(videoInfo.b);
        if (epx.f(g, g2)) {
            ?? r0 = this.r;
            if (r0 != 0) {
                r0.d1(videoInfo);
            }
        } else {
            ?? r02 = this.r;
            if (r02 != 0) {
                r02.onPause();
            }
            e(g2);
            ?? r03 = this.r;
            if (r03 != 0) {
                r03.b1(videoInfo);
            }
        }
        ?? r04 = this.r;
        this.s = r04 != 0 ? r04.Lc() : null;
        ?? r05 = this.r;
        this.t = r05 != 0 ? r05.W() : null;
        this.q = videoInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, xsna.ir20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(b bVar) {
        com.vk.video.ui.discovery.minimizable.player.controllers.a i8zVar;
        Object obj;
        ?? r1;
        ?? r2 = this.r;
        if (r2 != 0) {
            r2.t();
        }
        Object obj2 = null;
        this.r = null;
        boolean f = epx.f(bVar, b.C1995b.a);
        j jVar = this.f;
        er20 er20Var = this.d;
        if (f || epx.f(bVar, b.c.a)) {
            int i = 9;
            i8zVar = new i8z(this.u, this.b, er20Var, this.e, jVar, this.m, new i8z.a(new cty(this, i), new n7w(this, i), new xsw(this, i), new fm20(this, 1), new m40(this, 26)), this.n, bVar instanceof b.c);
        } else {
            if (!epx.f(bVar, b.a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i8zVar = new ibx(this.u, er20Var, this.e, jVar, new ibx.a(new m2j(this, 27), new qbj(this, 28), new tvj(this, 24), new k7z(this, 4)));
        }
        ViewGroup viewGroup = this.c;
        viewGroup.removeAllViews();
        viewGroup.addView(i8zVar.getPlayerView());
        i8zVar.d();
        i8zVar.onResume();
        this.r = i8zVar;
        if (i8zVar instanceof i8z) {
            if (this.h && !((i8z) i8zVar).i) {
                obj = h5b0.b.a;
                if (obj != null) {
                    this.g.invoke(obj);
                }
                r1 = this.r;
                if (r1 == 0) {
                    r1.Q(this.p);
                    return;
                }
                return;
            }
            View playerView = ((i8z) i8zVar).m.getPlayerView();
            hgs0 hgs0Var = playerView instanceof hgs0 ? (hgs0) playerView : null;
            if (hgs0Var != null) {
                hgs0Var.setVisibilityChangeListener(this.i);
                hgs0Var.setSubtitleShiftListener(this.j);
                hgs0Var.setActionLinkVisibilityListener(this.k);
                obj2 = new h5b0.c(hgs0Var);
            }
        } else {
            if (!(i8zVar instanceof ibx)) {
                return;
            }
            rcx e = ((ibx) i8zVar).e();
            scx scxVar = e instanceof scx ? (scx) e : null;
            if (scxVar != null) {
                obj2 = new h5b0.a(scxVar);
            }
        }
        obj = obj2;
        if (obj != null) {
        }
        r1 = this.r;
        if (r1 == 0) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final boolean e1() {
        ?? r0 = this.r;
        if (r0 != 0) {
            return r0.e1();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void f() {
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void f1() {
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.f1();
        }
    }

    public final b g(VideoFile videoFile) {
        return videoFile.W9() ? b.a.a : (videoFile.T1() && this.l) ? b.c.a : b.C1995b.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void g1(ArrayList arrayList) {
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.g1(arrayList);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final View getPlayerView() {
        ?? r0 = this.r;
        if (r0 != 0) {
            return r0.getPlayerView();
        }
        return null;
    }

    public final void h(VideoInfo videoInfo) {
        VideoInfo videoInfo2 = this.q;
        if (videoInfo == null) {
            a1();
            return;
        }
        PlayerRemoteController.Properties properties = videoInfo.g;
        if (videoInfo2 == null) {
            b1(videoInfo);
            return;
        }
        PlayerRemoteController.Properties properties2 = videoInfo2.g;
        VideoFile videoFile = videoInfo2.b;
        String str = videoInfo2.d;
        VideoFile videoFile2 = videoInfo.b;
        String str2 = videoInfo.d;
        String a2 = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.OFFLINE);
        boolean z = !epx.f(str2, str) && (epx.f(str2, a2) || epx.f(str, a2));
        if (videoFile.o0() != videoFile2.o0() || !epx.f(videoFile.I0(), videoFile2.I0()) || z || videoInfo.h != -1) {
            d1(videoInfo);
            return;
        }
        if (!videoInfo2.f || videoInfo.f) {
            if (epx.f(properties2, properties)) {
                return;
            }
            Z0(properties);
        } else {
            this.q = videoInfo;
            if (!epx.f(properties2, properties)) {
                Z0(properties);
            }
            f();
        }
    }

    public final void i() {
        if (this.w && e1() && !(this.p instanceof VideoMinimizableState.Hidden)) {
            zy80 zy80Var = this.m;
            if (zy80Var != null) {
                zy80Var.enable();
                return;
            }
            return;
        }
        zy80 zy80Var2 = this.m;
        if (zy80Var2 != null) {
            zy80Var2.disable();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void onConfigurationChanged(Configuration configuration) {
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void onPause() {
        this.w = false;
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.onPause();
        }
        i();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void onResume() {
        this.w = true;
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.onResume();
        }
        i();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void seekTo(long j) {
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.seekTo(j);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void t() {
        zy80 zy80Var;
        VideoPipStateHolder.a.getClass();
        if (!VideoPipStateHolder.d() && (zy80Var = this.m) != null) {
            zy80Var.reset();
        }
        zy80 zy80Var2 = this.m;
        if (zy80Var2 != null) {
            zy80Var2.disable();
        }
        this.m = null;
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.t();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.video.ui.discovery.minimizable.player.controllers.a, java.lang.Object] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void vm() {
        ?? r0 = this.r;
        if (r0 != 0) {
            r0.vm();
        }
    }

    /* compiled from: MiniPlayerControllersWrapper.kt */
    public static final class VideoInfo implements Parcelable {
        public static final Parcelable.Creator<VideoInfo> CREATOR = new a();
        public final VideoFile b;
        public final String c;
        public final String d;
        public final SearchStatsLoggingInfo e;
        public final boolean f;
        public final PlayerRemoteController.Properties g;
        public final long h;
        public final boolean i;

        /* compiled from: MiniPlayerControllersWrapper.kt */
        public static final class a implements Parcelable.Creator<VideoInfo> {
            @Override // android.os.Parcelable.Creator
            public final VideoInfo createFromParcel(Parcel parcel) {
                VideoFile videoFile = (VideoFile) parcel.readParcelable(VideoInfo.class.getClassLoader());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) parcel.readParcelable(VideoInfo.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                PlayerRemoteController.Properties createFromParcel = PlayerRemoteController.Properties.CREATOR.createFromParcel(parcel);
                boolean z2 = false;
                long readLong = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new VideoInfo(videoFile, readString, readString2, searchStatsLoggingInfo, z, createFromParcel, readLong, z2);
            }

            @Override // android.os.Parcelable.Creator
            public final VideoInfo[] newArray(int i) {
                return new VideoInfo[i];
            }
        }

        public VideoInfo(VideoFile videoFile, String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo, boolean z, PlayerRemoteController.Properties properties, long j, boolean z2) {
            this.b = videoFile;
            this.c = str;
            this.d = str2;
            this.e = searchStatsLoggingInfo;
            this.f = z;
            this.g = properties;
            this.h = j;
            this.i = z2;
        }

        public static VideoInfo a(VideoInfo videoInfo, VideoFile videoFile, String str, PlayerRemoteController.Properties properties, int i) {
            if ((i & 1) != 0) {
                videoFile = videoInfo.b;
            }
            VideoFile videoFile2 = videoFile;
            if ((i & 2) != 0) {
                str = videoInfo.c;
            }
            String str2 = str;
            String str3 = videoInfo.d;
            SearchStatsLoggingInfo searchStatsLoggingInfo = videoInfo.e;
            boolean z = (i & 16) != 0 ? videoInfo.f : false;
            if ((i & 32) != 0) {
                properties = videoInfo.g;
            }
            PlayerRemoteController.Properties properties2 = properties;
            long j = (i & 64) != 0 ? videoInfo.h : -1L;
            boolean z2 = videoInfo.i;
            videoInfo.getClass();
            return new VideoInfo(videoFile2, str2, str3, searchStatsLoggingInfo, z, properties2, j, z2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoInfo)) {
                return false;
            }
            VideoInfo videoInfo = (VideoInfo) obj;
            return epx.f(this.b, videoInfo.b) && epx.f(this.c, videoInfo.c) && epx.f(this.d, videoInfo.d) && epx.f(this.e, videoInfo.e) && this.f == videoInfo.f && epx.f(this.g, videoInfo.g) && this.h == videoInfo.h && this.i == videoInfo.i;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SearchStatsLoggingInfo searchStatsLoggingInfo = this.e;
            return Boolean.hashCode(this.i) + bh10.a((this.g.hashCode() + qoy.b((hashCode3 + (searchStatsLoggingInfo != null ? searchStatsLoggingInfo.hashCode() : 0)) * 31, 31, this.f)) * 31, 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoInfo(video=");
            sb.append(this.b);
            sb.append(", trackCode=");
            sb.append(this.c);
            sb.append(", ref=");
            sb.append(this.d);
            sb.append(", searchStatsLoggingInfo=");
            sb.append(this.e);
            sb.append(", fromColdStart=");
            sb.append(this.f);
            sb.append(", playerProperties=");
            sb.append(this.g);
            sb.append(", videoStartPositionSeconds=");
            sb.append(this.h);
            sb.append(", shouldReplay=");
            return q0.a(sb, this.i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i);
            parcel.writeInt(this.f ? 1 : 0);
            this.g.writeToParcel(parcel, i);
            parcel.writeLong(this.h);
            parcel.writeInt(this.i ? 1 : 0);
        }

        public /* synthetic */ VideoInfo(VideoFile videoFile, String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo, boolean z, PlayerRemoteController.Properties properties, long j, boolean z2, int i, zcl zclVar) {
            this(videoFile, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : searchStatsLoggingInfo, (i & 16) != 0 ? false : z, (i & 32) != 0 ? new PlayerRemoteController.Properties(false, false, 3, null) : properties, (i & 64) != 0 ? -1L : j, (i & 128) != 0 ? false : z2);
        }
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void d() {
    }
}
