package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ssj {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public ssj(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ssj.class != obj.getClass()) {
            return false;
        }
        ssj ssjVar = (ssj) obj;
        return this.a == ssjVar.a && this.c == ssjVar.c && this.d == ssjVar.d && Arrays.equals(this.b, ssjVar.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
