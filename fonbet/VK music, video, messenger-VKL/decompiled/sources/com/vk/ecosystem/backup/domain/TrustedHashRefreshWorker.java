package com.vk.ecosystem.backup.domain;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.vk.log.L;
import kotlin.Result;
import xsna.gsp0;

/* compiled from: TrustedHashRefreshWorker.kt */
/* loaded from: classes18.dex */
public final class TrustedHashRefreshWorker extends Worker {
    public TrustedHashRefreshWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final b.a doWork() {
        Object failure;
        try {
            new gsp0(getApplicationContext()).b();
            failure = new b.a.c();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            L.f("TrustedHashRefreshWorker", "Trusted hash refresh worker failed", a);
            failure = new b.a.C0092a();
        }
        return (b.a) failure;
    }
}
