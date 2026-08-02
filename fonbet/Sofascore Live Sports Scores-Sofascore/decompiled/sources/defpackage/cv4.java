package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cv4 extends au3 {
    public static final /* synthetic */ long e = rh0.a.objectFieldOffset(cv4.class.getDeclaredField("d"));
    public final au3 c;
    public volatile /* synthetic */ int d = 1;

    public cv4(au3 au3Var) {
        this.c = au3Var;
    }

    @Override // defpackage.au3
    public final void a0(CoroutineContext coroutineContext, Runnable runnable) {
        g0().a0(coroutineContext, runnable);
    }

    @Override // defpackage.au3
    public final boolean e0(CoroutineContext coroutineContext) {
        return g0().e0(coroutineContext);
    }

    @Override // defpackage.au3
    public final au3 f0(int i) {
        return g0().f0(i);
    }

    public final au3 g0() {
        return rh0.a.getIntVolatile(this, e) == 1 ? z45.b : this.c;
    }

    @Override // defpackage.au3
    public final void i(CoroutineContext coroutineContext, Runnable runnable) {
        g0().i(coroutineContext, runnable);
    }

    @Override // defpackage.au3
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.c + ")";
    }
}
