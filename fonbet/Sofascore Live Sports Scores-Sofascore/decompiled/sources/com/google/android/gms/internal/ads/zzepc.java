package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzcms;
import com.google.android.gms.internal.ads.zzcub;
import com.google.android.gms.internal.ads.zzcvi;
import com.google.android.gms.internal.ads.zzczb;
import com.google.android.gms.internal.ads.zzddn;
import com.google.android.gms.internal.ads.zzdew;
import com.google.android.gms.internal.ads.zzdfj;
import com.google.android.gms.internal.ads.zzdga;
import com.google.android.gms.internal.ads.zzdit;
import com.google.android.gms.internal.ads.zzdlq;
import com.google.android.gms.internal.ads.zzdlu;
import com.google.android.gms.internal.ads.zzdlw;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzdqm;
import com.google.android.gms.internal.ads.zzdqr;
import com.google.android.gms.internal.ads.zzdrb;
import com.google.android.gms.internal.ads.zzdrc;
import com.google.android.gms.internal.ads.zzdtl;
import com.google.android.gms.internal.ads.zzdua;
import com.google.android.gms.internal.ads.zzduc;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzdvi;
import com.google.android.gms.internal.ads.zzdvj;
import com.google.android.gms.internal.ads.zzdvq;
import com.google.android.gms.internal.ads.zzdvv;
import com.google.android.gms.internal.ads.zzdvy;
import com.google.android.gms.internal.ads.zzdwa;
import com.google.android.gms.internal.ads.zzdwb;
import com.google.android.gms.internal.ads.zzeae;
import com.google.android.gms.internal.ads.zzele;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzinv;
import com.google.android.gms.internal.ads.zzioe;
import com.ironsource.U3;
import com.ironsource.V3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.ahn;
import defpackage.b1l;
import defpackage.ddb;
import defpackage.ewn;
import defpackage.hlo;
import defpackage.hsn;
import defpackage.non;
import defpackage.olo;
import defpackage.qxn;
import defpackage.r0o;
import defpackage.rlo;
import defpackage.spn;
import defpackage.t0o;
import defpackage.tpn;
import defpackage.u0o;
import defpackage.vlo;
import defpackage.x5n;
import defpackage.xlo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzepc implements zzeow {
    public final zzdpa a;
    public final zzhdi b;
    public final zzdtl c;
    public final zzfmv d;
    public final zzdwb e;
    public final zzeae f;
    public final VersionInfoParcel g;
    public final Context h;

    public zzepc(zzdpa zzdpaVar, zzhdi zzhdiVar, zzdtl zzdtlVar, zzfmv zzfmvVar, zzdwb zzdwbVar, zzeae zzeaeVar, VersionInfoParcel versionInfoParcel, Context context, zzceb zzcebVar) {
        this.g = versionInfoParcel;
        this.h = context;
        this.a = zzdpaVar;
        this.b = zzhdiVar;
        this.c = zzdtlVar;
        this.d = zzfmvVar;
        this.e = zzdwbVar;
        this.f = zzeaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ddb a(zzflo zzfloVar, zzfld zzfldVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.U2)).booleanValue()) {
            x5n.q("rendering-native-ads-native-js-webview-start", this.f);
        }
        ddb b = this.d.b();
        spn spnVar = new spn(11, this, zzfldVar);
        zzhdi zzhdiVar = this.b;
        return zzhcy.h(zzhcy.h(b, spnVar, zzhdiVar), new qxn(8, this, zzfloVar, zzfldVar), zzhdiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean b(zzflo zzfloVar, zzfld zzfldVar) {
        zzfli zzfliVar = zzfldVar.s;
        return (zzfliVar == null || zzfliVar.c == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x045c  */
    /* JADX WARN: Type inference failed for: r0v1, types: [hlo] */
    /* JADX WARN: Type inference failed for: r0v34, types: [tlo] */
    /* JADX WARN: Type inference failed for: r3v22, types: [ddb, hlo] */
    /* JADX WARN: Type inference failed for: r3v35, types: [tlo] */
    /* JADX WARN: Type inference failed for: r4v64, types: [com.google.android.gms.internal.ads.zzcgo, ddb] */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.google.android.gms.internal.ads.zzdtl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rlo c(final zzflo zzfloVar, final zzfld zzfldVar, final JSONObject jSONObject) {
        com.google.android.gms.ads.internal.zzb zzbVar;
        zzcea zzceaVar;
        zzdtl zzdtlVar;
        zzeae zzeaeVar;
        String str;
        com.google.android.gms.ads.internal.zzb zzbVar2;
        zzcea zzceaVar2;
        zzdua zzduaVar;
        String str2;
        ddb ddbVar;
        ddb ddbVar2;
        hsn hsnVar;
        zzflg zzflgVar;
        final xlo xloVar;
        int i;
        String str3;
        hsn hsnVar2;
        com.google.android.gms.ads.internal.client.zzr zzrVar;
        JSONObject optJSONObject;
        zzflg zzflgVar2;
        String str4;
        com.google.android.gms.ads.internal.zzb zzbVar3;
        xlo e;
        JSONObject zzi;
        String str5;
        zzhdi zzhdiVar;
        String str6;
        xlo xloVar2;
        zzdua zzduaVar2;
        com.google.android.gms.ads.internal.zzb zzbVar4;
        zzcea zzceaVar3;
        xlo xloVar3;
        ddb ddbVar3;
        zzeae zzeaeVar2;
        xlo xloVar4;
        JSONArray optJSONArray;
        xlo xloVar5;
        xlo xloVar6;
        ddb ddbVar4;
        ddb i2;
        int i3;
        JSONArray jSONArray;
        ddb ddbVar5;
        zzduf zzdufVar;
        String str7;
        Future future;
        Future a;
        ddb h;
        JSONArray optJSONArray2;
        boolean z;
        zzdua zzduaVar3;
        com.google.android.gms.ads.internal.zzb zzbVar5;
        hlo h2;
        zzcea zzceaVar4;
        xlo xloVar7 = xlo.b;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.V2)).booleanValue()) {
            x5n.q("rendering-webview-creation-start", this.f);
        }
        ddb b = this.d.b();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.yf)).booleanValue();
        Context context = this.h;
        if (booleanValue) {
            zzcec zzcecVar = zzfldVar.A;
            if (zzcecVar != null) {
                zzfli zzfliVar = zzfldVar.s;
                zzceaVar4 = new zzcea(context, this.g, zzcecVar, zzfliVar == null ? null : zzfliVar.b);
            } else {
                zzceaVar4 = null;
            }
            zzbVar = new com.google.android.gms.ads.internal.zzb(context, zzceaVar4, null);
            zzceaVar = zzceaVar4;
        } else {
            zzbVar = new com.google.android.gms.ads.internal.zzb(context, null, null);
            zzceaVar = null;
        }
        com.google.android.gms.ads.internal.zzb zzbVar6 = zzbVar;
        zzdtl zzdtlVar2 = this.c;
        zzhdi zzhdiVar2 = zzdtlVar2.a;
        zzdua zzduaVar4 = zzdtlVar2.b;
        zzbmk zzbmkVar = zzduaVar4.h;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.U2)).booleanValue()) {
            x5n.q("rendering-native-assets-loading-start", zzdtlVar2.d);
        }
        ddb submit = zzhdiVar2.submit(new r0o(zzdtlVar2, zzfloVar, zzfldVar, jSONObject, 0));
        zzdtlVar2.a(submit, zzdzs.NATIVE_ASSETS_LOADING_BASIC_END);
        hsn hsnVar3 = zzduaVar4.g;
        zzeae zzeaeVar3 = zzduaVar4.r;
        final ddb a2 = zzduaVar4.a(jSONObject.optJSONArray("images"), zzbmkVar.b, zzbmkVar.d, zzdzs.NATIVE_ASSETS_LOADING_IMAGE_START);
        zzdtlVar2.a(a2, zzdzs.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzflg zzflgVar3 = zzfloVar.b.b;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Gb)).booleanValue()) {
            JSONArray optJSONArray3 = jSONObject.optJSONArray("images");
            if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
                zzdtlVar = zzdtlVar2;
                zzeaeVar = zzeaeVar3;
                str = "images";
                zzbVar2 = zzbVar6;
                zzceaVar2 = zzceaVar;
                zzduaVar = zzduaVar4;
                str2 = "html";
                ddbVar = b;
                ddbVar2 = submit;
                hsnVar = hsnVar3;
                zzflgVar = zzflgVar3;
            } else {
                JSONObject optJSONObject2 = optJSONArray3.optJSONObject(0);
                if (optJSONObject2 != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.X4)).booleanValue() && optJSONObject2.has((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Y4))) {
                        xloVar = xloVar7;
                        zzeaeVar = zzeaeVar3;
                        str = "images";
                        zzbVar2 = zzbVar6;
                        zzceaVar2 = zzceaVar;
                        zzduaVar = zzduaVar4;
                        str2 = "html";
                        ddbVar = b;
                        ddbVar2 = submit;
                        zzdtlVar = zzdtlVar2;
                        hsnVar = hsnVar3;
                        zzflgVar = zzflgVar3;
                        final ?? r9 = zzdtlVar;
                        r9.a(xloVar, zzdzs.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
                        ddb b2 = zzduaVar.b(jSONObject.optJSONObject("secondary_image"), zzbmkVar.b, zzdzs.NATIVE_ASSETS_LOADING_LOGO_START);
                        r9.a(b2, zzdzs.NATIVE_ASSETS_LOADING_LOGO_END);
                        ddb b3 = zzduaVar.b(jSONObject.optJSONObject("app_icon"), zzbmkVar.b, zzdzs.NATIVE_ASSETS_LOADING_ICON_START);
                        r9.a(b3, zzdzs.NATIVE_ASSETS_LOADING_ICON_END);
                        optJSONObject = jSONObject.optJSONObject(V3.c);
                        if (optJSONObject != null) {
                        }
                        r9.a(e, zzdzs.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
                        zzi = zzbp.zzi(jSONObject, "html_containers", "instream");
                        if (zzi != null) {
                        }
                        r9.a(xloVar3, zzdzs.NATIVE_ASSETS_LOADING_VIDEO_END);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Oe)).booleanValue()) {
                        }
                        ddbVar3 = b3;
                        zzeaeVar2 = zzeaeVar;
                        xloVar4 = zzhcy.a(new Bundle());
                        zzduf zzdufVar2 = r9.c;
                        hsn hsnVar4 = zzdufVar2.a;
                        optJSONArray = jSONObject.optJSONArray("custom_assets");
                        if (optJSONArray != null) {
                        }
                        final ddb ddbVar6 = i2;
                        r9.a(ddbVar6, zzdzs.NATIVE_ASSETS_LOADING_CUSTOM_END);
                        if (jSONObject.optBoolean("enable_omid")) {
                        }
                        r9.a(h, zzdzs.NATIVE_ASSETS_LOADING_OMID_END);
                        ArrayList arrayList = new ArrayList();
                        final ddb ddbVar7 = ddbVar2;
                        arrayList.add(ddbVar7);
                        arrayList.add(a2);
                        arrayList.add(xloVar);
                        final ddb ddbVar8 = ddbVar4;
                        arrayList.add(ddbVar8);
                        final ddb ddbVar9 = ddbVar3;
                        arrayList.add(ddbVar9);
                        final xlo xloVar8 = xloVar2;
                        arrayList.add(xloVar8);
                        final xlo xloVar9 = xloVar6;
                        arrayList.add(xloVar9);
                        final xlo xloVar10 = xloVar5;
                        arrayList.add(xloVar10);
                        arrayList.add(ddbVar6);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x6)).booleanValue()) {
                        }
                        arrayList.add(h);
                        zzhcx zzhcxVar = new zzhcx(zzgxm.x(arrayList), false);
                        final zzcea zzceaVar5 = zzceaVar3;
                        final com.google.android.gms.ads.internal.zzb zzbVar7 = zzbVar4;
                        final ddb ddbVar10 = h;
                        final rlo a3 = zzhcxVar.a(zzhdiVar, new Callable() { // from class: q0o
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                List list;
                                JSONObject optJSONObject3;
                                zzdtl zzdtlVar3 = zzdtl.this;
                                ddb ddbVar11 = ddbVar7;
                                ddb ddbVar12 = a2;
                                ddb ddbVar13 = ddbVar9;
                                ddb ddbVar14 = ddbVar8;
                                ddb ddbVar15 = xloVar8;
                                JSONObject jSONObject2 = jSONObject;
                                ddb ddbVar16 = xloVar9;
                                ddb ddbVar17 = xloVar10;
                                ddb ddbVar18 = xloVar;
                                ddb ddbVar19 = ddbVar10;
                                ddb ddbVar20 = ddbVar6;
                                if (((Boolean) zzba.zzc().a(zzbjg.U2)).booleanValue()) {
                                    x5n.q("rendering-native-assets-loading-end", zzdtlVar3.d);
                                }
                                zzdqr zzdqrVar = (zzdqr) ddbVar11.get();
                                List list2 = (List) ddbVar12.get();
                                synchronized (zzdqrVar) {
                                    zzdqrVar.e = list2;
                                }
                                zzbmv zzbmvVar = (zzbmv) ddbVar13.get();
                                synchronized (zzdqrVar) {
                                    zzdqrVar.s = zzbmvVar;
                                }
                                zzbmv zzbmvVar2 = (zzbmv) ddbVar14.get();
                                synchronized (zzdqrVar) {
                                    zzdqrVar.t = zzbmvVar2;
                                }
                                zzbmo zzbmoVar = (zzbmo) ddbVar15.get();
                                synchronized (zzdqrVar) {
                                    zzdqrVar.c = zzbmoVar;
                                }
                                JSONObject optJSONObject4 = jSONObject2.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                if (optJSONObject4 == null) {
                                    mio mioVar = zzgxm.b;
                                    list = s.e;
                                } else {
                                    JSONArray optJSONArray4 = optJSONObject4.optJSONArray("reasons");
                                    if (optJSONArray4 == null || optJSONArray4.length() <= 0) {
                                        mio mioVar2 = zzgxm.b;
                                        list = s.e;
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                                            zzew f = zzdua.f(optJSONArray4.optJSONObject(i4));
                                            if (f != null) {
                                                arrayList2.add(f);
                                            }
                                        }
                                        list = zzgxm.x(arrayList2);
                                    }
                                }
                                synchronized (zzdqrVar) {
                                    zzdqrVar.f = list;
                                }
                                JSONObject optJSONObject5 = jSONObject2.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                zzew f2 = (optJSONObject5 == null || (optJSONObject3 = optJSONObject5.optJSONObject("default_reason")) == null) ? null : zzdua.f(optJSONObject3);
                                synchronized (zzdqrVar) {
                                    zzdqrVar.g = f2;
                                }
                                zzclm zzclmVar = (zzclm) ddbVar16.get();
                                if (zzclmVar != null) {
                                    synchronized (zzdqrVar) {
                                        zzdqrVar.i = zzclmVar;
                                    }
                                    View zzE = zzclmVar.zzE();
                                    synchronized (zzdqrVar) {
                                        zzdqrVar.o = zzE;
                                    }
                                    zzcms zzh = zzclmVar.zzh();
                                    synchronized (zzdqrVar) {
                                        zzdqrVar.b = zzh;
                                    }
                                }
                                zzdqrVar.d().putAll((Bundle) ddbVar17.get());
                                zzclm zzclmVar2 = (zzclm) ddbVar18.get();
                                if (zzclmVar2 != null) {
                                    synchronized (zzdqrVar) {
                                        zzdqrVar.j = zzclmVar2;
                                    }
                                    View zzE2 = zzclmVar2.zzE();
                                    synchronized (zzdqrVar) {
                                        zzdqrVar.p = zzE2;
                                    }
                                }
                                if (!((Boolean) zzba.zzc().a(zzbjg.x6)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                                    zzclm zzclmVar3 = (zzclm) ddbVar19.get();
                                    if (zzclmVar3 != null) {
                                        synchronized (zzdqrVar) {
                                            zzdqrVar.k = zzclmVar3;
                                        }
                                    }
                                } else {
                                    synchronized (zzdqrVar) {
                                        zzdqrVar.m = ddbVar19;
                                    }
                                    zzcgo zzcgoVar = new zzcgo();
                                    synchronized (zzdqrVar) {
                                        zzdqrVar.n = zzcgoVar;
                                    }
                                }
                                for (zzduc zzducVar : (List) ddbVar20.get()) {
                                    int i5 = zzducVar.a;
                                    String str8 = zzducVar.b;
                                    if (i5 != 1) {
                                        zzbmg zzbmgVar = zzducVar.d;
                                        synchronized (zzdqrVar) {
                                            fhh fhhVar = zzdqrVar.v;
                                            if (zzbmgVar == null) {
                                                fhhVar.remove(str8);
                                            } else {
                                                fhhVar.put(str8, zzbmgVar);
                                            }
                                        }
                                    } else {
                                        zzdqrVar.o(str8, zzducVar.c);
                                    }
                                }
                                return zzdqrVar;
                            }
                        });
                        final ddb ddbVar11 = ddbVar;
                        return new zzhcx(zzgxm.y(new ddb[]{ddbVar, a3}), true).a(this.b, new Callable() { // from class: l5o
                            /* JADX WARN: Removed duplicated region for block: B:41:0x01d7  */
                            @Override // java.util.concurrent.Callable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object call() {
                                zzepc zzepcVar = zzepc.this;
                                rlo rloVar = a3;
                                ddb ddbVar12 = ddbVar11;
                                zzflo zzfloVar2 = zzfloVar;
                                zzfld zzfldVar2 = zzfldVar;
                                JSONObject jSONObject2 = jSONObject;
                                zzb zzbVar8 = zzbVar7;
                                zzcef zzcefVar = zzceaVar5;
                                zzdqr zzdqrVar = (zzdqr) rloVar.get();
                                zzdvv zzdvvVar = (zzdvv) ddbVar12.get();
                                inn innVar = zzbjg.V2;
                                if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                                    x5n.q("rendering-webview-creation-end", zzepcVar.f);
                                }
                                cvn c = zzepcVar.a.c(new zzczb(zzfloVar2, zzfldVar2, null), new zzdrc(zzdqrVar), new zzdpn(jSONObject2, zzdvvVar, zzbVar8, zzcefVar));
                                if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                                    long a4 = zzt.zzk().a();
                                    zzeae zzeaeVar4 = zzepcVar.f;
                                    zzeaeVar4.c(a4, "rendering-ad-component-creation-end");
                                    zzeaeVar4.c(a4, "rendering-configure-webview-start");
                                }
                                zzinv zzinvVar = c.e;
                                zzdpn zzdpnVar = c.b;
                                zzdrc zzdrcVar = c.a;
                                zzdrb zzdrbVar = c.c.a.a;
                                zzioe.a(zzdrbVar);
                                zzdqr zzdqrVar2 = zzdrcVar.a;
                                zzioe.a(zzdqrVar2);
                                zzdvv zzdvvVar2 = zzdpnVar.b;
                                zzioe.a(zzdvvVar2);
                                zzdvi zzdviVar = new zzdvi(zzdrbVar, zzdqrVar2, zzdvvVar2, zzinv.b(zzinvVar));
                                if (zzdviVar.a != null) {
                                    zzdviVar.b.b("/nativeAdCustomClick", zzdviVar);
                                }
                                zzdvq zzdvqVar = (zzdvq) c.f.zzb();
                                zzdew zzdewVar = zzdvqVar.b;
                                zzdvj zzdvjVar = zzdvvVar.a;
                                Objects.requireNonNull(zzdewVar);
                                final int i4 = 0;
                                g1o g1oVar = new g1o(zzdewVar, 0);
                                zzddn zzddnVar = zzdvqVar.a;
                                zzdfj zzdfjVar = zzdvqVar.c;
                                zzdga zzdgaVar = zzdvqVar.d;
                                zzdit zzditVar = zzdvqVar.e;
                                synchronized (zzdvjVar) {
                                    zzdvjVar.a = zzddnVar;
                                    zzdvjVar.b = zzdfjVar;
                                    zzdvjVar.c = zzdgaVar;
                                    zzdvjVar.d = zzditVar;
                                    zzdvjVar.e = g1oVar;
                                }
                                zzfld zzfldVar3 = zzdvqVar.f;
                                zzflg zzflgVar4 = zzdvqVar.g;
                                zzcub zzcubVar = zzdvqVar.h;
                                synchronized (zzdvvVar) {
                                    ilo iloVar = zzdvvVar.n;
                                    if (iloVar != null) {
                                        qpn qpnVar = new qpn(zzdvvVar, zzfldVar3, zzflgVar4, zzcubVar, 3);
                                        iloVar.addListener(new vlo(0, iloVar, qpnVar), zzdvvVar.e);
                                    }
                                }
                                final zzdul zzdulVar = (zzdul) c.g.zzb();
                                zzclm h3 = zzdqrVar.h();
                                final int i5 = 1;
                                if (h3 == null) {
                                    zzdulVar.getClass();
                                } else {
                                    zzdlq zzdlqVar = zzdulVar.c;
                                    zzdlqVar.q0(h3.zzE());
                                    a1o a1oVar = new a1o(h3, 1);
                                    Executor executor = zzdulVar.a;
                                    zzdlqVar.n0(a1oVar, executor);
                                    zzdlqVar.n0(new a1o(h3, 0), executor);
                                    zzcvi zzcviVar = zzdulVar.b;
                                    zzdlqVar.n0(zzcviVar, executor);
                                    zzcviVar.a = h3;
                                    zzclx zzP = h3.zzP();
                                    if (((Boolean) zzba.zzc().a(zzbjg.Mb)).booleanValue() && zzP != null) {
                                        zzcub zzcubVar2 = zzdulVar.d;
                                        zzP.j("/click");
                                        zzdlw zzdlwVar = zzP.k;
                                        mon monVar = zzbqg.a;
                                        zzP.h("/click", new qon(i4, zzdlwVar, zzcubVar2));
                                        zzP.l0(zzcubVar2, null, null);
                                    }
                                    h3.T("/trackActiveViewUnit", new zzbqh() { // from class: b1o
                                        @Override // com.google.android.gms.internal.ads.zzbqh
                                        public final void a(Object obj, Map map) {
                                            int i6 = i4;
                                            zzdul zzdulVar2 = zzdulVar;
                                            switch (i6) {
                                                case 0:
                                                    zzcvi zzcviVar2 = zzdulVar2.b;
                                                    zzcviVar2.e = true;
                                                    zzcviVar2.c();
                                                    break;
                                                default:
                                                    zzdulVar2.b.e = false;
                                                    break;
                                            }
                                        }
                                    });
                                    h3.T("/untrackActiveViewUnit", new zzbqh() { // from class: b1o
                                        @Override // com.google.android.gms.internal.ads.zzbqh
                                        public final void a(Object obj, Map map) {
                                            int i6 = i5;
                                            zzdul zzdulVar2 = zzdulVar;
                                            switch (i6) {
                                                case 0:
                                                    zzcvi zzcviVar2 = zzdulVar2.b;
                                                    zzcviVar2.e = true;
                                                    zzcviVar2.c();
                                                    break;
                                                default:
                                                    zzdulVar2.b.e = false;
                                                    break;
                                            }
                                        }
                                    });
                                    h3.zzP().A = zzdulVar.e;
                                }
                                zzdwa zzdwaVar = (zzdwa) c.h.zzb();
                                zzdwb zzdwbVar = zzepcVar.e;
                                zzclm i6 = zzdqrVar.i();
                                zzdwaVar.getClass();
                                zzdvy zzdvyVar = zzdwbVar.a;
                                zzdew zzdewVar2 = zzdwaVar.b;
                                Objects.requireNonNull(zzdewVar2);
                                g1o g1oVar2 = new g1o(zzdewVar2, 1);
                                zzddn zzddnVar2 = zzdwaVar.a;
                                zzdfj zzdfjVar2 = zzdwaVar.c;
                                zzdga zzdgaVar2 = zzdwaVar.d;
                                zzdit zzditVar2 = zzdwaVar.e;
                                zzdlu zzdluVar = zzdwaVar.f;
                                synchronized (zzdvyVar) {
                                    synchronized (zzdvyVar) {
                                        zzdvyVar.a = zzddnVar2;
                                        zzdvyVar.b = zzdfjVar2;
                                        zzdvyVar.c = zzdgaVar2;
                                        zzdvyVar.d = zzditVar2;
                                        zzdvyVar.e = g1oVar2;
                                    }
                                    if (((Boolean) zzba.zzc().a(zzbjg.Nb)).booleanValue() && i6 != null && i6.zzP() != null) {
                                        zzclx zzP2 = i6.zzP();
                                        zzcub zzcubVar3 = zzdwaVar.j;
                                        zzele zzeleVar = zzdwaVar.i;
                                        zzP2.i0(zzcubVar3, zzeleVar, zzdwaVar.h);
                                        zzP2.l0(zzcubVar3, zzeleVar, zzdwaVar.g);
                                    }
                                    if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                                        x5n.q("rendering-configure-webview-end", zzepcVar.f);
                                    }
                                    return (zzdqm) c.d.zzb();
                                }
                                zzdvyVar.f = zzdluVar;
                                if (((Boolean) zzba.zzc().a(zzbjg.Nb)).booleanValue()) {
                                    zzclx zzP22 = i6.zzP();
                                    zzcub zzcubVar32 = zzdwaVar.j;
                                    zzele zzeleVar2 = zzdwaVar.i;
                                    zzP22.i0(zzcubVar32, zzeleVar2, zzdwaVar.h);
                                    zzP22.l0(zzcubVar32, zzeleVar2, zzdwaVar.g);
                                }
                                if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                                }
                                return (zzdqm) c.d.zzb();
                            }
                        });
                    }
                    String optString = optJSONObject2.optString("base_url");
                    String optString2 = optJSONObject2.optString("html");
                    int optInt = optJSONObject2.optInt("width", 0);
                    int optInt2 = optJSONObject2.optInt("height", 0);
                    if (optInt != 0) {
                        i = optInt;
                    } else if (optInt2 != 0) {
                        i = 0;
                    } else {
                        zzrVar = com.google.android.gms.ads.internal.client.zzr.zzb();
                        hsnVar2 = hsnVar3;
                        str3 = "images";
                        if (TextUtils.isEmpty(optString2)) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z2)).booleanValue()) {
                                x5n.q("native-assets-loading-image-composition-start", zzeaeVar3);
                            }
                            str2 = "html";
                            zzeaeVar = zzeaeVar3;
                            zzcea zzceaVar6 = zzceaVar;
                            ddbVar = b;
                            ddbVar2 = submit;
                            zzdtlVar = zzdtlVar2;
                            hsn hsnVar5 = hsnVar2;
                            str = str3;
                            t0o t0oVar = new t0o(zzduaVar4, zzrVar, zzfldVar, zzflgVar3, zzbVar6, zzceaVar6, optString, optString2, 0);
                            zzduaVar = zzduaVar4;
                            zzflgVar = zzflgVar3;
                            zzbVar2 = zzbVar6;
                            zzceaVar2 = zzceaVar6;
                            hlo h3 = zzhcy.h(xloVar7, t0oVar, zzcgj.f);
                            ?? h4 = zzhcy.h(h3, new u0o(h3, 0), zzcgj.h);
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.a3)).booleanValue()) {
                                hsnVar = hsnVar5;
                                zzcgm.a(h4, "NativeAssetsLoader.loadImageHtml", hsnVar);
                            } else {
                                hsnVar = hsnVar5;
                            }
                            xloVar = h4;
                            final zzdtl r92 = zzdtlVar;
                            r92.a(xloVar, zzdzs.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
                            ddb b22 = zzduaVar.b(jSONObject.optJSONObject("secondary_image"), zzbmkVar.b, zzdzs.NATIVE_ASSETS_LOADING_LOGO_START);
                            r92.a(b22, zzdzs.NATIVE_ASSETS_LOADING_LOGO_END);
                            ddb b32 = zzduaVar.b(jSONObject.optJSONObject("app_icon"), zzbmkVar.b, zzdzs.NATIVE_ASSETS_LOADING_ICON_START);
                            r92.a(b32, zzdzs.NATIVE_ASSETS_LOADING_ICON_END);
                            optJSONObject = jSONObject.optJSONObject(V3.c);
                            if (optJSONObject != null) {
                                e = xloVar7;
                                str4 = "image";
                                zzflgVar2 = zzflgVar;
                                zzbVar3 = zzbVar2;
                            } else {
                                JSONArray optJSONArray4 = optJSONObject.optJSONArray(str);
                                zzflgVar2 = zzflgVar;
                                JSONObject optJSONObject3 = optJSONObject.optJSONObject("image");
                                if (optJSONArray4 == null && optJSONObject3 != null) {
                                    optJSONArray4 = new JSONArray();
                                    optJSONArray4.put(optJSONObject3);
                                }
                                str4 = "image";
                                zzbVar3 = zzbVar2;
                                e = zzduaVar.e("NativeAssetsLoader.loadAttributionInfo", optJSONObject.optBoolean("require"), zzhcy.i(zzduaVar.a(optJSONArray4, false, true, zzdzs.NATIVE_ASSETS_LOADING_ATTRIBUTION_START), new tpn(1, zzduaVar, optJSONObject), hsnVar));
                            }
                            r92.a(e, zzdzs.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
                            zzi = zzbp.zzi(jSONObject, "html_containers", "instream");
                            if (zzi != null) {
                                JSONObject optJSONObject4 = jSONObject.optJSONObject("video");
                                if (optJSONObject4 == null) {
                                    com.google.android.gms.ads.internal.zzb zzbVar8 = zzbVar3;
                                    xloVar2 = e;
                                    zzbVar4 = zzbVar8;
                                    zzduaVar2 = zzduaVar;
                                    str5 = "video";
                                    zzceaVar3 = zzceaVar2;
                                    zzhdiVar = zzhdiVar2;
                                    str6 = str4;
                                    xloVar3 = xloVar7;
                                } else {
                                    String optString3 = optJSONObject4.optString("vast_xml");
                                    zzdua zzduaVar5 = zzduaVar;
                                    boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Fb)).booleanValue() && optJSONObject4.has(str2);
                                    if (!TextUtils.isEmpty(optString3) || z2) {
                                        if (z2) {
                                            str5 = "video";
                                            zzhdiVar = zzhdiVar2;
                                            com.google.android.gms.ads.internal.zzb zzbVar9 = zzbVar3;
                                            str6 = str4;
                                            z = z2;
                                            xloVar2 = e;
                                            zzduaVar3 = zzduaVar5;
                                            h2 = zzduaVar3.d(optJSONObject4, zzfldVar, zzflgVar2, zzbVar9, zzceaVar2);
                                            zzbVar5 = zzbVar9;
                                        } else {
                                            str5 = "video";
                                            zzhdiVar = zzhdiVar2;
                                            com.google.android.gms.ads.internal.zzb zzbVar10 = zzbVar3;
                                            str6 = str4;
                                            z = z2;
                                            xloVar2 = e;
                                            zzduaVar3 = zzduaVar5;
                                            zzdus zzdusVar = zzduaVar3.i;
                                            zzdusVar.getClass();
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z2)).booleanValue()) {
                                                x5n.q("native-assets-loading-video-start", zzdusVar.j);
                                            }
                                            qxn qxnVar = new qxn(1, zzdusVar, zzbVar10, zzceaVar2);
                                            Executor executor = zzdusVar.b;
                                            zzbVar5 = zzbVar10;
                                            h2 = zzhcy.h(zzhcy.h(xloVar7, qxnVar, executor), new spn(4, zzdusVar, optJSONObject4), executor);
                                        }
                                        ?? e2 = zzduaVar3.e(true != z ? "NativeAssetsLoader.loadVideoView" : "NativeAssetsLoader.loadVideoHtml", false, zzhcy.g(h2, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.P4)).intValue(), TimeUnit.SECONDS, zzduaVar3.k));
                                        zzduaVar2 = zzduaVar3;
                                        zzceaVar3 = zzceaVar2;
                                        zzbVar4 = zzbVar5;
                                        xloVar3 = e2;
                                    } else {
                                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                                        zzo.zzi("Required field 'vast_xml' or 'html' is missing");
                                        com.google.android.gms.ads.internal.zzb zzbVar11 = zzbVar3;
                                        xloVar2 = e;
                                        zzbVar4 = zzbVar11;
                                        str5 = "video";
                                        zzceaVar3 = zzceaVar2;
                                        zzhdiVar = zzhdiVar2;
                                        str6 = str4;
                                        zzduaVar2 = zzduaVar5;
                                        xloVar3 = xloVar7;
                                    }
                                }
                            } else {
                                str5 = "video";
                                zzhdiVar = zzhdiVar2;
                                com.google.android.gms.ads.internal.zzb zzbVar12 = zzbVar3;
                                str6 = str4;
                                xloVar2 = e;
                                ?? d = zzduaVar.d(zzi, zzfldVar, zzflgVar2, zzbVar12, zzceaVar2);
                                zzduaVar2 = zzduaVar;
                                zzbVar4 = zzbVar12;
                                zzceaVar3 = zzceaVar2;
                                xloVar3 = d;
                            }
                            r92.a(xloVar3, zzdzs.NATIVE_ASSETS_LOADING_VIDEO_END);
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Oe)).booleanValue()) {
                                String str8 = str5;
                                if (jSONObject.has(str8)) {
                                    JSONObject optJSONObject5 = jSONObject.optJSONObject(str8);
                                    if (optJSONObject5.has("flags") && (optJSONArray2 = optJSONObject5.optJSONArray("flags")) != null) {
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= optJSONArray2.length()) {
                                                break;
                                            }
                                            JSONObject optJSONObject6 = optJSONArray2.optJSONObject(i5);
                                            if (optJSONObject6 == null || !optJSONObject6.optString(U3.i.W).equals("afma_video_player_type")) {
                                                i5++;
                                                zzeaeVar = zzeaeVar;
                                                b32 = b32;
                                            } else {
                                                try {
                                                    if (Integer.parseInt(optJSONObject6.optString(U3.i.X)) == 3) {
                                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z2)).booleanValue()) {
                                                            zzeaeVar2 = zzeaeVar;
                                                            x5n.q("native-assets-loading-media-start", zzeaeVar2);
                                                        } else {
                                                            zzeaeVar2 = zzeaeVar;
                                                        }
                                                        ?? zzcgoVar = new zzcgo();
                                                        ddbVar3 = b32;
                                                        xloVar3.addListener(new vlo(0, xloVar3, new b1l(zzduaVar2, (zzcgo) zzcgoVar)), zzcgj.f);
                                                        r92.a(zzcgoVar, zzdzs.NATIVE_ASSETS_LOADING_MEDIA_END);
                                                        xloVar4 = zzcgoVar;
                                                    }
                                                } catch (NumberFormatException unused) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            ddbVar3 = b32;
                            zzeaeVar2 = zzeaeVar;
                            xloVar4 = zzhcy.a(new Bundle());
                            zzduf zzdufVar22 = r92.c;
                            hsn hsnVar42 = zzdufVar22.a;
                            optJSONArray = jSONObject.optJSONArray("custom_assets");
                            if (optJSONArray != null) {
                                i2 = zzhcy.a(Collections.EMPTY_LIST);
                                xloVar6 = xloVar3;
                                xloVar5 = xloVar4;
                                ddbVar4 = b22;
                            } else {
                                xloVar5 = xloVar4;
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z2)).booleanValue()) {
                                    x5n.q("native-assets-loading-custom-start", zzdufVar22.c);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                int length = optJSONArray.length();
                                xloVar6 = xloVar3;
                                int i6 = 0;
                                while (i6 < length) {
                                    int i7 = length;
                                    JSONObject optJSONObject7 = optJSONArray.optJSONObject(i6);
                                    if (optJSONObject7 == null) {
                                        a = xlo.b;
                                        i3 = i6;
                                    } else {
                                        i3 = i6;
                                        String optString4 = optJSONObject7.optString("name");
                                        if (optString4 == null) {
                                            a = xlo.b;
                                        } else {
                                            jSONArray = optJSONArray;
                                            String optString5 = optJSONObject7.optString("type");
                                            ddbVar5 = b22;
                                            if ("string".equals(optString5)) {
                                                a = zzhcy.a(new zzduc(optString4, optJSONObject7.optString("string_value")));
                                                future = a;
                                                str7 = str6;
                                                zzdufVar = zzdufVar22;
                                                arrayList2.add(future);
                                                i6 = i3 + 1;
                                                length = i7;
                                                optJSONArray = jSONArray;
                                                b22 = ddbVar5;
                                                zzdufVar22 = zzdufVar;
                                                str6 = str7;
                                            } else {
                                                String str9 = str6;
                                                if (str9.equals(optString5)) {
                                                    zzdua zzduaVar6 = zzdufVar22.b;
                                                    zzdufVar = zzdufVar22;
                                                    str7 = str9;
                                                    future = zzhcy.i(zzduaVar6.b(optJSONObject7.optJSONObject("image_value"), zzduaVar6.h.b, null), new non(optString4, 2), hsnVar42);
                                                } else {
                                                    zzdufVar = zzdufVar22;
                                                    str7 = str9;
                                                    future = xlo.b;
                                                }
                                                arrayList2.add(future);
                                                i6 = i3 + 1;
                                                length = i7;
                                                optJSONArray = jSONArray;
                                                b22 = ddbVar5;
                                                zzdufVar22 = zzdufVar;
                                                str6 = str7;
                                            }
                                        }
                                    }
                                    ddbVar5 = b22;
                                    jSONArray = optJSONArray;
                                    future = a;
                                    str7 = str6;
                                    zzdufVar = zzdufVar22;
                                    arrayList2.add(future);
                                    i6 = i3 + 1;
                                    length = i7;
                                    optJSONArray = jSONArray;
                                    b22 = ddbVar5;
                                    zzdufVar22 = zzdufVar;
                                    str6 = str7;
                                }
                                ddbVar4 = b22;
                                i2 = zzhcy.i(new olo(zzgxm.x(arrayList2), true), ahn.j, hsnVar42);
                            }
                            final ddb ddbVar62 = i2;
                            r92.a(ddbVar62, zzdzs.NATIVE_ASSETS_LOADING_CUSTOM_END);
                            if (jSONObject.optBoolean("enable_omid")) {
                                h = xlo.b;
                            } else {
                                JSONObject optJSONObject8 = jSONObject.optJSONObject("omid_settings");
                                if (optJSONObject8 == null) {
                                    h = xlo.b;
                                } else {
                                    String optString6 = optJSONObject8.optString("omid_html");
                                    if (TextUtils.isEmpty(optString6)) {
                                        h = xlo.b;
                                    } else {
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z2)).booleanValue()) {
                                            x5n.q("native-assets-loading-omid-start", zzeaeVar2);
                                        }
                                        h = zzhcy.h(xlo.b, new ewn(zzduaVar2, optString6, zzceaVar3, zzbVar4), zzcgj.f);
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.a3)).booleanValue()) {
                                            zzcgm.a(h, "NativeAssetsLoader.omidWebView", hsnVar);
                                        }
                                    }
                                }
                            }
                            r92.a(h, zzdzs.NATIVE_ASSETS_LOADING_OMID_END);
                            ArrayList arrayList3 = new ArrayList();
                            final ddb ddbVar72 = ddbVar2;
                            arrayList3.add(ddbVar72);
                            arrayList3.add(a2);
                            arrayList3.add(xloVar);
                            final ddb ddbVar82 = ddbVar4;
                            arrayList3.add(ddbVar82);
                            final ddb ddbVar92 = ddbVar3;
                            arrayList3.add(ddbVar92);
                            final ddb xloVar82 = xloVar2;
                            arrayList3.add(xloVar82);
                            final ddb xloVar92 = xloVar6;
                            arrayList3.add(xloVar92);
                            final ddb xloVar102 = xloVar5;
                            arrayList3.add(xloVar102);
                            arrayList3.add(ddbVar62);
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x6)).booleanValue() || jSONObject.optInt("template_id") == 3) {
                                arrayList3.add(h);
                            }
                            zzhcx zzhcxVar2 = new zzhcx(zzgxm.x(arrayList3), false);
                            final zzcea zzceaVar52 = zzceaVar3;
                            final com.google.android.gms.ads.internal.zzb zzbVar72 = zzbVar4;
                            final ddb ddbVar102 = h;
                            final rlo a32 = zzhcxVar2.a(zzhdiVar, new Callable() { // from class: q0o
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    List list;
                                    JSONObject optJSONObject32;
                                    zzdtl zzdtlVar3 = zzdtl.this;
                                    ddb ddbVar112 = ddbVar72;
                                    ddb ddbVar12 = a2;
                                    ddb ddbVar13 = ddbVar92;
                                    ddb ddbVar14 = ddbVar82;
                                    ddb ddbVar15 = xloVar82;
                                    JSONObject jSONObject2 = jSONObject;
                                    ddb ddbVar16 = xloVar92;
                                    ddb ddbVar17 = xloVar102;
                                    ddb ddbVar18 = xloVar;
                                    ddb ddbVar19 = ddbVar102;
                                    ddb ddbVar20 = ddbVar62;
                                    if (((Boolean) zzba.zzc().a(zzbjg.U2)).booleanValue()) {
                                        x5n.q("rendering-native-assets-loading-end", zzdtlVar3.d);
                                    }
                                    zzdqr zzdqrVar = (zzdqr) ddbVar112.get();
                                    List list2 = (List) ddbVar12.get();
                                    synchronized (zzdqrVar) {
                                        zzdqrVar.e = list2;
                                    }
                                    zzbmv zzbmvVar = (zzbmv) ddbVar13.get();
                                    synchronized (zzdqrVar) {
                                        zzdqrVar.s = zzbmvVar;
                                    }
                                    zzbmv zzbmvVar2 = (zzbmv) ddbVar14.get();
                                    synchronized (zzdqrVar) {
                                        zzdqrVar.t = zzbmvVar2;
                                    }
                                    zzbmo zzbmoVar = (zzbmo) ddbVar15.get();
                                    synchronized (zzdqrVar) {
                                        zzdqrVar.c = zzbmoVar;
                                    }
                                    JSONObject optJSONObject42 = jSONObject2.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                    if (optJSONObject42 == null) {
                                        mio mioVar = zzgxm.b;
                                        list = s.e;
                                    } else {
                                        JSONArray optJSONArray42 = optJSONObject42.optJSONArray("reasons");
                                        if (optJSONArray42 == null || optJSONArray42.length() <= 0) {
                                            mio mioVar2 = zzgxm.b;
                                            list = s.e;
                                        } else {
                                            ArrayList arrayList22 = new ArrayList();
                                            for (int i42 = 0; i42 < optJSONArray42.length(); i42++) {
                                                zzew f = zzdua.f(optJSONArray42.optJSONObject(i42));
                                                if (f != null) {
                                                    arrayList22.add(f);
                                                }
                                            }
                                            list = zzgxm.x(arrayList22);
                                        }
                                    }
                                    synchronized (zzdqrVar) {
                                        zzdqrVar.f = list;
                                    }
                                    JSONObject optJSONObject52 = jSONObject2.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                    zzew f2 = (optJSONObject52 == null || (optJSONObject32 = optJSONObject52.optJSONObject("default_reason")) == null) ? null : zzdua.f(optJSONObject32);
                                    synchronized (zzdqrVar) {
                                        zzdqrVar.g = f2;
                                    }
                                    zzclm zzclmVar = (zzclm) ddbVar16.get();
                                    if (zzclmVar != null) {
                                        synchronized (zzdqrVar) {
                                            zzdqrVar.i = zzclmVar;
                                        }
                                        View zzE = zzclmVar.zzE();
                                        synchronized (zzdqrVar) {
                                            zzdqrVar.o = zzE;
                                        }
                                        zzcms zzh = zzclmVar.zzh();
                                        synchronized (zzdqrVar) {
                                            zzdqrVar.b = zzh;
                                        }
                                    }
                                    zzdqrVar.d().putAll((Bundle) ddbVar17.get());
                                    zzclm zzclmVar2 = (zzclm) ddbVar18.get();
                                    if (zzclmVar2 != null) {
                                        synchronized (zzdqrVar) {
                                            zzdqrVar.j = zzclmVar2;
                                        }
                                        View zzE2 = zzclmVar2.zzE();
                                        synchronized (zzdqrVar) {
                                            zzdqrVar.p = zzE2;
                                        }
                                    }
                                    if (!((Boolean) zzba.zzc().a(zzbjg.x6)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                                        zzclm zzclmVar3 = (zzclm) ddbVar19.get();
                                        if (zzclmVar3 != null) {
                                            synchronized (zzdqrVar) {
                                                zzdqrVar.k = zzclmVar3;
                                            }
                                        }
                                    } else {
                                        synchronized (zzdqrVar) {
                                            zzdqrVar.m = ddbVar19;
                                        }
                                        zzcgo zzcgoVar2 = new zzcgo();
                                        synchronized (zzdqrVar) {
                                            zzdqrVar.n = zzcgoVar2;
                                        }
                                    }
                                    for (zzduc zzducVar : (List) ddbVar20.get()) {
                                        int i52 = zzducVar.a;
                                        String str82 = zzducVar.b;
                                        if (i52 != 1) {
                                            zzbmg zzbmgVar = zzducVar.d;
                                            synchronized (zzdqrVar) {
                                                fhh fhhVar = zzdqrVar.v;
                                                if (zzbmgVar == null) {
                                                    fhhVar.remove(str82);
                                                } else {
                                                    fhhVar.put(str82, zzbmgVar);
                                                }
                                            }
                                        } else {
                                            zzdqrVar.o(str82, zzducVar.c);
                                        }
                                    }
                                    return zzdqrVar;
                                }
                            });
                            final ddb ddbVar112 = ddbVar;
                            return new zzhcx(zzgxm.y(new ddb[]{ddbVar, a32}), true).a(this.b, new Callable() { // from class: l5o
                                /* JADX WARN: Removed duplicated region for block: B:41:0x01d7  */
                                @Override // java.util.concurrent.Callable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object call() {
                                    zzepc zzepcVar = zzepc.this;
                                    rlo rloVar = a32;
                                    ddb ddbVar12 = ddbVar112;
                                    zzflo zzfloVar2 = zzfloVar;
                                    zzfld zzfldVar2 = zzfldVar;
                                    JSONObject jSONObject2 = jSONObject;
                                    zzb zzbVar82 = zzbVar72;
                                    zzcef zzcefVar = zzceaVar52;
                                    zzdqr zzdqrVar = (zzdqr) rloVar.get();
                                    zzdvv zzdvvVar = (zzdvv) ddbVar12.get();
                                    inn innVar = zzbjg.V2;
                                    if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                                        x5n.q("rendering-webview-creation-end", zzepcVar.f);
                                    }
                                    cvn c = zzepcVar.a.c(new zzczb(zzfloVar2, zzfldVar2, null), new zzdrc(zzdqrVar), new zzdpn(jSONObject2, zzdvvVar, zzbVar82, zzcefVar));
                                    if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                                        long a4 = zzt.zzk().a();
                                        zzeae zzeaeVar4 = zzepcVar.f;
                                        zzeaeVar4.c(a4, "rendering-ad-component-creation-end");
                                        zzeaeVar4.c(a4, "rendering-configure-webview-start");
                                    }
                                    zzinv zzinvVar = c.e;
                                    zzdpn zzdpnVar = c.b;
                                    zzdrc zzdrcVar = c.a;
                                    zzdrb zzdrbVar = c.c.a.a;
                                    zzioe.a(zzdrbVar);
                                    zzdqr zzdqrVar2 = zzdrcVar.a;
                                    zzioe.a(zzdqrVar2);
                                    zzdvv zzdvvVar2 = zzdpnVar.b;
                                    zzioe.a(zzdvvVar2);
                                    zzdvi zzdviVar = new zzdvi(zzdrbVar, zzdqrVar2, zzdvvVar2, zzinv.b(zzinvVar));
                                    if (zzdviVar.a != null) {
                                        zzdviVar.b.b("/nativeAdCustomClick", zzdviVar);
                                    }
                                    zzdvq zzdvqVar = (zzdvq) c.f.zzb();
                                    zzdew zzdewVar = zzdvqVar.b;
                                    zzdvj zzdvjVar = zzdvvVar.a;
                                    Objects.requireNonNull(zzdewVar);
                                    final int i42 = 0;
                                    g1o g1oVar = new g1o(zzdewVar, 0);
                                    zzddn zzddnVar = zzdvqVar.a;
                                    zzdfj zzdfjVar = zzdvqVar.c;
                                    zzdga zzdgaVar = zzdvqVar.d;
                                    zzdit zzditVar = zzdvqVar.e;
                                    synchronized (zzdvjVar) {
                                        zzdvjVar.a = zzddnVar;
                                        zzdvjVar.b = zzdfjVar;
                                        zzdvjVar.c = zzdgaVar;
                                        zzdvjVar.d = zzditVar;
                                        zzdvjVar.e = g1oVar;
                                    }
                                    zzfld zzfldVar3 = zzdvqVar.f;
                                    zzflg zzflgVar4 = zzdvqVar.g;
                                    zzcub zzcubVar = zzdvqVar.h;
                                    synchronized (zzdvvVar) {
                                        ilo iloVar = zzdvvVar.n;
                                        if (iloVar != null) {
                                            qpn qpnVar = new qpn(zzdvvVar, zzfldVar3, zzflgVar4, zzcubVar, 3);
                                            iloVar.addListener(new vlo(0, iloVar, qpnVar), zzdvvVar.e);
                                        }
                                    }
                                    final zzdul zzdulVar = (zzdul) c.g.zzb();
                                    zzclm h32 = zzdqrVar.h();
                                    final int i52 = 1;
                                    if (h32 == null) {
                                        zzdulVar.getClass();
                                    } else {
                                        zzdlq zzdlqVar = zzdulVar.c;
                                        zzdlqVar.q0(h32.zzE());
                                        a1o a1oVar = new a1o(h32, 1);
                                        Executor executor2 = zzdulVar.a;
                                        zzdlqVar.n0(a1oVar, executor2);
                                        zzdlqVar.n0(new a1o(h32, 0), executor2);
                                        zzcvi zzcviVar = zzdulVar.b;
                                        zzdlqVar.n0(zzcviVar, executor2);
                                        zzcviVar.a = h32;
                                        zzclx zzP = h32.zzP();
                                        if (((Boolean) zzba.zzc().a(zzbjg.Mb)).booleanValue() && zzP != null) {
                                            zzcub zzcubVar2 = zzdulVar.d;
                                            zzP.j("/click");
                                            zzdlw zzdlwVar = zzP.k;
                                            mon monVar = zzbqg.a;
                                            zzP.h("/click", new qon(i42, zzdlwVar, zzcubVar2));
                                            zzP.l0(zzcubVar2, null, null);
                                        }
                                        h32.T("/trackActiveViewUnit", new zzbqh() { // from class: b1o
                                            @Override // com.google.android.gms.internal.ads.zzbqh
                                            public final void a(Object obj, Map map) {
                                                int i62 = i42;
                                                zzdul zzdulVar2 = zzdulVar;
                                                switch (i62) {
                                                    case 0:
                                                        zzcvi zzcviVar2 = zzdulVar2.b;
                                                        zzcviVar2.e = true;
                                                        zzcviVar2.c();
                                                        break;
                                                    default:
                                                        zzdulVar2.b.e = false;
                                                        break;
                                                }
                                            }
                                        });
                                        h32.T("/untrackActiveViewUnit", new zzbqh() { // from class: b1o
                                            @Override // com.google.android.gms.internal.ads.zzbqh
                                            public final void a(Object obj, Map map) {
                                                int i62 = i52;
                                                zzdul zzdulVar2 = zzdulVar;
                                                switch (i62) {
                                                    case 0:
                                                        zzcvi zzcviVar2 = zzdulVar2.b;
                                                        zzcviVar2.e = true;
                                                        zzcviVar2.c();
                                                        break;
                                                    default:
                                                        zzdulVar2.b.e = false;
                                                        break;
                                                }
                                            }
                                        });
                                        h32.zzP().A = zzdulVar.e;
                                    }
                                    zzdwa zzdwaVar = (zzdwa) c.h.zzb();
                                    zzdwb zzdwbVar = zzepcVar.e;
                                    zzclm i62 = zzdqrVar.i();
                                    zzdwaVar.getClass();
                                    zzdvy zzdvyVar = zzdwbVar.a;
                                    zzdew zzdewVar2 = zzdwaVar.b;
                                    Objects.requireNonNull(zzdewVar2);
                                    g1o g1oVar2 = new g1o(zzdewVar2, 1);
                                    zzddn zzddnVar2 = zzdwaVar.a;
                                    zzdfj zzdfjVar2 = zzdwaVar.c;
                                    zzdga zzdgaVar2 = zzdwaVar.d;
                                    zzdit zzditVar2 = zzdwaVar.e;
                                    zzdlu zzdluVar = zzdwaVar.f;
                                    synchronized (zzdvyVar) {
                                        synchronized (zzdvyVar) {
                                            zzdvyVar.a = zzddnVar2;
                                            zzdvyVar.b = zzdfjVar2;
                                            zzdvyVar.c = zzdgaVar2;
                                            zzdvyVar.d = zzditVar2;
                                            zzdvyVar.e = g1oVar2;
                                        }
                                        if (((Boolean) zzba.zzc().a(zzbjg.Nb)).booleanValue() && i62 != null && i62.zzP() != null) {
                                            zzclx zzP22 = i62.zzP();
                                            zzcub zzcubVar32 = zzdwaVar.j;
                                            zzele zzeleVar2 = zzdwaVar.i;
                                            zzP22.i0(zzcubVar32, zzeleVar2, zzdwaVar.h);
                                            zzP22.l0(zzcubVar32, zzeleVar2, zzdwaVar.g);
                                        }
                                        if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                                            x5n.q("rendering-configure-webview-end", zzepcVar.f);
                                        }
                                        return (zzdqm) c.d.zzb();
                                    }
                                    zzdvyVar.f = zzdluVar;
                                    if (((Boolean) zzba.zzc().a(zzbjg.Nb)).booleanValue()) {
                                        zzclx zzP222 = i62.zzP();
                                        zzcub zzcubVar322 = zzdwaVar.j;
                                        zzele zzeleVar22 = zzdwaVar.i;
                                        zzP222.i0(zzcubVar322, zzeleVar22, zzdwaVar.h);
                                        zzP222.l0(zzcubVar322, zzeleVar22, zzdwaVar.g);
                                    }
                                    if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                                    }
                                    return (zzdqm) c.d.zzb();
                                }
                            });
                        }
                        zzeaeVar = zzeaeVar3;
                        zzbVar2 = zzbVar6;
                        zzceaVar2 = zzceaVar;
                        zzduaVar = zzduaVar4;
                        str2 = "html";
                        ddbVar = b;
                        ddbVar2 = submit;
                        zzflgVar = zzflgVar3;
                        zzdtlVar = zzdtlVar2;
                        hsnVar = hsnVar2;
                        str = str3;
                    }
                    hsnVar2 = hsnVar3;
                    str3 = "images";
                    zzrVar = new com.google.android.gms.ads.internal.client.zzr(zzduaVar4.a, new AdSize(i, optInt2));
                    if (TextUtils.isEmpty(optString2)) {
                    }
                }
            }
            xloVar = xloVar7;
            final zzdtl r922 = zzdtlVar;
            r922.a(xloVar, zzdzs.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
            ddb b222 = zzduaVar.b(jSONObject.optJSONObject("secondary_image"), zzbmkVar.b, zzdzs.NATIVE_ASSETS_LOADING_LOGO_START);
            r922.a(b222, zzdzs.NATIVE_ASSETS_LOADING_LOGO_END);
            ddb b322 = zzduaVar.b(jSONObject.optJSONObject("app_icon"), zzbmkVar.b, zzdzs.NATIVE_ASSETS_LOADING_ICON_START);
            r922.a(b322, zzdzs.NATIVE_ASSETS_LOADING_ICON_END);
            optJSONObject = jSONObject.optJSONObject(V3.c);
            if (optJSONObject != null) {
            }
            r922.a(e, zzdzs.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
            zzi = zzbp.zzi(jSONObject, "html_containers", "instream");
            if (zzi != null) {
            }
            r922.a(xloVar3, zzdzs.NATIVE_ASSETS_LOADING_VIDEO_END);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Oe)).booleanValue()) {
            }
            ddbVar3 = b322;
            zzeaeVar2 = zzeaeVar;
            xloVar4 = zzhcy.a(new Bundle());
            zzduf zzdufVar222 = r922.c;
            hsn hsnVar422 = zzdufVar222.a;
            optJSONArray = jSONObject.optJSONArray("custom_assets");
            if (optJSONArray != null) {
            }
            final ddb ddbVar622 = i2;
            r922.a(ddbVar622, zzdzs.NATIVE_ASSETS_LOADING_CUSTOM_END);
            if (jSONObject.optBoolean("enable_omid")) {
            }
            r922.a(h, zzdzs.NATIVE_ASSETS_LOADING_OMID_END);
            ArrayList arrayList32 = new ArrayList();
            final ddb ddbVar722 = ddbVar2;
            arrayList32.add(ddbVar722);
            arrayList32.add(a2);
            arrayList32.add(xloVar);
            final ddb ddbVar822 = ddbVar4;
            arrayList32.add(ddbVar822);
            final ddb ddbVar922 = ddbVar3;
            arrayList32.add(ddbVar922);
            final ddb xloVar822 = xloVar2;
            arrayList32.add(xloVar822);
            final ddb xloVar922 = xloVar6;
            arrayList32.add(xloVar922);
            final ddb xloVar1022 = xloVar5;
            arrayList32.add(xloVar1022);
            arrayList32.add(ddbVar622);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x6)).booleanValue()) {
            }
            arrayList32.add(h);
            zzhcx zzhcxVar22 = new zzhcx(zzgxm.x(arrayList32), false);
            final zzcea zzceaVar522 = zzceaVar3;
            final com.google.android.gms.ads.internal.zzb zzbVar722 = zzbVar4;
            final ddb ddbVar1022 = h;
            final rlo a322 = zzhcxVar22.a(zzhdiVar, new Callable() { // from class: q0o
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    List list;
                    JSONObject optJSONObject32;
                    zzdtl zzdtlVar3 = zzdtl.this;
                    ddb ddbVar1122 = ddbVar722;
                    ddb ddbVar12 = a2;
                    ddb ddbVar13 = ddbVar922;
                    ddb ddbVar14 = ddbVar822;
                    ddb ddbVar15 = xloVar822;
                    JSONObject jSONObject2 = jSONObject;
                    ddb ddbVar16 = xloVar922;
                    ddb ddbVar17 = xloVar1022;
                    ddb ddbVar18 = xloVar;
                    ddb ddbVar19 = ddbVar1022;
                    ddb ddbVar20 = ddbVar622;
                    if (((Boolean) zzba.zzc().a(zzbjg.U2)).booleanValue()) {
                        x5n.q("rendering-native-assets-loading-end", zzdtlVar3.d);
                    }
                    zzdqr zzdqrVar = (zzdqr) ddbVar1122.get();
                    List list2 = (List) ddbVar12.get();
                    synchronized (zzdqrVar) {
                        zzdqrVar.e = list2;
                    }
                    zzbmv zzbmvVar = (zzbmv) ddbVar13.get();
                    synchronized (zzdqrVar) {
                        zzdqrVar.s = zzbmvVar;
                    }
                    zzbmv zzbmvVar2 = (zzbmv) ddbVar14.get();
                    synchronized (zzdqrVar) {
                        zzdqrVar.t = zzbmvVar2;
                    }
                    zzbmo zzbmoVar = (zzbmo) ddbVar15.get();
                    synchronized (zzdqrVar) {
                        zzdqrVar.c = zzbmoVar;
                    }
                    JSONObject optJSONObject42 = jSONObject2.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                    if (optJSONObject42 == null) {
                        mio mioVar = zzgxm.b;
                        list = s.e;
                    } else {
                        JSONArray optJSONArray42 = optJSONObject42.optJSONArray("reasons");
                        if (optJSONArray42 == null || optJSONArray42.length() <= 0) {
                            mio mioVar2 = zzgxm.b;
                            list = s.e;
                        } else {
                            ArrayList arrayList22 = new ArrayList();
                            for (int i42 = 0; i42 < optJSONArray42.length(); i42++) {
                                zzew f = zzdua.f(optJSONArray42.optJSONObject(i42));
                                if (f != null) {
                                    arrayList22.add(f);
                                }
                            }
                            list = zzgxm.x(arrayList22);
                        }
                    }
                    synchronized (zzdqrVar) {
                        zzdqrVar.f = list;
                    }
                    JSONObject optJSONObject52 = jSONObject2.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                    zzew f2 = (optJSONObject52 == null || (optJSONObject32 = optJSONObject52.optJSONObject("default_reason")) == null) ? null : zzdua.f(optJSONObject32);
                    synchronized (zzdqrVar) {
                        zzdqrVar.g = f2;
                    }
                    zzclm zzclmVar = (zzclm) ddbVar16.get();
                    if (zzclmVar != null) {
                        synchronized (zzdqrVar) {
                            zzdqrVar.i = zzclmVar;
                        }
                        View zzE = zzclmVar.zzE();
                        synchronized (zzdqrVar) {
                            zzdqrVar.o = zzE;
                        }
                        zzcms zzh = zzclmVar.zzh();
                        synchronized (zzdqrVar) {
                            zzdqrVar.b = zzh;
                        }
                    }
                    zzdqrVar.d().putAll((Bundle) ddbVar17.get());
                    zzclm zzclmVar2 = (zzclm) ddbVar18.get();
                    if (zzclmVar2 != null) {
                        synchronized (zzdqrVar) {
                            zzdqrVar.j = zzclmVar2;
                        }
                        View zzE2 = zzclmVar2.zzE();
                        synchronized (zzdqrVar) {
                            zzdqrVar.p = zzE2;
                        }
                    }
                    if (!((Boolean) zzba.zzc().a(zzbjg.x6)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                        zzclm zzclmVar3 = (zzclm) ddbVar19.get();
                        if (zzclmVar3 != null) {
                            synchronized (zzdqrVar) {
                                zzdqrVar.k = zzclmVar3;
                            }
                        }
                    } else {
                        synchronized (zzdqrVar) {
                            zzdqrVar.m = ddbVar19;
                        }
                        zzcgo zzcgoVar2 = new zzcgo();
                        synchronized (zzdqrVar) {
                            zzdqrVar.n = zzcgoVar2;
                        }
                    }
                    for (zzduc zzducVar : (List) ddbVar20.get()) {
                        int i52 = zzducVar.a;
                        String str82 = zzducVar.b;
                        if (i52 != 1) {
                            zzbmg zzbmgVar = zzducVar.d;
                            synchronized (zzdqrVar) {
                                fhh fhhVar = zzdqrVar.v;
                                if (zzbmgVar == null) {
                                    fhhVar.remove(str82);
                                } else {
                                    fhhVar.put(str82, zzbmgVar);
                                }
                            }
                        } else {
                            zzdqrVar.o(str82, zzducVar.c);
                        }
                    }
                    return zzdqrVar;
                }
            });
            final ddb ddbVar1122 = ddbVar;
            return new zzhcx(zzgxm.y(new ddb[]{ddbVar, a322}), true).a(this.b, new Callable() { // from class: l5o
                /* JADX WARN: Removed duplicated region for block: B:41:0x01d7  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object call() {
                    zzepc zzepcVar = zzepc.this;
                    rlo rloVar = a322;
                    ddb ddbVar12 = ddbVar1122;
                    zzflo zzfloVar2 = zzfloVar;
                    zzfld zzfldVar2 = zzfldVar;
                    JSONObject jSONObject2 = jSONObject;
                    zzb zzbVar82 = zzbVar722;
                    zzcef zzcefVar = zzceaVar522;
                    zzdqr zzdqrVar = (zzdqr) rloVar.get();
                    zzdvv zzdvvVar = (zzdvv) ddbVar12.get();
                    inn innVar = zzbjg.V2;
                    if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                        x5n.q("rendering-webview-creation-end", zzepcVar.f);
                    }
                    cvn c = zzepcVar.a.c(new zzczb(zzfloVar2, zzfldVar2, null), new zzdrc(zzdqrVar), new zzdpn(jSONObject2, zzdvvVar, zzbVar82, zzcefVar));
                    if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                        long a4 = zzt.zzk().a();
                        zzeae zzeaeVar4 = zzepcVar.f;
                        zzeaeVar4.c(a4, "rendering-ad-component-creation-end");
                        zzeaeVar4.c(a4, "rendering-configure-webview-start");
                    }
                    zzinv zzinvVar = c.e;
                    zzdpn zzdpnVar = c.b;
                    zzdrc zzdrcVar = c.a;
                    zzdrb zzdrbVar = c.c.a.a;
                    zzioe.a(zzdrbVar);
                    zzdqr zzdqrVar2 = zzdrcVar.a;
                    zzioe.a(zzdqrVar2);
                    zzdvv zzdvvVar2 = zzdpnVar.b;
                    zzioe.a(zzdvvVar2);
                    zzdvi zzdviVar = new zzdvi(zzdrbVar, zzdqrVar2, zzdvvVar2, zzinv.b(zzinvVar));
                    if (zzdviVar.a != null) {
                        zzdviVar.b.b("/nativeAdCustomClick", zzdviVar);
                    }
                    zzdvq zzdvqVar = (zzdvq) c.f.zzb();
                    zzdew zzdewVar = zzdvqVar.b;
                    zzdvj zzdvjVar = zzdvvVar.a;
                    Objects.requireNonNull(zzdewVar);
                    final int i42 = 0;
                    g1o g1oVar = new g1o(zzdewVar, 0);
                    zzddn zzddnVar = zzdvqVar.a;
                    zzdfj zzdfjVar = zzdvqVar.c;
                    zzdga zzdgaVar = zzdvqVar.d;
                    zzdit zzditVar = zzdvqVar.e;
                    synchronized (zzdvjVar) {
                        zzdvjVar.a = zzddnVar;
                        zzdvjVar.b = zzdfjVar;
                        zzdvjVar.c = zzdgaVar;
                        zzdvjVar.d = zzditVar;
                        zzdvjVar.e = g1oVar;
                    }
                    zzfld zzfldVar3 = zzdvqVar.f;
                    zzflg zzflgVar4 = zzdvqVar.g;
                    zzcub zzcubVar = zzdvqVar.h;
                    synchronized (zzdvvVar) {
                        ilo iloVar = zzdvvVar.n;
                        if (iloVar != null) {
                            qpn qpnVar = new qpn(zzdvvVar, zzfldVar3, zzflgVar4, zzcubVar, 3);
                            iloVar.addListener(new vlo(0, iloVar, qpnVar), zzdvvVar.e);
                        }
                    }
                    final zzdul zzdulVar = (zzdul) c.g.zzb();
                    zzclm h32 = zzdqrVar.h();
                    final int i52 = 1;
                    if (h32 == null) {
                        zzdulVar.getClass();
                    } else {
                        zzdlq zzdlqVar = zzdulVar.c;
                        zzdlqVar.q0(h32.zzE());
                        a1o a1oVar = new a1o(h32, 1);
                        Executor executor2 = zzdulVar.a;
                        zzdlqVar.n0(a1oVar, executor2);
                        zzdlqVar.n0(new a1o(h32, 0), executor2);
                        zzcvi zzcviVar = zzdulVar.b;
                        zzdlqVar.n0(zzcviVar, executor2);
                        zzcviVar.a = h32;
                        zzclx zzP = h32.zzP();
                        if (((Boolean) zzba.zzc().a(zzbjg.Mb)).booleanValue() && zzP != null) {
                            zzcub zzcubVar2 = zzdulVar.d;
                            zzP.j("/click");
                            zzdlw zzdlwVar = zzP.k;
                            mon monVar = zzbqg.a;
                            zzP.h("/click", new qon(i42, zzdlwVar, zzcubVar2));
                            zzP.l0(zzcubVar2, null, null);
                        }
                        h32.T("/trackActiveViewUnit", new zzbqh() { // from class: b1o
                            @Override // com.google.android.gms.internal.ads.zzbqh
                            public final void a(Object obj, Map map) {
                                int i62 = i42;
                                zzdul zzdulVar2 = zzdulVar;
                                switch (i62) {
                                    case 0:
                                        zzcvi zzcviVar2 = zzdulVar2.b;
                                        zzcviVar2.e = true;
                                        zzcviVar2.c();
                                        break;
                                    default:
                                        zzdulVar2.b.e = false;
                                        break;
                                }
                            }
                        });
                        h32.T("/untrackActiveViewUnit", new zzbqh() { // from class: b1o
                            @Override // com.google.android.gms.internal.ads.zzbqh
                            public final void a(Object obj, Map map) {
                                int i62 = i52;
                                zzdul zzdulVar2 = zzdulVar;
                                switch (i62) {
                                    case 0:
                                        zzcvi zzcviVar2 = zzdulVar2.b;
                                        zzcviVar2.e = true;
                                        zzcviVar2.c();
                                        break;
                                    default:
                                        zzdulVar2.b.e = false;
                                        break;
                                }
                            }
                        });
                        h32.zzP().A = zzdulVar.e;
                    }
                    zzdwa zzdwaVar = (zzdwa) c.h.zzb();
                    zzdwb zzdwbVar = zzepcVar.e;
                    zzclm i62 = zzdqrVar.i();
                    zzdwaVar.getClass();
                    zzdvy zzdvyVar = zzdwbVar.a;
                    zzdew zzdewVar2 = zzdwaVar.b;
                    Objects.requireNonNull(zzdewVar2);
                    g1o g1oVar2 = new g1o(zzdewVar2, 1);
                    zzddn zzddnVar2 = zzdwaVar.a;
                    zzdfj zzdfjVar2 = zzdwaVar.c;
                    zzdga zzdgaVar2 = zzdwaVar.d;
                    zzdit zzditVar2 = zzdwaVar.e;
                    zzdlu zzdluVar = zzdwaVar.f;
                    synchronized (zzdvyVar) {
                        synchronized (zzdvyVar) {
                            zzdvyVar.a = zzddnVar2;
                            zzdvyVar.b = zzdfjVar2;
                            zzdvyVar.c = zzdgaVar2;
                            zzdvyVar.d = zzditVar2;
                            zzdvyVar.e = g1oVar2;
                        }
                        if (((Boolean) zzba.zzc().a(zzbjg.Nb)).booleanValue() && i62 != null && i62.zzP() != null) {
                            zzclx zzP222 = i62.zzP();
                            zzcub zzcubVar322 = zzdwaVar.j;
                            zzele zzeleVar22 = zzdwaVar.i;
                            zzP222.i0(zzcubVar322, zzeleVar22, zzdwaVar.h);
                            zzP222.l0(zzcubVar322, zzeleVar22, zzdwaVar.g);
                        }
                        if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                            x5n.q("rendering-configure-webview-end", zzepcVar.f);
                        }
                        return (zzdqm) c.d.zzb();
                    }
                    zzdvyVar.f = zzdluVar;
                    if (((Boolean) zzba.zzc().a(zzbjg.Nb)).booleanValue()) {
                        zzclx zzP2222 = i62.zzP();
                        zzcub zzcubVar3222 = zzdwaVar.j;
                        zzele zzeleVar222 = zzdwaVar.i;
                        zzP2222.i0(zzcubVar3222, zzeleVar222, zzdwaVar.h);
                        zzP2222.l0(zzcubVar3222, zzeleVar222, zzdwaVar.g);
                    }
                    if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                    }
                    return (zzdqm) c.d.zzb();
                }
            });
        }
        xloVar = xloVar7;
        zzdtlVar = zzdtlVar2;
        zzeaeVar = zzeaeVar3;
        str = "images";
        zzbVar2 = zzbVar6;
        zzceaVar2 = zzceaVar;
        zzduaVar = zzduaVar4;
        str2 = "html";
        ddbVar = b;
        ddbVar2 = submit;
        hsnVar = hsnVar3;
        zzflgVar = zzflgVar3;
        final zzdtl r9222 = zzdtlVar;
        r9222.a(xloVar, zzdzs.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        ddb b2222 = zzduaVar.b(jSONObject.optJSONObject("secondary_image"), zzbmkVar.b, zzdzs.NATIVE_ASSETS_LOADING_LOGO_START);
        r9222.a(b2222, zzdzs.NATIVE_ASSETS_LOADING_LOGO_END);
        ddb b3222 = zzduaVar.b(jSONObject.optJSONObject("app_icon"), zzbmkVar.b, zzdzs.NATIVE_ASSETS_LOADING_ICON_START);
        r9222.a(b3222, zzdzs.NATIVE_ASSETS_LOADING_ICON_END);
        optJSONObject = jSONObject.optJSONObject(V3.c);
        if (optJSONObject != null) {
        }
        r9222.a(e, zzdzs.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        zzi = zzbp.zzi(jSONObject, "html_containers", "instream");
        if (zzi != null) {
        }
        r9222.a(xloVar3, zzdzs.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Oe)).booleanValue()) {
        }
        ddbVar3 = b3222;
        zzeaeVar2 = zzeaeVar;
        xloVar4 = zzhcy.a(new Bundle());
        zzduf zzdufVar2222 = r9222.c;
        hsn hsnVar4222 = zzdufVar2222.a;
        optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray != null) {
        }
        final ddb ddbVar6222 = i2;
        r9222.a(ddbVar6222, zzdzs.NATIVE_ASSETS_LOADING_CUSTOM_END);
        if (jSONObject.optBoolean("enable_omid")) {
        }
        r9222.a(h, zzdzs.NATIVE_ASSETS_LOADING_OMID_END);
        ArrayList arrayList322 = new ArrayList();
        final ddb ddbVar7222 = ddbVar2;
        arrayList322.add(ddbVar7222);
        arrayList322.add(a2);
        arrayList322.add(xloVar);
        final ddb ddbVar8222 = ddbVar4;
        arrayList322.add(ddbVar8222);
        final ddb ddbVar9222 = ddbVar3;
        arrayList322.add(ddbVar9222);
        final ddb xloVar8222 = xloVar2;
        arrayList322.add(xloVar8222);
        final ddb xloVar9222 = xloVar6;
        arrayList322.add(xloVar9222);
        final ddb xloVar10222 = xloVar5;
        arrayList322.add(xloVar10222);
        arrayList322.add(ddbVar6222);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x6)).booleanValue()) {
        }
        arrayList322.add(h);
        zzhcx zzhcxVar222 = new zzhcx(zzgxm.x(arrayList322), false);
        final zzcea zzceaVar5222 = zzceaVar3;
        final com.google.android.gms.ads.internal.zzb zzbVar7222 = zzbVar4;
        final ddb ddbVar10222 = h;
        final rlo a3222 = zzhcxVar222.a(zzhdiVar, new Callable() { // from class: q0o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list;
                JSONObject optJSONObject32;
                zzdtl zzdtlVar3 = zzdtl.this;
                ddb ddbVar11222 = ddbVar7222;
                ddb ddbVar12 = a2;
                ddb ddbVar13 = ddbVar9222;
                ddb ddbVar14 = ddbVar8222;
                ddb ddbVar15 = xloVar8222;
                JSONObject jSONObject2 = jSONObject;
                ddb ddbVar16 = xloVar9222;
                ddb ddbVar17 = xloVar10222;
                ddb ddbVar18 = xloVar;
                ddb ddbVar19 = ddbVar10222;
                ddb ddbVar20 = ddbVar6222;
                if (((Boolean) zzba.zzc().a(zzbjg.U2)).booleanValue()) {
                    x5n.q("rendering-native-assets-loading-end", zzdtlVar3.d);
                }
                zzdqr zzdqrVar = (zzdqr) ddbVar11222.get();
                List list2 = (List) ddbVar12.get();
                synchronized (zzdqrVar) {
                    zzdqrVar.e = list2;
                }
                zzbmv zzbmvVar = (zzbmv) ddbVar13.get();
                synchronized (zzdqrVar) {
                    zzdqrVar.s = zzbmvVar;
                }
                zzbmv zzbmvVar2 = (zzbmv) ddbVar14.get();
                synchronized (zzdqrVar) {
                    zzdqrVar.t = zzbmvVar2;
                }
                zzbmo zzbmoVar = (zzbmo) ddbVar15.get();
                synchronized (zzdqrVar) {
                    zzdqrVar.c = zzbmoVar;
                }
                JSONObject optJSONObject42 = jSONObject2.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                if (optJSONObject42 == null) {
                    mio mioVar = zzgxm.b;
                    list = s.e;
                } else {
                    JSONArray optJSONArray42 = optJSONObject42.optJSONArray("reasons");
                    if (optJSONArray42 == null || optJSONArray42.length() <= 0) {
                        mio mioVar2 = zzgxm.b;
                        list = s.e;
                    } else {
                        ArrayList arrayList22 = new ArrayList();
                        for (int i42 = 0; i42 < optJSONArray42.length(); i42++) {
                            zzew f = zzdua.f(optJSONArray42.optJSONObject(i42));
                            if (f != null) {
                                arrayList22.add(f);
                            }
                        }
                        list = zzgxm.x(arrayList22);
                    }
                }
                synchronized (zzdqrVar) {
                    zzdqrVar.f = list;
                }
                JSONObject optJSONObject52 = jSONObject2.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                zzew f2 = (optJSONObject52 == null || (optJSONObject32 = optJSONObject52.optJSONObject("default_reason")) == null) ? null : zzdua.f(optJSONObject32);
                synchronized (zzdqrVar) {
                    zzdqrVar.g = f2;
                }
                zzclm zzclmVar = (zzclm) ddbVar16.get();
                if (zzclmVar != null) {
                    synchronized (zzdqrVar) {
                        zzdqrVar.i = zzclmVar;
                    }
                    View zzE = zzclmVar.zzE();
                    synchronized (zzdqrVar) {
                        zzdqrVar.o = zzE;
                    }
                    zzcms zzh = zzclmVar.zzh();
                    synchronized (zzdqrVar) {
                        zzdqrVar.b = zzh;
                    }
                }
                zzdqrVar.d().putAll((Bundle) ddbVar17.get());
                zzclm zzclmVar2 = (zzclm) ddbVar18.get();
                if (zzclmVar2 != null) {
                    synchronized (zzdqrVar) {
                        zzdqrVar.j = zzclmVar2;
                    }
                    View zzE2 = zzclmVar2.zzE();
                    synchronized (zzdqrVar) {
                        zzdqrVar.p = zzE2;
                    }
                }
                if (!((Boolean) zzba.zzc().a(zzbjg.x6)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                    zzclm zzclmVar3 = (zzclm) ddbVar19.get();
                    if (zzclmVar3 != null) {
                        synchronized (zzdqrVar) {
                            zzdqrVar.k = zzclmVar3;
                        }
                    }
                } else {
                    synchronized (zzdqrVar) {
                        zzdqrVar.m = ddbVar19;
                    }
                    zzcgo zzcgoVar2 = new zzcgo();
                    synchronized (zzdqrVar) {
                        zzdqrVar.n = zzcgoVar2;
                    }
                }
                for (zzduc zzducVar : (List) ddbVar20.get()) {
                    int i52 = zzducVar.a;
                    String str82 = zzducVar.b;
                    if (i52 != 1) {
                        zzbmg zzbmgVar = zzducVar.d;
                        synchronized (zzdqrVar) {
                            fhh fhhVar = zzdqrVar.v;
                            if (zzbmgVar == null) {
                                fhhVar.remove(str82);
                            } else {
                                fhhVar.put(str82, zzbmgVar);
                            }
                        }
                    } else {
                        zzdqrVar.o(str82, zzducVar.c);
                    }
                }
                return zzdqrVar;
            }
        });
        final ddb ddbVar11222 = ddbVar;
        return new zzhcx(zzgxm.y(new ddb[]{ddbVar, a3222}), true).a(this.b, new Callable() { // from class: l5o
            /* JADX WARN: Removed duplicated region for block: B:41:0x01d7  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object call() {
                zzepc zzepcVar = zzepc.this;
                rlo rloVar = a3222;
                ddb ddbVar12 = ddbVar11222;
                zzflo zzfloVar2 = zzfloVar;
                zzfld zzfldVar2 = zzfldVar;
                JSONObject jSONObject2 = jSONObject;
                zzb zzbVar82 = zzbVar7222;
                zzcef zzcefVar = zzceaVar5222;
                zzdqr zzdqrVar = (zzdqr) rloVar.get();
                zzdvv zzdvvVar = (zzdvv) ddbVar12.get();
                inn innVar = zzbjg.V2;
                if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                    x5n.q("rendering-webview-creation-end", zzepcVar.f);
                }
                cvn c = zzepcVar.a.c(new zzczb(zzfloVar2, zzfldVar2, null), new zzdrc(zzdqrVar), new zzdpn(jSONObject2, zzdvvVar, zzbVar82, zzcefVar));
                if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                    long a4 = zzt.zzk().a();
                    zzeae zzeaeVar4 = zzepcVar.f;
                    zzeaeVar4.c(a4, "rendering-ad-component-creation-end");
                    zzeaeVar4.c(a4, "rendering-configure-webview-start");
                }
                zzinv zzinvVar = c.e;
                zzdpn zzdpnVar = c.b;
                zzdrc zzdrcVar = c.a;
                zzdrb zzdrbVar = c.c.a.a;
                zzioe.a(zzdrbVar);
                zzdqr zzdqrVar2 = zzdrcVar.a;
                zzioe.a(zzdqrVar2);
                zzdvv zzdvvVar2 = zzdpnVar.b;
                zzioe.a(zzdvvVar2);
                zzdvi zzdviVar = new zzdvi(zzdrbVar, zzdqrVar2, zzdvvVar2, zzinv.b(zzinvVar));
                if (zzdviVar.a != null) {
                    zzdviVar.b.b("/nativeAdCustomClick", zzdviVar);
                }
                zzdvq zzdvqVar = (zzdvq) c.f.zzb();
                zzdew zzdewVar = zzdvqVar.b;
                zzdvj zzdvjVar = zzdvvVar.a;
                Objects.requireNonNull(zzdewVar);
                final int i42 = 0;
                g1o g1oVar = new g1o(zzdewVar, 0);
                zzddn zzddnVar = zzdvqVar.a;
                zzdfj zzdfjVar = zzdvqVar.c;
                zzdga zzdgaVar = zzdvqVar.d;
                zzdit zzditVar = zzdvqVar.e;
                synchronized (zzdvjVar) {
                    zzdvjVar.a = zzddnVar;
                    zzdvjVar.b = zzdfjVar;
                    zzdvjVar.c = zzdgaVar;
                    zzdvjVar.d = zzditVar;
                    zzdvjVar.e = g1oVar;
                }
                zzfld zzfldVar3 = zzdvqVar.f;
                zzflg zzflgVar4 = zzdvqVar.g;
                zzcub zzcubVar = zzdvqVar.h;
                synchronized (zzdvvVar) {
                    ilo iloVar = zzdvvVar.n;
                    if (iloVar != null) {
                        qpn qpnVar = new qpn(zzdvvVar, zzfldVar3, zzflgVar4, zzcubVar, 3);
                        iloVar.addListener(new vlo(0, iloVar, qpnVar), zzdvvVar.e);
                    }
                }
                final zzdul zzdulVar = (zzdul) c.g.zzb();
                zzclm h32 = zzdqrVar.h();
                final int i52 = 1;
                if (h32 == null) {
                    zzdulVar.getClass();
                } else {
                    zzdlq zzdlqVar = zzdulVar.c;
                    zzdlqVar.q0(h32.zzE());
                    a1o a1oVar = new a1o(h32, 1);
                    Executor executor2 = zzdulVar.a;
                    zzdlqVar.n0(a1oVar, executor2);
                    zzdlqVar.n0(new a1o(h32, 0), executor2);
                    zzcvi zzcviVar = zzdulVar.b;
                    zzdlqVar.n0(zzcviVar, executor2);
                    zzcviVar.a = h32;
                    zzclx zzP = h32.zzP();
                    if (((Boolean) zzba.zzc().a(zzbjg.Mb)).booleanValue() && zzP != null) {
                        zzcub zzcubVar2 = zzdulVar.d;
                        zzP.j("/click");
                        zzdlw zzdlwVar = zzP.k;
                        mon monVar = zzbqg.a;
                        zzP.h("/click", new qon(i42, zzdlwVar, zzcubVar2));
                        zzP.l0(zzcubVar2, null, null);
                    }
                    h32.T("/trackActiveViewUnit", new zzbqh() { // from class: b1o
                        @Override // com.google.android.gms.internal.ads.zzbqh
                        public final void a(Object obj, Map map) {
                            int i62 = i42;
                            zzdul zzdulVar2 = zzdulVar;
                            switch (i62) {
                                case 0:
                                    zzcvi zzcviVar2 = zzdulVar2.b;
                                    zzcviVar2.e = true;
                                    zzcviVar2.c();
                                    break;
                                default:
                                    zzdulVar2.b.e = false;
                                    break;
                            }
                        }
                    });
                    h32.T("/untrackActiveViewUnit", new zzbqh() { // from class: b1o
                        @Override // com.google.android.gms.internal.ads.zzbqh
                        public final void a(Object obj, Map map) {
                            int i62 = i52;
                            zzdul zzdulVar2 = zzdulVar;
                            switch (i62) {
                                case 0:
                                    zzcvi zzcviVar2 = zzdulVar2.b;
                                    zzcviVar2.e = true;
                                    zzcviVar2.c();
                                    break;
                                default:
                                    zzdulVar2.b.e = false;
                                    break;
                            }
                        }
                    });
                    h32.zzP().A = zzdulVar.e;
                }
                zzdwa zzdwaVar = (zzdwa) c.h.zzb();
                zzdwb zzdwbVar = zzepcVar.e;
                zzclm i62 = zzdqrVar.i();
                zzdwaVar.getClass();
                zzdvy zzdvyVar = zzdwbVar.a;
                zzdew zzdewVar2 = zzdwaVar.b;
                Objects.requireNonNull(zzdewVar2);
                g1o g1oVar2 = new g1o(zzdewVar2, 1);
                zzddn zzddnVar2 = zzdwaVar.a;
                zzdfj zzdfjVar2 = zzdwaVar.c;
                zzdga zzdgaVar2 = zzdwaVar.d;
                zzdit zzditVar2 = zzdwaVar.e;
                zzdlu zzdluVar = zzdwaVar.f;
                synchronized (zzdvyVar) {
                    synchronized (zzdvyVar) {
                        zzdvyVar.a = zzddnVar2;
                        zzdvyVar.b = zzdfjVar2;
                        zzdvyVar.c = zzdgaVar2;
                        zzdvyVar.d = zzditVar2;
                        zzdvyVar.e = g1oVar2;
                    }
                    if (((Boolean) zzba.zzc().a(zzbjg.Nb)).booleanValue() && i62 != null && i62.zzP() != null) {
                        zzclx zzP2222 = i62.zzP();
                        zzcub zzcubVar3222 = zzdwaVar.j;
                        zzele zzeleVar222 = zzdwaVar.i;
                        zzP2222.i0(zzcubVar3222, zzeleVar222, zzdwaVar.h);
                        zzP2222.l0(zzcubVar3222, zzeleVar222, zzdwaVar.g);
                    }
                    if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                        x5n.q("rendering-configure-webview-end", zzepcVar.f);
                    }
                    return (zzdqm) c.d.zzb();
                }
                zzdvyVar.f = zzdluVar;
                if (((Boolean) zzba.zzc().a(zzbjg.Nb)).booleanValue()) {
                    zzclx zzP22222 = i62.zzP();
                    zzcub zzcubVar32222 = zzdwaVar.j;
                    zzele zzeleVar2222 = zzdwaVar.i;
                    zzP22222.i0(zzcubVar32222, zzeleVar2222, zzdwaVar.h);
                    zzP22222.l0(zzcubVar32222, zzeleVar2222, zzdwaVar.g);
                }
                if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                }
                return (zzdqm) c.d.zzb();
            }
        });
    }
}
