package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class so5 extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ zo5 j;
    public final /* synthetic */ of6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so5(zo5 zo5Var, of6 of6Var, int i) {
        super(1);
        this.i = i;
        this.j = zo5Var;
        this.k = of6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j38 j38Var;
        j38 j38Var2;
        j38 j38Var3;
        j38 j38Var4;
        int i = this.i;
        float f = 1.0f;
        zo5 zo5Var = this.j;
        of6 of6Var = this.k;
        switch (i) {
            case 0:
                twj twjVar = (twj) obj;
                po5 po5Var = po5.a;
                po5 po5Var2 = po5.b;
                if (twjVar.c(po5Var, po5Var2)) {
                    zm6 zm6Var = zo5Var.a.a;
                    return (zm6Var == null || (j38Var2 = zm6Var.b) == null) ? uo5.b : j38Var2;
                }
                if (!twjVar.c(po5Var2, po5.c)) {
                    return uo5.b;
                }
                zm6 zm6Var2 = of6Var.a.a;
                return (zm6Var2 == null || (j38Var = zm6Var2.b) == null) ? uo5.b : j38Var;
            case 1:
                int ordinal = ((po5) obj).ordinal();
                if (ordinal == 0) {
                    zm6 zm6Var3 = zo5Var.a.a;
                    if (zm6Var3 != null) {
                        f = zm6Var3.a;
                    }
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        zzl.b();
                        return null;
                    }
                    zm6 zm6Var4 = of6Var.a.a;
                    if (zm6Var4 != null) {
                        f = zm6Var4.a;
                    }
                }
                return Float.valueOf(f);
            case 2:
                twj twjVar2 = (twj) obj;
                po5 po5Var3 = po5.a;
                po5 po5Var4 = po5.b;
                if (twjVar2.c(po5Var3, po5Var4)) {
                    krg krgVar = zo5Var.a.d;
                    return (krgVar == null || (j38Var4 = krgVar.c) == null) ? uo5.b : j38Var4;
                }
                if (!twjVar2.c(po5Var4, po5.c)) {
                    return uo5.b;
                }
                krg krgVar2 = of6Var.a.d;
                return (krgVar2 == null || (j38Var3 = krgVar2.c) == null) ? uo5.b : j38Var3;
            default:
                int ordinal2 = ((po5) obj).ordinal();
                if (ordinal2 == 0) {
                    krg krgVar3 = zo5Var.a.d;
                    if (krgVar3 != null) {
                        f = krgVar3.a;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        zzl.b();
                        return null;
                    }
                    krg krgVar4 = of6Var.a.d;
                    if (krgVar4 != null) {
                        f = krgVar4.a;
                    }
                }
                return Float.valueOf(f);
        }
    }
}
