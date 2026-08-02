package Ph;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final class U0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final L f9054a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1465n f9055b;

    public U0(L l10, InterfaceC1465n interfaceC1465n) {
        this.f9054a = l10;
        this.f9055b = interfaceC1465n;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9055b.b(this.f9054a, Unit.INSTANCE);
    }
}
