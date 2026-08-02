package defpackage;

import androidx.compose.runtime.e;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ata implements s8l {
    public Function0 a;
    public e1d b;
    public final e1d c = e.f(Boolean.FALSE);

    public final long a() {
        xx4 xx4Var;
        e1d e1dVar = this.b;
        if (e1dVar == null) {
            Function0 function0 = this.a;
            if (function0 == null || (xx4Var = (xx4) function0.invoke()) == null) {
                xx4Var = xx4.c;
            }
            e1dVar = e.f(xx4Var);
            this.b = e1dVar;
            this.a = null;
        }
        return ((xx4) ((eoh) e1dVar).getValue()).a;
    }

    public final boolean b() {
        return ((Boolean) ((eoh) this.c).getValue()).booleanValue();
    }
}
