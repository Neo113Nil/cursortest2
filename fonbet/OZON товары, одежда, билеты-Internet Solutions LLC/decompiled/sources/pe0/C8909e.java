package pe0;

import Ae.C2401k;
import Ae.C2405m;
import Ae.InterfaceC2395h;
import Sc.s;
import hd.C6915b;
import java.util.ArrayList;
import kd.C7665d;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.J;
import kotlin.ranges.IntRange;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.SphericalUtil;
import we0.m;
import we0.p;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.LocationInterpolatorImpl$startInterpolation$2", f = "LocationInterpolatorImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: pe0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8909e extends kotlin.coroutines.jvm.internal.j implements Function2<p, kotlin.coroutines.d<? super InterfaceC2395h<? extends Pair<? extends p, ? extends Long>>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f80449d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C8912h f80450e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8909e(C8912h c8912h, kotlin.coroutines.d<? super C8909e> dVar) {
        super(2, dVar);
        this.f80450e = c8912h;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C8909e c8909e = new C8909e(this.f80450e, dVar);
        c8909e.f80449d = obj;
        return c8909e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(p pVar, kotlin.coroutines.d<? super InterfaceC2395h<? extends Pair<? extends p, ? extends Long>>> dVar) {
        return ((C8909e) create(pVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        boolean z12;
        p pVar;
        p pVar2;
        p pVar3;
        int b11;
        p pVar4;
        p pVar5;
        float floatValue;
        p pVar6;
        p pVar7;
        p pVar8;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        p pVar9 = (p) this.f80449d;
        C8912h c8912h = this.f80450e;
        if (pVar9 == null) {
            return C8912h.f(c8912h, new C2405m(pVar9));
        }
        if (pVar9.d() != null) {
            pVar8 = c8912h.f80462d;
            if ((pVar8 != null ? pVar8.d() : null) == null) {
                z11 = true;
                if (pVar9.d() != null) {
                    Float d11 = pVar9.d();
                    pVar7 = c8912h.f80462d;
                    if (!Intrinsics.c(d11, pVar7 != null ? pVar7.d() : null)) {
                        z12 = true;
                        boolean z13 = !z11 || z12;
                        pVar = c8912h.f80462d;
                        if (pVar == null) {
                            c8912h.f80462d = pVar9;
                            return C8912h.f(c8912h, new C2405m(pVar9));
                        }
                        pVar2 = c8912h.f80462d;
                        Intrinsics.f(pVar2);
                        double computeDistanceBetween = SphericalUtil.computeDistanceBetween(pVar2.e(), pVar9.e());
                        if (computeDistanceBetween <= 10.0d) {
                            pVar6 = c8912h.f80462d;
                            if (Intrinsics.c(pVar6 != null ? pVar6.d() : null, pVar9.d())) {
                                c8912h.f80462d = pVar9;
                                return C8912h.f(c8912h, new C2405m(pVar9));
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        pVar3 = c8912h.f80462d;
                        Intrinsics.f(pVar3);
                        m e11 = pVar3.e();
                        m e12 = pVar9.e();
                        int i11 = 5;
                        if (computeDistanceBetween < 5.0d) {
                            b11 = 5;
                        } else {
                            b11 = computeDistanceBetween < 30.0d ? 50 : C6915b.b(computeDistanceBetween);
                            if (b11 > 200) {
                                b11 = 200;
                            }
                        }
                        Float d12 = pVar9.d();
                        pVar4 = c8912h.f80462d;
                        Float d13 = pVar4 != null ? pVar4.d() : null;
                        if (d13 != null && d12 != null && Math.abs(d12.floatValue() - d13.floatValue()) >= 5.0f) {
                            i11 = 30;
                        }
                        pVar5 = c8912h.f80462d;
                        Float d14 = pVar5 != null ? pVar5.d() : null;
                        float f7 = 0.0f;
                        if (d14 == null) {
                            floatValue = 0.0f;
                        } else {
                            float f11 = 360;
                            floatValue = ((d14.floatValue() % f11) + f11) % f11;
                        }
                        Float d15 = pVar9.d();
                        if (d15 != null) {
                            float floatValue2 = d15.floatValue();
                            float f12 = 360;
                            f7 = ((floatValue2 % f12) + f12) % f12;
                        }
                        float f13 = 360;
                        float f14 = (f7 - floatValue) % f13;
                        if (f14 > 180.0f) {
                            f14 -= f13;
                        }
                        if (f14 < -180.0f) {
                            f14 += f13;
                        }
                        J j11 = new J();
                        float f15 = ((f14 + floatValue) - floatValue) % f13;
                        j11.f71784a = f15;
                        if (f15 > 180.0f) {
                            j11.f71784a = f15 - f13;
                        }
                        float f16 = j11.f71784a;
                        if (f16 < -180.0f) {
                            j11.f71784a = f16 + f13;
                        }
                        int max = Math.max(b11, i11);
                        C7665d it = new IntRange(1, max, 1).iterator();
                        while (it.hasNext()) {
                            int b12 = it.b();
                            boolean z14 = z13;
                            double d16 = b12 / max;
                            float f17 = floatValue;
                            m mVar = e11;
                            m mVar2 = new m(((e12.getLatitude() - e11.getLatitude()) * d16) + e11.getLatitude(), ((e12.getLongitude() - e11.getLongitude()) * d16) + e11.getLongitude());
                            arrayList.add(z14 ? p.a(pVar9, mVar2, new Float(((((j11.f71784a * (b12 / max)) + f17) % f13) + f13) % f13), null, 60) : p.a(pVar9, mVar2, null, null, 62));
                            z13 = z14;
                            e11 = mVar;
                            floatValue = f17;
                        }
                        c8912h.f80462d = pVar9;
                        return new C8911g(new C2401k(arrayList));
                    }
                }
                z12 = false;
                if (z11) {
                }
                pVar = c8912h.f80462d;
                if (pVar == null) {
                }
            }
        }
        z11 = false;
        if (pVar9.d() != null) {
        }
        z12 = false;
        if (z11) {
        }
        pVar = c8912h.f80462d;
        if (pVar == null) {
        }
    }
}
