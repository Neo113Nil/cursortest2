package jg;

import ig.C7073b;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import lg.AbstractC7956a;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class p extends AbstractC7956a implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final p f70057e;

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicReference<p[]> f70058f;

    /* renamed from: b, reason: collision with root package name */
    private final int f70059b;

    /* renamed from: c, reason: collision with root package name */
    private final transient ig.f f70060c;

    /* renamed from: d, reason: collision with root package name */
    private final transient String f70061d;

    static {
        p pVar = new p(-1, ig.f.E1(1868, 9, 8), "Meiji");
        f70057e = pVar;
        f70058f = new AtomicReference<>(new p[]{pVar, new p(0, ig.f.E1(1912, 7, 30), "Taisho"), new p(1, ig.f.E1(1926, 12, 25), "Showa"), new p(2, ig.f.E1(1989, 1, 8), "Heisei"), new p(3, ig.f.E1(2019, 5, 1), "Reiwa")});
    }

    private p(int i11, ig.f fVar, String str) {
        super(false);
        this.f70059b = i11;
        this.f70060c = fVar;
        this.f70061d = str;
    }

    static p H0(ig.f fVar) {
        if (fVar.x1(f70057e.f70060c)) {
            throw new C7073b("Date too early: " + fVar);
        }
        p[] pVarArr = f70058f.get();
        for (int length = pVarArr.length - 1; length >= 0; length--) {
            p pVar = pVarArr[length];
            if (fVar.compareTo(pVar.f70060c) >= 0) {
                return pVar;
            }
        }
        return null;
    }

    public static p M0(int i11) {
        p[] pVarArr = f70058f.get();
        if (i11 < f70057e.f70059b || i11 > pVarArr[pVarArr.length - 1].f70059b) {
            throw new C7073b("japaneseEra is invalid");
        }
        return pVarArr[i11 + 1];
    }

    public static p[] W0() {
        p[] pVarArr = f70058f.get();
        return (p[]) Arrays.copyOf(pVarArr, pVarArr.length);
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            return M0(this.f70059b);
        } catch (C7073b e11) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e11);
            throw invalidObjectException;
        }
    }

    private Object writeReplace() {
        return new t((byte) 2, this);
    }

    final ig.f E0() {
        int i11 = this.f70059b;
        int i12 = i11 + 1;
        p[] W02 = W0();
        return i12 >= W02.length + (-1) ? ig.f.f66411f : W02[i11 + 2].f70060c.M1(-1L);
    }

    public final int L0() {
        return this.f70059b;
    }

    final ig.f T0() {
        return this.f70060c;
    }

    final void a1(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.f70059b);
    }

    @Override // Lf.a, mg.e
    public final mg.m p(mg.h hVar) {
        EnumC8145a enumC8145a = EnumC8145a.ERA;
        return hVar == enumC8145a ? n.f70050d.n(enumC8145a) : super.p(hVar);
    }

    @Override // Lf.a
    public final String toString() {
        return this.f70061d;
    }
}
