package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzewm implements zzfdg {
    public final com.google.android.gms.ads.internal.client.zzx a;
    public final boolean b;

    public zzewm(com.google.android.gms.ads.internal.client.zzx zzxVar, boolean z) {
        this.a = zzxVar;
        this.b = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.A6)).booleanValue()) {
            bundle.putBoolean("app_switched", this.b);
        }
        com.google.android.gms.ads.internal.client.zzx zzxVar = this.a;
        if (zzxVar != null) {
            int i = zzxVar.zza;
            if (i == 1) {
                bundle.putString("avo", TtmlNode.TAG_P);
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
