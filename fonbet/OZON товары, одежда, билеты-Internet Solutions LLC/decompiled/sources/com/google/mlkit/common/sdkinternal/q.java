package com.google.mlkit.common.sdkinternal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes9.dex */
final class q extends PhantomReference {

    /* renamed from: a, reason: collision with root package name */
    private final Set f60055a;

    /* renamed from: b, reason: collision with root package name */
    private final o f60056b;

    /* synthetic */ q(C5945a c5945a, ReferenceQueue referenceQueue, Set set, o oVar) {
        super(c5945a, referenceQueue);
        this.f60055a = set;
        this.f60056b = oVar;
    }

    public final void a() {
        if (this.f60055a.remove(this)) {
            clear();
            getClass();
        }
    }
}
