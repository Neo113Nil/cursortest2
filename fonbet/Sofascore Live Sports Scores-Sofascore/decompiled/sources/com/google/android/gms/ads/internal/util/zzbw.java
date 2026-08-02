package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzbw implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final String a;
    public final /* synthetic */ zzbz b;

    public zzbw(zzbz zzbzVar, String str) {
        Objects.requireNonNull(zzbzVar);
        this.b = zzbzVar;
        this.a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzbz zzbzVar = this.b;
        synchronized (zzbzVar) {
            try {
                Iterator it = zzbzVar.b.iterator();
                while (it.hasNext()) {
                    ((zzbx) it.next()).zza(sharedPreferences, this.a, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
