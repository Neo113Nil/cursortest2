package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class zee implements Iterator, eia {
    public final /* synthetic */ int a;
    public final afe b;

    public zee(uee ueeVar, int i) {
        this.a = i;
        int i2 = 0;
        switch (i) {
            case 1:
                this.b = new afe(ueeVar.d, i2, ueeVar.f);
                break;
            case 2:
                this.b = new afe(ueeVar.d, i2, ueeVar.f);
                break;
            default:
                this.b = new afe(ueeVar.d, i2, ueeVar.f);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        afe afeVar = this.b;
        switch (i) {
        }
        return afeVar.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        afe afeVar = this.b;
        switch (i) {
            case 0:
                return new qtb(1, afeVar.b, afeVar.a().a);
            case 1:
                Object obj = afeVar.b;
                afeVar.a();
                return obj;
            default:
                return afeVar.a().a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
