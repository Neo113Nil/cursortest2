package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xqg implements uqg {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ Function1 b;

    public xqg(Function2 function2, Function1 function1) {
        this.a = function2;
        this.b = function1;
    }

    @Override // defpackage.uqg
    public final Object g(lpg lpgVar, Object obj) {
        return this.a.invoke(lpgVar, obj);
    }

    @Override // defpackage.uqg
    public final Object k(Object obj) {
        return this.b.invoke(obj);
    }
}
