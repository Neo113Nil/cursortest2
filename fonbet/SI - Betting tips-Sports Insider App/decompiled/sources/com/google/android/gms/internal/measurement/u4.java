package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u4 extends k {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.app.v0 f5265b;

    public u4(androidx.appcompat.app.v0 v0Var) {
        this.f5265b = v0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.k, com.google.android.gms.internal.measurement.n
    public final n f(String str, com.google.firebase.messaging.x xVar, ArrayList arrayList) {
        int hashCode = str.hashCode();
        androidx.appcompat.app.v0 v0Var = this.f5265b;
        switch (hashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    ci.c.f0("getEventName", arrayList, 0);
                    return new q(((b) v0Var.f365c).f4925a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    ci.c.f0("getTimestamp", arrayList, 0);
                    return new g(Double.valueOf(((b) v0Var.f365c).f4926b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    ci.c.f0("getParamValue", arrayList, 1);
                    String h10 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).h();
                    HashMap hashMap = ((b) v0Var.f365c).f4927c;
                    return y3.D(hashMap.containsKey(h10) ? hashMap.get(h10) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    ci.c.f0("getParams", arrayList, 0);
                    HashMap hashMap2 = ((b) v0Var.f365c).f4927c;
                    k kVar = new k();
                    for (String str2 : hashMap2.keySet()) {
                        kVar.b(str2, y3.D(hashMap2.get(str2)));
                    }
                    return kVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    ci.c.f0("setParamValue", arrayList, 2);
                    String h11 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).h();
                    n c2 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1));
                    b bVar = (b) v0Var.f365c;
                    Object n02 = ci.c.n0(c2);
                    HashMap hashMap3 = bVar.f4927c;
                    if (n02 == null) {
                        hashMap3.remove(h11);
                        return c2;
                    }
                    hashMap3.put(h11, b.b(hashMap3.get(h11), n02, h11));
                    return c2;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    ci.c.f0("setEventName", arrayList, 1);
                    n c8 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0));
                    if (n.S.equals(c8) || n.T.equals(c8)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    ((b) v0Var.f365c).f4925a = c8.h();
                    return new q(c8.h());
                }
                break;
        }
        return super.f(str, xVar, arrayList);
    }
}
