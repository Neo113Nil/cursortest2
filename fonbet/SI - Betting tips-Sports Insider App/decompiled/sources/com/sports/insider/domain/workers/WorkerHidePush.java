package com.sports.insider.domain.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import c0.h0;
import com.google.android.gms.internal.measurement.y3;
import e3.h;
import e3.j;
import e3.s;
import e3.t;
import e3.u;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sports/insider/domain/workers/WorkerHidePush;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkerHidePush extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerHidePush(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(h hVar) {
        j inputData = this.f8566b.f2918b;
        Intrinsics.checkNotNullExpressionValue(inputData, "getInputData(...)");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        try {
            int a7 = inputData.a("notifyId", 0);
            if (a7 <= 0) {
                s sVar = new s();
                Intrinsics.checkNotNullExpressionValue(sVar, "failure(...)");
                return sVar;
            }
            WeakReference weakReference = new WeakReference(null);
            try {
                if (((h0) weakReference.get()) == null) {
                    weakReference = new WeakReference((h0) y3.m(h0.class, null, 6));
                }
                Object obj = weakReference.get();
                Intrinsics.checkNotNull(obj);
                ((h0) obj).f3273b.cancel(null, a7);
            } catch (Exception unused) {
            }
            u uVar = new u();
            Intrinsics.checkNotNull(uVar);
            return uVar;
        } catch (CancellationException unused2) {
            t tVar = new t();
            Intrinsics.checkNotNull(tVar);
            return tVar;
        } catch (Exception unused3) {
            s sVar2 = new s();
            Intrinsics.checkNotNull(sVar2);
            return sVar2;
        }
    }
}
