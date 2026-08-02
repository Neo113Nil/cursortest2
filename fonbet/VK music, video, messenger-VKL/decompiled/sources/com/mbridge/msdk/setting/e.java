package com.mbridge.msdk.setting;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: MBDNSManager.java */
/* loaded from: classes14.dex */
public class e {
    public int a;
    private HashMap<String, f> b;

    /* compiled from: MBDNSManager.java */
    public static class b {
        private static final e a = new e();
    }

    public static e a() {
        return b.a;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.b == null) {
                this.b = new HashMap<>();
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                f fVar = new f();
                fVar.a(next);
                fVar.b(string);
                this.b.put(next, fVar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private e() {
        this.a = 6;
        this.b = new HashMap<>();
    }

    public int a(String str) {
        HashMap<String, f> hashMap;
        f fVar;
        if (TextUtils.isEmpty(str) || (hashMap = this.b) == null || !hashMap.containsKey(str) || (fVar = this.b.get(str)) == null) {
            return 0;
        }
        int i = fVar.b() ? 1 : fVar.a() >= this.a ? 2 : 0;
        fVar.a(false);
        return i;
    }
}
