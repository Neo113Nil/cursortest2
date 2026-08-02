package com.ironsource;

import com.ironsource.InterfaceC4488p4;
import com.ironsource.mediationsdk.logger.IronLog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bh10;

/* renamed from: com.ironsource.x5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4632x5 {
    static final String e = "euid";
    static final String f = "esat";
    static final String g = "esfr";
    static final int h = 1;
    private int a;
    private long b;
    private int c;
    private final JSONObject d;

    public C4632x5(EnumC4650y5 enumC4650y5, JSONObject jSONObject) {
        this(enumC4650y5.b(), jSONObject);
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
        C4632x5 c4632x5 = (C4632x5) obj;
        return this.a == c4632x5.a && this.b == c4632x5.b && this.c == c4632x5.c && C4565ta.a(this.d, c4632x5.d);
    }

    public int hashCode() {
        return ((this.d.toString().hashCode() + bh10.a(Integer.hashCode(this.a) * 31, 31, this.b)) * 31) + this.c;
    }

    public String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + StringUtils.COMMA + a().substring(1) + "}").replace(StringUtils.COMMA, "\n");
    }

    public C4632x5(int i, JSONObject jSONObject) {
        this(i, new InterfaceC4488p4.a().a(), jSONObject);
    }

    public void a(int i) {
        this.a = i;
    }

    public C4632x5(int i, long j, String str) throws JSONException {
        this(i, j, new JSONObject(str));
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.d.put(str, obj);
        } catch (JSONException e2) {
            C4452n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public C4632x5(EnumC4650y5 enumC4650y5, long j, JSONObject jSONObject) {
        this(enumC4650y5.b(), j, jSONObject);
    }

    public C4632x5(int i, long j, JSONObject jSONObject) {
        this.c = 1;
        this.a = i;
        this.b = j;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
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
