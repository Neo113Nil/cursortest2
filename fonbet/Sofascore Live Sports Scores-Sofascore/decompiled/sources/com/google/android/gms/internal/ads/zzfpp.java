package com.google.android.gms.internal.ads;

import defpackage.bf3;
import defpackage.ddb;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfpp implements ddb {
    public final Object a;
    public final String b;
    public final ddb c;

    public zzfpp(Object obj, String str, ddb ddbVar) {
        this.a = obj;
        this.b = str;
        this.c = ddbVar;
    }

    @Override // defpackage.ddb
    public final void addListener(Runnable runnable, Executor executor) {
        this.c.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.c.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.c.isDone();
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        String str = this.b;
        return bf3.h(identityHashCode, str, "@", new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(identityHashCode).length()));
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.c.get(j, timeUnit);
    }
}
