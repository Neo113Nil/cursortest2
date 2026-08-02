package kotlin.coroutines;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class b implements f {
    public final Function1 a;
    public final f b;

    public b(f fVar, Function1 function1) {
        fVar.getClass();
        this.a = function1;
        this.b = fVar instanceof b ? ((b) fVar).b : fVar;
    }
}
