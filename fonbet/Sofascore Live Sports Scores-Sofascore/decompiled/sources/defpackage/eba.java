package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class eba extends cea {
    public static final /* synthetic */ long f = rh0.a.objectFieldOffset(eba.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile;
    public final Function1 e;

    public eba(Function1 function1) {
        this.e = function1;
    }

    @Override // defpackage.cea
    public final boolean l() {
        return true;
    }

    @Override // defpackage.cea
    public final void m(Throwable th) {
        if (rh0.a.compareAndSwapInt(this, f, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
