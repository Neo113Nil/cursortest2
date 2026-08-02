package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import androidx.media3.exoplayer.r;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.C4140g;
import e1.InterfaceC4143j;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21426a;

    /* renamed from: b, reason: collision with root package name */
    public final b f21427b;

    /* renamed from: c, reason: collision with root package name */
    public final C4140g f21428c;

    /* renamed from: d, reason: collision with root package name */
    public AudioManager f21429d;

    /* renamed from: e, reason: collision with root package name */
    public d f21430e;

    /* renamed from: f, reason: collision with root package name */
    public int f21431f;

    public interface b {
        void F(int i10, boolean z10);

        void u(int i10);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f21432a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21433b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f21434c;

        /* renamed from: d, reason: collision with root package name */
        public final int f21435d;

        /* renamed from: e, reason: collision with root package name */
        public final int f21436e;

        public c(int i10, int i11, boolean z10, int i12, int i13) {
            this.f21432a = i10;
            this.f21433b = i11;
            this.f21434c = z10;
            this.f21435d = i12;
            this.f21436e = i13;
        }
    }

    public final class d extends BroadcastReceiver {
        public d() {
        }

        public static /* synthetic */ void a(d dVar) {
            if (r.this.f21430e == null) {
                return;
            }
            r.this.f21428c.g(r.this.j(((c) r.this.f21428c.d()).f21432a));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            r.this.f21428c.e(new Runnable() { // from class: m1.w1
                @Override // java.lang.Runnable
                public final void run() {
                    r.d.a(r.d.this);
                }
            });
        }
    }

    public r(Context context, b bVar, final int i10, Looper looper, Looper looper2, InterfaceC4143j interfaceC4143j) {
        this.f21426a = context.getApplicationContext();
        this.f21427b = bVar;
        C4140g c4140g = new C4140g(new c(i10, 0, false, 0, 0), looper, looper2, interfaceC4143j, new C4140g.a() { // from class: m1.q1
            @Override // e1.C4140g.a
            public final void a(Object obj, Object obj2) {
                androidx.media3.exoplayer.r.this.m((r.c) obj, (r.c) obj2);
            }
        });
        this.f21428c = c4140g;
        c4140g.e(new Runnable() { // from class: m1.r1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.exoplayer.r.f(androidx.media3.exoplayer.r.this, i10);
            }
        });
    }

    public static /* synthetic */ c a(int i10, c cVar) {
        return new c(i10, cVar.f21433b, cVar.f21434c, cVar.f21435d, cVar.f21436e);
    }

    public static /* synthetic */ c b(c cVar) {
        return cVar;
    }

    public static /* synthetic */ c c(r rVar, int i10, c cVar) {
        rVar.getClass();
        return cVar.f21432a == i10 ? cVar : rVar.j(i10);
    }

    public static /* synthetic */ c d(r rVar, c cVar) {
        d dVar = rVar.f21430e;
        if (dVar != null) {
            try {
                rVar.f21426a.unregisterReceiver(dVar);
            } catch (RuntimeException e10) {
                AbstractC4156x.j("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            rVar.f21430e = null;
        }
        return cVar;
    }

    public static /* synthetic */ void f(r rVar, int i10) {
        rVar.f21429d = (AudioManager) AbstractC4134a.i((AudioManager) rVar.f21426a.getSystemService("audio"));
        d dVar = new d();
        try {
            rVar.f21426a.registerReceiver(dVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            rVar.f21430e = dVar;
        } catch (RuntimeException e10) {
            AbstractC4156x.j("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
        rVar.f21428c.g(rVar.j(i10));
    }

    public final c j(int i10) {
        AbstractC4134a.e(this.f21429d);
        return new c(i10, c1.m.f(this.f21429d, i10), c1.m.g(this.f21429d, i10), c1.m.e(this.f21429d, i10), c1.m.d(this.f21429d, i10));
    }

    public int k() {
        return ((c) this.f21428c.d()).f21436e;
    }

    public int l() {
        return ((c) this.f21428c.d()).f21435d;
    }

    public final void m(c cVar, c cVar2) {
        boolean z10 = cVar.f21434c;
        if (!z10 && cVar2.f21434c) {
            this.f21431f = cVar.f21433b;
        }
        int i10 = cVar.f21433b;
        int i11 = cVar2.f21433b;
        if (i10 != i11 || z10 != cVar2.f21434c) {
            this.f21427b.F(i11, cVar2.f21434c);
        }
        int i12 = cVar.f21432a;
        int i13 = cVar2.f21432a;
        if (i12 == i13 && cVar.f21435d == cVar2.f21435d && cVar.f21436e == cVar2.f21436e) {
            return;
        }
        this.f21427b.u(i13);
    }

    public void n() {
        this.f21428c.h(new Ra.f() { // from class: m1.u1
            @Override // Ra.f
            public final Object apply(Object obj) {
                return androidx.media3.exoplayer.r.b((r.c) obj);
            }
        }, new Ra.f() { // from class: m1.v1
            @Override // Ra.f
            public final Object apply(Object obj) {
                return androidx.media3.exoplayer.r.d(androidx.media3.exoplayer.r.this, (r.c) obj);
            }
        });
    }

    public void o(final int i10) {
        this.f21428c.h(new Ra.f() { // from class: m1.s1
            @Override // Ra.f
            public final Object apply(Object obj) {
                return androidx.media3.exoplayer.r.a(i10, (r.c) obj);
            }
        }, new Ra.f() { // from class: m1.t1
            @Override // Ra.f
            public final Object apply(Object obj) {
                return androidx.media3.exoplayer.r.c(androidx.media3.exoplayer.r.this, i10, (r.c) obj);
            }
        });
    }
}
