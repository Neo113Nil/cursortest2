package com.moloco.sdk.internal.utils;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes6.dex */
public final class d implements CoroutineContext.Key<c> {
    public static final int b = 8;
    public final Mutex a;

    public d(Mutex mutex) {
        Intrinsics.checkNotNullParameter(mutex, "mutex");
        this.a = mutex;
    }

    public final Mutex a() {
        return this.a;
    }

    public final Mutex b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.areEqual(this.a, ((d) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.a + ')';
    }

    public final d a(Mutex mutex) {
        Intrinsics.checkNotNullParameter(mutex, "mutex");
        return new d(mutex);
    }

    public static /* synthetic */ d a(d dVar, Mutex mutex, int i, Object obj) {
        if ((i & 1) != 0) {
            mutex = dVar.a;
        }
        return dVar.a(mutex);
    }
}
