package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qra implements iqa {
    public final Function1 a;
    public final Function1 b;
    public final tc3 c;

    public qra(Function1 function1, Function1 function12, tc3 tc3Var) {
        this.a = function1;
        this.b = function12;
        this.c = tc3Var;
    }

    @Override // defpackage.iqa
    public final Function1 getKey() {
        return this.a;
    }

    @Override // defpackage.iqa
    public final Function1 getType() {
        return this.b;
    }
}
