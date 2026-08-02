package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbkg;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zziom;
import com.google.android.gms.internal.ads.zzion;
import defpackage.da4;
import defpackage.ea4;
import defpackage.fa4;
import defpackage.ja4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzk implements zzbkg {
    public final /* synthetic */ zzbkh a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Uri d;

    public zzk(zzs zzsVar, zzbkh zzbkhVar, Bundle bundle, Context context, Uri uri) {
        this.a = zzbkhVar;
        this.b = bundle;
        this.c = context;
        this.d = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zza() {
        ja4 ja4Var;
        zzbkh zzbkhVar = this.a;
        fa4 fa4Var = zzbkhVar.b;
        if (fa4Var == null) {
            zzbkhVar.a = null;
            ja4Var = null;
        } else {
            ja4Var = zzbkhVar.a;
            if (ja4Var == null) {
                ja4Var = fa4Var.c(null);
                zzbkhVar.a = ja4Var;
            }
        }
        da4 da4Var = new da4(ja4Var);
        zzs.d(da4Var, this.b);
        ea4 a = da4Var.a();
        Intent intent = a.a;
        Context context = this.c;
        intent.setPackage(zziom.a(context));
        a.a(context, this.d);
        Activity activity = (Activity) context;
        zzion zzionVar = zzbkhVar.c;
        if (zzionVar == null) {
            return;
        }
        activity.unbindService(zzionVar);
        zzbkhVar.b = null;
        zzbkhVar.a = null;
        zzbkhVar.c = null;
    }
}
