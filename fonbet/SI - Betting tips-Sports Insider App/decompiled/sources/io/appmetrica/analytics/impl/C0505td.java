package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.td, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505td {

    /* renamed from: a, reason: collision with root package name */
    public final List f14677a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14678b;

    public C0505td(List list, long j) {
        this.f14677a = list;
        this.f14678b = j;
    }

    public final String a() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            List<C0049bd> list = this.f14677a;
            ArrayList arrayList = new ArrayList(kotlin.collections.v.k(list, 10));
            for (C0049bd c0049bd : list) {
                c0049bd.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("moduleName", c0049bd.f13443a);
                    jSONObject.put("loaded", c0049bd.f13444b);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                arrayList.add(jSONObject);
            }
            jSONObject2.put("modulesStatus", new JSONArray((Collection) arrayList));
            jSONObject2.put("lastSendTime", this.f14678b);
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0505td)) {
            return false;
        }
        C0505td c0505td = (C0505td) obj;
        return Intrinsics.areEqual(this.f14677a, c0505td.f14677a) && this.f14678b == c0505td.f14678b;
    }

    public final int hashCode() {
        int hashCode = this.f14677a.hashCode() * 31;
        long j = this.f14678b;
        return ((int) (j ^ (j >>> 32))) + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModulesStatus(modulesStatus=");
        sb2.append(this.f14677a);
        sb2.append(", lastSendTime=");
        return d9.e.j(sb2, this.f14678b, ')');
    }
}
