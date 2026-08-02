package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wv0 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public wv0(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static wv0 a(j9e j9eVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            j9eVar.O(4);
            int A = (j9eVar.A() & 3) + 1;
            if (A == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int A2 = j9eVar.A() & 31;
            for (int i9 = 0; i9 < A2; i9++) {
                int H = j9eVar.H();
                int i10 = j9eVar.b;
                j9eVar.O(H);
                byte[] bArr = j9eVar.a;
                byte[] bArr2 = new byte[H + 4];
                System.arraycopy(wz2.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, H);
                arrayList.add(bArr2);
            }
            int A3 = j9eVar.A();
            for (int i11 = 0; i11 < A3; i11++) {
                int H2 = j9eVar.H();
                int i12 = j9eVar.b;
                j9eVar.O(H2);
                byte[] bArr3 = j9eVar.a;
                byte[] bArr4 = new byte[H2 + 4];
                System.arraycopy(wz2.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, H2);
                arrayList.add(bArr4);
            }
            if (A2 > 0) {
                h3d U = kik.U(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i13 = U.e;
                int i14 = U.f;
                int i15 = U.h + 8;
                int i16 = U.i + 8;
                int i17 = U.p;
                int i18 = U.q;
                int i19 = U.r;
                int i20 = U.s;
                float f2 = U.g;
                int i21 = U.a;
                int i22 = U.b;
                int i23 = U.c;
                byte[] bArr5 = wz2.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new wv0(arrayList, A, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw s9e.a(e, "Error parsing AVC config");
        }
    }
}
