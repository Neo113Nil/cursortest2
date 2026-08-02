package defpackage;

import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xno extends FutureTask implements Comparable {
    public final long a;
    public final boolean b;
    public final String c;
    public final /* synthetic */ zzhz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xno(zzhz zzhzVar, Callable callable, boolean z) {
        super(callable);
        this.d = zzhzVar;
        long andIncrement = zzhz.l.getAndIncrement();
        this.a = andIncrement;
        this.c = "Task exception on worker thread";
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzgu zzguVar = ((zzic) zzhzVar.b).f;
            zzic.m(zzguVar);
            zzguVar.g.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        xno xnoVar = (xno) obj;
        boolean z = xnoVar.b;
        boolean z2 = this.b;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = xnoVar.a;
        long j2 = this.a;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        zzgu zzguVar = ((zzic) this.d.b).f;
        zzic.m(zzguVar);
        zzguVar.h.b(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        zzgu zzguVar = ((zzic) this.d.b).f;
        zzic.m(zzguVar);
        zzguVar.g.b(th, this.c);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xno(zzhz zzhzVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.d = zzhzVar;
        long andIncrement = zzhz.l.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzgu zzguVar = ((zzic) zzhzVar.b).f;
            zzic.m(zzguVar);
            zzguVar.g.a("Tasks index overflow");
        }
    }
}
