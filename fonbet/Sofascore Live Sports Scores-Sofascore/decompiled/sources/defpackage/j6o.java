package defpackage;

import com.google.android.gms.internal.identity.zzer;
import com.google.android.gms.internal.identity.zzex;
import com.google.android.gms.internal.identity.zzfa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class j6o extends zzfa {
    public final int a;
    public int b;
    public final zzex c;

    public j6o(zzex zzexVar, int i) {
        int size = zzexVar.size();
        if (i < 0 || i > size) {
            zzl.r(zzer.c(i, size, "index"));
            throw null;
        }
        this.a = size;
        this.b = i;
        this.c = zzexVar;
    }

    public final Object a(int i) {
        return this.c.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            yhk.d();
            return null;
        }
        int i = this.b;
        this.b = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            yhk.d();
            return null;
        }
        int i = this.b - 1;
        this.b = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }
}
