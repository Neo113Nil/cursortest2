package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.zg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2783zg {
    private int b = 4;
    private int c = 4;
    private HashMap<String, Boolean> a = new a();

    /* renamed from: com.ironsource.zg$a */
    class a extends HashMap<String, Boolean> {
        a() {
            put(C2399e8.k, Boolean.valueOf(C2783zg.this.b == 0));
            put(C2399e8.l, Boolean.valueOf(C2783zg.this.c == 0));
            Boolean bool = Boolean.FALSE;
            put(C2399e8.m, bool);
            put(C2399e8.n, bool);
        }
    }

    C2783zg() {
    }

    void a(String str, int i, boolean z) {
        if (this.a.containsKey(str)) {
            this.a.put(str, Boolean.valueOf(i == 0));
        }
        this.a.put(C2399e8.m, Boolean.valueOf(z));
        this.a.put(C2399e8.n, Boolean.valueOf((this.a.get(C2399e8.l).booleanValue() || this.a.get(C2399e8.k).booleanValue()) && this.a.get(C2399e8.m).booleanValue()));
    }

    public JSONObject a() {
        return new JSONObject(this.a);
    }
}
