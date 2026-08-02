package org.apache.commons.lang3.concurrent;

/* loaded from: classes10.dex */
public abstract class LazyInitializer<T> implements ConcurrentInitializer<T> {
    private static final Object NO_INIT = new Object();
    private volatile T object = (T) NO_INIT;

    protected abstract T initialize() throws ConcurrentException;

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public T get() throws ConcurrentException {
        T t;
        T t2 = this.object;
        Object obj = NO_INIT;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            t = this.object;
            if (t == obj) {
                t = initialize();
                this.object = t;
            }
        }
        return t;
    }
}
