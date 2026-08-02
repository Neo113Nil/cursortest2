package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzfxw extends AsyncTask {
    public zzfxx a;
    public final zzfxo b;

    public zzfxw(zzfxo zzfxoVar) {
        this.b = zzfxoVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfxx zzfxxVar = this.a;
        if (zzfxxVar != null) {
            zzfxxVar.c = null;
            zzfxw zzfxwVar = (zzfxw) zzfxxVar.b.poll();
            zzfxxVar.c = zzfxwVar;
            if (zzfxwVar != null) {
                zzfxwVar.executeOnExecutor(zzfxxVar.a, new Object[0]);
            }
        }
    }
}
