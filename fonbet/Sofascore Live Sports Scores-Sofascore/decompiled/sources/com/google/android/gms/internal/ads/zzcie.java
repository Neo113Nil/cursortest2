package com.google.android.gms.internal.ads;

import defpackage.inn;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcie {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final long m;
    public final long n;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcie(String str) {
        long j;
        long j2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.a = a(jSONObject, "aggressive_media_codec_release", zzbjg.B0);
        this.b = b(jSONObject, "byte_buffer_precache_limit", zzbjg.n);
        this.c = b(jSONObject, "exo_cache_buffer_size", zzbjg.A);
        this.d = b(jSONObject, "exo_connect_timeout_millis", zzbjg.j);
        inn innVar = zzbjg.i;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.e = b(jSONObject, "exo_read_timeout_millis", zzbjg.k);
            this.f = b(jSONObject, "load_check_interval_bytes", zzbjg.l);
            this.g = b(jSONObject, "player_precache_limit", zzbjg.m);
            this.h = b(jSONObject, "socket_receive_buffer_size", zzbjg.o);
            this.i = a(jSONObject, "use_cache_data_source", zzbjg.r5);
            b(jSONObject, "min_retry_count", zzbjg.p);
            this.j = a(jSONObject, "treat_load_exception_as_non_fatal", zzbjg.r);
            this.k = a(jSONObject, "enable_multiple_video_playback", zzbjg.H2);
            this.l = a(jSONObject, "use_range_http_data_source", zzbjg.J2);
            inn innVar2 = zzbjg.K2;
            if (jSONObject != null) {
                try {
                    j = jSONObject.getLong("range_http_data_source_high_water_mark");
                } catch (JSONException unused3) {
                }
                this.m = j;
                inn innVar3 = zzbjg.L2;
                if (jSONObject != null) {
                    try {
                        j2 = jSONObject.getLong("range_http_data_source_low_water_mark");
                    } catch (JSONException unused4) {
                    }
                    this.n = j2;
                }
                j2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar3)).longValue();
                this.n = j2;
            }
            j = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar2)).longValue();
            this.m = j;
            inn innVar32 = zzbjg.L2;
            if (jSONObject != null) {
            }
            j2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar32)).longValue();
            this.n = j2;
        }
        this.e = b(jSONObject, "exo_read_timeout_millis", zzbjg.k);
        this.f = b(jSONObject, "load_check_interval_bytes", zzbjg.l);
        this.g = b(jSONObject, "player_precache_limit", zzbjg.m);
        this.h = b(jSONObject, "socket_receive_buffer_size", zzbjg.o);
        this.i = a(jSONObject, "use_cache_data_source", zzbjg.r5);
        b(jSONObject, "min_retry_count", zzbjg.p);
        this.j = a(jSONObject, "treat_load_exception_as_non_fatal", zzbjg.r);
        this.k = a(jSONObject, "enable_multiple_video_playback", zzbjg.H2);
        this.l = a(jSONObject, "use_range_http_data_source", zzbjg.J2);
        inn innVar22 = zzbjg.K2;
        if (jSONObject != null) {
        }
        j = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar22)).longValue();
        this.m = j;
        inn innVar322 = zzbjg.L2;
        if (jSONObject != null) {
        }
        j2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar322)).longValue();
        this.n = j2;
    }

    public static final boolean a(JSONObject jSONObject, String str, zzbix zzbixVar) {
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbixVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return booleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, zzbix zzbixVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbixVar)).intValue();
    }
}
