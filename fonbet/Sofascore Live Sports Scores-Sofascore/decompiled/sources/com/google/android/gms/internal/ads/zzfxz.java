package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfxz extends zzfxv {
    @Override // com.google.android.gms.internal.ads.zzfxw
    /* renamed from: a */
    public final void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }

    public final void b(String str) {
        zzfwk zzfwkVar = zzfwk.c;
        if (zzfwkVar != null) {
            for (zzfvq zzfvqVar : Collections.unmodifiableCollection(zzfwkVar.a)) {
                if (this.c.contains(zzfvqVar.g)) {
                    zzfxa zzfxaVar = zzfvqVar.d;
                    if (this.e >= zzfxaVar.c && zzfxaVar.d != 3) {
                        zzfxaVar.d = 3;
                        zzfwr.a.a(zzfxaVar.c(), "setNativeViewHierarchy", str, zzfxaVar.a);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.d.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfxw, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        b(str);
        super.onPostExecute(str);
    }
}
