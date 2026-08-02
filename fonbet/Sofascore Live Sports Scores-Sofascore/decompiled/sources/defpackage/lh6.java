package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lh6 {
    public final osj a;
    public final int[] b;

    public lh6(int i, osj osjVar, int[] iArr) {
        if (iArr.length == 0) {
            tgj.A("Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = osjVar;
        this.b = iArr;
    }
}
