package defpackage;

import android.graphics.Bitmap;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class cuh implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ cuh(y7l y7lVar, boolean z, String str, String str2, boolean z2, tee teeVar, boolean z3, boolean z4) {
        this.f = y7lVar;
        this.b = z;
        this.g = str;
        this.h = str2;
        this.c = z2;
        this.i = teeVar;
        this.d = z3;
        this.e = z4;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        Integer num;
        int i = this.a;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                y7l y7lVar = (y7l) serializable;
                tee teeVar = (tee) obj4;
                of3 of3Var = (of3) obj2;
                ((Integer) obj3).getClass();
                ((w23) obj).getClass();
                haa.i(y7lVar, this.b, (String) obj6, (String) obj5, this.c, null, of3Var, 0);
                if (teeVar.isEmpty()) {
                    av8 av8Var = (av8) of3Var;
                    av8Var.d0(1757311724);
                    o6a.b(null, av8Var, 0);
                    av8Var.s(false);
                } else {
                    av8 av8Var2 = (av8) of3Var;
                    av8Var2.d0(1757378963);
                    nq8.q(y7lVar, teeVar, null, av8Var2, 0);
                    aba.i(w23.a(), av8Var2, 0);
                    o6a.i(y7lVar, this.d, this.e, null, av8Var2, 0);
                    av8Var2.s(false);
                }
                break;
            default:
                jfj jfjVar = (jfj) serializable;
                final Bitmap bitmap = (Bitmap) obj6;
                final Integer num2 = (Integer) obj5;
                final Bitmap bitmap2 = (Bitmap) obj4;
                of3 of3Var2 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((w23) obj).getClass();
                aba.i(nq8.F(ty8.a, this.b ? 14.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), of3Var2, 0);
                final boolean z = this.c;
                final boolean z2 = this.d;
                final boolean z3 = this.e;
                nq8.g(null, 0, 0, yqo.H(-1196340266, of3Var2, new ct8() { // from class: x7l
                    @Override // defpackage.ct8
                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        of3 of3Var3 = (of3) obj8;
                        ((Integer) obj9).getClass();
                        ((o8g) obj7).getClass();
                        Bitmap bitmap3 = bitmap;
                        Integer num3 = num2;
                        boolean z4 = z;
                        boolean z5 = z2;
                        z9.c(bitmap3, num3, z4, z5, null, of3Var3, 0, 16);
                        boolean z6 = z3;
                        Bitmap bitmap4 = z6 ? bitmap2 : null;
                        if (!z6) {
                            num3 = null;
                        }
                        z9.c(bitmap4, num3, false, z5, nq8.K(z6 ? 16.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), of3Var3, 384, 0);
                        return Unit.a;
                    }
                }), of3Var2, 3072, 7);
                if (jfjVar == null || (str = jfjVar.a) == null) {
                    str = "";
                }
                String str2 = str;
                yf8 yf8Var = xth.a;
                o3a.i(str2, null, l98.j0(xth.c(), Integer.valueOf((jfjVar == null || (num = jfjVar.b) == null) ? R.color.n_lv_1 : num.intValue()), of3Var2), 1, of3Var2, 3072, 2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cuh(boolean z, jfj jfjVar, Bitmap bitmap, Integer num, boolean z2, boolean z3, boolean z4, Bitmap bitmap2) {
        this.b = z;
        this.f = jfjVar;
        this.g = bitmap;
        this.h = num;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.i = bitmap2;
    }
}
