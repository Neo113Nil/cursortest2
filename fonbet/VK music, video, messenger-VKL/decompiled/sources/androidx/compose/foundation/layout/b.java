package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import xsna.dt1;
import xsna.epx;

/* compiled from: Column.kt */
/* loaded from: classes11.dex */
public final class b {
    public static final c a;

    static {
        a.m mVar = a.c;
        dt1.a.getClass();
        a = new c(mVar, dt1.a.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final c a(a.n nVar, dt1.b bVar, androidx.compose.runtime.a aVar, int i) {
        c cVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1089876336, i, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:108)");
        }
        if (epx.f(nVar, a.c)) {
            dt1.a.getClass();
            if (epx.f(bVar, dt1.a.n)) {
                aVar.K(-1446604504);
                aVar.j();
                cVar = a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return cVar;
            }
        }
        aVar.K(-1446550657);
        boolean z = ((((i & 14) ^ 6) > 4 && aVar.J(nVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && aVar.J(bVar)) || (i & 48) == 32);
        Object x = aVar.x();
        if (z || x == a.C0011a.a) {
            x = new c(nVar, bVar);
            aVar.R(x);
        }
        cVar = (c) x;
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
        }
        return cVar;
    }
}
