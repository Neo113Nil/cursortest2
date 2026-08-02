package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.ads.internal.util.zzbp;
import defpackage.inn;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzflg {
    public final List a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final long g;
    public final boolean h;
    public final String i;
    public final zzflf j;
    public final Bundle k;
    public final String l;
    public final String m;
    public final String n;
    public final JSONObject o;
    public final JSONObject p;
    public final String q;
    public final int r;
    public final long s;
    public final long t;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public zzflg(JsonReader jsonReader) {
        String str;
        List list = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str2 = "";
        int i = 0;
        String str3 = "";
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        boolean z = false;
        zzflf zzflfVar = null;
        long j = -1;
        long j2 = -1;
        long j3 = 0;
        int i2 = -1;
        int i3 = 1;
        int i4 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (Objects.equals(nextName, "nofill_urls")) {
                list = zzbp.zzb(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if (Objects.equals(nextName, "refresh_load_delay_time_interval")) {
                i2 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str4 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i4 = jsonReader.nextInt();
            } else if (Payload.LATENCY.equals(nextName)) {
                j3 = jsonReader.nextLong();
            } else {
                str = str2;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.H9)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzflf zzflfVar2 = new zzflf();
                    jsonReader.beginObject();
                    String str10 = str;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        long j4 = j;
                        if (hashCode != -1724546052) {
                            if (hashCode == 3059181 && nextName2.equals("code")) {
                                jsonReader.nextInt();
                            }
                            jsonReader.skipValue();
                        } else {
                            if (nextName2.equals("description")) {
                                str10 = jsonReader.nextString();
                            }
                            jsonReader.skipValue();
                        }
                        j = j4;
                    }
                    jsonReader.endObject();
                    zzflfVar2.a = str10;
                    zzflfVar = zzflfVar2;
                } else {
                    long j5 = j;
                    if ("bidding_data".equals(nextName)) {
                        str5 = jsonReader.nextString();
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ac)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                            jsonReader.nextBoolean();
                        } else if ("adapter_response_replacement_key".equals(nextName)) {
                            str9 = jsonReader.nextString();
                        } else if ("response_info_extras".equals(nextName)) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Q7)).booleanValue()) {
                                try {
                                    try {
                                        Bundle zzl = zzbp.zzl(zzbp.zzd(jsonReader));
                                        if (zzl != null) {
                                            bundle = zzl;
                                        }
                                    } catch (IOException | JSONException unused) {
                                    }
                                } catch (IllegalStateException unused2) {
                                    jsonReader.skipValue();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestPostBody".equals(nextName)) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Oa)).booleanValue()) {
                                str7 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestUrl".equals(nextName)) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Oa)).booleanValue()) {
                                str6 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else {
                            inn innVar = zzbjg.Pa;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                                str8 = jsonReader.nextString();
                            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                                jSONObject = zzbp.zzd(jsonReader);
                            } else if (Objects.equals(nextName, "max_parallel_renderers")) {
                                i3 = Math.max(1, jsonReader.nextInt());
                            } else {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Xa)).booleanValue() && Objects.equals(nextName, "inspector_ad_transaction_extras")) {
                                    jSONObject2 = zzbp.zzd(jsonReader);
                                } else {
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.T2)).booleanValue() && Objects.equals(nextName, "latency_extras")) {
                                        try {
                                            Bundle zzl2 = zzbp.zzl(zzbp.zzd(jsonReader));
                                            if (zzl2 != null) {
                                                double d = zzl2.getDouble("start_time");
                                                long j6 = (d > 9.223372036854776E18d || d < -9.223372036854776E18d) ? -1L : (long) d;
                                                try {
                                                    double d2 = zzl2.getDouble("end_time");
                                                    j = (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) ? -1L : (long) d2;
                                                    j2 = j6;
                                                } catch (IOException | JSONException unused3) {
                                                    j2 = j6;
                                                } catch (IllegalStateException unused4) {
                                                    j2 = j6;
                                                    jsonReader.skipValue();
                                                    j = j5;
                                                    str2 = str;
                                                }
                                            }
                                        } catch (IllegalStateException unused5) {
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                            }
                        }
                    }
                    j = j5;
                }
                str2 = str;
            }
            str = str2;
            str2 = str;
        }
        long j7 = j;
        jsonReader.endObject();
        this.a = list;
        this.c = i;
        if (((Boolean) zzbln.e.c()).booleanValue()) {
            this.d = -1;
        } else {
            zzbkq zzbkqVar = zzbkv.a;
            if (((Long) zzbkqVar.c()).longValue() > -1) {
                this.d = ((Long) zzbkqVar.c()).intValue();
            } else {
                this.d = i2;
            }
        }
        this.b = str3;
        this.e = str4;
        this.f = i4;
        this.g = j3;
        this.j = zzflfVar;
        this.h = z;
        this.i = str5;
        this.k = bundle;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        this.o = jSONObject;
        this.p = jSONObject2;
        this.q = str9;
        zzbkq zzbkqVar2 = zzbll.a;
        this.r = ((Long) zzbkqVar2.c()).longValue() > 0 ? ((Long) zzbkqVar2.c()).intValue() : i3;
        this.s = j2;
        this.t = j7;
    }
}
