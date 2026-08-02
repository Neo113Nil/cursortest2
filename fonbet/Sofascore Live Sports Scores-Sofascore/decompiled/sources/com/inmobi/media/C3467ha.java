package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ha, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3467ha {
    public final JSONObject a;
    public final JSONArray b;
    public final Db c;

    public C3467ha(JSONObject jSONObject, JSONArray jSONArray, Db db) {
        jSONObject.getClass();
        jSONArray.getClass();
        db.getClass();
        this.a = jSONObject;
        this.b = jSONArray;
        this.c = db;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3467ha)) {
            return false;
        }
        C3467ha c3467ha = (C3467ha) obj;
        return Intrinsics.c(this.a, c3467ha.a) && Intrinsics.c(this.b, c3467ha.b) && Intrinsics.c(this.c, c3467ha.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IncompleteLogData(vitals=" + this.a + ", logs=" + this.b + ", data=" + this.c + ")";
    }
}
