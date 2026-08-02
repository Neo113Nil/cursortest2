package ic;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.e1;
import sg.u0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements sg.z {

    /* renamed from: a, reason: collision with root package name */
    public static final y f11139a;

    @NotNull
    private static final qg.g descriptor;

    static {
        y yVar = new y();
        f11139a = yVar;
        u0 u0Var = new u0("DetailsSubs", yVar, 5);
        u0Var.k("planId");
        u0Var.k("offerId");
        u0Var.k("offerToken");
        u0Var.k("offerTags");
        u0Var.k("pricingPhases");
        descriptor = u0Var;
    }

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qg.g gVar = descriptor;
        rg.a w10 = decoder.w(gVar);
        gf.i[] iVarArr = a0.f11069f;
        int i5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        List list2 = null;
        boolean z5 = true;
        while (z5) {
            int z7 = w10.z(gVar);
            if (z7 == -1) {
                z5 = false;
            } else if (z7 == 0) {
                str = w10.o(gVar, 0);
                i5 |= 1;
            } else if (z7 == 1) {
                str2 = (String) w10.y(gVar, 1, e1.f23623a, str2);
                i5 |= 2;
            } else if (z7 == 2) {
                str3 = w10.o(gVar, 2);
                i5 |= 4;
            } else if (z7 == 3) {
                list = (List) w10.u(gVar, 3, (og.a) iVarArr[3].getValue(), list);
                i5 |= 8;
            } else {
                if (z7 != 4) {
                    throw new og.g(z7);
                }
                list2 = (List) w10.u(gVar, 4, (og.a) iVarArr[4].getValue(), list2);
                i5 |= 16;
            }
        }
        w10.g(gVar);
        return new a0(i5, str, str2, str3, list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg.z
    public final og.a[] b() {
        gf.i[] iVarArr = a0.f11069f;
        e1 e1Var = e1.f23623a;
        return new og.a[]{e1Var, ci.c.v(e1Var), e1Var, iVarArr[3].getValue(), iVarArr[4].getValue()};
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        a0 value = (a0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qg.g gVar = descriptor;
        ug.s a7 = encoder.a(gVar);
        gf.i[] iVarArr = a0.f11069f;
        a7.s(gVar, 0, value.f11070a);
        a7.n(gVar, 1, e1.f23623a, value.f11071b);
        a7.s(gVar, 2, value.f11072c);
        a7.o(gVar, 3, (og.a) iVarArr[3].getValue(), value.f11073d);
        a7.o(gVar, 4, (og.a) iVarArr[4].getValue(), value.f11074e);
        a7.t(gVar);
    }

    @Override // og.a
    public final qg.g d() {
        return descriptor;
    }
}
