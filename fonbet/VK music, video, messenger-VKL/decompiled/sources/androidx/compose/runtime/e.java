package androidx.compose.runtime;

import xsna.abk0;
import xsna.c9e0;
import xsna.epx;
import xsna.gwi;
import xsna.izs;
import xsna.k0x;
import xsna.lvi;
import xsna.mvi;
import xsna.myk0;
import xsna.wqo;
import xsna.xjr0;

/* compiled from: CompositionLocal.kt */
/* loaded from: classes11.dex */
public abstract class e<T> extends lvi<T> {
    public e() {
        throw null;
    }

    public abstract c9e0<T> b(T t);

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0032, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0041, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xjr0<T> c(c9e0<T> c9e0Var, xjr0<T> xjr0Var) {
        wqo wqoVar;
        wqo wqoVar2 = null;
        if (xjr0Var instanceof wqo) {
            if (c9e0Var.d) {
                wqoVar2 = (wqo) xjr0Var;
                wqoVar2.a.setValue(c9e0Var.a());
            }
        } else if (xjr0Var instanceof myk0) {
            if ((c9e0Var.b || c9e0Var.e != null) && !c9e0Var.d) {
                myk0 myk0Var = (myk0) xjr0Var;
                boolean f = epx.f(c9e0Var.a(), myk0Var.a);
                wqoVar = myk0Var;
            }
        } else if (xjr0Var instanceof gwi) {
            c9e0Var.getClass();
            gwi gwiVar = (gwi) xjr0Var;
            izs<mvi, T> izsVar = gwiVar.a;
            wqoVar = gwiVar;
        }
        if (wqoVar2 != null) {
            return wqoVar2;
        }
        if (!c9e0Var.d) {
            return new myk0(c9e0Var.a());
        }
        T t = c9e0Var.e;
        abk0 abk0Var = c9e0Var.c;
        if (abk0Var == null) {
            abk0Var = k0x.c;
        }
        return new wqo(new ParcelableSnapshotMutableState(t, abk0Var));
    }
}
