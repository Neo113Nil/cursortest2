package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.ddb;
import defpackage.f1o;
import defpackage.ilo;
import defpackage.ohn;
import defpackage.qxn;
import defpackage.vlo;
import defpackage.xlo;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdvv {
    public final com.google.android.gms.ads.internal.zza b;
    public final Context c;
    public final zzeaj d;
    public final Executor e;
    public final zzbbd f;
    public final VersionInfoParcel g;
    public final zzele i;
    public final zzfte j;
    public final zzelp k;
    public final zzfma l;
    public final zzdcg m;
    public ilo n;
    public final zzdvj a = new zzdvj();
    public final zzbqz h = new zzbqz();

    public zzdvv(zzdvt zzdvtVar) {
        this.c = zzdvtVar.b;
        this.e = zzdvtVar.e;
        this.f = zzdvtVar.f;
        this.g = zzdvtVar.g;
        this.b = zzdvtVar.a;
        this.i = zzdvtVar.d;
        this.j = zzdvtVar.h;
        this.d = zzdvtVar.c;
        this.k = zzdvtVar.i;
        this.l = zzdvtVar.j;
        this.m = zzdvtVar.k;
    }

    public final synchronized ddb a(String str, JSONObject jSONObject) {
        ilo iloVar = this.n;
        if (iloVar == null) {
            return xlo.b;
        }
        return zzhcy.h(iloVar, new qxn(2, this, str, jSONObject), this.e);
    }

    public final synchronized void b(String str, zzbqh zzbqhVar) {
        ilo iloVar = this.n;
        if (iloVar == null) {
            return;
        }
        f1o f1oVar = new f1o(this, str, zzbqhVar, 0);
        iloVar.addListener(new vlo(0, iloVar, f1oVar), this.e);
    }

    public final synchronized void c(String str, zzbqh zzbqhVar) {
        ilo iloVar = this.n;
        if (iloVar == null) {
            return;
        }
        f1o f1oVar = new f1o(this, str, zzbqhVar, 1);
        iloVar.addListener(new vlo(0, iloVar, f1oVar), this.e);
    }

    public final synchronized void d(Map map) {
        ilo iloVar = this.n;
        if (iloVar == null) {
            return;
        }
        ohn ohnVar = new ohn(this, map);
        iloVar.addListener(new vlo(0, iloVar, ohnVar), this.e);
    }
}
