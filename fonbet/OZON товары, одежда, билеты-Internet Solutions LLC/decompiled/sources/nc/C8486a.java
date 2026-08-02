package nc;

import Bl0.C2645f;
import Gc.i;
import Gc.l;
import java.util.ArrayList;
import oc.C8691a;
import sc.C9656b;

/* renamed from: nc.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8486a implements InterfaceC8487b, rc.c {

    /* renamed from: a, reason: collision with root package name */
    l<InterfaceC8487b> f76725a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f76726b;

    static void e(l lVar) {
        if (lVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : lVar.b()) {
            if (obj instanceof InterfaceC8487b) {
                try {
                    ((InterfaceC8487b) obj).dispose();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new C8691a(arrayList);
            }
            throw i.d((Throwable) arrayList.get(0));
        }
    }

    @Override // rc.c
    public final boolean a(InterfaceC8487b interfaceC8487b) {
        C9656b.c(interfaceC8487b, "disposable is null");
        if (!this.f76726b) {
            synchronized (this) {
                try {
                    if (!this.f76726b) {
                        l<InterfaceC8487b> lVar = this.f76725a;
                        if (lVar == null) {
                            lVar = new l<>();
                            this.f76725a = lVar;
                        }
                        lVar.a(interfaceC8487b);
                        return true;
                    }
                } finally {
                }
            }
        }
        interfaceC8487b.dispose();
        return false;
    }

    @Override // rc.c
    public final boolean b(InterfaceC8487b interfaceC8487b) {
        C9656b.c(interfaceC8487b, "disposables is null");
        if (this.f76726b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f76726b) {
                    return false;
                }
                l<InterfaceC8487b> lVar = this.f76725a;
                if (lVar != null && lVar.c(interfaceC8487b)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // rc.c
    public final boolean c(InterfaceC8487b interfaceC8487b) {
        if (!b(interfaceC8487b)) {
            return false;
        }
        interfaceC8487b.dispose();
        return true;
    }

    public final void d() {
        if (this.f76726b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f76726b) {
                    return;
                }
                l<InterfaceC8487b> lVar = this.f76725a;
                this.f76725a = null;
                e(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        if (this.f76726b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f76726b) {
                    return;
                }
                this.f76726b = true;
                l<InterfaceC8487b> lVar = this.f76725a;
                this.f76725a = null;
                e(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int f() {
        if (this.f76726b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f76726b) {
                    return 0;
                }
                l<InterfaceC8487b> lVar = this.f76725a;
                return lVar != null ? lVar.e() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return this.f76726b;
    }
}
