package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class uik {
    static {
        Logger.getLogger(uik.class.getName());
    }

    public static byte[][] a(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size][];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            x79 x79Var = (x79) it.next();
            int i2 = i + 1;
            bArr[i] = x79Var.a.v();
            i += 2;
            bArr[i2] = x79Var.b.v();
        }
        byte[] bArr2 = yxj.b;
        int i3 = 0;
        while (i3 < size) {
            byte[] bArr3 = bArr[i3];
            int i4 = i3 + 1;
            byte[] bArr4 = bArr[i4];
            if (yxj.a(bArr3, bArr2)) {
                for (byte b : bArr4) {
                    if (b == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i5 = 0; i5 < i3; i5++) {
                            arrayList2.add(bArr[i5]);
                        }
                        while (i3 < size) {
                            byte[] bArr5 = bArr[i3];
                            byte[] bArr6 = bArr[i3 + 1];
                            if (yxj.a(bArr5, bArr2)) {
                                int i6 = 0;
                                for (int i7 = 0; i7 <= bArr6.length; i7++) {
                                    if (i7 == bArr6.length || bArr6[i7] == 44) {
                                        byte[] a = q21.e.a(new String(bArr6, i6, i7 - i6, xp2.a));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(a);
                                        i6 = i7 + 1;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i3 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i4] = q21.e.a(new String(bArr4, xp2.a));
            }
            i3 += 2;
        }
        return bArr;
    }
}
