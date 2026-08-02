package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3219b4 implements InterfaceC3329p2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3298l3 f33934a;

    public C3219b4(C3227c4 c3227c4, C3298l3 c3298l3) {
        this.f33934a = c3298l3;
        Objects.requireNonNull(c3227c4);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3329p2
    public final boolean zza() {
        return Log.isLoggable(this.f33934a.a().z(), 3);
    }
}
