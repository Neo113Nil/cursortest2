package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.ddb;
import defpackage.i5o;
import defpackage.xlo;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeod implements zzemq {
    public final Context a;
    public final zzdoe b;
    public final Executor c;
    public final zzflc d;
    public final zzeaj e;

    public zzeod(Context context, Executor executor, zzdoe zzdoeVar, zzflc zzflcVar, zzeaj zzeajVar) {
        this.a = context;
        this.b = zzdoeVar;
        this.c = executor;
        this.d = zzflcVar;
        this.e = zzeajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ddb a(zzflo zzfloVar, zzfld zzfldVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Te)).booleanValue()) {
            zzeai a = this.e.a();
            a.b("action", "cstm_tbs_rndr");
            a.c();
        }
        try {
            str = zzfldVar.v.getString("tab_url");
        } catch (Exception unused) {
            str = null;
        }
        return zzhcy.h(xlo.b, new i5o(this, str != null ? Uri.parse(str) : null, zzfloVar, zzfldVar, zzfloVar.b.b, 0), this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean b(zzflo zzfloVar, zzfld zzfldVar) {
        String str;
        Context context = this.a;
        if (!(context instanceof Activity) || !zzbkh.a(context)) {
            return false;
        }
        try {
            str = zzfldVar.v.getString("tab_url");
        } catch (Exception unused) {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }
}
