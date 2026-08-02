package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgqt implements zzgqe {
    public final ArrayList a = new ArrayList();

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final synchronized void a(HashMap hashMap, Context context, View view) {
        ArrayList arrayList = this.a;
        hashMap.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, new ArrayList(arrayList));
        arrayList.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void b(HashMap hashMap) {
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void c(HashMap hashMap) {
    }
}
