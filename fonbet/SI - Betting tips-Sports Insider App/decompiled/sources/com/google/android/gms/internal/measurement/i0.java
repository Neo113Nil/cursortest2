package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 extends y implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f5081a;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5082f;

    public i0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f5081a = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e7) {
            io.sentry.android.core.w0.n("AM", androidx.appcompat.widget.c1.o("Unexpected object type. Expected, Received: ", cls.getCanonicalName(), ", ", obj.getClass().getCanonicalName()), e7);
            throw e7;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean a(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) z.a(parcel, Bundle.CREATOR);
        z.d(parcel);
        b(bundle);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final void b(Bundle bundle) {
        AtomicReference atomicReference = this.f5081a;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f5082f = true;
                } finally {
                    this.f5081a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bundle e(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.f5081a;
        synchronized (atomicReference) {
            if (!this.f5082f) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f5081a.get();
        }
        return bundle;
    }
}
