package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17014a;

    /* renamed from: b, reason: collision with root package name */
    public float f17015b;

    /* renamed from: c, reason: collision with root package name */
    public float f17016c;

    /* renamed from: d, reason: collision with root package name */
    public long f17017d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f17018e;

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("id");
        aVar.G(this.f17014a);
        aVar.u("x");
        aVar.F(this.f17015b);
        aVar.u("y");
        aVar.F(this.f17016c);
        aVar.u("timeOffset");
        aVar.G(this.f17017d);
        HashMap hashMap = this.f17018e;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f17018e, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
