package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class x implements l, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final x f17355d;

    /* renamed from: e, reason: collision with root package name */
    public static final x[] f17356e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a, reason: collision with root package name */
    public final transient int f17357a;

    /* renamed from: b, reason: collision with root package name */
    public final transient j$.time.g f17358b;

    /* renamed from: c, reason: collision with root package name */
    public final transient String f17359c;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long C(j$.time.temporal.p pVar) {
        return j$.com.android.tools.r8.a.o(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean e(j$.time.temporal.p pVar) {
        return j$.com.android.tools.r8.a.r(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int i(j$.time.temporal.p pVar) {
        return j$.com.android.tools.r8.a.m(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object z(j$.time.x xVar) {
        return j$.com.android.tools.r8.a.v(this, xVar);
    }

    static {
        x xVar = new x(-1, j$.time.g.Z(1868, 1, 1), "Meiji");
        f17355d = xVar;
        f17356e = new x[]{xVar, new x(0, j$.time.g.Z(1912, 7, 30), "Taisho"), new x(1, j$.time.g.Z(1926, 12, 25), "Showa"), new x(2, j$.time.g.Z(1989, 1, 8), "Heisei"), new x(3, j$.time.g.Z(2019, 5, 1), "Reiwa")};
    }

    public final x l() {
        if (this == f17356e[r0.length - 1]) {
            return null;
        }
        return m(this.f17357a + 1);
    }

    public x(int i5, j$.time.g gVar, String str) {
        this.f17357a = i5;
        this.f17358b = gVar;
        this.f17359c = str;
    }

    public static x m(int i5) {
        int i10 = i5 + 1;
        if (i10 >= 0) {
            x[] xVarArr = f17356e;
            if (i10 < xVarArr.length) {
                return xVarArr[i10];
            }
        }
        throw new j$.time.b("Invalid era: " + i5);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(getValue(), j$.time.temporal.a.ERA);
    }

    public static x h(j$.time.g gVar) {
        if (gVar.V(w.f17351d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = f17356e.length - 1; length >= 0; length--) {
            x xVar = f17356e[length];
            if (gVar.compareTo(xVar.f17358b) >= 0) {
                return xVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return this.f17357a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (pVar != aVar) {
            return j$.time.temporal.q.d(this, pVar);
        }
        return u.f17349c.q(aVar);
    }

    public final String toString() {
        return this.f17359c;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new d0((byte) 5, this);
    }
}
