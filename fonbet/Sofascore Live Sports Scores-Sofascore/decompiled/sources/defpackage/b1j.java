package defpackage;

import android.graphics.Bitmap;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b;
import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class b1j implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b1j(skl sklVar, vy8 vy8Var, Bitmap bitmap, Integer num, int i, int i2) {
        this.a = 6;
        this.d = sklVar;
        this.e = vy8Var;
        this.f = bitmap;
        this.b = num;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                z1a.c((String) obj6, (c1j) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                y6a.g((f4j) obj6, (Function0) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                rha.i((TopStatsCategory) obj5, (Function0) obj4, (String) obj6, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                szj.e((azj) obj6, (azj) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                b0a.i((efl) obj6, (Function1) obj4, (Function1) obj5, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                x2a.c((tee) obj6, (Function1) obj4, (wla) obj5, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                bea.j((skl) obj6, (vy8) obj5, (Bitmap) obj4, (Integer) obj3, this.c, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                s.j((b) obj6, (Function0) obj5, (gt8) obj4, (xtc) obj3, (of3) obj, i2 | 1);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ b1j(TopStatsCategory topStatsCategory, Function0 function0, String str, xtc xtcVar, int i) {
        this.a = 2;
        this.e = topStatsCategory;
        this.f = function0;
        this.d = str;
        this.b = xtcVar;
        this.c = i;
    }

    public /* synthetic */ b1j(Object obj, Object obj2, dt8 dt8Var, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.f = dt8Var;
        this.b = xtcVar;
        this.c = i;
    }

    public /* synthetic */ b1j(Object obj, Function1 function1, Object obj2, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.f = function1;
        this.e = obj2;
        this.b = xtcVar;
        this.c = i;
    }
}
