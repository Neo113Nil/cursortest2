package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.q6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3341q6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3348r6 f34256a;

    public C3341q6(C3348r6 c3348r6) {
        Objects.requireNonNull(c3348r6);
        this.f34256a = c3348r6;
    }

    public final void a() {
        C3348r6 c3348r6 = this.f34256a;
        c3348r6.h();
        C3298l3 c3298l3 = c3348r6.f33578a;
        if (c3298l3.x().A(c3298l3.e().a())) {
            c3298l3.x().f33523m.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                c3298l3.a().w().a("Detected application was in foreground");
                c(c3298l3.e().a(), false);
            }
        }
    }

    public final void b(long j10, boolean z10) {
        C3348r6 c3348r6 = this.f34256a;
        c3348r6.h();
        c3348r6.q();
        C3298l3 c3298l3 = c3348r6.f33578a;
        if (c3298l3.x().A(j10)) {
            c3298l3.x().f33523m.b(true);
            c3348r6.f33578a.L().p();
        }
        c3298l3.x().f33527q.b(j10);
        if (c3298l3.x().f33523m.a()) {
            c(j10, z10);
        }
    }

    public final void c(long j10, boolean z10) {
        C3348r6 c3348r6 = this.f34256a;
        c3348r6.h();
        if (c3348r6.f33578a.g()) {
            C3298l3 c3298l3 = c3348r6.f33578a;
            c3298l3.x().f33527q.b(j10);
            c3298l3.a().w().b("Session started, time", Long.valueOf(c3298l3.e().b()));
            long j11 = j10 / 1000;
            C3298l3 c3298l32 = c3348r6.f33578a;
            c3298l32.B().B("auto", "_sid", Long.valueOf(j11), j10);
            c3298l3.x().f33528r.b(j11);
            c3298l3.x().f33523m.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            c3298l32.B().u("auto", "_s", j10, bundle);
            String a10 = c3298l3.x().f33533w.a();
            if (TextUtils.isEmpty(a10)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", a10);
            c3298l32.B().u("auto", "_ssr", j10, bundle2);
        }
    }
}
