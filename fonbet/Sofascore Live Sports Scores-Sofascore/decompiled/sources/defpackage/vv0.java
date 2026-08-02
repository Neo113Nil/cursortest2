package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vv0 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public vv0(ArrayList arrayList, int i, int i2, int i3, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    public static vv0 a(nkk nkkVar) {
        float f;
        String str;
        int i;
        int i2;
        byte[] bArr = pco.a;
        try {
            nkkVar.F(4);
            int s = (nkkVar.s() & 3) + 1;
            if (s == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int s2 = nkkVar.s() & 31;
            for (int i3 = 0; i3 < s2; i3++) {
                int x = nkkVar.x();
                int i4 = nkkVar.b;
                nkkVar.F(x);
                byte[] bArr2 = nkkVar.a;
                byte[] bArr3 = new byte[x + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i4, bArr3, 4, x);
                arrayList.add(bArr3);
            }
            int s3 = nkkVar.s();
            for (int i5 = 0; i5 < s3; i5++) {
                int x2 = nkkVar.x();
                int i6 = nkkVar.b;
                nkkVar.F(x2);
                byte[] bArr4 = nkkVar.a;
                byte[] bArr5 = new byte[x2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i6, bArr5, 4, x2);
                arrayList.add(bArr5);
            }
            if (s2 > 0) {
                g3d j0 = hkg.j0(s, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i7 = j0.e;
                int i8 = j0.f;
                f = j0.g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(j0.a), Integer.valueOf(j0.b), Integer.valueOf(j0.c));
                i = i7;
                i2 = i8;
            } else {
                f = 1.0f;
                str = null;
                i = -1;
                i2 = -1;
            }
            return new vv0(arrayList, s, i, i2, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw r9e.a("Error parsing AVC config", e);
        }
    }
}
