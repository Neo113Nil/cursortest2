package defpackage;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dri extends c5a {
    public Function1 r;
    public cal s;

    @Override // defpackage.x4a, defpackage.wtc
    public final void c1() {
        View N = pco.N(this);
        WeakHashMap weakHashMap = cal.w;
        cal u = qea.u(N);
        u.a(N);
        w8l w8lVar = (w8l) this.r.invoke(u);
        if (!Intrinsics.c(w8lVar, this.q)) {
            this.q = w8lVar;
            l1();
        }
        this.s = u;
        super.c1();
    }

    @Override // defpackage.x4a, defpackage.wtc
    public final void d1() {
        View N = pco.N(this);
        cal calVar = this.s;
        if (calVar != null) {
            int i = calVar.u - 1;
            calVar.u = i;
            if (i == 0) {
                WeakHashMap weakHashMap = bsk.a;
                srk.c(N, null);
                d9l.a(N, null);
                N.removeOnAttachStateChangeListener(calVar.v);
            }
        }
        super.d1();
    }
}
