package androidx.media3.exoplayer;

import android.os.Looper;
import b1.AbstractC2346O;
import e1.AbstractC4134a;
import e1.InterfaceC4143j;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final b f21412a;

    /* renamed from: b, reason: collision with root package name */
    public final a f21413b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4143j f21414c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2346O f21415d;

    /* renamed from: e, reason: collision with root package name */
    public int f21416e;

    /* renamed from: f, reason: collision with root package name */
    public Object f21417f;

    /* renamed from: g, reason: collision with root package name */
    public Looper f21418g;

    /* renamed from: h, reason: collision with root package name */
    public int f21419h;

    /* renamed from: i, reason: collision with root package name */
    public long f21420i = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21421j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21422k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21423l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21424m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21425n;

    public interface a {
        void h(o oVar);
    }

    public interface b {
        void t(int i10, Object obj);
    }

    public o(a aVar, b bVar, AbstractC2346O abstractC2346O, int i10, InterfaceC4143j interfaceC4143j, Looper looper) {
        this.f21413b = aVar;
        this.f21412a = bVar;
        this.f21415d = abstractC2346O;
        this.f21418g = looper;
        this.f21414c = interfaceC4143j;
        this.f21419h = i10;
    }

    public boolean a() {
        return this.f21421j;
    }

    public Looper b() {
        return this.f21418g;
    }

    public int c() {
        return this.f21419h;
    }

    public Object d() {
        return this.f21417f;
    }

    public long e() {
        return this.f21420i;
    }

    public b f() {
        return this.f21412a;
    }

    public AbstractC2346O g() {
        return this.f21415d;
    }

    public int h() {
        return this.f21416e;
    }

    public synchronized boolean i() {
        return this.f21425n;
    }

    public synchronized void j(boolean z10) {
        this.f21423l = z10 | this.f21423l;
        this.f21424m = true;
        notifyAll();
    }

    public o k() {
        AbstractC4134a.g(!this.f21422k);
        if (this.f21420i == -9223372036854775807L) {
            AbstractC4134a.a(this.f21421j);
        }
        this.f21422k = true;
        this.f21413b.h(this);
        return this;
    }

    public o l(Object obj) {
        AbstractC4134a.g(!this.f21422k);
        this.f21417f = obj;
        return this;
    }

    public o m(int i10) {
        AbstractC4134a.g(!this.f21422k);
        this.f21416e = i10;
        return this;
    }
}
