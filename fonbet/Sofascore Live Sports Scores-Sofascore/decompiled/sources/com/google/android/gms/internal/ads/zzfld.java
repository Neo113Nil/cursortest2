package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.JsonReader;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.ads.internal.util.zzbp;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.mio;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfld {
    public final zzcec A;
    public final List A0;
    public final String B;
    public final boolean B0;
    public final JSONObject C;
    public final s C0;
    public final JSONObject D;
    public final boolean D0;
    public final String E;
    public final int E0;
    public final String F;
    public final Bundle F0;
    public final String G;
    public final boolean G0;
    public final String H;
    public final JSONArray H0;
    public final String I;
    public final int I0;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final int Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public final String U;
    public final zzflz V;
    public final boolean W;
    public final boolean X;
    public final int Y;
    public final String Z;
    public final List a;
    public final int a0;
    public final int b;
    public final String b0;
    public final List c;
    public final boolean c0;
    public final List d;
    public final zzbzz d0;
    public final int e;
    public final com.google.android.gms.ads.internal.client.zzt e0;
    public final List f;
    public final String f0;
    public final List g;
    public final boolean g0;
    public final List h;
    public final JSONObject h0;
    public final List i;
    public final boolean i0;
    public final String j;
    public final JSONObject j0;
    public final String k;
    public final boolean k0;
    public final zzcct l;
    public final String l0;
    public final List m;
    public final boolean m0;
    public final List n;
    public final String n0;
    public final List o;
    public final String o0;
    public final List p;
    public final String p0;
    public final int q;
    public final boolean q0;
    public final List r;
    public final boolean r0;
    public final zzfli s;
    public final int s0;
    public final List t;
    public final String t0;
    public final List u;
    public final List u0;
    public final JSONObject v;
    public final boolean v0;
    public final String w;
    public final Map w0;
    public final String x;
    public final com.google.android.gms.ads.internal.util.client.zzv x0;
    public final String y;
    public final com.google.android.gms.ads.internal.util.client.zzw y0;
    public final String z;
    public final double z0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v131, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v58, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.util.List] */
    public zzfld(JsonReader jsonReader) {
        List list;
        List list2;
        List list3;
        int i;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        String str;
        zzebn zzebnVar;
        List list9 = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        mio mioVar = zzgxm.b;
        s sVar = s.e;
        HashMap hashMap = new HashMap();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        int i2 = 1;
        List list10 = list9;
        List list11 = list10;
        List list12 = list11;
        List list13 = list12;
        JSONObject jSONObject7 = jSONObject;
        JSONObject jSONObject8 = jSONObject2;
        JSONObject jSONObject9 = jSONObject3;
        JSONObject jSONObject10 = jSONObject4;
        JSONObject jSONObject11 = jSONObject5;
        JSONObject jSONObject12 = jSONObject6;
        s sVar2 = sVar;
        s sVar3 = sVar2;
        s sVar4 = sVar3;
        HashMap hashMap2 = hashMap;
        Bundle bundle2 = bundle;
        boolean z = true;
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        String str17 = str16;
        String str18 = str17;
        String str19 = str18;
        String str20 = str19;
        String str21 = str20;
        double d = 0.0d;
        int i3 = 0;
        int i4 = 0;
        zzcct zzcctVar = null;
        int i5 = 0;
        zzfli zzfliVar = null;
        zzcec zzcecVar = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int i6 = -1;
        int i7 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        int i8 = 0;
        int i9 = -1;
        boolean z12 = false;
        zzbzz zzbzzVar = null;
        com.google.android.gms.ads.internal.client.zzt zztVar = null;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        String str22 = null;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        int i10 = 0;
        boolean z20 = false;
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = null;
        com.google.android.gms.ads.internal.util.client.zzw zzwVar = null;
        int i11 = 2;
        boolean z21 = false;
        boolean z22 = false;
        int i12 = -1;
        JSONArray jSONArray = null;
        List list14 = list13;
        List list15 = list14;
        List list16 = list15;
        List list17 = list16;
        List list18 = list17;
        List list19 = list18;
        List list20 = list19;
        List list21 = list20;
        List list22 = list21;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str23 = nextName == null ? "" : nextName;
            String str24 = "id";
            switch (str23.hashCode()) {
                case -2138196627:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    i = i2;
                    String str25 = str23;
                    list4 = list21;
                    if (str25.equals("ad_source_instance_name")) {
                        str16 = jsonReader.nextString();
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1980587809:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    i = i2;
                    String str26 = str23;
                    list4 = list21;
                    if (str26.equals("debug_signals")) {
                        jSONObject8 = zzbp.zzd(jsonReader);
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1965512151:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    i = i2;
                    String str27 = str23;
                    list4 = list21;
                    if (str27.equals("omid_settings")) {
                        jSONObject10 = zzbp.zzd(jsonReader);
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1964744830:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    i = i2;
                    String str28 = str23;
                    list4 = list21;
                    if (str28.equals("offline_ad_config")) {
                        if (((Boolean) zzbjg.X9.f()).booleanValue()) {
                            zzwVar = com.google.android.gms.ads.internal.util.client.zzw.zzd(zzbp.zzd(jsonReader));
                        } else {
                            jsonReader.skipValue();
                        }
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1871425831:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    i = i2;
                    String str29 = str23;
                    list4 = list21;
                    if (str29.equals("recursive_server_response_data")) {
                        str19 = jsonReader.nextString();
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1843156475:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    i = i2;
                    String str30 = str23;
                    list4 = list21;
                    if (str30.equals("is_consent")) {
                        z19 = jsonReader.nextBoolean();
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1840512279:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    i = i2;
                    String str31 = str23;
                    list4 = list21;
                    if (str31.equals("presentation_urls")) {
                        sVar3 = zzbp.zzb(jsonReader);
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1828733410:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    i = i2;
                    String str32 = str23;
                    list4 = list21;
                    if (str32.equals("network_ping_config")) {
                        if (((Boolean) zzbjg.V9.f()).booleanValue()) {
                            zzvVar = com.google.android.gms.ads.internal.util.client.zzv.zzb(zzbp.zzd(jsonReader));
                        } else {
                            jsonReader.skipValue();
                        }
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1812055556:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    i = i2;
                    String str33 = str23;
                    list4 = list21;
                    if (str33.equals("play_prewarm_options")) {
                        JSONObject zzd = zzbp.zzd(jsonReader);
                        zzbzz zzbzzVar2 = new zzbzz(zzd.optBoolean("enable_prewarming", false), zzd.optString("prefetch_url", ""), zzd.optBoolean("skip_offline_notification_flow", false), zzd.optBoolean("enable_hsdp_service", false), zzd.optString("target_package", ""), zzd.optInt("hsdp_invocation_callback_bitmask", 0), zzd.optString(Payload.RFR, ""), zzd.optString("extra_query_params", "{}"));
                        list22 = list3;
                        list19 = list;
                        zzbzzVar = zzbzzVar2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1785028569:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    i = i2;
                    String str34 = str23;
                    list4 = list21;
                    if (str34.equals("parallel_key")) {
                        str21 = jsonReader.nextString();
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1776946669:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    i = i2;
                    String str35 = str23;
                    list4 = list21;
                    if (str35.equals("ad_source_name")) {
                        str14 = jsonReader.nextString();
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1662989631:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    i = i2;
                    String str36 = str23;
                    list4 = list21;
                    if (str36.equals("is_interscroller")) {
                        z13 = jsonReader.nextBoolean();
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1620552059:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str37 = str23;
                    list4 = list21;
                    if (str37.equals("preload_sort_type")) {
                        int nextInt = jsonReader.nextInt();
                        i = 1;
                        int[] iArr = {1, 2, 3};
                        int i13 = 0;
                        while (true) {
                            if (i13 < 3) {
                                int i14 = iArr[i13];
                                int i15 = i14 - 1;
                                if (i14 == 0) {
                                    throw null;
                                }
                                if (i15 == nextInt) {
                                    i11 = i14;
                                } else {
                                    i13++;
                                }
                            } else {
                                i11 = 2;
                            }
                        }
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    } else {
                        i = 1;
                        jsonReader.skipValue();
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                case -1620470467:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str38 = str23;
                    list4 = list21;
                    if (str38.equals("backend_query_id")) {
                        str11 = jsonReader.nextString();
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1550155393:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str39 = str23;
                    list4 = list21;
                    if (str39.equals("nofill_urls")) {
                        list4 = zzbp.zzb(jsonReader);
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1440104884:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str40 = str23;
                    list4 = list21;
                    if (str40.equals("is_custom_close_blocked")) {
                        z7 = jsonReader.nextBoolean();
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1439500848:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str41 = str23;
                    list4 = list21;
                    if (str41.equals(U3.i.n)) {
                        String nextString = jsonReader.nextString();
                        i6 = U3.i.C.equalsIgnoreCase(nextString) ? 6 : U3.i.D.equalsIgnoreCase(nextString) ? 7 : -1;
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1428969291:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str42 = str23;
                    list4 = list21;
                    if (str42.equals("enable_omid")) {
                        z9 = jsonReader.nextBoolean();
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1406227629:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str43 = str23;
                    list4 = list21;
                    if (str43.equals("buffer_click_url_as_ready_to_ping")) {
                        z17 = jsonReader.nextBoolean();
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1403779768:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str44 = str23;
                    list4 = list21;
                    if (str44.equals("showable_impression_type")) {
                        i8 = jsonReader.nextInt();
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1375413093:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str45 = str23;
                    list4 = list21;
                    if (str45.equals("ad_cover")) {
                        jSONObject11 = zzbp.zzd(jsonReader);
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1360811658:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str46 = str23;
                    list4 = list21;
                    if (str46.equals("ad_sizes")) {
                        list13 = zzfle.a(jsonReader);
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1306015996:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str47 = str23;
                    list4 = list21;
                    if (str47.equals("adapters")) {
                        list12 = zzbp.zzb(jsonReader);
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1303332046:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str48 = str23;
                    list4 = list21;
                    if (str48.equals("test_mode_enabled")) {
                        z6 = jsonReader.nextBoolean();
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1289032093:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str49 = str23;
                    list4 = list21;
                    if (str49.equals(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
                        jSONObject9 = zzbp.zzd(jsonReader);
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1240082064:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str50 = str23;
                    list4 = list21;
                    if (str50.equals("ad_event_value")) {
                        zztVar = com.google.android.gms.ads.internal.client.zzt.zza(zzbp.zzd(jsonReader));
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1234181075:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str51 = str23;
                    list4 = list21;
                    if (str51.equals("allow_pub_rendered_attribution")) {
                        z2 = jsonReader.nextBoolean();
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1168140544:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str52 = str23;
                    list4 = list21;
                    if (str52.equals("presentation_error_urls")) {
                        list22 = zzbp.zzb(jsonReader);
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1152230954:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str53 = str23;
                    list4 = list21;
                    if (str53.equals("ad_type")) {
                        String nextString2 = jsonReader.nextString();
                        i3 = "banner".equals(nextString2) ? 1 : "interstitial".equals(nextString2) ? 2 : "native_express".equals(nextString2) ? 3 : IronSourceConstants.EVENTS_NATIVE.equals(nextString2) ? 4 : "rewarded".equals(nextString2) ? 5 : "app_open_ad".equals(nextString2) ? 6 : "rewarded_interstitial".equals(nextString2) ? 7 : 0;
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1146534047:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str54 = str23;
                    list4 = list21;
                    if (str54.equals("is_scroll_aware")) {
                        z11 = jsonReader.nextBoolean();
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1115838944:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str55 = str23;
                    list4 = list21;
                    if (str55.equals("fill_urls")) {
                        list2 = zzbp.zzb(jsonReader);
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1081936678:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str56 = str23;
                    list4 = list21;
                    if (str56.equals("allocation_id")) {
                        str4 = jsonReader.nextString();
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1078050970:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str57 = str23;
                    list4 = list21;
                    if (str57.equals("video_complete_urls")) {
                        list19 = zzbp.zzb(jsonReader);
                        list22 = list3;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -1051269058:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str58 = str23;
                    list4 = list21;
                    if (str58.equals("active_view")) {
                        str7 = zzbp.zzd(jsonReader).toString();
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -982608540:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str59 = str23;
                    list4 = list21;
                    if (str59.equals("valid_from_timestamp")) {
                        str3 = jsonReader.nextString();
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -972056451:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str60 = str23;
                    list4 = list21;
                    if (str60.equals("ad_source_instance_id")) {
                        str17 = jsonReader.nextString();
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -776859333:
                    list = list19;
                    list2 = list20;
                    list3 = list22;
                    String str61 = str23;
                    list4 = list21;
                    if (str61.equals("click_urls")) {
                        list14 = zzbp.zzb(jsonReader);
                        list22 = list3;
                        list19 = list;
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -652881372:
                    JsonReader jsonReader2 = jsonReader;
                    if (str23.equals("on_device_storage_configs")) {
                        if (((Boolean) zzbjg.Q8.f()).booleanValue()) {
                            mio mioVar2 = zzgxm.b;
                            zzgxj zzgxjVar = new zzgxj();
                            jsonReader2.beginArray();
                            while (jsonReader2.hasNext()) {
                                s sVar5 = s.e;
                                jsonReader2.beginObject();
                                s sVar6 = sVar5;
                                Long l = null;
                                while (jsonReader2.hasNext()) {
                                    Long l2 = l;
                                    String nextName2 = jsonReader2.nextName();
                                    if (Objects.equals(nextName2, str24)) {
                                        l = Long.valueOf(jsonReader2.nextLong());
                                    } else {
                                        if (Objects.equals(nextName2, "event_types")) {
                                            zzgxj zzgxjVar2 = new zzgxj();
                                            jsonReader.beginArray();
                                            while (jsonReader.hasNext()) {
                                                zzgxjVar2.c(Integer.valueOf(jsonReader.nextInt()));
                                            }
                                            jsonReader.endArray();
                                            sVar6 = zzgxjVar2.f();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                        jsonReader2 = jsonReader;
                                        l = l2;
                                    }
                                }
                                Long l3 = l;
                                jsonReader.endObject();
                                if (l3 == null || sVar6.isEmpty()) {
                                    list5 = list19;
                                    list6 = list20;
                                    list7 = list21;
                                    list8 = list22;
                                    str = str24;
                                    zzebnVar = null;
                                } else {
                                    str = str24;
                                    long longValue = l3.longValue();
                                    list8 = list22;
                                    s sVar7 = sVar6;
                                    list7 = list21;
                                    int i16 = sVar7.d;
                                    list6 = list20;
                                    int[] iArr2 = new int[i16];
                                    list5 = list19;
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        iArr2[i17] = ((Integer) sVar7.get(i17)).intValue();
                                    }
                                    zzebnVar = new zzebn(longValue, iArr2);
                                }
                                if (zzebnVar != null) {
                                    zzgxjVar.c(zzebnVar);
                                }
                                jsonReader2 = jsonReader;
                                list21 = list7;
                                str24 = str;
                                list22 = list8;
                                list20 = list6;
                                list19 = list5;
                            }
                            list = list19;
                            list2 = list20;
                            list4 = list21;
                            jsonReader.endArray();
                            sVar4 = zzgxjVar.f();
                            list19 = list;
                            i = 1;
                            i2 = i;
                            list21 = list4;
                            list20 = list2;
                        } else {
                            list = list19;
                            list2 = list20;
                            list4 = list21;
                            list3 = list22;
                            jsonReader.skipValue();
                            i = 1;
                            list22 = list3;
                            list19 = list;
                            i2 = i;
                            list21 = list4;
                            list20 = list2;
                        }
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                    break;
                case -570101180:
                    if (str23.equals("late_load_urls")) {
                        list2 = list20;
                        list4 = list21;
                        sVar2 = zzbp.zzb(jsonReader);
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = 1;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -544216775:
                    if (str23.equals("safe_browsing")) {
                        JSONObject zzd2 = zzbp.zzd(jsonReader);
                        Parcelable.Creator<zzcec> creator = zzcec.CREATOR;
                        list2 = list20;
                        list4 = list21;
                        zzcecVar = new zzcec(zzd2.optString("click_string", ""), zzd2.optString("report_url", ""), zzd2.optBoolean("rendered_ad_enabled", false), zzd2.optBoolean("non_malicious_reporting_enabled", false), zzbp.zza(zzd2.optJSONArray("allowed_headers"), null), zzd2.optBoolean("protection_enabled", false), zzd2.optBoolean("malicious_reporting_enabled", false), zzbp.zza(zzd2.optJSONArray("webview_permissions"), null));
                        i = 1;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -437057161:
                    if (str23.equals("imp_urls")) {
                        list15 = zzbp.zzb(jsonReader);
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -404433734:
                    if (str23.equals("rtb_native_required_assets")) {
                        list2 = list20;
                        list4 = list21;
                        jSONObject12 = zzbp.zzd(jsonReader);
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -404326515:
                    if (str23.equals("render_timeout_ms")) {
                        i7 = jsonReader.nextInt();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -397704715:
                    if (str23.equals("ad_close_time_ms")) {
                        i9 = jsonReader.nextInt();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -388807511:
                    if (str23.equals("content_url")) {
                        str22 = jsonReader.nextString();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -369773488:
                    if (str23.equals("is_close_button_enabled")) {
                        jsonReader.nextBoolean();
                        list = list19;
                        list2 = list20;
                        list4 = list21;
                        list3 = list22;
                        i = i2;
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -213449460:
                    if (str23.equals("force_disable_hardware_acceleration")) {
                        z16 = jsonReader.nextBoolean();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -213424028:
                    if (str23.equals(MBridgeConstans.EXTRA_KEY_WM)) {
                        str10 = jsonReader.nextString();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -180214626:
                    if (str23.equals("native_required_asset_viewability")) {
                        z15 = jsonReader.nextBoolean();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -154616268:
                    if (str23.equals("is_offline_ad")) {
                        z14 = jsonReader.nextBoolean();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case -29338502:
                    if (str23.equals("allow_custom_click_gesture")) {
                        z4 = jsonReader.nextBoolean();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 3107:
                    if (str23.equals("ad")) {
                        list2 = list20;
                        list4 = list21;
                        zzfliVar = new zzfli(jsonReader);
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    } else {
                        list = list19;
                        list2 = list20;
                        list4 = list21;
                        list3 = list22;
                        i = i2;
                        jsonReader.skipValue();
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                case 3355:
                    if (str23.equals("id")) {
                        str5 = jsonReader.nextString();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 3076010:
                    if (str23.equals("data")) {
                        list2 = list20;
                        list4 = list21;
                        jSONObject7 = zzbp.zzd(jsonReader);
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 37109963:
                    if (str23.equals("request_id")) {
                        str18 = jsonReader.nextString();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 63195984:
                    if (str23.equals("render_test_label")) {
                        z5 = jsonReader.nextBoolean();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 107433883:
                    if (str23.equals("qdata")) {
                        str6 = jsonReader.nextString();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 230323073:
                    if (str23.equals("ad_load_urls")) {
                        list16 = zzbp.zzb(jsonReader);
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 281223176:
                    if (str23.equals("is_secondary_analytics_logging_enabled")) {
                        z = jsonReader.nextBoolean();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 418392395:
                    if (str23.equals("is_closable_area_disabled")) {
                        z8 = jsonReader.nextBoolean();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 542250332:
                    if (str23.equals("consent_form_action_identifier")) {
                        i10 = jsonReader.nextInt();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 549176928:
                    if (str23.equals("presentation_error_timeout_ms")) {
                        i5 = jsonReader.nextInt();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 597473788:
                    if (str23.equals("debug_dialog_string")) {
                        str8 = jsonReader.nextString();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 639133141:
                    if (str23.equals("response_info_extras_override")) {
                        if (((Boolean) zzbjg.R7.f()).booleanValue()) {
                            try {
                                Bundle zzl = zzbp.zzl(zzbp.zzd(jsonReader));
                                if (zzl != null) {
                                    bundle2 = zzl;
                                }
                                list2 = list20;
                                list4 = list21;
                                i = i2;
                            } catch (IllegalStateException unused) {
                                jsonReader.skipValue();
                            }
                            i2 = i;
                            list21 = list4;
                            list20 = list2;
                        } else {
                            jsonReader.skipValue();
                        }
                        list = list19;
                        list2 = list20;
                        list4 = list21;
                        list3 = list22;
                        i = i2;
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 754887508:
                    if (str23.equals("container_sizes")) {
                        list2 = list20;
                        list4 = list21;
                        list11 = zzfle.a(jsonReader);
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 791122864:
                    if (str23.equals("impression_type")) {
                        int nextInt2 = jsonReader.nextInt();
                        i4 = (nextInt2 == 0 || nextInt2 == i2 || nextInt2 == 3 || nextInt2 == 4) ? nextInt2 : 0;
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 805095541:
                    if (str23.equals("analytics_event_name_to_parameters_map")) {
                        if (((Boolean) zzbjg.T0.f()).booleanValue()) {
                            list2 = list20;
                            list4 = list21;
                            hashMap2 = zzbp.zzc(jsonReader);
                            i = i2;
                            i2 = i;
                            list21 = list4;
                            list20 = list2;
                        } else {
                            jsonReader.skipValue();
                            list = list19;
                            list2 = list20;
                            list4 = list21;
                            list3 = list22;
                            i = i2;
                            list22 = list3;
                            list19 = list;
                            i2 = i;
                            list21 = list4;
                            list20 = list2;
                        }
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1010584092:
                    if (str23.equals("transaction_id")) {
                        str2 = jsonReader.nextString();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1100650276:
                    if (str23.equals("rewards")) {
                        zzcctVar = zzcct.Y0(zzbp.zze(jsonReader));
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1141602460:
                    if (str23.equals("adapter_response_info_key")) {
                        str20 = jsonReader.nextString();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1186014765:
                    if (str23.equals("cache_hit_urls")) {
                        zzbp.zzb(jsonReader);
                        list = list19;
                        list2 = list20;
                        list4 = list21;
                        list3 = list22;
                        i = i2;
                        list22 = list3;
                        list19 = list;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1303622534:
                    if (str23.equals("preload_sort_value")) {
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        d = jsonReader.nextDouble();
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1321720943:
                    if (str23.equals("allow_pub_owned_ad_view")) {
                        z3 = jsonReader.nextBoolean();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1422388341:
                    if (str23.equals("is_collapsible")) {
                        z18 = jsonReader.nextBoolean();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1437255331:
                    if (str23.equals(CampaignEx.JSON_KEY_AD_SOURCE_ID)) {
                        str15 = jsonReader.nextString();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1556932485:
                    if (str23.equals("post_click_lifecycle_monitoring_duration_ms")) {
                        if (((Boolean) zzbjg.Ae.f()).booleanValue()) {
                            i12 = jsonReader.nextInt();
                            list2 = list20;
                            list4 = list21;
                            i = i2;
                            i2 = i;
                            list21 = list4;
                            list20 = list2;
                        } else {
                            jsonReader.skipValue();
                            list = list19;
                            list2 = list20;
                            list4 = list21;
                            list3 = list22;
                            i = i2;
                            list22 = list3;
                            list19 = list;
                            i2 = i;
                            list21 = list4;
                            list20 = list2;
                        }
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1565514205:
                    if (str23.equals("adapter_only_third_party_impression")) {
                        z22 = jsonReader.nextBoolean();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1637553475:
                    if (str23.equals("bid_response")) {
                        str9 = jsonReader.nextString();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1638957285:
                    if (str23.equals("video_start_urls")) {
                        list17 = zzbp.zzb(jsonReader);
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1686319423:
                    if (str23.equals("ad_network_class_name")) {
                        str13 = jsonReader.nextString();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1688341040:
                    if (str23.equals("video_reward_urls")) {
                        list18 = zzbp.zzb(jsonReader);
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1799285870:
                    if (str23.equals("use_third_party_container_height")) {
                        z12 = jsonReader.nextBoolean();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1839650832:
                    if (str23.equals("renderers")) {
                        list9 = zzbp.zzb(jsonReader);
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 1875425491:
                    if (str23.equals("is_analytics_logging_enabled")) {
                        z10 = jsonReader.nextBoolean();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 2004337096:
                    if (str23.equals("recursive_signal_collection")) {
                        jSONArray = zzbp.zze(jsonReader);
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 2068142375:
                    if (str23.equals("rule_line_external_id")) {
                        str12 = jsonReader.nextString();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 2072888499:
                    if (str23.equals("manual_tracking_urls")) {
                        list2 = list20;
                        list4 = list21;
                        list10 = zzbp.zzb(jsonReader);
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 2075506442:
                    if (str23.equals("render_serially")) {
                        z20 = jsonReader.nextBoolean();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                case 2117205836:
                    if (str23.equals("flow_control")) {
                        z21 = jsonReader.nextBoolean();
                        list2 = list20;
                        list4 = list21;
                        i = i2;
                        i2 = i;
                        list21 = list4;
                        list20 = list2;
                    }
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
                default:
                    list = list19;
                    list2 = list20;
                    list4 = list21;
                    list3 = list22;
                    i = i2;
                    jsonReader.skipValue();
                    list22 = list3;
                    list19 = list;
                    i2 = i;
                    list21 = list4;
                    list20 = list2;
            }
        }
        jsonReader.endObject();
        this.a = list9;
        this.b = i3;
        this.c = list14;
        this.d = list15;
        this.f = list16;
        this.e = i4;
        this.g = list17;
        this.h = list18;
        this.i = list19;
        this.j = str2;
        this.k = str3;
        this.l = zzcctVar;
        this.m = list20;
        this.n = list21;
        this.o = list22;
        this.p = list10;
        this.q = i5;
        this.r = list11;
        this.s = zzfliVar;
        this.t = list12;
        this.u = list13;
        this.w = str4;
        this.v = jSONObject7;
        this.x = str5;
        this.y = str6;
        this.z = str7;
        this.A = zzcecVar;
        this.B = str8;
        this.C = jSONObject8;
        this.D = jSONObject9;
        this.J = z2;
        this.K = z3;
        this.L = z4;
        this.M = z5;
        this.N = z6;
        this.O = z7;
        this.P = z8;
        this.Q = i6;
        this.R = i7;
        this.T = z9;
        this.U = str9;
        this.V = new zzflz(jSONObject10);
        this.W = z10;
        this.X = z11;
        this.Y = i8;
        this.Z = str10;
        this.a0 = i9;
        this.b0 = str11;
        this.c0 = z12;
        this.d0 = zzbzzVar;
        this.e0 = zztVar;
        this.f0 = str12;
        this.g0 = z13;
        this.h0 = jSONObject11;
        this.E = str13;
        this.F = str14;
        this.G = str15;
        this.H = str16;
        this.I = str17;
        this.i0 = z14;
        this.j0 = jSONObject12;
        this.k0 = z15;
        this.l0 = str22;
        this.m0 = z16;
        this.S = z17;
        this.n0 = str18;
        this.o0 = str19;
        this.p0 = str20;
        this.q0 = z18;
        this.r0 = z19;
        this.s0 = i10;
        this.u0 = sVar2;
        this.t0 = str21;
        this.v0 = z20;
        this.w0 = hashMap2;
        this.x0 = zzvVar;
        this.y0 = zzwVar;
        this.z0 = d;
        this.I0 = i11;
        this.A0 = sVar3;
        this.B0 = z21;
        this.C0 = sVar4;
        this.D0 = z22;
        this.E0 = i12;
        this.F0 = bundle2;
        this.G0 = z;
        this.H0 = jSONArray;
    }

    public static String a(int i) {
        switch (i) {
            case 1:
                return com.ironsource.mediationsdk.j.a;
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    public final boolean b() {
        return this.i0 || this.y0 != null;
    }
}
