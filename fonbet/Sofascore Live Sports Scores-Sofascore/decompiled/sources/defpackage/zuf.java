package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zuf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ avf b;

    public /* synthetic */ zuf(avf avfVar, int i) {
        this.a = i;
        this.b = avfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        avf avfVar = this.b;
        switch (i) {
            case 0:
                SparseArray sparseArray = avfVar.h;
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((dvf) sparseArray.valueAt(i2)).getClass();
                }
                sparseArray.clear();
                break;
            default:
                gvf gvfVar = avfVar.i;
                if (gvfVar.n == avfVar) {
                    gvfVar.n();
                    break;
                }
                break;
        }
    }
}
