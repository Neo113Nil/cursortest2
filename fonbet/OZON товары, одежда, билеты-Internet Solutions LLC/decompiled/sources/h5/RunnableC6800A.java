package h5;

import androidx.work.impl.WorkDatabase;
import androidx.work.v;
import g5.C6627B;
import g5.C6647u;
import java.util.UUID;

/* renamed from: h5.A, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class RunnableC6800A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ UUID f64953a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.work.e f64954b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.work.impl.utils.futures.c f64955c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6801B f64956d;

    RunnableC6800A(C6801B c6801b, UUID uuid, androidx.work.e eVar, androidx.work.impl.utils.futures.c cVar) {
        this.f64956d = c6801b;
        this.f64953a = uuid;
        this.f64954b = eVar;
        this.f64955c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.work.impl.utils.futures.c cVar = this.f64955c;
        UUID uuid = this.f64953a;
        String uuid2 = uuid.toString();
        androidx.work.o e11 = androidx.work.o.e();
        String str = C6801B.f64957c;
        StringBuilder sb2 = new StringBuilder("Updating progress for ");
        sb2.append(uuid);
        sb2.append(" (");
        androidx.work.e eVar = this.f64954b;
        sb2.append(eVar);
        sb2.append(")");
        e11.a(str, sb2.toString());
        C6801B c6801b = this.f64956d;
        WorkDatabase workDatabase = c6801b.f64958a;
        WorkDatabase workDatabase2 = c6801b.f64958a;
        workDatabase.beginTransaction();
        try {
            C6627B m11 = workDatabase2.f().m(uuid2);
            if (m11 == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (m11.f63800b == v.a.RUNNING) {
                workDatabase2.e().b(new C6647u(uuid2, eVar));
            } else {
                androidx.work.o.e().k(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
            }
            cVar.j(null);
            workDatabase2.setTransactionSuccessful();
        } catch (Throwable th2) {
            try {
                androidx.work.o.e().d(C6801B.f64957c, "Error updating Worker progress", th2);
                cVar.l(th2);
            } finally {
                workDatabase2.endTransaction();
            }
        }
    }
}
