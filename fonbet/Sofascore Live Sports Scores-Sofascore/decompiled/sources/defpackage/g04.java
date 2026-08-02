package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class g04 {
    public final String a;
    public final float b;
    public final int c;
    public final Integer d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ g04(String str, float f, int i, Integer num, int i2) {
        this(str, (i2 & 8) != 0 ? null : num, (i2 & 4) != 0 ? 32 : i, f);
        f = (i2 & 2) != 0 ? 1.0f : f;
    }

    public g04(String str, Integer num, int i, float f) {
        this.a = str;
        this.b = f;
        this.c = i;
        this.d = num;
    }
}
