package Sh;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public class S {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10777b = AtomicIntegerFieldUpdater.newUpdater(S.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private T[] f10778a;

    public final void a(T t10) {
        t10.c(this);
        T[] g10 = g();
        int c10 = c();
        k(c10 + 1);
        g10[c10] = t10;
        t10.setIndex(c10);
        m(c10);
    }

    public final T b() {
        T[] tArr = this.f10778a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return f10777b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final T f() {
        T b10;
        synchronized (this) {
            b10 = b();
        }
        return b10;
    }

    public final T[] g() {
        T[] tArr = this.f10778a;
        if (tArr == null) {
            T[] tArr2 = new T[4];
            this.f10778a = tArr2;
            return tArr2;
        }
        if (c() < tArr.length) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        T[] tArr3 = (T[]) copyOf;
        this.f10778a = tArr3;
        return tArr3;
    }

    public final boolean h(T t10) {
        boolean z10;
        synchronized (this) {
            if (t10.b() == null) {
                z10 = false;
            } else {
                i(t10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    public final T i(int i10) {
        T[] tArr = this.f10778a;
        Intrinsics.checkNotNull(tArr);
        k(c() - 1);
        if (i10 < c()) {
            n(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                Intrinsics.checkNotNull(t10);
                T t11 = tArr[i11];
                Intrinsics.checkNotNull(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    n(i10, i11);
                    m(i11);
                }
            }
            l(i10);
        }
        T t12 = tArr[c()];
        Intrinsics.checkNotNull(t12);
        t12.c(null);
        t12.setIndex(-1);
        tArr[c()] = null;
        return t12;
    }

    public final T j() {
        T i10;
        synchronized (this) {
            i10 = c() > 0 ? i(0) : null;
        }
        return i10;
    }

    public final void k(int i10) {
        f10777b.set(this, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i10) {
        while (true) {
            int i11 = i10 * 2;
            int i12 = i11 + 1;
            if (i12 >= c()) {
                return;
            }
            T[] tArr = this.f10778a;
            Intrinsics.checkNotNull(tArr);
            int i13 = i11 + 2;
            if (i13 < c()) {
                T t10 = tArr[i13];
                Intrinsics.checkNotNull(t10);
                T t11 = tArr[i12];
                Intrinsics.checkNotNull(t11);
            }
            i13 = i12;
            T t12 = tArr[i10];
            Intrinsics.checkNotNull(t12);
            T t13 = tArr[i13];
            Intrinsics.checkNotNull(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                return;
            }
            n(i10, i13);
            i10 = i13;
        }
    }

    public final void m(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f10778a;
            Intrinsics.checkNotNull(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            Intrinsics.checkNotNull(t10);
            T t11 = tArr[i10];
            Intrinsics.checkNotNull(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    public final void n(int i10, int i11) {
        T[] tArr = this.f10778a;
        Intrinsics.checkNotNull(tArr);
        T t10 = tArr[i11];
        Intrinsics.checkNotNull(t10);
        T t11 = tArr[i10];
        Intrinsics.checkNotNull(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }
}
