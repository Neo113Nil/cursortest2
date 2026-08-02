package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class w0k implements Iterator, eia {
    public final /* synthetic */ int a;
    public Object[] b;
    public int c;
    public int d;

    public w0k(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = v0k.e.d;
                break;
            default:
                this.b = u0k.e.d;
                break;
        }
    }

    public void a(int i, int i2, Object[] objArr) {
        this.b = objArr;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.d < this.c) {
                }
                break;
            default:
                if (this.d < this.c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
