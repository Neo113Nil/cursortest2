package yi;

import C.InterfaceC2694n;
import Sc.r;
import Sc.s;
import V.g;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import xe.M;
import yi.c;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.data.CameraDeviceScanner$scan$2", f = "CameraDeviceScanner.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super c.b>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c f106671d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f106672e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(c cVar, Context context, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f106671d = cVar;
        this.f106672e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f106671d, this.f106672e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super c.b> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Pair pair;
        Object a12;
        Throwable b11;
        Integer num;
        float floatValue;
        String c11;
        Range range;
        Float f7;
        Float f11;
        CameraCharacteristics.Key key;
        Float D11;
        c cVar = this.f106671d;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        ArrayList arrayList = new ArrayList();
        I i11 = new I();
        Context context = this.f106672e;
        Object obj2 = null;
        try {
            r.Companion companion = r.INSTANCE;
            int i12 = V.g.f27884i;
            Iterator it = ((V.g) g.a.a(context).get()).g().iterator();
            while (it.hasNext()) {
                InterfaceC2694n interfaceC2694n = (InterfaceC2694n) it.next();
                try {
                    r.Companion companion2 = r.INSTANCE;
                    B.h a13 = B.h.a(interfaceC2694n);
                    Intrinsics.checkNotNullExpressionValue(a13, "from(...)");
                    num = (Integer) a13.b(CameraCharacteristics.LENS_FACING);
                    float[] fArr = (float[]) a13.b(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    floatValue = (fArr == null || (D11 = C7705l.D(fArr)) == null) ? Float.MAX_VALUE : D11.floatValue();
                    c11 = a13.c();
                    Intrinsics.checkNotNullExpressionValue(c11, "getCameraId(...)");
                    if (Build.VERSION.SDK_INT >= 30) {
                        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                        range = (Range) a13.b(key);
                    } else {
                        range = null;
                    }
                } catch (CancellationException e11) {
                    throw e11;
                } catch (Throwable th2) {
                    r.Companion companion3 = r.INSTANCE;
                    a12 = s.a(th2);
                }
                if (num != null && num.intValue() == 1) {
                    arrayList.add(new c.a(floatValue, (range == null || (f11 = (Float) range.getLower()) == null) ? 1.0f : f11.floatValue(), (range == null || (f7 = (Float) range.getUpper()) == null) ? 1.0f : f7.floatValue(), c11));
                    a12 = Unit.f71690a;
                    b11 = r.b(a12);
                    if (b11 == null) {
                        cVar.d(b11, "scan camera info exception", U.i(new Pair("info", interfaceC2694n.toString())));
                    }
                }
                if (num.intValue() == 0) {
                    i11.f71783a = true;
                }
                a12 = Unit.f71690a;
                b11 = r.b(a12);
                if (b11 == null) {
                }
            }
            a11 = Unit.f71690a;
        } catch (CancellationException e12) {
            throw e12;
        } catch (Throwable th3) {
            r.Companion companion4 = r.INSTANCE;
            a11 = s.a(th3);
        }
        Throwable b12 = r.b(a11);
        if (b12 != null) {
            cVar.d(b12, "scan exception", U.c());
        }
        boolean z11 = i11.f71783a;
        boolean isEmpty = arrayList.isEmpty();
        cVar.getClass();
        String str = (z11 || !isEmpty) ? null : "camera device is missing";
        if (arrayList.isEmpty() && !i11.f71783a) {
            return new c.b(false, false, false, false, 1.0f, str);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((c.a) next).b() < 0.9f) {
                obj2 = next;
                break;
            }
        }
        c.a aVar2 = (c.a) obj2;
        if (aVar2 != null) {
            pair = new Pair(Boolean.TRUE, Float.valueOf(aVar2.b()));
        } else {
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Float.valueOf(((c.a) it3.next()).a()));
            }
            pair = C7714v.H0(C7714v.C(arrayList2)).size() < 2 ? new Pair(Boolean.FALSE, Float.valueOf(1.0f)) : new Pair(Boolean.TRUE, Float.valueOf(kotlin.ranges.h.d(((int) ((((Number) C7714v.K(r1)).floatValue() / ((Number) r1.get(1)).floatValue()) * 10)) / 10.0f, 0.3f, 1.0f)));
        }
        boolean booleanValue = ((Boolean) pair.a()).booleanValue();
        float floatValue2 = ((Number) pair.b()).floatValue();
        ArrayList arrayList3 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Float.valueOf(((c.a) it4.next()).a()));
        }
        return new c.b(i11.f71783a, !arrayList.isEmpty(), booleanValue, C7714v.C(arrayList3).size() >= 3, floatValue2, str);
    }
}
