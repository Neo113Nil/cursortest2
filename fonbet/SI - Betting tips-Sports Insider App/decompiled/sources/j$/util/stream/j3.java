package j$.util.stream;

import j$.util.Spliterator;
import java.util.Deque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class j3 extends l3 implements j$.util.c1 {
    @Override // j$.util.c1
    public final boolean tryAdvance(Object obj) {
        h2 h2Var;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = ((j$.util.c1) this.f17969d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.f17968c == null && (h2Var = (h2) l3.a(this.f17970e)) != null) {
                j$.util.c1 spliterator = h2Var.spliterator();
                this.f17969d = spliterator;
                return spliterator.tryAdvance(obj);
            }
            this.f17966a = null;
        }
        return tryAdvance;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(Object obj) {
        if (this.f17966a == null) {
            return;
        }
        if (this.f17969d == null) {
            Spliterator spliterator = this.f17968c;
            if (spliterator == null) {
                Deque b10 = b();
                while (true) {
                    h2 h2Var = (h2) l3.a(b10);
                    if (h2Var != null) {
                        h2Var.g(obj);
                    } else {
                        this.f17966a = null;
                        return;
                    }
                }
            } else {
                ((j$.util.c1) spliterator).forEachRemaining(obj);
            }
        } else {
            while (tryAdvance(obj)) {
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
