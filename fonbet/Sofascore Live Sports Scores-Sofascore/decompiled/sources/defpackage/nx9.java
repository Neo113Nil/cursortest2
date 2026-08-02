package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.facebook.appevents.p;
import com.facebook.internal.o;
import com.facebook.internal.q;
import com.facebook.internal.u;
import com.facebook.internal.x;
import com.facebook.w;
import com.moloco.sdk.internal.publisher.h0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nx9 {
    public static String d;
    public static final nx9 a = new nx9();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final AtomicBoolean e = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134 A[Catch: all -> 0x0106, TryCatch #2 {all -> 0x0106, blocks: (B:33:0x00d5, B:35:0x00dc, B:38:0x00ea, B:45:0x00fa, B:49:0x0109, B:52:0x0126, B:56:0x0134, B:64:0x0122, B:65:0x00e1, B:68:0x00f1, B:80:0x0157, B:81:0x015c, B:84:0x016c, B:86:0x0173, B:87:0x017a, B:90:0x0193, B:92:0x019b, B:93:0x01a3, B:95:0x01ab, B:97:0x01ea, B:101:0x01c1, B:103:0x01c9, B:104:0x01d1, B:106:0x01d9, B:116:0x01f0, B:117:0x01f6, B:119:0x01fc, B:121:0x0204, B:124:0x021c, B:125:0x0221, B:127:0x0227, B:131:0x0243, B:144:0x024b, B:150:0x0251, B:147:0x0259, B:134:0x0261, B:141:0x0267, B:137:0x026f, B:156:0x020f, B:61:0x011c), top: B:32:0x00d5, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r21v4, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized Bundle c(List list, long j, boolean z, List list2) {
        Bundle bundle;
        Bundle bundle2;
        ?? r2;
        Long l;
        boolean z2;
        ?? r0;
        Object obj;
        long j2;
        Object b2;
        synchronized (nx9.class) {
            Bundle bundle3 = null;
            bundle3 = null;
            if (cw3.a.contains(nx9.class)) {
                return null;
            }
            try {
                list.getClass();
                list2.getClass();
                if (list2.isEmpty()) {
                    return null;
                }
                if (list.size() != list2.size()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                ?? r7 = 0;
                int i = 0;
                while (i < size) {
                    xw9 xw9Var = (xw9) list.get(i);
                    Pair pair = (Pair) list2.get(i);
                    Bundle bundle4 = (Bundle) pair.a;
                    p pVar = (p) pair.b;
                    int i2 = i;
                    xw9 xw9Var2 = new xw9(xw9Var.a, new BigDecimal(String.valueOf(xw9Var.b)).setScale(2, RoundingMode.HALF_UP).doubleValue(), xw9Var.c);
                    List<Pair> list3 = z ? (List) b.get(xw9Var2) : (List) c.get(xw9Var2);
                    if (list3 == null || list3.isEmpty()) {
                        bundle2 = bundle3;
                        Bundle bundle5 = bundle2;
                        r2 = bundle5;
                        l = r2;
                        z2 = false;
                        r0 = bundle5;
                    } else {
                        Object obj2 = bundle3;
                        Object obj3 = obj2;
                        ?? r21 = obj3;
                        z2 = false;
                        Object obj4 = obj2;
                        Bundle bundle6 = bundle3;
                        for (Pair pair2 : list3) {
                            long longValue = ((Number) pair2.a).longValue();
                            Pair pair3 = (Pair) pair2.b;
                            Bundle bundle7 = (Bundle) pair3.a;
                            p pVar2 = (p) pair3.b;
                            long abs = Math.abs(j - longValue);
                            List list4 = kx9.a;
                            u b3 = x.b(w.b());
                            if (b3 != null) {
                                bundle = bundle6;
                                try {
                                    obj = b3.y;
                                } catch (Throwable th) {
                                    th = th;
                                    cw3.a(nx9.class, th);
                                    return bundle;
                                }
                            } else {
                                bundle = bundle6;
                                obj = bundle6;
                            }
                            if (obj != null) {
                                Long l2 = b3.y;
                                if (l2 != null && l2.longValue() == 0) {
                                }
                                j2 = b3.y.longValue();
                                if (abs <= j2) {
                                    if (r21 != 0 && longValue >= r21.longValue()) {
                                    }
                                    nx9 nx9Var = a;
                                    boolean z3 = !z;
                                    if (!cw3.a.contains(nx9.class)) {
                                        try {
                                            obj4 = nx9Var.b(bundle4, pVar, bundle7, pVar2, z3, false);
                                        } catch (Throwable th2) {
                                            cw3.a(nx9.class, th2);
                                        }
                                        b2 = a.b(bundle4, pVar, bundle7, pVar2, z3, true);
                                        if (b2 != null) {
                                            obj3 = b2;
                                        }
                                        if (obj4 == null) {
                                            r21 = Long.valueOf(longValue);
                                            arrayList.add(new Pair(xw9Var2, Long.valueOf(longValue)));
                                            z2 = true;
                                        }
                                    }
                                    obj4 = bundle;
                                    b2 = a.b(bundle4, pVar, bundle7, pVar2, z3, true);
                                    if (b2 != null) {
                                    }
                                    if (obj4 == null) {
                                    }
                                }
                                bundle6 = bundle;
                                obj4 = obj4;
                                r21 = r21;
                            }
                            j2 = kx9.c;
                            if (abs <= j2) {
                            }
                            bundle6 = bundle;
                            obj4 = obj4;
                            r21 = r21;
                        }
                        bundle2 = bundle6;
                        r2 = obj3;
                        r0 = obj4;
                        l = r21;
                    }
                    if (r2 != null) {
                        if (r7 == 0) {
                            r7 = new Bundle();
                        }
                        r7.putString("fb_iap_test_dedup_result", "1");
                        r7.putString("fb_iap_test_dedup_key_used", r2);
                    }
                    if (z2) {
                        if (r7 == 0) {
                            r7 = new Bundle();
                        }
                        r7.putString("fb_iap_non_deduped_event_time", String.valueOf(l != null ? l.longValue() / 1000 : 0L));
                        r7.putString("fb_iap_actual_dedup_result", "1");
                        r7.putString("fb_iap_actual_dedup_key_used", r0);
                    }
                    if (z && !z2) {
                        ConcurrentHashMap concurrentHashMap = c;
                        if (concurrentHashMap.get(xw9Var2) == null) {
                            concurrentHashMap.put(xw9Var2, new ArrayList());
                        }
                        List list5 = (List) concurrentHashMap.get(xw9Var2);
                        if (list5 != null) {
                            list5.add(new Pair(Long.valueOf(j), new Pair(bundle4, pVar)));
                        }
                    } else if (!z && !z2) {
                        ConcurrentHashMap concurrentHashMap2 = b;
                        if (concurrentHashMap2.get(xw9Var2) == null) {
                            concurrentHashMap2.put(xw9Var2, new ArrayList());
                        }
                        List list6 = (List) concurrentHashMap2.get(xw9Var2);
                        if (list6 != null) {
                            list6.add(new Pair(Long.valueOf(j), new Pair(bundle4, pVar)));
                        }
                    }
                    i = i2 + 1;
                    bundle3 = bundle2;
                    r7 = r7;
                }
                bundle = bundle3;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair4 = (Pair) it.next();
                    List list7 = z ? (List) b.get(pair4.a) : (List) c.get(pair4.a);
                    if (list7 != null) {
                        Iterator it2 = list7.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            int i4 = i3 + 1;
                            if (((Number) ((Pair) it2.next()).a).longValue() == ((Number) pair4.b).longValue()) {
                                list7.remove(i3);
                                break;
                            }
                            i3 = i4;
                        }
                        if (z) {
                            if (list7.isEmpty()) {
                                b.remove(pair4.a);
                            } else {
                                b.put(pair4.a, list7);
                            }
                        } else if (list7.isEmpty()) {
                            c.remove(pair4.a);
                        } else {
                            c.put(pair4.a, list7);
                        }
                    }
                }
                return r7;
            } catch (Throwable th3) {
                th = th3;
                bundle = bundle3;
            }
        }
    }

    public static final void d() {
        if (cw3.a.contains(nx9.class)) {
            return;
        }
        try {
            if (e.get()) {
                int a2 = a.a();
                int C = wt3.C(a2);
                if (C == 1) {
                    zw9.b(2);
                    return;
                }
                if (C != 2) {
                    if (C == 3 && q.b(o.IapLoggingLib5To7)) {
                        bx9.b(a2, w.a());
                        return;
                    }
                    return;
                }
                if (q.b(o.IapLoggingLib2)) {
                    bx9.b(a2, w.a());
                } else {
                    zw9.b(3);
                }
            }
        } catch (Throwable th) {
            cw3.a(nx9.class, th);
        }
    }

    public final int a() {
        String string;
        List split$default;
        Set set = cw3.a;
        if (set.contains(this)) {
            return 0;
        }
        try {
            Context a2 = w.a();
            ApplicationInfo applicationInfo = a2.getPackageManager().getApplicationInfo(a2.getPackageName(), 128);
            applicationInfo.getClass();
            string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
        } catch (Exception unused) {
        } catch (Throwable th) {
            cw3.a(this, th);
            return 0;
        }
        if (string == null) {
            return 1;
        }
        split$default = StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 3, 2, null);
        if (string.length() != 0) {
            String concat = "GPBL.".concat(string);
            if (!set.contains(nx9.class)) {
                try {
                    d = concat;
                } catch (Throwable th2) {
                    cw3.a(nx9.class, th2);
                }
            }
            Integer intOrNull = StringsKt.toIntOrNull((String) split$default.get(0));
            if (intOrNull != null) {
                int intValue = intOrNull.intValue();
                if (intValue == 1) {
                    return 2;
                }
                return intValue < 5 ? 3 : 4;
            }
        }
        return 4;
    }

    public final String b(Bundle bundle, p pVar, Bundle bundle2, p pVar2, boolean z, boolean z2) {
        if (!cw3.a.contains(this)) {
            try {
                List<Pair> c2 = z2 ? kx9.c(z) : kx9.b(z);
                if (c2 != null) {
                    for (Pair pair : c2) {
                        Map map = p.b;
                        Object x = h0.x((String) pair.a, bundle, pVar);
                        String str = x instanceof String ? (String) x : null;
                        if (str != null && str.length() != 0) {
                            for (String str2 : (List) pair.b) {
                                Map map2 = p.b;
                                Object x2 = h0.x(str2, bundle2, pVar2);
                                String str3 = x2 instanceof String ? (String) x2 : null;
                                if (str3 != null && str3.length() != 0 && str3.equals(str)) {
                                    return z ? (String) pair.a : str2;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }
}
