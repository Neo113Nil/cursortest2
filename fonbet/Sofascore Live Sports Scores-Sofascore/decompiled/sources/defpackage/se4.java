package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class se4 extends IOException {
    public final int a;

    public se4(int i) {
        this.a = i;
    }

    public se4(int i, Exception exc) {
        super(exc);
        this.a = i;
    }

    public se4(int i, String str, Exception exc) {
        super(str, exc);
        this.a = i;
    }
}
