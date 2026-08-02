package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import java.util.Locale;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class c82 implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ c82(String str, boolean z) {
        this.c = str;
        this.b = z;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String upperCase = this.c.toUpperCase(locale);
                    upperCase.getClass();
                    yf8 yf8Var = xth.a;
                    udj.c(upperCase, utc.a, 0L, null, 0L, z ? wg8.j : wg8.h, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.a(), av8Var, 48, 0, 129980);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj2;
                ((Integer) obj3).getClass();
                Integer valueOf = Integer.valueOf(R.color.surface_2);
                ((w23) obj).getClass();
                if (z) {
                    av8 av8Var2 = (av8) of3Var2;
                    av8Var2.d0(-180771595);
                    av8Var2.s(false);
                } else {
                    av8 av8Var3 = (av8) of3Var2;
                    av8Var3.d0(-181021455);
                    String string = ((Context) av8Var3.k(bh3.b)).getString(R.string.updated);
                    string.getClass();
                    yf8 yf8Var2 = xth.a;
                    o3a.i(string, null, l98.j0(xth.c(), valueOf, av8Var3), 0, av8Var3, 0, 10);
                    av8Var3.s(false);
                }
                yf8 yf8Var3 = xth.a;
                o3a.i(this.c, null, l98.j0(xth.c(), valueOf, of3Var2), 0, of3Var2, 0, 10);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ c82(boolean z, String str) {
        this.b = z;
        this.c = str;
    }
}
