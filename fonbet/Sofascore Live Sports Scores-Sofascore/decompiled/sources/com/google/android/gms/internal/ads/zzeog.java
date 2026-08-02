package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.bgf;
import defpackage.lv4;
import defpackage.u5o;
import defpackage.utn;
import defpackage.yih;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeog extends zzccr implements zzdez {
    public u5o a;
    public yih b;
    public utn c;

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void C3(IObjectWrapper iObjectWrapper) {
        u5o u5oVar = this.a;
        if (u5oVar != null) {
            u5oVar.d.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void P2(IObjectWrapper iObjectWrapper, int i) {
        yih yihVar = this.b;
        if (yihVar != null) {
            yihVar.u(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void R2() {
        u5o u5oVar = this.a;
        if (u5oVar != null) {
            u5oVar.c.q0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void T0(IObjectWrapper iObjectWrapper) {
        u5o u5oVar = this.a;
        if (u5oVar != null) {
            u5oVar.d.I(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdez
    public final synchronized void Z1(yih yihVar) {
        this.b = yihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void a0(IObjectWrapper iObjectWrapper) {
        u5o u5oVar = this.a;
        if (u5oVar != null) {
            u5oVar.c.p0(bgf.e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void a3(IObjectWrapper iObjectWrapper) {
        yih yihVar = this.b;
        if (yihVar != null) {
            yihVar.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void k1() {
        utn utnVar = this.c;
        if (utnVar != null) {
            String str = ((zzemt) utnVar.d).a;
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void s(IObjectWrapper iObjectWrapper) {
        utn utnVar = this.c;
        if (utnVar != null) {
            zzemt zzemtVar = (zzemt) utnVar.d;
            ((zzerj) utnVar.e).b.execute(new lv4((zzflo) utnVar.c, (zzfld) utnVar.b, zzemtVar, false, 27));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void t(IObjectWrapper iObjectWrapper) {
        u5o u5oVar = this.a;
        if (u5oVar != null) {
            u5oVar.a.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void w2(IObjectWrapper iObjectWrapper, zzcct zzcctVar) {
        u5o u5oVar = this.a;
        if (u5oVar != null) {
            u5oVar.d.I(zzcctVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void x4(IObjectWrapper iObjectWrapper) {
        u5o u5oVar = this.a;
        if (u5oVar != null) {
            u5oVar.b.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        u5o u5oVar = this.a;
        if (u5oVar != null) {
            u5oVar.zzj(iObjectWrapper);
        }
    }
}
