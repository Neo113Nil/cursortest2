package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i8f implements e1d, ku3 {
    public final /* synthetic */ e1d a;
    public final CoroutineContext b;

    public i8f(e1d e1dVar, CoroutineContext coroutineContext) {
        this.a = e1dVar;
        this.b = coroutineContext;
    }

    @Override // defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        return this.b;
    }

    @Override // defpackage.cdi
    public final Object getValue() {
        return this.a.getValue();
    }

    @Override // defpackage.e1d
    public final void setValue(Object obj) {
        this.a.setValue(obj);
    }
}
