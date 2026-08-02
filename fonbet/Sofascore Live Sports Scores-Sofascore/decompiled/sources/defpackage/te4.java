package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class te4 extends IOException {
    public final int a;

    public te4(int i) {
        this.a = i;
    }

    public te4(int i, Exception exc) {
        super(exc);
        this.a = i;
    }

    public te4(String str, int i) {
        super(str);
        this.a = i;
    }

    public te4(int i, String str, Exception exc) {
        super(str, exc);
        this.a = i;
    }
}
