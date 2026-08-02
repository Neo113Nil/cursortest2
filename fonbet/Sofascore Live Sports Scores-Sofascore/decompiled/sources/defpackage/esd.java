package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class esd extends hoi implements Function2 {
    public final /* synthetic */ Window r;
    public final /* synthetic */ View s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esd(Window window, View view, boolean z, boolean z2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = window;
        this.s = view;
        this.t = z;
        this.u = z2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new esd(this.r, this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((esd) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        bka bkaVar = new bka(this.s);
        int i = Build.VERSION.SDK_INT;
        Window window = this.r;
        pea aalVar = i >= 35 ? new aal(window, bkaVar) : i >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar);
        boolean z = false;
        boolean z2 = this.t;
        boolean z3 = this.u;
        aalVar.C((z2 || z3) ? false : true);
        if (!z2 && !z3) {
            z = true;
        }
        aalVar.B(z);
        return Unit.a;
    }
}
