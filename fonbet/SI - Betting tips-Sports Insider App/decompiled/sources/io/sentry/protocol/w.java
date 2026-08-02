package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.Objects;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16924a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16925b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f16926c;

    public w(String str, String str2) {
        this.f16924a = str;
        this.f16925b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (Objects.equals(this.f16924a, wVar.f16924a) && Objects.equals(this.f16925b, wVar.f16925b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16924a, this.f16925b);
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("name");
        aVar.K(this.f16924a);
        aVar.u("version");
        aVar.K(this.f16925b);
        HashMap hashMap = this.f16926c;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f16926c, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
