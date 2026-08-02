package pe;

import je.A0;
import je.L0;
import je.s0;
import je.u0;
import je.y0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8903d extends u0 {
    @Override // je.u0
    public final y0 h(s0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Wd.b bVar = key instanceof Wd.b ? (Wd.b) key : null;
        if (bVar == null) {
            return null;
        }
        if (bVar.getProjection().a()) {
            return new A0(bVar.getProjection().getType(), L0.OUT_VARIANCE);
        }
        return bVar.getProjection();
    }
}
