package ic;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.e1;
import sg.l0;
import sg.u0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements sg.z {

    /* renamed from: a, reason: collision with root package name */
    public static final v f11135a;

    @NotNull
    private static final qg.g descriptor;

    static {
        v vVar = new v();
        f11135a = vVar;
        u0 u0Var = new u0("DetailsSingle", vVar, 3);
        u0Var.k("priceAmountMicros");
        u0Var.k("priceCurrencyCode");
        u0Var.k("price");
        descriptor = u0Var;
    }

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qg.g gVar = descriptor;
        rg.a w10 = decoder.w(gVar);
        int i5 = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        boolean z5 = true;
        while (z5) {
            int z7 = w10.z(gVar);
            if (z7 == -1) {
                z5 = false;
            } else if (z7 == 0) {
                j = w10.b(gVar, 0);
                i5 |= 1;
            } else if (z7 == 1) {
                str = w10.o(gVar, 1);
                i5 |= 2;
            } else {
                if (z7 != 2) {
                    throw new og.g(z7);
                }
                str2 = w10.o(gVar, 2);
                i5 |= 4;
            }
        }
        w10.g(gVar);
        return new x(i5, j, str, str2);
    }

    @Override // sg.z
    public final og.a[] b() {
        e1 e1Var = e1.f23623a;
        return new og.a[]{l0.f23654a, e1Var, e1Var};
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        x value = (x) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qg.g descriptor2 = descriptor;
        ug.s a7 = encoder.a(descriptor2);
        long j = value.f11136a;
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        a7.f(descriptor2, 0);
        a7.l(j);
        a7.s(descriptor2, 1, value.f11137b);
        a7.s(descriptor2, 2, value.f11138c);
        a7.t(descriptor2);
    }

    @Override // og.a
    public final qg.g d() {
        return descriptor;
    }
}
