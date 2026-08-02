package defpackage;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hic {
    public static final Charset b = Charset.forName(C.UTF8_NAME);
    public final r18 a;

    public hic(r18 r18Var) {
        this.a = r18Var;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList b(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                d4a d4aVar = y5g.a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, NotificationCompat.FLAG_LOCAL_ONLY);
                }
                arrayList.add(new zu0(string2, string3, string4, string5, j));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(y5g.a.m(list.get(i))));
            } catch (JSONException unused) {
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    public final Map c(String str, boolean z) {
        FileInputStream fileInputStream;
        r18 r18Var = this.a;
        File k = z ? r18Var.k(str, "internal-keys") : r18Var.k(str, "keys");
        if (!k.exists() || k.length() == 0) {
            g(k, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(k);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            HashMap a = a(k53.z0(fileInputStream));
            k53.a0(fileInputStream);
            return a;
        } catch (Exception unused2) {
            fileInputStream2 = fileInputStream;
            f(k);
            k53.a0(fileInputStream2);
            return Collections.EMPTY_MAP;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            k53.a0(fileInputStream2);
            throw th;
        }
    }

    public final String d(String str) {
        FileInputStream fileInputStream;
        File k = this.a.k(str, "user-data");
        FileInputStream fileInputStream2 = null;
        if (!k.exists() || k.length() == 0) {
            f(k);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(k);
            try {
                try {
                    JSONObject jSONObject = new JSONObject(k53.z0(fileInputStream));
                    String optString = jSONObject.isNull("userId") ? null : jSONObject.optString("userId", null);
                    k53.a0(fileInputStream);
                    return optString;
                } catch (Exception unused) {
                    f(k);
                    k53.a0(fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                k53.a0(fileInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            k53.a0(fileInputStream2);
            throw th;
        }
    }

    public final void h(String str, Map map, boolean z) {
        String jSONObject;
        BufferedWriter bufferedWriter;
        r18 r18Var = this.a;
        File k = z ? r18Var.k(str, "internal-keys") : r18Var.k(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(k), b));
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(jSONObject);
            bufferedWriter.flush();
            k53.a0(bufferedWriter);
        } catch (Exception unused2) {
            bufferedWriter2 = bufferedWriter;
            f(k);
            k53.a0(bufferedWriter2);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            k53.a0(bufferedWriter2);
            throw th;
        }
    }

    public final void i(String str, List list) {
        String e;
        BufferedWriter bufferedWriter;
        File k = this.a.k(str, "rollouts-state");
        if (list.isEmpty()) {
            g(k, "Rollout state is empty for session: " + str);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                e = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(k), b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception unused) {
        }
        try {
            bufferedWriter.write(e);
            bufferedWriter.flush();
            k53.a0(bufferedWriter);
        } catch (Exception unused2) {
            bufferedWriter2 = bufferedWriter;
            f(k);
            k53.a0(bufferedWriter2);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            k53.a0(bufferedWriter2);
            throw th;
        }
    }

    public final void j(String str, String str2) {
        File k = this.a.k(str, "user-data");
        BufferedWriter bufferedWriter = null;
        try {
            gic gicVar = new gic();
            gicVar.put("userId", str2);
            String obj = gicVar.toString();
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(k), b));
            try {
                bufferedWriter2.write(obj);
                bufferedWriter2.flush();
                k53.a0(bufferedWriter2);
            } catch (Exception unused) {
                bufferedWriter = bufferedWriter2;
                k53.a0(bufferedWriter);
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                k53.a0(bufferedWriter);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
