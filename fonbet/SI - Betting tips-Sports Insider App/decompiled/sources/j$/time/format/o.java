package j$.time.format;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class o extends i {

    /* renamed from: h, reason: collision with root package name */
    public static final j$.time.g f17431h = j$.time.g.Z(2000, 1, 1);

    /* renamed from: g, reason: collision with root package name */
    public final j$.time.chrono.b f17432g;

    @Override // j$.time.format.i
    public final boolean b(v vVar) {
        if (vVar.f17460c) {
            return super.b(vVar);
        }
        return false;
    }

    public o(j$.time.temporal.p pVar, int i5, int i10, j$.time.chrono.b bVar, int i11) {
        super(pVar, i5, i10, f0.NOT_NEGATIVE, i11);
        this.f17432g = bVar;
    }

    @Override // j$.time.format.i
    public final long a(y yVar, long j) {
        long abs = Math.abs(j);
        j$.time.chrono.b bVar = this.f17432g;
        long i5 = bVar != null ? j$.com.android.tools.r8.a.L(yVar.f17467a).A(bVar).i(this.f17407a) : 0;
        long[] jArr = i.f17406f;
        if (j >= i5) {
            long j6 = jArr[this.f17408b];
            if (j < i5 + j6) {
                return abs % j6;
            }
        }
        return abs % jArr[this.f17409c];
    }

    @Override // j$.time.format.i
    public final int c(v vVar, long j, int i5, int i10) {
        final o oVar;
        final v vVar2;
        final long j6;
        final int i11;
        final int i12;
        int i13;
        long j10;
        j$.time.chrono.b bVar = this.f17432g;
        if (bVar != null) {
            j$.time.chrono.k kVar = vVar.c().f17386c;
            if (kVar == null && (kVar = vVar.f17458a.f17372e) == null) {
                kVar = j$.time.chrono.r.f17346c;
            }
            i13 = kVar.A(bVar).i(this.f17407a);
            oVar = this;
            vVar2 = vVar;
            j6 = j;
            i11 = i5;
            i12 = i10;
            Consumer consumer = new Consumer() { // from class: j$.time.format.n
                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }

                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void n(Object obj) {
                    o.this.c(vVar2, j6, i11, i12);
                }
            };
            if (vVar2.f17462e == null) {
                vVar2.f17462e = new ArrayList();
            }
            vVar2.f17462e.add(consumer);
        } else {
            oVar = this;
            vVar2 = vVar;
            j6 = j;
            i11 = i5;
            i12 = i10;
            i13 = 0;
        }
        int i14 = i12 - i11;
        int i15 = oVar.f17408b;
        if (i14 != i15 || j6 < 0) {
            j10 = j6;
        } else {
            long j11 = i.f17406f[i15];
            long j12 = i13;
            long j13 = j12 - (j12 % j11);
            long j14 = i13 > 0 ? j13 + j6 : j13 - j6;
            j10 = j14 < j12 ? j11 + j14 : j14;
        }
        return vVar2.f(oVar.f17407a, j10, i11, i12);
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.f17411e == -1) {
            return this;
        }
        return new o(this.f17407a, this.f17408b, this.f17409c, this.f17432g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i5) {
        return new o(this.f17407a, this.f17408b, this.f17409c, this.f17432g, this.f17411e + i5);
    }

    @Override // j$.time.format.i
    public final String toString() {
        Object obj = this.f17432g;
        if (obj == null) {
            obj = Objects.requireNonNull(0, "defaultObj");
        }
        return "ReducedValue(" + this.f17407a + StringUtils.COMMA + this.f17408b + StringUtils.COMMA + this.f17409c + StringUtils.COMMA + obj + ")";
    }
}
