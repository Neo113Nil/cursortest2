package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class cag implements skd, lt8 {
    public final /* synthetic */ Function1 a;

    public cag(Function1 function1) {
        function1.getClass();
        this.a = function1;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof skd) && (obj instanceof lt8)) {
            return Intrinsics.c(getFunctionDelegate(), ((lt8) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.lt8
    public final dt8 getFunctionDelegate() {
        return this.a;
    }

    @Override // defpackage.skd
    public final /* synthetic */ void h(Object obj) {
        this.a.invoke(obj);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
