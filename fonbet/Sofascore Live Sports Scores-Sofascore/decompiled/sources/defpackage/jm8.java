package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jm8 implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public jm8(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        jm8 jm8Var = (jm8) obj;
        jm8Var.getClass();
        int i = this.a - jm8Var.a;
        return i == 0 ? this.b - jm8Var.b : i;
    }
}
