package com.playtika.pras.d;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes8.dex */
public final class g {
    public final i a;
    public boolean f = false;
    public boolean i = false;
    public boolean k = true;
    public int l = 2;
    public int m = 10000;
    public int n = 5;
    public int o = 5000;
    public JSONArray b = new JSONArray();
    public final d c = new d(this);
    public final Handler d = new Handler(Looper.getMainLooper());
    public final e e = new e(this);
    public final List j = Collections.synchronizedList(new ArrayList());
    public final Handler g = new Handler(Looper.getMainLooper());
    public final f h = new f(this);

    public g(String str) {
        this.a = new i(str);
    }

    public final c a() {
        int length = this.b.length();
        if (length == 0) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < length; i++) {
                jSONArray.put(this.b.get(i));
            }
            return new c(jSONArray, UUID.randomUUID().toString());
        } catch (JSONException e) {
            com.playtika.pras.c.d.a("Error parsing JSON: " + e.getMessage());
            return null;
        }
    }

    public final synchronized String b() {
        if (this.j.isEmpty()) {
            return null;
        }
        String str = X3.j.d;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            String str2 = str + ((c) it.next()).toString();
            str = it.hasNext() ? str2 + "," : str2 + X3.j.e;
        }
        return str;
    }

    public final void c() {
        if (this.k) {
            try {
                String b = b();
                if (b == null) {
                    synchronized (com.playtika.pras.c.f.class) {
                        throw new IllegalStateException("f".concat(" is not initialized, call init() method first."));
                    }
                }
                com.playtika.pras.c.d.a("@@@ to save: ".concat(b));
                com.playtika.pras.c.f.a();
                throw null;
            } catch (Exception unused) {
            }
        }
    }
}
