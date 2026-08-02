package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class B3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbg f33300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f33301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N3 f33302c;

    public B3(N3 n32, zzbg zzbgVar, String str) {
        this.f33300a = zzbgVar;
        this.f33301b = str;
        Objects.requireNonNull(n32);
        this.f33302c = n32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N3 n32 = this.f33302c;
        n32.O0().E();
        n32.O0().i(this.f33300a, this.f33301b);
    }
}
