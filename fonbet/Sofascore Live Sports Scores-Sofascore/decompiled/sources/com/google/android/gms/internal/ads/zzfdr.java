package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.U3;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfdr implements zzfdg {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final ArrayList j;
    public final String k;
    public final String l;
    public final boolean m;
    public final long n;
    public final boolean o;
    public final String p;
    public final int q;
    public final String r;

    public zzfdr(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, String str3, String str4, boolean z6, long j, boolean z7, String str5, int i, String str6, String str7, String str8) {
        String str9 = Build.FINGERPRINT;
        String str10 = Build.MODEL;
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = str2;
        this.h = str6;
        this.j = arrayList;
        this.k = str3;
        this.l = str4;
        this.m = z6;
        this.n = j;
        this.o = z7;
        this.p = str5;
        this.q = i;
        this.r = str8;
        this.i = str7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x006e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.nf)).booleanValue() != false) goto L9;
     */
    @Override // com.google.android.gms.internal.ads.zzfdg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.a);
        bundle.putBoolean("coh", this.b);
        bundle.putString("gl", this.c);
        bundle.putBoolean("simulator", this.d);
        bundle.putBoolean("is_latchsky", this.e);
        bundle.putInt("build_api_level", this.q);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Hc)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f);
        }
        bundle.putString("hl", this.g);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.mf)).booleanValue()) {
        }
        bundle.putString("dlc", this.h);
        ArrayList<String> arrayList = this.j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.i;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.k);
        bundle.putString("submodel", Build.MODEL);
        Bundle a = zzfml.a(bundle, U3.i.G);
        bundle.putBundle(U3.i.G, a);
        a.putString("build", Build.FINGERPRINT);
        a.putLong("remaining_data_partition_space", this.n);
        Bundle a2 = zzfml.a(a, "browser");
        a.putBundle("browser", a2);
        a2.putBoolean("is_browser_custom_tabs_capable", this.m);
        String str3 = this.l;
        if (!TextUtils.isEmpty(str3)) {
            Bundle a3 = zzfml.a(a, "play_store");
            a.putBundle("play_store", a3);
            a3.putString("package_version", str3);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Xc)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.o);
        }
        String str4 = this.p;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Rc)).booleanValue()) {
            zzfml.d(bundle, "gotmt_l", true, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Oc)).booleanValue());
            zzfml.d(bundle, "gotmt_i", true, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Nc)).booleanValue());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.cg)).booleanValue() || (str = this.r) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }
}
