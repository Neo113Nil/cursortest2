package com.vk.libvideo.autoplay.background.controller;

import android.app.Activity;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.media.player.VideoMode;
import com.vk.stat.scheme.SchemeStat$TypeVideoBackgroundListeningItem;
import io.reactivex.rxjava3.internal.operators.observable.g2;
import xsna.asu0;
import xsna.c63;
import xsna.epx;
import xsna.m4s0;
import xsna.p4s0;
import xsna.pa;
import xsna.qoy;
import xsna.vu5;
import xsna.yg5;
import xsna.zet0;

/* compiled from: VideoBackgroundAnalyticsController.kt */
/* loaded from: classes2.dex */
public final class a extends c63.b {
    public final pa b;
    public final p4s0 c;
    public final b d;
    public final zet0 e;
    public io.reactivex.rxjava3.disposables.c f;
    public final com.vk.libvideo.autoplay.background.controller.b g;

    /* compiled from: VideoBackgroundAnalyticsController.kt */
    /* renamed from: com.vk.libvideo.autoplay.background.controller.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1209a {

        /* compiled from: VideoBackgroundAnalyticsController.kt */
        /* renamed from: com.vk.libvideo.autoplay.background.controller.a$a$a, reason: collision with other inner class name */
        public static final class C1210a extends AbstractC1209a {
            public final yg5 a;
            public final SchemeStat$TypeVideoBackgroundListeningItem.EventType b;

            public C1210a(yg5 yg5Var, SchemeStat$TypeVideoBackgroundListeningItem.EventType eventType) {
                this.a = yg5Var;
                this.b = eventType;
            }

            @Override // com.vk.libvideo.autoplay.background.controller.a.AbstractC1209a
            public final yg5 a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1210a)) {
                    return false;
                }
                C1210a c1210a = (C1210a) obj;
                return epx.f(this.a, c1210a.a) && this.b == c1210a.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Click(autoPlay=" + this.a + ", eventType=" + this.b + ')';
            }
        }

        /* compiled from: VideoBackgroundAnalyticsController.kt */
        /* renamed from: com.vk.libvideo.autoplay.background.controller.a$a$b */
        public static final class b extends AbstractC1209a {
            public final yg5 a;
            public final boolean b;
            public final long c;

            public b(yg5 yg5Var, boolean z, long j) {
                this.a = yg5Var;
                this.b = z;
                this.c = j;
            }

            @Override // com.vk.libvideo.autoplay.background.controller.a.AbstractC1209a
            public final yg5 a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
            }

            public final int hashCode() {
                return Long.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Seek(autoPlay=");
                sb.append(this.a);
                sb.append(", isFastSeek=");
                sb.append(this.b);
                sb.append(", positionMillis=");
                return vu5.a(')', this.c, sb);
            }
        }

        public abstract yg5 a();
    }

    /* compiled from: VideoBackgroundAnalyticsController.kt */
    public static final class b implements c {
        public final io.reactivex.rxjava3.subjects.f<AbstractC1209a> a = new io.reactivex.rxjava3.subjects.f<>();

        @Override // com.vk.libvideo.autoplay.background.controller.a.c
        public final void a(yg5 yg5Var, SchemeStat$TypeVideoBackgroundListeningItem.EventType eventType) {
            this.a.onNext(new AbstractC1209a.C1210a(yg5Var, eventType));
        }

        @Override // com.vk.libvideo.autoplay.background.controller.a.c
        public final void b(yg5 yg5Var, boolean z, long j) {
            this.a.onNext(new AbstractC1209a.b(yg5Var, z, j));
        }
    }

    /* compiled from: VideoBackgroundAnalyticsController.kt */
    public interface c {
        void a(yg5 yg5Var, SchemeStat$TypeVideoBackgroundListeningItem.EventType eventType);

        void b(yg5 yg5Var, boolean z, long j);
    }

    public a(pa paVar, p4s0 p4s0Var, b bVar, zet0 zet0Var) {
        this.b = paVar;
        this.c = p4s0Var;
        this.d = bVar;
        this.e = zet0Var;
        m4s0 m4s0Var = new m4s0(this);
        this.g = new com.vk.libvideo.autoplay.background.controller.b(this);
        UiTracker uiTracker = UiTracker.a;
        UiTracker.h.f.add(m4s0Var);
    }

    @Override // xsna.c63.b
    public final void t() {
        yg5 b2;
        pa paVar = this.b;
        if (paVar.b() == null || !this.c.a(paVar.b()) || (b2 = paVar.b()) == null) {
            return;
        }
        b2.L(VideoMode.INVISIBLE);
    }

    @Override // xsna.c63.b
    public final void u() {
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.subjects.f<AbstractC1209a> fVar = this.d.a;
        fVar.getClass();
        this.f = new g2(fVar).a0(asu0.a.d()).subscribe(this.g);
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f = null;
    }
}
