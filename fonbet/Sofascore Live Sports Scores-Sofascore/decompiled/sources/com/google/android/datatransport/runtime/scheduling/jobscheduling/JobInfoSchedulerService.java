package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.ax0;
import defpackage.gyj;
import defpackage.hcc;
import defpackage.ji3;
import defpackage.jv0;
import defpackage.m7f;
import defpackage.yq5;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        int i = jobParameters.getExtras().getInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        gyj.b(getApplicationContext());
        hcc a2 = jv0.a();
        a2.Y(string);
        a2.d = m7f.b(i);
        if (string2 != null) {
            a2.c = Base64.decode(string2, 0);
        }
        ji3 ji3Var = gyj.a().d;
        ((Executor) ji3Var.c).execute(new ax0(ji3Var, a2.H(), i2, new yq5(16, this, jobParameters), 1));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
