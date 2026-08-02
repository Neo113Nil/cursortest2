package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t9 extends h {

    /* renamed from: c, reason: collision with root package name */
    public final u5 f5261c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5262d;

    public t9(u5 u5Var) {
        super("require");
        this.f5262d = new HashMap();
        this.f5261c = u5Var;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n j(com.google.firebase.messaging.x xVar, List list) {
        n nVar;
        ci.c.f0("require", list, 1);
        String h10 = ((t) xVar.f6183b).c(xVar, (n) list.get(0)).h();
        HashMap hashMap = this.f5262d;
        if (hashMap.containsKey(h10)) {
            return (n) hashMap.get(h10);
        }
        HashMap hashMap2 = (HashMap) this.f5261c.f5267a;
        if (hashMap2.containsKey(h10)) {
            try {
                nVar = (n) ((Callable) hashMap2.get(h10)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(h10)));
            }
        } else {
            nVar = n.S;
        }
        if (nVar instanceof h) {
            hashMap.put(h10, (h) nVar);
        }
        return nVar;
    }
}
