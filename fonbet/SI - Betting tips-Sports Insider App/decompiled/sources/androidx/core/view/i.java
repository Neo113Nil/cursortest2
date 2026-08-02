package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1327a;

    /* renamed from: b, reason: collision with root package name */
    public final j f1328b;

    /* renamed from: c, reason: collision with root package name */
    public VelocityTracker f1329c;

    /* renamed from: d, reason: collision with root package name */
    public float f1330d;

    /* renamed from: e, reason: collision with root package name */
    public int f1331e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f1332f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f1333g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f1334h = {Integer.MAX_VALUE, 0};

    public i(Context context, j jVar) {
        this.f1327a = context;
        this.f1328b = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x00bc, code lost:
    
        if (r5 >= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0075, code lost:
    
        if (r14 >= 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MotionEvent motionEvent, int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z5;
        float f6;
        float f10;
        long j;
        float f11;
        float sqrt;
        float f12;
        float f13;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i14 = this.f1332f;
        int[] iArr = this.f1334h;
        if (i14 == source && this.f1333g == deviceId && this.f1331e == i5) {
            z5 = false;
            i10 = 1;
            i11 = 0;
        } else {
            Context context = this.f1327a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i10 = 1;
            int i15 = Build.VERSION.SDK_INT;
            i11 = 0;
            if (i15 >= 34) {
                Method method = a1.f1281a;
                i12 = h0.i(viewConfiguration, deviceId2, i5, source2);
            } else {
                Method method2 = a1.f1281a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i5, source2) != null) {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i5 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", ConstantDeviceInfo.APP_PLATFORM) : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        i12 = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier != 0) {
                        i12 = resources.getDimensionPixelSize(identifier);
                    }
                }
                i12 = Integer.MAX_VALUE;
            }
            iArr[0] = i12;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i15 >= 34) {
                i13 = h0.h(viewConfiguration, deviceId3, i5, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 != null && device2.getMotionRange(i5, source3) != null) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i5 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", ConstantDeviceInfo.APP_PLATFORM) : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        i13 = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 != 0) {
                        i13 = resources2.getDimensionPixelSize(identifier2);
                    }
                }
                i13 = Integer.MIN_VALUE;
            }
            iArr[1] = i13;
            this.f1332f = source;
            this.f1333g = deviceId;
            this.f1331e = i5;
            z5 = true;
        }
        if (iArr[i11] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f1329c;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1329c = null;
                return;
            }
            return;
        }
        if (this.f1329c == null) {
            this.f1329c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f1329c;
        Map map = i0.f1335a;
        velocityTracker2.addMovement(motionEvent);
        float f14 = 0.0f;
        int i16 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = i0.f1335a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new j0());
            }
            j0 j0Var = (j0) map2.get(velocityTracker2);
            long[] jArr = j0Var.f1339b;
            long eventTime = motionEvent.getEventTime();
            if (j0Var.f1341d != 0 && eventTime - jArr[j0Var.f1342e] > 40) {
                j0Var.f1341d = i11;
                j0Var.f1340c = 0.0f;
            }
            int i17 = (j0Var.f1342e + 1) % 20;
            j0Var.f1342e = i17;
            int i18 = j0Var.f1341d;
            if (i18 != 20) {
                j0Var.f1341d = i18 + 1;
            }
            j0Var.f1338a[i17] = motionEvent.getAxisValue(26);
            jArr[j0Var.f1342e] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, Float.MAX_VALUE);
        j0 j0Var2 = (j0) i0.f1335a.get(velocityTracker2);
        if (j0Var2 != null) {
            float[] fArr = j0Var2.f1338a;
            long[] jArr2 = j0Var2.f1339b;
            int i19 = j0Var2.f1341d;
            if (i19 >= 2) {
                int i20 = j0Var2.f1342e;
                int i21 = ((i20 + 20) - (i19 - 1)) % 20;
                long j6 = jArr2[i20];
                while (true) {
                    j = jArr2[i21];
                    if (j6 - j <= 100) {
                        break;
                    }
                    j0Var2.f1341d--;
                    i21 = (i21 + 1) % 20;
                }
                int i22 = j0Var2.f1341d;
                if (i22 >= 2) {
                    if (i22 == 2) {
                        int i23 = (i21 + 1) % 20;
                        if (j != jArr2[i23]) {
                            sqrt = fArr[i23] / (r13 - j);
                            f11 = Float.MAX_VALUE;
                            f6 = 0.0f;
                        }
                    } else {
                        f11 = Float.MAX_VALUE;
                        float f15 = 0.0f;
                        int i24 = 0;
                        int i25 = 0;
                        while (true) {
                            if (i24 >= j0Var2.f1341d - 1) {
                                break;
                            }
                            int i26 = i24 + i21;
                            long j10 = jArr2[i26 % 20];
                            int i27 = (i26 + 1) % i16;
                            if (jArr2[i27] == j10) {
                                f12 = f14;
                            } else {
                                i25++;
                                f12 = f14;
                                float sqrt2 = (f15 < f14 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f15) * 2.0f));
                                float f16 = fArr[i27] / (jArr2[i27] - j10);
                                f15 += Math.abs(f16) * (f16 - sqrt2);
                                if (i25 == i10) {
                                    f15 *= 0.5f;
                                }
                            }
                            i24++;
                            f14 = f12;
                            i16 = 20;
                            i10 = 1;
                        }
                        f6 = f14;
                        sqrt = (f15 < f6 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f15) * 2.0f));
                    }
                    f13 = sqrt * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                    j0Var2.f1340c = f13;
                    if (f13 >= (-Math.abs(f11))) {
                        j0Var2.f1340c = -Math.abs(f11);
                    } else if (j0Var2.f1340c > Math.abs(f11)) {
                        j0Var2.f1340c = Math.abs(f11);
                    }
                }
            }
            f11 = Float.MAX_VALUE;
            sqrt = 0.0f;
            f6 = 0.0f;
            f13 = sqrt * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
            j0Var2.f1340c = f13;
            if (f13 >= (-Math.abs(f11))) {
            }
        } else {
            f6 = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            f10 = h0.e(velocityTracker2, i5);
        } else if (i5 == 0) {
            f10 = velocityTracker2.getXVelocity();
        } else if (i5 == 1) {
            f10 = velocityTracker2.getYVelocity();
        } else {
            j0 j0Var3 = (j0) i0.f1335a.get(velocityTracker2);
            f10 = (j0Var3 == null || i5 != 26) ? f6 : j0Var3.f1340c;
        }
        j jVar = this.f1328b;
        float e7 = jVar.e() * f10;
        float signum = Math.signum(e7);
        if (z5 || (signum != Math.signum(this.f1330d) && signum != f6)) {
            jVar.i();
        }
        if (Math.abs(e7) < iArr[0]) {
            return;
        }
        float max = Math.max(-r1, Math.min(e7, iArr[1]));
        this.f1330d = jVar.d(max) ? max : f6;
    }
}
