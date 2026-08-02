package com.google.android.gms.wearable.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.nsa;
import defpackage.p2o;
import defpackage.qc4;
import defpackage.ygo;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzkf extends GmsClient {
    public final ExecutorService I;
    public final ygo J;
    public final ygo K;
    public final ygo L;
    public final ygo M;
    public final ygo N;
    public final ygo O;
    public final ygo P;
    public final ygo Q;
    public final ygo R;
    public final ygo S;
    public final zzkp T;
    public final nsa U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkf(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings) {
        super(context, looper, 14, clientSettings, connectionCallbacks, onConnectionFailedListener);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new p2o(2)));
        zzkp a = zzkp.a(context);
        this.J = new ygo();
        this.K = new ygo();
        this.L = new ygo();
        this.M = new ygo();
        this.N = new ygo();
        this.O = new ygo();
        this.P = new ygo();
        this.Q = new ygo();
        this.R = new ygo();
        this.S = new ygo();
        new HashMap();
        new HashMap();
        unconfigurableExecutorService.getClass();
        this.I = unconfigurableExecutorService;
        this.T = a;
        this.U = new nsa(new qc4(context, 7));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof zzgq ? (zzgq) queryLocalInterface : new zzgq(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void connect(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        if (!requiresGooglePlayServices()) {
            try {
                Bundle bundle = getContext().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i < 8600000) {
                    new StringBuilder(String.valueOf(i).length() + 71);
                    Context context = getContext();
                    Context context2 = getContext();
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context2.getPackageManager().resolveActivity(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    q(connectionProgressReportCallbacks, 6, PendingIntent.getActivity(context, 0, intent, com.google.android.gms.internal.wearable.zzl.a));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                q(connectionProgressReportCallbacks, 16, null);
                return;
            }
        }
        super.connect(connectionProgressReportCallbacks);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String g() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return com.google.android.gms.wearable.zzn.a;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 8600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String h() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String i() {
        return this.T.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void p(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            new StringBuilder(String.valueOf(i).length() + 30);
        }
        if (i == 0) {
            this.J.a(iBinder);
            this.K.a(iBinder);
            this.L.a(iBinder);
            this.N.a(iBinder);
            this.O.a(iBinder);
            this.P.a(iBinder);
            this.Q.a(iBinder);
            this.R.a(iBinder);
            this.S.a(iBinder);
            this.M.a(iBinder);
            i = 0;
        }
        super.p(i, iBinder, bundle, i2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return !this.T.b();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }
}
