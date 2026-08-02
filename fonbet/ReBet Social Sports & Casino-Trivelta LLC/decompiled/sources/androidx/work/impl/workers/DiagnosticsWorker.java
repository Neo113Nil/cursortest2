package androidx.work.impl.workers;

import Q2.AbstractC1508t;
import R2.Y;
import X2.e;
import X2.i;
import X2.q;
import a3.b;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        String str;
        String str2;
        String d10;
        String str3;
        String str4;
        String d11;
        String str5;
        String str6;
        String d12;
        Y n10 = Y.n(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(n10, "getInstance(applicationContext)");
        WorkDatabase s10 = n10.s();
        Intrinsics.checkNotNullExpressionValue(s10, "workManager.workDatabase");
        androidx.work.impl.model.c l10 = s10.l();
        i j10 = s10.j();
        q m10 = s10.m();
        e i10 = s10.i();
        List c10 = l10.c(n10.f().a().a() - TimeUnit.DAYS.toMillis(1L));
        List u10 = l10.u();
        List l11 = l10.l(200);
        if (!c10.isEmpty()) {
            AbstractC1508t e10 = AbstractC1508t.e();
            str5 = b.f15042a;
            e10.f(str5, "Recently completed work:\n\n");
            AbstractC1508t e11 = AbstractC1508t.e();
            str6 = b.f15042a;
            d12 = b.d(j10, m10, i10, c10);
            e11.f(str6, d12);
        }
        if (!u10.isEmpty()) {
            AbstractC1508t e12 = AbstractC1508t.e();
            str3 = b.f15042a;
            e12.f(str3, "Running work:\n\n");
            AbstractC1508t e13 = AbstractC1508t.e();
            str4 = b.f15042a;
            d11 = b.d(j10, m10, i10, u10);
            e13.f(str4, d11);
        }
        if (!l11.isEmpty()) {
            AbstractC1508t e14 = AbstractC1508t.e();
            str = b.f15042a;
            e14.f(str, "Enqueued work:\n\n");
            AbstractC1508t e15 = AbstractC1508t.e();
            str2 = b.f15042a;
            d10 = b.d(j10, m10, i10, l11);
            e15.f(str2, d10);
        }
        c.a c11 = c.a.c();
        Intrinsics.checkNotNullExpressionValue(c11, "success()");
        return c11;
    }
}
