package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.internal.GmsClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public final class zzew extends GmsClient implements IBinder.DeathRecipient {
    public static final Logger I = new Logger("CastRemoteDisplayClientImpl", null);

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        return queryLocalInterface instanceof zzez ? (zzez) queryLocalInterface : new zzez(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        I.a("disconnect", new Object[0]);
        try {
            zzez zzezVar = (zzez) getService();
            getContext();
            ApiMetadata a = zzff.a();
            Parcel J = zzezVar.J();
            zzc.b(J, a);
            zzezVar.l2(J, 3);
        } catch (RemoteException | IllegalStateException unused) {
        } catch (Throwable th) {
            super.disconnect();
            throw th;
        }
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String g() {
        return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String h() {
        return "com.google.android.gms.cast.remote_display.service.START";
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
    }
}
