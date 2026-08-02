package androidx.core.util;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x0.InterfaceC6775d;

/* loaded from: classes.dex */
public class Pools$SimplePool implements InterfaceC6775d {

    /* renamed from: a, reason: collision with root package name */
    public int f19126a;

    @NotNull
    private final Object[] pool;

    public Pools$SimplePool(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.pool = new Object[i10];
    }

    public final boolean a(Object obj) {
        int i10 = this.f19126a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.pool[i11] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // x0.InterfaceC6775d
    public Object acquire() {
        int i10 = this.f19126a;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.pool[i11];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.pool[i11] = null;
        this.f19126a--;
        return obj;
    }

    @Override // x0.InterfaceC6775d
    public boolean release(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (a(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.f19126a;
        Object[] objArr = this.pool;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.f19126a = i10 + 1;
        return true;
    }
}
