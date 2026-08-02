package ru.ozon.push.sdk.internal.status.data.worker;

import Hh0.b;
import Yg0.a;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.e;
import androidx.work.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/push/sdk/internal/status/data/worker/PushStatusWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushStatusWorker extends Worker {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WorkerParameters f97711a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushStatusWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.f97711a = workerParams;
    }

    @Override // androidx.work.Worker
    @NotNull
    public final n.a doWork() {
        e d11 = this.f97711a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "getInputData(...)");
        String d12 = d11.d("trigger_push_status_event_id_param");
        int c11 = d11.c("max_attempts_count_param", 5);
        a.f35038y.getClass();
        a b11 = a.C0652a.b();
        return new b(b11.s(), b11.w(), c11).a(getRunAttemptCount(), d12);
    }
}
