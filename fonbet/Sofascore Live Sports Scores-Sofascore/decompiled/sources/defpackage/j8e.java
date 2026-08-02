package defpackage;

import java.lang.reflect.Array;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class j8e extends yaa {
    public final /* synthetic */ int h;
    public final /* synthetic */ yaa i;

    public /* synthetic */ j8e(yaa yaaVar, int i) {
        this.h = i;
        this.i = yaaVar;
    }

    @Override // defpackage.yaa
    public final void m(b0g b0gVar, Object obj) {
        int i = this.h;
        yaa yaaVar = this.i;
        switch (i) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        yaaVar.m(b0gVar, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        yaaVar.m(b0gVar, Array.get(obj, i2));
                    }
                    break;
                }
                break;
        }
    }
}
