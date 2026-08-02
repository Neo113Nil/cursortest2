package com.zoho.wms.common.workmanager.workers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;

/* loaded from: classes4.dex */
public class WmsCanaryWorker extends Worker {

    public enum a {
        SUCCESS
    }

    public WmsCanaryWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        return c.a.d(new b.a().f("wms_canary_result", a.SUCCESS.name()).a());
    }
}
