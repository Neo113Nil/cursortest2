package Sh;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class P implements CoroutineContext.Key {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f10776a;

    public P(ThreadLocal threadLocal) {
        this.f10776a = threadLocal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P) && Intrinsics.areEqual(this.f10776a, ((P) obj).f10776a);
    }

    public int hashCode() {
        return this.f10776a.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f10776a + ')';
    }
}
