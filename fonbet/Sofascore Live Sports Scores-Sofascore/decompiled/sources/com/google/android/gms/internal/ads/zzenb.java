package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.ddb;
import defpackage.gl5;
import defpackage.hlo;
import defpackage.qxn;
import defpackage.xlo;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzenb implements zzemq {
    public final zzcvr a;
    public final zzdxg b;
    public final zzflw c;
    public final Executor d;
    public final VersionInfoParcel e;
    public final zzbqk f;
    public final boolean g = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ua)).booleanValue();
    public final zzelp h;
    public final zzeae i;
    public final zzeaj j;

    public zzenb(zzcvr zzcvrVar, Executor executor, zzdxg zzdxgVar, zzflw zzflwVar, VersionInfoParcel versionInfoParcel, zzbqk zzbqkVar, zzelp zzelpVar, zzeae zzeaeVar, zzeaj zzeajVar) {
        this.a = zzcvrVar;
        this.d = executor;
        this.b = zzdxgVar;
        this.c = zzflwVar;
        this.e = versionInfoParcel;
        this.f = zzbqkVar;
        this.h = zzelpVar;
        this.i = zzeaeVar;
        this.j = zzeajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ddb a(zzflo zzfloVar, zzfld zzfldVar) {
        zzdxk zzdxkVar = new zzdxk();
        xlo xloVar = xlo.b;
        qxn qxnVar = new qxn(this, zzfldVar, zzfloVar, zzdxkVar, 3);
        Executor executor = this.d;
        hlo h = zzhcy.h(xloVar, qxnVar, executor);
        h.addListener(new gl5(11), executor);
        return h;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean b(zzflo zzfloVar, zzfld zzfldVar) {
        zzfli zzfliVar = zzfldVar.s;
        return (zzfliVar == null || zzfliVar.a == null) ? false : true;
    }
}
