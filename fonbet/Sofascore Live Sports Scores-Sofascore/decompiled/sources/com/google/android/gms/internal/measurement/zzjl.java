package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.U3;
import defpackage.aik;
import defpackage.mz1;
import defpackage.wt3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzjl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjl> CREATOR = new zzjm();
    public final String a;
    public final byte[] b;
    public final byte[][] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final int[] g;
    public final byte[][] h;
    public final int[] i;
    public final byte[][] j;

    static {
        byte[][] bArr = new byte[0][];
        new zzjl("", null, bArr, bArr, bArr, bArr, null, null, null, null);
    }

    public zzjl(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.e = bArr4;
        this.f = bArr5;
        this.g = iArr;
        this.h = bArr6;
        this.i = iArr2;
        this.j = bArr7;
    }

    public static void Y0(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append(U3.j.b);
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            Preconditions.i(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public static Set a1(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(aik.y(length));
        for (byte[] bArr2 : bArr) {
            Preconditions.i(bArr2);
            hashSet.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSet;
    }

    public static List b1(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new zzju(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final Set Z0() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.h;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.b;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return a1((byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        int length;
        int length2;
        if (obj instanceof zzjl) {
            zzjl zzjlVar = (zzjl) obj;
            if (zzkl.a(this.a, zzjlVar.a) && zzkl.a(Z0(), zzjlVar.Z0()) && zzkl.a(a1(this.c), a1(zzjlVar.c)) && zzkl.a(a1(this.d), a1(zzjlVar.d)) && zzkl.a(a1(this.e), a1(zzjlVar.e)) && zzkl.a(a1(this.f), a1(zzjlVar.f))) {
                int[] iArr = this.g;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    obj2 = Collections.EMPTY_SET;
                } else {
                    obj2 = new HashSet(aik.y(length2));
                    for (int i : iArr) {
                        obj2.add(Integer.valueOf(i));
                    }
                }
                int[] iArr2 = zzjlVar.g;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    obj3 = Collections.EMPTY_SET;
                } else {
                    obj3 = new HashSet(aik.y(length));
                    for (int i2 : iArr2) {
                        obj3.add(Integer.valueOf(i2));
                    }
                }
                if (zzkl.a(obj2, obj3) && zzkl.a(b1(this.i), b1(zzjlVar.i)) && zzkl.a(a1(this.j), a1(zzjlVar.j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder r = mz1.r("ExperimentTokens", "(");
        String str = this.a;
        r.append(str == null ? "null" : wt3.m("'", str, new StringBuilder(str.length() + 2), "'"));
        r.append(", direct==");
        byte[] bArr = this.b;
        if (bArr == null) {
            r.append("null");
        } else {
            r.append("'");
            r.append(Base64.encodeToString(bArr, 3));
            r.append("'");
        }
        r.append(", ");
        Y0(r, "GAIA=", this.c);
        r.append(", ");
        Y0(r, "PSEUDO=", this.d);
        r.append(", ");
        Y0(r, "ALWAYS=", this.e);
        r.append(", ");
        Y0(r, "OTHER=", this.f);
        r.append(", weak=");
        r.append(Arrays.toString(this.g));
        r.append(", ");
        Y0(r, "directs=", this.h);
        r.append(", genDims=");
        r.append(Arrays.toString(b1(this.i).toArray()));
        r.append(", ");
        Y0(r, "external=", this.j);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a, false);
        SafeParcelWriter.c(parcel, 3, this.b, false);
        SafeParcelWriter.d(parcel, 4, this.c);
        SafeParcelWriter.d(parcel, 5, this.d);
        SafeParcelWriter.d(parcel, 6, this.e);
        SafeParcelWriter.d(parcel, 7, this.f);
        SafeParcelWriter.g(parcel, 8, this.g);
        SafeParcelWriter.d(parcel, 9, this.h);
        SafeParcelWriter.g(parcel, 10, this.i);
        SafeParcelWriter.d(parcel, 11, this.j);
        SafeParcelWriter.t(parcel, s);
    }
}
