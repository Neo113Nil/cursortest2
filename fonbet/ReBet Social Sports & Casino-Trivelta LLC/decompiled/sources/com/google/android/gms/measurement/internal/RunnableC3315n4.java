package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.n4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3315n4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f34176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f34178c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f34179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f34180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f34181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f34182g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f34183h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ W4 f34184i;

    public RunnableC3315n4(W4 w42, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f34176a = str;
        this.f34177b = str2;
        this.f34178c = j10;
        this.f34179d = bundle;
        this.f34180e = z10;
        this.f34181f = z11;
        this.f34182g = z12;
        this.f34183h = str3;
        Objects.requireNonNull(w42);
        this.f34184i = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34184i.v(this.f34176a, this.f34177b, this.f34178c, this.f34179d, this.f34180e, this.f34181f, this.f34182g, this.f34183h);
    }
}
