package com.apm.insight.nativecrash;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.apm.insight.ICommonParams;
import com.apm.insight.l.m;
import com.apm.insight.runtime.j;
import com.ironsource.C4324ta;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b {
    private Context a;
    private ICommonParams b;
    private ICommonParams c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a extends c {
        public a(File file) {
            super(file);
            this.b = "Total FD Count:";
            this.c = ":";
            this.d = -2;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.apm.insight.nativecrash.b$b, reason: collision with other inner class name */
    public static class C0003b extends c {
        public C0003b(File file) {
            super(file);
            this.b = "VmSize:";
            this.c = "\\s+";
            this.d = -1;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class d extends c {
        public d(File file) {
            super(file);
        }

        @NonNull
        public final HashMap<String, List<String>> b() {
            HashMap<String, List<String>> hashMap = new HashMap<>();
            try {
                JSONArray a = com.apm.insight.l.f.a(this.a.getAbsolutePath());
                if (a != null) {
                    for (int i = 0; i < a.length(); i++) {
                        String optString = a.optString(i);
                        if (!TextUtils.isEmpty(optString) && optString.startsWith("[tid:0") && optString.endsWith("sigstack:0x0]")) {
                            int indexOf = optString.indexOf("[routine:0x");
                            int i2 = indexOf + 11;
                            String substring = indexOf > 0 ? optString.substring(i2, optString.indexOf(93, i2)) : "unknown addr";
                            List<String> list = hashMap.get(substring);
                            if (list == null) {
                                list = new ArrayList<>();
                                hashMap.put(substring, list);
                            }
                            list.add(optString);
                        }
                    }
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                com.apm.insight.c.a();
                j.a(th, "NPTH_CATCH");
            }
            return hashMap;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class e extends c {
        public e(File file) {
            super(file);
        }

        @NonNull
        public final JSONArray a(HashMap<String, List<String>> hashMap) {
            int indexOf;
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (!hashMap.isEmpty()) {
                try {
                    JSONArray a = com.apm.insight.l.f.a(this.a.getAbsolutePath());
                    if (a != null) {
                        for (int i = 0; i < a.length(); i++) {
                            String optString = a.optString(i);
                            if (!TextUtils.isEmpty(optString) && (indexOf = optString.indexOf(":")) > 2) {
                                String substring = optString.substring(2, indexOf);
                                if (hashMap.containsKey(substring) && (list = hashMap.get(substring)) != null) {
                                    Iterator<String> it = list.iterator();
                                    while (it.hasNext()) {
                                        jSONArray.put(it.next() + " " + optString);
                                    }
                                    hashMap.remove(substring);
                                }
                            }
                        }
                        Iterator<List<String>> it2 = hashMap.values().iterator();
                        while (it2.hasNext()) {
                            Iterator<String> it3 = it2.next().iterator();
                            while (it3.hasNext()) {
                                jSONArray.put(it3.next() + "  0x000000:unknown");
                            }
                        }
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    j.a(th, "NPTH_CATCH");
                }
            }
            return jSONArray;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class f extends c {
        public f(File file) {
            super(file);
            this.b = "Total Threads Count:";
            this.c = ":";
            this.d = -2;
        }
    }

    public b(Context context, ICommonParams iCommonParams, b bVar) {
        this.a = context;
        this.b = iCommonParams;
        this.c = bVar == null ? null : bVar.b;
    }

    public static boolean a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return ((map.containsKey("app_version") || map.containsKey("version_name")) && map.containsKey("version_code") && map.containsKey("update_version_code")) ? false : true;
    }

    public static int c(String str) {
        return new C0003b(com.apm.insight.l.j.d(str)).a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.Map] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> b() {
        HashMap hashMap;
        Throwable th;
        HashMap hashMap2;
        boolean a2;
        HashMap commonParams;
        try {
            ICommonParams iCommonParams = this.c;
            commonParams = iCommonParams != null ? iCommonParams.getCommonParams() : new HashMap();
        } catch (Throwable th2) {
            th = th2;
            hashMap = null;
        }
        try {
            commonParams.putAll(this.b.getCommonParams());
            th = null;
            hashMap2 = commonParams;
        } catch (Throwable th3) {
            hashMap = commonParams;
            th = th3;
            HashMap hashMap3 = hashMap;
            th = th;
            hashMap2 = hashMap3;
            if (hashMap2 == null) {
            }
            a2 = a(hashMap2);
            Context context = this.a;
            if (a2) {
            }
            return hashMap2;
        }
        if (hashMap2 == null) {
            hashMap2 = new HashMap(4);
            if (th != null) {
                try {
                    hashMap2.put("err_info", m.a(th));
                } catch (Throwable unused) {
                }
            }
        }
        a2 = a(hashMap2);
        Context context2 = this.a;
        if (a2) {
            try {
                String str = context2.getPackageManager().getPackageInfo(this.a.getPackageName(), 128).versionName;
                String str2 = (String) Class.forName(this.a.getPackageName() + ".BuildConfig").getDeclaredField("VERSION_NAME").get(null);
                if (str != null && !str.equals(str2)) {
                    hashMap2.put("manifest_version", str);
                }
            } catch (Throwable unused2) {
            }
        } else {
            try {
                PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(this.a.getPackageName(), 128);
                hashMap2.put("version_name", packageInfo.versionName);
                hashMap2.put("version_code", Integer.valueOf(packageInfo.versionCode));
                if (hashMap2.get("update_version_code") == null) {
                    Bundle bundle = packageInfo.applicationInfo.metaData;
                    Object obj = bundle != null ? bundle.get("UPDATE_VERSION_CODE") : null;
                    if (obj == null) {
                        obj = hashMap2.get("version_code");
                    }
                    hashMap2.put("update_version_code", obj);
                }
            } catch (Throwable unused3) {
                hashMap2.put("version_name", com.apm.insight.l.a.c(this.a));
                hashMap2.put("version_code", Integer.valueOf(com.apm.insight.l.a.d(this.a)));
                if (hashMap2.get("update_version_code") == null) {
                    hashMap2.put("update_version_code", hashMap2.get("version_code"));
                }
            }
        }
        return hashMap2;
    }

    public final String d() {
        try {
            return this.b.getDeviceId();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final String e() {
        try {
            return String.valueOf(this.b.getCommonParams().get(C4324ta.b));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    public final long f() {
        try {
            return this.b.getUserId();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @NonNull
    public final ICommonParams c() {
        return this.b;
    }

    public b(Context context, ICommonParams iCommonParams) {
        this(context, iCommonParams, null);
    }

    public static int a(String str) {
        return new a(com.apm.insight.l.j.b(str)).a();
    }

    public final Map<String, Object> a() {
        Object obj;
        Map<String, Object> b = b();
        if (((b == null || (obj = b.get(C4324ta.b)) == null) ? null : String.valueOf(obj)) == null) {
            b.put(C4324ta.b, 4444);
        }
        return b;
    }

    @NonNull
    public static JSONArray a(File file, File file2) {
        return new e(file2).a(new d(file).b());
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class c {
        protected File a;
        protected String b;
        protected String c;
        protected int d;

        public c(File file) {
            this.a = file;
        }

        public final int a() {
            int i = -1;
            if (!this.a.exists() || !this.a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.a));
                int i2 = -1;
                do {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        i2 = a(readLine);
                    } catch (Throwable th) {
                        th = th;
                        i = i2;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.insight.c.a();
                            j.a(th, "NPTH_CATCH");
                            return i;
                        } finally {
                            if (bufferedReader != null) {
                                com.apm.insight.a.a((Closeable) bufferedReader);
                            }
                        }
                    }
                } while (i2 == -1);
                com.apm.insight.a.a((Closeable) bufferedReader2);
                return i2;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private int a(String str) {
            int i = this.d;
            if (!str.startsWith(this.b)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.c)[1].trim());
            } catch (NumberFormatException e) {
                com.apm.insight.c.a();
                j.a(e, "NPTH_CATCH");
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    public static int b(String str) {
        return new f(com.apm.insight.l.j.c(str)).a();
    }
}
