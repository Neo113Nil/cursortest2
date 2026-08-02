package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.bnn;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcvi implements zzbfg {
    public zzclm a;
    public final Executor b;
    public final zzcuu c;
    public final Clock d;
    public boolean e = false;
    public boolean f = false;
    public final zzcux g = new zzcux();

    public zzcvi(Executor executor, zzcuu zzcuuVar, Clock clock) {
        this.b = executor;
        this.c = zzcuuVar;
        this.d = clock;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void A(zzbff zzbffVar) {
        boolean z = this.f ? false : zzbffVar.j;
        zzcux zzcuxVar = this.g;
        zzcuxVar.a = z;
        zzcuxVar.c = this.d.elapsedRealtime();
        zzcuxVar.e = zzbffVar;
        if (this.e) {
            c();
        }
    }

    public final void c() {
        try {
            JSONObject zzb = this.c.zzb(this.g);
            if (this.a != null) {
                this.b.execute(new bnn(9, this, zzb));
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
        }
    }
}
