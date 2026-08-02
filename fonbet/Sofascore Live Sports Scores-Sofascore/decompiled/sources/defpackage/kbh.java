package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kbh extends rbh {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public kbh(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.rbh
    public final void a(Matrix matrix, sah sahVar, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((rbh) it.next()).a(this.d, sahVar, i, canvas);
        }
    }
}
