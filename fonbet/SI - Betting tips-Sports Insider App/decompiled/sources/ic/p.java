package ic;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.e1;
import sg.u0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements sg.z {

    /* renamed from: a, reason: collision with root package name */
    public static final p f11130a;

    @NotNull
    private static final qg.g descriptor;

    static {
        p pVar = new p();
        f11130a = pVar;
        u0 u0Var = new u0("ProductDetails", pVar, 7);
        u0Var.k("typeInt");
        u0Var.k("productId");
        u0Var.k("productName");
        u0Var.k("description");
        u0Var.k("iconUrl");
        u0Var.k("detailsSingle");
        u0Var.k("detailsSubs");
        descriptor = u0Var;
    }

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qg.g gVar = descriptor;
        rg.a w10 = decoder.w(gVar);
        gf.i[] iVarArr = e0.f11105h;
        int i5 = 0;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        j jVar = null;
        List list = null;
        boolean z5 = true;
        while (z5) {
            int z7 = w10.z(gVar);
            switch (z7) {
                case -1:
                    z5 = false;
                    break;
                case 0:
                    i10 = w10.m(gVar, 0);
                    i5 |= 1;
                    break;
                case 1:
                    str = w10.o(gVar, 1);
                    i5 |= 2;
                    break;
                case 2:
                    str2 = w10.o(gVar, 2);
                    i5 |= 4;
                    break;
                case 3:
                    str3 = w10.o(gVar, 3);
                    i5 |= 8;
                    break;
                case 4:
                    str4 = (String) w10.y(gVar, 4, e1.f23623a, str4);
                    i5 |= 16;
                    break;
                case 5:
                    jVar = (j) w10.y(gVar, 5, r.f11132c, jVar);
                    i5 |= 32;
                    break;
                case 6:
                    list = (List) w10.y(gVar, 6, (og.a) iVarArr[6].getValue(), list);
                    i5 |= 64;
                    break;
                default:
                    throw new og.g(z7);
            }
        }
        w10.g(gVar);
        return new e0(i5, i10, str, str2, str3, str4, jVar, list);
    }

    @Override // sg.z
    public final og.a[] b() {
        gf.i[] iVarArr = e0.f11105h;
        e1 e1Var = e1.f23623a;
        return new og.a[]{sg.f0.f23626a, e1Var, e1Var, e1Var, ci.c.v(e1Var), ci.c.v(r.f11132c), ci.c.v((og.a) iVarArr[6].getValue())};
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        e0 value = (e0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qg.g gVar = descriptor;
        ug.s a7 = encoder.a(gVar);
        gf.i[] iVarArr = e0.f11105h;
        a7.k(0, value.f11107a, gVar);
        a7.s(gVar, 1, value.f11108b);
        a7.s(gVar, 2, value.f11109c);
        a7.s(gVar, 3, value.f11110d);
        a7.n(gVar, 4, e1.f23623a, value.f11111e);
        a7.n(gVar, 5, r.f11132c, value.f11112f);
        a7.n(gVar, 6, (og.a) iVarArr[6].getValue(), value.f11113g);
        a7.t(gVar);
    }

    @Override // og.a
    public final qg.g d() {
        return descriptor;
    }
}
