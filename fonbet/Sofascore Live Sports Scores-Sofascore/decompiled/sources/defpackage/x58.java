package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x58 implements wff {
    public final u7h a;
    public final wff b;
    public final wff c;
    public final wff d;

    public x58(u7h u7hVar, wff wffVar, wff wffVar2, wff wffVar3) {
        this.a = u7hVar;
        this.b = wffVar;
        this.c = wffVar2;
        this.d = wffVar3;
    }

    @Override // defpackage.yff
    public final Object get() {
        return new o58((r38) this.a.b, (a9h) this.b.get(), (CoroutineContext) this.c.get(), (y8h) this.d.get());
    }
}
