package pi;

import net.time4j.format.j;

/* renamed from: pi.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6082b {
    public static String a(j jVar, char c10, int i10) {
        if (!jVar.l()) {
            return jVar.p(i10);
        }
        int i11 = c10 - '0';
        String num = Integer.toString(i10);
        if (i11 == 0) {
            return num;
        }
        StringBuilder sb2 = new StringBuilder();
        int length = num.length();
        for (int i12 = 0; i12 < length; i12++) {
            sb2.append((char) (num.charAt(i12) + i11));
        }
        return sb2.toString();
    }
}
