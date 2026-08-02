package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.internal.a0;
import com.facebook.internal.k0;
import com.facebook.internal.x;
import com.facebook.w;
import defpackage.cw3;
import defpackage.ffi;
import defpackage.inb;
import defpackage.jz0;
import defpackage.kx9;
import defpackage.md;
import defpackage.nx9;
import defpackage.o4h;
import defpackage.py1;
import defpackage.qv0;
import defpackage.tef;
import defpackage.xw9;
import defpackage.yjk;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Pair;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l {
    public static ScheduledThreadPoolExecutor c;
    public static volatile String e;
    public static boolean f;
    public final String a;
    public final b b;
    public static final Object d = new Object();
    public static final com.facebook.t g = new com.facebook.t(7);

    public l(String str, String str2) {
        com.facebook.internal.h.k();
        this.a = str;
        Date date = AccessToken.l;
        AccessToken p = g.p();
        if (p == null || new Date().after(p.a) || !(str2 == null || str2.equals(p.h))) {
            if (str2 == null) {
                w.a();
                str2 = w.b();
            }
            this.b = new b(null, str2);
        } else {
            this.b = new b(p.e, w.b());
        }
        j.s();
    }

    public static final String a() {
        if (cw3.a.contains(l.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            cw3.a(l.class, th);
            return null;
        }
    }

    public static final ScheduledThreadPoolExecutor b() {
        if (cw3.a.contains(l.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            cw3.a(l.class, th);
            return null;
        }
    }

    public static final Object c() {
        if (cw3.a.contains(l.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            cw3.a(l.class, th);
            return null;
        }
    }

    public static void f(l lVar, String str, Double d2, Bundle bundle, boolean z, UUID uuid) {
        if (cw3.a.contains(l.class)) {
            return;
        }
        try {
            lVar.e(str, d2, bundle, z, uuid, null);
        } catch (Throwable th) {
            cw3.a(l.class, th);
        }
    }

    public final void d(Bundle bundle, String str) {
        l lVar;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            lVar = this;
            try {
                f(lVar, str, null, bundle, false, md.b());
            } catch (Throwable th) {
                th = th;
                cw3.a(lVar, th);
            }
        } catch (Throwable th2) {
            th = th2;
            lVar = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x008c A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #3 {all -> 0x0038, blocks: (B:5:0x0014, B:12:0x001f, B:14:0x0025, B:16:0x002b, B:18:0x0031, B:21:0x003b, B:23:0x0043, B:25:0x005d, B:28:0x009e, B:30:0x00aa, B:32:0x00b0, B:35:0x00b9, B:36:0x00be, B:37:0x00c2, B:39:0x00c8, B:105:0x00d0, B:44:0x00d8, B:47:0x00df, B:54:0x00e7, B:55:0x0115, B:57:0x0121, B:58:0x0125, B:59:0x0126, B:62:0x0129, B:68:0x014b, B:70:0x0159, B:72:0x0161, B:73:0x0169, B:76:0x0181, B:81:0x018e, B:82:0x0195, B:83:0x0196, B:88:0x0198, B:89:0x019f, B:90:0x01a0, B:99:0x0144, B:107:0x00bc, B:109:0x0064, B:111:0x006e, B:113:0x0074, B:116:0x007d, B:117:0x0082, B:118:0x0086, B:120:0x008c, B:123:0x0094, B:131:0x0080, B:133:0x0049, B:135:0x0051, B:137:0x0057, B:93:0x0137, B:96:0x013c), top: B:4:0x0014, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #3 {all -> 0x0038, blocks: (B:5:0x0014, B:12:0x001f, B:14:0x0025, B:16:0x002b, B:18:0x0031, B:21:0x003b, B:23:0x0043, B:25:0x005d, B:28:0x009e, B:30:0x00aa, B:32:0x00b0, B:35:0x00b9, B:36:0x00be, B:37:0x00c2, B:39:0x00c8, B:105:0x00d0, B:44:0x00d8, B:47:0x00df, B:54:0x00e7, B:55:0x0115, B:57:0x0121, B:58:0x0125, B:59:0x0126, B:62:0x0129, B:68:0x014b, B:70:0x0159, B:72:0x0161, B:73:0x0169, B:76:0x0181, B:81:0x018e, B:82:0x0195, B:83:0x0196, B:88:0x0198, B:89:0x019f, B:90:0x01a0, B:99:0x0144, B:107:0x00bc, B:109:0x0064, B:111:0x006e, B:113:0x0074, B:116:0x007d, B:117:0x0082, B:118:0x0086, B:120:0x008c, B:123:0x0094, B:131:0x0080, B:133:0x0049, B:135:0x0051, B:137:0x0057, B:93:0x0137, B:96:0x013c), top: B:4:0x0014, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121 A[Catch: all -> 0x0038, TryCatch #3 {all -> 0x0038, blocks: (B:5:0x0014, B:12:0x001f, B:14:0x0025, B:16:0x002b, B:18:0x0031, B:21:0x003b, B:23:0x0043, B:25:0x005d, B:28:0x009e, B:30:0x00aa, B:32:0x00b0, B:35:0x00b9, B:36:0x00be, B:37:0x00c2, B:39:0x00c8, B:105:0x00d0, B:44:0x00d8, B:47:0x00df, B:54:0x00e7, B:55:0x0115, B:57:0x0121, B:58:0x0125, B:59:0x0126, B:62:0x0129, B:68:0x014b, B:70:0x0159, B:72:0x0161, B:73:0x0169, B:76:0x0181, B:81:0x018e, B:82:0x0195, B:83:0x0196, B:88:0x0198, B:89:0x019f, B:90:0x01a0, B:99:0x0144, B:107:0x00bc, B:109:0x0064, B:111:0x006e, B:113:0x0074, B:116:0x007d, B:117:0x0082, B:118:0x0086, B:120:0x008c, B:123:0x0094, B:131:0x0080, B:133:0x0049, B:135:0x0051, B:137:0x0057, B:93:0x0137, B:96:0x013c), top: B:4:0x0014, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #3 {all -> 0x0038, blocks: (B:5:0x0014, B:12:0x001f, B:14:0x0025, B:16:0x002b, B:18:0x0031, B:21:0x003b, B:23:0x0043, B:25:0x005d, B:28:0x009e, B:30:0x00aa, B:32:0x00b0, B:35:0x00b9, B:36:0x00be, B:37:0x00c2, B:39:0x00c8, B:105:0x00d0, B:44:0x00d8, B:47:0x00df, B:54:0x00e7, B:55:0x0115, B:57:0x0121, B:58:0x0125, B:59:0x0126, B:62:0x0129, B:68:0x014b, B:70:0x0159, B:72:0x0161, B:73:0x0169, B:76:0x0181, B:81:0x018e, B:82:0x0195, B:83:0x0196, B:88:0x0198, B:89:0x019f, B:90:0x01a0, B:99:0x0144, B:107:0x00bc, B:109:0x0064, B:111:0x006e, B:113:0x0074, B:116:0x007d, B:117:0x0082, B:118:0x0086, B:120:0x008c, B:123:0x0094, B:131:0x0080, B:133:0x0049, B:135:0x0051, B:137:0x0057, B:93:0x0137, B:96:0x013c), top: B:4:0x0014, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014b A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #3 {all -> 0x0038, blocks: (B:5:0x0014, B:12:0x001f, B:14:0x0025, B:16:0x002b, B:18:0x0031, B:21:0x003b, B:23:0x0043, B:25:0x005d, B:28:0x009e, B:30:0x00aa, B:32:0x00b0, B:35:0x00b9, B:36:0x00be, B:37:0x00c2, B:39:0x00c8, B:105:0x00d0, B:44:0x00d8, B:47:0x00df, B:54:0x00e7, B:55:0x0115, B:57:0x0121, B:58:0x0125, B:59:0x0126, B:62:0x0129, B:68:0x014b, B:70:0x0159, B:72:0x0161, B:73:0x0169, B:76:0x0181, B:81:0x018e, B:82:0x0195, B:83:0x0196, B:88:0x0198, B:89:0x019f, B:90:0x01a0, B:99:0x0144, B:107:0x00bc, B:109:0x0064, B:111:0x006e, B:113:0x0074, B:116:0x007d, B:117:0x0082, B:118:0x0086, B:120:0x008c, B:123:0x0094, B:131:0x0080, B:133:0x0049, B:135:0x0051, B:137:0x0057, B:93:0x0137, B:96:0x013c), top: B:4:0x0014, inners: #0, #6 }] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.Currency] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Currency] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(String str, Double d2, Bundle bundle, boolean z, UUID uuid, p pVar) {
        p pVar2;
        Bundle bundle2;
        boolean contains;
        List list;
        Iterator it;
        Double d3;
        List<String> list2;
        String string;
        if (cw3.a.contains(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            if (!z) {
                if (qv0.c()) {
                    if (!str.equals("fb_mobile_purchase")) {
                        if (!str.equals("Subscribe")) {
                            if (str.equals("StartTrial")) {
                            }
                        }
                    }
                    if ((com.facebook.internal.q.b(com.facebook.internal.o.AndroidManualImplicitPurchaseDedupe) && str.equals("fb_mobile_purchase")) || (com.facebook.internal.q.b(com.facebook.internal.o.AndroidManualImplicitSubsDedupe) && (str.equals("Subscribe") || str.equals("StartTrial")))) {
                        List list3 = kx9.a;
                        ?? r2 = 0;
                        if (d2 != null) {
                            d3 = d2;
                        } else {
                            com.facebook.internal.u b = x.b(w.b());
                            if ((b != null ? b.v : null) != null && !b.v.isEmpty()) {
                                list = b.v;
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        d3 = null;
                                        break;
                                    }
                                    String str2 = (String) it.next();
                                    if (bundle != null) {
                                        try {
                                            d3 = Double.valueOf(bundle.getDouble(str2));
                                            break;
                                        } catch (Exception unused) {
                                            continue;
                                        }
                                    }
                                }
                            }
                            list = kx9.b;
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                }
                            }
                        }
                        List list4 = kx9.a;
                        com.facebook.internal.u b2 = x.b(w.b());
                        if ((b2 != null ? b2.u : null) != null && !b2.u.isEmpty()) {
                            list2 = b2.u;
                            for (String str3 : list2) {
                                if (bundle != null) {
                                    try {
                                        string = bundle.getString(str3);
                                    } catch (Exception unused2) {
                                        continue;
                                    }
                                } else {
                                    string = r2;
                                }
                                if (string != null && string.length() != 0) {
                                    r2 = Currency.getInstance(string);
                                    break;
                                }
                            }
                            if (d3 != null && r2 != 0) {
                                Pair a = kx9.a(nx9.c(kotlin.collections.a.c(new xw9(str, d3.doubleValue(), r2)), System.currentTimeMillis(), false, kotlin.collections.a.c(new Pair(bundle, pVar))), bundle, pVar);
                                bundle2 = (Bundle) a.a;
                                pVar2 = (p) a.b;
                                if (com.facebook.internal.s.b("app_events_killswitch", w.b(), false)) {
                                    com.facebook.b bVar = a0.a;
                                    synchronized (w.b) {
                                    }
                                    return;
                                }
                                py1 py1Var = py1.a;
                                if (!cw3.a.contains(py1.class)) {
                                    try {
                                    } catch (Throwable th) {
                                        cw3.a(py1.class, th);
                                    }
                                    if (py1.b) {
                                        contains = py1.c.contains(str);
                                        if (contains) {
                                            Pair o = j.o(bundle2, pVar2, z);
                                            Bundle bundle3 = (Bundle) o.a;
                                            p pVar3 = (p) o.b;
                                            try {
                                                if (!tef.a.c(bundle3)) {
                                                    o4h.b(bundle3, str);
                                                }
                                                jz0.a(bundle3);
                                                inb.C(bundle3, str);
                                                ffi.d(bundle3);
                                                tef.b(bundle3);
                                                yjk.f(bundle3, str);
                                                j.u(new e(this.a, str, d2, bundle3, z, md.j == 0, uuid, pVar3), this.b);
                                                return;
                                            } catch (com.facebook.q e2) {
                                                com.facebook.b bVar2 = a0.a;
                                                e2.toString();
                                                synchronized (w.b) {
                                                    return;
                                                }
                                            } catch (JSONException e3) {
                                                com.facebook.b bVar3 = a0.a;
                                                e3.toString();
                                                synchronized (w.b) {
                                                    return;
                                                }
                                            }
                                        }
                                        return;
                                    }
                                }
                                contains = false;
                                if (contains) {
                                }
                            }
                        }
                        list2 = kx9.a;
                        while (r5.hasNext()) {
                        }
                        if (d3 != null) {
                            Pair a2 = kx9.a(nx9.c(kotlin.collections.a.c(new xw9(str, d3.doubleValue(), r2)), System.currentTimeMillis(), false, kotlin.collections.a.c(new Pair(bundle, pVar))), bundle, pVar);
                            bundle2 = (Bundle) a2.a;
                            pVar2 = (p) a2.b;
                            if (com.facebook.internal.s.b("app_events_killswitch", w.b(), false)) {
                            }
                        }
                    }
                }
            }
            pVar2 = pVar;
            bundle2 = bundle;
            if (com.facebook.internal.s.b("app_events_killswitch", w.b(), false)) {
            }
        } catch (Throwable th2) {
            cw3.a(this, th2);
        }
    }

    public final void g(Bundle bundle, String str) {
        l lVar;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            lVar = this;
            try {
                f(lVar, str, null, bundle, true, md.b());
            } catch (Throwable th) {
                th = th;
                cw3.a(lVar, th);
            }
        } catch (Throwable th2) {
            th = th2;
            lVar = this;
        }
    }

    public final void h(BigDecimal bigDecimal, Currency currency, Bundle bundle, p pVar) {
        l lVar;
        Throwable th;
        if (cw3.a.contains(this)) {
            return;
        }
        if (currency == null) {
            try {
                com.facebook.b bVar = a0.a;
                synchronized (w.b) {
                }
                return;
            } catch (Throwable th2) {
                th = th2;
                lVar = this;
            }
        } else {
            try {
                bundle.putString("fb_currency", currency.getCurrencyCode());
                lVar = this;
                try {
                    lVar.e("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle, true, md.b(), pVar);
                    try {
                        if (j.q() != 2) {
                            i.c(6);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    cw3.a(lVar, th);
                }
            } catch (Throwable th5) {
                th = th5;
                lVar = this;
            }
        }
        cw3.a(lVar, th);
    }

    public l(Context context, String str) {
        this(k0.k(context), str);
    }
}
