package com.apm.insight.b;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.l.c;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.l;
import com.apm.insight.runtime.n;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.mz1;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b {
    private static volatile boolean z = true;
    private c a;
    private final Context b;
    private volatile boolean c;
    private JSONObject g;
    private JSONObject h;
    private JSONArray m;
    private JSONObject n;
    private JSONArray q;
    private JSONArray r;
    private JSONObject s;
    private boolean t;
    private volatile boolean v;
    private long d = -1;
    private File e = null;
    private boolean f = true;
    private String i = "unknown";
    private String j = "unknown";
    private String k = "unknown";
    private String l = "npth_inner_default";
    private int o = 0;
    private long p = -1;
    private final Object u = new Object();
    private long w = -1;
    private long x = 0;
    private final Runnable y = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public final void run() {
            try {
                b.this.g();
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
        }
    };
    private int A = 0;
    private List<Pattern> B = null;
    private Pattern C = null;
    private File D = null;

    public b(Context context) {
        this.b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0202, code lost:
    
        if (r10 != 5) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02aa A[LOOP:2: B:91:0x01ea->B:120:0x02aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b0 A[EDGE_INSN: B:121:0x02b0->B:122:0x02b0 BREAK  A[LOOP:2: B:91:0x01ea->B:120:0x02aa], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03c6 A[EDGE_INSN: B:19:0x03c6->B:20:0x03c6 BREAK  A[LOOP:0: B:2:0x0047->B:37:0x03da], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(String str, JSONObject jSONObject) throws JSONException {
        HashMap hashMap;
        HashMap hashMap2;
        String[] strArr;
        float[] fArr;
        int i;
        char c;
        String str2;
        char c2;
        boolean z2;
        String str3;
        String str4;
        String trim;
        String str5;
        HashMap hashMap3;
        int i2;
        int i3;
        int i4;
        int i5;
        String[] strArr2;
        float floatValue;
        b bVar = this;
        SystemClock.uptimeMillis();
        String[] split = str.split("\n");
        Float valueOf = Float.valueOf(-1.0f);
        int i6 = 0;
        float[] fArr2 = {-1.0f, -1.0f, -1.0f};
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        HashMap hashMap7 = new HashMap();
        HashMap hashMap8 = new HashMap();
        int length = split.length;
        char c3 = 0;
        boolean z3 = false;
        String str6 = "unknown";
        String str7 = str6;
        while (true) {
            if (i6 >= length) {
                hashMap = hashMap5;
                hashMap2 = hashMap7;
                break;
            }
            String str8 = split[i6];
            if (TextUtils.isEmpty(str8)) {
                strArr = split;
                fArr = fArr2;
                i = i6;
                hashMap = hashMap5;
                hashMap2 = hashMap7;
            } else {
                strArr = split;
                fArr = fArr2;
                if (c3 == 0) {
                    c = c3;
                    i = i6;
                    hashMap = hashMap5;
                    hashMap2 = hashMap7;
                    str2 = str6;
                    String trim2 = str8.trim();
                    if (trim2.startsWith("tag:")) {
                        str6 = trim2.replace("tag:", "").trim();
                        c2 = 4;
                        c3 = 1;
                        if (c3 < c2) {
                        }
                    }
                    str6 = str2;
                    c3 = c;
                } else if (c3 == 1) {
                    c = c3;
                    i = i6;
                    hashMap = hashMap5;
                    hashMap2 = hashMap7;
                    str8 = str8.trim();
                    String lowerCase = str8.toLowerCase();
                    if (lowerCase.startsWith("shortmsg")) {
                        str8.substring(str8.indexOf(58));
                        z2 = false;
                    } else if (lowerCase.startsWith("reason:")) {
                        str8.substring(str8.indexOf(58));
                        z2 = true;
                    } else {
                        str2 = str6;
                        if (lowerCase.contains("appfreeze")) {
                            str7 = "AppFreeze";
                            c3 = '\n';
                            str6 = str2;
                        }
                        str6 = str2;
                        c3 = c;
                    }
                    if (lowerCase.contains("input dispatch")) {
                        str4 = "Input dispatching timed out";
                    } else if (lowerCase.contains("broadcast of intent")) {
                        str4 = "Broadcast of Intent";
                    } else if (lowerCase.contains("executing service")) {
                        str3 = str6;
                        if ("null".equalsIgnoreCase(str3)) {
                            str6 = str8.substring(str8.indexOf("service ") + 8).trim();
                            str7 = "executing service";
                            if (z2) {
                                c2 = 4;
                                c3 = 2;
                                if (c3 < c2) {
                                }
                            }
                            trim = str8.trim();
                            if (trim.startsWith("Load:")) {
                            }
                        } else {
                            str7 = "executing service";
                            str6 = str3;
                            if (z2) {
                            }
                            trim = str8.trim();
                            if (trim.startsWith("Load:")) {
                            }
                        }
                    } else {
                        str3 = str6;
                        if (lowerCase.contains("service.startforeground")) {
                            str7 = "not call Service.startForeground";
                            str6 = str3;
                            if (z2) {
                            }
                            trim = str8.trim();
                            if (trim.startsWith("Load:")) {
                            }
                        } else {
                            str6 = str3;
                            str7 = "unknown";
                            if (z2) {
                            }
                            trim = str8.trim();
                            if (trim.startsWith("Load:")) {
                            }
                        }
                    }
                    str7 = str4;
                    if (z2) {
                    }
                    trim = str8.trim();
                    if (trim.startsWith("Load:")) {
                    }
                } else if (c3 != 2) {
                    if (c3 != 3) {
                        c = c3;
                        i = i6;
                        hashMap = hashMap5;
                        hashMap2 = hashMap7;
                        str2 = str6;
                    } else {
                        String[] split2 = str8.split("\\s");
                        c = c3;
                        i = i6;
                        if (split2.length >= 2) {
                            if ("CPU".equalsIgnoreCase(split2[0]) && "usage".equalsIgnoreCase(split2[1])) {
                                if (str8.contains("ago")) {
                                    z3 = true;
                                }
                                if (hashMap4.isEmpty() && hashMap5.isEmpty() && hashMap6.isEmpty() && hashMap8.isEmpty() && hashMap7.isEmpty()) {
                                    hashMap = hashMap5;
                                    hashMap2 = hashMap7;
                                    c3 = c;
                                    c2 = 4;
                                    if (c3 < c2) {
                                        break;
                                    }
                                }
                            } else if (hashMap4.isEmpty() || hashMap5.isEmpty() || hashMap6.isEmpty() || hashMap8.isEmpty() || hashMap7.isEmpty()) {
                                if (hashMap4.isEmpty() && split2[1].equalsIgnoreCase("TOTAL:")) {
                                    str5 = "";
                                    hashMap3 = hashMap4;
                                } else if (str8.contains(bVar.b.getPackageName())) {
                                    int i7 = 0;
                                    str5 = "";
                                    while (i7 < split2.length) {
                                        int i8 = i7;
                                        if (split2[i7].contains(bVar.b.getPackageName())) {
                                            String str9 = split2[i8];
                                            str5 = str9.substring(str9.indexOf(47) + 1, split2[i8].length() - 1).concat("_");
                                        }
                                        i7 = i8 + 1;
                                    }
                                    hashMap3 = hashMap6;
                                } else if (hashMap5.isEmpty() && str8.contains("system_server:")) {
                                    str5 = "";
                                    hashMap3 = hashMap5;
                                } else if (hashMap8.isEmpty() && str8.contains("kswapd")) {
                                    str5 = "";
                                    hashMap3 = hashMap8;
                                } else if (hashMap7.isEmpty() && str8.contains("dex2oat")) {
                                    str5 = "";
                                    hashMap3 = hashMap7;
                                } else {
                                    str5 = "";
                                    hashMap3 = null;
                                }
                                if (hashMap3 != null) {
                                    int i9 = 0;
                                    while (true) {
                                        int i10 = i9;
                                        if (split2[i9].contains("%")) {
                                            hashMap = hashMap5;
                                            i2 = i10;
                                            break;
                                        } else {
                                            i2 = i10 + 1;
                                            hashMap = hashMap5;
                                            if (i2 < split2.length) {
                                                i9 = i2;
                                                hashMap5 = hashMap;
                                            }
                                        }
                                    }
                                    try {
                                        floatValue = Float.valueOf(split2[i2].replace("%", "")).floatValue();
                                        i3 = i2;
                                    } catch (Throwable unused) {
                                        i3 = i2;
                                    }
                                    try {
                                        String str10 = str5 + U3.i.l;
                                        if (hashMap3 != hashMap4) {
                                            floatValue /= com.apm.insight.l.d.d();
                                        }
                                        hashMap3.put(str10, Float.valueOf(floatValue));
                                    } catch (Throwable unused2) {
                                        hashMap3.put(str5 + U3.i.l, valueOf);
                                        i4 = i3 + 3;
                                        char c4 = 0;
                                        hashMap2 = hashMap7;
                                        while (i4 < split2.length) {
                                        }
                                        str2 = str6;
                                        str6 = str2;
                                        c3 = c;
                                        c2 = 4;
                                        if (c3 < c2) {
                                        }
                                    }
                                    i4 = i3 + 3;
                                    char c42 = 0;
                                    hashMap2 = hashMap7;
                                    while (i4 < split2.length) {
                                        String str11 = "softirq";
                                        if (c42 != 0) {
                                            i5 = i4;
                                            if (c42 == 1) {
                                                strArr2 = split2;
                                            } else if (c42 == 2) {
                                                strArr2 = split2;
                                                if ("iowait".equalsIgnoreCase(strArr2[i5])) {
                                                    str11 = "iowait";
                                                    c42 = 3;
                                                    if (str11 != null) {
                                                    }
                                                    if (c42 < 6) {
                                                    }
                                                }
                                                if ("irq".equalsIgnoreCase(strArr2[i5])) {
                                                }
                                                if ("softirq".equalsIgnoreCase(strArr2[i5])) {
                                                }
                                                if ("softirq".equalsIgnoreCase(strArr2[i5])) {
                                                }
                                                str11 = null;
                                                if (str11 != null) {
                                                }
                                                if (c42 < 6) {
                                                }
                                            } else if (c42 == 3) {
                                                strArr2 = split2;
                                                if ("irq".equalsIgnoreCase(strArr2[i5])) {
                                                    str11 = "irq";
                                                    c42 = 4;
                                                    if (str11 != null) {
                                                    }
                                                    if (c42 < 6) {
                                                    }
                                                }
                                                if ("softirq".equalsIgnoreCase(strArr2[i5])) {
                                                }
                                                if ("softirq".equalsIgnoreCase(strArr2[i5])) {
                                                }
                                                str11 = null;
                                                if (str11 != null) {
                                                }
                                                if (c42 < 6) {
                                                }
                                            } else if (c42 != 4) {
                                                strArr2 = split2;
                                            } else {
                                                strArr2 = split2;
                                                if ("softirq".equalsIgnoreCase(strArr2[i5])) {
                                                    c42 = 5;
                                                    if (str11 != null) {
                                                        try {
                                                            float floatValue2 = Float.valueOf(strArr2[i5 - 1].replace("%", "")).floatValue();
                                                            String str12 = str5 + str11;
                                                            if (hashMap3 != hashMap4) {
                                                                floatValue2 /= com.apm.insight.l.d.d();
                                                            }
                                                            hashMap3.put(str12, Float.valueOf(floatValue2));
                                                        } catch (Throwable unused3) {
                                                            hashMap3.put(str5 + str11, valueOf);
                                                        }
                                                    }
                                                    if (c42 < 6) {
                                                        break;
                                                    }
                                                    i4 = i5 + 3;
                                                    split2 = strArr2;
                                                }
                                                if ("softirq".equalsIgnoreCase(strArr2[i5])) {
                                                    c42 = 6;
                                                    if (str11 != null) {
                                                    }
                                                    if (c42 < 6) {
                                                    }
                                                }
                                                str11 = null;
                                                if (str11 != null) {
                                                }
                                                if (c42 < 6) {
                                                }
                                            }
                                        } else {
                                            i5 = i4;
                                            strArr2 = split2;
                                            if ("user".equalsIgnoreCase(split2[i5])) {
                                                str11 = "user";
                                                c42 = 1;
                                                if (str11 != null) {
                                                }
                                                if (c42 < 6) {
                                                }
                                            }
                                        }
                                        if ("kernel".equalsIgnoreCase(strArr2[i5])) {
                                            str11 = "kernel";
                                            c42 = 2;
                                            if (str11 != null) {
                                            }
                                            if (c42 < 6) {
                                            }
                                        }
                                        if ("iowait".equalsIgnoreCase(strArr2[i5])) {
                                        }
                                        if ("irq".equalsIgnoreCase(strArr2[i5])) {
                                        }
                                        if ("softirq".equalsIgnoreCase(strArr2[i5])) {
                                        }
                                        if ("softirq".equalsIgnoreCase(strArr2[i5])) {
                                        }
                                        str11 = null;
                                        if (str11 != null) {
                                        }
                                        if (c42 < 6) {
                                        }
                                    }
                                    str2 = str6;
                                }
                            }
                            hashMap = hashMap5;
                            hashMap2 = hashMap7;
                            c2 = 4;
                            c3 = 4;
                            if (c3 < c2) {
                            }
                        }
                        hashMap = hashMap5;
                        hashMap2 = hashMap7;
                        str2 = str6;
                    }
                    str6 = str2;
                    c3 = c;
                } else {
                    c = c3;
                    i = i6;
                    hashMap = hashMap5;
                    hashMap2 = hashMap7;
                    trim = str8.trim();
                    if (trim.startsWith("Load:")) {
                        c3 = c;
                    } else {
                        String[] split3 = trim.replace("Load:", "").trim().split("/");
                        if (3 == split3.length) {
                            for (int i11 = 0; i11 < split3.length; i11++) {
                                fArr[i11] = Float.valueOf(split3[i11]).floatValue();
                            }
                        }
                        c3 = 3;
                    }
                }
                c2 = 4;
                if (c3 < c2) {
                }
            }
            i6 = i + 1;
            bVar = this;
            split = strArr;
            fArr2 = fArr;
            hashMap7 = hashMap2;
            hashMap5 = hashMap;
        }
        String str13 = str7;
        jSONObject.put("anr_tag", str6);
        jSONObject.put("anr_has_ago", String.valueOf(z3));
        jSONObject.put("anr_reason", str13);
        a(hashMap6, jSONObject, "app");
        a(hashMap4, jSONObject, U3.i.l);
        if (hashMap.isEmpty()) {
            jSONObject.put("npth_anr_systemserver_total", "not found");
        } else {
            jSONObject.put("npth_anr_systemserver_total", b(c.AnonymousClass1.a(hashMap).floatValue()));
        }
        if (hashMap8.isEmpty()) {
            jSONObject.put("npth_anr_kswapd_total", "not found");
        } else {
            jSONObject.put("npth_anr_kswapd_total", b(c.AnonymousClass1.a(hashMap8).floatValue()));
        }
        if (hashMap2.isEmpty()) {
            jSONObject.put("npth_anr_dex2oat_total", "not found");
        } else {
            jSONObject.put("npth_anr_dex2oat_total", b(c.AnonymousClass1.a(hashMap2).floatValue()));
        }
    }

    private void b(long j) {
        if (this.x != this.w) {
            try {
                this.p = System.currentTimeMillis();
                if (com.apm.insight.e.x()) {
                    this.r = f.b().b();
                    this.q = j.a(j);
                    this.h = f.b().a(j).a();
                }
                JSONObject jSONObject = new JSONObject();
                this.s = jSONObject;
                com.apm.insight.l.a.a(this.b, jSONObject);
                this.t = h();
                this.f = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                this.d = this.p;
                String b = com.apm.insight.l.j.b();
                File file = new File(new File(com.apm.insight.l.j.f(this.b), b), "trace_" + com.apm.insight.l.a.b().replace(':', '_') + ".txt");
                file.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                n.a("anr_trace", b);
                NativeImpl.i(file.getAbsolutePath());
                try {
                    JSONArray a = com.apm.insight.l.f.a(file.getAbsolutePath());
                    this.m = a;
                    a(a);
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                }
                if (this.g == null) {
                    this.g = d.a();
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
            com.apm.insight.a.d();
        } else {
            try {
                this.d = this.p;
                String b2 = com.apm.insight.l.j.b();
                File file2 = new File(new File(com.apm.insight.l.j.f(this.b), b2), "trace" + com.apm.insight.l.a.b().replace(':', '_') + ".txt");
                file2.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file2, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                n.a("anr_trace", b2);
                NativeImpl.i(file2.getAbsolutePath());
                try {
                    JSONArray a2 = com.apm.insight.l.f.a(file2.getAbsolutePath());
                    this.m = a2;
                    a(a2);
                } catch (IOException unused3) {
                } catch (Throwable th3) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th3, "NPTH_CATCH");
                }
                if (this.g == null) {
                    this.g = d.a();
                }
            } catch (Throwable th4) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th4, "NPTH_CATCH");
            }
        }
        long j2 = this.w;
        this.x = j2;
        this.w = -1L;
        if (j2 == -1) {
            this.x = (-1) - 1;
        }
    }

    private JSONObject c(@NonNull JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray b = com.apm.insight.a.b(jSONArray);
        if (b.length() != jSONArray.length()) {
            this.o++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < b.length(); i++) {
                sb.append(b.getString(i));
                sb.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private static boolean h() {
        boolean a = com.apm.insight.l.a.a();
        boolean z2 = !a;
        if (a || com.apm.insight.runtime.a.b.d().e() > 2000) {
            return z2;
        }
        return false;
    }

    private File i() {
        File file = this.D;
        if (file != null) {
            return file;
        }
        File file2 = new File(this.b.getFilesDir(), "has_anr_signal_" + com.apm.insight.l.a.b().replaceAll(":", "_"));
        this.D = file2;
        return file2;
    }

    public final void d() {
        synchronized (this.u) {
        }
        this.y.run();
    }

    public final void e() {
        if (NativeImpl.h()) {
            try {
                com.apm.insight.l.f.a(i(), String.valueOf(this.A + 1), false);
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
        }
        this.w = SystemClock.uptimeMillis();
        this.v = true;
    }

    public final void f() {
        File i = i();
        try {
            int intValue = Integer.decode(com.apm.insight.l.f.a(i.getAbsolutePath(), "\n")).intValue();
            this.A = intValue;
            if (intValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            com.apm.insight.l.f.a(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x03d8 A[Catch: all -> 0x03df, TRY_LEAVE, TryCatch #9 {all -> 0x03df, blocks: (B:74:0x03ca, B:76:0x03d8), top: B:73:0x03ca }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0406 A[Catch: all -> 0x0411, TRY_LEAVE, TryCatch #1 {all -> 0x0411, blocks: (B:79:0x03df, B:81:0x0406), top: B:78:0x03df }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        boolean z2;
        int i;
        String str;
        String str2;
        boolean z3;
        JSONArray jSONArray;
        boolean z4;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str3;
        String str4;
        JSONArray jSONArray3;
        final long j;
        JSONObject jSONObject3;
        boolean z5;
        JSONObject jSONObject4;
        JSONArray a;
        boolean b = com.apm.insight.runtime.i.a().b();
        long uptimeMillis = SystemClock.uptimeMillis();
        a(uptimeMillis);
        String a2 = d.a(this.b);
        long currentTimeMillis = System.currentTimeMillis();
        String str5 = "normal";
        TextUtils.isEmpty(a2);
        if (TextUtils.isEmpty(a2)) {
            z2 = b;
            i = 1;
            str = "unknown";
            str2 = "unknown";
            z3 = false;
            jSONArray = null;
            z4 = false;
            jSONArray2 = null;
            jSONObject = null;
            jSONObject2 = null;
            str3 = "normal";
            str4 = "unknown";
            jSONArray3 = null;
            j = currentTimeMillis;
            jSONObject3 = null;
        } else {
            synchronized (this.u) {
            }
            if (this.g == null || System.currentTimeMillis() - this.d > 20000) {
                if (this.v) {
                    this.v = false;
                    str5 = "trace_after";
                }
                b(uptimeMillis);
            } else {
                str5 = "trace_last";
            }
            JSONObject jSONObject5 = this.g;
            String str6 = this.i;
            String str7 = this.j;
            String str8 = this.k;
            JSONArray jSONArray4 = this.m;
            JSONArray jSONArray5 = this.r;
            JSONArray jSONArray6 = this.q;
            i = 1;
            JSONObject jSONObject6 = this.s;
            JSONObject jSONObject7 = this.h;
            z2 = b;
            z3 = this.t;
            long j2 = this.p;
            this.g = null;
            this.m = null;
            this.q = null;
            this.h = null;
            this.r = null;
            this.i = "unknown";
            this.j = "unknown";
            this.k = "unknown";
            this.o = 0;
            str2 = str8;
            str4 = str6;
            jSONArray3 = jSONArray4;
            jSONObject2 = jSONObject7;
            jSONArray2 = jSONArray6;
            jSONArray = jSONArray5;
            str = str7;
            str3 = str5;
            j = j2;
            jSONObject3 = jSONObject5;
            jSONObject = jSONObject6;
            z4 = true;
        }
        if (TextUtils.isEmpty(a2)) {
            if (this.g == null || System.currentTimeMillis() - this.d <= 20000) {
                if (this.g == null || System.currentTimeMillis() - this.d <= 2000 || !NativeImpl.h()) {
                    return false;
                }
                com.apm.insight.l.f.a(i());
                return false;
            }
            this.g = null;
            this.m = null;
            this.q = null;
            this.h = null;
            this.r = null;
            this.i = "unknown";
            this.j = "unknown";
            this.k = "unknown";
            this.o = 0;
            this.e = null;
            return false;
        }
        if (jSONObject3 == null) {
            if (jSONArray2 == null) {
                try {
                    jSONArray = f.b().b();
                    jSONArray2 = j.a(uptimeMillis);
                    z5 = z3;
                    try {
                        jSONObject2 = f.b().a(uptimeMillis).a();
                        JSONObject jSONObject8 = new JSONObject();
                        try {
                            com.apm.insight.l.a.a(this.b, jSONObject8);
                            jSONObject = jSONObject8;
                        } catch (Throwable unused) {
                            jSONObject = jSONObject8;
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                }
            } else {
                z5 = z3;
            }
            jSONObject3 = d.a();
            JSONObject jSONObject9 = jSONObject;
            JSONObject jSONObject10 = jSONObject2;
            if (jSONObject3 != null || jSONObject3.length() <= 0) {
                return z4;
            }
            boolean z6 = z4;
            try {
                jSONObject3.put("pid", Process.myPid());
                jSONObject3.put("package", this.b.getPackageName());
                jSONObject3.put("is_remote_process", 0);
                jSONObject3.put("is_new_stack", 10);
                com.apm.insight.entity.a aVar = new com.apm.insight.entity.a(new JSONObject());
                JSONObject jSONObject11 = jSONObject3;
                aVar.a("data", (Object) jSONObject11.toString());
                aVar.a("is_anr", Integer.valueOf(i));
                aVar.a("anrType", (Object) str3);
                if (com.apm.insight.e.x()) {
                    aVar.a("history_message", (Object) jSONArray);
                    aVar.a("current_message", jSONObject10);
                    aVar.a("pending_messages", (Object) jSONArray2);
                }
                aVar.a("anr_time", Long.valueOf(System.currentTimeMillis()));
                aVar.a("crash_time", Long.valueOf(j));
                com.apm.insight.c.a.b();
                aVar.c(jSONObject9);
                aVar.a("anr_info", (Object) a2);
                if (jSONArray3 != null) {
                    aVar.a("dump_trace", (Object) jSONArray3);
                }
                JSONObject jSONObject12 = this.n;
                aVar.a("all_thread_stacks", (jSONObject12 == null || jSONObject12.length() == 0) ? m.b((String) null) : this.n);
                com.apm.insight.runtime.a.f a3 = com.apm.insight.runtime.a.f.a();
                CrashType crashType = CrashType.ANR;
                com.apm.insight.entity.a a4 = a3.a(crashType, aVar);
                a4.a("is_background", Boolean.valueOf(z5));
                a4.a("logcat", (Object) com.apm.insight.runtime.h.a(com.apm.insight.e.f()));
                a4.a("has_dump", (Object) "true");
                a4.a("crash_uuid", (Object) com.apm.insight.e.a(j, crashType, false, false));
                JSONObject optJSONObject = a4.c().optJSONObject("filters");
                com.apm.insight.entity.d.b(a4.c());
                if (optJSONObject == null) {
                    try {
                        jSONObject4 = new JSONObject();
                    } catch (Throwable unused4) {
                        jSONObject4 = optJSONObject;
                        com.apm.insight.a.a.a();
                        CrashType crashType2 = CrashType.LAUNCH;
                        com.apm.insight.e.e();
                        if (com.apm.insight.a.e().length() > 1024) {
                        }
                        a = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                        jSONObject4.put("leak_threads_count", String.valueOf(a.length()));
                        if (a.length() > 0) {
                        }
                        String optString = jSONObject11.optString("mainStackFromTrace");
                        JSONArray a5 = com.apm.insight.entity.b.a(optString);
                        com.apm.insight.entity.b.a(a4.c(), a5, new b.a() { // from class: com.apm.insight.b.b.2
                            @Override // com.apm.insight.entity.b.a
                            public final void a(JSONObject jSONObject13) {
                                com.apm.insight.k.d.a().a(jSONObject13, j, b.this.f);
                            }
                        });
                        b(optString, a5);
                        return z6;
                    }
                    try {
                        a4.a("filters", jSONObject4);
                    } catch (Throwable unused5) {
                        optJSONObject = jSONObject4;
                        jSONObject4 = optJSONObject;
                        com.apm.insight.a.a.a();
                        CrashType crashType22 = CrashType.LAUNCH;
                        com.apm.insight.e.e();
                        if (com.apm.insight.a.e().length() > 1024) {
                        }
                        a = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                        jSONObject4.put("leak_threads_count", String.valueOf(a.length()));
                        if (a.length() > 0) {
                        }
                        String optString2 = jSONObject11.optString("mainStackFromTrace");
                        JSONArray a52 = com.apm.insight.entity.b.a(optString2);
                        com.apm.insight.entity.b.a(a4.c(), a52, new b.a() { // from class: com.apm.insight.b.b.2
                            @Override // com.apm.insight.entity.b.a
                            public final void a(JSONObject jSONObject13) {
                                com.apm.insight.k.d.a().a(jSONObject13, j, b.this.f);
                            }
                        });
                        b(optString2, a52);
                        return z6;
                    }
                } else {
                    jSONObject4 = optJSONObject;
                }
                jSONObject4.put("anrType", str3);
                jSONObject4.put("max_utm_thread", str4);
                jSONObject4.put("max_stm_thread", str);
                jSONObject4.put("max_utm_stm_thread", str2);
                jSONObject4.put("max_utm_thread_version", this.l);
                long j3 = j - com.apm.insight.e.j();
                jSONObject4.put("crash_length", j3 < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL ? "0 - 30s" : j3 < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS ? "30s - 1min" : j3 < UnityAdsConstants.Timeout.INIT_TIMEOUT_MS ? "1min - 2min" : j3 < 300000 ? "2min - 5min" : j3 < TTAdConstant.AD_MAX_EVENT_TIME ? "5min - 10min" : j3 < 1800000 ? "10min - 30min" : j3 < 3600000 ? "30min - 1h" : "1h - ");
                jSONObject4.put("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
                jSONObject4.put("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.b()));
                jSONObject4.put("sdk_version", "2008-20250701130429");
                jSONObject4.put("has_logcat", String.valueOf(a4.a()));
                jSONObject4.put("memory_leak", String.valueOf(com.apm.insight.entity.a.a(com.apm.insight.e.f())));
                jSONObject4.put("fd_leak", String.valueOf(com.apm.insight.entity.a.b(com.apm.insight.e.f())));
                jSONObject4.put("threads_leak", String.valueOf(com.apm.insight.entity.a.c(com.apm.insight.e.f())));
                jSONObject4.put("is_64_devices", String.valueOf(Header.a()));
                jSONObject4.put("is_64_runtime", String.valueOf(NativeImpl.f()));
                jSONObject4.put("is_x86_devices", String.valueOf(Header.b()));
                jSONObject4.put("has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(com.apm.insight.e.f()).exists()));
                jSONObject4.put("is_root", com.apm.insight.nativecrash.a.k() ? "true" : "false");
                jSONObject4.put("anr_normal_trace", String.valueOf(!this.v));
                jSONObject4.put("anr_no_run", String.valueOf(z2));
                jSONObject4.put("crash_after_crash", Npth.hasCrash() ? "true" : "false");
                jSONObject4.put("from_file", String.valueOf(d.b()));
                jSONObject4.put("has_dump", "true");
                jSONObject4.put("from_kill", "false");
                jSONObject4.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
                int i2 = this.o;
                if (i2 > 0) {
                    jSONObject4.put("may_have_stack_overflow", String.valueOf(i2));
                }
                try {
                    a(a2, jSONObject4);
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                }
                com.apm.insight.a.a.a();
                CrashType crashType222 = CrashType.LAUNCH;
                com.apm.insight.e.e();
                try {
                    if (com.apm.insight.a.e().length() > 1024) {
                        a4.a("has_system_traces", "true");
                    }
                } catch (Throwable unused6) {
                }
                try {
                    a = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                    jSONObject4.put("leak_threads_count", String.valueOf(a.length()));
                    if (a.length() > 0) {
                        com.apm.insight.l.f.a(com.apm.insight.l.j.g(com.apm.insight.e.f()), a);
                    }
                } catch (Throwable unused7) {
                }
                String optString22 = jSONObject11.optString("mainStackFromTrace");
                JSONArray a522 = com.apm.insight.entity.b.a(optString22);
                com.apm.insight.entity.b.a(a4.c(), a522, new b.a() { // from class: com.apm.insight.b.b.2
                    @Override // com.apm.insight.entity.b.a
                    public final void a(JSONObject jSONObject13) {
                        com.apm.insight.k.d.a().a(jSONObject13, j, b.this.f);
                    }
                });
                b(optString22, a522);
                return z6;
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                return z6;
            }
        }
        z5 = z3;
        JSONObject jSONObject92 = jSONObject;
        JSONObject jSONObject102 = jSONObject2;
        if (jSONObject3 != null) {
        }
        return z4;
    }

    public final void c() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void b() {
        if (this.c) {
            this.c = false;
            c cVar = this.a;
            if (cVar != null) {
                cVar.b();
            }
            this.a = null;
        }
    }

    @Nullable
    private int[] b(@NonNull JSONArray jSONArray) throws IllegalArgumentException {
        int i = 0;
        while (true) {
            if (i >= jSONArray.length()) {
                break;
            }
            String optString = jSONArray.optString(i);
            int indexOf = (optString == null || optString.isEmpty()) ? -1 : optString.indexOf("utm=");
            if (indexOf > 0) {
                Pattern pattern = this.C;
                if (pattern == null) {
                    pattern = Pattern.compile("[^0-9]+");
                    this.C = pattern;
                }
                String[] split = pattern.split(optString.substring(indexOf));
                if (split != null && split.length >= 2) {
                    try {
                        int intValue = Integer.decode(split[1]).intValue();
                        int intValue2 = Integer.decode(split[2]).intValue();
                        return new int[]{intValue, intValue2, intValue + intValue2};
                    } catch (Throwable unused) {
                        a70.p("Err stack line: ".concat(optString));
                        return null;
                    }
                }
            } else {
                i++;
            }
        }
        return null;
    }

    private static String b(float f) {
        return a(f / 100.0f);
    }

    private static void b(String str, JSONArray jSONArray) {
        for (ICrashCallback iCrashCallback : l.a().e()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.ANR, str, (Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(CrashType.ANR, str, null);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
        }
    }

    public final void a() {
        if (this.c) {
            return;
        }
        this.a = new c(this);
        this.d = com.apm.insight.e.j();
        this.c = true;
    }

    private boolean a(long j) {
        if (this.v) {
            this.v = false;
            b(j);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(JSONArray jSONArray) {
        String substring;
        int[] iArr;
        int[] iArr2;
        if (jSONArray == null) {
            return;
        }
        this.g = null;
        this.n = null;
        this.o = 0;
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        this.i = "unknown";
        this.j = "unknown";
        this.k = "unknown";
        int[] iArr3 = new int[3];
        iArr3[0] = 0;
        iArr3[1] = 0;
        int i = 2;
        iArr3[2] = 0;
        JSONArray jSONArray5 = jSONArray4;
        String str = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String optString = jSONArray.optString(i2);
            int i3 = i;
            if (TextUtils.isEmpty(optString)) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(str)) {
                    if (this.g == null && U3.i.Z.equals(str)) {
                        this.g = c(jSONArray5);
                    } else {
                        jSONArray2.put(a(str, jSONArray5));
                    }
                    try {
                        if (!U3.i.Z.equals(str)) {
                            str = str.substring(0, str.indexOf(40)).trim();
                        }
                    } catch (Throwable unused) {
                    }
                    String str2 = str;
                    if (!a(str2)) {
                        try {
                            iArr2 = b(jSONArray5);
                        } catch (IllegalArgumentException e) {
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(e, "NPTH_CATCH");
                            iArr2 = null;
                            if (iArr2 != null) {
                            }
                            if (jSONArray5.length() > 0) {
                            }
                            i = i3;
                            str = null;
                        } catch (Throwable unused2) {
                            iArr2 = null;
                            if (iArr2 != null) {
                            }
                            if (jSONArray5.length() > 0) {
                            }
                            i = i3;
                            str = null;
                        }
                        if (iArr2 != null) {
                            int i4 = iArr2[0];
                            if (i4 > iArr3[0]) {
                                iArr3[0] = i4;
                                this.i = str2;
                            }
                            int i5 = iArr2[1];
                            if (i5 > iArr3[1]) {
                                iArr3[1] = i5;
                                this.j = str2;
                            }
                            int i6 = iArr2[i3];
                            if (i6 > iArr3[i3]) {
                                iArr3[i3] = i6;
                                this.k = str2;
                            }
                        }
                    }
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                i = i3;
                str = null;
            } else if (!z2) {
                i = i3;
                if (optString.startsWith("DALVIK THREADS") || optString.startsWith("suspend") || optString.startsWith("\"")) {
                    z2 = true;
                }
                jSONArray3.put(optString);
            } else if (!z2) {
                i = i3;
            } else if (optString.contains(" prio=")) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(str)) {
                    if (this.g == null && U3.i.Z.equals(str)) {
                        this.g = c(jSONArray5);
                    } else {
                        jSONArray2.put(a(str, jSONArray5));
                    }
                    try {
                        if (!U3.i.Z.equals(str)) {
                            str = str.substring(0, str.indexOf(40)).trim();
                        }
                    } catch (Throwable unused3) {
                    }
                    String str3 = str;
                    if (!a(str3)) {
                        try {
                            iArr = b(jSONArray5);
                        } catch (IllegalArgumentException e2) {
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(e2, "NPTH_CATCH");
                            iArr = null;
                            if (iArr != null) {
                            }
                            substring = optString.substring(1, optString.indexOf(34, 1));
                            if (U3.i.Z.equals(substring)) {
                            }
                            if (jSONArray5.length() > 0) {
                            }
                            jSONArray5.put(optString);
                        } catch (Throwable unused4) {
                            iArr = null;
                            if (iArr != null) {
                            }
                            substring = optString.substring(1, optString.indexOf(34, 1));
                            if (U3.i.Z.equals(substring)) {
                            }
                            if (jSONArray5.length() > 0) {
                            }
                            jSONArray5.put(optString);
                        }
                        if (iArr != null) {
                            int i7 = iArr[0];
                            if (i7 > iArr3[0]) {
                                iArr3[0] = i7;
                                this.i = str3;
                            }
                            int i8 = iArr[1];
                            if (i8 > iArr3[1]) {
                                iArr3[1] = i8;
                                this.j = str3;
                            }
                            int i9 = iArr[i3];
                            if (i9 > iArr3[i3]) {
                                iArr3[i3] = i9;
                                this.k = str3;
                            }
                        }
                    }
                }
                substring = optString.substring(1, optString.indexOf(34, 1));
                if (U3.i.Z.equals(substring)) {
                    i = i3;
                    str = substring;
                } else {
                    StringBuilder r = mz1.r(substring, "  (");
                    i = i3;
                    r.append(optString.substring(optString.indexOf(34, i) + 1));
                    r.append(" )");
                    str = r.toString();
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                jSONArray5.put(optString);
            } else {
                i = i3;
                if (TextUtils.isEmpty(str)) {
                    jSONArray3.put(optString);
                } else {
                    jSONArray5.put(optString);
                }
            }
        }
        if (jSONArray2.length() > 0) {
            this.m = jSONArray3;
            try {
                JSONObject jSONObject = new JSONObject();
                this.n = jSONObject;
                jSONObject.put("thread_all_count", jSONArray2.length());
                this.n.put("thread_stacks", jSONArray2);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    private boolean a(String str) {
        if (this.B == null) {
            JSONArray b = com.apm.insight.runtime.a.b();
            if (b != null) {
                this.B = new LinkedList();
                this.l = b.optString(0);
                for (int i = 1; i < b.length(); i++) {
                    try {
                        this.B.add(Pattern.compile(b.optString(i)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.B == null) {
                LinkedList linkedList = new LinkedList();
                this.B = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.B.add(Pattern.compile("^default_npth_thread$"));
                this.B.add(Pattern.compile("^RenderThread$"));
                this.B.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.B.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private JSONObject a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray b = com.apm.insight.a.b(jSONArray);
        if (b.length() != jSONArray.length()) {
            this.o++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void a(HashMap<String, Float> hashMap, JSONObject jSONObject, String str) throws JSONException {
        String concat = "npth_anr_".concat(String.valueOf(str));
        if (hashMap.isEmpty()) {
            jSONObject.put(concat.concat("_total"), "not found");
            return;
        }
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (Map.Entry<String, Float> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("user")) {
                f += entry.getValue().floatValue();
            } else if (key.endsWith("kernel")) {
                f2 += entry.getValue().floatValue();
            } else if (key.endsWith("iowait")) {
                f3 += entry.getValue().floatValue();
            } else if (key.endsWith("irq")) {
                f4 += entry.getValue().floatValue();
            } else if (key.endsWith("softirq")) {
                f5 = entry.getValue().floatValue() + f5;
            }
        }
        float f6 = f + f2 + f3 + f4 + f5;
        jSONObject.put(concat.concat("_total"), b(f6));
        jSONObject.put(concat.concat("_kernel_user_ratio"), a(f2, f6));
        jSONObject.put(concat.concat("_iowait_user_ratio"), a(f3, f6));
    }

    private static String a(float f, float f2) {
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return a(f / f2);
        }
        return f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? "100%" : "0%";
    }

    private static String a(float f) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return "0%";
        }
        if (f <= 0.1f) {
            return "0% - 10%";
        }
        if (f <= 0.3f) {
            return "10% - 30%";
        }
        if (f <= 0.6f) {
            return "30% - 60%";
        }
        if (f <= 0.9f) {
            return "60% - 90%";
        }
        return "90% - 100%";
    }
}
