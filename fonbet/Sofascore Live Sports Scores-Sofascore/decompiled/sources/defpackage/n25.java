package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n25 {
    public final Context a;
    public final o25 b;
    public VelocityTracker c;
    public float d;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public final int[] h = {Integer.MAX_VALUE, 0};

    public n25(Context context, o25 o25Var) {
        this.a = context;
        this.b = o25Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x00b8, code lost:
    
        if (r5 >= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0071, code lost:
    
        if (r14 >= 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MotionEvent motionEvent, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        float f;
        float f2;
        long j;
        int i6;
        float f3;
        float sqrt;
        float f4;
        float[] fArr;
        float f5;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i7 = this.f;
        int[] iArr = this.h;
        if (i7 == source && this.g == deviceId && this.e == i) {
            z = false;
            i2 = 1;
            i3 = 0;
        } else {
            Context context = this.a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i2 = 1;
            int i8 = Build.VERSION.SDK_INT;
            i3 = 0;
            if (i8 >= 34) {
                i4 = q9.r(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i, source2) != null) {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        i4 = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier != 0) {
                        i4 = resources.getDimensionPixelSize(identifier);
                    }
                }
                i4 = Integer.MAX_VALUE;
            }
            iArr[0] = i4;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i8 >= 34) {
                i5 = q9.q(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 != null && device2.getMotionRange(i, source3) != null) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        i5 = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 != 0) {
                        i5 = resources2.getDimensionPixelSize(identifier2);
                    }
                }
                i5 = Integer.MIN_VALUE;
            }
            iArr[1] = i5;
            this.f = source;
            this.g = deviceId;
            this.e = i;
            z = true;
        }
        int i9 = iArr[i3];
        VelocityTracker velocityTracker = this.c;
        if (i9 == Integer.MAX_VALUE) {
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.c = null;
                return;
            }
            return;
        }
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.c = velocityTracker;
        }
        Map map = ymk.a;
        velocityTracker.addMovement(motionEvent);
        int i10 = Build.VERSION.SDK_INT;
        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i11 = 20;
        if (i10 < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = ymk.a;
            if (!map2.containsKey(velocityTracker)) {
                map2.put(velocityTracker, new zmk());
            }
            zmk zmkVar = (zmk) map2.get(velocityTracker);
            long[] jArr = zmkVar.b;
            long eventTime = motionEvent.getEventTime();
            int i12 = zmkVar.d;
            if (i12 != 0 && eventTime - jArr[zmkVar.e] > 40) {
                zmkVar.d = i3;
                zmkVar.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                i12 = 0;
            }
            int i13 = (zmkVar.e + 1) % 20;
            zmkVar.e = i13;
            if (i12 != 20) {
                zmkVar.d = i12 + 1;
            }
            zmkVar.a[i13] = motionEvent.getAxisValue(26);
            jArr[zmkVar.e] = eventTime;
        }
        velocityTracker.computeCurrentVelocity(1000, Float.MAX_VALUE);
        zmk zmkVar2 = (zmk) ymk.a.get(velocityTracker);
        if (zmkVar2 != null) {
            float[] fArr2 = zmkVar2.a;
            long[] jArr2 = zmkVar2.b;
            int i14 = zmkVar2.d;
            if (i14 >= 2) {
                int i15 = zmkVar2.e;
                int i16 = ((i15 + 20) - (i14 - 1)) % 20;
                long j2 = jArr2[i15];
                while (true) {
                    j = jArr2[i16];
                    long j3 = j2 - j;
                    i6 = zmkVar2.d;
                    if (j3 <= 100) {
                        break;
                    }
                    zmkVar2.d = i6 - 1;
                    i16 = (i16 + 1) % 20;
                }
                if (i6 >= 2) {
                    if (i6 == 2) {
                        int i17 = (i16 + 1) % 20;
                        if (j != jArr2[i17]) {
                            sqrt = fArr2[i17] / (r13 - j);
                            f3 = Float.MAX_VALUE;
                            f = 0.0f;
                        }
                    } else {
                        f3 = Float.MAX_VALUE;
                        float f7 = 0.0f;
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            if (i18 >= zmkVar2.d - 1) {
                                break;
                            }
                            int i20 = i18 + i16;
                            long j4 = jArr2[i20 % 20];
                            int i21 = (i20 + 1) % i11;
                            if (jArr2[i21] == j4) {
                                f4 = f6;
                                fArr = fArr2;
                            } else {
                                i19++;
                                f4 = f6;
                                fArr = fArr2;
                                float sqrt2 = (f7 < f6 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f7) * 2.0f));
                                float f8 = fArr[i21] / (jArr2[i21] - j4);
                                f7 += Math.abs(f8) * (f8 - sqrt2);
                                if (i19 == i2) {
                                    f7 *= 0.5f;
                                }
                            }
                            i18++;
                            f6 = f4;
                            fArr2 = fArr;
                            i11 = 20;
                            i2 = 1;
                        }
                        f = f6;
                        sqrt = (f7 < f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f7) * 2.0f));
                    }
                    f5 = sqrt * 1000.0f;
                    zmkVar2.c = f5;
                    if (f5 >= (-Math.abs(f3))) {
                        zmkVar2.c = -Math.abs(f3);
                    } else if (zmkVar2.c > Math.abs(f3)) {
                        zmkVar2.c = Math.abs(f3);
                    }
                }
            }
            f3 = Float.MAX_VALUE;
            sqrt = 0.0f;
            f = 0.0f;
            f5 = sqrt * 1000.0f;
            zmkVar2.c = f5;
            if (f5 >= (-Math.abs(f3))) {
            }
        } else {
            f = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            f2 = q9.j(velocityTracker, i);
        } else if (i == 0) {
            f2 = velocityTracker.getXVelocity();
        } else if (i == 1) {
            f2 = velocityTracker.getYVelocity();
        } else {
            zmk zmkVar3 = (zmk) ymk.a.get(velocityTracker);
            f2 = (zmkVar3 == null || i != 26) ? f : zmkVar3.c;
        }
        o25 o25Var = this.b;
        float B = o25Var.B() * f2;
        float signum = Math.signum(B);
        if (z || (signum != Math.signum(this.d) && signum != f)) {
            o25Var.C();
        }
        if (Math.abs(B) < iArr[0]) {
            return;
        }
        float max = Math.max(-r1, Math.min(B, iArr[1]));
        this.d = o25Var.v(max) ? max : f;
    }
}
