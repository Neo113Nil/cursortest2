package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3368u2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34312c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f34313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f34314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C3392x2 f34315f;

    public RunnableC3368u2(C3392x2 c3392x2, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f34310a = i10;
        this.f34311b = str;
        this.f34312c = obj;
        this.f34313d = obj2;
        this.f34314e = obj3;
        Objects.requireNonNull(c3392x2);
        this.f34315f = c3392x2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3392x2 c3392x2 = this.f34315f;
        L2 x10 = c3392x2.f33578a.x();
        if (!x10.k()) {
            Log.println(6, c3392x2.z(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (c3392x2.D() == 0) {
            C3298l3 c3298l3 = c3392x2.f33578a;
            if (c3298l3.w().B()) {
                c3298l3.c();
                c3392x2.E('C');
            } else {
                c3298l3.c();
                c3392x2.E('c');
            }
        }
        if (c3392x2.F() < 0) {
            c3392x2.f33578a.w().A();
            c3392x2.G(133005L);
        }
        int i10 = this.f34310a;
        char D10 = c3392x2.D();
        long F10 = c3392x2.F();
        String str = this.f34311b;
        Object obj = this.f34312c;
        Object obj2 = this.f34313d;
        Object obj3 = this.f34314e;
        char charAt = "01VDIWEA?".charAt(i10);
        String A10 = C3392x2.A(true, str, obj, obj2, obj3);
        int length = String.valueOf(charAt).length();
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(D10).length() + String.valueOf(F10).length() + 1 + A10.length());
        sb2.append("2");
        sb2.append(charAt);
        sb2.append(D10);
        sb2.append(F10);
        sb2.append(":");
        sb2.append(A10);
        String sb3 = sb2.toString();
        if (sb3.length() > 1024) {
            sb3 = str.substring(0, 1024);
        }
        J2 j22 = x10.f33515e;
        if (j22 != null) {
            j22.a(sb3, 1L);
        }
    }
}
