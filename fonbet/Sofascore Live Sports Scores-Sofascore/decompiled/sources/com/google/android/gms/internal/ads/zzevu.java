package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.jfb;
import defpackage.u4a;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzevu implements zzfdg {
    public final com.google.android.gms.ads.internal.client.zzr a;
    public final String b;
    public final boolean c;
    public final String d;
    public final float e;
    public final int f;
    public final int g;
    public final String h;
    public final int i;
    public final boolean j;
    public final u4a k;
    public final jfb l;

    public zzevu(com.google.android.gms.ads.internal.client.zzr zzrVar, String str, boolean z, String str2, float f, int i, int i2, String str3, int i3, boolean z2, u4a u4aVar, jfb jfbVar) {
        Preconditions.j(zzrVar, "the adSize must not be null");
        this.a = zzrVar;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = str3;
        this.i = i3;
        this.j = z2;
        this.k = u4aVar;
        this.l = jfbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.a;
        int i = zzrVar.zze;
        zzfml.b(bundle, "smart_w", "full", i == -1);
        int i2 = zzrVar.zzb;
        zzfml.b(bundle, "smart_h", "auto", i2 == -2);
        zzfml.d(bundle, "ene", true, zzrVar.zzj);
        zzfml.b(bundle, "rafmt", "102", zzrVar.zzm);
        zzfml.b(bundle, "rafmt", "108", zzrVar.zzp);
        zzfml.b(bundle, "rafmt", "103", zzrVar.zzn);
        zzfml.b(bundle, "rafmt", "105", zzrVar.zzo);
        zzfml.d(bundle, "inline_adaptive_slot", true, this.j);
        zzfml.d(bundle, "interscroller_slot", true, zzrVar.zzo);
        zzfml.e("format", bundle, this.b);
        zzfml.b(bundle, "fluid", "height", this.c);
        zzfml.b(bundle, "sz", this.d, !TextUtils.isEmpty(r6));
        bundle.putFloat("u_sd", this.e);
        bundle.putInt("sw", this.f);
        bundle.putInt(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, this.g);
        String str = this.h;
        zzfml.b(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        int i3 = this.i;
        if (i3 != -1) {
            bundle.putInt("u_mso", i3);
        }
        u4a u4aVar = this.k;
        if (u4aVar != null) {
            bundle.putInt("sam_t", u4aVar.b);
            bundle.putInt("sam_b", u4aVar.d);
            bundle.putInt("sam_l", u4aVar.a);
            bundle.putInt("sam_r", u4aVar.c);
        }
        jfb jfbVar = this.l;
        if (jfbVar != null) {
            bundle.putInt("rc_tl", jfbVar.a);
            bundle.putInt("rc_tr", jfbVar.b);
            bundle.putInt("rc_bl", jfbVar.c);
            bundle.putInt("rc_br", jfbVar.d);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i2);
            bundle2.putInt("width", i);
            bundle2.putBoolean("is_fluid_height", zzrVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar2.zzi);
                bundle3.putInt("height", zzrVar2.zzb);
                bundle3.putInt("width", zzrVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
