package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zziof;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class CsiParamDefaults_Factory implements zzinw<CsiParamDefaults> {
    public final zziof a;
    public final zziof b;
    public final zziof c;
    public final zziof d;
    public final zziof e;

    public CsiParamDefaults_Factory(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5) {
        this.a = zziofVar;
        this.b = zziofVar2;
        this.c = zziofVar3;
        this.d = zziofVar4;
        this.e = zziofVar5;
    }

    public static CsiParamDefaults_Factory create(zziof<Context> zziofVar, zziof<VersionInfoParcel> zziofVar2, zziof<PackageInfo> zziofVar3, zziof<String> zziofVar4, zziof<DeviceTierManager> zziofVar5) {
        return new CsiParamDefaults_Factory(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5);
    }

    @NonNull
    public static CsiParamDefaults newInstance(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel, @Nullable PackageInfo packageInfo, @Nullable String str, @NonNull DeviceTierManager deviceTierManager) {
        return new CsiParamDefaults(context, versionInfoParcel, packageInfo, str, deviceTierManager);
    }

    @Override // com.google.android.gms.internal.ads.zziol
    @NonNull
    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.a.zzb(), (VersionInfoParcel) this.b.zzb(), (PackageInfo) this.c.zzb(), (String) this.d.zzb(), (DeviceTierManager) this.e.zzb());
    }
}
