package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.a70;
import defpackage.me4;
import defpackage.wt3;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzjo extends AbstractSafeParcelable implements Comparable<zzjo> {
    public static final Parcelable.Creator<zzjo> CREATOR = new zzjp();
    public final String a;
    public final long b;
    public final boolean c;
    public final double d;
    public final String e;
    public final byte[] f;
    public final int g;
    public final int h;
    public final int i;

    public zzjo(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    public final void Y0(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.a;
        sb.append(str);
        sb.append(", ");
        int i = this.g;
        if (i == 1) {
            sb.append(this.b);
        } else if (i == 2) {
            sb.append(this.c);
        } else if (i == 3) {
            sb.append(this.d);
        } else if (i == 4) {
            sb.append("'");
            String str2 = this.e;
            Preconditions.i(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i != 5) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
                sb2.append("Invalid type: ");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(i);
                throw new AssertionError(sb2.toString());
            }
            sb.append("'");
            byte[] bArr = this.f;
            Preconditions.i(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        wt3.u(i, ", ", ", ", sb);
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(")");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3 A[RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(zzjo zzjoVar) {
        zzjo zzjoVar2 = zzjoVar;
        int compareTo = this.a.compareTo(zzjoVar2.a);
        if (compareTo != 0) {
            return compareTo;
        }
        int i = zzjoVar2.g;
        int i2 = this.g;
        int i3 = i2 < i ? -1 : i2 != i ? 1 : 0;
        if (i3 != 0) {
            return i3;
        }
        if (i2 == 1) {
            long j = this.b;
            long j2 = zzjoVar2.b;
            if (j >= j2) {
                if (j == j2) {
                    return 0;
                }
            }
        }
        if (i2 == 2) {
            boolean z = zzjoVar2.c;
            boolean z2 = this.c;
            if (z2 != z) {
                return z2 ? 1 : -1;
            }
            return 0;
        }
        if (i2 == 3) {
            return Double.compare(this.d, zzjoVar2.d);
        }
        if (i2 == 4) {
            String str = zzjoVar2.e;
            String str2 = this.e;
            if (str2 != str) {
                if (str2 != null) {
                    if (str != null) {
                        return str2.compareTo(str);
                    }
                }
            }
            return 0;
        }
        if (i2 != 5) {
            a70.j(me4.g(i2, "Invalid enum value: ", new StringBuilder(String.valueOf(i2).length() + 20)));
            return 0;
        }
        byte[] bArr = zzjoVar2.f;
        byte[] bArr2 = this.f;
        if (bArr2 != bArr) {
            if (bArr2 != null) {
                if (bArr != null) {
                    int i4 = 0;
                    while (true) {
                        int length = bArr.length;
                        int length2 = bArr2.length;
                        if (i4 >= Math.min(length2, length)) {
                            if (length2 < length) {
                                return -1;
                            }
                            return length2 != length ? 1 : 0;
                        }
                        int i5 = bArr2[i4] - bArr[i4];
                        if (i5 != 0) {
                            return i5;
                        }
                        i4++;
                    }
                }
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjo) {
            zzjo zzjoVar = (zzjo) obj;
            if (zzkl.a(this.a, zzjoVar.a)) {
                int i = zzjoVar.g;
                int i2 = this.g;
                if (i2 == i && this.h == zzjoVar.h && this.i == zzjoVar.i) {
                    if (i2 == 1) {
                        return this.b == zzjoVar.b;
                    }
                    if (i2 == 2) {
                        return this.c == zzjoVar.c;
                    }
                    if (i2 == 3) {
                        return this.d == zzjoVar.d;
                    }
                    if (i2 == 4) {
                        return zzkl.a(this.e, zzjoVar.e);
                    }
                    if (i2 == 5) {
                        return Arrays.equals(this.f, zzjoVar.f);
                    }
                    a70.j(me4.g(i2, "Invalid enum value: ", new StringBuilder(String.valueOf(i2).length() + 20)));
                    return false;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Y0(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        boolean z = str == null;
        int s = SafeParcelWriter.s(parcel, 20293);
        if (!z) {
            SafeParcelWriter.m(parcel, 2, str, false);
        }
        long j = this.b;
        if (j != 0) {
            SafeParcelWriter.r(parcel, 3, 8);
            parcel.writeLong(j);
        }
        if (this.c) {
            SafeParcelWriter.r(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d = this.d;
        if (d != 0.0d) {
            SafeParcelWriter.r(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.e;
        if (str2 != null) {
            SafeParcelWriter.m(parcel, 6, str2, false);
        }
        byte[] bArr = this.f;
        if (bArr != null) {
            SafeParcelWriter.c(parcel, 7, bArr, false);
        }
        int i2 = this.g;
        if (i2 != 0) {
            SafeParcelWriter.r(parcel, 8, 4);
            parcel.writeInt(i2);
        }
        int i3 = this.h;
        if (i3 != 0) {
            SafeParcelWriter.r(parcel, 9, 4);
            parcel.writeInt(i3);
        }
        int i4 = this.i;
        if (i4 != 0) {
            SafeParcelWriter.r(parcel, 10, 4);
            parcel.writeInt(i4);
        }
        SafeParcelWriter.t(parcel, s);
    }
}
