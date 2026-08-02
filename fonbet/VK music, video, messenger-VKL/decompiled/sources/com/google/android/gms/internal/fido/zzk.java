package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.c;
import xsna.lsz0;
import xsna.olc;
import xsna.q9k;
import xsna.u2u;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public final class zzk extends u2u {
    public zzk(Context context, Looper looper, olc olcVar, c.b bVar, c.InterfaceC0114c interfaceC0114c) {
        super(context, looper, 149, olcVar, bVar, interfaceC0114c);
    }

    @Override // xsna.rd6
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
        return queryLocalInterface instanceof zzn ? (zzn) queryLocalInterface : new zzn(iBinder);
    }

    @Override // xsna.rd6
    public final Feature[] getApiFeatures() {
        return new Feature[]{lsz0.b, lsz0.c, lsz0.d};
    }

    @Override // xsna.rd6
    public final Bundle getGetServiceRequestExtraArgs() {
        return q9k.a("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.privileged.START");
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // xsna.rd6
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService";
    }

    @Override // xsna.rd6
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.privileged.START";
    }

    @Override // xsna.rd6
    public final boolean usesClientTelemetry() {
        return true;
    }
}
