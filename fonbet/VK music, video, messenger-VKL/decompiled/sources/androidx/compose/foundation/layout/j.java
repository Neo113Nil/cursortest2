package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import xsna.dt1;
import xsna.epx;

/* compiled from: Row.kt */
/* loaded from: classes11.dex */
public final class j {
    public static final k a;

    static {
        a.l lVar = a.a;
        dt1.a.getClass();
        a = new k(lVar, dt1.a.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final k a(a.e eVar, dt1.c cVar, androidx.compose.runtime.a aVar, int i) {
        k kVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-837807694, i, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:118)");
        }
        if (epx.f(eVar, a.a)) {
            dt1.a.getClass();
            if (epx.f(cVar, dt1.a.k)) {
                aVar.K(-1073830487);
                aVar.j();
                kVar = a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return kVar;
            }
        }
        aVar.K(-1073779616);
        boolean z = ((((i & 14) ^ 6) > 4 && aVar.J(eVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && aVar.J(cVar)) || (i & 48) == 32);
        Object x = aVar.x();
        if (z || x == a.C0011a.a) {
            x = new k(eVar, cVar);
            aVar.R(x);
        }
        kVar = (k) x;
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
        }
        return kVar;
    }
}
