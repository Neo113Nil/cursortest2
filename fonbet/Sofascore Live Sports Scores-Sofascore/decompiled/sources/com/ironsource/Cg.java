package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class Cg {
    private int b = 4;
    private int c = 4;
    private HashMap<String, Boolean> a = new a();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends HashMap<String, Boolean> {
        public a() {
            put(C4018c8.k, Boolean.valueOf(Cg.this.b == 0));
            put(C4018c8.l, Boolean.valueOf(Cg.this.c == 0));
            Boolean bool = Boolean.FALSE;
            put(C4018c8.m, bool);
            put(C4018c8.n, bool);
        }
    }

    public void a(String str, int i, boolean z) {
        boolean z2 = false;
        if (this.a.containsKey(str)) {
            this.a.put(str, Boolean.valueOf(i == 0));
        }
        this.a.put(C4018c8.m, Boolean.valueOf(z));
        if ((this.a.get(C4018c8.l).booleanValue() || this.a.get(C4018c8.k).booleanValue()) && this.a.get(C4018c8.m).booleanValue()) {
            z2 = true;
        }
        this.a.put(C4018c8.n, Boolean.valueOf(z2));
    }

    public JSONObject a() {
        return new JSONObject(this.a);
    }
}
