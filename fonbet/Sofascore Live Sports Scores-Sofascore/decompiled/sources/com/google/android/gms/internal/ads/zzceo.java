package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzceo implements zzbfg {
    public final Context a;
    public final Object b;
    public final String c;
    public boolean d;

    public zzceo(Context context, String str) {
        this.a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.c = str;
        this.d = false;
        this.b = new Object();
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void A(zzbff zzbffVar) {
        c(zzbffVar.j);
    }

    public final void c(boolean z) {
        zzcer zzD = com.google.android.gms.ads.internal.zzt.zzD();
        Context context = this.a;
        if (zzD.a(context)) {
            synchronized (this.b) {
                try {
                    if (this.d == z) {
                        return;
                    }
                    this.d = z;
                    String str = this.c;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.d) {
                        zzcer zzD2 = com.google.android.gms.ads.internal.zzt.zzD();
                        if (zzD2.a(context)) {
                            zzD2.j(context, str, "beginAdUnitExposure");
                        }
                    } else {
                        zzcer zzD3 = com.google.android.gms.ads.internal.zzt.zzD();
                        if (zzD3.a(context)) {
                            zzD3.j(context, str, "endAdUnitExposure");
                        }
                    }
                } finally {
                }
            }
        }
    }
}
