package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class lee implements Iterator, eia {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public lee(gee geeVar) {
        w0k[] w0kVarArr = new w0k[8];
        for (int i = 0; i < 8; i++) {
            w0kVarArr[i] = new a1k(this);
        }
        this.b = new iee(geeVar, w0kVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return ((hee) this.b).c;
            default:
                return ((iee) this.b).c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return (Map.Entry) ((hee) this.b).next();
            default:
                return (Map.Entry) ((iee) this.b).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                ((hee) this.b).remove();
                break;
            default:
                ((iee) this.b).remove();
                break;
        }
    }

    public lee(fee feeVar) {
        w0k[] w0kVarArr = new w0k[8];
        for (int i = 0; i < 8; i++) {
            w0kVarArr[i] = new z0k(this);
        }
        this.b = new hee(feeVar, w0kVarArr);
    }
}
