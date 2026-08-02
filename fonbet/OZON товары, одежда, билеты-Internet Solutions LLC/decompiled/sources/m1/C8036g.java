package m1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7811b0;
import m1.AbstractC8030a;
import org.jetbrains.annotations.NotNull;

/* renamed from: m1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8036g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC8032c f73960a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC8032c f73961b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC8032c f73962c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f73963d;

    /* renamed from: m1.g$a */
    /* loaded from: classes8.dex */
    public static final class a extends C8036g {

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final p f73964e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final p f73965f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final float[] f73966g;

        public a(p pVar, p pVar2) {
            super(pVar2, pVar, pVar2, null);
            float[] g10;
            AbstractC8030a.C1252a c1252a;
            AbstractC8030a.C1252a c1252a2;
            this.f73964e = pVar;
            this.f73965f = pVar2;
            if (C8033d.c(pVar.A(), pVar2.A())) {
                g10 = C8033d.g(pVar2.t(), pVar.z());
            } else {
                float[] z11 = pVar.z();
                float[] t2 = pVar2.t();
                float[] c11 = pVar.A().c();
                float[] c12 = pVar2.A().c();
                if (!C8033d.c(pVar.A(), j.b())) {
                    c1252a2 = AbstractC8030a.f73928b;
                    float[] b11 = c1252a2.b();
                    float[] copyOf = Arrays.copyOf(j.c(), 3);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                    z11 = C8033d.g(C8033d.b(b11, c11, copyOf), pVar.z());
                }
                if (!C8033d.c(pVar2.A(), j.b())) {
                    c1252a = AbstractC8030a.f73928b;
                    float[] b12 = c1252a.b();
                    float[] copyOf2 = Arrays.copyOf(j.c(), 3);
                    Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
                    t2 = C8033d.f(C8033d.g(C8033d.b(b12, c12, copyOf2), pVar2.z()));
                }
                g10 = C8033d.g(t2, z11);
            }
            this.f73966g = g10;
        }

        @Override // m1.C8036g
        public final long a(long j11) {
            float u11 = C7807Z.u(j11);
            float t2 = C7807Z.t(j11);
            float r11 = C7807Z.r(j11);
            float q11 = C7807Z.q(j11);
            p pVar = this.f73964e;
            float m11 = (float) p.m((p) pVar.r().f677a, u11);
            float m12 = (float) p.m((p) pVar.r().f677a, t2);
            float m13 = (float) p.m((p) pVar.r().f677a, r11);
            float[] fArr = this.f73966g;
            float f7 = (fArr[6] * m13) + (fArr[3] * m12) + (fArr[0] * m11);
            float f11 = (fArr[7] * m13) + (fArr[4] * m12) + (fArr[1] * m11);
            float f12 = (fArr[8] * m13) + (fArr[5] * m12) + (fArr[2] * m11);
            p pVar2 = this.f73965f;
            return C7811b0.a((float) p.n((p) pVar2.v().f59957a, f7), (float) p.n((p) pVar2.v().f59957a, f11), (float) p.n((p) pVar2.v().f59957a, f12), q11, pVar2);
        }
    }

    public C8036g(AbstractC8032c abstractC8032c, AbstractC8032c abstractC8032c2, AbstractC8032c abstractC8032c3, float[] fArr) {
        this.f73960a = abstractC8032c;
        this.f73961b = abstractC8032c2;
        this.f73962c = abstractC8032c3;
        this.f73963d = fArr;
    }

    public long a(long j11) {
        float u11 = C7807Z.u(j11);
        float t2 = C7807Z.t(j11);
        float r11 = C7807Z.r(j11);
        float q11 = C7807Z.q(j11);
        AbstractC8032c abstractC8032c = this.f73961b;
        long i11 = abstractC8032c.i(u11, t2, r11);
        float intBitsToFloat = Float.intBitsToFloat((int) (i11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (i11 & 4294967295L));
        float k11 = abstractC8032c.k(u11, t2, r11);
        float[] fArr = this.f73963d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            k11 *= fArr[2];
        }
        float f7 = intBitsToFloat;
        float f11 = intBitsToFloat2;
        return this.f73962c.l(f7, f11, k11, q11, this.f73960a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8036g(AbstractC8032c abstractC8032c, AbstractC8032c abstractC8032c2, int i11) {
        this(abstractC8032c2, r4, r5, r11);
        long j11;
        long j12;
        float[] fArr;
        long j13;
        long j14;
        long f7 = abstractC8032c.f();
        j11 = C8031b.f73930a;
        AbstractC8032c a11 = C8031b.d(f7, j11) ? C8033d.a(abstractC8032c, j.b()) : abstractC8032c;
        long f11 = abstractC8032c2.f();
        j12 = C8031b.f73930a;
        AbstractC8032c a12 = C8031b.d(f11, j12) ? C8033d.a(abstractC8032c2, j.b()) : abstractC8032c2;
        if (i11 == 3) {
            long f12 = abstractC8032c.f();
            j13 = C8031b.f73930a;
            boolean d11 = C8031b.d(f12, j13);
            long f13 = abstractC8032c2.f();
            j14 = C8031b.f73930a;
            boolean d12 = C8031b.d(f13, j14);
            if ((!d11 || !d12) && (d11 || d12)) {
                p pVar = (p) (d11 ? abstractC8032c : abstractC8032c2);
                float[] c11 = d11 ? pVar.A().c() : j.c();
                float[] c12 = d12 ? pVar.A().c() : j.c();
                fArr = new float[]{c11[0] / c12[0], c11[1] / c12[1], c11[2] / c12[2]};
            }
        }
        fArr = null;
    }
}
