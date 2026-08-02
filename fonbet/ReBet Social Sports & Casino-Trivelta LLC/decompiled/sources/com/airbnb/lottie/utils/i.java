package com.airbnb.lottie.utils;

/* loaded from: classes.dex */
public class i {
    private final String[] sections = new String[5];
    private final long[] startTimeNs = new long[5];

    /* renamed from: a, reason: collision with root package name */
    public int f29115a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f29116b = 0;

    public void a(String str) {
        int i10 = this.f29115a;
        if (i10 == 5) {
            this.f29116b++;
            return;
        }
        this.sections[i10] = str;
        this.startTimeNs[i10] = System.nanoTime();
        u0.o.a(str);
        this.f29115a++;
    }

    public float b(String str) {
        int i10 = this.f29116b;
        if (i10 > 0) {
            this.f29116b = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f29115a - 1;
        this.f29115a = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.sections[i11])) {
            u0.o.b();
            return (System.nanoTime() - this.startTimeNs[this.f29115a]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.sections[this.f29115a] + ".");
    }
}
