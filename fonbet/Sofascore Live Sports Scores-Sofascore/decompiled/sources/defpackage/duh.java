package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class duh implements ct8 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ duh(int i, lrh lrhVar, boolean z) {
        this.d = i;
        this.c = lrhVar;
        this.b = z;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        ty8 ty8Var = ty8.a;
        boolean z = this.b;
        Object obj4 = this.c;
        int i2 = this.d;
        switch (i) {
            case 0:
                Context context = (Context) obj4;
                of3 of3Var = (of3) obj2;
                ((Integer) obj3).getClass();
                ((o8g) obj).getClass();
                c5n.n(new v20(R.drawable.ic_chevron_left_large_16), h5a.N(nq8.K(20.0f), 2.0f), 0, new t13(new fjj(new h1g(i2))), of3Var, 32816, 8);
                aba.i(nq8.N(ty8Var, 4.0f), of3Var, 0);
                if (z) {
                    av8 av8Var = (av8) of3Var;
                    av8Var.d0(-328546450);
                    av8Var.s(false);
                } else {
                    av8 av8Var2 = (av8) of3Var;
                    av8Var2.d0(-328737689);
                    String string = context.getString(R.string.previous);
                    string.getClass();
                    yf8 yf8Var = xth.a;
                    o3a.i(string, null, l98.j0(xth.k(), Integer.valueOf(i2), av8Var2), 0, av8Var2, 0, 10);
                    av8Var2.s(false);
                }
                break;
            case 1:
                Context context2 = (Context) obj4;
                of3 of3Var2 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((o8g) obj).getClass();
                if (z) {
                    av8 av8Var3 = (av8) of3Var2;
                    av8Var3.d0(1411422295);
                    av8Var3.s(false);
                } else {
                    av8 av8Var4 = (av8) of3Var2;
                    av8Var4.d0(1411238744);
                    String string2 = context2.getString(R.string.next);
                    string2.getClass();
                    yf8 yf8Var2 = xth.a;
                    o3a.i(string2, null, l98.j0(xth.k(), Integer.valueOf(i2), av8Var4), 0, av8Var4, 0, 10);
                    av8Var4.s(false);
                }
                aba.i(nq8.N(ty8Var, 4.0f), of3Var2, 0);
                c5n.n(new v20(R.drawable.ic_chevron_right_large_16), h5a.N(nq8.K(20.0f), 2.0f), 0, new t13(new fjj(new h1g(i2))), of3Var2, 32816, 8);
                break;
            default:
                lrh lrhVar = (lrh) obj4;
                of3 of3Var3 = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var5 = (av8) of3Var3;
                if (av8Var5.T(intValue & 1, (intValue & 17) != 16)) {
                    kq9.b(s6a.N(i2, 6, av8Var5), null, bkh.l(utc.a, 24.0f), lrhVar.c(z, true, av8Var5), av8Var5, 432, 0);
                } else {
                    av8Var5.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ duh(int i, boolean z, Context context) {
        this.d = i;
        this.b = z;
        this.c = context;
    }

    public /* synthetic */ duh(boolean z, Context context, int i) {
        this.b = z;
        this.c = context;
        this.d = i;
    }
}
