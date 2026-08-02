package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vsa extends g9i {
    public final rq3 e;

    public vsa(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.e = z9a.a(this, this, function2);
    }

    @Override // defpackage.kea
    public final void c0() {
        try {
            rq3 b = z9a.b(this.e);
            p2g p2gVar = w2g.b;
            t45.a(b, Unit.a);
        } catch (Throwable th) {
            hkg.G(this, th);
            throw null;
        }
    }
}
