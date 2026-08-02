package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import io.sentry.f4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16851a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f16852b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16853c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractMap f16854d;

    public l(Object obj, String str) {
        this.f16852b = str;
        if (obj == null || !str.equals("string")) {
            this.f16853c = obj;
        } else {
            this.f16853c = obj.toString();
        }
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        switch (this.f16851a) {
            case 0:
                l1.a aVar = (l1.a) b3Var;
                aVar.j();
                aVar.u("value");
                aVar.J((Number) this.f16853c);
                String str = this.f16852b;
                if (str != null) {
                    aVar.u("unit");
                    aVar.K(str);
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f16854d;
                if (concurrentHashMap != null) {
                    for (K k6 : concurrentHashMap.keySet()) {
                        d9.e.v((ConcurrentHashMap) this.f16854d, k6, aVar, k6, iLogger);
                    }
                }
                aVar.o();
                break;
            default:
                l1.a aVar2 = (l1.a) b3Var;
                aVar2.j();
                aVar2.u("type");
                aVar2.H(iLogger, this.f16852b);
                aVar2.u("value");
                aVar2.H(iLogger, this.f16853c);
                HashMap hashMap = (HashMap) this.f16854d;
                if (hashMap != null) {
                    for (String str2 : hashMap.keySet()) {
                        d9.e.u((HashMap) this.f16854d, str2, aVar2, str2, iLogger);
                    }
                }
                aVar2.o();
                break;
        }
    }

    public l(f4 f4Var, Object obj) {
        this(obj, f4Var.apiName());
    }

    public l(Number number, String str) {
        this.f16853c = number;
        this.f16852b = str;
    }
}
