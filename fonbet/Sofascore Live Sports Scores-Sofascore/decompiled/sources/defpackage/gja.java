package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gja implements hja {
    public final mvh a;
    public ija b;
    public wd8 c;

    public gja(mvh mvhVar) {
        this.a = mvhVar;
    }

    public final ija a() {
        ija ijaVar = this.b;
        if (ijaVar != null) {
            return ijaVar;
        }
        Intrinsics.i("keyboardActions");
        throw null;
    }

    public final boolean b(int i) {
        Function1 function1;
        mvh mvhVar;
        if (i == 7) {
            function1 = a().a;
        } else {
            if (i == 2) {
                a();
            } else if (i == 6) {
                a();
            } else if (i == 5) {
                a();
            } else if (i == 3) {
                function1 = a().b;
            } else if (i == 4) {
                a();
            } else if (i != 1 && i != 0) {
                a70.r("invalid ImeAction");
                return false;
            }
            function1 = null;
        }
        if (function1 != null) {
            function1.invoke(this);
            return true;
        }
        if (i == 6) {
            wd8 wd8Var = this.c;
            if (wd8Var != null) {
                ((yd8) wd8Var).h(1, true);
                return true;
            }
            Intrinsics.i("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (mvhVar = this.a) == null) {
                return false;
            }
            ((lw4) mvhVar).a();
            return true;
        }
        wd8 wd8Var2 = this.c;
        if (wd8Var2 != null) {
            ((yd8) wd8Var2).h(2, true);
            return true;
        }
        Intrinsics.i("focusManager");
        throw null;
    }
}
