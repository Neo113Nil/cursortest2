package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ax {
    public Object a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ dx d;

    public ax(dx dxVar) {
        this.d = dxVar;
    }

    public final void a(float f, float f2) {
        dx dxVar = this.d;
        e1d e1dVar = (e1d) dxVar.c;
        xnh xnhVar = (xnh) dxVar.f;
        float h = xnhVar.h();
        xnhVar.i(f);
        ((xnh) dxVar.g).i(f2);
        if (Float.isNaN(h)) {
            return;
        }
        boolean z = f >= h;
        eoh eohVar = (eoh) e1dVar;
        if (xnhVar.h() == dxVar.f().c(eohVar.getValue())) {
            Object b = dxVar.f().b(xnhVar.h() + (z ? 1.0f : -1.0f), z);
            if (b == null) {
                b = eohVar.getValue();
            }
            if (z) {
                this.a = eohVar.getValue();
                this.b = b;
            } else {
                this.a = b;
                this.b = eohVar.getValue();
            }
        } else {
            Object b2 = dxVar.f().b(xnhVar.h(), false);
            if (b2 == null) {
                b2 = eohVar.getValue();
            }
            Object b3 = dxVar.f().b(xnhVar.h(), true);
            if (b3 == null) {
                b3 = eohVar.getValue();
            }
            this.a = b2;
            this.b = b3;
        }
        lo4 f3 = dxVar.f();
        Object obj = this.a;
        obj.getClass();
        float c = f3.c(obj);
        lo4 f4 = dxVar.f();
        Object obj2 = this.b;
        obj2.getClass();
        this.c = Math.abs(c - f4.c(obj2));
        if (Math.abs(xnhVar.h() - dxVar.f().c(eohVar.getValue())) >= this.c / 2.0f) {
            Object obj3 = z ? this.b : this.a;
            if (obj3 == null) {
                obj3 = eohVar.getValue();
            }
            if (((Boolean) ((Function1) dxVar.b).invoke(obj3)).booleanValue()) {
                ((eoh) e1dVar).setValue(obj3);
            }
        }
    }
}
