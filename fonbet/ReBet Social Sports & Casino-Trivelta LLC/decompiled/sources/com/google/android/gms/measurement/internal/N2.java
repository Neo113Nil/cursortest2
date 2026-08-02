package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzbp;
import com.google.android.gms.internal.measurement.zzbq;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class N2 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final String f33564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O2 f33565b;

    public N2(O2 o22, String str) {
        Objects.requireNonNull(o22);
        this.f33565b = o22;
        this.f33564a = str;
    }

    public final /* synthetic */ String a() {
        return this.f33564a;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f33565b.f33577a.a().r().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzbq zzb = zzbp.zzb(iBinder);
            if (zzb == null) {
                this.f33565b.f33577a.a().r().a("Install Referrer Service implementation was not found");
                return;
            }
            C3298l3 c3298l3 = this.f33565b.f33577a;
            c3298l3.a().w().a("Install Referrer Service connected");
            c3298l3.b().t(new M2(this, zzb, this));
        } catch (RuntimeException e10) {
            this.f33565b.f33577a.a().r().b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f33565b.f33577a.a().w().a("Install Referrer Service disconnected");
    }
}
