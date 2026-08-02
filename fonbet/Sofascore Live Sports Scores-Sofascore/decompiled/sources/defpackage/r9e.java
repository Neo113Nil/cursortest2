package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class r9e extends IOException {
    public final boolean a;
    public final int b;

    public r9e(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    public static r9e a(String str, Exception exc) {
        return new r9e(str, exc, true, 1);
    }

    public static r9e b(String str) {
        return new r9e(str, null, false, 1);
    }
}
