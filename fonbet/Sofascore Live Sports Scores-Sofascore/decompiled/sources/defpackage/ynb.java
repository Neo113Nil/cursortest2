package defpackage;

import android.app.Application;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class ynb extends q8 {
    public final fdi e;
    public final jof f;
    public final aeh g;
    public final hof h;
    public final fdi i;
    public final jof j;
    public final wf2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynb(Application application, vnb vnbVar) {
        super(application);
        application.getClass();
        fdi a = gdi.a(vnbVar);
        this.e = a;
        jof u = un0.u(a);
        this.f = u;
        aeh b = beh.b(0, 0, null, 7);
        this.g = b;
        this.h = un0.t(b);
        fdi a2 = gdi.a(Boolean.FALSE);
        this.i = a2;
        this.j = un0.u(a2);
        this.k = new wf2(new nd7(u, 1), 7);
    }

    public static void m(ynb ynbVar, Function1 function1) {
        wd5 wd5Var = xd5.b;
        long R = wkn.R(500, be5.MILLISECONDS);
        ynbVar.getClass();
        if (((Boolean) ynbVar.i.getValue()).booleanValue()) {
            return;
        }
        xw3.L(un0.z(ynbVar), null, null, new gu2(ynbVar, function1, R, null), 3);
    }

    public final void k(Object obj) {
        xw3.L(un0.z(this), null, null, new gjb(this, obj, null, 1), 3);
    }

    public final vnb l() {
        return (vnb) this.e.getValue();
    }

    public final void n(Object obj, Function1 function1) {
        fdi fdiVar;
        Object value;
        Object obj2;
        do {
            fdiVar = this.e;
            value = fdiVar.getValue();
            obj2 = (vnb) value;
            obj2.getClass();
            if (obj2 instanceof unb) {
                obj2 = new unb(function1.invoke(((unb) obj2).a));
            } else if (obj != null) {
                obj2 = new unb(function1.invoke(obj));
            }
        } while (!fdiVar.k(value, obj2));
    }

    public final void o(Function1 function1) {
        fdi fdiVar;
        Object value;
        do {
            fdiVar = this.e;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, (vnb) function1.invoke((vnb) value)));
    }
}
