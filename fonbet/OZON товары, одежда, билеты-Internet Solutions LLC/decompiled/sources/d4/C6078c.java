package d4;

import j3.t;
import java.nio.ByteBuffer;
import m3.C8049B;
import m3.C8050C;
import m3.C8056I;

/* renamed from: d4.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6078c extends W3.b {

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f61131a = new C8050C();

    /* renamed from: b, reason: collision with root package name */
    private final C8049B f61132b = new C8049B();

    /* renamed from: c, reason: collision with root package name */
    private C8056I f61133c;

    @Override // W3.b
    protected final t b(W3.a aVar, ByteBuffer byteBuffer) {
        C8056I c8056i = this.f61133c;
        if (c8056i == null || aVar.f33226i != c8056i.f()) {
            C8056I c8056i2 = new C8056I(aVar.f98186f);
            this.f61133c = c8056i2;
            c8056i2.a(aVar.f98186f - aVar.f33226i);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C8050C c8050c = this.f61131a;
        c8050c.P(limit, array);
        C8049B c8049b = this.f61132b;
        c8049b.l(limit, array);
        c8049b.p(39);
        long h11 = (c8049b.h(1) << 32) | c8049b.h(32);
        c8049b.p(20);
        int h12 = c8049b.h(12);
        int h13 = c8049b.h(8);
        c8050c.S(14);
        t.a d11 = h13 != 0 ? h13 != 255 ? h13 != 4 ? h13 != 5 ? h13 != 6 ? null : C6082g.d(c8050c, h11, this.f61133c) : C6079d.d(c8050c, h11, this.f61133c) : C6081f.d(c8050c) : C6076a.d(c8050c, h12, h11) : new C6080e();
        return d11 == null ? new t(new t.a[0]) : new t(d11);
    }
}
