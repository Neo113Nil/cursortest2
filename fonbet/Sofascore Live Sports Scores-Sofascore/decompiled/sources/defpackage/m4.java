package defpackage;

import java.util.Iterator;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class m4 implements Iterator, eia {

    @Nullable
    private Object nextValue;
    private int state;

    public abstract void computeNext();

    public final void done() {
        this.state = 2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.state;
        if (i == 0) {
            this.state = 3;
            computeNext();
            return this.state == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        a70.p("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.state;
        if (i == 1) {
            this.state = 0;
            return this.nextValue;
        }
        if (i != 2) {
            this.state = 3;
            computeNext();
            if (this.state == 1) {
                this.state = 0;
                return this.nextValue;
            }
        }
        yhk.d();
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setNext(Object obj) {
        this.nextValue = obj;
        this.state = 1;
    }
}
