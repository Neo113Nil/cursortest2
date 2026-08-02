package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class f12 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ m1c d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ f12(qhe qheVar, g1c g1cVar, m1c m1cVar, int i, int i2, g12 g12Var) {
        this.e = qheVar;
        this.f = g1cVar;
        this.d = m1cVar;
        this.b = i;
        this.c = i2;
        this.g = g12Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.g;
        m1c m1cVar = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                e12.d((phe) obj, (qhe) obj4, (g1c) obj3, m1cVar.getLayoutDirection(), this.b, this.c, ((g12) obj2).a);
                break;
            default:
                qhe[] qheVarArr = (qhe[]) obj4;
                u23 u23Var = (u23) obj3;
                int[] iArr = (int[]) obj2;
                phe pheVar = (phe) obj;
                int length = qheVarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    qhe qheVar = qheVarArr[i2];
                    int i4 = i3 + 1;
                    qheVar.getClass();
                    Object h = qheVar.h();
                    h8g h8gVar = h instanceof h8g ? (h8g) h : null;
                    ema layoutDirection = m1cVar.getLayoutDirection();
                    c5n c5nVar = h8gVar != null ? h8gVar.c : null;
                    int i5 = this.b;
                    pheVar.e(qheVar, c5nVar != null ? c5nVar.s(i5, qheVar.a, layoutDirection, qheVar, this.c) : u23Var.b.a(qheVar.a, i5, layoutDirection), iArr[i3], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    i2++;
                    i3 = i4;
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ f12(qhe[] qheVarArr, u23 u23Var, int i, int i2, m1c m1cVar, int[] iArr) {
        this.e = qheVarArr;
        this.f = u23Var;
        this.b = i;
        this.c = i2;
        this.d = m1cVar;
        this.g = iArr;
    }
}
