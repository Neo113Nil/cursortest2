package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2178c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f20375a;

    public C2178c(Object obj) {
        this.f20375a = new AtomicReference(obj);
    }

    public final boolean a(Object obj, Object obj2) {
        return AbstractC2177b.a(this.f20375a, obj, obj2);
    }

    public final Object b() {
        return this.f20375a.get();
    }
}
