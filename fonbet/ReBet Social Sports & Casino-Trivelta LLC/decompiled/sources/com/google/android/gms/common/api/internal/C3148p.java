package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.h;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3148p extends com.google.android.gms.common.api.g {

    /* renamed from: a, reason: collision with root package name */
    public final BasePendingResult f32554a;

    public C3148p(com.google.android.gms.common.api.h hVar) {
        this.f32554a = (BasePendingResult) hVar;
    }

    @Override // com.google.android.gms.common.api.h
    public final void addStatusListener(h.a aVar) {
        this.f32554a.addStatusListener(aVar);
    }

    @Override // com.google.android.gms.common.api.h
    public final com.google.android.gms.common.api.l await(long j10, TimeUnit timeUnit) {
        return this.f32554a.await(j10, timeUnit);
    }
}
