package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzbs;
import defpackage.wjn;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhj implements ServiceConnection {
    public final String a;
    public final /* synthetic */ zzhk b;

    public zzhj(zzhk zzhkVar, String str) {
        Objects.requireNonNull(zzhkVar);
        this.b = zzhkVar;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzhk zzhkVar = this.b;
        if (iBinder == null) {
            zzgu zzguVar = zzhkVar.a.f;
            zzic.m(zzguVar);
            zzguVar.j.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = zzbr.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            zzbs zzbqVar = queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            zzic zzicVar = zzhkVar.a;
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.o.a("Install Referrer Service connected");
            zzhz zzhzVar = zzicVar.g;
            zzic.m(zzhzVar);
            zzhzVar.Z(new wjn(this, zzbqVar, this));
        } catch (RuntimeException e) {
            zzgu zzguVar3 = zzhkVar.a.f;
            zzic.m(zzguVar3);
            zzguVar3.j.b(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzgu zzguVar = this.b.a.f;
        zzic.m(zzguVar);
        zzguVar.o.a("Install Referrer Service disconnected");
    }
}
