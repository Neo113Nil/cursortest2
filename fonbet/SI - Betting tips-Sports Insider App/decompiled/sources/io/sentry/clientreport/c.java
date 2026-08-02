package io.sentry.clientreport;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final Date f16278a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16279b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f16280c;

    public c(Date date, ArrayList arrayList) {
        this.f16278a = date;
        this.f16279b = arrayList;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("timestamp");
        aVar.K(com.google.android.play.core.appupdate.b.u(this.f16278a));
        aVar.u("discarded_events");
        aVar.H(iLogger, this.f16279b);
        HashMap hashMap = this.f16280c;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f16280c, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
