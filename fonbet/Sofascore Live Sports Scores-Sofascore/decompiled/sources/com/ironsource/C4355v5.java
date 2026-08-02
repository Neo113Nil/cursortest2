package com.ironsource;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.InterfaceC4193m4;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.ljg;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.v5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4355v5 {
    static final String e = "euid";
    static final String f = "esat";
    static final String g = "esfr";
    static final int h = 1;
    private int a;
    private long b;
    private int c;
    private final JSONObject d;

    public C4355v5(int i, long j, JSONObject jSONObject) {
        this.c = 1;
        this.a = i;
        this.b = j;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.d = jSONObject;
        if (!jSONObject.has(e)) {
            a(e, UUID.randomUUID().toString());
        }
        if (jSONObject.has(f)) {
            this.c = jSONObject.optInt(f, 1);
        } else {
            a(f, Integer.valueOf(this.c));
        }
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.d.put(str, obj);
        } catch (JSONException e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
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
        C4355v5 c4355v5 = (C4355v5) obj;
        return this.a == c4355v5.a && this.b == c4355v5.b && this.c == c4355v5.c && C4306sa.a(this.d, c4355v5.d);
    }

    public int hashCode() {
        return ((this.d.toString().hashCode() + ljg.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31) + this.c;
    }

    @NotNull
    public String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + a().substring(1) + "}").replace(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, "\n");
    }

    public void a(int i) {
        this.a = i;
    }

    public String a() {
        return this.d.toString();
    }

    public void a(String str) {
        a(g, str);
        int i = this.c + 1;
        this.c = i;
        a(f, Integer.valueOf(i));
    }

    public C4355v5(int i, JSONObject jSONObject) {
        this(i, new InterfaceC4193m4.a().a(), jSONObject);
    }

    public C4355v5(int i, long j, String str) throws JSONException {
        this(i, j, new JSONObject(str));
    }

    public C4355v5(EnumC4373w5 enumC4373w5, long j, JSONObject jSONObject) {
        this(enumC4373w5.b(), j, jSONObject);
    }

    public C4355v5(EnumC4373w5 enumC4373w5, JSONObject jSONObject) {
        this(enumC4373w5.b(), jSONObject);
    }
}
