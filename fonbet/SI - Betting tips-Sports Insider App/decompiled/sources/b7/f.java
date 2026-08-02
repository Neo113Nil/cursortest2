package b7;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import e6.h0;
import e6.l;
import e6.s;
import io.sentry.hints.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends d6.g {

    /* renamed from: l, reason: collision with root package name */
    public static int f3088l = 1;

    public Task d() {
        BasePendingResult basePendingResult;
        boolean z5 = e() == 3;
        x5.g.f25407a.c("Signing out", new Object[0]);
        x5.g.b(this.f8249a);
        s sVar = this.f8257i;
        if (z5) {
            BasePendingResult lVar = new l(sVar);
            lVar.u0(Status.f4461e);
            basePendingResult = lVar;
        } else {
            x5.f fVar = new x5.f(sVar, 0);
            sVar.a(fVar);
            basePendingResult = fVar;
        }
        j jVar = new j(16);
        w7.g gVar = new w7.g();
        basePendingResult.q0(new h0(basePendingResult, gVar, jVar));
        return gVar.f24979a;
    }

    public synchronized int e() {
        int i5;
        try {
            i5 = f3088l;
            if (i5 == 1) {
                Context context = this.f8249a;
                c6.c cVar = c6.c.f3657e;
                int b10 = cVar.b(context, 12451000);
                if (b10 == 0) {
                    i5 = 4;
                    f3088l = 4;
                } else if (cVar.a(context, b10, null) != null || u6.f.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i5 = 2;
                    f3088l = 2;
                } else {
                    i5 = 3;
                    f3088l = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i5;
    }
}
