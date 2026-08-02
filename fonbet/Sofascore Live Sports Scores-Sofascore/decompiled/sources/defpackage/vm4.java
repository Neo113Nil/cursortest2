package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class vm4 extends um4 implements rq3 {
    public gha a;
    public Unit b;
    public rq3 c;
    public Object d;

    @Override // defpackage.rq3
    public final CoroutineContext getContext() {
        return g.a;
    }

    @Override // defpackage.rq3
    public final void resumeWith(Object obj) {
        this.c = null;
        this.d = obj;
    }
}
