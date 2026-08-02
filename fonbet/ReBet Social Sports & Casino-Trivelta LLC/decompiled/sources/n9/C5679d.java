package n9;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.twilio.voice.EventKeys;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;
import k9.AbstractC5213a;
import o9.InterfaceC5842d;
import r9.AbstractC6212a;

/* renamed from: n9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5679d implements x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f57090a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5842d f57091b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5681f f57092c;

    public C5679d(Context context, InterfaceC5842d interfaceC5842d, AbstractC5681f abstractC5681f) {
        this.f57090a = context;
        this.f57091b = interfaceC5842d;
        this.f57092c = abstractC5681f;
    }

    @Override // n9.x
    public void a(g9.o oVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f57090a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f57090a.getSystemService("jobscheduler");
        int c10 = c(oVar);
        if (!z10 && d(jobScheduler, c10, i10)) {
            AbstractC5213a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long C02 = this.f57091b.C0(oVar);
        JobInfo.Builder c11 = this.f57092c.c(new JobInfo.Builder(c10, componentName), oVar.d(), C02, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt(EventKeys.PRIORITY, AbstractC6212a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        c11.setExtras(persistableBundle);
        AbstractC5213a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(c10), Long.valueOf(this.f57092c.g(oVar.d(), C02, i10)), Long.valueOf(C02), Integer.valueOf(i10));
        jobScheduler.schedule(c11.build());
    }

    @Override // n9.x
    public void b(g9.o oVar, int i10) {
        a(oVar, i10, false);
    }

    public int c(g9.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f57090a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(AbstractC6212a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i10, int i11) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i12 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i10) {
                if (i12 >= i11) {
                    return true;
                }
            }
        }
        return false;
    }
}
