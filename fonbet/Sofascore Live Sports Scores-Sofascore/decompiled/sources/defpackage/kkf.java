package defpackage;

import android.graphics.Bitmap;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class kkf implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Serializable j;
    public final /* synthetic */ Object k;

    public /* synthetic */ kkf(int i, Bitmap bitmap, jfj jfjVar, int i2, jfj jfjVar2, jfj jfjVar3, boolean z, int i3, vy8 vy8Var, int i4) {
        this.b = i;
        this.g = bitmap;
        this.h = jfjVar;
        this.c = i2;
        this.i = jfjVar2;
        this.j = jfjVar3;
        this.d = z;
        this.e = i3;
        this.k = vy8Var;
        this.f = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.f;
        Object obj3 = this.k;
        Serializable serializable = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                b6a.e((gv9) obj6, (tee) obj4, (gv9) obj5, this.b, this.c, this.d, this.e, (Integer) serializable, (xtc) obj3, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                hda.j(this.b, (Bitmap) obj6, (jfj) obj5, this.c, (jfj) obj4, (jfj) serializable, this.d, this.e, (vy8) obj3, (of3) obj, K2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ kkf(gv9 gv9Var, tee teeVar, gv9 gv9Var2, int i, int i2, boolean z, int i3, Integer num, xtc xtcVar, int i4) {
        this.g = gv9Var;
        this.i = teeVar;
        this.h = gv9Var2;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
        this.j = num;
        this.k = xtcVar;
        this.f = i4;
    }
}
