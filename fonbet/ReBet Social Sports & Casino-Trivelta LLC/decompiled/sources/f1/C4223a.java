package f1;

import e1.J;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4223a {

    /* renamed from: a, reason: collision with root package name */
    public final int f46168a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46169b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46170c;

    public C4223a(int i10, int i11, String str) {
        this.f46168a = i10;
        this.f46169b = i11;
        this.f46170c = str;
    }

    public static C4223a a(J j10) {
        String str;
        j10.c0(2);
        int M10 = j10.M();
        int i10 = M10 >> 1;
        int M11 = ((j10.M() >> 3) & 31) | ((M10 & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i10 < 10 ? ".0" : ".");
        sb2.append(i10);
        sb2.append(M11 < 10 ? ".0" : ".");
        sb2.append(M11);
        return new C4223a(i10, M11, sb2.toString());
    }
}
