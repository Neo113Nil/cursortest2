package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.a;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.InterfaceC2218t;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m1.O0;
import m1.o1;

/* renamed from: androidx.media3.exoplayer.source.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2219u implements C {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f21871a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f21872b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f21873c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f21874d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f21875e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public Ta.o f21876f;
    private final byte[] sampleData;

    /* renamed from: androidx.media3.exoplayer.source.u$a */
    public final class a implements c0 {

        /* renamed from: a, reason: collision with root package name */
        public int f21877a = 0;

        public a() {
        }

        @Override // androidx.media3.exoplayer.source.c0
        public void a() {
            Throwable th2 = (Throwable) C2219u.this.f21874d.get();
            if (th2 != null) {
                throw new IOException(th2);
            }
        }

        public void b() {
            if (this.f21877a == 2) {
                this.f21877a = 1;
            }
        }

        @Override // androidx.media3.exoplayer.source.c0
        public boolean c() {
            return C2219u.this.f21873c.get();
        }

        @Override // androidx.media3.exoplayer.source.c0
        public int q(long j10) {
            return 0;
        }

        @Override // androidx.media3.exoplayer.source.c0
        public int s(O0 o02, k1.f fVar, int i10) {
            int i11 = this.f21877a;
            if (i11 == 2) {
                fVar.e(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                o02.f56121b = C2219u.this.f21872b.b(0).a(0);
                this.f21877a = 1;
                return -5;
            }
            if (!C2219u.this.f21873c.get()) {
                return -3;
            }
            int length = C2219u.this.sampleData.length;
            fVar.e(1);
            fVar.f54110f = 0L;
            if ((i10 & 4) == 0) {
                fVar.p(length);
                fVar.f54108d.put(C2219u.this.sampleData, 0, length);
            }
            if ((i10 & 1) == 0) {
                this.f21877a = 2;
            }
            return -4;
        }
    }

    public C2219u(Uri uri, String str, InterfaceC2218t interfaceC2218t) {
        this.f21871a = uri;
        this.f21872b = new m0(new b1.P(new a.b().y0(str).P()));
        this.sampleData = uri.toString().getBytes(StandardCharsets.UTF_8);
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean b(androidx.media3.exoplayer.k kVar) {
        return !this.f21873c.get();
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long d() {
        return this.f21873c.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean e() {
        return !this.f21873c.get();
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long g() {
        return this.f21873c.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public void h(long j10) {
    }

    @Override // androidx.media3.exoplayer.source.C
    public long k(long j10) {
        for (int i10 = 0; i10 < this.f21875e.size(); i10++) {
            ((a) this.f21875e.get(i10)).b();
        }
        return j10;
    }

    public void l() {
        Ta.o oVar = this.f21876f;
        if (oVar != null) {
            oVar.cancel(false);
        }
    }

    @Override // androidx.media3.exoplayer.source.C
    public long m(androidx.media3.exoplayer.trackselection.y[] yVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            c0 c0Var = c0VarArr[i10];
            if (c0Var != null && (yVarArr[i10] == null || !zArr[i10])) {
                this.f21875e.remove(c0Var);
                c0VarArr[i10] = null;
            }
            if (c0VarArr[i10] == null && yVarArr[i10] != null) {
                a aVar = new a();
                this.f21875e.add(aVar);
                c0VarArr[i10] = aVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.C
    public long n() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.C
    public void r() {
    }

    @Override // androidx.media3.exoplayer.source.C
    public void t(C.a aVar, long j10) {
        aVar.i(this);
        new InterfaceC2218t.a(this.f21871a);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.C
    public m0 u() {
        return this.f21872b;
    }

    @Override // androidx.media3.exoplayer.source.C
    public void v(long j10, boolean z10) {
    }

    @Override // androidx.media3.exoplayer.source.C
    public long f(long j10, o1 o1Var) {
        return j10;
    }
}
