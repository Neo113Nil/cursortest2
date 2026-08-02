package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbrd implements zzbqh {
    public final zzedp a;

    public zzbrd(zzedp zzedpVar) {
        this.a = zzedpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
            return;
        }
        long j = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        zzedp zzedpVar = this.a;
        String str = (String) map.get(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        synchronized (zzedpVar) {
            zzedpVar.o = str;
            zzedpVar.q = j;
            zzedpVar.m();
        }
    }
}
