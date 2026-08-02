package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class Fg {
    private int b = 4;
    private int c = 4;
    private HashMap<String, Boolean> a = new a();

    public class a extends HashMap<String, Boolean> {
        public a() {
            put(C4313f8.k, Boolean.valueOf(Fg.this.b == 0));
            put(C4313f8.l, Boolean.valueOf(Fg.this.c == 0));
            Boolean bool = Boolean.FALSE;
            put(C4313f8.m, bool);
            put(C4313f8.n, bool);
        }
    }

    public void a(String str, int i, boolean z) {
        boolean z2 = false;
        if (this.a.containsKey(str)) {
            this.a.put(str, Boolean.valueOf(i == 0));
        }
        this.a.put(C4313f8.m, Boolean.valueOf(z));
        if ((this.a.get(C4313f8.l).booleanValue() || this.a.get(C4313f8.k).booleanValue()) && this.a.get(C4313f8.m).booleanValue()) {
            z2 = true;
        }
        this.a.put(C4313f8.n, Boolean.valueOf(z2));
    }

    public JSONObject a() {
        return new JSONObject(this.a);
    }
}
