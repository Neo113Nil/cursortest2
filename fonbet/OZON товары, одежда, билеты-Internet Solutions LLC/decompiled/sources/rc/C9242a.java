package rc;

import java.util.concurrent.atomic.AtomicReferenceArray;
import nc.InterfaceC8487b;

/* renamed from: rc.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C9242a extends AtomicReferenceArray<InterfaceC8487b> implements InterfaceC8487b {
    public final boolean a(int i11, InterfaceC8487b interfaceC8487b) {
        InterfaceC8487b interfaceC8487b2;
        do {
            interfaceC8487b2 = get(i11);
            if (interfaceC8487b2 == d.DISPOSED) {
                interfaceC8487b.dispose();
                return false;
            }
        } while (!compareAndSet(i11, interfaceC8487b2, interfaceC8487b));
        if (interfaceC8487b2 == null) {
            return true;
        }
        interfaceC8487b2.dispose();
        return true;
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        InterfaceC8487b andSet;
        if (get(0) != d.DISPOSED) {
            int length = length();
            for (int i11 = 0; i11 < length; i11++) {
                InterfaceC8487b interfaceC8487b = get(i11);
                d dVar = d.DISPOSED;
                if (interfaceC8487b != dVar && (andSet = getAndSet(i11, dVar)) != dVar && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return get(0) == d.DISPOSED;
    }
}
