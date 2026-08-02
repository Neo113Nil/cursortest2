package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k5e implements iqa {
    public final Function1 a;
    public final et8 b;

    public k5e(Function1 function1, et8 et8Var) {
        this.a = function1;
        this.b = et8Var;
    }

    @Override // defpackage.iqa
    public final Function1 getKey() {
        return this.a;
    }
}
