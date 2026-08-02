package kh;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final long f19169a;

    /* renamed from: b, reason: collision with root package name */
    public final jh.c f19170b;

    /* renamed from: c, reason: collision with root package name */
    public final jh.b f19171c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f19172d;

    public r(jh.e taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        d connectionListener = d.f19098a;
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        this.f19169a = timeUnit.toNanos(5L);
        this.f19170b = taskRunner.d();
        this.f19171c = new jh.b(this, d9.e.l(new StringBuilder(), hh.g.f10826b, " ConnectionPool connection closer"));
        this.f19172d = new ConcurrentLinkedQueue();
    }

    public final int a(q qVar, long j) {
        TimeZone timeZone = hh.g.f10825a;
        ArrayList arrayList = qVar.f19168p;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i5);
            if (reference.get() != null) {
                i5++;
            } else {
                Intrinsics.checkNotNull(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                String str = "A connection to " + qVar.f19156c.f10302a.f10114h + " was leaked. Did you forget to close a response body?";
                qh.e eVar = qh.e.f22190a;
                qh.e.f22190a.k(((n) reference).f19136a, str);
                arrayList.remove(i5);
                if (arrayList.isEmpty()) {
                    qVar.q = j - this.f19169a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
