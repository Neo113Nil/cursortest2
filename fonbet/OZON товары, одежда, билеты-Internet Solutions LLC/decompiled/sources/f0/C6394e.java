package f0;

import C.S;
import Z.r;
import android.os.Build;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Y0;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import java.util.concurrent.TimeUnit;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6394e {

    /* renamed from: a, reason: collision with root package name */
    private final r f62420a;

    /* renamed from: b, reason: collision with root package name */
    private final Y0 f62421b;

    /* renamed from: c, reason: collision with root package name */
    private final CameraUseInconsistentTimebaseQuirk f62422c;

    /* renamed from: d, reason: collision with root package name */
    private long f62423d = -1;

    /* renamed from: e, reason: collision with root package name */
    private Y0 f62424e;

    /* renamed from: f0.e$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62425a;

        static {
            int[] iArr = new int[Y0.values().length];
            f62425a = iArr;
            try {
                iArr[Y0.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62425a[Y0.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C6394e(@NonNull r rVar, @NonNull Y0 y02, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.f62420a = rVar;
        this.f62421b = y02;
        this.f62422c = cameraUseInconsistentTimebaseQuirk;
    }

    public final long a(long j11) {
        boolean z11;
        String str;
        String str2;
        Y0 y02 = this.f62424e;
        r rVar = this.f62420a;
        if (y02 == null) {
            CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk = this.f62422c;
            Y0 y03 = this.f62421b;
            if (cameraUseInconsistentTimebaseQuirk != null) {
                S.k("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
            } else {
                rVar.getClass();
                z11 = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()) - r.c() > 3000000;
                this.f62424e = y03;
            }
            rVar.getClass();
            Y0 y04 = Math.abs(j11 - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) < Math.abs(j11 - r.c()) ? Y0.REALTIME : Y0.UPTIME;
            if (!z11 || y04 == y03) {
                S.a("VideoTimebaseConverter", "Detect input timebase = " + y04);
            } else {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 31) {
                    StringBuilder sb2 = new StringBuilder(", SOC: ");
                    str2 = Build.SOC_MODEL;
                    sb2.append(str2);
                    str = sb2.toString();
                } else {
                    str = "";
                }
                S.c("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i11), str, this.f62421b, y04));
            }
            y03 = y04;
            this.f62424e = y03;
        }
        int i12 = a.f62425a[this.f62424e.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                return j11;
            }
            throw new AssertionError("Unknown timebase: " + this.f62424e);
        }
        if (this.f62423d == -1) {
            long j12 = Long.MAX_VALUE;
            long j13 = 0;
            for (int i13 = 0; i13 < 3; i13++) {
                rVar.getClass();
                long c11 = r.c();
                long micros = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
                long c12 = r.c();
                long j14 = c12 - c11;
                if (i13 == 0 || j14 < j12) {
                    j13 = micros - ((c11 + c12) >> 1);
                    j12 = j14;
                }
            }
            this.f62423d = Math.max(0L, j13);
            S.a("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + this.f62423d);
        }
        return j11 - this.f62423d;
    }
}
