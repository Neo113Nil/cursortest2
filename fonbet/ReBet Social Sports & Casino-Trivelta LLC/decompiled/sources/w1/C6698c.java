package w1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.q;
import androidx.media3.exoplayer.source.D;
import b1.C2334C;
import e1.AbstractC4134a;
import e1.Z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import m1.O0;

/* renamed from: w1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6698c extends androidx.media3.exoplayer.c implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    public C2334C f67257A;

    /* renamed from: B, reason: collision with root package name */
    public long f67258B;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC6696a f67259r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC6697b f67260s;

    /* renamed from: t, reason: collision with root package name */
    public final Handler f67261t;

    /* renamed from: u, reason: collision with root package name */
    public final Q1.b f67262u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f67263v;

    /* renamed from: w, reason: collision with root package name */
    public Q1.a f67264w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f67265x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f67266y;

    /* renamed from: z, reason: collision with root package name */
    public long f67267z;

    public C6698c(InterfaceC6697b interfaceC6697b, Looper looper) {
        this(interfaceC6697b, looper, InterfaceC6696a.f67256a);
    }

    @Override // androidx.media3.exoplayer.q
    public int a(androidx.media3.common.a aVar) {
        if (this.f67259r.a(aVar)) {
            return q.r(aVar.f20527O == 0 ? 4 : 2);
        }
        return q.r(0);
    }

    @Override // androidx.media3.exoplayer.p
    public boolean b() {
        return this.f67266y;
    }

    @Override // androidx.media3.exoplayer.p
    public boolean c() {
        return true;
    }

    @Override // androidx.media3.exoplayer.c
    public void d0() {
        this.f67257A = null;
        this.f67264w = null;
        this.f67258B = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.c
    public void g0(long j10, boolean z10) {
        this.f67257A = null;
        this.f67265x = false;
        this.f67266y = false;
    }

    @Override // androidx.media3.exoplayer.p, androidx.media3.exoplayer.q
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // androidx.media3.exoplayer.p
    public void h(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            w0();
            z10 = v0(j10);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        u0((C2334C) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.c
    public void m0(androidx.media3.common.a[] aVarArr, long j10, long j11, D.b bVar) {
        this.f67264w = this.f67259r.b(aVarArr[0]);
        C2334C c2334c = this.f67257A;
        if (c2334c != null) {
            this.f67257A = c2334c.c((c2334c.f24293a + this.f67258B) - j11);
        }
        this.f67258B = j11;
    }

    public final void r0(C2334C c2334c, List list) {
        for (int i10 = 0; i10 < c2334c.e(); i10++) {
            androidx.media3.common.a a10 = c2334c.d(i10).a();
            if (a10 == null || !this.f67259r.a(a10)) {
                list.add(c2334c.d(i10));
            } else {
                Q1.a b10 = this.f67259r.b(a10);
                byte[] bArr = (byte[]) AbstractC4134a.e(c2334c.d(i10).c());
                this.f67262u.f();
                this.f67262u.p(bArr.length);
                ((ByteBuffer) Z.i(this.f67262u.f54108d)).put(bArr);
                this.f67262u.q();
                C2334C a11 = b10.a(this.f67262u);
                if (a11 != null) {
                    r0(a11, list);
                }
            }
        }
    }

    public final long s0(long j10) {
        AbstractC4134a.g(j10 != -9223372036854775807L);
        AbstractC4134a.g(this.f67258B != -9223372036854775807L);
        return j10 - this.f67258B;
    }

    public final void t0(C2334C c2334c) {
        Handler handler = this.f67261t;
        if (handler != null) {
            handler.obtainMessage(1, c2334c).sendToTarget();
        } else {
            u0(c2334c);
        }
    }

    public final void u0(C2334C c2334c) {
        this.f67260s.w(c2334c);
    }

    public final boolean v0(long j10) {
        boolean z10;
        C2334C c2334c = this.f67257A;
        if (c2334c == null || (!this.f67263v && c2334c.f24293a > s0(j10))) {
            z10 = false;
        } else {
            t0(this.f67257A);
            this.f67257A = null;
            z10 = true;
        }
        if (this.f67265x && this.f67257A == null) {
            this.f67266y = true;
        }
        return z10;
    }

    public final void w0() {
        if (this.f67265x || this.f67257A != null) {
            return;
        }
        this.f67262u.f();
        O0 V10 = V();
        int o02 = o0(V10, this.f67262u, 0);
        if (o02 != -4) {
            if (o02 == -5) {
                this.f67267z = ((androidx.media3.common.a) AbstractC4134a.e(V10.f56121b)).f20548t;
                return;
            }
            return;
        }
        if (this.f67262u.i()) {
            this.f67265x = true;
            return;
        }
        if (this.f67262u.f54110f >= X()) {
            Q1.b bVar = this.f67262u;
            bVar.f9212j = this.f67267z;
            bVar.q();
            C2334C a10 = ((Q1.a) Z.i(this.f67264w)).a(this.f67262u);
            if (a10 != null) {
                ArrayList arrayList = new ArrayList(a10.e());
                r0(a10, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f67257A = new C2334C(s0(this.f67262u.f54110f), arrayList);
            }
        }
    }

    public C6698c(InterfaceC6697b interfaceC6697b, Looper looper, InterfaceC6696a interfaceC6696a) {
        this(interfaceC6697b, looper, interfaceC6696a, false);
    }

    public C6698c(InterfaceC6697b interfaceC6697b, Looper looper, InterfaceC6696a interfaceC6696a, boolean z10) {
        super(5);
        this.f67260s = (InterfaceC6697b) AbstractC4134a.e(interfaceC6697b);
        this.f67261t = looper == null ? null : Z.y(looper, this);
        this.f67259r = (InterfaceC6696a) AbstractC4134a.e(interfaceC6696a);
        this.f67263v = z10;
        this.f67262u = new Q1.b();
        this.f67258B = -9223372036854775807L;
    }
}
