package n3;

import Ij.C3261b;
import O7.o;
import j3.t;
import java.util.ArrayList;
import java.util.Arrays;
import m3.C8050C;
import m3.N;

/* renamed from: n3.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8429b implements t.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f76370a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f76371b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76372c;

    /* renamed from: d, reason: collision with root package name */
    public final int f76373d;

    public C8429b(String str, byte[] bArr, int i11, int i12) {
        boolean z11;
        byte b11;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                G10.a.c(i12 == 23 && bArr.length == 4);
                break;
            case "auxiliary.tracks.interleaved":
                if (i12 != 75 || bArr.length != 1 || ((b11 = bArr[0]) != 0 && b11 != 1)) {
                    z11 = false;
                }
                G10.a.c(z11);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                G10.a.c(i12 == 78 && bArr.length == 8);
                break;
            case "auxiliary.tracks.map":
                G10.a.c(i12 == 0);
                break;
        }
        this.f76370a = str;
        this.f76371b = bArr;
        this.f76372c = i11;
        this.f76373d = i12;
    }

    public final ArrayList d() {
        G10.a.g("Metadata is not an auxiliary tracks map", this.f76370a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f76371b;
        byte b11 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < b11; i11++) {
            arrayList.add(Integer.valueOf(bArr[i11 + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8429b.class == obj.getClass()) {
            C8429b c8429b = (C8429b) obj;
            if (this.f76370a.equals(c8429b.f76370a) && Arrays.equals(this.f76371b, c8429b.f76371b) && this.f76372c == c8429b.f76372c && this.f76373d == c8429b.f76373d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f76371b) + G.g.a(527, 31, this.f76370a)) * 31) + this.f76372c) * 31) + this.f76373d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d2 A[LOOP:0: B:17:0x00cf->B:19:0x00d2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String sb2;
        String str = this.f76370a;
        byte[] bArr = this.f76371b;
        int i11 = this.f76373d;
        if (i11 == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d11 = d();
                StringBuilder e11 = C3261b.e("track types = ");
                O7.f.d().a(e11, d11);
                sb2 = e11.toString();
            }
            int i12 = N.f74289a;
            StringBuilder sb3 = new StringBuilder(bArr.length * 2);
            while (r3 < bArr.length) {
            }
            sb2 = sb3.toString();
        } else if (i11 == 1) {
            sb2 = N.r(bArr);
        } else if (i11 == 23) {
            boolean z11 = bArr.length >= 4;
            int length = bArr.length;
            if (!z11) {
                throw new IllegalArgumentException(o.d("array too small: %s < %s", Integer.valueOf(length), 4));
            }
            sb2 = String.valueOf(Float.intBitsToFloat(com.google.common.primitives.b.d(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i11 == 67) {
            boolean z12 = bArr.length >= 4;
            int length2 = bArr.length;
            if (!z12) {
                throw new IllegalArgumentException(o.d("array too small: %s < %s", Integer.valueOf(length2), 4));
            }
            sb2 = String.valueOf(com.google.common.primitives.b.d(bArr[0], bArr[1], bArr[2], bArr[3]));
        } else if (i11 != 75) {
            if (i11 == 78) {
                sb2 = String.valueOf(new C8050C(bArr).K());
            }
            int i122 = N.f74289a;
            StringBuilder sb32 = new StringBuilder(bArr.length * 2);
            for (int i13 = 0; i13 < bArr.length; i13++) {
                sb32.append(Character.forDigit((bArr[i13] >> 4) & 15, 16));
                sb32.append(Character.forDigit(bArr[i13] & 15, 16));
            }
            sb2 = sb32.toString();
        } else {
            sb2 = String.valueOf(Byte.toUnsignedInt(bArr[0]));
        }
        return Sh.b.c("mdta: key=", str, ", value=", sb2);
    }
}
