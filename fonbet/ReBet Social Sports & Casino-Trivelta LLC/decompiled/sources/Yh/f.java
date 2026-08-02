package Yh;

/* loaded from: classes5.dex */
public abstract class f {
    public static final Void b(Throwable th2) {
        throw new IllegalStateException("Dispatchers.Main was accessed when the platform dispatcher was absent and the test dispatcher was unset. Please make sure that Dispatchers.setMain() is called before accessing Dispatchers.Main and that Dispatchers.Main is not accessed after Dispatchers.resetMain().", th2);
    }
}
