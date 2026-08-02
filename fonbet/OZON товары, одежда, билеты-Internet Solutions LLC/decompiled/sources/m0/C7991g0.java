package m0;

import hd.C6915b;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.ranges.IntRange;
import m0.C7989f0;

/* renamed from: m0.g0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7991g0 extends AbstractC7737t implements Function1<Long, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7989f0<Object> f73756b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7991g0(C7989f0<Object> c7989f0) {
        super(1);
        this.f73756b = c7989f0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l11) {
        long j11;
        float f7;
        androidx.collection.J j12;
        C7989f0.b bVar;
        androidx.collection.J j13;
        D0 d02;
        androidx.collection.J j14;
        long longValue = l11.longValue();
        C7989f0<Object> c7989f0 = this.f73756b;
        j11 = ((C7989f0) c7989f0).f73731l;
        ((C7989f0) c7989f0).f73731l = longValue;
        double d11 = longValue - j11;
        f7 = ((C7989f0) c7989f0).f73735p;
        long d12 = C6915b.d(d11 / f7);
        j12 = ((C7989f0) c7989f0).f73732m;
        int i11 = 0;
        if (j12.f38647b != 0) {
            j13 = ((C7989f0) c7989f0).f73732m;
            Object[] objArr = j13.f38646a;
            int i12 = j13.f38647b;
            for (int i13 = 0; i13 < i12; i13++) {
                C7989f0.b bVar2 = (C7989f0.b) objArr[i13];
                C7989f0.r(c7989f0, bVar2, d12);
                bVar2.k(true);
            }
            d02 = ((C7989f0) c7989f0).f73724e;
            if (d02 != null) {
                d02.D();
            }
            j14 = ((C7989f0) c7989f0).f73732m;
            int i14 = j14.f38647b;
            Object[] objArr2 = j14.f38646a;
            IntRange o11 = kotlin.ranges.h.o(0, i14);
            int f71842a = o11.getF71842a();
            int f71843b = o11.getF71843b();
            if (f71842a <= f71843b) {
                while (true) {
                    objArr2[f71842a - i11] = objArr2[f71842a];
                    if (((C7989f0.b) objArr2[f71842a]).h()) {
                        i11++;
                    }
                    if (f71842a == f71843b) {
                        break;
                    }
                    f71842a++;
                }
            }
            C7705l.x(objArr2, null, i14 - i11, i14);
            j14.f38647b -= i11;
        }
        bVar = ((C7989f0) c7989f0).f73733n;
        if (bVar != null) {
            bVar.l(c7989f0.G());
            C7989f0.r(c7989f0, bVar, d12);
            C7989f0.v(c7989f0, bVar.g());
            if (bVar.g() == 1.0f) {
                ((C7989f0) c7989f0).f73733n = null;
            }
            c7989f0.L();
        }
        return Unit.f71690a;
    }
}
