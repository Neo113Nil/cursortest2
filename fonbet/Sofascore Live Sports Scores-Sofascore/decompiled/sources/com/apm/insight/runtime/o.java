package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o {
    private static o a;
    private File b;
    private File c;
    private File d;
    private Context e;
    private a f = null;

    private o(Context context) {
        File c = com.apm.insight.l.j.c(context);
        if (!c.exists() || (!c.isDirectory() && c.delete())) {
            c.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.b = c;
        this.c = new File(c, "did");
        this.d = new File(c, "device_uuid");
        this.e = context;
    }

    private ArrayList<a> c(final String str) {
        File[] listFiles = this.b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.o.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (listFiles != null) {
            com.apm.insight.a.a((Object) ("foundRuntimeContextFiles " + listFiles.length));
            byte b = 0;
            a aVar = null;
            for (File file : listFiles) {
                try {
                    a aVar2 = new a(file, b);
                    arrayList.add(aVar2);
                    if (this.f == null && ".ctx".equals(str) && (aVar == null || aVar2.b >= aVar.b)) {
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    j.a(th, "NPTH_CATCH");
                }
            }
            if (this.f == null && aVar != null) {
                this.f = aVar;
            }
        }
        return arrayList;
    }

    @Nullable
    public final JSONObject a(long j) {
        JSONObject jSONObject;
        File file;
        boolean z;
        String str;
        Iterator<a> it = c(".ctx").iterator();
        while (true) {
            jSONObject = null;
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j >= next.a && j <= next.b) {
                file = next.c;
                break;
            }
        }
        if (file == null) {
            Iterator<a> it2 = c(".ctx").iterator();
            a aVar = null;
            while (it2.hasNext()) {
                a next2 = it2.next();
                if (aVar == null || Math.abs(aVar.b - j) > Math.abs(next2.b - j)) {
                    aVar = next2;
                }
            }
            file = aVar == null ? null : aVar.c;
            z = true;
        } else {
            z = false;
        }
        if (file != null) {
            try {
                str = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    th = th;
                    com.apm.insight.c.a();
                    j.a(new IOException("content :".concat(String.valueOf(str)), th), "NPTH_CATCH");
                    if (jSONObject != null) {
                        try {
                            jSONObject.put("unauthentic_version", 1);
                        } catch (JSONException e) {
                            com.apm.insight.c.a();
                            j.a(e, "NPTH_CATCH");
                        }
                    }
                    return jSONObject;
                }
            } catch (Throwable th2) {
                th = th2;
                str = null;
            }
        }
        if (jSONObject != null && z) {
            jSONObject.put("unauthentic_version", 1);
        }
        return jSONObject;
    }

    @Nullable
    public final JSONArray b(long j) {
        File file;
        String str;
        Iterator<a> it = c(".allData").iterator();
        while (true) {
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j >= next.a && j <= next.b) {
                file = next.c;
                break;
            }
        }
        if (file == null) {
            Iterator<a> it2 = c(".allData").iterator();
            a aVar = null;
            while (it2.hasNext()) {
                a next2 = it2.next();
                if (aVar == null || Math.abs(aVar.b - j) > Math.abs(next2.b - j)) {
                    aVar = next2;
                }
            }
            file = aVar == null ? null : aVar.c;
        }
        if (file != null) {
            try {
                str = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
                try {
                    return new JSONArray(str);
                } catch (Throwable th) {
                    th = th;
                    com.apm.insight.c.a();
                    j.a(new IOException("content :".concat(String.valueOf(str)), th), "NPTH_CATCH");
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                str = null;
            }
        }
        return null;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a {
        private long a;
        private long b;
        private File c;
        private JSONObject d;

        private a(File file) {
            this.d = null;
            this.c = file;
            String[] split = file.getName().split("-|\\.");
            if (split.length >= 2) {
                this.a = Long.parseLong(split[0]);
                this.b = Long.parseLong(split[1]);
                return;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name) || name.length() < 13) {
                return;
            }
            String substring = name.substring(0, 13);
            if (TextUtils.isDigitsOnly(substring)) {
                long parseLong = Long.parseLong(substring);
                this.a = parseLong;
                this.b = parseLong;
            }
        }

        public static /* synthetic */ boolean a(a aVar, long j) {
            long j2 = aVar.a;
            if (j2 > j && j2 - j > 604800000) {
                return true;
            }
            long j3 = aVar.b;
            if (j3 >= j || j - j3 <= 604800000) {
                return aVar.c.lastModified() < j && j - aVar.c.lastModified() > 604800000;
            }
            return true;
        }

        public static /* synthetic */ void d(a aVar) {
            aVar.c.delete();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject a() {
            JSONObject jSONObject = this.d;
            if (jSONObject != null) {
                return jSONObject;
            }
            try {
                this.d = new JSONObject(com.apm.insight.l.f.a(this.c.getAbsolutePath(), "\n"));
            } catch (Throwable unused) {
            }
            JSONObject jSONObject2 = this.d;
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            JSONObject jSONObject3 = new JSONObject();
            this.d = jSONObject3;
            return jSONObject3;
        }

        public /* synthetic */ a(File file, byte b) {
            this(file);
        }
    }

    public final String c() {
        try {
            return com.apm.insight.l.f.a(this.d.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void b(String str) {
        try {
            com.apm.insight.l.f.a(this.d, str, false);
        } catch (Throwable unused) {
        }
    }

    public final String b() {
        try {
            return com.apm.insight.l.f.a(this.c.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return "0";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:21:0x0070, B:25:0x007e, B:26:0x0082, B:28:0x0088, B:31:0x0094), top: B:20:0x0070 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Map<String, Object> map, JSONArray jSONArray) {
        ArrayList<a> c;
        JSONObject a2 = Header.a(this.e).a(map);
        if (Header.c(a2)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f == null) {
            c(".ctx");
        }
        a aVar = this.f;
        if (aVar != null) {
            JSONObject a3 = aVar.a();
            try {
                if (!Header.c(a3)) {
                    if (!Header.c(a2)) {
                        if (String.valueOf(a2.opt("update_version_code")).equals(String.valueOf(a3.opt("update_version_code"))) && Header.d(a3)) {
                            a(aVar.a, currentTimeMillis, a2, jSONArray);
                            currentTimeMillis = currentTimeMillis;
                            com.apm.insight.l.f.a(aVar.c);
                        }
                    }
                    c = c("");
                    if (c.size() > 6) {
                        return;
                    }
                    Iterator<a> it = c.iterator();
                    while (it.hasNext()) {
                        a next = it.next();
                        if (a.a(next, currentTimeMillis)) {
                            a.d(next);
                        }
                    }
                    return;
                }
                c = c("");
                if (c.size() > 6) {
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                j.a(th, "NPTH_CATCH");
                return;
            }
            a(currentTimeMillis, currentTimeMillis, a2, jSONArray);
        } else {
            a(currentTimeMillis, currentTimeMillis, a2, jSONArray);
        }
    }

    private void a(long j, long j2, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.b, j + "-" + j2 + ".ctx");
        File file2 = new File(this.b, j + "-" + j2 + ".allData");
        try {
            com.apm.insight.l.f.a(file, jSONObject);
            com.apm.insight.l.f.a(file2, jSONArray);
            this.f = new a(file, (byte) 0);
        } catch (IOException e) {
            com.apm.insight.c.a();
            j.a(e, "NPTH_CATCH");
        }
    }

    public final void a(String str) {
        try {
            com.apm.insight.l.f.a(this.c, str, false);
        } catch (Throwable unused) {
        }
    }

    public static o a() {
        o oVar = a;
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(com.apm.insight.e.g());
        a = oVar2;
        return oVar2;
    }
}
