package io.branch.referral;

import android.os.AsyncTask;

/* loaded from: classes9.dex */
public abstract class BranchAsyncTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    public AsyncTask<Params, Progress, Result> executeTask(Params... paramsArr) {
        try {
            return executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
        } catch (Throwable unused) {
            return execute(paramsArr);
        }
    }
}
