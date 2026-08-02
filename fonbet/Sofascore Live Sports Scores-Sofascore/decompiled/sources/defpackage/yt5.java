package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class yt5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;

    public /* synthetic */ yt5(boolean z, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                ku5 ku5Var = (ku5) obj;
                ku5Var.getClass();
                double d = 0.0d;
                if (z && i2 == 0) {
                    Double d2 = ku5Var.g;
                    if (d2 != null) {
                        d = d2.doubleValue();
                    }
                } else {
                    if (z) {
                        i2--;
                    }
                    o22 o22Var = (o22) CollectionsKt.a0(i2, ku5Var.f);
                    if (o22Var != null) {
                        d = o22Var.b;
                    }
                }
                return Double.valueOf(d);
            default:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("UPDATE vote_table SET success = ? WHERE id = ?");
                try {
                    V0.q(1, z ? 1L : 0L);
                    V0.q(2, i2);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
        }
    }
}
