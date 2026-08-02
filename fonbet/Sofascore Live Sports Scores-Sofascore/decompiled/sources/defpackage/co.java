package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class co extends r99 {
    public final /* synthetic */ int n0;
    public float o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co(zci zciVar, int i, int i2) {
        super(zciVar, i);
        this.n0 = i2;
    }

    @Override // defpackage.r99, defpackage.fm3, defpackage.gtf, defpackage.hm6
    public final void apply() {
        int i = this.n0;
        zci zciVar = this.k0;
        ArrayList arrayList = this.m0;
        switch (i) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fm3 b = zciVar.b(it.next());
                    b.g();
                    Object obj = this.N;
                    if (obj != null) {
                        b.o(obj);
                    } else {
                        Object obj2 = this.O;
                        if (obj2 != null) {
                            b.j0 = 6;
                            b.O = obj2;
                        } else {
                            b.o(0);
                        }
                    }
                    Object obj3 = this.P;
                    if (obj3 != null) {
                        b.j0 = 7;
                        b.P = obj3;
                    } else {
                        Object obj4 = this.Q;
                        if (obj4 != null) {
                            b.i(obj4);
                        } else {
                            b.i(0);
                        }
                    }
                    float f = this.o0;
                    if (f != 0.5f) {
                        b.h = f;
                    }
                }
                break;
            default:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    fm3 b2 = zciVar.b(it2.next());
                    b2.h();
                    Object obj5 = this.R;
                    if (obj5 != null) {
                        b2.p(obj5);
                    } else {
                        Object obj6 = this.S;
                        if (obj6 != null) {
                            b2.j0 = 10;
                            b2.S = obj6;
                        } else {
                            b2.p(0);
                        }
                    }
                    Object obj7 = this.U;
                    if (obj7 != null) {
                        b2.j0 = 12;
                        b2.U = obj7;
                    } else {
                        Object obj8 = this.V;
                        if (obj8 != null) {
                            b2.e(obj8);
                        } else {
                            b2.e(0);
                        }
                    }
                    float f2 = this.o0;
                    if (f2 != 0.5f) {
                        b2.i = f2;
                    }
                }
                break;
        }
    }
}
