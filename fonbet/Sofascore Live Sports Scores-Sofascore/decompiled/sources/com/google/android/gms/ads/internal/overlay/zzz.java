package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzgst;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.internal.ads.zzgtl;
import defpackage.ago;
import defpackage.b1l;
import defpackage.fgo;
import defpackage.ggo;
import defpackage.jgo;
import defpackage.lgo;
import defpackage.u53;
import defpackage.wjn;
import defpackage.zfo;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzz {
    public zzgsw f;
    public zzclm c = null;
    public boolean e = false;
    public String a = null;
    public b1l d = null;
    public String b = null;

    public final void a(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(PglCryptUtils.KEY_MESSAGE, str);
            hashMap.put("action", str2);
            b("onError", hashMap);
        }
    }

    public final void b(final String str, final HashMap hashMap) {
        zzcgj.f.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzclm zzclmVar = zzz.this.c;
                if (zzclmVar != null) {
                    zzclmVar.n(str, hashMap);
                }
            }
        });
    }

    public final ggo c() {
        fgo fgoVar = new fgo();
        if (!((Boolean) zzba.zzc().a(zzbjg.hd)).booleanValue() || TextUtils.isEmpty(this.b)) {
            String str = this.a;
            if (str != null) {
                fgoVar.a = str;
            } else {
                a("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            fgoVar.b = this.b;
        }
        return new ggo(fgoVar.a, fgoVar.b);
    }

    public final synchronized void zza(@Nullable zzclm zzclmVar, Context context) {
        this.c = zzclmVar;
        if (!zzb(context)) {
            a("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        b("on_play_store_bind", hashMap);
    }

    public final synchronized boolean zzb(Context context) {
        if (!zzgtl.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.d = new b1l(new lgo(context), 25);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzh().d("LastMileDeliveryOverlay.bindLastMileDeliveryService", e);
        }
        if (this.d == null) {
            this.e = false;
            return false;
        }
        if (this.f == null) {
            this.f = new zzx(this);
        }
        this.e = true;
        return true;
    }

    public final void zzc(@Nullable zzclm zzclmVar, @Nullable zzgst zzgstVar) {
        if (zzclmVar == null) {
            a("adWebview missing", "onLMDShow");
            return;
        }
        this.c = zzclmVar;
        if (!this.e && !zzb(zzclmVar.getContext())) {
            a("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().a(zzbjg.hd)).booleanValue()) {
            this.b = zzgstVar.b();
        }
        zzgsw zzgswVar = this.f;
        if (zzgswVar == null) {
            zzgswVar = new zzx(this);
            this.f = zzgswVar;
        }
        b1l b1lVar = this.d;
        if (b1lVar != null) {
            lgo lgoVar = (lgo) b1lVar.b;
            u53 u53Var = lgoVar.a;
            if (u53Var == null) {
                lgo.c.c("error: %s", "Play Store not found.");
            } else if (lgo.c(zzgswVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzgstVar.b()))) {
                u53Var.g(new wjn(24, u53Var, new jgo(1, lgoVar, zzgstVar, zzgswVar)));
            }
        }
    }

    public final void zzd() {
        b1l b1lVar;
        if (!this.e || (b1lVar = this.d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            ((lgo) b1lVar.b).a(c(), this.f, 1);
            b("onLMDOverlayExpand", new HashMap());
        }
    }

    public final void zze() {
        b1l b1lVar;
        if (!this.e || (b1lVar = this.d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            ((lgo) b1lVar.b).a(c(), this.f, 2);
            b("onLMDOverlayCollapse", new HashMap());
        }
    }

    public final void zzf() {
        b1l b1lVar;
        if (!this.e || (b1lVar = this.d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zfo zfoVar = new zfo();
        if (!((Boolean) zzba.zzc().a(zzbjg.hd)).booleanValue() || TextUtils.isEmpty(this.b)) {
            String str = this.a;
            if (str != null) {
                zfoVar.a = str;
            } else {
                a("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zfoVar.b = this.b;
        }
        ago agoVar = new ago(zfoVar.a, zfoVar.b);
        zzgsw zzgswVar = this.f;
        lgo lgoVar = (lgo) b1lVar.b;
        u53 u53Var = lgoVar.a;
        if (u53Var == null) {
            lgo.c.c("error: %s", "Play Store not found.");
        } else if (lgo.c(zzgswVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(agoVar.a, agoVar.b))) {
            u53Var.g(new wjn(24, u53Var, new jgo(0, lgoVar, agoVar, zzgswVar)));
        }
    }
}
