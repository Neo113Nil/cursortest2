package defpackage;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xv3 {
    public static final l10 g = l10.c();
    public static final long h = 1000000;
    public ScheduledFuture e = null;
    public long f = -1;
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    public final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public final String c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
    public final long d = Os.sysconf(OsConstants._SC_CLK_TCK);

    public final synchronized void a(long j, Timer timer) {
        this.f = j;
        try {
            this.e = this.b.scheduleAtFixedRate(new wv3(this, timer, 0), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            l10 l10Var = g;
            e.getMessage();
            l10Var.getClass();
        }
    }

    public final aw3 b(Timer timer) {
        long j = this.d;
        l10 l10Var = g;
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.c));
            try {
                long a = timer.a() + timer.a;
                String[] split = bufferedReader.readLine().split(" ");
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[15]);
                long parseLong3 = Long.parseLong(split[14]);
                long parseLong4 = Long.parseLong(split[16]);
                zv3 h2 = aw3.h();
                h2.d(a);
                double d = (parseLong3 + parseLong4) / j;
                long j2 = h;
                h2.h(Math.round(d * j2));
                h2.i(Math.round(((parseLong + parseLong2) / j) * j2));
                aw3 aw3Var = (aw3) h2.build();
                bufferedReader.close();
                return aw3Var;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            e.getMessage();
            l10Var.getClass();
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            e.getMessage();
            l10Var.getClass();
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            e.getMessage();
            l10Var.getClass();
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            e.getMessage();
            l10Var.getClass();
            return null;
        }
    }
}
