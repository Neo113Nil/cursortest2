package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzhcs extends zzgxd implements Future {
    @Override // com.google.android.gms.internal.ads.zzgxd
    public /* bridge */ /* synthetic */ Object c() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return d().cancel(z);
    }

    public abstract Future d();

    @Override // java.util.concurrent.Future
    public final Object get() {
        return d().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return d().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return d().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return d().get(j, timeUnit);
    }
}
