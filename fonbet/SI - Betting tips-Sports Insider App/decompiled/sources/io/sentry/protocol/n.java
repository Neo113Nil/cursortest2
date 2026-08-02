package io.sentry.protocol;

import com.sports.insider.data.repository.room.live.LiveTable;
import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16865a;

    /* renamed from: b, reason: collision with root package name */
    public String f16866b;

    /* renamed from: c, reason: collision with root package name */
    public List f16867c;

    /* renamed from: d, reason: collision with root package name */
    public ConcurrentHashMap f16868d;

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16865a != null) {
            aVar.u("formatted");
            aVar.K(this.f16865a);
        }
        if (this.f16866b != null) {
            aVar.u(LiveTable.messageColumn);
            aVar.K(this.f16866b);
        }
        List list = this.f16867c;
        if (list != null && !list.isEmpty()) {
            aVar.u("params");
            aVar.H(iLogger, this.f16867c);
        }
        ConcurrentHashMap concurrentHashMap = this.f16868d;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16868d, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
