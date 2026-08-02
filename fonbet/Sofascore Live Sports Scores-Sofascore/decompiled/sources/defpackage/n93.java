package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class n93 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5d b;

    public /* synthetic */ n93(w5d w5dVar, int i) {
        this.a = i;
        this.b = w5dVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        w5d w5dVar = this.b;
        switch (i) {
            case 0:
                if (obj != null) {
                    if (obj2 != null) {
                        break;
                    } else {
                        break;
                    }
                } else if (obj2 == null) {
                    break;
                }
                break;
            default:
                if (obj != null) {
                    if (obj2 != null) {
                        break;
                    }
                } else if (obj2 != null) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return w5dVar.compare(obj, obj2);
    }
}
