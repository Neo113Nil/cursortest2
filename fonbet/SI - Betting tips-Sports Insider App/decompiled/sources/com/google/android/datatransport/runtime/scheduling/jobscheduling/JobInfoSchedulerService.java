package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.appcompat.app.v0;
import e5.i;
import e5.r;
import io.sentry.android.replay.util.c;
import k5.d;
import k5.h;
import o5.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4186a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i5 = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        r.b(getApplicationContext());
        v0 a7 = i.a();
        a7.Y(string);
        a7.f366d = a.b(i5);
        if (string2 != null) {
            a7.f365c = Base64.decode(string2, 0);
        }
        h hVar = r.a().f8666d;
        hVar.f18837e.execute(new d(hVar, a7.d(), i10, new c(10, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
