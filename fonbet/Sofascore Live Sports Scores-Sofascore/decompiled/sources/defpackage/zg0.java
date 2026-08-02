package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zg0 implements Iterator, eia {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zg0(dh0 dh0Var, int i) {
        this(dh0Var.c);
        this.d = i;
        switch (i) {
            case 1:
                this.e = dh0Var;
                this(dh0Var.c);
                break;
            default:
                this.e = dh0Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object g;
        if (!hasNext()) {
            yhk.d();
            return null;
        }
        int i = this.b;
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                g = ((dh0) obj).g(i);
                break;
            case 1:
                g = ((dh0) obj).k(i);
                break;
            default:
                g = ((gh0) obj).b[i];
                break;
        }
        this.b++;
        this.c = true;
        return g;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            a70.r("Call next() before removing an element.");
            return;
        }
        int i = this.b - 1;
        this.b = i;
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                ((dh0) obj).i(i);
                break;
            case 1:
                ((dh0) obj).i(i);
                break;
            default:
                ((gh0) obj).c(i);
                break;
        }
        this.a--;
        this.c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zg0(gh0 gh0Var) {
        this(gh0Var.c);
        this.d = 2;
        this.e = gh0Var;
    }

    public zg0(int i) {
        this.a = i;
    }
}
