package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class R9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12811a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12812b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12813c;

    public R9(JSONObject jSONObject) {
        this.f12811a = jSONObject.getString("name");
        this.f12813c = jSONObject.getBoolean("required");
        this.f12812b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && R9.class == obj.getClass()) {
            R9 r92 = (R9) obj;
            if (this.f12812b != r92.f12812b || this.f12813c != r92.f12813c) {
                return false;
            }
            String str = this.f12811a;
            String str2 = r92.f12811a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12811a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f12812b) * 31) + (this.f12813c ? 1 : 0);
    }

    public R9(String str, int i5, boolean z5) {
        this.f12811a = str;
        this.f12812b = i5;
        this.f12813c = z5;
    }
}
