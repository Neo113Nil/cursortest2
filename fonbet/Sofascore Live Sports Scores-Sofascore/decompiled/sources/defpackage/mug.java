package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mug extends wtc implements oma, p3h {
    public qug o;
    public boolean p;

    @Override // defpackage.oma
    public final int b(tkb tkbVar, g1c g1cVar, int i) {
        if (this.p) {
            i = Integer.MAX_VALUE;
        }
        return g1cVar.G(i);
    }

    @Override // defpackage.oma
    public final int e(tkb tkbVar, g1c g1cVar, int i) {
        if (!this.p) {
            i = Integer.MAX_VALUE;
        }
        return g1cVar.b(i);
    }

    @Override // defpackage.oma
    public final int h(tkb tkbVar, g1c g1cVar, int i) {
        if (this.p) {
            i = Integer.MAX_VALUE;
        }
        return g1cVar.B(i);
    }

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        y3h.m(b4hVar);
        final int i = 0;
        final int i2 = 1;
        wtg wtgVar = new wtg(new Function0(this) { // from class: lug
            public final /* synthetic */ mug b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int h;
                int i3 = i;
                mug mugVar = this.b;
                switch (i3) {
                    case 0:
                        h = mugVar.o.a.h();
                        break;
                    default:
                        h = mugVar.o.e.h();
                        break;
                }
                return Float.valueOf(h);
            }
        }, new Function0(this) { // from class: lug
            public final /* synthetic */ mug b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int h;
                int i3 = i2;
                mug mugVar = this.b;
                switch (i3) {
                    case 0:
                        h = mugVar.o.a.h();
                        break;
                    default:
                        h = mugVar.o.e.h();
                        break;
                }
                return Float.valueOf(h);
            }
        });
        if (this.p) {
            a4h a4hVar = w3h.w;
            KProperty kProperty = y3h.a[13];
            b4hVar.a(a4hVar, wtgVar);
        } else {
            a4h a4hVar2 = w3h.v;
            KProperty kProperty2 = y3h.a[12];
            b4hVar.a(a4hVar2, wtgVar);
        }
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        n9e.r(j, this.p ? ewd.a : ewd.b);
        qhe J = g1cVar.J(an3.a(j, 0, this.p ? an3.h(j) : Integer.MAX_VALUE, 0, this.p ? Integer.MAX_VALUE : an3.g(j), 5));
        int i = J.a;
        int h = an3.h(j);
        if (i > h) {
            i = h;
        }
        int i2 = J.b;
        int g = an3.g(j);
        if (i2 > g) {
            i2 = g;
        }
        int i3 = J.b - i2;
        int i4 = J.a - i;
        if (!this.p) {
            i3 = i4;
        }
        this.o.g(i3);
        this.o.b.i(this.p ? i2 : i);
        this.o.c.i(this.p ? J.b : J.a);
        return m1c.G0(m1cVar, i, i2, new y51(this, i3, J, 12));
    }

    @Override // defpackage.oma
    public final int m(tkb tkbVar, g1c g1cVar, int i) {
        if (!this.p) {
            i = Integer.MAX_VALUE;
        }
        return g1cVar.s(i);
    }
}
