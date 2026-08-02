package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xn0 extends Exception {
    public final int a;
    public final boolean b;

    public xn0(int i, boolean z) {
        super(ljg.j(i, "AudioOutput write failed: "));
        this.b = z;
        this.a = i;
    }
}
