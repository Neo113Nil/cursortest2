package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.k.c;
import com.apm.insight.l.n;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;
import com.ironsource.C4324ta;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.unity3d.ads.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b {
    private static volatile b b;
    private Context a;
    private C0001b f;
    private HashMap<String, C0001b> g;
    private List<File> c = new ArrayList();
    private List<File> d = new ArrayList();
    private int e = -1;
    private volatile boolean h = false;
    private Runnable i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public final void run() {
            b.this.f();
        }
    };
    private Runnable j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public final void run() {
            b.this.d();
        }
    };

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.apm.insight.k.b$b, reason: collision with other inner class name */
    public static class C0001b {
        String a;
        a d;
        a e;
        List<a> b = new ArrayList();
        List<a> c = new ArrayList();
        boolean f = false;
        int g = 0;

        public C0001b(String str) {
            this.a = str;
        }
    }

    private b(Context context) {
        this.a = context;
    }

    @Nullable
    private com.apm.insight.f.b a(File file, CrashType crashType, String str, long j, long j2) {
        File file2;
        com.apm.insight.f.b bVar;
        com.apm.insight.f.b bVar2 = null;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                file2 = file;
            }
        } catch (Throwable th2) {
            th = th2;
            file2 = file;
        }
        if (file.isFile()) {
            com.apm.insight.l.f.a(file);
            return null;
        }
        boolean z = crashType == CrashType.LAUNCH;
        if (crashType == null) {
            file2 = file;
            try {
                return com.apm.insight.l.f.b(new File(file2, file.getName()).getAbsolutePath());
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            file2 = file;
            try {
                com.apm.insight.f.b a2 = com.apm.insight.l.f.a(file, crashType);
                try {
                    JSONObject b2 = a2.b();
                    try {
                        if (a2.b() != null) {
                            boolean z2 = z;
                            if (crashType == CrashType.ANR) {
                                return a2;
                            }
                            b2.put("crash_time", j);
                            try {
                                b2.put("app_start_time", j2);
                                JSONObject optJSONObject = b2.optJSONObject("header");
                                try {
                                    if (optJSONObject == null) {
                                        optJSONObject = Header.a(j).f();
                                    } else if (z2) {
                                        b2.remove("header");
                                    }
                                    String optString = optJSONObject.optString("sdk_version_name", null);
                                    if (optString == null) {
                                        optString = "2008-20250701130429";
                                    }
                                    com.apm.insight.entity.a.a(b2, "filters", "sdk_version", optString);
                                    JSONArray optJSONArray = b2.optJSONArray("logcat");
                                    if (optJSONArray == null || optJSONArray.length() == 0) {
                                        b2.put("logcat", com.apm.insight.runtime.h.a(str));
                                    }
                                    com.apm.insight.entity.a.a(b2, "filters", "has_dump", "true");
                                    com.apm.insight.entity.a.a(b2, "filters", "has_logcat", String.valueOf(!com.apm.insight.a.a(b2, "logcat")));
                                    com.apm.insight.entity.a.a(b2, "filters", "memory_leak", String.valueOf(com.apm.insight.entity.a.a(str)));
                                    com.apm.insight.entity.a.a(b2, "filters", "fd_leak", String.valueOf(com.apm.insight.entity.a.b(str)));
                                    com.apm.insight.entity.a.a(b2, "filters", "threads_leak", String.valueOf(com.apm.insight.entity.a.c(str)));
                                    com.apm.insight.entity.a.a(b2, "filters", "is_64_devices", String.valueOf(Header.a()));
                                    com.apm.insight.entity.a.a(b2, "filters", "is_64_runtime", String.valueOf(NativeImpl.f()));
                                    com.apm.insight.entity.a.a(b2, "filters", "is_x86_devices", String.valueOf(Header.b()));
                                    com.apm.insight.entity.a.a(b2, "filters", "has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(str).exists()));
                                    com.apm.insight.entity.a.a(b2, "filters", "is_root", String.valueOf(com.apm.insight.nativecrash.a.k()));
                                    b2.put("launch_did", com.apm.insight.i.a.a(this.a));
                                    b2.put("crash_uuid", file2.getName());
                                    try {
                                        long parseLong = Long.parseLong(com.apm.insight.runtime.b.a(j, str));
                                        com.apm.insight.entity.a.a(b2, "filters", "lastAliveTime", Math.abs(parseLong - j) < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS ? "< 60s" : "> 60s");
                                        b2.put("lastAliveTime", String.valueOf(parseLong));
                                    } catch (Throwable unused) {
                                        b2.put("lastAliveTime", "unknown");
                                        com.apm.insight.entity.a.a(b2, "filters", "lastAliveTime", "unknown");
                                    }
                                    b2.put("has_dump", "true");
                                    if (b2.opt(U3.a.k) == null) {
                                        com.apm.insight.e.g();
                                        com.apm.insight.entity.a.a(b2, n.a());
                                    }
                                    if (Header.b(optJSONObject)) {
                                        com.apm.insight.entity.a.a(b2, "filters", "unauthentic_version", "unauthentic_version");
                                    }
                                    com.apm.insight.entity.d.b(b2);
                                    a2.b().put("upload_scene", "launch_scan");
                                    if (z2) {
                                        JSONObject jSONObject = new JSONObject();
                                        b2.put("event_type", "start_crash");
                                        b2.put("stack", b2.remove("data"));
                                        jSONObject.put("data", new JSONArray().put(b2));
                                        jSONObject.put("header", optJSONObject);
                                        bVar = a2;
                                        bVar.a(jSONObject);
                                    } else {
                                        bVar = a2;
                                        b2.put("isJava", 1);
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    bVar2 = a2;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                bVar = a2;
                                bVar2 = bVar;
                                com.apm.insight.l.f.a(file2);
                                com.apm.insight.c.a();
                                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                return bVar2;
                            }
                        } else {
                            bVar = a2;
                            com.apm.insight.l.f.a(file2);
                        }
                        return bVar;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    bVar = a2;
                }
            } catch (Throwable th8) {
                th = th8;
                com.apm.insight.l.f.a(file2);
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                return bVar2;
            }
        }
        com.apm.insight.l.f.a(file2);
        com.apm.insight.c.a();
        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
        return bVar2;
    }

    private void b(final C0001b c0001b, boolean z, @Nullable com.apm.insight.runtime.f fVar) {
        boolean z2;
        JSONObject a2;
        a aVar;
        if (c0001b.c.size() <= 1 && c0001b.c.isEmpty()) {
            c0001b.e = c0001b.d;
            return;
        }
        boolean b2 = com.apm.insight.l.k.b(this.a);
        c0001b.e = c0001b.d;
        com.apm.insight.nativecrash.a aVar2 = new com.apm.insight.nativecrash.a(this.a);
        for (a aVar3 : c0001b.c) {
            final File file = aVar3.a;
            try {
                aVar2.a(file);
                a2 = a(aVar2);
            } catch (Throwable th) {
                th = th;
                z2 = b2;
            }
            if (a2 == null || a2.length() == 0) {
                z2 = b2;
                aVar2.i();
            } else if (a2.length() != 0) {
                if (z) {
                    z2 = b2;
                    if (fVar != null && !fVar.a(BuildConfig.FLAVOR)) {
                        aVar2.i();
                    }
                } else {
                    long optLong = a2.optLong("crash_time");
                    try {
                        aVar = c0001b.e;
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = b2;
                    }
                    if (aVar == null) {
                        c0001b.e = aVar3;
                        c0001b.f = true;
                        if (fVar == null || fVar.a(BuildConfig.FLAVOR)) {
                            z2 = b2;
                        } else {
                            aVar2.i();
                        }
                    } else {
                        z2 = b2;
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                            com.apm.insight.l.f.a(file);
                            b2 = z2;
                        }
                        if (c0001b.f || optLong >= aVar.b) {
                            com.apm.insight.entity.a.a(a2, "filters", C4324ta.b, String.valueOf(a2.optJSONObject("header").opt(C4324ta.b)));
                            a2.optJSONObject("header").put(C4324ta.b, 2010);
                        } else {
                            c0001b.e = aVar3;
                            if (fVar == null || fVar.a(BuildConfig.FLAVOR)) {
                                a(file);
                                c0001b.f = true;
                            } else {
                                aVar2.i();
                                b2 = z2;
                            }
                        }
                    }
                }
                com.apm.insight.entity.a.a(a2, "filters", "start_uuid", c0001b.a);
                com.apm.insight.entity.a.a(a2, "filters", "crash_thread_name", a2.optString("crash_thread_name", "unknown"));
                if (z2) {
                    try {
                        c.a aVar4 = new c.a(a2, CrashType.NATIVE);
                        com.apm.insight.entity.b.a(a2, com.apm.insight.entity.b.a(aVar4.c(), aVar4.a(), o.a().b(aVar4.b() == -1 ? System.currentTimeMillis() : aVar4.b())), new b.a() { // from class: com.apm.insight.k.b.4
                            @Override // com.apm.insight.entity.b.a
                            public final void a(JSONObject jSONObject) {
                                d.a();
                                d.a(jSONObject, file, com.apm.insight.l.j.a(b.this.a, c0001b.a));
                            }
                        });
                        if (!aVar2.i()) {
                            aVar2.f();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        com.apm.insight.l.f.a(file);
                        b2 = z2;
                    }
                }
                c.a(CrashType.NATIVE, a2);
            } else {
                z2 = b2;
            }
            b2 = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.h || this.g == null) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.a)) {
            e();
        }
        int i = this.e;
        if (i == -1) {
            if (com.apm.insight.runtime.a.a() && com.apm.insight.runtime.a.f()) {
                this.e = 1;
                i = 1;
            } else {
                this.e = 0;
                i = 0;
            }
        }
        boolean z = i == 1;
        com.apm.insight.runtime.f fVar = new com.apm.insight.runtime.f(this.a);
        Iterator<C0001b> it = this.g.values().iterator();
        while (it.hasNext()) {
            b(it.next(), z, fVar);
        }
        Iterator<C0001b> it2 = this.g.values().iterator();
        while (it2.hasNext()) {
            a(it2.next(), z, fVar);
        }
        Iterator<C0001b> it3 = this.g.values().iterator();
        while (it3.hasNext()) {
            com.apm.insight.l.f.a(com.apm.insight.l.j.a(this.a, it3.next().a));
        }
        fVar.a();
        com.apm.insight.runtime.b.a();
        e();
    }

    private void e() {
        this.h = true;
        this.g = null;
        NativeImpl.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.h) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.a) || (System.currentTimeMillis() - com.apm.insight.e.j() <= 5000 && com.apm.insight.e.i().isApmExists() && !Npth.hasCrash())) {
            m.a().a(this.i, 5000L);
        } else {
            d();
        }
    }

    private void g() {
        File[] listFiles = com.apm.insight.l.j.i(this.a).listFiles();
        if (listFiles == null) {
            return;
        }
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file = listFiles[i];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a();
                file.getAbsolutePath();
            } else {
                try {
                    com.apm.insight.f.b c = com.apm.insight.l.f.c(file.getAbsolutePath());
                    if (c != null) {
                        if (c.b() != null) {
                            c.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), c.e(), c.d(), c.f(), c.g())) {
                            com.apm.insight.l.f.a(file);
                            String c2 = c.c();
                            if (!TextUtils.isEmpty(c2)) {
                                com.apm.insight.l.f.a(new File(c2));
                            }
                        }
                    } else {
                        com.apm.insight.l.f.a(file);
                    }
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                }
            }
        }
    }

    public final boolean c() {
        return this.h;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a {
        File a;
        long b;
        long c;

        @Nullable
        CrashType d;
        String e;

        public a(File file, @Nullable CrashType crashType) {
            this.b = -1L;
            this.c = -1L;
            this.a = file;
            this.d = crashType;
            this.e = file.getName();
        }

        public a(File file, long j, @Nullable CrashType crashType) {
            this.c = -1L;
            this.a = file;
            this.b = j;
            this.d = crashType;
            this.e = file.getName();
        }
    }

    public final void b() {
        try {
            if (!this.h && com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                m.a().a(this.j);
            }
        } catch (Throwable unused) {
        }
    }

    private void b(HashMap<String, C0001b> hashMap) {
        File[] listFiles = com.apm.insight.l.j.d(this.a).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file = listFiles[i];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith("G")) {
                    String name = file.getName();
                    C0001b c0001b = hashMap.get(name);
                    if (c0001b == null) {
                        c0001b = new C0001b(name);
                        hashMap.put(name, c0001b);
                    }
                    c0001b.c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    public static b a() {
        if (b == null) {
            synchronized (b.class) {
                try {
                    if (b == null) {
                        b = new b(com.apm.insight.e.g());
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final void a(boolean z) {
        if (!Npth.isStopUpload() && z) {
            if (this.f == null) {
                this.f = new C0001b("old_uuid");
                HashMap<String, C0001b> hashMap = new HashMap<>();
                this.g = hashMap;
                a(hashMap);
                a(this.g, this.f);
                com.apm.insight.l.f.a(com.apm.insight.l.j.b(this.a));
                b(this.g);
                b(this.f, true, null);
                a(this.f, true, null);
                this.f = null;
                if (this.g.isEmpty()) {
                    e();
                } else {
                    f();
                }
            }
            g();
            com.apm.insight.a.c();
        }
    }

    private void a(HashMap<String, C0001b> hashMap) {
        File[] listFiles = com.apm.insight.l.j.f(this.a).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file = listFiles[i];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith("G")) {
                    String name = file.getName();
                    C0001b c0001b = hashMap.get(name);
                    if (c0001b == null) {
                        c0001b = new C0001b(name);
                        hashMap.put(name, c0001b);
                    }
                    JSONArray a2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(file), com.apm.insight.l.j.m(file));
                    int length = a2.length();
                    c0001b.g = length;
                    if (length > 0) {
                        try {
                            com.apm.insight.l.f.a(com.apm.insight.l.j.n(file), a2);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    private void a(HashMap<String, C0001b> hashMap, C0001b c0001b) {
        File[] listFiles = com.apm.insight.l.j.a(this.a).listFiles();
        if (listFiles == null) {
            return;
        }
        Arrays.sort(listFiles, Collections.reverseOrder());
        char c = 0;
        int i = 0;
        while (i < listFiles.length) {
            File file = listFiles[i];
            try {
                if (com.apm.insight.e.a.a().a(file.getAbsolutePath())) {
                    com.apm.insight.l.f.a(file);
                } else if (!com.apm.insight.l.f.e(file) && !com.apm.insight.g.a.a().b(file.getName())) {
                    if (file.isFile()) {
                        com.apm.insight.l.f.a(file);
                    } else {
                        String name = file.getName();
                        if (name.endsWith("G")) {
                            String[] split = name.split("_");
                            CrashType crashType = null;
                            if (split.length < 5) {
                                c0001b.b.add(new a(file, null));
                            } else {
                                try {
                                    long parseLong = Long.parseLong(split[c]);
                                    long parseLong2 = Long.parseLong(split[4]);
                                    String str = split[2];
                                    String str2 = split[1];
                                    int hashCode = str2.hashCode();
                                    if (hashCode != -1109843021) {
                                        if (hashCode != 96741) {
                                            if (hashCode == 3254818 && str2.equals("java")) {
                                                crashType = CrashType.JAVA;
                                            }
                                        } else if (str2.equals("anr")) {
                                            crashType = CrashType.ANR;
                                        }
                                    } else if (str2.equals("launch")) {
                                        crashType = CrashType.LAUNCH;
                                    }
                                    C0001b c0001b2 = hashMap.get(str);
                                    if (c0001b2 == null) {
                                        c0001b2 = new C0001b(str);
                                        hashMap.put(str, c0001b2);
                                    }
                                    a aVar = new a(file, parseLong, crashType);
                                    aVar.c = parseLong2;
                                    a aVar2 = c0001b2.d;
                                    if ((aVar2 == null || aVar2.b > aVar.b) && crashType != null && crashType != CrashType.ANR && !name.contains("ignore")) {
                                        c0001b2.d = aVar;
                                    }
                                    c0001b2.b.add(aVar);
                                } catch (Throwable unused) {
                                    c0001b.b.add(new a(file, null));
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.j.a(new RuntimeException("err format crashTime:".concat(name)), "NPTH_CATCH");
                                }
                            }
                        } else {
                            com.apm.insight.l.f.a(file);
                        }
                    }
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
            i++;
            c = 0;
        }
    }

    private static JSONObject a(com.apm.insight.nativecrash.a aVar) {
        JSONObject b2 = aVar.b();
        if (b2 != null && b2.length() != 0) {
            return b2;
        }
        if (com.apm.insight.e.d()) {
            aVar.j();
        }
        if (!aVar.a()) {
            aVar.i();
            return null;
        }
        if (!aVar.d()) {
            aVar.i();
            return null;
        }
        if (aVar.e()) {
            aVar.i();
            return null;
        }
        aVar.c();
        return aVar.h();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:(5:31|32|33|(1:35)(1:81)|36)|(18:38|39|40|(1:42)|65|66|67|68|69|53|54|55|56|(1:58)|59|60|50|51)(1:80)|43|(11:45|(3:49|50|51)|53|54|55|56|(0)|59|60|50|51)|65|66|67|68|69|53|54|55|56|(0)|59|60|50|51) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0164, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0100, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0105, code lost:
    
        com.apm.insight.c.a();
        com.apm.insight.runtime.j.a(r0, "NPTH_CATCH");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0102, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0103, code lost:
    
        r17 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152 A[Catch: all -> 0x0164, TryCatch #3 {all -> 0x0164, blocks: (B:56:0x0146, B:58:0x0152, B:60:0x0166), top: B:55:0x0146 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(final C0001b c0001b, boolean z, @Nullable com.apm.insight.runtime.f fVar) {
        Iterator<a> it;
        final File file;
        CrashType crashType;
        final com.apm.insight.f.b a2;
        JSONArray jSONArray;
        JSONObject optJSONObject;
        CrashType crashType2;
        if (c0001b.b.isEmpty()) {
            return;
        }
        if (c0001b.e == null) {
            c0001b.e = c0001b.d;
        }
        Iterator<a> it2 = c0001b.b.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            try {
                file = next.a;
                crashType = next.d;
                try {
                    a2 = a(file, crashType, c0001b.a, next.b, next.c);
                } catch (Throwable th) {
                    th = th;
                    it = it2;
                }
            } catch (Throwable th2) {
                th = th2;
                it = it2;
            }
            if (a2 == null) {
                com.apm.insight.l.f.a(file);
            } else {
                JSONObject b2 = a2.b();
                if (b2 == null) {
                    com.apm.insight.l.f.a(file);
                } else {
                    JSONObject optJSONObject2 = b2.optJSONObject("header");
                    if (optJSONObject2 == null) {
                        com.apm.insight.l.f.a(file);
                    } else if (crashType == null && (new File(file, file.getName()).exists() || file.getName().split("_").length < 5)) {
                        if (e.b(a2.a(), b2.toString()).a()) {
                            com.apm.insight.l.f.a(file);
                        }
                    } else {
                        File a3 = com.apm.insight.entity.b.a(file);
                        if (!a3.exists()) {
                            com.apm.insight.l.f.a(file);
                        } else {
                            try {
                                jSONArray = new JSONArray(com.apm.insight.l.f.a(a3, "\n"));
                                optJSONObject = crashType == CrashType.LAUNCH ? ((JSONArray) b2.opt("data")).optJSONObject(0) : b2;
                            } catch (Throwable unused) {
                                it = it2;
                            }
                            if (z) {
                                it = it2;
                            } else {
                                it = it2;
                                try {
                                    if (c0001b.e == next) {
                                    }
                                    com.apm.insight.entity.a.a(optJSONObject, "filters", C4324ta.b, String.valueOf(optJSONObject2.opt(C4324ta.b)));
                                    crashType2 = crashType;
                                    com.apm.insight.entity.a.a(optJSONObject, "filters", "has_ignore", String.valueOf(next.e.contains("ignore")));
                                    optJSONObject2.put(C4324ta.b, 2010);
                                    com.apm.insight.entity.a.a(optJSONObject, "filters", "start_uuid", c0001b.a);
                                    com.apm.insight.entity.a.a(optJSONObject, "filters", "leak_threads_count", String.valueOf(c0001b.g));
                                    com.apm.insight.entity.a.a(optJSONObject, "filters", "crash_thread_name", optJSONObject.optString("crash_thread_name", "unknown"));
                                    com.apm.insight.entity.b.a(b2, jSONArray, new b.a() { // from class: com.apm.insight.k.b.3
                                        @Override // com.apm.insight.entity.b.a
                                        public final void a(JSONObject jSONObject) {
                                            e.a(a2.a(), jSONObject.toString(), new File(file, "logZip"), com.apm.insight.l.j.a(b.this.a, c0001b.a));
                                        }
                                    });
                                    if (!com.apm.insight.l.f.a(file)) {
                                        com.apm.insight.e.a.a().a(com.apm.insight.d.a.b(file.getAbsolutePath()));
                                    }
                                    c.a(crashType2, b2);
                                } catch (Throwable th3) {
                                    th = th3;
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                    com.apm.insight.l.f.a(next.a);
                                    it2 = it;
                                }
                                it2 = it;
                            }
                            if (!next.e.contains("ignore")) {
                                crashType2 = crashType;
                                if (fVar != null && !fVar.a(optJSONObject.optString("crash_md5", BuildConfig.FLAVOR))) {
                                    com.apm.insight.l.f.a(next.a);
                                    it2 = it;
                                }
                                com.apm.insight.entity.a.a(optJSONObject, "filters", "start_uuid", c0001b.a);
                                com.apm.insight.entity.a.a(optJSONObject, "filters", "leak_threads_count", String.valueOf(c0001b.g));
                                com.apm.insight.entity.a.a(optJSONObject, "filters", "crash_thread_name", optJSONObject.optString("crash_thread_name", "unknown"));
                                com.apm.insight.entity.b.a(b2, jSONArray, new b.a() { // from class: com.apm.insight.k.b.3
                                    @Override // com.apm.insight.entity.b.a
                                    public final void a(JSONObject jSONObject) {
                                        e.a(a2.a(), jSONObject.toString(), new File(file, "logZip"), com.apm.insight.l.j.a(b.this.a, c0001b.a));
                                    }
                                });
                                if (!com.apm.insight.l.f.a(file)) {
                                }
                                c.a(crashType2, b2);
                                it2 = it;
                            }
                            com.apm.insight.entity.a.a(optJSONObject, "filters", C4324ta.b, String.valueOf(optJSONObject2.opt(C4324ta.b)));
                            crashType2 = crashType;
                            com.apm.insight.entity.a.a(optJSONObject, "filters", "has_ignore", String.valueOf(next.e.contains("ignore")));
                            optJSONObject2.put(C4324ta.b, 2010);
                            com.apm.insight.entity.a.a(optJSONObject, "filters", "start_uuid", c0001b.a);
                            com.apm.insight.entity.a.a(optJSONObject, "filters", "leak_threads_count", String.valueOf(c0001b.g));
                            com.apm.insight.entity.a.a(optJSONObject, "filters", "crash_thread_name", optJSONObject.optString("crash_thread_name", "unknown"));
                            com.apm.insight.entity.b.a(b2, jSONArray, new b.a() { // from class: com.apm.insight.k.b.3
                                @Override // com.apm.insight.entity.b.a
                                public final void a(JSONObject jSONObject) {
                                    e.a(a2.a(), jSONObject.toString(), new File(file, "logZip"), com.apm.insight.l.j.a(b.this.a, c0001b.a));
                                }
                            });
                            if (!com.apm.insight.l.f.a(file)) {
                            }
                            c.a(crashType2, b2);
                            it2 = it;
                        }
                    }
                }
            }
        }
    }

    private static boolean a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }
}
