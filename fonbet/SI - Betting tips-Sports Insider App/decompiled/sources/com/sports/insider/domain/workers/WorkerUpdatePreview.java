package com.sports.insider.domain.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import e3.h;
import e3.j;
import e3.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y8.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sports/insider/domain/workers/WorkerUpdatePreview;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkerUpdatePreview extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerUpdatePreview(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(h hVar) {
        d dVar = new d();
        WorkerParameters workerParameters = this.f8566b;
        j jVar = workerParameters.f2918b;
        Intrinsics.checkNotNullExpressionValue(jVar, "getInputData(...)");
        if (workerParameters.f2919c > 10) {
            s sVar = new s();
            Intrinsics.checkNotNullExpressionValue(sVar, "failure(...)");
            return sVar;
        }
        int a7 = jVar.a("idPrediction", -1);
        if (a7 >= 1) {
            return dVar.f(a7, hVar);
        }
        s sVar2 = new s();
        Intrinsics.checkNotNullExpressionValue(sVar2, "failure(...)");
        return sVar2;
    }
}
