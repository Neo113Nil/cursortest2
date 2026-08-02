package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;
import android.text.TextUtils;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class m implements com.safedk.android.utils.f {
    public static final String A = "fgr";
    public static final String B = "vst";
    public static final String C = "adr";
    public static final String D = "fsc";
    public static final String E = "fsr";
    public static final String F = "web";
    public static final String G = "vhc";
    public static final String H = "mrl";
    public static final String I = "url";
    public static final String J = "cuo";
    public static final String K = "typ";
    public static final String L = "vad";
    public static final String M = "mth";
    public static final String N = "ntw";
    public static final String O = "api";
    public static final String P = "org";
    public static final String Q = "dec";
    public static final String R = "cnt";
    public static final String S = "ads";
    public static final String T = "cls";
    public static final String U = "tchrcnt";
    public static final String V = "tchintrvl";
    public static final String W = "lvl";
    public static final String X = "can";
    public static final String Y = "fin";
    public static final String Z = "med";
    public static final String a = "pre";
    public static final String aa = "low";
    public static final String ab = "crt";
    public static final String ac = "||";
    public static final String ad = "|";
    public static final String ae = "=";
    public static final String af = "[...]";
    private static final String ag = "ImpressionLog";
    private static final int ah = 60;
    public static final String b = "pr2";
    public static final String c = "prd";
    public static final String d = "mwl";
    public static final String e = "mdl";
    public static final String f = "mwd";
    public static final String g = "mdd";
    public static final String h = "mck";
    public static final String i = "mdh";
    public static final String j = "mfd";
    public static final String k = "mrv";
    public static final String l = "add";
    public static final String m = "cim";
    public static final String n = "clk";
    public static final String o = "vib";
    public static final String p = "vie";
    public static final String q = "ppl";
    public static final String r = "lad";
    public static final String s = "lar";
    public static final String t = "img";
    public static final String u = "jsm";
    public static final String v = "wnr";
    public static final String w = "int";
    public static final String x = "rid";
    public static final String y = "exp";
    public static final String z = "bgr";
    private long ai = Long.MAX_VALUE;
    private long aj = Long.MAX_VALUE;
    private final Map<Long, List<String>> ak = new TreeMap();

    public static class a {
        public String a;
        public String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public m() {
    }

    public m(m mVar) {
        a(mVar);
    }

    public synchronized void a(m mVar) {
        if (mVar != null) {
            this.ai = Math.min(this.ai, mVar.ai);
            this.aj = Math.min(this.aj, mVar.aj);
            synchronized (mVar) {
                for (Map.Entry<Long, List<String>> entry : mVar.ak.entrySet()) {
                    List<String> list = this.ak.get(entry.getKey());
                    if (list == null) {
                        list = new ArrayList<>();
                        this.ak.put(entry.getKey(), list);
                    }
                    list.addAll(entry.getValue());
                }
            }
        }
    }

    private StringBuilder c(String str, a[] aVarArr) {
        StringBuilder sb = new StringBuilder(str);
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                String str2 = aVar.b;
                if (aVar.a.equals("url")) {
                    str2 = a(aVar.b, 60);
                }
                sb.append(ad);
                sb.append(aVar.a);
                sb.append("=");
                sb.append(str2);
            }
        }
        return sb;
    }

    public synchronized void a(Long l2, Long l3, String str, a... aVarArr) {
        this.ai = Math.min(this.ai, l2.longValue());
        this.aj = Math.min(this.aj, l3.longValue());
        try {
            if (!TextUtils.isEmpty(str)) {
                StringBuilder c2 = c(str, aVarArr);
                List<String> list = this.ak.get(l3);
                if (list == null) {
                    list = new ArrayList<>();
                    this.ak.put(l3, list);
                } else if (list.contains(c2.toString())) {
                    return;
                }
                list.add(c2.toString());
                Logger.d(ag, "add event: ", c2, " at: ", l2, ", count: ", Integer.valueOf(list.size()));
            }
        } catch (NullPointerException e2) {
            Logger.d(ag, "add event failed: type=", str, ", logEvents=", this.ak, ", timeElapsed=", l3);
        }
    }

    public void a(String str, a... aVarArr) {
        a(Long.valueOf(System.currentTimeMillis()), Long.valueOf(SystemClock.elapsedRealtime()), str, aVarArr);
    }

    public synchronized void b(Long l2, Long l3, String str, a... aVarArr) {
        this.ai = Math.min(this.ai, l2.longValue());
        this.aj = Math.min(this.aj, l3.longValue());
        if (!TextUtils.isEmpty(str)) {
            StringBuilder c2 = c(str, aVarArr);
            int i2 = 0;
            for (List<String> list : this.ak.values()) {
                Iterator<String> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String next = it.next();
                        if (next.contains(c2.toString())) {
                            i2 = b(next);
                            list.remove(next);
                            break;
                        }
                    }
                }
            }
            c2.append(ad);
            c2.append(R);
            c2.append("=");
            c2.append(i2 + 1);
            List<String> list2 = this.ak.get(l3);
            if (list2 == null) {
                list2 = new ArrayList<>();
                this.ak.put(l3, list2);
            }
            list2.add(c2.toString());
            Logger.d(ag, "add cumulative event: ", c2, " at: ", l2, ", count: ", Integer.valueOf(list2.size()));
        }
    }

    public void b(String str, a... aVarArr) {
        b(Long.valueOf(System.currentTimeMillis()), Long.valueOf(SystemClock.elapsedRealtime()), str, aVarArr);
    }

    private int b(String str) {
        try {
            String[] split = str.split("cnt=");
            if (split.length > 1) {
                return Integer.parseInt(split[1]);
            }
        } catch (Exception e2) {
            Logger.d(ag, "get cumulative event counter, failed to parse event count from: ", str);
        }
        return 0;
    }

    private String a(String str, int i2) {
        if (str != null && str.length() > i2) {
            return str.substring(0, ((i2 * 2) / 3) - 3) + af + str.substring((str.length() - (i2 / 3)) + 2);
        }
        return str;
    }

    public synchronized boolean a(String str) {
        Iterator<List<String>> it = this.ak.values().iterator();
        while (it.hasNext()) {
            Iterator<String> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (it2.next().contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int a() {
        return this.ak.size();
    }

    public synchronized String toString() {
        StringBuilder sb;
        boolean z2 = true;
        sb = new StringBuilder();
        for (Map.Entry<Long, List<String>> entry : this.ak.entrySet()) {
            for (String str : entry.getValue()) {
                if (z2) {
                    sb.append(this.ai);
                    z2 = false;
                } else {
                    sb.append(ac);
                    sb.append(entry.getKey().longValue() - this.aj);
                }
                sb.append(ad);
                sb.append(str);
            }
        }
        return sb.toString();
    }

    @Override // com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("referenceTimeMillis", this.ai);
        jSONObject.put("referenceTimeElapsed", this.aj);
        if (!this.ak.isEmpty()) {
            jSONObject.put("logEvents", com.safedk.android.utils.d.a(this.ak));
        }
        return jSONObject;
    }

    @Override // com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.ai = jSONObject.optLong("referenceTimeMillis", 0L);
            this.aj = jSONObject.optLong("referenceTimeElapsed", 0L);
            JSONObject optJSONObject = jSONObject.optJSONObject("logEvents");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.ak.put(Long.valueOf(Long.parseLong(next)), com.safedk.android.utils.d.b(optJSONObject.getJSONArray(next)));
                }
            }
        }
    }
}
