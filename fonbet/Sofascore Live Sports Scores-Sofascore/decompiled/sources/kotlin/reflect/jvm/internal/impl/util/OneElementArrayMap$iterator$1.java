package kotlin.reflect.jvm.internal.impl.util;

import defpackage.eia;
import defpackage.yhk;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class OneElementArrayMap$iterator$1<T> implements Iterator<T>, eia {
    private boolean notVisited = true;
    final /* synthetic */ OneElementArrayMap<T> this$0;

    public OneElementArrayMap$iterator$1(OneElementArrayMap<T> oneElementArrayMap) {
        this.this$0 = oneElementArrayMap;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.notVisited;
    }

    @Override // java.util.Iterator
    @NotNull
    public T next() {
        if (this.notVisited) {
            this.notVisited = false;
            return this.this$0.getValue();
        }
        yhk.d();
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
