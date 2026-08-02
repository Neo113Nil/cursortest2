package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.ddb;
import defpackage.gl5;
import defpackage.hlo;
import defpackage.qxn;
import defpackage.xlo;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzerd implements zzemq {
    public final Context a;
    public final zzdxg b;
    public final zzdwp c;
    public final zzflw d;
    public final Executor e;
    public final VersionInfoParcel f;
    public final zzbqk g;
    public final boolean h = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ua)).booleanValue();
    public final zzelp i;
    public final zzeae j;
    public final zzeaj k;

    public zzerd(Context context, VersionInfoParcel versionInfoParcel, zzflw zzflwVar, Executor executor, zzdwp zzdwpVar, zzdxg zzdxgVar, zzbqk zzbqkVar, zzelp zzelpVar, zzeae zzeaeVar, zzeaj zzeajVar) {
        this.a = context;
        this.d = zzflwVar;
        this.c = zzdwpVar;
        this.e = executor;
        this.f = versionInfoParcel;
        this.b = zzdxgVar;
        this.g = zzbqkVar;
        this.i = zzelpVar;
        this.j = zzeaeVar;
        this.k = zzeajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ddb a(zzflo zzfloVar, zzfld zzfldVar) {
        zzdxk zzdxkVar = new zzdxk();
        xlo xloVar = xlo.b;
        qxn qxnVar = new qxn(this, zzfldVar, zzfloVar, zzdxkVar, 9);
        Executor executor = this.e;
        hlo h = zzhcy.h(xloVar, qxnVar, executor);
        h.addListener(new gl5(13), executor);
        return h;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean b(zzflo zzfloVar, zzfld zzfldVar) {
        zzfli zzfliVar = zzfldVar.s;
        return (zzfliVar == null || zzfliVar.a == null) ? false : true;
    }
}
