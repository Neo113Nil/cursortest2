package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uwe {
    public final ale a;
    public final mnc b;
    public final int[] c;

    static {
        i6c.a("media3.ui.compose");
    }

    public uwe(ale aleVar, int[] iArr, mnc mncVar) {
        this.a = aleVar;
        this.b = mncVar;
        this.c = iArr;
        mncVar.invoke(aleVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sq3 sq3Var) {
        twe tweVar;
        int i;
        if (sq3Var instanceof twe) {
            tweVar = (twe) sq3Var;
            int i2 = tweVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tweVar.t = i2 - Integer.MIN_VALUE;
                Object obj = tweVar.r;
                lu3 lu3Var = lu3.a;
                i = tweVar.t;
                if (i == 0) {
                    if (i == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                y6a.M(obj);
                mnc mncVar = this.b;
                ale aleVar = this.a;
                mncVar.invoke(aleVar);
                int[] iArr = this.c;
                int[] copyOf = Arrays.copyOf(iArr, iArr.length);
                t1d t1dVar = new t1d(this, 13);
                tweVar.t = 1;
                t6a.A(aleVar, 4, copyOf, t1dVar, tweVar);
                return;
            }
        }
        tweVar = new twe(this, sq3Var);
        Object obj2 = tweVar.r;
        lu3 lu3Var2 = lu3.a;
        i = tweVar.t;
        if (i == 0) {
        }
    }
}
