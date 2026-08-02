package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbe {
    public static final Object m = new Object();
    public static final zzak n;
    public Object a = m;
    public zzak b = n;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public boolean g;
    public zzaf h;
    public boolean i;
    public long j;
    public int k;
    public int l;

    static {
        zzz zzzVar = new zzz();
        zzzVar.a = "androidx.media3.common.Timeline";
        zzzVar.b = Uri.EMPTY;
        n = zzzVar.a();
        String str = zzfm.a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final void a(zzak zzakVar, boolean z, boolean z2, zzaf zzafVar, long j) {
        this.a = m;
        if (zzakVar == null) {
            zzakVar = n;
        }
        this.b = zzakVar;
        this.c = C.TIME_UNSET;
        this.d = C.TIME_UNSET;
        this.e = C.TIME_UNSET;
        this.f = z;
        this.g = z2;
        this.h = zzafVar;
        this.j = j;
        this.k = 0;
        this.l = 0;
        this.i = false;
    }

    public final boolean b() {
        return this.h != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zzbe.class.equals(obj.getClass())) {
            return false;
        }
        zzbe zzbeVar = (zzbe) obj;
        return Objects.equals(this.a, zzbeVar.a) && Objects.equals(this.b, zzbeVar.b) && Objects.equals(this.h, zzbeVar.h) && this.c == zzbeVar.c && this.d == zzbeVar.d && this.e == zzbeVar.e && this.f == zzbeVar.f && this.g == zzbeVar.g && this.i == zzbeVar.i && this.j == zzbeVar.j && this.k == zzbeVar.k && this.l == zzbeVar.l;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + this.b.hashCode();
        zzaf zzafVar = this.h;
        int hashCode2 = ((hashCode * 961) + (zzafVar == null ? 0 : zzafVar.hashCode())) * 31;
        long j = this.c;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        int i3 = ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.i ? 1 : 0);
        long j4 = this.j;
        return ((((((i3 * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.k) * 31) + this.l) * 31;
    }
}
