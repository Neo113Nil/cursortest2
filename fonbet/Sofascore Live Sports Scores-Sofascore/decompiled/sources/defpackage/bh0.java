package defpackage;

import com.ironsource.U3;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bh0 implements Iterator, Map.Entry {
    public int a;
    public int b = -1;
    public boolean c;
    public final /* synthetic */ dh0 d;

    public bh0(dh0 dh0Var) {
        this.d = dh0Var;
        this.a = dh0Var.c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.c) {
            a70.r("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.b;
            dh0 dh0Var = this.d;
            if (Intrinsics.c(key, dh0Var.g(i)) && Intrinsics.c(entry.getValue(), dh0Var.k(this.b))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.c) {
            return this.d.g(this.b);
        }
        a70.r("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.c) {
            return this.d.k(this.b);
        }
        a70.r("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.c) {
            a70.r("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.b;
        dh0 dh0Var = this.d;
        Object g = dh0Var.g(i);
        Object k = dh0Var.k(this.b);
        return (g == null ? 0 : g.hashCode()) ^ (k != null ? k.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yhk.d();
            return null;
        }
        this.b++;
        this.c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            zzl.s();
            return;
        }
        this.d.i(this.b);
        this.b--;
        this.a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.c) {
            return this.d.j(this.b, obj);
        }
        a70.r("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + U3.j.b + getValue();
    }
}
