package ph;

/* renamed from: ph.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6079j {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f63224a = new ThreadLocal();

    public static char[] a(int i10) {
        ThreadLocal threadLocal = f63224a;
        char[] cArr = (char[]) threadLocal.get();
        if (cArr != null && cArr.length >= i10) {
            return cArr;
        }
        char[] cArr2 = new char[i10];
        threadLocal.set(cArr2);
        return cArr2;
    }
}
