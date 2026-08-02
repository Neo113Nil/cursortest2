package com.huawei.hms.hwid;

import org.json.JSONException;
import org.json.JSONObject;
import xsna.ho8;

/* compiled from: AbstractCpClientInfo.java */
/* loaded from: classes13.dex */
public abstract class am {
    protected String a;
    protected String b;
    protected long c;
    protected String d;

    public String a() {
        return this.a;
    }

    public void b(String str) {
        this.a = str;
    }

    public void c(String str) {
        this.b = str;
    }

    public void d(String str) {
        this.d = str;
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("appId", this.a);
        jSONObject.putOpt("packageName", this.b);
        jSONObject.put("hmsSdkVersion", this.c);
        jSONObject.putOpt("subAppId", this.d);
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HuaweiIdCpClientInfo{appId='");
        sb.append(this.a);
        sb.append("', packageName='");
        sb.append(this.b);
        sb.append("', hmsSdkVersion=");
        sb.append(this.c);
        sb.append("', subAppId=");
        return ho8.a(sb, this.d, '}');
    }

    public void a(long j) {
        this.c = j;
    }

    public long b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public String d() throws JSONException {
        return e().toString();
    }
}
