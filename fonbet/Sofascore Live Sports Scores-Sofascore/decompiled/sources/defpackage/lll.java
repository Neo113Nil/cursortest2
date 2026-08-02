package defpackage;

import android.graphics.Bitmap;
import com.sofascore.results.R;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class lll implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mll b;

    public /* synthetic */ lll(mll mllVar, int i) {
        this.a = i;
        this.b = mllVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        ty8 ty8Var = ty8.a;
        mll mllVar = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                ((Integer) obj3).getClass();
                ((w23) obj).getClass();
                wca.h(mllVar.c, mllVar.e, mllVar.f, null, of3Var, 0);
                aba.i(nq8.F(ty8Var, 4.0f), of3Var, 0);
                wca.h(mllVar.d, mllVar.g, mllVar.h, null, of3Var, 0);
                break;
            case 1:
                of3 of3Var2 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((o8g) obj).getClass();
                rd0.b(null, 0, 0, yqo.H(1783455452, of3Var2, new lll(mllVar, 2)), of3Var2, 3072, 7);
                aba.i(o8g.a(), of3Var2, 0);
                rd0.b(null, 0, 2, yqo.H(-1947079739, of3Var2, new lll(mllVar, 3)), of3Var2, 3072, 3);
                break;
            case 2:
                of3 of3Var3 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((w23) obj).getClass();
                Bitmap bitmap = mllVar.c;
                dt9 bx1Var = bitmap != null ? new bx1(bitmap) : null;
                Bitmap bitmap2 = mllVar.d;
                dt9 bx1Var2 = bitmap2 != null ? new bx1(bitmap2) : null;
                c5n.n(bx1Var == null ? new v20(R.drawable.team_logo_placeholder) : bx1Var, nq8.K(20.0f), 0, bx1Var == null ? new t13(new fjj(new h1g(R.color.on_color_secondary))) : null, of3Var3, 32816, 8);
                aba.i(nq8.F(ty8Var, 4.0f), of3Var3, 0);
                c5n.n(bx1Var2 == null ? new v20(R.drawable.team_logo_placeholder) : bx1Var2, nq8.K(20.0f), 0, bx1Var2 == null ? new t13(new fjj(new h1g(R.color.on_color_secondary))) : null, of3Var3, 32816, 8);
                break;
            default:
                of3 of3Var4 = (of3) obj2;
                ((Integer) obj3).getClass();
                Integer valueOf = Integer.valueOf(R.color.on_color_primary);
                ((w23) obj).getClass();
                String str = mllVar.e.a;
                String str2 = str == null ? "" : str;
                yf8 yf8Var = xth.a;
                o3a.i(str2, null, l98.j0(xth.k(), valueOf, of3Var4), 1, of3Var4, 3072, 2);
                String str3 = mllVar.g.a;
                o3a.i(str3 == null ? "" : str3, null, l98.j0(xth.k(), valueOf, of3Var4), 1, of3Var4, 3072, 2);
                break;
        }
        return Unit.a;
    }
}
