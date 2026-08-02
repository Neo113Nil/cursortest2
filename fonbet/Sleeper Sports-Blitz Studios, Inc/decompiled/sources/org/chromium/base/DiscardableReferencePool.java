package org.chromium.base;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public class DiscardableReferencePool {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Set<DiscardableReference<?>> mPool = Collections.newSetFromMap(new WeakHashMap());

    public static class DiscardableReference<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private T mPayload;

        private DiscardableReference(T payload) {
            this.mPayload = payload;
        }

        public T get() {
            return this.mPayload;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void discard() {
            this.mPayload = null;
        }
    }

    public <T> DiscardableReference<T> put(T payload) {
        DiscardableReference<T> discardableReference = new DiscardableReference<>(payload);
        this.mPool.add(discardableReference);
        return discardableReference;
    }

    public void remove(DiscardableReference<?> ref) {
        if (this.mPool.contains(ref)) {
            ref.discard();
            this.mPool.remove(ref);
        }
    }

    public void drain() {
        Iterator<DiscardableReference<?>> it = this.mPool.iterator();
        while (it.hasNext()) {
            it.next().discard();
        }
        this.mPool.clear();
    }
}
