package com.google.android.gms.ads.internal.overlay;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzgsv;
import com.google.android.gms.internal.ads.zzgsw;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzx implements zzgsw {
    public final /* synthetic */ zzz a;

    public zzx(zzz zzzVar) {
        this.a = zzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsw
    public final void zza(zzgsv zzgsvVar) {
        boolean isEmpty = TextUtils.isEmpty(zzgsvVar.b());
        zzz zzzVar = this.a;
        if (!isEmpty) {
            if (!((Boolean) zzba.zzc().a(zzbjg.hd)).booleanValue()) {
                zzzVar.a = zzgsvVar.b();
            }
        }
        switch (zzgsvVar.a()) {
            case 8152:
                zzzVar.b("onLMDOverlayOpened", new HashMap());
                break;
            case 8153:
                zzzVar.b("onLMDOverlayClicked", new HashMap());
                break;
            case 8155:
                zzzVar.b("onLMDOverlayClose", new HashMap());
                break;
            case 8157:
                zzzVar.a = null;
                zzzVar.b = null;
                zzzVar.e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzgsvVar.a()));
                zzzVar.b("onLMDOverlayFailedToOpen", hashMap);
                break;
        }
    }
}
