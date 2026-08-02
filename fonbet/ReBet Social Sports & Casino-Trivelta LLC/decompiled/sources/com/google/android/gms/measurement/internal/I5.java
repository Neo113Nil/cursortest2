package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class I5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f33461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f33462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33463c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzr f33464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z5 f33465e;

    public I5(Z5 z52, AtomicReference atomicReference, String str, String str2, String str3, zzr zzrVar) {
        this.f33461a = atomicReference;
        this.f33462b = str2;
        this.f33463c = str3;
        this.f33464d = zzrVar;
        Objects.requireNonNull(z52);
        this.f33465e = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        Z5 z52;
        InterfaceC3241e2 N10;
        AtomicReference atomicReference2 = this.f33461a;
        synchronized (atomicReference2) {
            try {
                try {
                    z52 = this.f33465e;
                    N10 = z52.N();
                } catch (RemoteException e10) {
                    this.f33465e.f33578a.a().o().d("(legacy) Failed to get conditional properties; remote exception", null, this.f33462b, e10);
                    this.f33461a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f33461a;
                }
                if (N10 == null) {
                    z52.f33578a.a().o().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f33462b, this.f33463c);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    zzr zzrVar = this.f33464d;
                    AbstractC3191o.m(zzrVar);
                    atomicReference2.set(N10.F0(this.f33462b, this.f33463c, zzrVar));
                } else {
                    atomicReference2.set(N10.x(null, this.f33462b, this.f33463c));
                }
                z52.J();
                atomicReference = this.f33461a;
                atomicReference.notify();
            } catch (Throwable th2) {
                this.f33461a.notify();
                throw th2;
            }
        }
    }
}
