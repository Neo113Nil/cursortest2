package n8;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import y8.InterfaceC10861a;

/* loaded from: classes.dex */
final class s<T> implements InterfaceC10861a<Set<T>> {

    /* renamed from: a, reason: collision with root package name */
    private volatile Set<InterfaceC10861a<T>> f76612a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Set<T> f76613b;

    s() {
        throw null;
    }

    static s<?> b(Collection<InterfaceC10861a<?>> collection) {
        s<?> sVar = new s<>();
        ((s) sVar).f76613b = null;
        ((s) sVar).f76612a = Collections.newSetFromMap(new ConcurrentHashMap());
        ((s) sVar).f76612a.addAll((Set) collection);
        return sVar;
    }

    final synchronized void a(InterfaceC10861a<T> interfaceC10861a) {
        try {
            if (this.f76613b == null) {
                this.f76612a.add(interfaceC10861a);
            } else {
                this.f76613b.add(interfaceC10861a.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // y8.InterfaceC10861a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.f76613b == null) {
            synchronized (this) {
                try {
                    if (this.f76613b == null) {
                        this.f76613b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator<InterfaceC10861a<T>> it = this.f76612a.iterator();
                            while (it.hasNext()) {
                                this.f76613b.add(it.next().get());
                            }
                            this.f76612a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f76613b);
    }
}
