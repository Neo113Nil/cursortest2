package di;

/* loaded from: classes5.dex */
public abstract class N0 {
    public static /* synthetic */ void c(N0 n02, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i11 & 1) != 0) {
            i10 = n02.d() + 1;
        }
        n02.b(i10);
    }

    public abstract Object a();

    public abstract void b(int i10);

    public abstract int d();
}
