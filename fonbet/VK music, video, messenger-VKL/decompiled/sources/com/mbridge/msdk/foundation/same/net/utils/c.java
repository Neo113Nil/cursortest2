package com.mbridge.msdk.foundation.same.net.utils;

import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.tracker.network.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import xsna.i5s;
import xsna.wga0;

/* compiled from: RequestControlUtil.java */
/* loaded from: classes13.dex */
public class c {
    private final String a;
    private int b;
    private ConcurrentHashMap<String, b> c;
    private ArrayList<Integer> d;

    /* compiled from: RequestControlUtil.java */
    public static class b {
        public int a;
        public String b;
        public long c;

        public b(long j, int i, String str) {
            this.c = j;
            this.a = i;
            this.b = str;
        }
    }

    /* compiled from: RequestControlUtil.java */
    /* renamed from: com.mbridge.msdk.foundation.same.net.utils.c$c, reason: collision with other inner class name */
    public static class C0274c {
        private static final c a = new c();
    }

    private e a(String str, String str2, String str3, String str4, String str5) {
        int parseInt;
        String a2 = i5s.a(i5s.b(str, BundleUtil.UNDERLINE_TAG, str3, BundleUtil.UNDERLINE_TAG, str2), BundleUtil.UNDERLINE_TAG, str5);
        b a3 = a(a2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g("data_res_type", "1"));
        if (a3 != null && !TextUtils.isEmpty(a3.b)) {
            try {
                if (a3.a != -1) {
                    return e.a(new JSONObject(a3.b), new com.mbridge.msdk.foundation.same.net.toolbox.a(200, a3.b.getBytes(), arrayList));
                }
                if (!TextUtils.isEmpty(str4)) {
                    return null;
                }
                if (str5 != null && !TextUtils.isEmpty(str5) && (parseInt = Integer.parseInt(str5)) != 287 && parseInt != 94) {
                    if (System.currentTimeMillis() < (i.b().c(str, str2).u() * 1000) + a3.c) {
                        return e.a(new JSONObject(a3.b), new com.mbridge.msdk.foundation.same.net.toolbox.a(200, a3.b.getBytes(), arrayList));
                    }
                    this.c.remove(a2);
                    return null;
                }
            } catch (Exception e) {
                q0.b("IDErrorUtil", e.getMessage());
            }
        }
        q0.b("IDErrorUtil", "getErrorInfo RETURN NULL");
        return null;
    }

    public static c b() {
        return C0274c.a;
    }

    private c() {
        this.a = "IDErrorUtil";
        this.c = new ConcurrentHashMap<>();
        this.d = new ArrayList<>();
        com.mbridge.msdk.setting.g a2 = wga0.a(i.b());
        a2 = a2 == null ? i.b().a() : a2;
        this.b = a2.u() * 1000;
        if (a2.z() == null || a2.z().size() <= 0) {
            q0.b("IDErrorUtil", "Setting ercd is EMPTY and use default code list.");
            this.d.addAll(a());
        } else {
            q0.b("IDErrorUtil", "Setting ercd not EMPTY will use setting.");
            this.d.addAll(a2.z());
        }
    }

    private List<Integer> a() {
        return Arrays.asList(-1, -10, -1201, -1202, -1203, -1205, -1206, -1208, -1301, -1302, -1305, -1306, -1307, -1915, 10602, 10603, 10604, 10609, 10610, 10616);
    }

    public synchronized void a(String str, int i, String str2, long j) {
        if (this.c.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.d.contains(Integer.valueOf(i))) {
            q0.b("IDErrorUtil", "addErrorInfo : " + str + " " + str2);
            this.c.put(str, new b(j, i, str2));
        }
    }

    public e a(com.mbridge.msdk.foundation.same.net.wrapper.e eVar) {
        String str = eVar.a().get("app_id");
        String str2 = eVar.a().get("placement_id");
        String str3 = TextUtils.isEmpty(str2) ? "" : str2;
        String str4 = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (TextUtils.isEmpty(str4)) {
            str4 = eVar.a().get("unit_ids");
            if (!TextUtils.isEmpty(str4)) {
                str4 = str4.replace(X3.j.d, "").replace(X3.j.e, "");
            }
        }
        String str5 = str4;
        String str6 = eVar.a().get("ad_type");
        if (TextUtils.isEmpty(str6)) {
            str6 = "0";
        }
        return a(str, str5, str3, eVar.a().get("token"), str6);
    }

    private synchronized b a(String str) {
        b bVar;
        q0.b("IDErrorUtil", "getErrorInfo : " + str);
        if (!this.c.containsKey(str) || (bVar = this.c.get(str)) == null) {
            return null;
        }
        if (bVar.a == -1) {
            return bVar;
        }
        if (System.currentTimeMillis() > bVar.c + this.b) {
            this.c.remove(str);
            if (this.c.size() > 0) {
                for (Map.Entry<String, b> entry : this.c.entrySet()) {
                    q0.b("IDErrorUtil", "getErrorInfo : delete timeout entry");
                    if (System.currentTimeMillis() - entry.getValue().c > this.b) {
                        this.c.remove(entry.getKey());
                    }
                }
            }
            return null;
        }
        q0.b("IDErrorUtil", "getErrorInfo : " + bVar.b);
        return bVar;
    }
}
