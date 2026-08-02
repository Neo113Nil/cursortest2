package A7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import w6.InterfaceC6713d;

/* loaded from: classes2.dex */
public class C {

    /* renamed from: b, reason: collision with root package name */
    public static final Class f196b = C.class;

    /* renamed from: a, reason: collision with root package name */
    public Map f197a = new HashMap();

    public static C d() {
        return new C();
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f197a.values());
            this.f197a.clear();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            H7.k kVar = (H7.k) arrayList.get(i10);
            if (kVar != null) {
                kVar.close();
            }
        }
    }

    public synchronized boolean b(InterfaceC6713d interfaceC6713d) {
        D6.k.g(interfaceC6713d);
        if (!this.f197a.containsKey(interfaceC6713d)) {
            return false;
        }
        H7.k kVar = (H7.k) this.f197a.get(interfaceC6713d);
        synchronized (kVar) {
            if (H7.k.isValid(kVar)) {
                return true;
            }
            this.f197a.remove(interfaceC6713d);
            E6.a.I(f196b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(kVar)), interfaceC6713d.a(), Integer.valueOf(System.identityHashCode(interfaceC6713d)));
            return false;
        }
    }

    public synchronized H7.k c(InterfaceC6713d interfaceC6713d) {
        D6.k.g(interfaceC6713d);
        H7.k kVar = (H7.k) this.f197a.get(interfaceC6713d);
        if (kVar != null) {
            synchronized (kVar) {
                if (!H7.k.isValid(kVar)) {
                    this.f197a.remove(interfaceC6713d);
                    E6.a.I(f196b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(kVar)), interfaceC6713d.a(), Integer.valueOf(System.identityHashCode(interfaceC6713d)));
                    return null;
                }
                kVar = H7.k.k(kVar);
            }
        }
        return kVar;
    }

    public final synchronized void e() {
        E6.a.y(f196b, "Count = %d", Integer.valueOf(this.f197a.size()));
    }

    public synchronized void f(InterfaceC6713d interfaceC6713d, H7.k kVar) {
        D6.k.g(interfaceC6713d);
        D6.k.b(Boolean.valueOf(H7.k.isValid(kVar)));
        H7.k.r((H7.k) this.f197a.put(interfaceC6713d, H7.k.k(kVar)));
        e();
    }

    public boolean g(InterfaceC6713d interfaceC6713d) {
        H7.k kVar;
        D6.k.g(interfaceC6713d);
        synchronized (this) {
            kVar = (H7.k) this.f197a.remove(interfaceC6713d);
        }
        if (kVar == null) {
            return false;
        }
        try {
            return kVar.isValid();
        } finally {
            kVar.close();
        }
    }

    public synchronized boolean h(InterfaceC6713d interfaceC6713d, H7.k kVar) {
        D6.k.g(interfaceC6713d);
        D6.k.g(kVar);
        D6.k.b(Boolean.valueOf(H7.k.isValid(kVar)));
        H7.k kVar2 = (H7.k) this.f197a.get(interfaceC6713d);
        if (kVar2 == null) {
            return false;
        }
        H6.a J10 = kVar2.J();
        H6.a J11 = kVar.J();
        if (J10 != null && J11 != null) {
            try {
                if (J10.z0() == J11.z0()) {
                    this.f197a.remove(interfaceC6713d);
                    H6.a.U(J11);
                    H6.a.U(J10);
                    H7.k.r(kVar2);
                    e();
                    return true;
                }
            } finally {
                H6.a.U(J11);
                H6.a.U(J10);
                H7.k.r(kVar2);
            }
        }
        return false;
    }
}
