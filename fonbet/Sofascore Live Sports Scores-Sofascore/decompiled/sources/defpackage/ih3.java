package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ih3 {
    public final int a;
    public final jh3[] b;
    public long c;

    public ih3(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.b = new jh3[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = new jh3(threadFactory);
        }
    }
}
