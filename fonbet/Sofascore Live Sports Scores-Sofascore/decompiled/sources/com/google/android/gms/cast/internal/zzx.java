package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzff;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.t8p;
import defpackage.y9p;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzx extends GmsClient {
    public static final Logger a0 = new Logger("CastClientImpl", null);
    public static final Object b0 = new Object();
    public static final Object c0 = new Object();
    public ApplicationMetadata I;
    public final CastDevice J;
    public final t8p K;
    public final HashMap L;
    public final Bundle M;
    public y9p N;
    public String O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public double S;
    public com.google.android.gms.cast.zzao T;
    public int U;
    public int V;
    public String W;
    public String X;
    public Bundle Y;
    public final HashMap Z;

    public zzx(Context context, Looper looper, ClientSettings clientSettings, CastDevice castDevice, t8p t8pVar, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 10, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.J = castDevice;
        this.K = t8pVar;
        this.M = bundle;
        this.L = new HashMap();
        new AtomicLong(0L);
        this.Z = new HashMap();
        this.U = -1;
        this.V = -1;
        this.I = null;
        this.O = null;
        this.S = 0.0d;
        t();
        this.P = false;
        this.T = null;
        t();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof zzah ? (zzah) queryLocalInterface : new zzah(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        Object[] objArr = {this.N, Boolean.valueOf(isConnected())};
        Logger logger = a0;
        logger.a("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        y9p y9pVar = this.N;
        zzx zzxVar = null;
        this.N = null;
        if (y9pVar != null) {
            zzx zzxVar2 = (zzx) y9pVar.a.getAndSet(null);
            if (zzxVar2 != null) {
                zzxVar2.U = -1;
                zzxVar2.V = -1;
                zzxVar2.I = null;
                zzxVar2.O = null;
                zzxVar2.S = 0.0d;
                zzxVar2.t();
                zzxVar2.P = false;
                zzxVar2.T = null;
                zzxVar = zzxVar2;
            }
            if (zzxVar != null) {
                u();
                try {
                    try {
                        zzah zzahVar = (zzah) getService();
                        getContext();
                        ApiMetadata a = zzff.a();
                        Parcel J = zzahVar.J();
                        com.google.android.gms.internal.cast.zzc.b(J, a);
                        zzahVar.l2(J, 1);
                    } catch (RemoteException | IllegalStateException unused) {
                        logger.b("Error while disconnecting the controller interface", new Object[0]);
                    }
                    return;
                } finally {
                    super.disconnect();
                }
            }
        }
        logger.a("already disposed, so short-circuiting", new Object[0]);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle e() {
        Bundle bundle = new Bundle();
        a0.a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.W, this.X);
        CastDevice castDevice = this.J;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        Bundle bundle2 = this.M;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        y9p y9pVar = new y9p(this);
        this.N = y9pVar;
        bundle.putParcelable("listener", new BinderWrapper(y9pVar));
        String str = this.W;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.X;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String g() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getConnectionHint() {
        Bundle bundle = this.Y;
        if (bundle == null) {
            return super.getConnectionHint();
        }
        this.Y = null;
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String h() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void k(ConnectionResult connectionResult) {
        super.k(connectionResult);
        u();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void p(int i, IBinder iBinder, Bundle bundle, int i2) {
        a0.a("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 2300) {
            this.Q = true;
            this.R = true;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.Y = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.p(i, iBinder, bundle, i2);
    }

    public final void t() {
        CastDevice castDevice = this.J;
        Preconditions.j(castDevice, "device should not be null");
        zzp zzpVar = castDevice.i;
        if (zzpVar.a(a.o) || !zzpVar.a(4) || zzpVar.a(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.e);
    }

    public final void u() {
        a0.a("removing all MessageReceivedCallbacks", new Object[0]);
        HashMap hashMap = this.L;
        synchronized (hashMap) {
            hashMap.clear();
        }
    }

    public final void v(int i, long j) {
        BaseImplementation.ResultHolder resultHolder;
        HashMap hashMap = this.Z;
        synchronized (hashMap) {
            resultHolder = (BaseImplementation.ResultHolder) hashMap.remove(Long.valueOf(j));
        }
        if (resultHolder != null) {
            resultHolder.a(new Status(i, null, null, null));
        }
    }

    public final void w(int i) {
        synchronized (c0) {
        }
    }
}
