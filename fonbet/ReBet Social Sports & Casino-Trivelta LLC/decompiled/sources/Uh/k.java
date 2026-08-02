package Uh;

import Ph.L;
import Sh.AbstractC1576n;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class k extends L {

    /* renamed from: b, reason: collision with root package name */
    public static final k f12296b = new k();

    @Override // Ph.L
    public void Y1(CoroutineContext coroutineContext, Runnable runnable) {
        c.f12280h.g2(runnable, true, false);
    }

    @Override // Ph.L
    public void Z1(CoroutineContext coroutineContext, Runnable runnable) {
        c.f12280h.g2(runnable, true, true);
    }

    @Override // Ph.L
    public L c2(int i10, String str) {
        AbstractC1576n.a(i10);
        return i10 >= j.f12293d ? AbstractC1576n.b(this, str) : super.c2(i10, str);
    }

    @Override // Ph.L
    public String toString() {
        return "Dispatchers.IO";
    }
}
