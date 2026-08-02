package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ub2 implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b = 0;
    public final int c;
    public final /* synthetic */ Object d;

    public ub2(ec2 ec2Var) {
        this.d = ec2Var;
        this.c = ec2Var.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < this.c) {
                }
                break;
            default:
                if (this.b < this.c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.d;
        int i2 = this.c;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 >= i2) {
                    yhk.d();
                    break;
                } else {
                    this.b = i3 + 1;
                    break;
                }
            default:
                int i4 = this.b;
                if (i4 >= i2) {
                    yhk.d();
                    break;
                } else {
                    this.b = i4 + 1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public ub2(cc2 cc2Var) {
        this.d = cc2Var;
        this.c = cc2Var.size();
    }
}
