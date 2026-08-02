package defpackage;

import java.util.Arrays;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class g0p implements Comparable {
    public static final /* synthetic */ long c = rh0.a.objectFieldOffset(g0p.class.getDeclaredField("b"));
    public final String a;
    public volatile Object b;

    public /* synthetic */ g0p(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final /* synthetic */ void a(byte[] bArr) {
        byte[][] bArr2;
        g0p g0pVar;
        int i = 0;
        while (true) {
            Object obj = this.b;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            byte[][] bArr5 = bArr2;
            while (true) {
                Unsafe unsafe = rh0.a;
                long j = c;
                g0pVar = this;
                if (unsafe.compareAndSwapObject(g0pVar, j, obj, bArr5)) {
                    return;
                }
                if (unsafe.getObjectVolatile(g0pVar, j) != obj) {
                    break;
                } else {
                    this = g0pVar;
                }
            }
            this = g0pVar;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo((String) obj);
    }
}
