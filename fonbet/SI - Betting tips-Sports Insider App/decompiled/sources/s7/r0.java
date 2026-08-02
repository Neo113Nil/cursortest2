package s7;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.e6;
import com.google.android.gms.internal.measurement.f5;
import com.google.android.gms.internal.measurement.l5;
import com.google.android.gms.internal.measurement.m5;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.internal.measurement.z4;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r0 extends l3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(r3 r3Var, int i5) {
        super(r3Var);
        this.f22974d = i5;
    }

    public static final void A(StringBuilder sb2, String str, com.google.android.gms.internal.measurement.l3 l3Var) {
        if (l3Var == null) {
            return;
        }
        v(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (l3Var.s() != 0) {
            v(4, sb2);
            sb2.append("results: ");
            int i5 = 0;
            for (Long l6 : l3Var.r()) {
                int i10 = i5 + 1;
                if (i5 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l6);
                i5 = i10;
            }
            sb2.append('\n');
        }
        if (l3Var.q() != 0) {
            v(4, sb2);
            sb2.append("status: ");
            int i11 = 0;
            for (Long l10 : l3Var.p()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (l3Var.u() != 0) {
            v(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (com.google.android.gms.internal.measurement.y2 y2Var : l3Var.t()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(y2Var.p() ? Integer.valueOf(y2Var.q()) : null);
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb2.append(y2Var.r() ? Long.valueOf(y2Var.s()) : null);
                i13 = i14;
            }
            sb2.append("}\n");
        }
        if (l3Var.w() != 0) {
            v(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.n3 n3Var : l3Var.v()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(n3Var.p() ? Integer.valueOf(n3Var.q()) : null);
                sb2.append(": [");
                Iterator it = n3Var.r().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i17 = i18;
                }
                sb2.append("]");
                i15 = i16;
            }
            sb2.append("}\n");
        }
        v(3, sb2);
        sb2.append("}\n");
    }

    public static final void B(StringBuilder sb2, int i5, String str, Object obj) {
        if (obj == null) {
            return;
        }
        v(i5 + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void C(StringBuilder sb2, int i5, String str, com.google.android.gms.internal.measurement.s1 s1Var) {
        if (s1Var == null) {
            return;
        }
        v(i5, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (s1Var.p()) {
            int z5 = s1Var.z();
            B(sb2, i5, "comparison_type", z5 != 1 ? z5 != 2 ? z5 != 3 ? z5 != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (s1Var.q()) {
            B(sb2, i5, "match_as_float", Boolean.valueOf(s1Var.r()));
        }
        if (s1Var.s()) {
            B(sb2, i5, "comparison_value", s1Var.t());
        }
        if (s1Var.u()) {
            B(sb2, i5, "min_comparison_value", s1Var.v());
        }
        if (s1Var.w()) {
            B(sb2, i5, "max_comparison_value", s1Var.x());
        }
        v(i5, sb2);
        sb2.append("}\n");
    }

    public static boolean P(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean Q(l5 l5Var, int i5) {
        if (i5 < ((t5) l5Var).f5252c * 64) {
            return ((1 << (i5 % 64)) & ((Long) ((t5) l5Var).get(i5 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList R(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i5 = 0; i5 < length; i5++) {
            long j = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i5 * 64) + i10;
                if (i11 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i11)) {
                    j |= 1 << i10;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static f5 W(f5 f5Var, byte[] bArr) {
        z4 z4Var;
        z4 z4Var2 = z4.f5377a;
        if (z4Var2 == null) {
            synchronized (z4.class) {
                try {
                    z4Var = z4.f5377a;
                    if (z4Var == null) {
                        e6 e6Var = e6.f5030c;
                        z4Var = d5.d0();
                        z4.f5377a = z4Var;
                    }
                } finally {
                }
            }
            z4Var2 = z4Var;
        }
        if (z4Var2 != null) {
            f5Var.getClass();
            f5Var.h(bArr, bArr.length, z4Var2);
            return f5Var;
        }
        f5Var.getClass();
        int length = bArr.length;
        z4 z4Var3 = z4.f5377a;
        e6 e6Var2 = e6.f5030c;
        f5Var.h(bArr, length, z4.f5378b);
        return f5Var;
    }

    public static int X(com.google.android.gms.internal.measurement.h3 h3Var, String str) {
        for (int i5 = 0; i5 < ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).V1(); i5++) {
            if (str.equals(((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).W1(i5).r())) {
                return i5;
            }
        }
        return -1;
    }

    public static Bundle[] Y(m5 m5Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.d3 d3Var = (com.google.android.gms.internal.measurement.d3) it.next();
            if (d3Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.d3 d3Var2 : d3Var.z()) {
                    if (d3Var2.r()) {
                        bundle.putString(d3Var2.q(), d3Var2.s());
                    } else if (d3Var2.t()) {
                        bundle.putLong(d3Var2.q(), d3Var2.u());
                    } else if (d3Var2.x()) {
                        bundle.putDouble(d3Var2.q(), d3Var2.y());
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
    
        r5.add(Z((android.os.Bundle) r8, false));
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
    
        r5.add(Z((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(Z((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap Z(Bundle bundle, boolean z5) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z7 = obj instanceof Parcelable[];
            if (!z7 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    public static zzbg n(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle o3 = o(bVar.f4927c, true);
        String obj2 = (!o3.containsKey("_o") || (obj = o3.get("_o")) == null) ? "app" : obj.toString();
        String g10 = r1.g(bVar.f4925a, r1.f22975a, r1.f22977c);
        if (g10 == null) {
            g10 = bVar.f4925a;
        }
        return new zzbg(g10, new zzbe(o3), obj2, bVar.f4926b);
    }

    public static Bundle o(Map map, boolean z5) {
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
            } else if (z5) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList2.add(o((Map) arrayList.get(i5), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void p(com.google.android.gms.internal.measurement.z2 z2Var, String str, Long l6) {
        List i5 = z2Var.i();
        int i10 = 0;
        while (true) {
            if (i10 >= i5.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.d3) i5.get(i10)).q())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.c3 B = com.google.android.gms.internal.measurement.d3.B();
        B.i(str);
        B.k(l6.longValue());
        if (i10 < 0) {
            z2Var.m(B);
        } else {
            z2Var.b();
            ((com.google.android.gms.internal.measurement.a3) z2Var.f5041b).A(i10, (com.google.android.gms.internal.measurement.d3) B.f());
        }
    }

    public static final Bundle q(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.d3 d3Var = (com.google.android.gms.internal.measurement.d3) it.next();
            String q = d3Var.q();
            if (d3Var.x()) {
                bundle.putDouble(q, d3Var.y());
            } else if (d3Var.v()) {
                bundle.putFloat(q, d3Var.w());
            } else if (d3Var.r()) {
                bundle.putString(q, d3Var.s());
            } else if (d3Var.t()) {
                bundle.putLong(q, d3Var.u());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.d3 r(com.google.android.gms.internal.measurement.a3 a3Var, String str) {
        for (com.google.android.gms.internal.measurement.d3 d3Var : a3Var.p()) {
            if (d3Var.q().equals(str)) {
                return d3Var;
            }
        }
        return null;
    }

    public static final Serializable s(com.google.android.gms.internal.measurement.a3 a3Var, String str) {
        com.google.android.gms.internal.measurement.d3 r5 = r(a3Var, str);
        if (r5 == null) {
            return null;
        }
        return y(r5);
    }

    public static final void v(int i5, StringBuilder sb2) {
        for (int i10 = 0; i10 < i5; i10++) {
            sb2.append("  ");
        }
    }

    public static final void w(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String x(boolean z5, boolean z7, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        if (z5) {
            sb2.append("Dynamic ");
        }
        if (z7) {
            sb2.append("Sequence ");
        }
        if (z10) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable y(com.google.android.gms.internal.measurement.d3 d3Var) {
        if (d3Var.r()) {
            return d3Var.s();
        }
        if (d3Var.t()) {
            return Long.valueOf(d3Var.u());
        }
        if (d3Var.x()) {
            return Double.valueOf(d3Var.y());
        }
        if (d3Var.A() > 0) {
            return Y((m5) d3Var.z());
        }
        return null;
    }

    public static final void z(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(StringUtils.COMMA);
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                w(builder, str3, string, set);
            }
        }
    }

    public boolean D() {
        k();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((f1) this.f3328a).f22740a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public void H(com.google.android.gms.internal.measurement.q3 q3Var, Object obj) {
        g6.v.h(obj);
        q3Var.b();
        ((com.google.android.gms.internal.measurement.r3) q3Var.f5041b).E();
        q3Var.b();
        ((com.google.android.gms.internal.measurement.r3) q3Var.f5041b).G();
        q3Var.b();
        ((com.google.android.gms.internal.measurement.r3) q3Var.f5041b).I();
        if (obj instanceof String) {
            q3Var.b();
            ((com.google.android.gms.internal.measurement.r3) q3Var.f5041b).D((String) obj);
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            q3Var.b();
            ((com.google.android.gms.internal.measurement.r3) q3Var.f5041b).F(longValue);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            q3Var.b();
            ((com.google.android.gms.internal.measurement.r3) q3Var.f5041b).H(doubleValue);
        } else {
            n0 n0Var = ((f1) this.f3328a).f22745f;
            f1.m(n0Var);
            n0Var.f22903f.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void I(String str, m3 m3Var, com.google.android.gms.internal.measurement.g3 g3Var, p0 p0Var) {
        String str2;
        URL url;
        byte[] a7;
        d1 d1Var;
        Map map;
        String str3 = m3Var.f22886a;
        f1 f1Var = (f1) this.f3328a;
        j();
        k();
        try {
            url = new URI(str3).toURL();
            this.f22859b.j0();
            a7 = g3Var.a();
            d1Var = f1Var.f22746g;
            f1.m(d1Var);
            map = m3Var.f22887b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            d1Var.v(new q0(this, str2, url, a7, map, p0Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.c(n0.r(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
        }
    }

    public void J(com.google.android.gms.internal.measurement.c3 c3Var, Object obj) {
        c3Var.b();
        ((com.google.android.gms.internal.measurement.d3) c3Var.f5041b).E();
        c3Var.b();
        ((com.google.android.gms.internal.measurement.d3) c3Var.f5041b).G();
        c3Var.b();
        ((com.google.android.gms.internal.measurement.d3) c3Var.f5041b).I();
        c3Var.b();
        ((com.google.android.gms.internal.measurement.d3) c3Var.f5041b).L();
        if (obj instanceof String) {
            c3Var.j((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c3Var.k(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            c3Var.b();
            ((com.google.android.gms.internal.measurement.d3) c3Var.f5041b).H(doubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            n0 n0Var = ((f1) this.f3328a).f22745f;
            f1.m(n0Var);
            n0Var.f22903f.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.c3 B = com.google.android.gms.internal.measurement.d3.B();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.c3 B2 = com.google.android.gms.internal.measurement.d3.B();
                    B2.i(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        B2.k(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        B2.j((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double doubleValue2 = ((Double) obj2).doubleValue();
                        B2.b();
                        ((com.google.android.gms.internal.measurement.d3) B2.f5041b).H(doubleValue2);
                    }
                    B.b();
                    ((com.google.android.gms.internal.measurement.d3) B.f5041b).J((com.google.android.gms.internal.measurement.d3) B2.f());
                }
                if (((com.google.android.gms.internal.measurement.d3) B.f5041b).A() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.d3) B.f());
                }
            }
        }
        c3Var.b();
        ((com.google.android.gms.internal.measurement.d3) c3Var.f5041b).K(arrayList);
    }

    public zzoh K(String str, com.google.android.gms.internal.measurement.h3 h3Var, com.google.android.gms.internal.measurement.z2 z2Var, String str2) {
        int indexOf;
        o8.a();
        f1 f1Var = (f1) this.f3328a;
        e eVar = f1Var.f22743d;
        if (!eVar.t(str, x.Q0)) {
            return null;
        }
        f1Var.f22749k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        String[] split = eVar.p(str, x.f23222v0).split(StringUtils.COMMA);
        HashSet hashSet = new HashSet(split.length);
        for (String str3 : split) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        r3 r3Var = this.f22859b;
        n3 n3Var = r3Var.j;
        z0 z0Var = r3Var.f22987a;
        z0 z0Var2 = n3Var.f22859b.f22987a;
        r3.U(z0Var2);
        String w10 = z0Var2.w(str);
        Uri.Builder builder = new Uri.Builder();
        e eVar2 = ((f1) n3Var.f3328a).f22743d;
        builder.scheme(eVar2.p(str, x.f23209o0));
        if (TextUtils.isEmpty(w10)) {
            builder.authority(eVar2.p(str, x.f23211p0));
        } else {
            String p10 = eVar2.p(str, x.f23211p0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(w10).length() + 1 + String.valueOf(p10).length());
            sb2.append(w10);
            sb2.append(".");
            sb2.append(p10);
            builder.authority(sb2.toString());
        }
        builder.path(eVar2.p(str, x.f23212q0));
        w(builder, "gmp_app_id", ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).E(), unmodifiableSet);
        eVar.o();
        w(builder, "gmp_version", String.valueOf(133005L), unmodifiableSet);
        String y5 = ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).y();
        w wVar = x.T0;
        if (eVar.t(str, wVar)) {
            r3.U(z0Var);
            if (z0Var.C(str)) {
                y5 = "";
            }
        }
        w(builder, "app_instance_id", y5, unmodifiableSet);
        w(builder, "rdid", ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).v(), unmodifiableSet);
        w(builder, "bundle_id", h3Var.p(), unmodifiableSet);
        String o3 = z2Var.o();
        String g10 = r1.g(o3, r1.f22977c, r1.f22975a);
        if (true != TextUtils.isEmpty(g10)) {
            o3 = g10;
        }
        w(builder, "app_event_name", o3, unmodifiableSet);
        w(builder, "app_version", String.valueOf(((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).K()), unmodifiableSet);
        String i22 = ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).i2();
        if (eVar.t(str, wVar)) {
            r3.U(z0Var);
            if (z0Var.B(str) && !TextUtils.isEmpty(i22) && (indexOf = i22.indexOf(".")) != -1) {
                i22 = i22.substring(0, indexOf);
            }
        }
        w(builder, CommonUrlParts.OS_VERSION, i22, unmodifiableSet);
        w(builder, "timestamp", String.valueOf(z2Var.p()), unmodifiableSet);
        if (((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).x()) {
            w(builder, "lat", "1", unmodifiableSet);
        }
        w(builder, "privacy_sandbox_version", String.valueOf(((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).G0()), unmodifiableSet);
        w(builder, "trigger_uri_source", "1", unmodifiableSet);
        w(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), unmodifiableSet);
        w(builder, "request_uuid", str2, unmodifiableSet);
        List<com.google.android.gms.internal.measurement.d3> i5 = z2Var.i();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.d3 d3Var : i5) {
            String q = d3Var.q();
            if (d3Var.x()) {
                bundle.putString(q, String.valueOf(d3Var.y()));
            } else if (d3Var.v()) {
                bundle.putString(q, String.valueOf(d3Var.w()));
            } else if (d3Var.r()) {
                bundle.putString(q, d3Var.s());
            } else if (d3Var.t()) {
                bundle.putString(q, String.valueOf(d3Var.u()));
            }
        }
        z(builder, eVar.p(str, x.f23220u0).split("\\|"), bundle, unmodifiableSet);
        List<com.google.android.gms.internal.measurement.r3> unmodifiableList = DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).U1());
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.r3 r3Var2 : unmodifiableList) {
            String r5 = r3Var2.r();
            if (r3Var2.y()) {
                bundle2.putString(r5, String.valueOf(r3Var2.z()));
            } else if (r3Var2.w()) {
                bundle2.putString(r5, String.valueOf(r3Var2.x()));
            } else if (r3Var2.s()) {
                bundle2.putString(r5, r3Var2.t());
            } else if (r3Var2.u()) {
                bundle2.putString(r5, String.valueOf(r3Var2.v()));
            }
        }
        z(builder, eVar.p(str, x.f23218t0).split("\\|"), bundle2, unmodifiableSet);
        w(builder, "dma", true != ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).D0() ? CommonUrlParts.Values.FALSE_INTEGER : "1", unmodifiableSet);
        if (!((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).F0().isEmpty()) {
            w(builder, "dma_cps", ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).F0(), unmodifiableSet);
        }
        if (((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).L0()) {
            com.google.android.gms.internal.measurement.n2 M0 = ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).M0();
            if (!M0.z().isEmpty()) {
                w(builder, "dl_gclid", M0.z(), unmodifiableSet);
            }
            if (!M0.B().isEmpty()) {
                w(builder, "dl_gbraid", M0.B(), unmodifiableSet);
            }
            if (!M0.D().isEmpty()) {
                w(builder, "dl_gs", M0.D(), unmodifiableSet);
            }
            if (M0.F() > 0) {
                w(builder, "dl_ss_ts", String.valueOf(M0.F()), unmodifiableSet);
            }
            if (!M0.H().isEmpty()) {
                w(builder, "mr_gclid", M0.H(), unmodifiableSet);
            }
            if (!M0.J().isEmpty()) {
                w(builder, "mr_gbraid", M0.J(), unmodifiableSet);
            }
            if (!M0.L().isEmpty()) {
                w(builder, "mr_gs", M0.L(), unmodifiableSet);
            }
            if (M0.N() > 0) {
                w(builder, "mr_click_ts", String.valueOf(M0.N()), unmodifiableSet);
            }
        }
        return new zzoh(builder.build().toString(), currentTimeMillis, 1);
    }

    public com.google.android.gms.internal.measurement.a3 L(kh.l lVar) {
        com.google.android.gms.internal.measurement.z2 z5 = com.google.android.gms.internal.measurement.a3.z();
        long j = lVar.f19128c;
        z5.b();
        ((com.google.android.gms.internal.measurement.a3) z5.f5041b).H(j);
        zzbe zzbeVar = (zzbe) lVar.f19132g;
        Objects.requireNonNull(zzbeVar);
        Bundle bundle = zzbeVar.f5796a;
        for (String str : bundle.keySet()) {
            com.google.android.gms.internal.measurement.c3 B = com.google.android.gms.internal.measurement.d3.B();
            B.i(str);
            Object obj = bundle.get(str);
            g6.v.h(obj);
            J(B, obj);
            z5.m(B);
        }
        String str2 = (String) lVar.f19131f;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            com.google.android.gms.internal.measurement.c3 B2 = com.google.android.gms.internal.measurement.d3.B();
            B2.i("_o");
            B2.j(str2);
            z5.l((com.google.android.gms.internal.measurement.d3) B2.f());
        }
        return (com.google.android.gms.internal.measurement.a3) z5.f();
    }

    public String M(com.google.android.gms.internal.measurement.g3 g3Var) {
        com.google.android.gms.internal.measurement.q2 I0;
        StringBuilder b10 = v.f.b("\nbatch {\n");
        if (g3Var.u()) {
            B(b10, 0, "upload_subdomain", g3Var.v());
        }
        if (g3Var.s()) {
            B(b10, 0, "sgtm_join_id", g3Var.t());
        }
        for (com.google.android.gms.internal.measurement.i3 i3Var : g3Var.p()) {
            if (i3Var != null) {
                v(1, b10);
                b10.append("bundle {\n");
                if (i3Var.P()) {
                    B(b10, 1, CommonUrlParts.PROTOCOL_VERSION, Integer.valueOf(i3Var.P0()));
                }
                f1 f1Var = (f1) this.f3328a;
                e eVar = f1Var.f22743d;
                i0 i0Var = f1Var.j;
                if (eVar.t(i3Var.p(), x.N0) && i3Var.v0()) {
                    B(b10, 1, "session_stitching_token", i3Var.w0());
                }
                B(b10, 1, "platform", i3Var.h2());
                if (i3Var.r()) {
                    B(b10, 1, "gmp_version", Long.valueOf(i3Var.s()));
                }
                if (i3Var.t()) {
                    B(b10, 1, "uploading_gmp_version", Long.valueOf(i3Var.u()));
                }
                if (i3Var.r0()) {
                    B(b10, 1, "dynamite_version", Long.valueOf(i3Var.s0()));
                }
                if (i3Var.L()) {
                    B(b10, 1, "config_version", Long.valueOf(i3Var.M()));
                }
                B(b10, 1, "gmp_app_id", i3Var.E());
                B(b10, 1, CommonUrlParts.APP_ID, i3Var.p());
                B(b10, 1, "app_version", i3Var.q());
                if (i3Var.J()) {
                    B(b10, 1, "app_version_major", Integer.valueOf(i3Var.K()));
                }
                B(b10, 1, "firebase_instance_id", i3Var.I());
                if (i3Var.z()) {
                    B(b10, 1, "dev_cert_hash", Long.valueOf(i3Var.A()));
                }
                B(b10, 1, "app_store", i3Var.n2());
                if (i3Var.X1()) {
                    B(b10, 1, "upload_timestamp_millis", Long.valueOf(i3Var.Y1()));
                }
                if (i3Var.Z1()) {
                    B(b10, 1, "start_timestamp_millis", Long.valueOf(i3Var.a2()));
                }
                if (i3Var.b2()) {
                    B(b10, 1, "end_timestamp_millis", Long.valueOf(i3Var.c2()));
                }
                if (i3Var.d2()) {
                    B(b10, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(i3Var.e2()));
                }
                if (i3Var.f2()) {
                    B(b10, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(i3Var.g2()));
                }
                B(b10, 1, "app_instance_id", i3Var.y());
                B(b10, 1, "resettable_device_id", i3Var.v());
                B(b10, 1, "ds_id", i3Var.O());
                if (i3Var.w()) {
                    B(b10, 1, "limited_ad_tracking", Boolean.valueOf(i3Var.x()));
                }
                B(b10, 1, CommonUrlParts.OS_VERSION, i3Var.i2());
                B(b10, 1, "device_model", i3Var.j2());
                B(b10, 1, "user_default_language", i3Var.k2());
                if (i3Var.l2()) {
                    B(b10, 1, "time_zone_offset_minutes", Integer.valueOf(i3Var.m2()));
                }
                if (i3Var.B()) {
                    B(b10, 1, "bundle_sequential_index", Integer.valueOf(i3Var.C()));
                }
                if (i3Var.J0()) {
                    B(b10, 1, "delivery_index", Integer.valueOf(i3Var.K0()));
                }
                if (i3Var.F()) {
                    B(b10, 1, "service_upload", Boolean.valueOf(i3Var.G()));
                }
                B(b10, 1, "health_monitor", i3Var.D());
                if (i3Var.p0()) {
                    B(b10, 1, "retry_counter", Integer.valueOf(i3Var.q0()));
                }
                if (i3Var.t0()) {
                    B(b10, 1, "consent_signals", i3Var.u0());
                }
                if (i3Var.C0()) {
                    B(b10, 1, "is_dma_region", Boolean.valueOf(i3Var.D0()));
                }
                if (i3Var.E0()) {
                    B(b10, 1, "core_platform_services", i3Var.F0());
                }
                if (i3Var.A0()) {
                    B(b10, 1, "consent_diagnostics", i3Var.B0());
                }
                if (i3Var.x0()) {
                    B(b10, 1, "target_os_version", Long.valueOf(i3Var.y0()));
                }
                o8.a();
                if (f1Var.f22743d.t(i3Var.p(), x.Q0)) {
                    B(b10, 1, "ad_services_version", Integer.valueOf(i3Var.G0()));
                    if (i3Var.H0() && (I0 = i3Var.I0()) != null) {
                        v(2, b10);
                        b10.append("attribution_eligibility_status {\n");
                        B(b10, 2, "eligible", Boolean.valueOf(I0.p()));
                        B(b10, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(I0.q()));
                        B(b10, 2, "pre_r", Boolean.valueOf(I0.r()));
                        B(b10, 2, "r_extensions_too_old", Boolean.valueOf(I0.s()));
                        B(b10, 2, "adservices_extension_too_old", Boolean.valueOf(I0.t()));
                        B(b10, 2, "ad_storage_not_allowed", Boolean.valueOf(I0.u()));
                        B(b10, 2, "measurement_manager_disabled", Boolean.valueOf(I0.v()));
                        v(2, b10);
                        b10.append("}\n");
                    }
                }
                if (i3Var.L0()) {
                    com.google.android.gms.internal.measurement.n2 M0 = i3Var.M0();
                    v(2, b10);
                    b10.append("ad_campaign_info {\n");
                    if (M0.y()) {
                        B(b10, 2, "deep_link_gclid", M0.z());
                    }
                    if (M0.A()) {
                        B(b10, 2, "deep_link_gbraid", M0.B());
                    }
                    if (M0.C()) {
                        B(b10, 2, "deep_link_gad_source", M0.D());
                    }
                    if (M0.E()) {
                        B(b10, 2, "deep_link_session_millis", Long.valueOf(M0.F()));
                    }
                    if (M0.G()) {
                        B(b10, 2, "market_referrer_gclid", M0.H());
                    }
                    if (M0.I()) {
                        B(b10, 2, "market_referrer_gbraid", M0.J());
                    }
                    if (M0.K()) {
                        B(b10, 2, "market_referrer_gad_source", M0.L());
                    }
                    if (M0.M()) {
                        B(b10, 2, "market_referrer_click_millis", Long.valueOf(M0.N()));
                    }
                    v(2, b10);
                    b10.append("}\n");
                }
                if (i3Var.Q()) {
                    B(b10, 1, "batching_timestamp_millis", Long.valueOf(i3Var.R()));
                }
                if (i3Var.N0()) {
                    com.google.android.gms.internal.measurement.p3 O0 = i3Var.O0();
                    v(2, b10);
                    b10.append("sgtm_diagnostics {\n");
                    int t3 = O0.t();
                    B(b10, 2, "upload_type", t3 != 1 ? t3 != 2 ? t3 != 3 ? t3 != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    B(b10, 2, "client_upload_eligibility", androidx.appcompat.widget.c1.A(O0.p()));
                    int u10 = O0.u();
                    B(b10, 2, "service_upload_eligibility", u10 != 1 ? u10 != 2 ? u10 != 3 ? u10 != 4 ? u10 != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    v(2, b10);
                    b10.append("}\n");
                }
                if (i3Var.S()) {
                    com.google.android.gms.internal.measurement.w2 T = i3Var.T();
                    v(2, b10);
                    b10.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.v2 v2Var : T.p()) {
                        v(3, b10);
                        b10.append("limited_data_modes {\n");
                        int q = v2Var.q();
                        B(b10, 3, "type", q != 1 ? q != 2 ? q != 3 ? q != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int r5 = v2Var.r();
                        B(b10, 3, "mode", r5 != 1 ? r5 != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        v(3, b10);
                        b10.append("}\n");
                    }
                    v(2, b10);
                    b10.append("}\n");
                }
                m5<com.google.android.gms.internal.measurement.r3> U1 = i3Var.U1();
                if (U1 != null) {
                    for (com.google.android.gms.internal.measurement.r3 r3Var : U1) {
                        if (r3Var != null) {
                            v(2, b10);
                            b10.append("user_property {\n");
                            B(b10, 2, "set_timestamp_millis", r3Var.p() ? Long.valueOf(r3Var.q()) : null);
                            B(b10, 2, "name", i0Var.c(r3Var.r()));
                            B(b10, 2, "string_value", r3Var.t());
                            B(b10, 2, "int_value", r3Var.u() ? Long.valueOf(r3Var.v()) : null);
                            B(b10, 2, "double_value", r3Var.y() ? Double.valueOf(r3Var.z()) : null);
                            v(2, b10);
                            b10.append("}\n");
                        }
                    }
                }
                m5<com.google.android.gms.internal.measurement.s2> H = i3Var.H();
                if (H != null) {
                    for (com.google.android.gms.internal.measurement.s2 s2Var : H) {
                        if (s2Var != null) {
                            v(2, b10);
                            b10.append("audience_membership {\n");
                            if (s2Var.p()) {
                                B(b10, 2, "audience_id", Integer.valueOf(s2Var.q()));
                            }
                            if (s2Var.u()) {
                                B(b10, 2, "new_audience", Boolean.valueOf(s2Var.v()));
                            }
                            A(b10, "current_data", s2Var.r());
                            if (s2Var.s()) {
                                A(b10, "previous_data", s2Var.t());
                            }
                            v(2, b10);
                            b10.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.a3> P1 = i3Var.P1();
                if (P1 != null) {
                    for (com.google.android.gms.internal.measurement.a3 a3Var : P1) {
                        if (a3Var != null) {
                            v(2, b10);
                            b10.append("event {\n");
                            B(b10, 2, "name", i0Var.a(a3Var.s()));
                            if (a3Var.t()) {
                                B(b10, 2, "timestamp_millis", Long.valueOf(a3Var.u()));
                            }
                            if (a3Var.v()) {
                                B(b10, 2, "previous_timestamp_millis", Long.valueOf(a3Var.w()));
                            }
                            if (a3Var.x()) {
                                B(b10, 2, "count", Integer.valueOf(a3Var.y()));
                            }
                            if (a3Var.q() != 0) {
                                t(b10, 2, (m5) a3Var.p());
                            }
                            v(2, b10);
                            b10.append("}\n");
                        }
                    }
                }
                v(1, b10);
                b10.append("}\n");
            }
        }
        b10.append("} // End-of-batch\n");
        return b10.toString();
    }

    public String N(com.google.android.gms.internal.measurement.u1 u1Var) {
        StringBuilder b10 = v.f.b("\nproperty_filter {\n");
        if (u1Var.p()) {
            B(b10, 0, "filter_id", Integer.valueOf(u1Var.q()));
        }
        B(b10, 0, "property_name", ((f1) this.f3328a).j.c(u1Var.r()));
        String x10 = x(u1Var.t(), u1Var.u(), u1Var.w());
        if (!x10.isEmpty()) {
            B(b10, 0, "filter_type", x10);
        }
        u(b10, 1, u1Var.s());
        b10.append("}\n");
        return b10.toString();
    }

    public Parcelable O(byte[] bArr, Parcelable.Creator creator) {
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
            } catch (h6.a unused) {
                n0 n0Var = ((f1) this.f3328a).f22745f;
                f1.m(n0Var);
                n0Var.f22903f.a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    public List S(l5 l5Var, List list) {
        int i5;
        f1 f1Var = (f1) this.f3328a;
        ArrayList arrayList = new ArrayList(l5Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                n0 n0Var = f1Var.f22745f;
                f1.m(n0Var);
                n0Var.f22906i.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    n0 n0Var2 = f1Var.f22745f;
                    f1.m(n0Var2);
                    n0Var2.f22906i.c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i5 = size;
            size = i10;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i5);
    }

    public boolean T(long j, long j6) {
        if (j == 0 || j6 <= 0) {
            return true;
        }
        ((f1) this.f3328a).f22749k.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j6;
    }

    public long U(byte[] bArr) {
        g6.v.h(bArr);
        f1 f1Var = (f1) this.f3328a;
        v3 v3Var = f1Var.f22748i;
        f1.k(v3Var);
        v3Var.j();
        MessageDigest A = v3.A();
        if (A != null) {
            return v3.B(A.digest(bArr));
        }
        n0 n0Var = f1Var.f22745f;
        f1.m(n0Var);
        n0Var.f22903f.a("Failed to get MD5");
        return 0L;
    }

    public byte[] V(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            n0 n0Var = ((f1) this.f3328a).f22745f;
            f1.m(n0Var);
            n0Var.f22903f.b(e7, "Failed to gzip content");
            throw e7;
        }
    }

    @Override // s7.l3
    public final void m() {
        int i5 = this.f22974d;
    }

    public void t(StringBuilder sb2, int i5, m5 m5Var) {
        if (m5Var == null) {
            return;
        }
        int i10 = i5 + 1;
        Iterator it = m5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.d3 d3Var = (com.google.android.gms.internal.measurement.d3) it.next();
            if (d3Var != null) {
                v(i10, sb2);
                sb2.append("param {\n");
                B(sb2, i10, "name", d3Var.p() ? ((f1) this.f3328a).j.b(d3Var.q()) : null);
                B(sb2, i10, "string_value", d3Var.r() ? d3Var.s() : null);
                B(sb2, i10, "int_value", d3Var.t() ? Long.valueOf(d3Var.u()) : null);
                B(sb2, i10, "double_value", d3Var.x() ? Double.valueOf(d3Var.y()) : null);
                if (d3Var.A() > 0) {
                    t(sb2, i10, (m5) d3Var.z());
                }
                v(i10, sb2);
                sb2.append("}\n");
            }
        }
    }

    public void u(StringBuilder sb2, int i5, com.google.android.gms.internal.measurement.p1 p1Var) {
        String str;
        if (p1Var == null) {
            return;
        }
        v(i5, sb2);
        sb2.append("filter {\n");
        if (p1Var.t()) {
            B(sb2, i5, "complement", Boolean.valueOf(p1Var.u()));
        }
        if (p1Var.v()) {
            B(sb2, i5, "param_name", ((f1) this.f3328a).j.b(p1Var.w()));
        }
        if (p1Var.p()) {
            int i10 = i5 + 1;
            com.google.android.gms.internal.measurement.v1 q = p1Var.q();
            if (q != null) {
                v(i10, sb2);
                sb2.append("string_filter {\n");
                if (q.p()) {
                    switch (q.x()) {
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
                    B(sb2, i10, "match_type", str);
                }
                if (q.q()) {
                    B(sb2, i10, "expression", q.r());
                }
                if (q.s()) {
                    B(sb2, i10, "case_sensitive", Boolean.valueOf(q.t()));
                }
                if (q.v() > 0) {
                    v(i5 + 2, sb2);
                    sb2.append("expression_list {\n");
                    for (String str2 : q.u()) {
                        v(i5 + 3, sb2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                v(i10, sb2);
                sb2.append("}\n");
            }
        }
        if (p1Var.r()) {
            C(sb2, i5 + 1, "number_filter", p1Var.s());
        }
        v(i5, sb2);
        sb2.append("}\n");
    }

    private final void E() {
    }

    private final void F() {
    }

    private final void G() {
    }
}
