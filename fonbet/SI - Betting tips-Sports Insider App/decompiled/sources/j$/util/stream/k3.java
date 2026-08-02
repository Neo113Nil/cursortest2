package j$.util.stream;

import j$.util.Spliterator;
import java.util.Deque;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class k3 extends l3 {
    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        i2 a7;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = this.f17969d.tryAdvance(consumer);
        if (!tryAdvance) {
            if (this.f17968c == null && (a7 = l3.a(this.f17970e)) != null) {
                Spliterator spliterator = a7.spliterator();
                this.f17969d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f17966a = null;
        }
        return tryAdvance;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f17966a == null) {
            return;
        }
        if (this.f17969d == null) {
            Spliterator spliterator = this.f17968c;
            if (spliterator == null) {
                Deque b10 = b();
                while (true) {
                    i2 a7 = l3.a(b10);
                    if (a7 != null) {
                        a7.forEach(consumer);
                    } else {
                        this.f17966a = null;
                        return;
                    }
                }
            } else {
                spliterator.forEachRemaining(consumer);
            }
        } else {
            while (tryAdvance(consumer)) {
            }
        }
    }
}
