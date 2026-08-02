package y7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import x7.C10673a;
import y7.n;

/* loaded from: classes.dex */
final class m extends n.f {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f106176b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Matrix f106177c;

    m(ArrayList arrayList, Matrix matrix) {
        this.f106176b = arrayList;
        this.f106177c = matrix;
    }

    @Override // y7.n.f
    public final void a(Matrix matrix, C10673a c10673a, int i11, Canvas canvas) {
        Iterator it = this.f106176b.iterator();
        while (it.hasNext()) {
            ((n.f) it.next()).a(this.f106177c, c10673a, i11, canvas);
        }
    }
}
