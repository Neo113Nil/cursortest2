package com.vk.libvideo.live.impl.views.live;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailability;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.live.LiveSpectators;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoOwner;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.autoplay.AutoPlayMinifiedState;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.autoplay.e;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import com.vk.libvideo.live.impl.views.live.ProgressErrorStateMashine;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.metrics.eventtracking.Event;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.c2;
import io.reactivex.rxjava3.internal.operators.observable.w2;
import io.reactivex.rxjava3.internal.operators.observable.z2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.player.error.OneVideoPlaybackException;
import xsna.a7q0;
import xsna.anz;
import xsna.asu0;
import xsna.aw5;
import xsna.awt0;
import xsna.ayr0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.byp;
import xsna.c30;
import xsna.c63;
import xsna.cuz;
import xsna.d3m;
import xsna.dlz;
import xsna.dvp;
import xsna.e1q;
import xsna.e43;
import xsna.e9i;
import xsna.ecm;
import xsna.el3;
import xsna.emz;
import xsna.enj;
import xsna.f2y0;
import xsna.fjs0;
import xsna.fkq0;
import xsna.flz;
import xsna.fsq;
import xsna.fxc0;
import xsna.g1j;
import xsna.g7q0;
import xsna.gjz;
import xsna.glz;
import xsna.gpt0;
import xsna.h30;
import xsna.h520;
import xsna.hoz;
import xsna.i000;
import xsna.iah0;
import xsna.je0;
import xsna.k4m;
import xsna.k4v;
import xsna.k520;
import xsna.k7y;
import xsna.kkp;
import xsna.l1i;
import xsna.l2y0;
import xsna.mbl;
import xsna.mk0;
import xsna.niz;
import xsna.nnz;
import xsna.np1;
import xsna.o25;
import xsna.o7y;
import xsna.o9;
import xsna.oap;
import xsna.oiz;
import xsna.oyr;
import xsna.piz;
import xsna.pmz;
import xsna.por0;
import xsna.ql2;
import xsna.qor0;
import xsna.qyk0;
import xsna.rj01;
import xsna.rkz;
import xsna.rnz;
import xsna.rpb;
import xsna.s3q0;
import xsna.sk0;
import xsna.skz;
import xsna.sy80;
import xsna.t4m;
import xsna.thu0;
import xsna.tkz;
import xsna.toc;
import xsna.uhu0;
import xsna.uur;
import xsna.v710;
import xsna.vkz;
import xsna.vq6;
import xsna.wcf0;
import xsna.wjk0;
import xsna.wjs0;
import xsna.wjz;
import xsna.wkp;
import xsna.wmf;
import xsna.wvv;
import xsna.xkz;
import xsna.xur;
import xsna.xwk;
import xsna.ye0;
import xsna.yg5;
import xsna.ykz;
import xsna.ymz;
import xsna.z8f;
import xsna.zet0;
import xsna.zjk0;
import xsna.zkz;

/* compiled from: LivePresenter.java */
/* loaded from: classes3.dex */
public final class b implements oiz {
    public c A;
    public c B;
    public c C;
    public zkz D;
    public xkz E;
    public c F;
    public LiveSpectators G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public String T;
    public niz U;
    public sy80 V;
    public final LiveStatNew W;
    public final v710 X;
    public VideoAdvertisementsRepository Y;

    @Nullable
    public nnz Z;

    @Nullable
    public emz a0;

    @Nullable
    public hoz b0;
    public Boolean c0;

    @Nullable
    public gjz d0;
    public pmz e0;
    public final piz f;
    public boolean f0;
    public final ProgressErrorStateMashine g;
    public long g0;
    public final e1q h;
    public boolean h0;
    public a i;
    public boolean i0;
    public a j;
    public boolean j0;
    public a k;
    public boolean k0;
    public boolean l;
    public dlz l0;
    public UserProfile m;
    public final boolean m0;
    public VideoOwner n;

    @Nullable
    public zet0 n0;
    public com.vk.libvideo.live.impl.views.chat.a o;

    @Nullable
    public com.vk.video.ui.share.api.b o0;
    public xur p;

    @Nullable
    public fjs0 p0;
    public l2y0 q;
    public boolean q0;
    public h30 r;
    public boolean r0;
    public zjk0 s;
    public boolean s0;
    public k520 t;
    public boolean t0;
    public wkp u;
    public final i000 u0;
    public qor0 v;
    public String v0;
    public sk0 w;
    public glz x;
    public t4m y;
    public c z;
    public final byp b = byp.b();
    public final anz c = fxc0.B().T();
    public final wjz d = wjz.a();
    public final ymz e = ymz.c();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LivePresenter.java */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a FINISHED;
        public static final a LIVE;
        public static final a NOT_INITED;
        public static final a RESTRICTED;
        public static final a UPCOMING;

        static {
            a aVar = new a("NOT_INITED", 0);
            NOT_INITED = aVar;
            a aVar2 = new a("RESTRICTED", 1);
            RESTRICTED = aVar2;
            a aVar3 = new a("LIVE", 2);
            LIVE = aVar3;
            a aVar4 = new a("UPCOMING", 3);
            UPCOMING = aVar4;
            a aVar5 = new a("FINISHED", 4);
            FINISHED = aVar5;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public b(piz pizVar) {
        a aVar = a.NOT_INITED;
        this.i = aVar;
        this.j = aVar;
        this.k = aVar;
        this.l = false;
        this.S = true;
        this.T = "";
        this.W = new LiveStatNew();
        this.X = new v710();
        this.f0 = true;
        this.g0 = 0L;
        this.h0 = false;
        this.i0 = false;
        this.j0 = false;
        this.k0 = false;
        this.l0 = null;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_UPCOMING_LIVE_NOTIFY;
        videoFeatures.getClass();
        this.m0 = com.vk.toggle.b.A.a(videoFeatures);
        this.q0 = false;
        this.r0 = true;
        this.s0 = false;
        this.t0 = false;
        this.u0 = new i000();
        this.v0 = null;
        this.f = pizVar;
        ProgressErrorStateMashine progressErrorStateMashine = new ProgressErrorStateMashine();
        ProgressErrorStateMashine.State state = ProgressErrorStateMashine.State.HIDE;
        progressErrorStateMashine.b = state;
        progressErrorStateMashine.c = state;
        progressErrorStateMashine.d = state;
        progressErrorStateMashine.e = state;
        progressErrorStateMashine.f = state;
        progressErrorStateMashine.g = state;
        progressErrorStateMashine.h = null;
        this.g = progressErrorStateMashine;
        progressErrorStateMashine.a = pizVar;
        e1q e1qVar = new e1q();
        ymz.c();
        e1qVar.a = new ArrayList();
        this.h = e1qVar;
    }

    public static void d(b bVar, LiveSpectators liveSpectators) {
        bVar.G = liveSpectators;
        zjk0 zjk0Var = bVar.s;
        if (zjk0Var != null) {
            zjk0Var.t(liveSpectators);
        }
        glz glzVar = bVar.x;
        if (glzVar != null) {
            glzVar.t();
        }
        VideoFile videoFile = bVar.n.f;
        if (videoFile != null) {
            videoFile.f8(liveSpectators.c);
        }
        a aVar = bVar.i;
        if (aVar == a.NOT_INITED || aVar == a.RESTRICTED) {
            return;
        }
        bVar.G2();
        bVar.y2();
        bVar.z2();
        bVar.A2();
        bVar.x2();
    }

    public final void A2() {
        yg5 yg5Var;
        AutoPlayMinifiedState R0;
        if (this.n.f != null) {
            boolean C2 = C2();
            nnz nnzVar = this.Z;
            if (nnzVar == null) {
                emz emzVar = this.a0;
                if (emzVar != null) {
                    if (!C2 || this.f0) {
                        emzVar.onPause();
                        return;
                    } else {
                        emzVar.p();
                        return;
                    }
                }
                return;
            }
            if (C2) {
                nnzVar.i();
                sy80 sy80Var = this.V;
                if (sy80Var != null) {
                    sy80Var.Be();
                    return;
                }
                return;
            }
            if (nnzVar.l) {
                return;
            }
            nnzVar.e = false;
            yg5 yg5Var2 = nnzVar.f;
            if ((yg5Var2 == null || (R0 = yg5Var2.R0()) == null || !R0.h()) && (yg5Var = nnzVar.f) != null) {
                yg5Var.pause();
            }
            nnzVar.f();
        }
    }

    @Override // xsna.oiz
    public final void B0() {
        yg5 yg5Var;
        yg5 yg5Var2;
        this.m = o25.a().o().b();
        I2();
        this.h.f = this.n;
        long j = this.g0;
        this.L = false;
        this.J = false;
        if (!F2()) {
            ProgressErrorStateMashine.State state = ProgressErrorStateMashine.State.SHOW;
            ProgressErrorStateMashine progressErrorStateMashine = this.g;
            progressErrorStateMashine.b = state;
            progressErrorStateMashine.d = ProgressErrorStateMashine.State.HIDE;
            progressErrorStateMashine.a();
            progressErrorStateMashine.b();
        }
        c cVar = this.A;
        if (cVar != null) {
            cVar.dispose();
            this.A = null;
        }
        VideoFile videoFile = this.n.f;
        String C1 = videoFile != null ? videoFile.C1() : null;
        VideoOwner videoOwner = this.n;
        this.A = new c2(this.c.E(videoOwner.d, videoOwner.e, C1, this.h0).A(j, TimeUnit.MILLISECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new tkz(new AtomicInteger(), 2)).K().subscribe(new com.vk.libvideo.live.impl.views.live.a(this), new vkz(this));
        VideoOwner videoOwner2 = this.n;
        if (videoOwner2.g != null || videoOwner2.h != null) {
            G2();
            y2();
        }
        nnz nnzVar = this.Z;
        piz pizVar = this.f;
        if (nnzVar == null) {
            pizVar.A4();
            return;
        }
        nnzVar.d = this.T;
        VideoFile videoFile2 = this.n.f;
        if (videoFile2 != null) {
            nnzVar.j(videoFile2);
            nnz nnzVar2 = this.Z;
            yg5 yg5Var3 = nnzVar2.f;
            if ((yg5Var3 == null || !yg5Var3.isReady()) && ((yg5Var = nnzVar2.f) == null || !yg5Var.P0())) {
                pizVar.Q2(false);
            } else {
                pizVar.A4();
            }
            if (this.S) {
                nnz nnzVar3 = this.Z;
                nnzVar3.e = false;
                VideoTextureView videoTextureView = nnzVar3.g;
                if (videoTextureView != null && (yg5Var2 = nnzVar3.f) != null) {
                    yg5Var2.z0(videoTextureView, nnzVar3.n, null);
                }
                yg5 yg5Var4 = nnzVar3.f;
                if (yg5Var4 != null) {
                    yg5Var4.G0(true);
                }
            }
        }
    }

    @Override // xsna.oiz
    public final void B1() {
        VideoAdvertisementsRepository videoAdvertisementsRepository = this.Y;
        if (videoAdvertisementsRepository != null) {
            videoAdvertisementsRepository.c(VideoAdvertisementsRepository.AdType.SPORT_ODDS);
        }
    }

    public final void B2() {
        VideoOwner videoOwner;
        VideoFile videoFile;
        if (this.f0 || this.L || !this.J || (videoOwner = this.n) == null || (videoFile = videoOwner.f) == null || !videoFile.z0() || gpt0.w(this.n.f)) {
            return;
        }
        c cVar = this.F;
        if (cVar != null) {
            cVar.dispose();
            this.F = null;
        }
        w2 B0 = q.B0(5000L, TimeUnit.MILLISECONDS);
        asu0 asu0Var = asu0.a;
        this.F = B0.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new rkz(this, 0));
    }

    @Override // xsna.oiz
    public final void C(Boolean bool) {
        this.s0 = bool.booleanValue();
    }

    @Override // xsna.oiz
    public final rnz C1() {
        return this.Z;
    }

    public final boolean C2() {
        return (this.f0 || !this.N || this.M || this.L || !v2() || this.i == a.FINISHED) ? false : true;
    }

    @Override // xsna.oiz
    public final void D1() {
        this.H = true;
    }

    public final boolean D2() {
        yg5 yg5Var;
        nnz nnzVar = this.Z;
        return (nnzVar == null || (yg5Var = nnzVar.f) == null || !yg5Var.P0()) ? false : true;
    }

    @Override // xsna.oiz
    public final void E() {
        if (this.n.f != null) {
            fxc0.B().d(this.n.f);
        }
    }

    @Override // xsna.oiz
    public final void E1() {
        VideoPipStateHolder.a.getClass();
        if (VideoPipStateHolder.d()) {
            return;
        }
        String str = this.k0 ? "" : "video_from_fullscreen_to_pip";
        boolean f = VideoPipStateHolder.f();
        piz pizVar = this.f;
        if (f) {
            VideoPipStateHolder.j(pizVar.getViewContext());
            return;
        }
        nnz nnzVar = this.Z;
        if (nnzVar != null) {
            VideoPipStateHolder.i(nnzVar.f);
        }
        fxc0.B().Y().k(pizVar.getViewContext(), this.n.f, str, null, null, null, false, null, null, null, false, true, true, false, -1L, null, null, false, null);
    }

    public final boolean E2() {
        VideoOwner videoOwner;
        VideoFile videoFile;
        yg5 yg5Var;
        if (a.LIVE != this.i || (videoOwner = this.n) == null || (videoFile = videoOwner.f) == null || !videoFile.X2()) {
            return false;
        }
        nnz nnzVar = this.Z;
        return ((nnzVar == null || (yg5Var = nnzVar.f) == null) ? 0L : yg5Var.getPosition()) < 0 && !this.l;
    }

    public final boolean F2() {
        return fxc0.B().c(this.n.f);
    }

    @Override // xsna.oiz
    public final void G1(niz nizVar) {
        this.U = nizVar;
    }

    public final void G2() {
        VideoFile videoFile;
        if (F2()) {
            a aVar = a.RESTRICTED;
            if (this.i != aVar) {
                this.i = aVar;
                return;
            }
            return;
        }
        VideoOwner videoOwner = this.n;
        if (videoOwner != null && (videoFile = videoOwner.f) != null && videoFile.z0()) {
            a aVar2 = this.i;
            a aVar3 = a.UPCOMING;
            if (aVar2 != aVar3 && aVar2 != a.NOT_INITED) {
                reset();
            }
            if (this.i != aVar3) {
                this.i = aVar3;
                return;
            }
            return;
        }
        if (v2()) {
            a aVar4 = this.i;
            a aVar5 = a.LIVE;
            if (aVar4 != aVar5 && aVar4 != a.NOT_INITED) {
                reset();
            }
            if (this.i != aVar5) {
                this.i = aVar5;
                return;
            }
            return;
        }
        a aVar6 = this.i;
        a aVar7 = a.FINISHED;
        if (aVar6 != aVar7 && aVar6 != a.NOT_INITED) {
            rj01 rj01Var = new rj01();
            VideoOwner videoOwner2 = this.n;
            rj01Var.b = videoOwner2 != null ? videoOwner2.f : null;
            this.b.c(rj01Var);
            cuz.a(e43.a).c(new Intent("CLOSE_VALIDATION_ACTION"));
            cuz.a(e43.a).c(new Intent("CLOSE_CONFIRMATION_ACTION"));
            reset();
            emz emzVar = this.a0;
            if (emzVar != null) {
                emzVar.a();
            }
            hoz hozVar = this.b0;
            if (hozVar != null) {
                ((wmf) hozVar.a).Me().Qo(false);
            }
        }
        if (this.i != aVar7) {
            this.i = aVar7;
        }
    }

    @Override // xsna.oiz
    public final void H(wmf wmfVar) {
        this.b0 = new hoz(wmfVar);
    }

    public final void H2() {
        e1q e1qVar = this.h;
        if (e1qVar != null) {
            ArrayList arrayList = e1qVar.a;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((io.reactivex.rxjava3.observers.a) it.next()).dispose();
            }
            arrayList.clear();
        }
        L2();
        if (this.E != null) {
            this.u0.a("HEARTBEAT dispose");
            this.E.dispose();
            this.E = null;
            VideoOwner videoOwner = this.n;
            if (videoOwner.f != null) {
                this.c.B(videoOwner.d, videoOwner.e).subscribe(new ykz());
            }
        }
    }

    public final void I2() {
        VideoFile videoFile = this.n.f;
        if (videoFile != null) {
            this.f.D1(videoFile.getImage().Eb() != null ? videoFile.getImage() : videoFile.e1().Eb(), fxc0.B().c(videoFile), videoFile.O() != null && videoFile.O().d);
        }
    }

    @Override // xsna.oiz
    public final void J0(boolean z) {
        this.R = z;
    }

    public final void J2() {
        toc tocVar;
        l2y0 l2y0Var = this.q;
        if (l2y0Var != null) {
            xur xurVar = this.p;
            if (xurVar != null) {
                l2y0Var.v = xurVar;
            }
            com.vk.libvideo.live.impl.views.chat.a aVar = this.o;
            if (aVar != null) {
                l2y0Var.w = aVar;
                aVar.W(l2y0Var);
            }
            VideoFile videoFile = this.n.f;
            if (videoFile != null && videoFile.m1() != null) {
                this.r.b(this.n.f.m1());
            }
        }
        hoz hozVar = this.b0;
        if (hozVar != null) {
            l2y0 l2y0Var2 = this.q;
            k520 k520Var = this.t;
            if (l2y0Var2 != null) {
                toc tocVar2 = (toc) hozVar.c;
                if (tocVar2 != null) {
                    tocVar2.i(new z8f(l2y0Var2, 25));
                }
                toc tocVar3 = (toc) hozVar.c;
                if (tocVar3 != null) {
                    tocVar3.m(new o9(29, l2y0Var2, hozVar));
                }
            }
            if (k520Var == null || (tocVar = (toc) hozVar.c) == null) {
                return;
            }
            tocVar.c(new g1j(k520Var, 20));
        }
    }

    @Override // xsna.oiz
    public final void K0() {
        this.j0 = true;
    }

    public final void K2(boolean z) {
        com.vk.libvideo.live.impl.views.chat.a aVar = this.o;
        boolean z2 = ((aVar == null || aVar.o) && this.f.isVisible()) ? false : true;
        if (this.D != null || z2) {
            return;
        }
        if (z && this.B == null) {
            VideoOwner videoOwner = this.n;
            this.B = new c2(this.c.T(videoOwner.d, videoOwner.e).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new tkz(new AtomicInteger(), Integer.MAX_VALUE)).K().subscribe(new skz(this, 0), new o7y(this, 1));
        }
        this.u0.a("startQueue");
        VideoOwner videoOwner2 = this.n;
        z2 b = this.d.b(videoOwner2.d, videoOwner2.e);
        zkz zkzVar = new zkz(this);
        b.subscribe(zkzVar);
        this.D = zkzVar;
    }

    @Override // xsna.oiz
    public final void L() {
        l2y0 l2y0Var = this.q;
        if (l2y0Var != null) {
            l2y0Var.u.setOpenStickersMarketWithoutNavigation(true);
        }
        this.t0 = true;
    }

    public final void L2() {
        if (this.D != null) {
            this.u0.a("stopQueue: dispose");
            this.D.dispose();
            this.D = null;
        }
    }

    @Override // xsna.oiz
    public final boolean M() {
        return this.H;
    }

    public final void M2() {
        if (this.Q || this.r0) {
            return;
        }
        this.r0 = true;
        this.q0 = false;
        LiveStatNew liveStatNew = this.W;
        if (liveStatNew != null) {
            Bundle bundle = new Bundle();
            bundle.putString("action_type", "player_close");
            liveStatNew.b(bundle);
            qyk0.a().e("live_action", bundle);
        }
    }

    public final void N2() {
        com.vk.libvideo.live.impl.views.chat.a aVar = this.o;
        if (aVar == null) {
            return;
        }
        rpb rpbVar = aVar.d;
        hoz hozVar = this.b0;
        if (hozVar != null) {
            boolean z = ((wmf) hozVar.a).Me().I1;
            oyr oyrVar = new oyr(this, 3);
            aVar.o = z;
            rpbVar.b1(z, false);
            aVar.p = oyrVar;
            return;
        }
        boolean z2 = aVar.o;
        ql2 ql2Var = new ql2(this, 22);
        aVar.o = z2;
        rpbVar.b1(z2, false);
        aVar.p = ql2Var;
    }

    @Override // xsna.oiz
    public final boolean P1() {
        return this.i0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(VideoFile videoFile) {
        boolean z = videoFile.c0() || !o25.a().b();
        rpb K = this.f.K();
        if (K != 0) {
            awt0.v((View) K, z);
            com.vk.libvideo.live.impl.views.chat.a aVar = new com.vk.libvideo.live.impl.views.chat.a(this.n, this.m, K, w());
            this.o = aVar;
            aVar.m = this.W;
            N2();
            K.setActionLinksPresenter(this.r);
            this.r.t.add((c30) K);
            K.setPresenter(this.o);
            this.o.start();
            this.h.b = this.o;
        }
    }

    @Override // xsna.oiz
    public final void Q0() {
        ProgressErrorStateMashine.State state = ProgressErrorStateMashine.State.SHOW;
        ProgressErrorStateMashine progressErrorStateMashine = this.g;
        progressErrorStateMashine.c = state;
        progressErrorStateMashine.a();
        progressErrorStateMashine.b();
    }

    @Override // xsna.oiz
    public final boolean R0() {
        return this.m0;
    }

    @Override // xsna.oiz
    public final void T1() {
        this.i0 = true;
    }

    @Override // xsna.oiz
    public final void V0(boolean z, boolean z2) {
        View actualView;
        gjz gjzVar = this.d0;
        if (gjzVar != null) {
            flz liveSeekView = gjzVar.getLiveSeekView();
            if (liveSeekView != null && (actualView = liveSeekView.getActualView()) != null) {
                if (!z2) {
                    bwt0.p0(actualView, z);
                    s3q0 s3q0Var = s3q0.a;
                } else if (z) {
                    d3m.c(actualView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    d3m.e(actualView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                }
            }
            gjzVar.b.f(!z);
        }
    }

    public final void W() {
        uur J = this.f.J();
        if (J != null) {
            xur xurVar = new xur(this.m, J);
            this.p = xurVar;
            J.setPresenter(xurVar);
            this.p.getClass();
            this.h.e = this.p;
        }
    }

    @Override // xsna.oiz
    public final void Y0() {
        this.S = false;
    }

    @Override // xsna.oiz
    public final void a() {
        yg5 yg5Var;
        nnz nnzVar = this.Z;
        if (nnzVar != null && (yg5Var = nnzVar.f) != null) {
            yg5Var.I();
        }
        reset();
        B0();
        start();
    }

    public final void a2(VideoFile videoFile) {
        h520 z1 = this.f.z1(this.K);
        if (z1 != null) {
            VideoOwner videoOwner = this.n;
            k520 k520Var = new k520(videoFile, videoOwner.g, videoOwner.h, this.m, z1);
            this.t = k520Var;
            k520Var.u = this.l0;
            k520Var.s = this.W;
            k520Var.t = this.U;
            k520Var.l = this.H;
            k520Var.m = this.b0 != null;
            k520Var.v = this.o0;
            z1.setPresenter(k520Var);
        }
    }

    @Override // xsna.oiz
    public final boolean c1() {
        return this.c0.booleanValue();
    }

    @Override // xsna.oiz
    public final void close() {
        B1();
        if (this.U != null) {
            M2();
            this.U.F();
        }
    }

    @Override // xsna.oiz
    public final void e1(VideoOwner videoOwner) {
        this.n = videoOwner;
        LiveStatNew.UserType userType = LiveStatNew.UserType.viewer;
        LiveStatNew liveStatNew = this.W;
        liveStatNew.a = userType;
        liveStatNew.b = videoOwner.c;
        VideoFile videoFile = videoOwner.f;
        liveStatNew.c = videoFile != null ? videoFile.r() : null;
    }

    @Override // xsna.oiz
    public final void e2() {
        this.h0 = true;
    }

    @Override // xsna.oiz
    public final void g(@NonNull com.vk.libvideo.api.ad.a aVar, @NonNull ye0.a aVar2) {
        this.f.g(aVar, aVar2);
    }

    @Override // xsna.oiz
    public final VideoOwner getModel() {
        return this.n;
    }

    @Override // xsna.oiz
    public final void h() {
        this.f.h();
    }

    @Override // xsna.oiz
    public final void h2(String str) {
        this.T = str;
        this.W.d = str;
    }

    @Override // xsna.oiz
    public final boolean i() {
        glz glzVar = this.x;
        return glzVar != null && glzVar.c.g();
    }

    @Override // xsna.oiz
    public final void i0(gjz gjzVar) {
        this.d0 = gjzVar;
    }

    @Override // xsna.oiz
    public final void i2() {
        this.m = o25.a().o().b();
        if (this.n.f != null) {
            I2();
            this.f.Q2(false);
        }
        G2();
        y2();
        this.O = true;
    }

    @Override // xsna.oiz
    public final boolean isActive() {
        return this.N;
    }

    @Override // xsna.oiz
    public final void j() {
        a();
        this.f.j();
    }

    @Override // xsna.oiz
    public final void j1() {
        I2();
    }

    @Override // xsna.oiz
    public final void j2() {
        glz glzVar = this.x;
        if (glzVar != null) {
            glzVar.t();
        }
    }

    @Override // xsna.oiz
    public final void m(@NonNull je0 je0Var, @NonNull com.vk.libvideo.api.ad.a aVar) {
        piz pizVar = this.f;
        pizVar.A4();
        pizVar.m(je0Var, aVar);
    }

    @Override // xsna.oiz
    public final void n(boolean z) {
        hoz hozVar = this.b0;
        if (hozVar != null) {
            ((wmf) hozVar.a).Me().Jo(z);
        }
        if (z || w()) {
            K2(true);
        } else {
            L2();
        }
    }

    @Override // xsna.oiz
    public final void n2(String str, OneVideoPlaybackException.ErrorCode errorCode) {
        if (w() && this.i != a.LIVE) {
            gpt0 gpt0Var = gpt0.a;
            switch (gpt0.a.$EnumSwitchMapping$1[errorCode.ordinal()]) {
            }
            return;
        }
        if (E2() && errorCode == OneVideoPlaybackException.ErrorCode.IO_BAD_HTTP_STATUS) {
            this.l = true;
            G2();
            y2();
            z2();
            A2();
            x2();
            return;
        }
        reset();
        ProgressErrorStateMashine.State state = ProgressErrorStateMashine.State.HIDE;
        ProgressErrorStateMashine progressErrorStateMashine = this.g;
        progressErrorStateMashine.c = state;
        progressErrorStateMashine.h = new dvp(str, this.f.getViewContext().getString(R.string.live_retry), new np1(this, 26), null, this.j0);
        progressErrorStateMashine.e = ProgressErrorStateMashine.State.SHOW;
        progressErrorStateMashine.a();
        progressErrorStateMashine.b();
        this.M = true;
    }

    @Override // xsna.oiz
    public final void onComplete() {
        if (E2()) {
            this.l = true;
            G2();
            y2();
            z2();
            A2();
            x2();
        }
    }

    @Override // xsna.oiz
    public final void onPause() {
        if (this.i == a.LIVE) {
            if (fxc0.B().J().D()) {
                H2();
            } else {
                x2();
            }
        }
    }

    @Override // xsna.oiz
    public final void p() {
        wjk0 wjk0Var;
        hoz hozVar = this.b0;
        if (hozVar != null && (wjk0Var = (wjk0) hozVar.d) != null) {
            wjk0Var.Y(e.b(), false);
        }
        if (this.i == a.LIVE) {
            x2();
        }
    }

    @Override // xsna.oiz
    public final boolean p2() {
        return this.K;
    }

    @Override // xsna.pk6
    public final void pause() {
        if (F2() || this.f0) {
            return;
        }
        this.f0 = true;
        H2();
        A2();
        c cVar = this.F;
        if (cVar != null) {
            cVar.dispose();
            this.F = null;
        }
        this.f.Q2(true);
        VideoFile videoFile = this.n.f;
    }

    @Override // xsna.oiz
    public final void r2(Boolean bool) {
        this.c0 = bool;
    }

    @Override // xsna.pk6
    public final void release() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator animate2;
        nnz nnzVar = this.Z;
        if (nnzVar != null) {
            if (this.P) {
                nnzVar.l();
                nnz nnzVar2 = this.Z;
                nnzVar2.l = true;
                nnzVar2.h.removeCallbacksAndMessages(null);
                VideoTextureView videoTextureView = nnzVar2.g;
                if (videoTextureView != null && (animate2 = videoTextureView.animate()) != null) {
                    animate2.cancel();
                }
                yg5 yg5Var = nnzVar2.f;
                if (yg5Var != null) {
                    yg5Var.T(nnzVar2.p);
                }
                c63 c63Var = c63.a;
                c63.c(nnzVar2.o);
                yg5 yg5Var2 = this.Z.f;
                if (yg5Var2 != null) {
                    yg5Var2.K0(false);
                }
            } else {
                nnzVar.l = true;
                nnzVar.h.removeCallbacksAndMessages(null);
                VideoTextureView videoTextureView2 = nnzVar.g;
                if (videoTextureView2 != null && (animate = videoTextureView2.animate()) != null) {
                    animate.cancel();
                }
                yg5 yg5Var3 = nnzVar.f;
                if (yg5Var3 != null) {
                    yg5Var3.T(nnzVar.p);
                }
                c63 c63Var2 = c63.a;
                c63.c(nnzVar.o);
            }
        }
        c cVar = this.F;
        if (cVar != null) {
            cVar.dispose();
            this.F = null;
        }
        c cVar2 = this.A;
        if (cVar2 != null) {
            cVar2.dispose();
            this.A = null;
        }
        c cVar3 = this.z;
        if (cVar3 != null) {
            cVar3.dispose();
            this.z = null;
        }
        hoz hozVar = this.b0;
        if (hozVar != null) {
            hozVar.d = null;
        }
        c cVar4 = this.B;
        if (cVar4 != null) {
            cVar4.dispose();
            this.B = null;
        }
        c cVar5 = this.C;
        if (cVar5 != null) {
            cVar5.dispose();
            this.C = null;
        }
        H2();
    }

    @Override // xsna.oiz
    public final void reset() {
        sy80 sy80Var = this.V;
        if (sy80Var != null) {
            sy80Var.Be();
        }
        this.f.x();
        this.o = null;
        this.p = null;
        this.q = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        hoz hozVar = this.b0;
        if (hozVar != null) {
            hozVar.c = null;
        }
        a aVar = a.NOT_INITED;
        if (this.i != aVar) {
            this.i = aVar;
        }
        this.j = aVar;
        this.k = aVar;
        this.l = false;
        H2();
        this.J = false;
        this.L = false;
        this.K = false;
        this.M = false;
        this.G = null;
        ProgressErrorStateMashine.State state = ProgressErrorStateMashine.State.HIDE;
        ProgressErrorStateMashine progressErrorStateMashine = this.g;
        progressErrorStateMashine.b = state;
        progressErrorStateMashine.c = state;
        progressErrorStateMashine.d = state;
        progressErrorStateMashine.e = state;
        c cVar = this.z;
        if (cVar != null) {
            cVar.dispose();
            this.z = null;
        }
        c cVar2 = this.A;
        if (cVar2 != null) {
            cVar2.dispose();
            this.A = null;
        }
        c cVar3 = this.B;
        if (cVar3 != null) {
            cVar3.dispose();
            this.B = null;
        }
        c cVar4 = this.C;
        if (cVar4 != null) {
            cVar4.dispose();
            this.C = null;
        }
    }

    @Override // xsna.pk6
    public final void resume() {
        wjk0 wjk0Var;
        if (F2() || !this.f0) {
            return;
        }
        this.f0 = false;
        this.I = true;
        B0();
        y2();
        hoz hozVar = this.b0;
        if (hozVar != null && (wjk0Var = (wjk0) hozVar.d) != null) {
            wjk0Var.Y(e.b(), false);
        }
        N2();
        VideoFile videoFile = this.n.f;
    }

    @Override // xsna.oiz
    public final void s2() {
        ProgressErrorStateMashine.State state = ProgressErrorStateMashine.State.HIDE;
        ProgressErrorStateMashine progressErrorStateMashine = this.g;
        progressErrorStateMashine.c = state;
        progressErrorStateMashine.a();
        progressErrorStateMashine.b();
    }

    @Override // xsna.oiz
    public final void setActive(boolean z) {
        this.N = z;
        if (!z) {
            M2();
            return;
        }
        if (this.Q || this.q0) {
            return;
        }
        this.q0 = true;
        this.r0 = false;
        LiveStatNew liveStatNew = this.W;
        if (liveStatNew != null) {
            Bundle bundle = new Bundle();
            bundle.putString("action_type", "player_show");
            liveStatNew.b(bundle);
            qyk0.a().e("live_action", bundle);
        }
    }

    @Override // xsna.pk6
    public final void start() {
        if (!this.Q) {
            this.f0 = false;
        }
        if (F2()) {
            return;
        }
        if (this.J) {
            z2();
            A2();
            B2();
        } else {
            this.I = true;
            A2();
        }
        x2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (xsna.ymz.b(r7) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        r0.setVisible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (xsna.ymz.a(r7) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(VideoFile videoFile) {
        if (this.H) {
            return;
        }
        mk0 R1 = this.f.R1(!w() && this.K);
        if (R1 != null) {
            VideoOwner videoOwner = this.n;
            sk0 sk0Var = new sk0(videoFile, videoOwner.g, videoOwner.h);
            this.w = sk0Var;
            sk0Var.j = this.l0;
            sk0Var.i = this.W;
            sk0Var.k = this.p0;
            sk0Var.R1(R1);
            R1.setPresenter(this.w);
            UserProfile userProfile = this.n.g;
            ymz ymzVar = this.e;
            if (userProfile != null) {
                ymzVar.getClass();
            }
            Group group = this.n.h;
            if (group != null) {
                ymzVar.getClass();
            }
            R1.setVisible(false);
        }
    }

    @Override // xsna.oiz
    public final void u0(boolean z) {
        this.K = z;
    }

    public final wjk0 u2(VideoFile videoFile) {
        wjk0 v = this.f.v(!w() && this.K);
        if (v != null) {
            VideoOwner videoOwner = this.n;
            zjk0 zjk0Var = new zjk0(videoFile, videoOwner.g, videoOwner.h, false, v, new ecm(this, 22));
            this.s = zjk0Var;
            zjk0Var.i = this.l0;
            zjk0Var.e = this.W;
            v.setPresenter(zjk0Var);
            LiveSpectators liveSpectators = new LiveSpectators();
            this.G = liveSpectators;
            liveSpectators.e = 0;
            liveSpectators.c = this.n.f.l6();
            this.G.d = this.n.f.B4();
            LiveSpectators liveSpectators2 = this.G;
            if (liveSpectators2 != null) {
                this.s.t(liveSpectators2);
            }
        }
        return v;
    }

    @Override // xsna.oiz
    public final void v0(rnz rnzVar) {
        if (rnzVar instanceof nnz) {
            this.Z = (nnz) rnzVar;
        } else {
            this.Z = null;
        }
    }

    public final boolean v2() {
        VideoFile videoFile;
        yg5 yg5Var;
        VideoOwner videoOwner = this.n;
        if (videoOwner == null || (videoFile = videoOwner.f) == null || videoFile.z0()) {
            return false;
        }
        if (this.n.f.l6() == 0 || this.n.f.x0()) {
            return true;
        }
        if (!this.n.f.X2()) {
            return false;
        }
        nnz nnzVar = this.Z;
        return ((nnzVar == null || (yg5Var = nnzVar.f) == null) ? 0L : yg5Var.getPosition()) < 0 && !this.l;
    }

    @Override // xsna.oiz
    public final boolean w() {
        return this.b0 != null;
    }

    @Override // xsna.oiz
    public final void w1(boolean z) {
        this.P = z;
    }

    public final void w2(VideoFile videoFile) {
        if (this.r == null) {
            h30 h30Var = new h30(this.f.getViewContext(), videoFile, false, null, this.m, this.W, null, null);
            this.r = h30Var;
            h30Var.o = !this.Q;
            this.h.d = h30Var;
        }
    }

    public final void x2() {
        if (!C2() || D2()) {
            H2();
            return;
        }
        K2(false);
        if (this.E == null) {
            VideoOwner videoOwner = this.n;
            UserId userId = videoOwner.e;
            c2 c2Var = new c2(this.c.m(videoOwner.d, userId), new tkz(new AtomicInteger(), Integer.MAX_VALUE));
            xkz xkzVar = new xkz(this);
            c2Var.subscribe(xkzVar);
            this.E = xkzVar;
        }
    }

    @Override // xsna.oiz
    public final void y() {
        yg5 yg5Var;
        nnz nnzVar = this.Z;
        if (nnzVar == null || (yg5Var = nnzVar.f) == null) {
            return;
        }
        yg5Var.K0(false);
    }

    @Override // xsna.oiz
    public final void y0() {
        B1();
        M2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x026b, code lost:
    
        if (xsna.ymz.b(r4) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x027c, code lost:
    
        r4 = r21.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x027e, code lost:
    
        if (r4 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0280, code lost:
    
        r2.setAddButtonPresenter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x027a, code lost:
    
        if (xsna.ymz.a(r4) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03c4, code lost:
    
        if (r4.C() == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03c7, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03d4, code lost:
    
        if (r4 != 1) goto L164;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y2() {
        a7q0 upcomingView;
        zjk0 zjk0Var;
        k4m T2;
        zjk0 zjk0Var2;
        VideoFile videoFile = this.n.f;
        if (D2() || videoFile == null) {
            return;
        }
        int i = 6;
        videoFile.a2(6);
        boolean z = true;
        z = true;
        z = true;
        z = true;
        boolean z2 = this.b0 == null || this.i != a.FINISHED;
        piz pizVar = this.f;
        pizVar.setLoaderEnabled(z2);
        a aVar = this.i;
        a aVar2 = a.RESTRICTED;
        mbl mblVar = null;
        mblVar = null;
        if (aVar == aVar2) {
            c cVar = this.z;
            if (cVar != null) {
                cVar.dispose();
            }
            this.z = null;
            this.z = wjs0.b.a0(io.reactivex.rxjava3.android.schedulers.a.b()).b0(ayr0.class).subscribe(new fsq(this, i));
            this.j = aVar2;
            if (F2()) {
                pizVar.I3(videoFile.O());
                return;
            }
            return;
        }
        a aVar3 = a.LIVE;
        int i2 = 2;
        int i3 = 12;
        if (aVar != aVar3 || this.j == aVar3) {
            a aVar4 = a.FINISHED;
            LiveStatNew liveStatNew = this.W;
            if (aVar == aVar4 && this.j != aVar4) {
                this.j = aVar4;
                if (this.b0 != null) {
                    por0 w3 = pizVar.w3();
                    if (w3 != null) {
                        VideoOwner videoOwner = this.n;
                        qor0 qor0Var = new qor0(videoFile, videoOwner.g, videoOwner.h, (wmf) this.b0.a, w3);
                        this.v = qor0Var;
                        w3.setPresenter(qor0Var);
                        this.v.start();
                        return;
                    }
                    return;
                }
                kkp n1 = pizVar.n1();
                if (n1 != null) {
                    VideoOwner videoOwner2 = this.n;
                    wkp wkpVar = new wkp(videoFile, videoOwner2.g, videoOwner2.h, n1);
                    this.u = wkpVar;
                    wkpVar.m = this.p0;
                    wkpVar.k = this.e0;
                    wkpVar.l = liveStatNew;
                    wkpVar.h = this.R;
                    wkpVar.g = this.U;
                    n1.setPresenter(wkpVar);
                    this.u.start();
                    return;
                }
                return;
            }
            a aVar5 = a.UPCOMING;
            if (aVar != aVar5 || this.j == aVar5) {
                if (aVar == aVar5 && gpt0.w(videoFile) && (upcomingView = pizVar.getUpcomingView()) != null) {
                    upcomingView.getPresenter().N(this.n.f);
                    upcomingView.resume();
                    return;
                }
                return;
            }
            this.j = aVar5;
            boolean z3 = this.m0;
            if (z3) {
                w2(videoFile);
                Q(videoFile);
                a2(videoFile);
                t(videoFile);
                wjk0 u2 = u2(videoFile);
                u2.Q3();
                hoz hozVar = this.b0;
                if (hozVar != null && (zjk0Var = this.s) != null) {
                    zjk0Var.d(new vq6(i3, hozVar, videoFile), new k7y(this.y, i2));
                }
                sk0 sk0Var = this.w;
                if (sk0Var != null) {
                    sk0Var.d();
                }
                hoz hozVar2 = this.b0;
                if (hozVar2 != null) {
                    hozVar2.c(pizVar, u2, videoFile, this.s0);
                }
                W();
            }
            a7q0 H1 = pizVar.H1(this.K, gpt0.w(videoFile));
            if (H1 != null) {
                if (!z3) {
                    H1.b2(videoFile.getTitle(), this.n.f.M0(), videoFile.s() != null && videoFile.s().i(1024));
                    wcf0 recommended = H1.getRecommended();
                    if (!this.R || recommended == null) {
                        H1.t0();
                    } else {
                        H1.s4();
                        mblVar = new mbl(liveStatNew, this.e0, recommended, videoFile);
                    }
                }
                mbl mblVar2 = mblVar;
                if (fkq0.b(videoFile.I0())) {
                    Group group = this.n.h;
                    if (!group.n()) {
                    }
                    g7q0 g7q0Var = new g7q0(H1, this.c, xwk.e(), mblVar2, videoFile, z, new l1i(this, i3));
                    H1.setPresenter(g7q0Var);
                    g7q0Var.start();
                } else {
                    int i4 = this.n.g.v;
                    if (i4 != 3) {
                    }
                    g7q0 g7q0Var2 = new g7q0(H1, this.c, xwk.e(), mblVar2, videoFile, z, new l1i(this, i3));
                    H1.setPresenter(g7q0Var2);
                    g7q0Var2.start();
                }
            }
            if (z3) {
                J2();
                return;
            }
            return;
        }
        this.j = aVar3;
        w2(videoFile);
        flz P3 = pizVar.P3();
        if (P3 != null) {
            glz glzVar = new glz(pizVar.getViewContext(), this.Z, P3, w(), this.n0);
            this.x = glzVar;
            P3.setPresenter(glzVar);
        }
        f2y0 C = pizVar.C(this.K);
        if (C != null) {
            if (w()) {
                pizVar.setWriteBarVisible(false);
            }
            C.F2();
            c30 c30Var = (c30) C;
            this.r.t.add(c30Var);
            c30Var.setActionLinksPresenter(this.r);
            UserProfile userProfile = this.m;
            boolean w = w();
            l2y0 l2y0Var = new l2y0(videoFile, userProfile, null, false, C);
            l2y0Var.p = w;
            this.q = l2y0Var;
            l2y0Var.B = this.X;
            if (this.t0) {
                l2y0Var.u.setOpenStickersMarketWithoutNavigation(true);
            }
            C.setPresenter(this.q);
            this.q.start();
            this.h.c = this.q;
            if (!this.f0) {
                C.resume();
            }
        }
        a2(videoFile);
        Context context = e43.a;
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable((context != null ? context : null).getApplicationContext()) == 0 && !fxc0.B().J().V0() && !w() && (pizVar instanceof LiveView)) {
            LiveView liveView = (LiveView) pizVar;
            boolean z4 = this.K;
            HashSet hashSet = liveView.V;
            LinearLayout linearLayout = liveView.d;
            try {
                if (liveView.F == null) {
                    liveView.F = new thu0(liveView.getContext());
                }
                liveView.F.setVisibility(8);
                liveView.F.setLayoutParams(new LinearLayout.LayoutParams(iah0.a(48.0f), iah0.a(48.0f)));
                linearLayout.addView(liveView.F, 0);
                hashSet.add(liveView.F);
                try {
                    wvv.b(wvv.a, new aw5(z ? 1 : 0, liveView.getContext(), liveView.F), 0L, 0L, 14);
                } catch (IllegalArgumentException unused) {
                }
                if (liveView.G == null) {
                    Context context2 = liveView.getContext();
                    uhu0 uhu0Var = new uhu0(context2);
                    uhu0Var.setImageDrawable(enj.d(R.drawable.vk_icon_screencast_outline_24, R.color.vk_white, context2));
                    uhu0Var.setScaleType(ImageView.ScaleType.CENTER);
                    liveView.G = uhu0Var;
                }
                liveView.G.setLayoutParams(new LinearLayout.LayoutParams(iah0.a(48.0f), iah0.a(48.0f)));
                liveView.G.setOnClickListener(new e9i(liveView, 7));
                linearLayout.addView(liveView.G, 0);
                if (z4) {
                    liveView.G.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    liveView.G.animate().alpha(1.0f).setDuration(300L).start();
                }
                hashSet.add(liveView.G);
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                MediaRouteConnectStatus mediaRouteConnectStatus = b.C1208b.a().x;
                if (mediaRouteConnectStatus != null) {
                    liveView.setMediaRouteConnectStatus(mediaRouteConnectStatus);
                }
            } catch (IllegalArgumentException e) {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a aVar6 = new Event.a();
                aVar6.g("cast_button_transparent_color");
                aVar6.i("FirebaseTracker");
                bVar.k(aVar6.e());
                bVar.a(e);
            }
        }
        VideoPipStateHolder.a.getClass();
        if (VideoPipStateHolder.g() && !w() && !BuildInfo.q()) {
            pizVar.n0(this.K);
        }
        t(videoFile);
        wjk0 u22 = u2(videoFile);
        if ((!TextUtils.isEmpty(videoFile.j1()) || w()) && (T2 = pizVar.T2(this.K)) != null) {
            VideoOwner videoOwner3 = this.n;
            UserProfile userProfile2 = videoOwner3.g;
            t4m t4mVar = new t4m(videoFile, userProfile2 != null ? new oap.a(userProfile2) : new oap.b(videoOwner3.h), T2);
            this.y = t4mVar;
            T2.setPresenter(t4mVar);
            UserProfile userProfile3 = this.n.g;
            ymz ymzVar = this.e;
            if (userProfile3 != null) {
                ymzVar.getClass();
            }
            Group group2 = this.n.h;
            if (group2 != null) {
                ymzVar.getClass();
            }
            this.y.start();
        }
        hoz hozVar3 = this.b0;
        if (hozVar3 != null && (zjk0Var2 = this.s) != null) {
            zjk0Var2.d(new vq6(i3, hozVar3, videoFile), new k7y(this.y, i2));
        }
        sk0 sk0Var2 = this.w;
        if (sk0Var2 != null) {
            sk0Var2.d();
        }
        Q(videoFile);
        hoz hozVar4 = this.b0;
        if (hozVar4 != null) {
            hozVar4.c(pizVar, u22, videoFile, this.s0);
        }
    }

    @Override // xsna.oiz
    public final void z() {
        wjk0 wjk0Var;
        hoz hozVar = this.b0;
        if (hozVar == null || (wjk0Var = (wjk0) hozVar.d) == null) {
            return;
        }
        e eVar = e.a;
        wjk0Var.Y(e.b(), true);
    }

    public final void z2() {
        if (this.n.f == null || D2()) {
            return;
        }
        a aVar = this.i;
        a aVar2 = a.LIVE;
        if (aVar == aVar2 && this.k != aVar2) {
            this.k = aVar2;
            W();
            J2();
            return;
        }
        a aVar3 = a.FINISHED;
        if (aVar == aVar3 && this.k != aVar3) {
            this.k = aVar3;
            nnz nnzVar = this.Z;
            if (nnzVar != null) {
                nnzVar.l();
            }
            this.b.c(new k4v());
            return;
        }
        a aVar4 = a.UPCOMING;
        if (aVar != aVar4 || this.k == aVar4) {
            return;
        }
        this.k = aVar4;
        nnz nnzVar2 = this.Z;
        if (nnzVar2 != null) {
            nnzVar2.l();
        }
    }

    @Override // xsna.oiz
    public final void G0(int i) {
    }
}
