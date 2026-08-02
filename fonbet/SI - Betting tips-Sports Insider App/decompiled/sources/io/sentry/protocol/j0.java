package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16828a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16829b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f16830c;

    public j0(String str, List list) {
        this.f16828a = str;
        this.f16829b = list;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        String str = this.f16828a;
        if (str != null) {
            aVar.u("rendering_system");
            aVar.K(str);
        }
        List list = this.f16829b;
        if (list != null) {
            aVar.u("windows");
            aVar.H(iLogger, list);
        }
        HashMap hashMap = this.f16830c;
        if (hashMap != null) {
            for (String str2 : hashMap.keySet()) {
                d9.e.u(this.f16830c, str2, aVar, str2, iLogger);
            }
        }
        aVar.o();
    }
}
