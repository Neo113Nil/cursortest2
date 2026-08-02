package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class zll implements b7b, lt8 {
    public final /* synthetic */ mg3 a;

    public zll(mg3 mg3Var) {
        this.a = mg3Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b7b) && (obj instanceof lt8)) {
            return Intrinsics.c(getFunctionDelegate(), ((lt8) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.lt8
    public final dt8 getFunctionDelegate() {
        return new ot8(1, 0, mg3.class, this.a, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
