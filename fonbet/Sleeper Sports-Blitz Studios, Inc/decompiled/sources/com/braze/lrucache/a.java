package com.braze.lrucache;

import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f562a;

    public a(f fVar) {
        this.f562a = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f562a) {
            f fVar = this.f562a;
            if (fVar.i == null) {
                return null;
            }
            while (fVar.h > fVar.f) {
                fVar.d((String) ((Map.Entry) fVar.j.entrySet().iterator().next()).getKey());
            }
            if (this.f562a.a()) {
                this.f562a.d();
                this.f562a.k = 0;
            }
            return null;
        }
    }
}
