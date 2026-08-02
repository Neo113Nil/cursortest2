package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC3179c;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.plaid.internal.EnumC3631g;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class T5 implements ServiceConnection, AbstractC3179c.a, AbstractC3179c.b {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f33669a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C3344r2 f33670b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z5 f33671c;

    public T5(Z5 z52) {
        Objects.requireNonNull(z52);
        this.f33671c = z52;
    }

    public final void a(Intent intent) {
        Z5 z52 = this.f33671c;
        z52.h();
        Context d10 = z52.f33578a.d();
        J9.b b10 = J9.b.b();
        synchronized (this) {
            try {
                if (this.f33669a) {
                    this.f33671c.f33578a.a().w().a("Connection attempt already in progress");
                    return;
                }
                Z5 z53 = this.f33671c;
                z53.f33578a.a().w().a("Using local app measurement service");
                this.f33669a = true;
                b10.a(d10, intent, z53.M(), EnumC3631g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        if (this.f33670b != null && (this.f33670b.isConnected() || this.f33670b.isConnecting())) {
            this.f33670b.disconnect();
        }
        this.f33670b = null;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c.b
    public final void c(ConnectionResult connectionResult) {
        Z5 z52 = this.f33671c;
        z52.f33578a.b().o();
        C3392x2 y10 = z52.f33578a.y();
        if (y10 != null) {
            y10.w().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f33669a = false;
            this.f33670b = null;
        }
        this.f33671c.f33578a.b().t(new S5(this, connectionResult));
    }

    public final void d() {
        Z5 z52 = this.f33671c;
        z52.h();
        Context d10 = z52.f33578a.d();
        synchronized (this) {
            try {
                if (this.f33669a) {
                    this.f33671c.f33578a.a().w().a("Connection attempt already in progress");
                    return;
                }
                if (this.f33670b != null && (this.f33670b.isConnecting() || this.f33670b.isConnected())) {
                    this.f33671c.f33578a.a().w().a("Already awaiting connection attempt");
                    return;
                }
                this.f33670b = new C3344r2(d10, Looper.getMainLooper(), this, this);
                this.f33671c.f33578a.a().w().a("Connecting to remote service");
                this.f33669a = true;
                AbstractC3191o.m(this.f33670b);
                this.f33670b.checkAvailabilityAndConnect();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void e(boolean z10) {
        this.f33669a = false;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c.a
    public final void g(Bundle bundle) {
        this.f33671c.f33578a.b().o();
        synchronized (this) {
            try {
                AbstractC3191o.m(this.f33670b);
                this.f33671c.f33578a.b().t(new O5(this, (InterfaceC3241e2) this.f33670b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f33670b = null;
                this.f33669a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c.a
    public final void i(int i10) {
        C3298l3 c3298l3 = this.f33671c.f33578a;
        c3298l3.b().o();
        c3298l3.a().v().a("Service connection suspended");
        c3298l3.b().t(new P5(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f33671c.f33578a.b().o();
        synchronized (this) {
            if (iBinder == null) {
                this.f33669a = false;
                this.f33671c.f33578a.a().o().a("Service connected with null binder");
                return;
            }
            InterfaceC3241e2 interfaceC3241e2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    interfaceC3241e2 = queryLocalInterface instanceof InterfaceC3241e2 ? (InterfaceC3241e2) queryLocalInterface : new C3217b2(iBinder);
                    this.f33671c.f33578a.a().w().a("Bound to IMeasurementService interface");
                } else {
                    this.f33671c.f33578a.a().o().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f33671c.f33578a.a().o().a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC3241e2 == null) {
                this.f33669a = false;
                try {
                    J9.b b10 = J9.b.b();
                    Z5 z52 = this.f33671c;
                    b10.c(z52.f33578a.d(), z52.M());
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f33671c.f33578a.b().t(new L5(this, interfaceC3241e2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C3298l3 c3298l3 = this.f33671c.f33578a;
        c3298l3.b().o();
        c3298l3.a().v().a("Service disconnected");
        c3298l3.b().t(new M5(this, componentName));
    }
}
