package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class otk implements joa {
    public final KClass a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;
    public ltk e;

    public otk(KClass kClass, Function0 function0, Function0 function02, Function0 function03) {
        kClass.getClass();
        this.a = kClass;
        this.b = function0;
        this.c = function02;
        this.d = function03;
    }

    @Override // defpackage.joa
    public final Object getValue() {
        ltk ltkVar = this.e;
        if (ltkVar != null) {
            return ltkVar;
        }
        stk stkVar = (stk) this.b.invoke();
        qtk qtkVar = (qtk) this.c.invoke();
        ly3 ly3Var = (ly3) this.d.invoke();
        stkVar.getClass();
        qtkVar.getClass();
        ly3Var.getClass();
        g7h g7hVar = new g7h(stkVar, qtkVar, ly3Var);
        KClass kClass = this.a;
        kClass.getClass();
        String qualifiedName = kClass.getQualifiedName();
        if (qualifiedName == null) {
            a70.p("Local and anonymous classes can not be ViewModels");
            return null;
        }
        ltk u = g7hVar.u("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), kClass);
        this.e = u;
        return u;
    }

    @Override // defpackage.joa
    public final boolean isInitialized() {
        return this.e != null;
    }
}
