package aa;

import android.os.Process;
import b6.p;
import com.appsflyer.internal.AFj1sSDK;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import io.appmetrica.analytics.impl.C0418q0;
import io.sentry.android.ndk.SentryNdk;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91a;

    public /* synthetic */ d(int i5) {
        this.f91a = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f91a) {
            case 0:
                p.f3077f = null;
                return;
            case 1:
                AFj1sSDK.AFAdRevenueData();
                return;
            case 2:
                C0418q0.e();
                return;
            case 3:
                return;
            case 4:
                io.sentry.android.core.internal.util.e.f15713b = Process.myTid();
                return;
            case 5:
                SentryNdk.lambda$static$0();
                return;
            case 6:
                int i5 = AlarmManagerSchedulerBroadcastReceiver.f4185a;
                return;
            default:
                throw null;
        }
    }

    public /* synthetic */ d(p pVar) {
        this.f91a = 0;
    }

    private final void a() {
    }
}
