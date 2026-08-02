package cf;

import mf.d;
import sf.F;
import sf.G;

/* loaded from: classes10.dex */
public final class i extends d.c {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C5822c f57126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(C5822c c5822c, G g10, F f7, G g11, F f11) {
        super(true, g11, f11);
        this.f57126d = c5822c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f57126d.a(-1L, true, true, null);
    }
}
