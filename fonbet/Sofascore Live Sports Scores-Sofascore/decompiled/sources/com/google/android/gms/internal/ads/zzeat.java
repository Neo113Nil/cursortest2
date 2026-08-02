package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder_Factory;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeat implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;
    public final zzcok d;

    public zzeat(zziof zziofVar, CsiParamDefaults_Factory csiParamDefaults_Factory, CsiUrlBuilder_Factory csiUrlBuilder_Factory, zzcok zzcokVar) {
        this.a = zziofVar;
        this.b = csiParamDefaults_Factory;
        this.c = csiUrlBuilder_Factory;
        this.d = zzcokVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        zzu zzuVar = (zzu) this.a.zzb();
        CsiParamDefaults zzb = ((CsiParamDefaults_Factory) this.b).zzb();
        zzeao zzeaoVar = new zzeao(hsnVar, zzuVar, ((CsiUrlBuilder_Factory) this.c).zzb(), this.d.a());
        zzb.set(zzeaoVar.a);
        return zzeaoVar;
    }
}
