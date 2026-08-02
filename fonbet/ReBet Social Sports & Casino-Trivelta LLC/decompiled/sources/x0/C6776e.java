package x0;

import androidx.core.util.Pools$SimplePool;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6776e extends Pools$SimplePool {

    /* renamed from: b, reason: collision with root package name */
    public final Object f67819b;

    public C6776e(int i10) {
        super(i10);
        this.f67819b = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, x0.InterfaceC6775d
    public Object acquire() {
        Object acquire;
        synchronized (this.f67819b) {
            acquire = super.acquire();
        }
        return acquire;
    }

    @Override // androidx.core.util.Pools$SimplePool, x0.InterfaceC6775d
    public boolean release(Object instance) {
        boolean release;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f67819b) {
            release = super.release(instance);
        }
        return release;
    }
}
