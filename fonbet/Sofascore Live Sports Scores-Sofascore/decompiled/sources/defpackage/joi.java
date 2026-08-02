package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class joi implements PointerInputEventHandler, lt8 {
    public final /* synthetic */ Function2 a;

    public joi(Function2 function2) {
        this.a = function2;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof lt8)) {
            return Intrinsics.c(getFunctionDelegate(), ((lt8) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.lt8
    public final dt8 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(qze qzeVar, rq3 rq3Var) {
        return this.a.invoke(qzeVar, rq3Var);
    }
}
