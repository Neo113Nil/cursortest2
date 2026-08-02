package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzafm {
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

    public zzafm(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
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

    public static zzafm a(zzeu zzeuVar) {
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
            zzeuVar.E(4);
            int I = (zzeuVar.I() & 3) + 1;
            if (I == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int I2 = zzeuVar.I() & 31;
            for (int i9 = 0; i9 < I2; i9++) {
                int J = zzeuVar.J();
                int i10 = zzeuVar.b;
                zzeuVar.E(J);
                byte[] bArr = zzeuVar.a;
                byte[] bArr2 = zzdr.a;
                byte[] bArr3 = new byte[J + 4];
                System.arraycopy(zzdr.a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i10, bArr3, 4, J);
                arrayList.add(bArr3);
            }
            int I3 = zzeuVar.I();
            for (int i11 = 0; i11 < I3; i11++) {
                int J2 = zzeuVar.J();
                int i12 = zzeuVar.b;
                zzeuVar.E(J2);
                byte[] bArr4 = zzeuVar.a;
                byte[] bArr5 = zzdr.a;
                byte[] bArr6 = new byte[J2 + 4];
                System.arraycopy(zzdr.a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i12, bArr6, 4, J2);
                arrayList.add(bArr6);
            }
            if (I2 > 0) {
                zzgq d = zzgr.d(5, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i13 = d.e;
                int i14 = d.f;
                int i15 = d.h + 8;
                int i16 = d.i + 8;
                int i17 = d.j;
                int i18 = d.k;
                int i19 = d.l;
                int i20 = d.m;
                float f2 = d.g;
                int i21 = d.a;
                int i22 = d.b;
                int i23 = d.c;
                byte[] bArr7 = zzdr.a;
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
            return new zzafm(arrayList, I, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzat.a(e, "Error parsing AVC config");
        }
    }
}
