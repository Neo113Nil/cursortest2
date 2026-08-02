package defpackage;

import android.view.View;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zsk {
    public final g6b a;
    public final int b;
    public Function0 c;
    public yda d;
    public int e;
    public final LinkedHashSet f;

    public zsk(g6b g6bVar, int i) {
        g6bVar.getClass();
        this.a = g6bVar;
        this.b = i;
        this.f = new LinkedHashSet();
    }

    public final void a() {
        yda ydaVar = this.d;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        this.f.clear();
    }

    public final void b(View view, Function0 function0, Function0 function02) {
        view.getClass();
        function0.getClass();
        this.f.add(view);
        c(function0, function02);
    }

    public final void c(Function0 function0, Function0 function02) {
        function0.getClass();
        this.c = function0;
        yda ydaVar = this.d;
        rq3 rq3Var = null;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        if (function02 == null || ((Boolean) function02.invoke()).booleanValue()) {
            this.d = wca.x(this.a).b(new h4i(function02, this, rq3Var, 26));
        }
    }
}
