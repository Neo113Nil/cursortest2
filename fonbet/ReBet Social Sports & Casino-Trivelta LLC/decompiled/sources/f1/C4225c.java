package f1;

import b1.C2334C;
import e1.AbstractC4134a;
import e1.J;
import e1.Z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: f1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4225c implements C2334C.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f46171a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46172b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46173c;
    public final byte[] value;

    public C4225c(String str, byte[] bArr, int i10, int i11) {
        f(str, bArr, i11);
        this.f46171a = str;
        this.value = bArr;
        this.f46172b = i10;
        this.f46173c = i11;
    }

    public static String e(List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("track types = ");
        Ra.g.f(',').b(sb2, list);
        return sb2.toString();
    }

    public static void f(String str, byte[] bArr, int i10) {
        boolean z10;
        byte b10;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i10 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                AbstractC4134a.a(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i10 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                AbstractC4134a.a(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i10 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                AbstractC4134a.a(z10);
                break;
            case "auxiliary.tracks.map":
                AbstractC4134a.a(i10 == 0);
                break;
        }
    }

    public List d() {
        AbstractC4134a.h(this.f46171a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte b10 = this.value[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(this.value[i10 + 2]));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4225c.class == obj.getClass()) {
            C4225c c4225c = (C4225c) obj;
            if (this.f46171a.equals(c4225c.f46171a) && Arrays.equals(this.value, c4225c.value) && this.f46172b == c4225c.f46172b && this.f46173c == c4225c.f46173c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f46171a.hashCode()) * 31) + Arrays.hashCode(this.value)) * 31) + this.f46172b) * 31) + this.f46173c;
    }

    public String toString() {
        String e10;
        int i10 = this.f46173c;
        if (i10 == 0) {
            if (this.f46171a.equals("auxiliary.tracks.map")) {
                e10 = e(d());
            }
            e10 = Z.F1(this.value);
        } else if (i10 == 1) {
            e10 = Z.H(this.value);
        } else if (i10 == 23) {
            e10 = String.valueOf(Float.intBitsToFloat(com.google.common.primitives.f.h(this.value)));
        } else if (i10 == 67) {
            e10 = String.valueOf(com.google.common.primitives.f.h(this.value));
        } else if (i10 != 75) {
            if (i10 == 78) {
                e10 = String.valueOf(new J(this.value).T());
            }
            e10 = Z.F1(this.value);
        } else {
            e10 = String.valueOf(AbstractC4224b.a(this.value[0]));
        }
        return "mdta: key=" + this.f46171a + ", value=" + e10;
    }
}
