package g4;

import android.os.Build;
import d4.l;
import okio.BufferedSource;
import q4.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements d4.k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9739a;

    public a() {
        this.f9739a = Build.VERSION.SDK_INT < 34;
    }

    @Override // d4.k
    public final l a(f4.l lVar, n nVar) {
        BufferedSource m02 = lVar.f9459a.m0();
        if (!m02.rangeEquals(0L, f.f9755b) && !m02.rangeEquals(0L, f.f9754a) && (!m02.rangeEquals(0L, f.f9756c) || !m02.rangeEquals(8L, f.f9757d) || !m02.rangeEquals(12L, f.f9758e) || !m02.request(21L) || ((byte) (m02.getBuffer().getByte(20L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !m02.rangeEquals(4L, f.f9759f)) {
                return null;
            }
            if (!m02.rangeEquals(8L, f.f9760g) && !m02.rangeEquals(8L, f.f9761h) && !m02.rangeEquals(8L, f.f9762i)) {
                return null;
            }
        }
        return new e(lVar.f9459a, nVar, this.f9739a);
    }
}
