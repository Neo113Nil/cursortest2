package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vih extends t01 {
    public Object c;
    public Object d;
    public y0d e;
    public y0d f;
    public l4h g;
    public final qfg h;
    public final imf i;

    public vih() {
        super(7);
        this.h = new qfg(this, 17);
        fvg fvgVar = new fvg(this, 11);
        snh.b(snh.a);
        synchronized (snh.c) {
            snh.h = CollectionsKt.x0(snh.h, fvgVar);
            Unit unit = Unit.a;
        }
        this.i = new imf(fvgVar, 11);
    }

    @Override // defpackage.t01
    public final Function1 G(l4h l4hVar) {
        l4h l4hVar2 = this.g;
        if (l4hVar2 != null && !l4hVar2.equals(l4hVar)) {
            h3f.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.g = l4hVar;
        return this.h;
    }

    @Override // defpackage.t01
    public final void H(ln2 ln2Var) {
        this.g = null;
        this.d = null;
        this.f = null;
        o();
    }

    @Override // defpackage.t01
    public final void n(l4h l4hVar) {
        this.d = null;
        this.f = null;
    }

    @Override // defpackage.t01
    public final void o() {
        synchronized (this.b) {
            try {
                this.c = this.d;
                if (this.f == null) {
                    this.e = null;
                } else {
                    y0d y0dVar = this.e;
                    if (y0dVar == null) {
                        y0d y0dVar2 = rrg.a;
                        y0dVar = new y0d();
                        this.e = y0dVar;
                    }
                    this.e = this.f;
                    this.f = y0dVar;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.t01
    public final void q() {
        this.i.f();
        this.d = null;
        this.f = null;
        synchronized (this.b) {
            this.g = null;
            this.c = null;
            this.e = null;
            Unit unit = Unit.a;
        }
    }
}
