package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268k0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14085a = new HashMap();

    public final synchronized C0242j0 a(Q4 q42, PublicLogger publicLogger, We we2) {
        C0242j0 c0242j0;
        c0242j0 = (C0242j0) this.f14085a.get(q42.toString());
        if (c0242j0 == null) {
            C0217i0 d10 = we2.d();
            c0242j0 = new C0242j0(d10.f13914a, d10.f13915b, new C0463rl(publicLogger, "[App Environment]"));
            this.f14085a.put(q42.toString(), c0242j0);
        }
        return c0242j0;
    }

    public final synchronized void a(C0217i0 c0217i0, We we2) {
        we2.a(c0217i0).b();
    }
}
