package com.sofascore.results.service;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.gdb;
import defpackage.rq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AbstractRetryCoroutineWorker extends CoroutineWorker {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractRetryCoroutineWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.a = 5;
    }

    public abstract Object a(rq3 rq3Var);

    /* renamed from: b, reason: from getter */
    public int getA() {
        return this.a;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object doWork(rq3 rq3Var) {
        return getRunAttemptCount() <= getA() ? a(rq3Var) : new gdb();
    }
}
