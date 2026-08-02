package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcm extends zzcr {
    public final AtomicReference a = new AtomicReference();
    public boolean b;

    public static final Object l2(Class cls, Bundle bundle) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        return cls.cast(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzcs
    public final void F(Bundle bundle) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.b = true;
                } finally {
                    this.a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String S1(long j) {
        return (String) l2(String.class, Z1(j));
    }

    public final Bundle Z1(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            if (!this.b) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.a.get();
        }
        return bundle;
    }
}
