package rc;

import Bl0.C2645f;
import Dc.l;
import Gc.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import nc.InterfaceC8487b;
import oc.C8691a;

/* loaded from: classes.dex */
public final class f implements InterfaceC8487b, c {

    /* renamed from: a, reason: collision with root package name */
    LinkedList f83281a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f83282b;

    @Override // rc.c
    public final boolean a(InterfaceC8487b interfaceC8487b) {
        if (!this.f83282b) {
            synchronized (this) {
                try {
                    if (!this.f83282b) {
                        LinkedList linkedList = this.f83281a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f83281a = linkedList;
                        }
                        linkedList.add(interfaceC8487b);
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
        if (this.f83282b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f83282b) {
                    return false;
                }
                LinkedList linkedList = this.f83281a;
                if (linkedList != null && linkedList.remove(interfaceC8487b)) {
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
        ((l) interfaceC8487b).dispose();
        return true;
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        if (this.f83282b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f83282b) {
                    return;
                }
                this.f83282b = true;
                LinkedList linkedList = this.f83281a;
                ArrayList arrayList = null;
                this.f83281a = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC8487b) it.next()).dispose();
                    } catch (Throwable th2) {
                        C2645f.c(th2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th2);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new C8691a(arrayList);
                    }
                    throw i.d((Throwable) arrayList.get(0));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return this.f83282b;
    }
}
