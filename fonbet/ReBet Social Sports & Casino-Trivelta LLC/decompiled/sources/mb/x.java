package mb;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import wb.InterfaceC6736b;

/* loaded from: classes3.dex */
public class x implements InterfaceC6736b {

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f56494b = null;

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f56493a = Collections.newSetFromMap(new ConcurrentHashMap());

    public x(Collection collection) {
        this.f56493a.addAll(collection);
    }

    public static x b(Collection collection) {
        return new x((Set) collection);
    }

    public synchronized void a(InterfaceC6736b interfaceC6736b) {
        try {
            if (this.f56494b == null) {
                this.f56493a.add(interfaceC6736b);
            } else {
                this.f56494b.add(interfaceC6736b.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // wb.InterfaceC6736b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f56494b == null) {
            synchronized (this) {
                try {
                    if (this.f56494b == null) {
                        this.f56494b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f56494b);
    }

    public final synchronized void d() {
        try {
            Iterator it = this.f56493a.iterator();
            while (it.hasNext()) {
                this.f56494b.add(((InterfaceC6736b) it.next()).get());
            }
            this.f56493a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
