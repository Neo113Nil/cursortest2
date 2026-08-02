package x2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class g<T> implements f<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object[] f104938a;

    /* renamed from: b, reason: collision with root package name */
    private int f104939b;

    public g(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f104938a = new Object[i11];
    }

    @Override // x2.f
    public T a() {
        int i11 = this.f104939b;
        if (i11 <= 0) {
            return null;
        }
        int i12 = i11 - 1;
        Object[] objArr = this.f104938a;
        T t2 = (T) objArr[i12];
        Intrinsics.g(t2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i12] = null;
        this.f104939b--;
        return t2;
    }

    @Override // x2.f
    public boolean b(@NotNull T instance) {
        Object[] objArr;
        boolean z11;
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i11 = this.f104939b;
        int i12 = 0;
        while (true) {
            objArr = this.f104938a;
            if (i12 >= i11) {
                z11 = false;
                break;
            }
            if (objArr[i12] == instance) {
                z11 = true;
                break;
            }
            i12++;
        }
        if (z11) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i13 = this.f104939b;
        if (i13 >= objArr.length) {
            return false;
        }
        objArr[i13] = instance;
        this.f104939b = i13 + 1;
        return true;
    }
}
