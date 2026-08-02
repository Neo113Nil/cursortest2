package com.vk.core.performance.device;

import android.content.SharedPreferences;
import android.os.Build;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.performance.device.DevicePerformanceInfo;
import com.vk.log.L;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Triple;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.asu0;
import xsna.bd3;
import xsna.bp0;
import xsna.c24;
import xsna.drm0;
import xsna.ew90;
import xsna.ger;
import xsna.gzs;
import xsna.hx90;
import xsna.k6m;
import xsna.odj;
import xsna.qaj0;
import xsna.r6m;

/* compiled from: PerformanceClassResolver.kt */
/* loaded from: classes.dex */
public final class a {
    public static final C0772a f = new C0772a();
    public static final long g = TimeUnit.DAYS.toMillis(1);
    public int a;
    public int b;
    public int c;
    public boolean d;
    public int e;

    /* compiled from: PerformanceClassResolver.kt */
    /* renamed from: com.vk.core.performance.device.a$a, reason: collision with other inner class name */
    public static final class C0772a {
        public static DevicePerformanceInfo a(C0772a c0772a, c24 c24Var) {
            Triple triple;
            c0772a.getClass();
            L.e("PerformanceClassResolver", "resolveDevicePerformance: starting, lowClassShrinkCoefficient = " + ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            ew90 ew90Var = (ew90) c24Var.invoke();
            if (ew90Var == null) {
                L.e("PerformanceClassResolver", "resolveDevicePerformance: Thresholds are null");
                return null;
            }
            if (k6m.a()) {
                L.e("PerformanceClassResolver", "resolveDevicePerformance: using default values for " + Build.MANUFACTURER + ' ' + Build.MODEL);
                String str = k6m.a;
                try {
                    String str2 = k6m.b;
                    int K = drm0.K(0, 6, str2, str.concat(HiAnalyticsConstant.REPORT_VAL_SEPARATOR), false) + str.length() + 1;
                    String substring = str2.substring(K, drm0.L(str2, ',', K, 4));
                    int parseInt = Integer.parseInt(substring);
                    String substring2 = str2.substring(substring.length() + K + 1, drm0.L(str2, ',', substring.length() + K + 1, 4));
                    triple = new Triple(Integer.valueOf(parseInt), Integer.valueOf(Integer.parseInt(substring2)), Integer.valueOf(Integer.parseInt(str2.substring(substring.length() + K + substring2.length() + 2, drm0.L(str2, '\n', K + substring.length() + substring2.length() + 2, 4)))));
                } catch (Throwable th) {
                    L.g("DevicePerformanceScoreGlossary", th);
                    triple = null;
                }
                if (triple == null) {
                    return null;
                }
            } else {
                L.e("PerformanceClassResolver", "resolveDevicePerformance: using resolved values");
                SharedPreferences sharedPreferences = hx90.a;
                triple = new Triple(Integer.valueOf(sharedPreferences.getInt("flop_score", 0)), Integer.valueOf(sharedPreferences.getInt("disk_score", 0)), Integer.valueOf(sharedPreferences.getInt("memory_new_score", 0)));
            }
            int intValue = ((Number) triple.d()).intValue();
            int intValue2 = ((Number) triple.g()).intValue();
            int intValue3 = ((Number) triple.h()).intValue();
            DevicePerformanceInfo.Class b = b(intValue, ew90Var.b(), ew90Var.a());
            DevicePerformanceInfo.Class b2 = b(intValue2, ew90Var.d(), ew90Var.c());
            DevicePerformanceInfo.Class b3 = b(intValue3, ew90Var.f(), ew90Var.e());
            int h = b.h() + b3.h() + b2.h();
            DevicePerformanceInfo.Class r2 = h < 3 ? DevicePerformanceInfo.Class.LOW : h < 5 ? DevicePerformanceInfo.Class.MEDIUM : DevicePerformanceInfo.Class.HIGH;
            L.e("PerformanceClassResolver", "cpuClass = " + b + ", diskClass = " + b2 + ", ramClass = " + b3 + ", overallClass = " + r2);
            return new DevicePerformanceInfo(b, b2, b3, r2);
        }

        public static final DevicePerformanceInfo.Class b(int i, int i2, int i3) {
            int i4 = (i3 - i2) / 3;
            return ((double) i) > ((((double) 1) - ConnectivityTracker.DEFAULT_UPLINK_BITRATE) * ((double) i4)) + ((double) i2) ? i > i3 - i4 ? DevicePerformanceInfo.Class.HIGH : DevicePerformanceInfo.Class.MEDIUM : DevicePerformanceInfo.Class.LOW;
        }
    }

    public static void a(c24 c24Var) {
        DevicePerformanceInfo a = C0772a.a(f, c24Var);
        if (a != null) {
            b.a(a);
            a.a();
        }
    }

    public final void b(c24 c24Var) {
        if (this.e < 10) {
            Random random = new Random();
            long currentTimeMillis = System.currentTimeMillis() + 150;
            int i = 0;
            while (System.currentTimeMillis() < currentTimeMillis) {
                for (int i2 = 0; i2 < 101; i2++) {
                    Math.sqrt(random.nextFloat());
                    i++;
                }
            }
            this.a += i;
            L.e("PerformanceClassResolver", bd3.b(": ", this.e, i, new StringBuilder("runFloatSqrts, run ")));
            if (!this.d) {
                r6m.a.getClass();
                if (r6m.c() == 0) {
                    this.d = true;
                } else {
                    asu0.a.getClass();
                    Integer num = (Integer) asu0.n().submit(new bp0(this, 4)).get();
                    this.b = num.intValue() + this.b;
                    L.e("PerformanceClassResolver", "runFileOperations, run " + this.e + ": " + num);
                }
            }
            this.e++;
            asu0.a.getClass();
            asu0.i().d(new ger(1, this, c24Var), 2000L, TimeUnit.MILLISECONDS);
            return;
        }
        int i3 = this.b;
        int i4 = this.a / 1000;
        int maxMemory = (int) (Runtime.getRuntime().maxMemory() / ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        if (maxMemory > 512) {
            maxMemory = 512;
        }
        StringBuilder a = odj.a(i3, i4, "diskScore = ", ", flopScore = ", ", ramScore = ");
        a.append(maxMemory);
        L.e("PerformanceClassResolver", a.toString());
        int i5 = this.c;
        SharedPreferences sharedPreferences = hx90.a;
        qaj0.c(sharedPreferences, "dummy", Integer.valueOf(i5));
        final int i6 = sharedPreferences.getInt("scores_count", 0);
        int i7 = (sharedPreferences.getInt("disk_score", 0) * i6) + i3;
        int i8 = i6 + 1;
        final int i9 = i7 / i8;
        final int i10 = ((sharedPreferences.getInt("flop_score", 0) * i6) + i4) / i8;
        final int i11 = ((sharedPreferences.getInt("memory_new_score", 0) * i6) + maxMemory) / i8;
        L.c("PerformanceStorage", new gzs() { // from class: xsna.gx90
            @Override // xsna.gzs
            public final Object invoke() {
                return "Stored scores, resolution " + (i6 + 1) + ": disk = " + i9 + ", flop = " + i10 + ", ram = " + i11;
            }
        });
        qaj0.c(sharedPreferences, "disk_score", Integer.valueOf(i9));
        qaj0.c(sharedPreferences, "flop_score", Integer.valueOf(i10));
        qaj0.c(sharedPreferences, "memory_new_score", Integer.valueOf(i11));
        qaj0.c(sharedPreferences, "scores_count", Integer.valueOf(i8));
        qaj0.c(sharedPreferences, "last_score_resolution_time", Long.valueOf(System.currentTimeMillis()));
        if (sharedPreferences.getInt("scores_count", 0) == 3) {
            b.b(sharedPreferences.getInt("disk_score", 0), sharedPreferences.getInt("flop_score", 0), sharedPreferences.getInt("memory_new_score", 0));
            qaj0.c(sharedPreferences, "scores_reported", Boolean.TRUE);
            qaj0.c(sharedPreferences, "last_scores_report_time", Long.valueOf(System.currentTimeMillis()));
            a(c24Var);
        }
    }
}
