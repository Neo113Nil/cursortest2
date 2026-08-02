package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import io.sentry.z4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16910a;

    /* renamed from: b, reason: collision with root package name */
    public String f16911b;

    /* renamed from: c, reason: collision with root package name */
    public CopyOnWriteArraySet f16912c;

    /* renamed from: d, reason: collision with root package name */
    public CopyOnWriteArraySet f16913d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f16914e;

    public t(String str, String str2) {
        this.f16910a = str;
        this.f16911b = str2;
    }

    public final String a() {
        return this.f16910a;
    }

    public final String b() {
        return this.f16911b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f16910a.equals(tVar.f16910a) && this.f16911b.equals(tVar.f16911b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16910a, this.f16911b});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("name");
        aVar.K(this.f16910a);
        aVar.u("version");
        aVar.K(this.f16911b);
        CopyOnWriteArraySet copyOnWriteArraySet = this.f16912c;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = z4.d().f17276b;
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.f16913d;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = z4.d().f17275a;
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            aVar.u("packages");
            aVar.H(iLogger, copyOnWriteArraySet);
        }
        if (!copyOnWriteArraySet2.isEmpty()) {
            aVar.u("integrations");
            aVar.H(iLogger, copyOnWriteArraySet2);
        }
        HashMap hashMap = this.f16914e;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f16914e, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
