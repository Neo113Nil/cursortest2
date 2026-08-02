package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class jt7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6e b;

    public /* synthetic */ jt7(a6e a6eVar, int i) {
        this.a = i;
        this.b = a6eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int k;
        int i = this.a;
        a6e a6eVar = this.b;
        switch (i) {
            case 0:
                break;
            case 3:
                break;
            case 4:
                boolean b = a6eVar.k.b();
                znh znhVar = a6eVar.q;
                if (!b) {
                    k = a6eVar.k();
                } else if (znhVar.h() != -1) {
                    k = znhVar.h();
                } else {
                    float abs = Math.abs(a6eVar.l());
                    kx4 kx4Var = a6eVar.n;
                    b6e b6eVar = c6e.a;
                    if (abs >= Math.abs(Math.min(kx4Var.H0(56.0f), a6eVar.o() / 2.0f) / a6eVar.o())) {
                        boolean booleanValue = ((Boolean) ((eoh) a6eVar.D).getValue()).booleanValue();
                        int i2 = a6eVar.e;
                        k = booleanValue ? i2 + 1 : i2;
                    } else {
                        k = a6eVar.k();
                    }
                }
                break;
        }
        return Integer.valueOf(a6eVar.k());
    }
}
