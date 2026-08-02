package lg;

import eg.w;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final e f20065d;

    static {
        int i5 = k.f20073c;
        int i10 = k.f20074d;
        long j = k.f20075e;
        String str = k.f20071a;
        e eVar = new e();
        eVar.f20067c = new c(str, i5, i10, j);
        f20065d = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // eg.w
    public final w h0(int i5) {
        jg.h.a(i5);
        return i5 >= k.f20073c ? this : super.h0(i5);
    }

    @Override // eg.w
    public final String toString() {
        return "Dispatchers.Default";
    }
}
