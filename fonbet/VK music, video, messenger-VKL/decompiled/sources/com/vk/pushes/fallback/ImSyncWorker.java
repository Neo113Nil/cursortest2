package com.vk.pushes.fallback;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.vk.im.engine.models.sync.ImBgSyncMode;
import kotlin.Result;
import xsna.a1w;
import xsna.q1w;
import xsna.s3q0;

/* compiled from: ImSyncWorker.kt */
/* loaded from: classes.dex */
public final class ImSyncWorker extends Worker {
    public ImSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final b.a doWork() {
        Object failure;
        try {
            a1w a1wVar = q1w.a;
            if (a1wVar == null) {
                a1wVar = null;
            }
            a1wVar.z(ImBgSyncMode.LITE, "fallback-push-engine");
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            return new b.a.C0092a();
        }
        return new b.a.c();
    }
}
