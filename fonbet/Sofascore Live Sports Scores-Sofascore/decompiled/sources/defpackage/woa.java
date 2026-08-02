package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class woa implements iqa {
    public final Function1 a;
    public final Function2 b;
    public final Function1 c;
    public final tc3 d;

    public woa(Function1 function1, Function2 function2, Function1 function12, tc3 tc3Var) {
        this.a = function1;
        this.b = function2;
        this.c = function12;
        this.d = tc3Var;
    }

    @Override // defpackage.iqa
    public final Function1 getKey() {
        return this.a;
    }

    @Override // defpackage.iqa
    public final Function1 getType() {
        return this.c;
    }
}
