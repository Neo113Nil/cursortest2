package com.vk.libvideo.autoplay.background.controller;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.vk.libvideo.autoplay.background.controller.a;
import com.vk.libvideo.autoplay.background.controller.e;
import com.vk.libvideo.autoplay.background.controller.h;
import com.vk.libvideo.autoplay.background.controller.i;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.video.queue.api.di.VideoQueueComponent;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.bpn0;
import xsna.c63;
import xsna.cts0;
import xsna.e43;
import xsna.gqe0;
import xsna.h4f0;
import xsna.o330;
import xsna.o4s0;
import xsna.oys0;
import xsna.p4s0;
import xsna.pa;
import xsna.q4s0;
import xsna.qjl0;
import xsna.s740;
import xsna.v4s0;
import xsna.ysg0;
import xsna.yss0;
import xsna.zet0;

/* compiled from: VideoBackgroundController.kt */
/* loaded from: classes2.dex */
public final class c {
    public final bpn0 a;
    public final VideoQueueComponent b;
    public final o4s0 c;
    public final e d;
    public final f e;
    public final v4s0 f;
    public final i g;
    public final h h;
    public final VideoBackgroundAudioTrackOnlyController i;
    public final com.vk.libvideo.autoplay.background.controller.a j;

    /* compiled from: VideoBackgroundController.kt */
    public interface a {
        void f();

        void g();
    }

    /* compiled from: VideoBackgroundController.kt */
    public final class b extends c63.b {
        public final List<c63.b> b;

        public b(c cVar) {
            this.b = e43.l(cVar.e, cVar.c, cVar.d, cVar.g, cVar.h, cVar.j, cVar.f, cVar.i);
        }

        @Override // xsna.c63.b
        public final void A() {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).A();
            }
        }

        @Override // xsna.c63.b
        public final void B(Configuration configuration) {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).B(configuration);
            }
        }

        @Override // xsna.c63.b
        public final void C() {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).C();
            }
        }

        @Override // xsna.c63.b
        public final void m(Activity activity) {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).m(activity);
            }
        }

        @Override // xsna.c63.b
        public final void n(Activity activity) {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).n(activity);
            }
        }

        @Override // xsna.c63.b
        public final void o(Activity activity) {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).o(activity);
            }
        }

        @Override // xsna.c63.b
        public final void p(Activity activity) {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).p(activity);
            }
        }

        @Override // xsna.c63.b
        public final void q(Activity activity, boolean z) {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).q(activity, z);
            }
        }

        @Override // xsna.c63.b
        public final void r(Activity activity, boolean z) {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).r(activity, z);
            }
        }

        @Override // xsna.c63.b
        public final void s() {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).s();
            }
        }

        @Override // xsna.c63.b
        public final void t() {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).t();
            }
        }

        @Override // xsna.c63.b
        public final void u() {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).u();
            }
        }

        @Override // xsna.c63.b
        public final void v() {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).v();
            }
        }

        @Override // xsna.c63.b
        public final void w() {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).w();
            }
        }

        @Override // xsna.c63.b
        public final void x(Activity activity) {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).x(activity);
            }
        }

        @Override // xsna.c63.b
        public final void y(Activity activity) {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).y(activity);
            }
        }

        @Override // xsna.c63.b
        public final void z(boolean z) {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((c63.b) it.next()).z(z);
            }
        }
    }

    /* compiled from: VideoBackgroundController.kt */
    /* renamed from: com.vk.libvideo.autoplay.background.controller.c$c, reason: collision with other inner class name */
    public final class C1211c implements a {
        public final List<a> b;

        public C1211c(c cVar) {
            this.b = Collections.singletonList(cVar.i);
        }

        @Override // com.vk.libvideo.autoplay.background.controller.c.a
        public final void f() {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((a) it.next()).f();
            }
        }

        @Override // com.vk.libvideo.autoplay.background.controller.c.a
        public final void g() {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                ((a) it.next()).g();
            }
        }
    }

    /* compiled from: VideoBackgroundController.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoPipStateHolder.State.values().length];
            try {
                iArr[VideoPipStateHolder.State.OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPipStateHolder.State.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c(Context context, pa paVar, com.vk.libvideo.autoplay.background.controller.d dVar, bpn0 bpn0Var, zet0 zet0Var, io.reactivex.rxjava3.subjects.f fVar, bpn0 bpn0Var2, VideoQueueComponent videoQueueComponent) {
        q4s0 q4s0Var = q4s0.a;
        this.a = bpn0Var2;
        this.b = videoQueueComponent;
        h.a aVar = new h.a();
        a.b bVar = new a.b();
        this.c = new o4s0(paVar, new p4s0(context, new p4s0.a(null), dVar));
        this.d = new e(new e.a(0), paVar, dVar, bpn0Var);
        this.e = new f(context, new g(paVar, new oys0(context), (cts0) cts0.f.getValue(), new s740(context), new yss0(), aVar, bVar, videoQueueComponent));
        this.f = new v4s0(videoQueueComponent.z9());
        this.g = new i(new i.a(0), paVar);
        this.h = new h(paVar, aVar);
        this.i = new VideoBackgroundAudioTrackOnlyController(paVar, dVar);
        this.j = new com.vk.libvideo.autoplay.background.controller.a(paVar, new p4s0(context, new p4s0.a(null), dVar), bVar, zet0Var);
        c63 c63Var = c63.a;
        c63.a(new b(this));
        C1211c c1211c = new C1211c(this);
        fVar.subscribe(new h4f0(new gqe0(c1211c, 18), 13));
        ysg0.b.a.b0(VideoPipStateHolder.State.class).subscribe(new o330(new qjl0(c1211c, 9), 23));
    }
}
