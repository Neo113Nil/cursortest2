package com.vk.libvideo.autoplay;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.session.MediaSessionCompat;
import com.vk.ads.adchoice.api.di.AdChoiceComponent;
import com.vk.clips.sdk.stats.pixels.api.di.AdStatPixelsComponent;
import com.vk.di.scope.SingletonScope;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.api.di.VideoPip2Component;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.seek.di.VideoSeekComponent;
import com.vk.libvideo.autoplay.background.controller.VideoBackgroundAudioTrackOnlyController;
import com.vk.libvideo.models.autoplay.ad_pixels.AutoPlayAdPixelsTrackerType;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.video.queue.api.di.VideoQueueComponent;
import com.vk.movika.sdk.base.logic.interactor.m;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import io.reactivex.rxjava3.internal.operators.observable.j2;
import io.reactivex.rxjava3.internal.operators.observable.l2;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.operators.observable.z0;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import xsna.ajt0;
import xsna.asu0;
import xsna.b3;
import xsna.bpn0;
import xsna.bts0;
import xsna.c4t0;
import xsna.cts0;
import xsna.dts0;
import xsna.dv2;
import xsna.e43;
import xsna.epx;
import xsna.ezs0;
import xsna.f0s0;
import xsna.fmp0;
import xsna.fpf0;
import xsna.fxc0;
import xsna.g7s0;
import xsna.gr3;
import xsna.h960;
import xsna.hg;
import xsna.hps0;
import xsna.i4f0;
import xsna.im0;
import xsna.itg0;
import xsna.j3;
import xsna.j5g;
import xsna.jgp;
import xsna.js00;
import xsna.jw5;
import xsna.k7m;
import xsna.kd0;
import xsna.la0;
import xsna.lcq0;
import xsna.m63;
import xsna.m7m;
import xsna.msy;
import xsna.mwp;
import xsna.mx8;
import xsna.n1s0;
import xsna.na;
import xsna.nh5;
import xsna.nm0;
import xsna.o1b0;
import xsna.o25;
import xsna.oh5;
import xsna.on00;
import xsna.oxv;
import xsna.p3t0;
import xsna.p7;
import xsna.pa;
import xsna.pn00;
import xsna.q4s0;
import xsna.qe3;
import xsna.qu5;
import xsna.r44;
import xsna.ra0;
import xsna.rhh0;
import xsna.rls0;
import xsna.s440;
import xsna.s8s0;
import xsna.sht0;
import xsna.t4s0;
import xsna.uu70;
import xsna.v3t0;
import xsna.v7s0;
import xsna.vyr0;
import xsna.wm1;
import xsna.xh5;
import xsna.xm1;
import xsna.xm9;
import xsna.y1s0;
import xsna.yg5;
import xsna.z2s0;
import xsna.zh5;

/* compiled from: AutoPlayInstanceHolder.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final bpn0 B = new bpn0(new qe3(1));
    public static final Object C = msy.a(LazyThreadSafetyMode.PUBLICATION, new dv2(1));
    public final bpn0 A;
    public final g7s0 a = fxc0.B();
    public final bpn0 b;
    public xh5 c;
    public final oh5 d;
    public final ajt0 e;
    public final bpn0 f;
    public final Object g;
    public final bpn0 h;
    public yg5 i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final AtomicReference<Map<String, yg5>> m;
    public final v7s0 n;
    public final CopyOnWriteArrayList<a> o;
    public final Handler p;
    public final q4s0 q;
    public final com.vk.libvideo.autoplay.background.controller.c r;
    public final zh5 s;
    public final mx8 t;
    public final rhh0 u;
    public final HashSet<String> v;
    public final HashMap<yg5, Set<String>> w;
    public MediaRouteConnectStatus x;
    public final bts0 y;
    public final int z;

    /* compiled from: AutoPlayInstanceHolder.kt */
    public interface a {
        void a(xh5 xh5Var, xh5 xh5Var2);
    }

    /* compiled from: AutoPlayInstanceHolder.kt */
    /* renamed from: com.vk.libvideo.autoplay.b$b, reason: collision with other inner class name */
    public static final class C1208b {
        public static b a() {
            return (b) b.B.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public static boolean b() {
            return ((Boolean) b.C.getValue()).booleanValue();
        }
    }

    /* compiled from: AutoPlayInstanceHolder.kt */
    public static final class c {
        public static final b a = new b();
    }

    /* compiled from: Comparisons.kt */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Long.valueOf(((yg5) t).P()), Long.valueOf(((yg5) t2).P()));
        }
    }

    public b() {
        int i;
        int i2 = 1;
        this.b = new bpn0(new nm0(i2));
        oh5 oh5Var = new oh5();
        this.d = oh5Var;
        bpn0 bpn0Var = new bpn0(new com.vk.movika.sdk.base.logic.interactor.j(this, 8));
        this.e = new ajt0();
        int i3 = 3;
        bpn0 bpn0Var2 = new bpn0(new xm1(this, i3));
        this.f = bpn0Var2;
        this.g = msy.a(LazyThreadSafetyMode.NONE, new m(i3));
        this.h = new bpn0(new la0(i2));
        int i4 = 7;
        bpn0 bpn0Var3 = new bpn0(new b3(this, i4));
        this.j = bpn0Var3;
        this.k = new bpn0(new na(this, i4));
        this.l = new bpn0(new ra0(this, i4));
        this.m = new AtomicReference<>(jgp.b);
        oxv oxvVar = m63.d;
        v7s0 v7s0Var = (v7s0) (oxvVar == null ? null : oxvVar).invoke();
        this.n = v7s0Var;
        this.o = new CopyOnWriteArrayList<>();
        this.p = new Handler(Looper.getMainLooper());
        int i5 = 2;
        pa paVar = new pa(this, i5);
        com.vk.libvideo.autoplay.background.controller.d dVar = new com.vk.libvideo.autoplay.background.controller.d();
        this.q = q4s0.a;
        Context context = e43.a;
        this.r = new com.vk.libvideo.autoplay.background.controller.c(context != null ? context : null, paVar, dVar, new bpn0(new im0(this, i4)), ((VideoSeekComponent) ((k7m) m7m.f(oh5Var)).mo408a(fpf0.a(VideoSeekComponent.class))).E1(), ((VideoPip2Component) ((k7m) m7m.f(oh5Var)).d(SingletonScope.a).a(fpf0.a(VideoPip2Component.class))).L3(), new bpn0(new hg(this, 5)), (VideoQueueComponent) bpn0Var.getValue());
        z2s0 z2s0Var = z2s0.b;
        int i6 = 4;
        int i7 = 0;
        this.s = new zh5(e43.l(new t4s0(z2s0Var), new p3t0(z2s0Var), new s8s0(), new fmp0()));
        this.t = new mx8(v7s0Var);
        rhh0 rhh0Var = new rhh0();
        rhh0Var.b = (AdStatPixelsComponent) ((k7m) m7m.f(this.d)).a(fpf0.a(AdStatPixelsComponent.class));
        this.u = rhh0Var;
        this.v = new HashSet<>();
        this.w = new HashMap<>();
        this.y = new bts0(new com.vk.movika.sdk.base.logic.processor.actions.f(this, 5), null);
        h960 b = com.vk.toggle.d.t.b();
        if (b != null) {
            i = b.d;
        } else if (com.vk.toggle.d.E0.b() != null) {
            h960.e.getClass();
            i = h960.f.d;
        } else {
            i = 0;
        }
        this.z = i;
        l2 C2 = o25.a().C();
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        itg0.i(6, new j2(new y(C2, qVar, aVar)).a0(io.reactivex.rxjava3.android.schedulers.a.b()), null, new gr3(this, i5), null);
        o1b0 c2 = qu5.c();
        o1b0.a aVar2 = o1b0.a;
        c2.j(2);
        q<Boolean> b2 = ((y1s0) bpn0Var2.getValue()).b();
        io.reactivex.rxjava3.subjects.d dVar2 = (io.reactivex.rxjava3.subjects.d) bpn0Var3.getValue();
        io.reactivex.rxjava3.subjects.d<WeakReference<yg5>> dVar3 = q4s0.b;
        dVar3.getClass();
        int i8 = 10;
        itg0.i(6, q.l(b2, dVar2, new y(new z0(dVar3).U(new i4f0(new lcq0(i6), i8)), qVar, aVar), new p7(new nh5(i7), i3)).a0(asu0.a.d()), null, new com.vk.im.engine.internal.storage.delegates.messages.b(this, i8), null);
        this.A = new bpn0(new wm1(this, i3));
    }

    public final void a(yg5 yg5Var) {
        xh5 xh5Var = this.c;
        if (yg5Var.equals(xh5Var != null ? xh5Var.a : null)) {
            l(null);
        }
    }

    public final void b(xh5 xh5Var) {
        xh5 xh5Var2 = this.c;
        if (xh5Var2 != null) {
            yg5 yg5Var = xh5Var2.a;
            if (!epx.f(yg5Var, xh5Var.a) && yg5Var != null) {
                yg5Var.pause();
            }
        }
        l(xh5Var);
    }

    public final Map<String, yg5> c() {
        return this.m.get();
    }

    public final xh5 d() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28, types: [T, com.vk.libvideo.autoplay.VideoAutoPlay, java.lang.Object, xsna.yg5] */
    public final yg5 e(VideoFile videoFile, AutoPlayAdPixelsTrackerType autoPlayAdPixelsTrackerType) {
        Ref$ObjectRef ref$ObjectRef;
        vyr0 vyr0Var;
        String str;
        mwp mwpVar;
        Map<String, yg5> c2;
        uu70 uu70Var;
        long j;
        long j2;
        oh5 oh5Var = this.d;
        Trace.beginSection("AutoPlayInstanceHolder.getVideoAutoPlay");
        try {
            if (videoFile.W9()) {
                return new com.vk.libvideo.autoplay.d(videoFile);
            }
            if (C1208b.b()) {
                videoFile.O1();
                new Exception();
            }
            String r1 = videoFile.r1();
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            Map<String, yg5> c3 = c();
            T t = c3 != null ? c3.get(r1) : 0;
            ref$ObjectRef2.element = t;
            if (t == 0) {
                mx8 mx8Var = this.t;
                zh5 zh5Var = this.s;
                rhh0 rhh0Var = this.u;
                ezs0 s = this.a.s();
                v7s0 v7s0Var = this.n;
                v3t0 v3t0Var = (v3t0) this.A.getValue();
                kd0 M3 = ((AdChoiceComponent) ((k7m) m7m.f(oh5Var)).a(fpf0.a(AdChoiceComponent.class))).M3();
                VideoBackgroundAudioTrackOnlyController videoBackgroundAudioTrackOnlyController = this.r.i;
                f0s0 Z9 = ((VideoGrowthComponent) ((k7m) m7m.f(oh5Var)).a(fpf0.a(VideoGrowthComponent.class))).Z9();
                AutoPlayAdPixelsTrackerType autoPlayAdPixelsTrackerType2 = autoPlayAdPixelsTrackerType == null ? AutoPlayAdPixelsTrackerType.NONE : autoPlayAdPixelsTrackerType;
                vyr0 t6 = ((VideoAdFreeSubscriptionComponent) ((k7m) m7m.f(oh5Var)).a(fpf0.a(VideoAdFreeSubscriptionComponent.class))).t6();
                VideoAdvertisementsRepository videoAdvertisementsRepository = (VideoAdvertisementsRepository) this.k.getValue();
                ajt0 ajt0Var = this.e;
                c4t0 b = com.vk.toggle.d.I0.b();
                if (b != null) {
                    uu70 b2 = com.vk.toggle.d.x.b();
                    if (b2 == null) {
                        vyr0Var = t6;
                        str = r1;
                        uu70Var = new uu70(uu70.b.a.a);
                    } else {
                        vyr0Var = t6;
                        str = r1;
                        uu70Var = b2;
                    }
                    uu70.b bVar = uu70Var.a;
                    uu70.b.C3834b c3834b = bVar instanceof uu70.b.C3834b ? (uu70.b.C3834b) bVar : null;
                    int i = b.a;
                    int i2 = b.b;
                    long j3 = b.c;
                    boolean booleanValue = ((Boolean) this.h.getValue()).booleanValue();
                    if (c3834b != null) {
                        j = j3;
                        j2 = c3834b.b;
                    } else {
                        j = j3;
                        j2 = mwp.g.f;
                    }
                    mwpVar = new mwp(j, j2, i, i2, c3834b != null ? c3834b.a : mwp.g.e, booleanValue);
                } else {
                    vyr0Var = t6;
                    str = r1;
                    mwpVar = null;
                }
                ref$ObjectRef = ref$ObjectRef2;
                ?? videoAutoPlay = new VideoAutoPlay(videoFile, v7s0Var, mx8Var, zh5Var, rhh0Var, s, v3t0Var, M3, videoBackgroundAudioTrackOnlyController, Z9, vyr0Var, videoAdvertisementsRepository, ajt0Var, new com.vk.movika.sdk.base.data.converter.c((n1s0) this.l.getValue()), autoPlayAdPixelsTrackerType2, mwpVar);
                videoAutoPlay.n0 = g(videoAutoPlay, ((y1s0) this.f.getValue()).G(), (VideoMinimizableState) ((io.reactivex.rxjava3.subjects.d) this.j.getValue()).P0(), this.q.b());
                ref$ObjectRef.element = videoAutoPlay;
                Pair pair = new Pair(str, videoAutoPlay);
                AtomicReference<Map<String, yg5>> atomicReference = this.m;
                Map<String, yg5> c4 = c();
                atomicReference.set(c4 != null ? pn00.o(c4, pair) : on00.f(pair));
                if (C1208b.b() && (c2 = c()) != null) {
                    c2.size();
                }
            } else {
                ref$ObjectRef = ref$ObjectRef2;
                if (videoFile.getTimestamp() > ((yg5) ref$ObjectRef.element).A().getTimestamp()) {
                    ((yg5) ref$ObjectRef.element).N(videoFile);
                } else if (!epx.f(videoFile.m1(), ((yg5) ref$ObjectRef.element).A().m1())) {
                    ((yg5) ref$ObjectRef.element).A().u7(videoFile.m1());
                }
                if (C1208b.b()) {
                    ((yg5) ref$ObjectRef.element).A().O1();
                }
                ((yg5) ref$ObjectRef.element).R();
            }
            if (this.z > 0) {
                if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
                    j();
                } else {
                    this.p.post(new r44(this, 1));
                }
            }
            return (yg5) ref$ObjectRef.element;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean g(yg5 yg5Var, boolean z, VideoMinimizableState videoMinimizableState, boolean z2) {
        boolean z3 = yg5Var.u0() || epx.f(yg5Var.d0(), "offline");
        if (!((Boolean) this.g.getValue()).booleanValue() || !z3) {
            if (!z2) {
                return z;
            }
            boolean f = epx.f(videoMinimizableState, VideoMinimizableState.Pip.b);
            bpn0 bpn0Var = this.f;
            boolean d2 = f ? ((y1s0) bpn0Var.getValue()).d() : ((y1s0) bpn0Var.getValue()).c();
            if (z && d2) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(yg5 yg5Var) {
        xh5 xh5Var = this.c;
        return yg5Var.equals(xh5Var != null ? xh5Var.a : null);
    }

    public final Boolean i(VideoFile videoFile) {
        yg5 yg5Var;
        Map<String, yg5> c2 = c();
        if (c2 == null || (yg5Var = c2.get(videoFile.r1())) == null) {
            return null;
        }
        return Boolean.valueOf(yg5Var.B());
    }

    public final void j() {
        epx.f(Looper.myLooper(), Looper.getMainLooper());
        int i = this.z;
        if (i <= 0) {
            return;
        }
        SystemClock.elapsedRealtimeNanos();
        Map<String, yg5> c2 = c();
        if (c2 != null) {
            Collection<yg5> values = c2.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : values) {
                if (((yg5) obj).C0()) {
                    arrayList.add(obj);
                }
            }
            List D0 = j5g.D0(new d(), arrayList);
            if (C1208b.b()) {
                D0.size();
                c2.size();
            }
            Iterator it = j5g.T(i, D0).iterator();
            while (it.hasNext()) {
                ((yg5) it.next()).c0();
            }
        }
        SystemClock.elapsedRealtimeNanos();
        C1208b.b();
    }

    public final void k(String str, yg5 yg5Var) {
        HashMap<yg5, Set<String>> hashMap = this.w;
        Set<String> set = hashMap.get(yg5Var);
        if (set == null) {
            m(yg5Var);
            return;
        }
        set.remove(str);
        if (set.isEmpty()) {
            m(yg5Var);
            hashMap.remove(yg5Var);
        }
    }

    public final void l(xh5 xh5Var) {
        com.vk.libvideo.autoplay.a aVar;
        yg5 yg5Var;
        com.vk.libvideo.autoplay.a aVar2;
        x k;
        xh5 xh5Var2 = this.c;
        this.c = xh5Var;
        com.vk.libvideo.autoplay.background.controller.c cVar = this.r;
        ((com.vk.video.kidsprofile.restricteduseractions.a) cVar.a.getValue()).getClass();
        q4s0 q4s0Var = q4s0.a;
        boolean z = false;
        if (!q4s0Var.b()) {
            com.vk.libvideo.autoplay.background.controller.e eVar = cVar.d;
            q4s0 q4s0Var2 = eVar.d;
            yg5 b = eVar.c.b();
            if (b != null) {
                boolean b2 = eVar.e.b(b);
                boolean d2 = q4s0Var2.d();
                boolean z2 = eVar.b.a && !q4s0Var2.c();
                if (b2 && d2 && z2) {
                    hps0 hps0Var = eVar.g;
                    if (hps0Var != null) {
                        yg5 yg5Var2 = hps0Var.b;
                        if (yg5Var2 != null) {
                            yg5Var2.T(hps0Var);
                        }
                        hps0Var.c = null;
                        com.vk.movika.sdk.base.logic.processor.actions.e eVar2 = new com.vk.movika.sdk.base.logic.processor.actions.e(23, eVar, b);
                        hps0Var.b = b;
                        b.f0(hps0Var);
                        hps0Var.c = eVar2;
                    } else {
                        hps0Var = new hps0();
                        j3 j3Var = new j3(28, eVar, b);
                        hps0Var.b = b;
                        b.f0(hps0Var);
                        hps0Var.c = j3Var;
                    }
                    eVar.g = hps0Var;
                } else {
                    hps0 hps0Var2 = eVar.g;
                    if (hps0Var2 != null) {
                        yg5 yg5Var3 = hps0Var2.b;
                        if (yg5Var3 != null) {
                            yg5Var3.T(hps0Var2);
                        }
                        hps0Var2.b = null;
                        hps0Var2.c = null;
                    }
                    eVar.g = null;
                }
            }
        }
        com.vk.libvideo.autoplay.background.controller.c cVar2 = this.r;
        cVar2.getClass();
        if (q4s0Var.b()) {
            cVar2.c.D();
            cVar2.e.u();
        }
        Iterator<a> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().a(xh5Var2, this.c);
        }
        xh5 xh5Var3 = this.c;
        if (xh5Var3 != null && (aVar = xh5Var3.b) != null && (yg5Var = xh5Var3.a) != null) {
            if (!SakFeatures.Type.VIDEO_FIX_MINIPLAYER_HEADSET.h()) {
                z = yg5Var.R0().h();
            } else if (yg5Var.R0() == AutoPlayMinifiedState.PIP) {
                z = true;
            }
            PlayerType playerType = aVar.p;
            if ((playerType == PlayerType.FULLSCREEN || playerType == PlayerType.CAROUSEL) && !z && !yg5Var.M0() && !yg5Var.v()) {
                xh5 xh5Var4 = this.c;
                if (xh5Var4 == null || (aVar2 = xh5Var4.b) == null || !aVar2.c) {
                    this.y.a();
                    return;
                }
                bts0 bts0Var = this.y;
                yg5 invoke = bts0Var.a.invoke();
                if (invoke == null) {
                    return;
                }
                js00 js00Var = new js00(13, bts0Var, invoke);
                dts0 dts0Var = bts0Var.g;
                if (dts0Var != null) {
                    js00Var.invoke(dts0Var);
                    return;
                }
                io.reactivex.rxjava3.disposables.c cVar3 = bts0Var.h;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                cts0 cts0Var = bts0Var.c;
                Context context = e43.a;
                Context context2 = context != null ? context : null;
                cts0Var.h();
                MediaSessionCompat mediaSessionCompat = cts0Var.c;
                if (mediaSessionCompat == null) {
                    cts0Var.b = true;
                    k = new v(new xm9(2, cts0Var, context2)).q(io.reactivex.rxjava3.schedulers.a.a()).m(io.reactivex.rxjava3.android.schedulers.a.b());
                } else {
                    k = x.k(cts0Var.d(mediaSessionCompat));
                }
                bts0Var.h = k.subscribe(new s440(new rls0(2, bts0Var, js00Var), 21));
                return;
            }
        }
        this.y.c();
    }

    public final void m(yg5 yg5Var) {
        sht0 sht0Var;
        if (yg5Var.getConfig().p != PlayerType.INLINE) {
            return;
        }
        boolean a2 = this.s.a(yg5Var);
        if (!a2 || !yg5Var.v()) {
            if (a2) {
                yg5Var.pause();
                yg5Var.B0().stop();
                return;
            }
            return;
        }
        VideoAutoPlay videoAutoPlay = yg5Var instanceof VideoAutoPlay ? (VideoAutoPlay) yg5Var : null;
        if (videoAutoPlay == null || (sht0Var = videoAutoPlay.l0) == null) {
            return;
        }
        o1b0 c2 = qu5.c();
        o1b0.a aVar = o1b0.a;
        c2.f(sht0Var, true);
    }

    public final void n() {
        Collection<yg5> values;
        e eVar = e.a;
        e.e(!e.b());
        Map<String, yg5> c2 = c();
        if (c2 == null || (values = c2.values()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (((yg5) obj).getConfig().c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((yg5) it.next()).H();
        }
    }
}
