package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class wee implements Iterator, eia {
    public final /* synthetic */ int a;
    public final xee b;

    public wee(vee veeVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new xee(veeVar.b, veeVar);
                break;
            case 2:
                this.b = new xee(veeVar.b, veeVar);
                break;
            default:
                this.b = new xee(veeVar.b, veeVar);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        xee xeeVar = this.b;
        switch (i) {
        }
        return xeeVar.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        xee xeeVar = this.b;
        switch (i) {
            case 0:
                return new e0d(xeeVar.b, xeeVar.c, xeeVar.next());
            case 1:
                xeeVar.next();
                return xeeVar.c;
            default:
                return xeeVar.next().a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        xee xeeVar = this.b;
        switch (i) {
            case 0:
                xeeVar.remove();
                break;
            case 1:
                xeeVar.remove();
                break;
            default:
                xeeVar.remove();
                break;
        }
    }
}
