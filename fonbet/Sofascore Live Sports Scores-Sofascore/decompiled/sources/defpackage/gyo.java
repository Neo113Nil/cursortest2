package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gyo extends Exception {
    public final int a;

    public gyo(int i) {
        super(me4.g(i, "Signal SDK error code: ", new StringBuilder(String.valueOf(i).length() + 23)));
        this.a = i;
    }
}
