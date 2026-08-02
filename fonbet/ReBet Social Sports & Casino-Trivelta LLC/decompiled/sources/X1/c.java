package X1;

import b1.C2334C;
import e1.I;
import e1.J;
import e1.Q;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c extends Q1.c {

    /* renamed from: a, reason: collision with root package name */
    public final J f13383a = new J();

    /* renamed from: b, reason: collision with root package name */
    public final I f13384b = new I();

    /* renamed from: c, reason: collision with root package name */
    public Q f13385c;

    @Override // Q1.c
    public C2334C b(Q1.b bVar, ByteBuffer byteBuffer) {
        Q q10 = this.f13385c;
        if (q10 == null || bVar.f9212j != q10.f()) {
            Q q11 = new Q(bVar.f54110f);
            this.f13385c = q11;
            q11.a(bVar.f54110f - bVar.f9212j);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f13383a.Z(array, limit);
        this.f13384b.o(array, limit);
        this.f13384b.r(39);
        long h10 = (this.f13384b.h(1) << 32) | this.f13384b.h(32);
        this.f13384b.r(20);
        int h11 = this.f13384b.h(12);
        int h12 = this.f13384b.h(8);
        this.f13383a.c0(14);
        C2334C.a d10 = h12 != 0 ? h12 != 255 ? h12 != 4 ? h12 != 5 ? h12 != 6 ? null : g.d(this.f13383a, h10, this.f13385c) : d.d(this.f13383a, h10, this.f13385c) : f.d(this.f13383a) : a.d(this.f13383a, h11, h10) : new e();
        return d10 == null ? new C2334C(new C2334C.a[0]) : new C2334C(d10);
    }
}
