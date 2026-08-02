package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ack extends au3 {
    public static final ack c = new ack();

    @Override // defpackage.au3
    public final void a0(CoroutineContext coroutineContext, Runnable runnable) {
        hs4.d.c.i(true, true, runnable);
    }

    @Override // defpackage.au3
    public final au3 f0(int i) {
        oea.j(i);
        return i >= dui.d ? this : super.f0(i);
    }

    @Override // defpackage.au3
    public final void i(CoroutineContext coroutineContext, Runnable runnable) {
        hs4.d.c.i(true, false, runnable);
    }

    @Override // defpackage.au3
    public final String toString() {
        return "Dispatchers.IO";
    }
}
