package rc;

import Kc.C3493a;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d implements InterfaceC8487b {
    private static final /* synthetic */ d[] $VALUES;
    public static final d DISPOSED;

    static {
        d dVar = new d("DISPOSED", 0);
        DISPOSED = dVar;
        $VALUES = new d[]{dVar};
    }

    private d() {
        throw null;
    }

    public static boolean a(AtomicReference<InterfaceC8487b> atomicReference) {
        InterfaceC8487b andSet;
        InterfaceC8487b interfaceC8487b = atomicReference.get();
        d dVar = DISPOSED;
        if (interfaceC8487b == dVar || (andSet = atomicReference.getAndSet(dVar)) == dVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean b(InterfaceC8487b interfaceC8487b) {
        return interfaceC8487b == DISPOSED;
    }

    public static boolean d(AtomicReference<InterfaceC8487b> atomicReference, InterfaceC8487b interfaceC8487b) {
        while (true) {
            InterfaceC8487b interfaceC8487b2 = atomicReference.get();
            if (interfaceC8487b2 == DISPOSED) {
                if (interfaceC8487b == null) {
                    return false;
                }
                interfaceC8487b.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC8487b2, interfaceC8487b)) {
                if (atomicReference.get() != interfaceC8487b2) {
                    break;
                }
            }
            return true;
        }
    }

    public static boolean e(AtomicReference<InterfaceC8487b> atomicReference, InterfaceC8487b interfaceC8487b) {
        while (true) {
            InterfaceC8487b interfaceC8487b2 = atomicReference.get();
            if (interfaceC8487b2 == DISPOSED) {
                if (interfaceC8487b == null) {
                    return false;
                }
                interfaceC8487b.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC8487b2, interfaceC8487b)) {
                if (atomicReference.get() != interfaceC8487b2) {
                    break;
                }
            }
            if (interfaceC8487b2 == null) {
                return true;
            }
            interfaceC8487b2.dispose();
            return true;
        }
    }

    public static boolean f(AtomicReference<InterfaceC8487b> atomicReference, InterfaceC8487b interfaceC8487b) {
        C9656b.c(interfaceC8487b, "d is null");
        while (!atomicReference.compareAndSet(null, interfaceC8487b)) {
            if (atomicReference.get() != null) {
                interfaceC8487b.dispose();
                if (atomicReference.get() == DISPOSED) {
                    return false;
                }
                C3493a.f(new oc.d("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean g(InterfaceC8487b interfaceC8487b, InterfaceC8487b interfaceC8487b2) {
        if (interfaceC8487b2 == null) {
            C3493a.f(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC8487b == null) {
            return true;
        }
        interfaceC8487b2.dispose();
        C3493a.f(new oc.d("Disposable already set!"));
        return false;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return true;
    }
}
