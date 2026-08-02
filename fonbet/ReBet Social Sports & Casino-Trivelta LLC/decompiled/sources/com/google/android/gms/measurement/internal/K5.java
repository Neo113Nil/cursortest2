package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class K5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f33501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f33502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33503c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzr f33504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f33505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z5 f33506f;

    public K5(Z5 z52, AtomicReference atomicReference, String str, String str2, String str3, zzr zzrVar, boolean z10) {
        this.f33501a = atomicReference;
        this.f33502b = str2;
        this.f33503c = str3;
        this.f33504d = zzrVar;
        this.f33505e = z10;
        Objects.requireNonNull(z52);
        this.f33506f = z52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        Z5 z52;
        InterfaceC3241e2 N10;
        AtomicReference atomicReference2 = this.f33501a;
        synchronized (atomicReference2) {
            try {
                try {
                    z52 = this.f33506f;
                    N10 = z52.N();
                } catch (RemoteException e10) {
                    this.f33506f.f33578a.a().o().d("(legacy) Failed to get user properties; remote exception", null, this.f33502b, e10);
                    this.f33501a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f33501a;
                }
                if (N10 == null) {
                    z52.f33578a.a().o().d("(legacy) Failed to get user properties; not connected to service", null, this.f33502b, this.f33503c);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    zzr zzrVar = this.f33504d;
                    AbstractC3191o.m(zzrVar);
                    atomicReference2.set(N10.y0(this.f33502b, this.f33503c, this.f33505e, zzrVar));
                } else {
                    atomicReference2.set(N10.j(null, this.f33502b, this.f33503c, this.f33505e));
                }
                z52.J();
                atomicReference = this.f33501a;
                atomicReference.notify();
            } catch (Throwable th2) {
                this.f33501a.notify();
                throw th2;
            }
        }
    }
}
