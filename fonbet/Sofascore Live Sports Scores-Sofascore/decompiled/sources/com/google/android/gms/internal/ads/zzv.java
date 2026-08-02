package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.ads.AdError;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.BuildConfig;
import defpackage.a70;
import defpackage.bf3;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.me4;
import defpackage.ueo;
import defpackage.wt3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzv {
    public static final /* synthetic */ int R = 0;
    public final int A;
    public final boolean B;
    public final float C;
    public final byte[] D;
    public final int E;
    public final zzi F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public int Q;
    public final String a;
    public final String b;
    public final zzgxm c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final zzap l;
    public final String m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;
    public final List r;
    public final zzq s;
    public final long t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final float z;

    static {
        new zzv(new zzt());
        String str = zzfm.a;
        Integer.toString(0, 36);
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
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
        Integer.toString(37, 36);
        Integer.toString(38, 36);
        Integer.toString(39, 36);
        Integer.toString(40, 36);
    }

    public zzv(zzt zztVar) {
        boolean z;
        String str;
        this.a = zztVar.a;
        String q = zzfm.q(zztVar.d);
        this.d = q;
        if (zztVar.c.isEmpty() && zztVar.b != null) {
            this.c = zzgxm.t(new zzx(q, zztVar.b));
            this.b = zztVar.b;
        } else if (zztVar.c.isEmpty() || zztVar.b != null) {
            if (!zztVar.c.isEmpty() || zztVar.b != null) {
                for (int i = 0; i < zztVar.c.size(); i++) {
                    if (!((zzx) zztVar.c.get(i)).b.equals(zztVar.b)) {
                    }
                }
                z = false;
                zzguk.f(z);
                this.c = zztVar.c;
                this.b = zztVar.b;
            }
            z = true;
            zzguk.f(z);
            this.c = zztVar.c;
            this.b = zztVar.b;
        } else {
            zzgxm zzgxmVar = zztVar.c;
            this.c = zzgxmVar;
            Iterator it = zzgxmVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((zzx) zzgxmVar.get(0)).b;
                    break;
                }
                zzx zzxVar = (zzx) it.next();
                if (TextUtils.equals(zzxVar.a, q)) {
                    str = zzxVar.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = zztVar.e;
        zzguk.g("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", zztVar.g == 0 || (zztVar.f & 32768) != 0);
        this.f = zztVar.f;
        this.g = zztVar.g;
        int i2 = zztVar.h;
        this.h = i2;
        int i3 = zztVar.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = zztVar.j;
        this.l = zztVar.k;
        this.m = zztVar.l;
        this.n = zztVar.m;
        this.o = zztVar.n;
        this.p = zztVar.o;
        this.q = zztVar.p;
        List list = zztVar.q;
        this.r = list == null ? Collections.EMPTY_LIST : list;
        zzq zzqVar = zztVar.r;
        this.s = zzqVar;
        this.t = zztVar.s;
        this.u = zztVar.t;
        this.v = zztVar.u;
        this.w = zztVar.v;
        this.x = zztVar.w;
        this.y = zztVar.x;
        this.z = zztVar.y;
        int i4 = zztVar.z;
        this.A = i4 == -1 ? 0 : i4;
        this.B = zztVar.A;
        float f = zztVar.B;
        this.C = f == -1.0f ? 1.0f : f;
        this.D = zztVar.C;
        this.E = zztVar.D;
        this.F = zztVar.E;
        this.G = zztVar.F;
        int i5 = zztVar.G;
        this.H = i5;
        int i6 = zztVar.H;
        this.I = i6;
        if (i5 != -1 && i6 != -1 && Integer.bitCount(i6) != i5) {
            a70.r(zzgvb.a("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(i5), Integer.valueOf(i6)));
            throw null;
        }
        this.J = zztVar.I;
        this.K = zztVar.J;
        int i7 = zztVar.K;
        this.L = i7 == -1 ? 0 : i7;
        int i8 = zztVar.L;
        this.M = i8 != -1 ? i8 : 0;
        this.N = zztVar.M;
        this.O = zztVar.N;
        int i9 = zztVar.O;
        if (i9 != 0 || zzqVar == null) {
            this.P = i9;
        } else {
            this.P = 1;
        }
    }

    public static String c(zzv zzvVar) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        StringBuilder q = fc6.q("id=");
        q.append(zzvVar.a);
        q.append(", mimeType=");
        q.append(zzvVar.o);
        String str4 = zzvVar.n;
        if (str4 != null) {
            q.append(", container=");
            q.append(str4);
        }
        String str5 = zzvVar.m;
        if (str5 != null) {
            q.append(", primaryGroupId=");
            q.append(str5);
        }
        int i3 = zzvVar.j;
        if (i3 != -1) {
            q.append(", bitrate=");
            q.append(i3);
        }
        String str6 = zzvVar.k;
        if (str6 != null) {
            q.append(", codecs=");
            q.append(str6);
        }
        zzq zzqVar = zzvVar.s;
        if (zzqVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i4 = 0; i4 < zzqVar.d; i4++) {
                UUID uuid = zzqVar.a[i4].b;
                if (uuid.equals(zzg.b)) {
                    linkedHashSet.add(C.CENC_TYPE_cenc);
                } else if (uuid.equals(zzg.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(zzg.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(zzg.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(zzg.a)) {
                    linkedHashSet.add("universal");
                } else {
                    String obj = uuid.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 10);
                    sb.append("unknown (");
                    sb.append(obj);
                    sb.append(")");
                    linkedHashSet.add(sb.toString());
                }
            }
            q.append(", drm=[");
            zzgue.a(q, linkedHashSet.iterator(), BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            q.append(']');
        }
        int i5 = zzvVar.v;
        if (i5 != -1 && (i2 = zzvVar.w) != -1) {
            me4.r(q, ", res=", i5, "x", i2);
        }
        int i6 = zzvVar.x;
        if (i6 != -1 && (i = zzvVar.y) != -1) {
            me4.r(q, ", decRes=", i6, "x", i);
        }
        float f = zzvVar.C;
        int i7 = zzhaw.a;
        double d = f;
        if (Math.copySign((-1.0d) + d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            q.append(", par=");
            Object[] objArr = {Float.valueOf(f)};
            String str7 = zzfm.a;
            q.append(String.format(Locale.US, "%.3f", objArr));
        }
        zzi zziVar = zzvVar.F;
        if (zziVar != null) {
            int i8 = zziVar.f;
            int i9 = zziVar.e;
            if ((i9 != -1 && i8 != -1) || zziVar.d()) {
                q.append(", color=");
                if (zziVar.d()) {
                    String e = zzi.e(zziVar.a);
                    String g = zzi.g(zziVar.b);
                    String f2 = zzi.f(zziVar.c);
                    String str8 = zzfm.a;
                    Locale locale = Locale.US;
                    str2 = bf3.k(e, "/", g, "/", f2);
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i9 == -1 || i8 == -1) {
                    str3 = "NA/NA";
                } else {
                    StringBuilder sb2 = new StringBuilder(fn0.a(i9, 1) + String.valueOf(i8).length());
                    sb2.append(i9);
                    sb2.append("/");
                    sb2.append(i8);
                    str3 = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder(str3.length() + str2.length() + 1);
                sb3.append(str2);
                sb3.append("/");
                sb3.append(str3);
                q.append(sb3.toString());
            }
        }
        float f3 = zzvVar.z;
        if (f3 != -1.0f) {
            q.append(", fps=");
            q.append(f3);
        }
        int i10 = zzvVar.A;
        if (i10 != 0) {
            q.append(", rotation=");
            q.append(i10);
        }
        if (zzvVar.B) {
            q.append(", mirrorHorizontal");
        }
        int i11 = zzvVar.G;
        if (i11 != -1) {
            q.append(", maxSubLayers=");
            q.append(i11);
        }
        int i12 = zzvVar.H;
        if (i12 != -1) {
            q.append(", channels=");
            q.append(i12);
        }
        int i13 = zzvVar.I;
        if (i13 != -1) {
            q.append(", channel_mask=");
            q.append(i13);
        }
        int i14 = zzvVar.J;
        if (i14 != -1) {
            q.append(", sample_rate=");
            q.append(i14);
        }
        String str9 = zzvVar.d;
        if (str9 != null) {
            q.append(", language=");
            q.append(str9);
        }
        zzgxm zzgxmVar = zzvVar.c;
        if (!zzgxmVar.isEmpty()) {
            q.append(", labels=[");
            zzgue.a(q, zzgym.b(zzgxmVar, ueo.d).iterator(), BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            q.append(U3.j.e);
        }
        int i15 = zzvVar.e;
        if (i15 != 0) {
            q.append(", selectionFlags=[");
            String str10 = zzfm.a;
            ArrayList arrayList = new ArrayList();
            if ((i15 & 1) != 0) {
                arrayList.add(BuildConfig.FLAVOR);
            }
            if ((i15 & 2) != 0) {
                arrayList.add("forced");
            }
            zzgue.a(q, arrayList.iterator(), BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            q.append(U3.j.e);
        }
        int i16 = zzvVar.f;
        if (i16 != 0) {
            q.append(", roleFlags=[");
            int i17 = i16 & 32768;
            String str11 = zzfm.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i16 & 1) != 0) {
                arrayList2.add(U3.i.Z);
            }
            if ((i16 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i16 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i16 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i16 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i16 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i16 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i16 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i16 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                arrayList2.add("sign");
            }
            if ((i16 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i16 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i16 & com.ironsource.mediationsdk.metadata.a.o) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i16 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i16 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i16 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i17 != 0) {
                arrayList2.add("auxiliary");
            }
            zzgue.a(q, arrayList2.iterator(), BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            q.append(U3.j.e);
        }
        if ((i16 & 32768) != 0) {
            q.append(", auxiliaryTrackType=");
            int i18 = zzvVar.g;
            String str12 = zzfm.a;
            if (i18 == 0) {
                str = AdError.UNDEFINED_DOMAIN;
            } else if (i18 == 1) {
                str = "original";
            } else if (i18 == 2) {
                str = "depth-linear";
            } else if (i18 == 3) {
                str = "depth-inverse";
            } else {
                if (i18 != 4) {
                    a70.r("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            q.append(str);
        }
        return q.toString();
    }

    public final zzt a() {
        return new zzt(this);
    }

    public final boolean b(zzv zzvVar) {
        List list = this.r;
        int size = list.size();
        List list2 = zzvVar.r;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || zzv.class != obj.getClass()) {
            return false;
        }
        zzv zzvVar = (zzv) obj;
        int i2 = this.Q;
        return (i2 == 0 || (i = zzvVar.Q) == 0 || i2 == i) && this.e == zzvVar.e && this.f == zzvVar.f && this.g == zzvVar.g && this.h == zzvVar.h && this.i == zzvVar.i && this.p == zzvVar.p && this.t == zzvVar.t && this.v == zzvVar.v && this.w == zzvVar.w && this.x == zzvVar.x && this.y == zzvVar.y && this.A == zzvVar.A && this.B == zzvVar.B && this.E == zzvVar.E && this.G == zzvVar.G && this.H == zzvVar.H && this.I == zzvVar.I && this.J == zzvVar.J && this.K == zzvVar.K && this.L == zzvVar.L && this.M == zzvVar.M && this.N == zzvVar.N && this.P == zzvVar.P && Float.compare(this.z, zzvVar.z) == 0 && Float.compare(this.C, zzvVar.C) == 0 && Objects.equals(this.a, zzvVar.a) && Objects.equals(this.b, zzvVar.b) && this.c.equals(zzvVar.c) && Objects.equals(this.k, zzvVar.k) && Objects.equals(this.m, zzvVar.m) && Objects.equals(this.n, zzvVar.n) && Objects.equals(this.o, zzvVar.o) && Objects.equals(this.d, zzvVar.d) && Arrays.equals(this.D, zzvVar.D) && Objects.equals(this.l, zzvVar.l) && Objects.equals(this.F, zzvVar.F) && Objects.equals(this.s, zzvVar.s) && b(zzvVar);
    }

    public final int hashCode() {
        int i = this.Q;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int hashCode2 = this.c.hashCode() + ((((hashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.d;
        int hashCode3 = ((((((((((((hashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str4 = this.k;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzap zzapVar = this.l;
        int hashCode5 = hashCode4 + (zzapVar == null ? 0 : zzapVar.hashCode());
        String str5 = this.m;
        int hashCode6 = ((hashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.n;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        int floatToIntBits = ((((((((((((((((((((((((Float.floatToIntBits(this.C) + ((((((Float.floatToIntBits(this.z) + ((((((((((((((((hashCode7 + (this.o != null ? r1.hashCode() : 0)) * 31) + this.p) * 31) + ((int) this.t)) * 31) + this.v) * 31) + this.w) * 31) - 1) * 31) + this.x) * 31) + this.y) * 31)) * 31) + this.A) * 31) + (this.B ? 1 : 0)) * 31)) * 31) + this.E) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) - 1) * 31) - 1) * 31) + this.P;
        this.Q = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.F);
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.n;
        int length3 = String.valueOf(str3).length();
        String str4 = this.o;
        int length4 = String.valueOf(str4).length();
        String str5 = this.k;
        int length5 = String.valueOf(str5).length();
        int i = this.j;
        int length6 = String.valueOf(i).length();
        String str6 = this.d;
        int length7 = String.valueOf(str6).length();
        int i2 = this.v;
        int length8 = String.valueOf(i2).length();
        int i3 = this.w;
        int length9 = String.valueOf(i3).length();
        float f = this.z;
        int length10 = String.valueOf(f).length();
        int length11 = valueOf.length();
        int i4 = this.H;
        int length12 = String.valueOf(i4).length();
        int i5 = this.I;
        int length13 = String.valueOf(i5).length();
        int i6 = this.J;
        StringBuilder sb = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + length13 + 2 + String.valueOf(i6).length() + 2);
        bf3.v(sb, "Format(", str, ", ", str2);
        bf3.v(sb, ", ", str3, ", ", str4);
        wt3.t(i, ", ", str5, ", ", sb);
        wt3.t(i2, ", ", str6, ", [", sb);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        wt3.t(i4, ", ", valueOf, "], [", sb);
        me4.r(sb, ", ", i5, ", ", i6);
        sb.append("])");
        return sb.toString();
    }
}
