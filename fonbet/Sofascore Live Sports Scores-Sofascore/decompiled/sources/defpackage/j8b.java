package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class j8b implements Iterator, eia {
    public String a;
    public boolean b;
    public final /* synthetic */ oh0 c;

    public j8b(oh0 oh0Var) {
        this.c = oh0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str = this.a;
        if (str == null && !this.b) {
            str = ((BufferedReader) this.c.b).readLine();
            this.a = str;
            if (str == null) {
                this.b = true;
            }
        }
        return str != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yhk.d();
            return null;
        }
        String str = this.a;
        this.a = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
