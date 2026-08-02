package com.vk.stat.background;

import android.content.Context;
import androidx.work.WorkerParameters;
import xsna.fsk0;
import xsna.jx40;
import xsna.qsk0;

/* compiled from: StatSendPeriodicWorkWithStatInit.kt */
/* loaded from: classes11.dex */
public final class StatSendPeriodicWorkWithStatInit extends StatSendPeriodicWorker {
    public StatSendPeriodicWorkWithStatInit(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // com.vk.stat.background.StatSendPeriodicWorker
    public final void b() {
        fsk0 fsk0Var = qsk0.a;
        fsk0Var.getClass();
        fsk0Var.e(new jx40(fsk0Var));
    }
}
