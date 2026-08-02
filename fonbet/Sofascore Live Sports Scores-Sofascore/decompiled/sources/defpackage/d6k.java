package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d6k {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final g7h b;
    public volatile int c = 0;

    public d6k(g7h g7hVar, int i) {
        this.b = g7hVar;
        this.a = i;
    }

    public final int a(int i) {
        xic b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b.d;
        int i2 = a + b.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final xic b() {
        ThreadLocal threadLocal = d;
        xic xicVar = (xic) threadLocal.get();
        if (xicVar == null) {
            xicVar = new xic();
            threadLocal.set(xicVar);
        }
        yic yicVar = (yic) this.b.b;
        int a = yicVar.a(6);
        if (a != 0) {
            int i = a + yicVar.a;
            int i2 = (this.a * 4) + ((ByteBuffer) yicVar.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) yicVar.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) yicVar.d;
            xicVar.d = byteBuffer;
            if (byteBuffer != null) {
                xicVar.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                xicVar.b = i4;
                xicVar.c = ((ByteBuffer) xicVar.d).getShort(i4);
                return xicVar;
            }
            xicVar.a = 0;
            xicVar.b = 0;
            xicVar.c = 0;
        }
        return xicVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        xic b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? ((ByteBuffer) b.d).getInt(a + b.a) : 0));
        sb.append(", codepoints:");
        xic b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.a;
            i = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
