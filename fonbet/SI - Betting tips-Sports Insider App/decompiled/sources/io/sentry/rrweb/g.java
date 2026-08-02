package io.sentry.rrweb;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends e implements c2 {

    /* renamed from: d, reason: collision with root package name */
    public f f17007d;

    /* renamed from: e, reason: collision with root package name */
    public int f17008e;

    /* renamed from: f, reason: collision with root package name */
    public float f17009f;

    /* renamed from: g, reason: collision with root package name */
    public float f17010g;

    /* renamed from: h, reason: collision with root package name */
    public int f17011h;

    /* renamed from: i, reason: collision with root package name */
    public int f17012i;
    public HashMap j;

    /* renamed from: k, reason: collision with root package name */
    public HashMap f17013k;

    public g() {
        super(d.MouseInteraction);
        this.f17011h = 2;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("type");
        aVar.H(iLogger, this.f17004a);
        aVar.u("timestamp");
        aVar.G(this.f17005b);
        aVar.u("data");
        aVar.j();
        aVar.u(AdRevenueConstants.SOURCE_KEY);
        aVar.H(iLogger, this.f17006c);
        aVar.u("type");
        aVar.H(iLogger, this.f17007d);
        aVar.u("id");
        aVar.G(this.f17008e);
        aVar.u("x");
        aVar.F(this.f17009f);
        aVar.u("y");
        aVar.F(this.f17010g);
        aVar.u("pointerType");
        aVar.G(this.f17011h);
        aVar.u("pointerId");
        aVar.G(this.f17012i);
        HashMap hashMap = this.f17013k;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f17013k, str, aVar, str, iLogger);
            }
        }
        aVar.o();
        HashMap hashMap2 = this.j;
        if (hashMap2 != null) {
            for (String str2 : hashMap2.keySet()) {
                d9.e.u(this.j, str2, aVar, str2, iLogger);
            }
        }
        aVar.o();
    }
}
