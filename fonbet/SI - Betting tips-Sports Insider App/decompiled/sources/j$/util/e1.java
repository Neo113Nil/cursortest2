package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class e1 implements Iterator, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17705a = false;

    /* renamed from: b, reason: collision with root package name */
    public Object f17706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Spliterator f17707c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public e1(Spliterator spliterator) {
        this.f17707c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f17705a = true;
        this.f17706b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f17705a) {
            this.f17707c.tryAdvance(this);
        }
        return this.f17705a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f17705a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f17705a = false;
        return this.f17706b;
    }
}
