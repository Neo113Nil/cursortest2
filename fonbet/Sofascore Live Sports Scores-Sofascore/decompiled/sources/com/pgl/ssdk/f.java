package com.pgl.ssdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f {
    public static long a = 28800;
    public static int b = 5;

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0193, code lost:
    
        if (r8 != null) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject a(File file, boolean z) {
        ZipFile zipFile;
        int i;
        char c;
        String str;
        ArrayList arrayList;
        String str2;
        long a2;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        JSONObject jSONObject2 = new JSONObject();
        try {
            zipFile = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    if (nextElement != null) {
                        String name = nextElement.getName();
                        if (!TextUtils.isEmpty(name) || !nextElement.isDirectory()) {
                            String[] split = name.split("/");
                            long size = nextElement.getSize();
                            ArrayList arrayList8 = arrayList3;
                            if (name.startsWith("res/drawable/")) {
                                i = 2;
                                if (name.length() > 13) {
                                    str = split[2];
                                    arrayList = arrayList8;
                                    arrayList.add(str);
                                    arrayList3 = arrayList8;
                                }
                            } else {
                                i = 2;
                            }
                            if (name.startsWith("res/")) {
                                c = 1;
                                if (split.length == i) {
                                    str = split[1];
                                    arrayList = arrayList4;
                                    arrayList.add(str);
                                    arrayList3 = arrayList8;
                                }
                            } else {
                                c = 1;
                            }
                            if (!name.startsWith("assets/") || split.length < 2) {
                                if (name.startsWith("lib/armeabi/") && name.length() > 12) {
                                    str = split[2];
                                    arrayList = arrayList5;
                                } else if (name.startsWith("lib/armeabi-v7a/") && name.length() > 16) {
                                    str = split[2];
                                    arrayList = arrayList6;
                                } else if (name.startsWith("lib/arm64-v8a/") && name.length() > 14) {
                                    str = split[2];
                                    arrayList = arrayList7;
                                }
                                arrayList.add(str);
                            } else {
                                arrayList2.add(split[c]);
                                if (name.startsWith("assets/assets/resources/native/") && split.length >= 6 && jSONObject2.length() < 10) {
                                    if (!TextUtils.isEmpty(split[4]) && !jSONObject2.has(split[4])) {
                                        str2 = split[4];
                                        a2 = a(size, zipFile.getInputStream(nextElement));
                                    } else if (jSONObject2.has(split[4])) {
                                        long j = jSONObject2.getLong(split[4]);
                                        str2 = split[4];
                                        a2 = j + a(size, zipFile.getInputStream(nextElement));
                                    }
                                    jSONObject2.put(str2, a2);
                                }
                            }
                            arrayList3 = arrayList8;
                        }
                    }
                }
                ArrayList arrayList9 = arrayList3;
                JSONObject jSONObject3 = new JSONObject();
                a(jSONObject3, "eabi", arrayList5, false);
                a(jSONObject3, "v7a", arrayList6, false);
                a(jSONObject3, "v8a", arrayList7, false);
                if (jSONObject3.length() > 0) {
                    jSONObject.put("lib", jSONObject3);
                }
                if (z && jSONObject3.length() <= 0) {
                    jSONObject = a();
                }
                if (jSONObject2.length() > 0) {
                    jSONObject.put("cocos", jSONObject2);
                }
                a(jSONObject, "assets", arrayList2, false);
                JSONObject a3 = a(arrayList9);
                if (a3 != null && a3.length() > 0) {
                    jSONObject.put("drawable", a3);
                }
                JSONObject a4 = a(arrayList4);
                if (a4 != null && a4.length() > 0) {
                    jSONObject.put("res", a4);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            zipFile = null;
        }
        try {
            zipFile.close();
        } catch (IOException unused3) {
        }
        return jSONObject;
    }

    public static long b() {
        Context a2 = z.a();
        if (a2 == null) {
            return 0L;
        }
        long a3 = aw.a(a2, "pgl_frt", 0L);
        if (a3 != 0) {
            return a3;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        aw.b(a2, "pgl_frt", currentTimeMillis);
        return currentTimeMillis;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized void c() {
        PglSSCallBack pglCallBack;
        synchronized (f.class) {
            if (d()) {
                String e = v.e();
                if (TextUtils.isEmpty(e)) {
                    return;
                }
                File file = new File(e);
                if (file.exists()) {
                    JSONObject a2 = a(file, true);
                    a2.put("apk_info", v.c());
                    a2.put("app_name", ab.d(z.a()));
                    PglSSManager pglSSManager = PglSSManager.getInstance();
                    if (pglSSManager != null && (pglCallBack = pglSSManager.getPglCallBack()) != null) {
                        pglCallBack.reportSoftDecData("detailed_app_info", a2.toString());
                    }
                }
            }
        }
    }

    private static boolean d() {
        if (aw.a(z.a(), "pgl_is_hit", 0) > 0) {
            return false;
        }
        if ((System.currentTimeMillis() / 1000) - b() < a) {
            return false;
        }
        aw.b(z.a(), "pgl_is_hit", 1);
        return e();
    }

    private static boolean e() {
        boolean z = b == 100;
        return !z ? ((int) ((Math.random() * 100.0d) + 1.0d)) <= b : z;
    }

    public static JSONObject a() {
        String[] strArr;
        Context a2 = z.a();
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (a2 != null) {
            ApplicationInfo applicationInfo = a2.getApplicationInfo();
            String str = applicationInfo.nativeLibraryDir;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists() && file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null && listFiles.length > 0) {
                        for (File file2 : listFiles) {
                            arrayList.add(file2.getName());
                        }
                    }
                    a(jSONObject2, "arm64".equals(file.getName()) ? "v8a" : "v7a", arrayList, false);
                    if (jSONObject2.length() > 0) {
                        jSONObject.put("lib", jSONObject2);
                    }
                }
            }
            if (arrayList.isEmpty() && (strArr = applicationInfo.splitPublicSourceDirs) != null) {
                for (String str2 : strArr) {
                    if (str2.endsWith("armeabi-v7a.apk") || str2.endsWith("arm64_v8a.apk")) {
                        File file3 = new File(str2);
                        if (file3.exists()) {
                            return a(file3, false);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public static long a(long j, InputStream inputStream) {
        if (j != -1) {
            return j;
        }
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j2;
            }
            j2 += read;
        }
    }

    private static JSONObject a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str : list) {
            if (str.endsWith(".png")) {
                arrayList2.add(str.substring(0, str.lastIndexOf(".png")));
            } else if (str.endsWith(".xml")) {
                arrayList.add(str.substring(0, str.lastIndexOf(".xml")));
            } else {
                arrayList3.add(str);
            }
        }
        a(jSONObject, "xml", arrayList, true);
        a(jSONObject, "png", arrayList2, true);
        a(jSONObject, "other", arrayList3, true);
        return jSONObject;
    }

    public static void a(JSONObject jSONObject, String str, List<String> list, boolean z) {
        if (jSONObject == null || list == null || list.isEmpty()) {
            return;
        }
        if (z) {
            try {
                jSONObject.put(str + "_size", list.size());
            } catch (JSONException unused) {
                return;
            }
        }
        jSONObject.put(str, n.a(list));
    }
}
