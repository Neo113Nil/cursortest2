package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tx extends nv0 implements vd8 {
    public final cqa a;
    public final v3h b;
    public final xy c;
    public final qqf d;
    public final String e;
    public final Rect f = new Rect();
    public final AutofillId g;
    public final vzc h;
    public boolean i;

    public tx(cqa cqaVar, v3h v3hVar, xy xyVar, qqf qqfVar, String str) {
        this.a = cqaVar;
        this.b = v3hVar;
        this.c = xyVar;
        this.d = qqfVar;
        this.e = str;
        xyVar.setImportantForAutofill(1);
        AutofillId autofillId = xyVar.getAutofillId();
        if (autofillId == null) {
            throw wt3.j("Required value was null.");
        }
        this.g = autofillId;
        this.h = new vzc();
    }

    @Override // defpackage.vd8
    public final void a(ne8 ne8Var, ne8 ne8Var2) {
        wma c0;
        l3h x;
        wma c02;
        l3h x2;
        if (ne8Var != null && (c02 = c6o.c0(ne8Var)) != null && (x2 = c02.x()) != null) {
            x0d x0dVar = x2.a;
            if (x0dVar.b(k3h.g) || x0dVar.b(k3h.h)) {
                ((AutofillManager) this.a.a).notifyViewExited(this.c, c02.b);
            }
        }
        if (ne8Var2 == null || (c0 = c6o.c0(ne8Var2)) == null || (x = c0.x()) == null) {
            return;
        }
        x0d x0dVar2 = x.a;
        if (x0dVar2.b(k3h.g) || x0dVar2.b(k3h.h)) {
            int i = c0.b;
            this.d.b.G(i, new rx(this, i));
        }
    }
}
