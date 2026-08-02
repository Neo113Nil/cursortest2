package x9;

import aa.g;
import aa.j;
import android.net.TrafficStats;
import android.os.Process;
import com.logrocket.core.LogRocketCore;
import eh.o;
import eh.r;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.sentry.android.core.f;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f25439b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25440c;

    /* renamed from: d, reason: collision with root package name */
    public final g f25441d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25442e;

    /* renamed from: g, reason: collision with root package name */
    public long f25444g;

    /* renamed from: h, reason: collision with root package name */
    public long f25445h;

    /* renamed from: i, reason: collision with root package name */
    public long f25446i;
    public o j;

    /* renamed from: a, reason: collision with root package name */
    public final ba.d f25438a = new ba.d("NetworkThroughputTracker");

    /* renamed from: f, reason: collision with root package name */
    public final int f25443f = 10;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:5:0x0028, B:10:0x003b, B:13:0x0042, B:18:0x0055, B:21:0x005c, B:23:0x005e, B:28:0x006f, B:31:0x0075, B:32:0x0077, B:34:0x007d, B:39:0x0083), top: B:4:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:5:0x0028, B:10:0x003b, B:13:0x0042, B:18:0x0055, B:21:0x005c, B:23:0x005e, B:28:0x006f, B:31:0x0075, B:32:0x0077, B:34:0x007d, B:39:0x0083), top: B:4:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:5:0x0028, B:10:0x003b, B:13:0x0042, B:18:0x0055, B:21:0x005c, B:23:0x005e, B:28:0x006f, B:31:0x0075, B:32:0x0077, B:34:0x007d, B:39:0x0083), top: B:4:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(LogRocketCore logRocketCore) {
        int i5;
        long totalTxBytes;
        long totalRxBytes;
        long j;
        long uidTxBytes;
        long uidRxBytes;
        long j6;
        this.f25442e = true;
        long j10 = -1;
        this.f25444g = -1L;
        this.f25445h = -1L;
        this.f25446i = -1L;
        this.f25439b = new WeakReference(logRocketCore);
        int i10 = 0;
        g gVar = null;
        try {
            i5 = Process.myUid();
            try {
                totalTxBytes = TrafficStats.getTotalTxBytes();
                totalRxBytes = TrafficStats.getTotalRxBytes();
            } catch (Throwable unused) {
                i10 = i5;
                i5 = i10;
                this.f25441d = gVar;
                this.f25440c = i5;
            }
        } catch (Throwable unused2) {
        }
        if (totalTxBytes >= 0 && totalRxBytes >= 0) {
            j = totalTxBytes + totalRxBytes;
            if (j > 0) {
                this.f25445h = j;
                long mobileTxBytes = TrafficStats.getMobileTxBytes();
                long mobileRxBytes = TrafficStats.getMobileRxBytes();
                if (mobileTxBytes >= 0 && mobileRxBytes >= 0) {
                    j6 = mobileTxBytes + mobileRxBytes;
                    if (j6 >= 0) {
                        this.f25444g = j6;
                    }
                }
                j6 = -1;
                if (j6 >= 0) {
                }
            }
            uidTxBytes = TrafficStats.getUidTxBytes(i5);
            uidRxBytes = TrafficStats.getUidRxBytes(i5);
            if (uidTxBytes >= 0 && uidRxBytes >= 0) {
                j10 = uidTxBytes + uidRxBytes;
            }
            if (j10 >= 0) {
                this.f25446i = j10;
            }
            if (this.f25445h < 0 || this.f25446i >= 0) {
                g gVar2 = new g(j.a("lr-network-tracker"), new f(18, this), null, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                this.j = r.t();
                this.f25442e = false;
                gVar = gVar2;
            }
            this.f25441d = gVar;
            this.f25440c = i5;
        }
        j = -1;
        if (j > 0) {
        }
        uidTxBytes = TrafficStats.getUidTxBytes(i5);
        uidRxBytes = TrafficStats.getUidRxBytes(i5);
        if (uidTxBytes >= 0) {
            j10 = uidTxBytes + uidRxBytes;
        }
        if (j10 >= 0) {
        }
        if (this.f25445h < 0) {
        }
        g gVar22 = new g(j.a("lr-network-tracker"), new f(18, this), null, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
        this.j = r.t();
        this.f25442e = false;
        gVar = gVar22;
        this.f25441d = gVar;
        this.f25440c = i5;
    }

    public final void a() {
        this.f25438a.a("Sending network throughput. Total measurements: " + ((r) this.j.f6816b).r());
        if (((r) this.j.f6816b).r() == 0) {
            return;
        }
        com.logrocket.core.g gVar = (com.logrocket.core.g) this.f25439b.get();
        if (gVar == null) {
            this.f25442e = true;
            g gVar2 = this.f25441d;
            if (gVar2 != null) {
                gVar2.d();
            }
        }
        if (gVar == null) {
            return;
        }
        gVar.a(23, this.j);
        this.j = r.t();
    }
}
