package com.vk.stat.background;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;

/* compiled from: StatSendPeriodicWorker.kt */
/* loaded from: classes11.dex */
public abstract class StatSendPeriodicWorker extends Worker {
    public StatSendPeriodicWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract void b();

    @Override // androidx.work.Worker
    public final b.a doWork() {
        try {
            b();
            return new b.a.c();
        } catch (Throwable unused) {
            return new b.a.C0092a();
        }
    }
}
