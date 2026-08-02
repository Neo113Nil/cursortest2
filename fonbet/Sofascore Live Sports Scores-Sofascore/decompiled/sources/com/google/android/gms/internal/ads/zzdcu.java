package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.ddb;
import defpackage.rlo;
import defpackage.t3n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdcu {
    public final zzfqi a;
    public final VersionInfoParcel b;
    public final ApplicationInfo c;
    public final String d;
    public final ArrayList e;
    public final PackageInfo f;
    public final zzinq g;
    public final String h;
    public final zzfdl i;
    public final com.google.android.gms.ads.internal.util.zzg j;
    public final zzflw k;
    public final zzdji l;

    public zzdcu(zzfqi zzfqiVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, zzinq zzinqVar, com.google.android.gms.ads.internal.util.zzj zzjVar, String str2, zzfdl zzfdlVar, zzflw zzflwVar, zzdji zzdjiVar) {
        this.a = zzfqiVar;
        this.b = versionInfoParcel;
        this.c = applicationInfo;
        this.d = str;
        this.e = arrayList;
        this.f = packageInfo;
        this.g = zzinqVar;
        this.h = str2;
        this.i = zzfdlVar;
        this.j = zzjVar;
        this.k = zzflwVar;
        this.l = zzdjiVar;
    }

    public final zzfpp a(Bundle bundle) {
        this.l.zza();
        zzfqi zzfqiVar = this.a;
        Objects.requireNonNull(zzfqiVar);
        rlo a = this.i.a(bundle, new Bundle());
        return new zzfpz(zzfqiVar, zzfqc.SIGNALS, null, zzfqa.d, Collections.EMPTY_LIST, a).d();
    }

    public final zzfpp b() {
        Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S2)).booleanValue()) {
            Bundle bundle2 = this.k.t;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        zzfpp a = a(bundle);
        ddb[] ddbVarArr = {a, (ddb) this.g.zzb()};
        zzfqi zzfqiVar = this.a;
        zzfqiVar.getClass();
        return new zzfpr(zzfqiVar, zzfqc.REQUEST_PARCEL, Arrays.asList(ddbVarArr)).a(new t3n(4, this, a, bundle)).d();
    }
}
