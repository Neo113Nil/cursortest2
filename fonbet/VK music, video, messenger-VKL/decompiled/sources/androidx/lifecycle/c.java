package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import xsna.f5z;

/* compiled from: CompositeGeneratedAdaptersObserver.jvm.kt */
/* loaded from: classes12.dex */
public final class c implements l {
    public final e[] b;

    public c(e[] eVarArr) {
        this.b = eVarArr;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        new HashMap();
        e[] eVarArr = this.b;
        for (e eVar : eVarArr) {
            eVar.a();
        }
        for (e eVar2 : eVarArr) {
            eVar2.a();
        }
    }
}
