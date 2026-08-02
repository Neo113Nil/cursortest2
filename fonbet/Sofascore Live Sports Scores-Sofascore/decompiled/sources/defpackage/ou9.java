package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ou9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ mu9 d;

    public /* synthetic */ ou9(mu9 mu9Var, int i, int i2) {
        this.a = 0;
        this.d = mu9Var;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        mu9 mu9Var = this.d;
        int i2 = this.c;
        int i3 = this.b;
        l9j l9jVar = (l9j) obj;
        switch (i) {
            case 0:
                long e = mu9Var.e(t6a.g(0, l9jVar.c.length()));
                int g = pej.g(e);
                int f = pej.f(e);
                if (i3 < g) {
                    i3 = g;
                }
                if (i3 <= f) {
                    f = i3;
                }
                int g2 = pej.g(e);
                int f2 = pej.f(e);
                if (i2 < g2) {
                    i2 = g2;
                }
                if (i2 <= f2) {
                    f2 = i2;
                }
                l9jVar.f(mu9Var.g(t6a.g(f, f2)));
                break;
            case 1:
                if (i3 < 0 || i2 < 0) {
                    u3a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i2 + " respectively.");
                }
                long e2 = mu9Var.e(l9jVar.e);
                int f3 = pej.f(e2);
                int i4 = f3 + i2;
                if (((f3 ^ i4) & (i2 ^ i4)) < 0) {
                    i4 = mu9Var.f();
                }
                long g3 = mu9Var.g(t6a.g(pej.f(e2), Math.min(i4, mu9Var.f())));
                yqo.E(l9jVar, pej.g(g3), pej.f(g3));
                int g4 = pej.g(e2);
                int i5 = g4 - i3;
                if (((i3 ^ g4) & (g4 ^ i5)) < 0) {
                    i5 = 0;
                }
                long g5 = mu9Var.g(t6a.g(Math.max(0, i5), pej.g(e2)));
                yqo.E(l9jVar, pej.g(g5), pej.f(g5));
                break;
            default:
                pej pejVar = l9jVar.f;
                mo2 mo2Var = l9jVar.c;
                if (pejVar != null) {
                    l9jVar.e(null);
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                long g6 = mu9Var.g(t6a.g(i3, i2));
                int c = llf.c(pej.g(g6), 0, mo2Var.length());
                int c2 = llf.c(pej.f(g6), 0, mo2Var.length());
                if (c != c2) {
                    if (c < c2) {
                        l9jVar.d(c, c2, null);
                    } else {
                        l9jVar.d(c2, c, null);
                    }
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ou9(int i, int i2, mu9 mu9Var, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = mu9Var;
    }
}
