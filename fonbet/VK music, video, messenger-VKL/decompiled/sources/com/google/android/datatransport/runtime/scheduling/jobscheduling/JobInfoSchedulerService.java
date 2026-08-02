package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import xsna.acd0;
import xsna.eo5;
import xsna.fdq0;
import xsna.gc3;
import xsna.qdq0;
import xsna.sop0;
import xsna.zop0;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int b = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        int i = jobParameters.getExtras().getInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        zop0.b(getApplicationContext());
        eo5.a a = sop0.a();
        a.b(string);
        a.c = acd0.b(i);
        if (string2 != null) {
            a.b = Base64.decode(string2, 0);
        }
        qdq0 qdq0Var = zop0.a().d;
        qdq0Var.e.execute(new fdq0(qdq0Var, a.a(), i2, new gc3(3, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
