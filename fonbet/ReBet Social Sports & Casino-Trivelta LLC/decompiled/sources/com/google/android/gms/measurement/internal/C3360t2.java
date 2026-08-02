package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C3195t;
import com.google.android.gms.common.internal.InterfaceC3194s;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3360t2 {

    /* renamed from: d, reason: collision with root package name */
    public static C3360t2 f34290d;

    /* renamed from: a, reason: collision with root package name */
    public final C3298l3 f34291a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3194s f34292b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f34293c = new AtomicLong(-1);

    public C3360t2(Context context, C3298l3 c3298l3) {
        this.f34292b = com.google.android.gms.common.internal.r.b(context, C3195t.a().b("measurement:api").a());
        this.f34291a = c3298l3;
    }

    public static C3360t2 a(C3298l3 c3298l3) {
        if (f34290d == null) {
            f34290d = new C3360t2(c3298l3.d(), c3298l3);
        }
        return f34290d;
    }

    public final synchronized void b(int i10, int i11, long j10, long j11, int i12) {
        final long b10 = this.f34291a.e().b();
        AtomicLong atomicLong = this.f34293c;
        if (atomicLong.get() != -1 && b10 - atomicLong.get() <= 1800000) {
            return;
        }
        this.f34292b.a(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i11, 0, j10, j11, null, null, 0, i12)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.measurement.internal.s2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                C3360t2.this.c(b10, exc);
            }
        });
    }

    public final /* synthetic */ void c(long j10, Exception exc) {
        this.f34293c.set(j10);
    }
}
