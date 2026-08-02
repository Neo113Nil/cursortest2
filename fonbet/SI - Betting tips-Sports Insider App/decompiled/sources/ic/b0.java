package ic;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.e1;
import sg.l0;
import sg.u0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements sg.z {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f11084a;

    @NotNull
    private static final qg.g descriptor;

    static {
        b0 b0Var = new b0();
        f11084a = b0Var;
        u0 u0Var = new u0("PricingPhase", b0Var, 6);
        u0Var.k("formattedPrice");
        u0Var.k("priceCurrencyCode");
        u0Var.k("billingPeriod");
        u0Var.k("priceAmountMicros");
        u0Var.k("recurrenceMode");
        u0Var.k("billingCycleCount");
        descriptor = u0Var;
    }

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qg.g gVar = descriptor;
        rg.a w10 = decoder.w(gVar);
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        boolean z5 = true;
        while (z5) {
            int z7 = w10.z(gVar);
            switch (z7) {
                case -1:
                    z5 = false;
                    break;
                case 0:
                    str = w10.o(gVar, 0);
                    i5 |= 1;
                    break;
                case 1:
                    str2 = w10.o(gVar, 1);
                    i5 |= 2;
                    break;
                case 2:
                    str3 = w10.o(gVar, 2);
                    i5 |= 4;
                    break;
                case 3:
                    j = w10.b(gVar, 3);
                    i5 |= 8;
                    break;
                case 4:
                    i10 = w10.m(gVar, 4);
                    i5 |= 16;
                    break;
                case 5:
                    i11 = w10.m(gVar, 5);
                    i5 |= 32;
                    break;
                default:
                    throw new og.g(z7);
            }
        }
        w10.g(gVar);
        return new d0(i5, str, str2, str3, j, i10, i11);
    }

    @Override // sg.z
    public final og.a[] b() {
        e1 e1Var = e1.f23623a;
        sg.f0 f0Var = sg.f0.f23626a;
        return new og.a[]{e1Var, e1Var, e1Var, l0.f23654a, f0Var, f0Var};
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        d0 value = (d0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qg.g descriptor2 = descriptor;
        ug.s a7 = encoder.a(descriptor2);
        a7.s(descriptor2, 0, value.f11097a);
        a7.s(descriptor2, 1, value.f11098b);
        a7.s(descriptor2, 2, value.f11099c);
        long j = value.f11100d;
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        a7.f(descriptor2, 3);
        a7.l(j);
        a7.k(4, value.f11101e, descriptor2);
        a7.k(5, value.f11102f, descriptor2);
        a7.t(descriptor2);
    }

    @Override // og.a
    public final qg.g d() {
        return descriptor;
    }
}
