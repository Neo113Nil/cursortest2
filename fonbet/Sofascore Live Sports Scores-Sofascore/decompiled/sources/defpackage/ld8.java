package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ld8 extends wtc implements nd8 {
    public Function1 o;
    public ie8 p;

    @Override // defpackage.nd8
    public final void J(ie8 ie8Var) {
        if (Intrinsics.c(this.p, ie8Var)) {
            return;
        }
        this.p = ie8Var;
        this.o.invoke(ie8Var);
    }
}
