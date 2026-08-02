package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import xsna.cyx0;
import xsna.dwx0;
import xsna.gxx0;
import xsna.hqn0;
import xsna.kwx0;
import xsna.m100;
import xsna.r8m;

/* compiled from: DiagnosticsWorker.kt */
/* loaded from: classes12.dex */
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final b.a doWork() {
        dwx0 h = dwx0.h(getApplicationContext());
        WorkDatabase workDatabase = h.c;
        gxx0 D = workDatabase.D();
        kwx0 B = workDatabase.B();
        cyx0 E = workDatabase.E();
        hqn0 A = workDatabase.A();
        h.b.d.getClass();
        ArrayList v = D.v(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        ArrayList m = D.m();
        ArrayList y = D.y();
        if (!v.isEmpty()) {
            m100 c = m100.c();
            int i = r8m.a;
            c.getClass();
            m100 c2 = m100.c();
            r8m.a(B, E, A, v);
            c2.getClass();
        }
        if (!m.isEmpty()) {
            m100 c3 = m100.c();
            int i2 = r8m.a;
            c3.getClass();
            m100 c4 = m100.c();
            r8m.a(B, E, A, m);
            c4.getClass();
        }
        if (!y.isEmpty()) {
            m100 c5 = m100.c();
            int i3 = r8m.a;
            c5.getClass();
            m100 c6 = m100.c();
            r8m.a(B, E, A, y);
            c6.getClass();
        }
        return new b.a.c();
    }
}
