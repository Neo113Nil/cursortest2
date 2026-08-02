package com.logrocket.core;

import com.google.android.gms.internal.measurement.y3;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f6633b;

    public /* synthetic */ o(int i5, Serializable serializable) {
        this.f6632a = i5;
        this.f6633b = serializable;
    }

    @Override // com.logrocket.core.t
    public final void a(LogRocketCore logRocketCore, Long l6) {
        int i5 = this.f6632a;
        Serializable serializable = this.f6633b;
        switch (i5) {
            case 0:
                Throwable th2 = (Throwable) serializable;
                int hashCode = th2.getClass().hashCode();
                if (th2.getMessage() != null) {
                    hashCode = th2.getMessage().hashCode();
                }
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    hashCode = y3.g(Integer.valueOf(hashCode), Integer.valueOf(y3.g(stackTraceElement.getFileName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()))));
                }
                zg.b v5 = zg.g.v();
                v5.d();
                zg.g.p((zg.g) v5.f6816b);
                String name = th2.getClass().getName();
                v5.d();
                zg.g.r((zg.g) v5.f6816b, name);
                fh.c k6 = h8.b.k(th2.getMessage());
                v5.d();
                zg.g.q((zg.g) v5.f6816b, k6);
                String valueOf = String.valueOf(hashCode);
                v5.d();
                zg.g.u((zg.g) v5.f6816b, valueOf);
                String str = logRocketCore.R;
                v5.d();
                zg.g.t((zg.g) v5.f6816b, str);
                HashMap hashMap = logRocketCore.f6388l;
                Integer num = (Integer) hashMap.get(Integer.valueOf(hashCode));
                Integer valueOf2 = num == null ? 1 : Integer.valueOf(num.intValue() + 1);
                hashMap.put(Integer.valueOf(hashCode), valueOf2);
                int intValue = valueOf2.intValue();
                v5.d();
                zg.g.s((zg.g) v5.f6816b, intValue);
                logRocketCore.b(1, v5, th2.getStackTrace(), false, l6);
                break;
            default:
                zg.h u10 = zg.i.u();
                u10.d();
                zg.i.q((zg.i) u10.f6816b, 4);
                u10.d();
                zg.i.p((zg.i) u10.f6816b);
                fh.c k9 = h8.b.k((String) serializable);
                u10.d();
                zg.i.r((zg.i) u10.f6816b, k9);
                logRocketCore.b(3, u10, null, false, l6);
                break;
        }
    }
}
