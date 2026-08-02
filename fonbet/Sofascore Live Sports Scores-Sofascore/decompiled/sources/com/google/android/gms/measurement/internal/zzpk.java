package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzadf;
import com.google.android.gms.internal.measurement.zzadp;
import com.google.android.gms.internal.measurement.zzaee;
import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.measurement.zzafb;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzha;
import com.google.android.gms.internal.measurement.zzho;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzii;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zziu;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.j8n;
import defpackage.p0p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzpk extends p0p {
    public long e;
    public long f;

    public static zzafb B0(zzadp zzadpVar, byte[] bArr) {
        zzadf a = zzadf.a();
        if (a != null) {
            zzadpVar.getClass();
            zzadpVar.o(bArr, bArr.length, a);
            return zzadpVar;
        }
        zzadpVar.getClass();
        int length = bArr.length;
        zzadf zzadfVar = zzadf.b;
        int i = j8n.a;
        zzadpVar.o(bArr, length, zzadf.c);
        return zzadpVar;
    }

    public static int C0(com.google.android.gms.internal.measurement.zzic zzicVar, String str) {
        for (int i = 0; i < ((zzid) zzicVar.b).g2(); i++) {
            if (str.equals(((zzid) zzicVar.b).h2(i).A())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] D0(zzaef zzaefVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = zzaefVar.iterator();
        while (it.hasNext()) {
            zzhw zzhwVar = (zzhw) it.next();
            if (zzhwVar != null) {
                Bundle bundle = new Bundle();
                for (zzhw zzhwVar2 : zzhwVar.I()) {
                    if (zzhwVar2.A()) {
                        bundle.putString(zzhwVar2.z(), zzhwVar2.B());
                    } else if (zzhwVar2.C()) {
                        bundle.putLong(zzhwVar2.z(), zzhwVar2.D());
                    } else if (zzhwVar2.G()) {
                        bundle.putDouble(zzhwVar2.z(), zzhwVar2.H());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(E0(false, (android.os.Bundle) r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(E0(false, (android.os.Bundle) r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(E0(false, (android.os.Bundle) r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap E0(boolean z, Bundle bundle) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z2 = obj instanceof Parcelable[];
            if (!z2 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    public static zzbh U(zzaa zzaaVar) {
        Object obj;
        Bundle V = V(zzaaVar.c, true);
        String obj2 = (!V.containsKey("_o") || (obj = V.get("_o")) == null) ? "app" : obj.toString();
        String b = zzlt.b(zzaaVar.a, zzjm.a, zzjm.f);
        if (b == null) {
            b = zzaaVar.a;
        }
        return new zzbh(b, new zzbf(V), obj2, zzaaVar.b, 0L);
    }

    public static Bundle V(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(V((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void Y(zzhr zzhrVar, String str, Long l) {
        List p = zzhrVar.p();
        int i = 0;
        while (true) {
            if (i >= p.size()) {
                i = -1;
                break;
            } else if (str.equals(((zzhw) p.get(i)).z())) {
                break;
            } else {
                i++;
            }
        }
        zzhv K = zzhw.K();
        K.p(str);
        K.r(l.longValue());
        if (i < 0) {
            zzhrVar.t(K);
        } else {
            zzhrVar.k();
            ((zzhs) zzhrVar.b).P(i, (zzhw) K.m());
        }
    }

    public static final Bundle Z(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhw zzhwVar = (zzhw) it.next();
            String z = zzhwVar.z();
            if (zzhwVar.G()) {
                bundle.putDouble(z, zzhwVar.H());
            } else if (zzhwVar.E()) {
                bundle.putFloat(z, zzhwVar.F());
            } else if (zzhwVar.A()) {
                bundle.putString(z, zzhwVar.B());
            } else if (zzhwVar.C()) {
                bundle.putLong(z, zzhwVar.D());
            }
        }
        return bundle;
    }

    public static final zzhw a0(zzhs zzhsVar, String str) {
        for (zzhw zzhwVar : zzhsVar.A()) {
            if (zzhwVar.z().equals(str)) {
                return zzhwVar;
            }
        }
        return null;
    }

    public static final String b0(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final Serializable c0(zzhs zzhsVar, String str) {
        zzhw a0 = a0(zzhsVar, str);
        if (a0 == null) {
            return null;
        }
        return i0(a0);
    }

    public static final void f0(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void g0(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String h0(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable i0(zzhw zzhwVar) {
        if (zzhwVar.A()) {
            return zzhwVar.B();
        }
        if (zzhwVar.C()) {
            return Long.valueOf(zzhwVar.D());
        }
        if (zzhwVar.G()) {
            return Double.valueOf(zzhwVar.H());
        }
        if (zzhwVar.J() > 0) {
            return D0(zzhwVar.I());
        }
        return null;
    }

    public static final void j0(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] split = str.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                g0(builder, str3, string, hashSet);
            }
        }
    }

    public static final void k0(StringBuilder sb, String str, zzii zziiVar) {
        if (zziiVar == null) {
            return;
        }
        f0(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (zziiVar.B() != 0) {
            f0(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : zziiVar.A()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (zziiVar.z() != 0) {
            f0(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : zziiVar.y()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (zziiVar.D() != 0) {
            f0(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (zzhq zzhqVar : zziiVar.C()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(zzhqVar.y() ? Integer.valueOf(zzhqVar.z()) : null);
                sb.append(":");
                sb.append(zzhqVar.A() ? Long.valueOf(zzhqVar.B()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (zziiVar.F() != 0) {
            f0(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (zzik zzikVar : zziiVar.E()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(zzikVar.y() ? Integer.valueOf(zzikVar.z()) : null);
                sb.append(": [");
                Iterator it = zzikVar.A().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i9 = i10;
                }
                sb.append(U3.j.e);
                i7 = i8;
            }
            sb.append("}\n");
        }
        f0(3, sb);
        sb.append("}\n");
    }

    public static final void l0(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        f0(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void m0(StringBuilder sb, int i, String str, zzfl zzflVar) {
        if (zzflVar == null) {
            return;
        }
        f0(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (zzflVar.y()) {
            int I = zzflVar.I();
            l0(sb, i, "comparison_type", I != 1 ? I != 2 ? I != 3 ? I != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzflVar.z()) {
            l0(sb, i, "match_as_float", Boolean.valueOf(zzflVar.A()));
        }
        if (zzflVar.B()) {
            l0(sb, i, "comparison_value", zzflVar.C());
        }
        if (zzflVar.D()) {
            l0(sb, i, "min_comparison_value", zzflVar.E());
        }
        if (zzflVar.F()) {
            l0(sb, i, "max_comparison_value", zzflVar.G());
        }
        f0(i, sb);
        sb.append("}\n");
    }

    public static boolean u0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean v0(zzaee zzaeeVar, int i) {
        if (i < zzaeeVar.size() * 64) {
            return ((1 << (i % 64)) & ((Long) zzaeeVar.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList w0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public final byte[] A0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.g.b(e, "Failed to gzip content");
            throw e;
        }
    }

    public final void W(Map map) {
        long j;
        zzic zzicVar = (zzic) this.b;
        String b0 = b0("Date", map);
        if (TextUtils.isEmpty(b0)) {
            return;
        }
        try {
            j = ZonedDateTime.parse(b0, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
        } catch (DateTimeParseException unused) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.j.b(b0, "Unable to parse header time, time");
            j = 0;
        }
        if (j > 0) {
            zzicVar.k.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Q();
            if (this.f == 0) {
                this.e = elapsedRealtime;
                this.f = j;
            }
        }
    }

    public final long X(long j) {
        Q();
        long j2 = this.f;
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return (j2 - this.e) + j;
    }

    public final void d0(StringBuilder sb, int i, zzaef zzaefVar) {
        if (zzaefVar == null) {
            return;
        }
        int i2 = i + 1;
        Iterator<E> it = zzaefVar.iterator();
        while (it.hasNext()) {
            zzhw zzhwVar = (zzhw) it.next();
            if (zzhwVar != null) {
                f0(i2, sb);
                sb.append("param {\n");
                l0(sb, i2, "name", zzhwVar.y() ? ((zzic) this.b).j.b(zzhwVar.z()) : null);
                l0(sb, i2, "string_value", zzhwVar.A() ? zzhwVar.B() : null);
                l0(sb, i2, "int_value", zzhwVar.C() ? Long.valueOf(zzhwVar.D()) : null);
                l0(sb, i2, "double_value", zzhwVar.G() ? Double.valueOf(zzhwVar.H()) : null);
                if (zzhwVar.J() > 0) {
                    d0(sb, i2, zzhwVar.I());
                }
                f0(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public final void e0(StringBuilder sb, int i, zzfh zzfhVar) {
        String str;
        if (zzfhVar == null) {
            return;
        }
        f0(i, sb);
        sb.append("filter {\n");
        if (zzfhVar.C()) {
            l0(sb, i, "complement", Boolean.valueOf(zzfhVar.D()));
        }
        if (zzfhVar.E()) {
            l0(sb, i, "param_name", ((zzic) this.b).j.b(zzfhVar.F()));
        }
        if (zzfhVar.y()) {
            int i2 = i + 1;
            zzfr z = zzfhVar.z();
            if (z != null) {
                f0(i2, sb);
                sb.append("string_filter {\n");
                if (z.y()) {
                    switch (z.G()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    l0(sb, i2, "match_type", str);
                }
                if (z.z()) {
                    l0(sb, i2, "expression", z.A());
                }
                if (z.B()) {
                    l0(sb, i2, "case_sensitive", Boolean.valueOf(z.C()));
                }
                if (z.E() > 0) {
                    f0(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : z.D()) {
                        f0(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                f0(i2, sb);
                sb.append("}\n");
            }
        }
        if (zzfhVar.A()) {
            m0(sb, i + 1, "number_filter", zzfhVar.B());
        }
        f0(i, sb);
        sb.append("}\n");
    }

    public final void n0(zzit zzitVar, Object obj) {
        zzitVar.k();
        ((zziu) zzitVar.b).N();
        zzitVar.k();
        ((zziu) zzitVar.b).P();
        zzitVar.k();
        ((zziu) zzitVar.b).R();
        if (obj instanceof String) {
            zzitVar.k();
            ((zziu) zzitVar.b).M((String) obj);
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            zzitVar.k();
            ((zziu) zzitVar.b).O(longValue);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            zzitVar.k();
            ((zziu) zzitVar.b).Q(doubleValue);
        } else {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.g.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final void o0(zzhv zzhvVar, Object obj) {
        zzhvVar.k();
        ((zzhw) zzhvVar.b).N();
        zzhvVar.k();
        ((zzhw) zzhvVar.b).P();
        zzhvVar.k();
        ((zzhw) zzhvVar.b).R();
        zzhvVar.k();
        ((zzhw) zzhvVar.b).U();
        if (obj instanceof String) {
            zzhvVar.q((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzhvVar.r(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            zzhvVar.k();
            ((zzhw) zzhvVar.b).Q(doubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.g.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                zzhv K = zzhw.K();
                for (String str : bundle.keySet()) {
                    zzhv K2 = zzhw.K();
                    K2.p(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        K2.r(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        K2.q((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double doubleValue2 = ((Double) obj2).doubleValue();
                        K2.k();
                        ((zzhw) K2.b).Q(doubleValue2);
                    }
                    K.k();
                    ((zzhw) K.b).S((zzhw) K2.m());
                }
                if (((zzhw) K.b).J() > 0) {
                    arrayList.add((zzhw) K.m());
                }
            }
        }
        zzhvVar.k();
        ((zzhw) zzhvVar.b).T(arrayList);
    }

    public final zzoh p0(String str, com.google.android.gms.internal.measurement.zzic zzicVar, zzhr zzhrVar, String str2) {
        int indexOf;
        zzaif.a();
        zzic zzicVar2 = (zzic) this.b;
        zzal zzalVar = zzicVar2.d;
        if (!zzalVar.b0(str, zzfy.O0)) {
            return null;
        }
        zzicVar2.k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(zzalVar.X(str, zzfy.t0).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)));
        zzpg zzpgVar = this.c;
        zzou zzouVar = zzpgVar.j;
        zzht zzhtVar = zzpgVar.a;
        zzht zzhtVar2 = zzouVar.c.a;
        zzpg.U(zzhtVar2);
        String d0 = zzhtVar2.d0(str);
        Uri.Builder builder = new Uri.Builder();
        zzal zzalVar2 = ((zzic) zzouVar.b).d;
        builder.scheme(zzalVar2.X(str, zzfy.m0));
        if (TextUtils.isEmpty(d0)) {
            builder.authority(zzalVar2.X(str, zzfy.n0));
        } else {
            String X = zzalVar2.X(str, zzfy.n0);
            StringBuilder sb = new StringBuilder(fn0.c(1, d0) + String.valueOf(X).length());
            sb.append(d0);
            sb.append(".");
            sb.append(X);
            builder.authority(sb.toString());
        }
        builder.path(zzalVar2.X(str, zzfy.o0));
        g0(builder, "gmp_app_id", ((zzid) zzicVar.b).N(), hashSet);
        zzalVar.W();
        g0(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String H = ((zzid) zzicVar.b).H();
        zzfx zzfxVar = zzfy.R0;
        if (zzalVar.b0(str, zzfxVar)) {
            zzpg.U(zzhtVar);
            if (zzhtVar.k0(str)) {
                H = "";
            }
        }
        g0(builder, "app_instance_id", H, hashSet);
        g0(builder, "rdid", ((zzid) zzicVar.b).E(), hashSet);
        g0(builder, "bundle_id", zzicVar.w(), hashSet);
        String v = zzhrVar.v();
        String b = zzlt.b(v, zzjm.f, zzjm.a);
        if (true != TextUtils.isEmpty(b)) {
            v = b;
        }
        g0(builder, "app_event_name", v, hashSet);
        g0(builder, "app_version", String.valueOf(((zzid) zzicVar.b).T()), hashSet);
        String t2 = ((zzid) zzicVar.b).t2();
        if (zzalVar.b0(str, zzfxVar)) {
            zzpg.U(zzhtVar);
            if (zzhtVar.j0(str) && !TextUtils.isEmpty(t2) && (indexOf = t2.indexOf(".")) != -1) {
                t2 = t2.substring(0, indexOf);
            }
        }
        g0(builder, "os_version", t2, hashSet);
        g0(builder, "timestamp", String.valueOf(zzhrVar.x()), hashSet);
        if (((zzid) zzicVar.b).G()) {
            g0(builder, L6.s, "1", hashSet);
        }
        g0(builder, "privacy_sandbox_version", String.valueOf(((zzid) zzicVar.b).Q0()), hashSet);
        g0(builder, "trigger_uri_source", "1", hashSet);
        g0(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), hashSet);
        g0(builder, "request_uuid", str2, hashSet);
        List<zzhw> p = zzhrVar.p();
        Bundle bundle = new Bundle();
        for (zzhw zzhwVar : p) {
            String z = zzhwVar.z();
            if (zzhwVar.G()) {
                bundle.putString(z, String.valueOf(zzhwVar.H()));
            } else if (zzhwVar.E()) {
                bundle.putString(z, String.valueOf(zzhwVar.F()));
            } else if (zzhwVar.A()) {
                bundle.putString(z, zzhwVar.B());
            } else if (zzhwVar.C()) {
                bundle.putString(z, String.valueOf(zzhwVar.D()));
            }
        }
        j0(builder, zzalVar.X(str, zzfy.s0).split("\\|"), bundle, hashSet);
        List<zziu> unmodifiableList = Collections.unmodifiableList(((zzid) zzicVar.b).f2());
        Bundle bundle2 = new Bundle();
        for (zziu zziuVar : unmodifiableList) {
            String A = zziuVar.A();
            if (zziuVar.H()) {
                bundle2.putString(A, String.valueOf(zziuVar.I()));
            } else if (zziuVar.F()) {
                bundle2.putString(A, String.valueOf(zziuVar.G()));
            } else if (zziuVar.B()) {
                bundle2.putString(A, zziuVar.C());
            } else if (zziuVar.D()) {
                bundle2.putString(A, String.valueOf(zziuVar.E()));
            }
        }
        j0(builder, zzalVar.X(str, zzfy.r0).split("\\|"), bundle2, hashSet);
        g0(builder, "dma", true != ((zzid) zzicVar.b).N0() ? "0" : "1", hashSet);
        if (!((zzid) zzicVar.b).P0().isEmpty()) {
            g0(builder, "dma_cps", ((zzid) zzicVar.b).P0(), hashSet);
        }
        if (((zzid) zzicVar.b).V0()) {
            zzha W0 = ((zzid) zzicVar.b).W0();
            if (!W0.M().isEmpty()) {
                g0(builder, "dl_gclid", W0.M(), hashSet);
            }
            if (!W0.O().isEmpty()) {
                g0(builder, "dl_gbraid", W0.O(), hashSet);
            }
            if (!W0.Q().isEmpty()) {
                g0(builder, "dl_gs", W0.Q(), hashSet);
            }
            if (W0.S() > 0) {
                g0(builder, "dl_ss_ts", String.valueOf(W0.S()), hashSet);
            }
            if (!W0.U().isEmpty()) {
                g0(builder, "mr_gclid", W0.U(), hashSet);
            }
            if (!W0.W().isEmpty()) {
                g0(builder, "mr_gbraid", W0.W(), hashSet);
            }
            if (!W0.Y().isEmpty()) {
                g0(builder, "mr_gs", W0.Y(), hashSet);
            }
            if (W0.b0() > 0) {
                g0(builder, "mr_click_ts", String.valueOf(W0.b0()), hashSet);
            }
        }
        return new zzoh(1, currentTimeMillis, builder.build().toString());
    }

    public final zzhs q0(zzbc zzbcVar) {
        zzhr O = zzhs.O();
        long j = zzbcVar.f;
        O.k();
        ((zzhs) O.b).W(j);
        long j2 = zzbcVar.e;
        O.k();
        ((zzhs) O.b).y(j2);
        Bundle bundle = zzbcVar.g.a;
        for (String str : bundle.keySet()) {
            zzhv K = zzhw.K();
            K.p(str);
            Object obj = bundle.get(str);
            Preconditions.i(obj);
            o0(K, obj);
            O.t(K);
        }
        String str2 = zzbcVar.c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            zzhv K2 = zzhw.K();
            K2.p("_o");
            K2.q(str2);
            O.s((zzhw) K2.m());
        }
        return (zzhs) O.m();
    }

    public final String r0(zzib zzibVar) {
        com.google.android.gms.internal.measurement.zzhe S0;
        StringBuilder q = fc6.q("\nbatch {\n");
        if (zzibVar.D()) {
            l0(q, 0, "upload_subdomain", zzibVar.E());
        }
        if (zzibVar.B()) {
            l0(q, 0, "sgtm_join_id", zzibVar.C());
        }
        for (zzid zzidVar : zzibVar.y()) {
            if (zzidVar != null) {
                f0(1, q);
                q.append("bundle {\n");
                if (zzidVar.Y()) {
                    l0(q, 1, "protocol_version", Integer.valueOf(zzidVar.Z0()));
                }
                zzic zzicVar = (zzic) this.b;
                zzal zzalVar = zzicVar.d;
                zzgn zzgnVar = zzicVar.j;
                if (zzalVar.b0(zzidVar.y(), zzfy.M0) && zzidVar.F0()) {
                    l0(q, 1, "session_stitching_token", zzidVar.G0());
                }
                l0(q, 1, L6.H, zzidVar.s2());
                if (zzidVar.A()) {
                    l0(q, 1, "gmp_version", Long.valueOf(zzidVar.B()));
                }
                if (zzidVar.C()) {
                    l0(q, 1, "uploading_gmp_version", Long.valueOf(zzidVar.D()));
                }
                if (zzidVar.B0()) {
                    l0(q, 1, "dynamite_version", Long.valueOf(zzidVar.C0()));
                }
                if (zzidVar.U()) {
                    l0(q, 1, "config_version", Long.valueOf(zzidVar.V()));
                }
                l0(q, 1, "gmp_app_id", zzidVar.N());
                l0(q, 1, MBridgeConstans.APP_ID, zzidVar.y());
                l0(q, 1, "app_version", zzidVar.z());
                if (zzidVar.S()) {
                    l0(q, 1, "app_version_major", Integer.valueOf(zzidVar.T()));
                }
                l0(q, 1, "firebase_instance_id", zzidVar.R());
                if (zzidVar.I()) {
                    l0(q, 1, "dev_cert_hash", Long.valueOf(zzidVar.J()));
                }
                l0(q, 1, "app_store", zzidVar.y2());
                if (zzidVar.i2()) {
                    l0(q, 1, "upload_timestamp_millis", Long.valueOf(zzidVar.j2()));
                }
                if (zzidVar.k2()) {
                    l0(q, 1, "start_timestamp_millis", Long.valueOf(zzidVar.l2()));
                }
                if (zzidVar.m2()) {
                    l0(q, 1, "end_timestamp_millis", Long.valueOf(zzidVar.n2()));
                }
                if (zzidVar.o2()) {
                    l0(q, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzidVar.p2()));
                }
                if (zzidVar.q2()) {
                    l0(q, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzidVar.r2()));
                }
                l0(q, 1, "app_instance_id", zzidVar.H());
                l0(q, 1, "resettable_device_id", zzidVar.E());
                l0(q, 1, "ds_id", zzidVar.X());
                if (zzidVar.F()) {
                    l0(q, 1, "limited_ad_tracking", Boolean.valueOf(zzidVar.G()));
                }
                l0(q, 1, "os_version", zzidVar.t2());
                l0(q, 1, Payload.DEVICE_MODEL, zzidVar.u2());
                l0(q, 1, "user_default_language", zzidVar.v2());
                if (zzidVar.w2()) {
                    l0(q, 1, "time_zone_offset_minutes", Integer.valueOf(zzidVar.x2()));
                }
                if (zzidVar.K()) {
                    l0(q, 1, "bundle_sequential_index", Integer.valueOf(zzidVar.L()));
                }
                if (zzidVar.T0()) {
                    l0(q, 1, "delivery_index", Integer.valueOf(zzidVar.U0()));
                }
                if (zzidVar.O()) {
                    l0(q, 1, "service_upload", Boolean.valueOf(zzidVar.P()));
                }
                l0(q, 1, "health_monitor", zzidVar.M());
                if (zzidVar.z0()) {
                    l0(q, 1, "retry_counter", Integer.valueOf(zzidVar.A0()));
                }
                if (zzidVar.D0()) {
                    l0(q, 1, "consent_signals", zzidVar.E0());
                }
                if (zzidVar.M0()) {
                    l0(q, 1, "is_dma_region", Boolean.valueOf(zzidVar.N0()));
                }
                if (zzidVar.O0()) {
                    l0(q, 1, "core_platform_services", zzidVar.P0());
                }
                if (zzidVar.K0()) {
                    l0(q, 1, "consent_diagnostics", zzidVar.L0());
                }
                if (zzidVar.H0()) {
                    l0(q, 1, "target_os_version", Long.valueOf(zzidVar.I0()));
                }
                zzaif.a();
                if (zzalVar.b0(zzidVar.y(), zzfy.O0)) {
                    l0(q, 1, "ad_services_version", Integer.valueOf(zzidVar.Q0()));
                    if (zzidVar.R0() && (S0 = zzidVar.S0()) != null) {
                        f0(2, q);
                        q.append("attribution_eligibility_status {\n");
                        l0(q, 2, "eligible", Boolean.valueOf(S0.y()));
                        l0(q, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(S0.z()));
                        l0(q, 2, "pre_r", Boolean.valueOf(S0.A()));
                        l0(q, 2, "r_extensions_too_old", Boolean.valueOf(S0.B()));
                        l0(q, 2, "adservices_extension_too_old", Boolean.valueOf(S0.C()));
                        l0(q, 2, "ad_storage_not_allowed", Boolean.valueOf(S0.D()));
                        l0(q, 2, "measurement_manager_disabled", Boolean.valueOf(S0.E()));
                        f0(2, q);
                        q.append("}\n");
                    }
                }
                if (zzidVar.V0()) {
                    zzha W0 = zzidVar.W0();
                    f0(2, q);
                    q.append("ad_campaign_info {\n");
                    if (W0.L()) {
                        l0(q, 2, "deep_link_gclid", W0.M());
                    }
                    if (W0.N()) {
                        l0(q, 2, "deep_link_gbraid", W0.O());
                    }
                    if (W0.P()) {
                        l0(q, 2, "deep_link_gad_source", W0.Q());
                    }
                    if (W0.c0()) {
                        l0(q, 2, "deep_link_url", W0.d0());
                    }
                    if (W0.R()) {
                        l0(q, 2, "deep_link_session_millis", Long.valueOf(W0.S()));
                    }
                    if (W0.T()) {
                        l0(q, 2, "market_referrer_gclid", W0.U());
                    }
                    if (W0.V()) {
                        l0(q, 2, "market_referrer_gbraid", W0.W());
                    }
                    if (W0.X()) {
                        l0(q, 2, "market_referrer_gad_source", W0.Y());
                    }
                    if (W0.Z()) {
                        l0(q, 2, "market_referrer_click_millis", Long.valueOf(W0.b0()));
                    }
                    f0(2, q);
                    q.append("}\n");
                }
                if (zzidVar.Z()) {
                    l0(q, 1, "batching_timestamp_millis", Long.valueOf(zzidVar.b0()));
                }
                if (zzidVar.X0()) {
                    zzis Y0 = zzidVar.Y0();
                    f0(2, q);
                    q.append("sgtm_diagnostics {\n");
                    int C = Y0.C();
                    l0(q, 2, "upload_type", C != 1 ? C != 2 ? C != 3 ? C != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    l0(q, 2, "client_upload_eligibility", Y0.y().name());
                    int D = Y0.D();
                    l0(q, 2, "service_upload_eligibility", D != 1 ? D != 2 ? D != 3 ? D != 4 ? D != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    f0(2, q);
                    q.append("}\n");
                }
                if (zzidVar.c0()) {
                    zzho d0 = zzidVar.d0();
                    f0(2, q);
                    q.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.zzhl zzhlVar : d0.y()) {
                        f0(3, q);
                        q.append("limited_data_modes {\n");
                        int z = zzhlVar.z();
                        l0(q, 3, "type", z != 1 ? z != 2 ? z != 3 ? z != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int A = zzhlVar.A();
                        l0(q, 3, U3.a.t, A != 1 ? A != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        f0(3, q);
                        q.append("}\n");
                    }
                    f0(2, q);
                    q.append("}\n");
                }
                zzaef<zziu> f2 = zzidVar.f2();
                if (f2 != null) {
                    for (zziu zziuVar : f2) {
                        if (zziuVar != null) {
                            f0(2, q);
                            q.append("user_property {\n");
                            l0(q, 2, "set_timestamp_millis", zziuVar.y() ? Long.valueOf(zziuVar.z()) : null);
                            l0(q, 2, "name", zzgnVar.c(zziuVar.A()));
                            l0(q, 2, "string_value", zziuVar.C());
                            l0(q, 2, "int_value", zziuVar.D() ? Long.valueOf(zziuVar.E()) : null);
                            l0(q, 2, "double_value", zziuVar.H() ? Double.valueOf(zziuVar.I()) : null);
                            f0(2, q);
                            q.append("}\n");
                        }
                    }
                }
                zzaef<com.google.android.gms.internal.measurement.zzhg> Q = zzidVar.Q();
                if (Q != null) {
                    for (com.google.android.gms.internal.measurement.zzhg zzhgVar : Q) {
                        if (zzhgVar != null) {
                            f0(2, q);
                            q.append("audience_membership {\n");
                            if (zzhgVar.y()) {
                                l0(q, 2, "audience_id", Integer.valueOf(zzhgVar.z()));
                            }
                            if (zzhgVar.D()) {
                                l0(q, 2, "new_audience", Boolean.valueOf(zzhgVar.E()));
                            }
                            k0(q, "current_data", zzhgVar.A());
                            if (zzhgVar.B()) {
                                k0(q, "previous_data", zzhgVar.C());
                            }
                            f0(2, q);
                            q.append("}\n");
                        }
                    }
                }
                List<zzhs> Z1 = zzidVar.Z1();
                if (Z1 != null) {
                    for (zzhs zzhsVar : Z1) {
                        if (zzhsVar != null) {
                            f0(2, q);
                            q.append("event {\n");
                            l0(q, 2, "name", zzgnVar.a(zzhsVar.D()));
                            if (zzhsVar.E()) {
                                l0(q, 2, "timestamp_millis", Long.valueOf(zzhsVar.F()));
                            }
                            if (zzalVar.b0(null, zzfy.e1) && zzhsVar.K()) {
                                l0(q, 2, "corrected_timestamp_millis", Long.valueOf(zzhsVar.L()));
                            }
                            if (zzhsVar.G()) {
                                l0(q, 2, "previous_timestamp_millis", Long.valueOf(zzhsVar.H()));
                            }
                            if (zzhsVar.I()) {
                                l0(q, 2, "count", Integer.valueOf(zzhsVar.J()));
                            }
                            if (zzhsVar.B() != 0) {
                                d0(q, 2, (zzaef) zzhsVar.A());
                            }
                            f0(2, q);
                            q.append("}\n");
                        }
                    }
                }
                f0(1, q);
                q.append("}\n");
            }
        }
        q.append("} // End-of-batch\n");
        return q.toString();
    }

    public final String s0(zzfn zzfnVar) {
        StringBuilder q = fc6.q("\nproperty_filter {\n");
        if (zzfnVar.y()) {
            l0(q, 0, "filter_id", Integer.valueOf(zzfnVar.z()));
        }
        l0(q, 0, "property_name", ((zzic) this.b).j.c(zzfnVar.A()));
        String h0 = h0(zzfnVar.C(), zzfnVar.D(), zzfnVar.F());
        if (!h0.isEmpty()) {
            l0(q, 0, "filter_type", h0);
        }
        e0(q, 1, zzfnVar.B());
        q.append("}\n");
        return q.toString();
    }

    public final Parcelable t0(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (SafeParcelReader.ParseException unused) {
                zzgu zzguVar = ((zzic) this.b).f;
                zzic.m(zzguVar);
                zzguVar.g.a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    public final List x0(zzaee zzaeeVar, List list) {
        int i;
        zzic zzicVar = (zzic) this.b;
        ArrayList arrayList = new ArrayList(zzaeeVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                zzgu zzguVar = zzicVar.f;
                zzic.m(zzguVar);
                zzguVar.j.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzgu zzguVar2 = zzicVar.f;
                    zzic.m(zzguVar2);
                    zzguVar2.j.c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final boolean y0(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((zzic) this.b).k.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public final long z0(byte[] bArr) {
        Preconditions.i(bArr);
        zzic zzicVar = (zzic) this.b;
        zzpp zzppVar = zzicVar.i;
        zzic.k(zzppVar);
        zzppVar.Q();
        MessageDigest j0 = zzpp.j0();
        if (j0 != null) {
            return zzpp.k0(j0.digest(bArr));
        }
        zzgu zzguVar = zzicVar.f;
        zzic.m(zzguVar);
        zzguVar.g.a("Failed to get MD5");
        return 0L;
    }

    @Override // defpackage.p0p
    public final void T() {
    }
}
