package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class g6l implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Bitmap c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ jfj e;

    public /* synthetic */ g6l(boolean z, Bitmap bitmap, Integer num, jfj jfjVar, int i) {
        this.a = i;
        this.b = z;
        this.c = bitmap;
        this.d = num;
        this.e = jfjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    z9.b(this.b, true, this.c, null, false, false, this.d, this.e, null, av8Var, 224304);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    z9.b(this.b, false, this.c, null, false, false, this.d, this.e, null, av8Var2, 224304);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                av8 av8Var3 = (av8) of3Var;
                if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                    z9.b(this.b, true, this.c, null, false, true, this.d, this.e, null, av8Var3, 224304);
                } else {
                    av8Var3.W();
                }
                break;
            default:
                av8 av8Var4 = (av8) of3Var;
                if (av8Var4.T(intValue & 1, (intValue & 3) != 2)) {
                    z9.b(this.b, false, this.c, null, false, true, this.d, this.e, null, av8Var4, 224304);
                } else {
                    av8Var4.W();
                }
                break;
        }
        return Unit.a;
    }
}
