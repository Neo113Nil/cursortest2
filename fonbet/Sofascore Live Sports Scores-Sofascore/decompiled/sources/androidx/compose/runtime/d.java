package androidx.compose.runtime;

import defpackage.eoh;
import defpackage.foh;
import defpackage.gb0;
import defpackage.gei;
import defpackage.hf5;
import defpackage.jkk;
import defpackage.mh3;
import defpackage.wib;
import defpackage.zsa;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class d {
    public final zsa a;

    public d(Function0 function0) {
        this.a = new zsa(function0);
    }

    public abstract gb0 a(Object obj);

    public jkk b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final jkk c(gb0 gb0Var, jkk jkkVar) {
        hf5 hf5Var = null;
        if (jkkVar instanceof hf5) {
            if (gb0Var.d) {
                hf5Var = (hf5) jkkVar;
                ((eoh) hf5Var.a).setValue(gb0Var.c());
            }
        } else if (jkkVar instanceof gei) {
            if ((gb0Var.c || gb0Var.b != null) && !gb0Var.d) {
                gei geiVar = (gei) jkkVar;
                if (Intrinsics.c(gb0Var.c(), geiVar.a)) {
                    hf5Var = geiVar;
                }
            }
        } else if (jkkVar instanceof mh3) {
            gb0Var.getClass();
        }
        if (hf5Var != null) {
            return hf5Var;
        }
        if (!gb0Var.d) {
            return new gei(gb0Var.c());
        }
        Object obj = gb0Var.b;
        foh fohVar = (foh) gb0Var.a;
        if (fohVar == null) {
            fohVar = wib.i;
        }
        return new hf5(new ParcelableSnapshotMutableState(obj, fohVar));
    }
}
