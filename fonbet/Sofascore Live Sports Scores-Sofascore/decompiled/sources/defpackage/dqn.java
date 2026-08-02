package defpackage;

import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzct;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dqn extends zzct {
    public final int a;
    public int b;
    public final zzca c;

    public dqn(zzca zzcaVar, int i) {
        int size = zzcaVar.size();
        zzbl.b(i, size);
        this.a = size;
        this.b = i;
        this.c = zzcaVar;
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
