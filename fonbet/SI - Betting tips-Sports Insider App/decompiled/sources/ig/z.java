package ig;

import hg.b1;
import hg.t0;
import hg.u0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class z extends t0 implements b1 {
    @Override // hg.b1
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f10770h;
            Intrinsics.checkNotNull(objArr);
            valueOf = Integer.valueOf(((Number) u0.c(objArr, (this.f10771i + ((int) ((p() + this.f10772k) - this.f10771i))) - 1)).intValue());
        }
        return valueOf;
    }

    public final void w(int i5) {
        synchronized (this) {
            Object[] objArr = this.f10770h;
            Intrinsics.checkNotNull(objArr);
            b(Integer.valueOf(((Number) u0.c(objArr, (this.f10771i + ((int) ((p() + this.f10772k) - this.f10771i))) - 1)).intValue() + i5));
        }
    }
}
