package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ffh implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ffh(int i, int i2, String str, List list) {
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = str;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                final List list = (List) obj5;
                final String str = (String) obj4;
                xtc xtcVar = (xtc) obj;
                ((Integer) obj3).getClass();
                xtcVar.getClass();
                av8 av8Var = (av8) ((of3) obj2);
                av8Var.d0(1291162754);
                Object O = av8Var.O();
                Object obj6 = nf3.a;
                if (O == obj6) {
                    O = e.f(Boolean.TRUE);
                    av8Var.n0(O);
                }
                e1d e1dVar = (e1d) O;
                Object O2 = av8Var.O();
                if (O2 == obj6) {
                    O2 = e.f(Boolean.TRUE);
                    av8Var.n0(O2);
                }
                e1d e1dVar2 = (e1d) O2;
                Object O3 = av8Var.O();
                if (O3 == obj6) {
                    O3 = ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    av8Var.n0(O3);
                }
                final q50 q50Var = (q50) O3;
                final int t = ao2.t((Context) av8Var.k(nz.b), 80.0f);
                final float f = 800.0f + t;
                Boolean bool = (Boolean) e1dVar2.getValue();
                bool.getClass();
                int i2 = this.b;
                boolean e = av8Var.e(i2);
                int i3 = this.c;
                boolean e2 = av8Var.e(i3) | e | av8Var.i(q50Var) | av8Var.d(f) | av8Var.e(800);
                Object O4 = av8Var.O();
                if (e2 || O4 == obj6) {
                    Object hfhVar = new hfh(i2, i3, q50Var, f, e1dVar, e1dVar2, null);
                    av8Var.n0(hfhVar);
                    O4 = hfhVar;
                }
                hz8.o(av8Var, bool, (Function2) O4);
                boolean i4 = av8Var.i(q50Var) | av8Var.h(false) | av8Var.i(list) | av8Var.d(f) | av8Var.e(t) | av8Var.d(160.0f) | av8Var.g(str);
                Object O5 = av8Var.O();
                if (i4 || O5 == obj6) {
                    O5 = new Function1() { // from class: gfh
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            yma ymaVar = (yma) obj7;
                            ymaVar.getClass();
                            ymaVar.a();
                            wj2 wj2Var = ymaVar.a;
                            q50 q50Var2 = q50.this;
                            if (((Number) q50Var2.d()).floatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                float intBitsToFloat = Float.intBitsToFloat((int) (wj2Var.n() >> 32));
                                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                                b20 a = e20.a();
                                Matrix matrix = new Matrix();
                                RectF rectF = new RectF();
                                p95 p95Var = new p95(1);
                                ArrayList arrayList = p95Var.a;
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    p95Var.a = arrayList;
                                } else {
                                    arrayList.clear();
                                }
                                p95Var.b(str, arrayList);
                                ArrayList arrayList2 = p95Var.a;
                                b20 J = arrayList2 != null ? wca.J(arrayList2, a) : e20.a();
                                oqf e3 = J.e();
                                Rect rect = new Rect((int) e3.a, (int) e3.b, (int) e3.c, (int) e3.d);
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) / rect.width();
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) / rect.height();
                                Path path = J.a;
                                matrix.setScale(intBitsToFloat2, intBitsToFloat3, rectF.centerX(), rectF.centerY());
                                path.computeBounds(rectF, true);
                                path.transform(matrix);
                                b20 b20Var = new b20(path);
                                float floatValue = ((Number) q50Var2.d()).floatValue();
                                float f2 = f;
                                ha5.D(ymaVar, b20Var, new v7b(list, null, (Float.floatToRawIntBits(((Float.intBitsToFloat((int) (wj2Var.n() >> 32)) * (floatValue / f2)) * 3.0f) - t) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits((Float.intBitsToFloat((int) (wj2Var.n() >> 32)) * (((Number) q50Var2.d()).floatValue() / f2)) * 3.0f) << 32) | (Float.floatToRawIntBits(160.0f) & 4294967295L)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 9, 28);
                            }
                            return Unit.a;
                        }
                    };
                    av8Var.n0(O5);
                }
                xtc Z = td4.Z(xtcVar, (Function1) O5);
                av8Var.s(false);
                return Z;
            default:
                mll mllVar = (mll) obj4;
                of3 of3Var = (of3) obj2;
                ((Integer) obj3).getClass();
                ((w23) obj).getClass();
                String string = ((Context) obj5).getString(this.b);
                string.getClass();
                yf8 yf8Var = xth.a;
                o3a.i(string, null, l98.j0(xth.c(), Integer.valueOf(this.c), of3Var), 1, of3Var, 3072, 2);
                int ordinal = mllVar.b.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    av8 av8Var2 = (av8) of3Var;
                    av8Var2.d0(1919310940);
                    wca.a(mllVar, w23.a(), av8Var2, 0);
                    av8Var2.s(false);
                } else {
                    if (ordinal != 2) {
                        throw dmi.h((av8) of3Var, 2140120246, false);
                    }
                    av8 av8Var3 = (av8) of3Var;
                    av8Var3.d0(1919528281);
                    wca.b(mllVar, w23.a(), av8Var3, 0);
                    av8Var3.s(false);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ ffh(Context context, int i, int i2, mll mllVar) {
        this.d = context;
        this.b = i;
        this.c = i2;
        this.e = mllVar;
    }
}
