package com.ironsource;

import com.ironsource.InterfaceC2592p4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.x5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2736x5 {
    static final String e = "euid";
    static final String f = "esat";
    static final String g = "esfr";
    static final int h = 1;
    private int a;
    private long b;
    private int c;
    private final JSONObject d;

    public C2736x5(EnumC2754y5 enumC2754y5, JSONObject jSONObject) {
        this(enumC2754y5.b(), jSONObject);
    }

    public String a() {
        return this.d.toString();
    }

    public JSONObject b() {
        return this.d;
    }

    public int c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2736x5 c2736x5 = (C2736x5) obj;
        return this.a == c2736x5.a && this.b == c2736x5.b && this.c == c2736x5.c && C2651sa.a(this.d, c2736x5.d);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + this.d.toString().hashCode()) * 31) + this.c;
    }

    public String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + "," + a().substring(1) + "}").replace(",", "\n");
    }

    public C2736x5(int i, JSONObject jSONObject) {
        this(i, new InterfaceC2592p4.a().a(), jSONObject);
    }

    public void a(int i) {
        this.a = i;
    }

    public C2736x5(int i, long j, String str) throws JSONException {
        this(i, j, IronSourceNetworkBridge.jsonObjectInit(str));
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.d.put(str, obj);
        } catch (JSONException e2) {
            C2556n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public C2736x5(EnumC2754y5 enumC2754y5, long j, JSONObject jSONObject) {
        this(enumC2754y5.b(), j, jSONObject);
    }

    public C2736x5(int i, long j, JSONObject jSONObject) {
        this.c = 1;
        this.a = i;
        this.b = j;
        jSONObject = jSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObject;
        this.d = jSONObject;
        if (!jSONObject.has(e)) {
            a(e, UUID.randomUUID().toString());
        }
        if (!jSONObject.has(f)) {
            a(f, Integer.valueOf(this.c));
        } else {
            this.c = jSONObject.optInt(f, 1);
        }
    }

    public void a(String str) {
        a(g, str);
        int i = this.c + 1;
        this.c = i;
        a(f, Integer.valueOf(i));
    }
}
