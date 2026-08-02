package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import C.h0;
import S6.r;
import S6.u;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import c7.C5758a;

/* loaded from: classes9.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f57797a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i11 = jobParameters.getExtras().getInt("priority");
        int i12 = jobParameters.getExtras().getInt("attemptNumber");
        u.c(getApplicationContext());
        r.a a11 = r.a();
        a11.b(string);
        a11.d(C5758a.b(i11));
        if (string2 != null) {
            a11.c(Base64.decode(string2, 0));
        }
        u.a().b().k(a11.a(), i12, new h0(9, this, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
