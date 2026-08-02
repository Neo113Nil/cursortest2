package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kfj {
    public static final v9f i = new v9f(4);
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final f9j h;

    public kfj(int i2, String str, String str2, long j, long j2, long j3, boolean z, int i3) {
        j3 = (i3 & 32) != 0 ? System.currentTimeMillis() : j3;
        z = (i3 & 64) != 0 ? true : z;
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z;
        if (str.length() == 0 && str2.length() == 0) {
            a70.p("Either pre or post text must not be empty");
            throw null;
        }
        this.h = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? f9j.c : f9j.b : f9j.a;
    }

    public final y8j a() {
        if (this.h != f9j.b) {
            return y8j.d;
        }
        long j = this.e;
        if (!pej.d(j)) {
            return y8j.d;
        }
        long j2 = this.d;
        if (pej.d(j2)) {
            return ((int) (j2 >> 32)) > ((int) (j >> 32)) ? y8j.a : y8j.b;
        }
        int i2 = (int) (j2 >> 32);
        return (i2 == ((int) (j >> 32)) && i2 == this.a) ? y8j.c : y8j.d;
    }
}
