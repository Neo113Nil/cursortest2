package androidx.core.view;

import android.view.MotionEvent;

/* renamed from: androidx.core.view.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2078b0 {
    private final float[] mMovements = new float[20];
    private final long[] mEventTimes = new long[20];

    /* renamed from: a, reason: collision with root package name */
    public float f19187a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f19188b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f19189c = 0;

    public static float f(float f10) {
        return (f10 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f10) * 2.0f));
    }

    public void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f19188b != 0 && eventTime - this.mEventTimes[this.f19189c] > 40) {
            b();
        }
        int i10 = (this.f19189c + 1) % 20;
        this.f19189c = i10;
        int i11 = this.f19188b;
        if (i11 != 20) {
            this.f19188b = i11 + 1;
        }
        this.mMovements[i10] = motionEvent.getAxisValue(26);
        this.mEventTimes[this.f19189c] = eventTime;
    }

    public final void b() {
        this.f19188b = 0;
        this.f19187a = 0.0f;
    }

    public void c(int i10, float f10) {
        float e10 = e() * i10;
        this.f19187a = e10;
        if (e10 < (-Math.abs(f10))) {
            this.f19187a = -Math.abs(f10);
        } else if (this.f19187a > Math.abs(f10)) {
            this.f19187a = Math.abs(f10);
        }
    }

    public float d(int i10) {
        if (i10 != 26) {
            return 0.0f;
        }
        return this.f19187a;
    }

    public final float e() {
        long[] jArr;
        long j10;
        int i10 = this.f19188b;
        if (i10 < 2) {
            return 0.0f;
        }
        int i11 = this.f19189c;
        int i12 = ((i11 + 20) - (i10 - 1)) % 20;
        long j11 = this.mEventTimes[i11];
        while (true) {
            jArr = this.mEventTimes;
            j10 = jArr[i12];
            if (j11 - j10 <= 100) {
                break;
            }
            this.f19188b--;
            i12 = (i12 + 1) % 20;
        }
        int i13 = this.f19188b;
        if (i13 < 2) {
            return 0.0f;
        }
        if (i13 == 2) {
            int i14 = (i12 + 1) % 20;
            if (j10 == jArr[i14]) {
                return 0.0f;
            }
            return this.mMovements[i14] / (r2 - j10);
        }
        float f10 = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f19188b - 1; i16++) {
            int i17 = i16 + i12;
            long[] jArr2 = this.mEventTimes;
            long j12 = jArr2[i17 % 20];
            int i18 = (i17 + 1) % 20;
            if (jArr2[i18] != j12) {
                i15++;
                float f11 = f(f10);
                float f12 = this.mMovements[i18] / (this.mEventTimes[i18] - j12);
                f10 += (f12 - f11) * Math.abs(f12);
                if (i15 == 1) {
                    f10 *= 0.5f;
                }
            }
        }
        return f(f10);
    }
}
