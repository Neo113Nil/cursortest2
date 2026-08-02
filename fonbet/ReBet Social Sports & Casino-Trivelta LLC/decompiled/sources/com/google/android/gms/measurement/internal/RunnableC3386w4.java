package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcu;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.w4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3386w4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzcu f34358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W4 f34359b;

    public RunnableC3386w4(W4 w42, zzcu zzcuVar) {
        this.f34358a = zzcuVar;
        Objects.requireNonNull(w42);
        this.f34359b = w42;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Long valueOf;
        W4 w42 = this.f34359b;
        C3298l3 c3298l3 = w42.f33578a.z().f33578a;
        if (!c3298l3.x().w().o(U3.ANALYTICS_STORAGE)) {
            c3298l3.a().t().a("Analytics storage consent denied; will not get session id");
        } else if (!c3298l3.x().A(c3298l3.e().a()) && c3298l3.x().f33528r.a() != 0) {
            valueOf = Long.valueOf(c3298l3.x().f33528r.a());
            if (valueOf == null) {
                w42.f33578a.C().b0(this.f34358a, valueOf.longValue());
                return;
            } else {
                try {
                    this.f34358a.zzb(null);
                    return;
                } catch (RemoteException e10) {
                    this.f34359b.f33578a.a().o().b("getSessionId failed with exception", e10);
                    return;
                }
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }
}
