package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfve {
    public final Context a;
    public final VersionInfoParcel b;
    public final ScheduledExecutorService c;
    public final zzfpm d;
    public final ClientApi e = new ClientApi();
    public final zzfms f;
    public final Clock g;
    public final zzftp h;
    public final zzfuf i;

    public zzfve(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, zzfpm zzfpmVar, zzfms zzfmsVar, Clock clock, zzftp zzftpVar, zzfuf zzfufVar) {
        this.a = context;
        this.b = versionInfoParcel;
        this.c = scheduledExecutorService;
        this.d = zzfpmVar;
        this.g = clock;
        this.f = zzfmsVar;
        this.h = zzftpVar;
        this.i = zzfufVar;
    }

    public final zzfvd a(zzfp zzfpVar, zzcb zzcbVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int ordinal = adFormat.ordinal();
        zzfms zzfmsVar = this.f;
        Context context = this.a;
        ClientApi clientApi = this.e;
        VersionInfoParcel versionInfoParcel = this.b;
        if (ordinal == 1) {
            return new zzfuc(clientApi, context, versionInfoParcel.clientJarVersion, zzfmsVar, zzfpVar, zzcbVar, this.c, this.d, b(), this.g);
        }
        if (ordinal == 2) {
            return new zzfvi(clientApi, context, versionInfoParcel.clientJarVersion, zzfmsVar, zzfpVar, zzcbVar, this.c, this.d, b(), this.g);
        }
        if (ordinal != 5) {
            return null;
        }
        return new zzftx(clientApi, context, versionInfoParcel.clientJarVersion, zzfmsVar, zzfpVar, zzcbVar, this.c, this.d, b(), this.g);
    }

    public final zzfty b() {
        return new zzfty(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.J)).longValue(), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.K)).longValue(), this.g, this.i);
    }
}
