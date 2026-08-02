package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s3g {
    public final int a;
    public final int b;
    public final int c;
    public final AtomicInteger d;

    public s3g(float f, float f2) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.d = atomicInteger;
        this.c = (int) (f2 * 1000.0f);
        int i = (int) (f * 1000.0f);
        this.a = i;
        this.b = i / 2;
        atomicInteger.set(i);
    }

    public final boolean a() {
        while (true) {
            AtomicInteger atomicInteger = this.d;
            int i = atomicInteger.get();
            if (i == 0) {
                break;
            }
            int i2 = i - 1000;
            if (atomicInteger.compareAndSet(i, Math.max(i2, 0))) {
                if (i2 > this.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3g)) {
            return false;
        }
        s3g s3gVar = (s3g) obj;
        return this.a == s3gVar.a && this.c == s3gVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.c)});
    }
}
