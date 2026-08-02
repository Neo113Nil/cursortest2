package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16905a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f16906b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f16907c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f16908d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f16909e;

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16905a != null) {
            aVar.u("sdk_name");
            aVar.K(this.f16905a);
        }
        if (this.f16906b != null) {
            aVar.u("version_major");
            aVar.J(this.f16906b);
        }
        if (this.f16907c != null) {
            aVar.u("version_minor");
            aVar.J(this.f16907c);
        }
        if (this.f16908d != null) {
            aVar.u("version_patchlevel");
            aVar.J(this.f16908d);
        }
        HashMap hashMap = this.f16909e;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f16909e, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
