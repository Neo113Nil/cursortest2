package com.google.android.gms.internal.measurement;

import defpackage.a9n;
import defpackage.fn0;
import defpackage.j8n;
import defpackage.l4a;
import defpackage.mz1;
import defpackage.q8n;
import defpackage.x5n;
import defpackage.x8n;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzacr implements Iterable, Serializable {
    public static final a9n b = new a9n(zzaed.a);
    public int a = 0;

    static {
        int i = j8n.a;
    }

    public static a9n q(int i, int i2, byte[] bArr) {
        try {
            return r(i, i2, bArr);
        } catch (zzaeh e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static a9n r(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return b;
        }
        t(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new a9n(bArr2);
    }

    public static int t(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            defpackage.zzl.r(fn0.k(i, "Beginning index: ", " < 0", new StringBuilder(String.valueOf(i).length() + 21)));
            return 0;
        }
        if (i2 < i) {
            defpackage.zzl.r(x5n.n(new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length()), i, "Beginning index larger than ending index: ", i2, ", "));
            return 0;
        }
        defpackage.zzl.r(x5n.n(new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length()), i2, "End index: ", i3, " >= "));
        return 0;
    }

    public static /* synthetic */ boolean u(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i + i3;
        t(i, i4, bArr.length);
        t(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte c(int i);

    public abstract int d();

    public abstract x8n e(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacr)) {
            return false;
        }
        zzacr zzacrVar = (zzacr) obj;
        int d = d();
        if (d != zzacrVar.d()) {
            return false;
        }
        if (d == 0) {
            return true;
        }
        int i = this.a;
        int i2 = zzacrVar.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return o(zzacrVar);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int d = d();
            i = p(d, d);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new q8n(this);
    }

    public abstract void m(int i, byte[] bArr);

    public abstract void n(zzada zzadaVar);

    public abstract boolean o(zzacr zzacrVar);

    public abstract int p(int i, int i2);

    public final byte[] s() {
        int d = d();
        if (d == 0) {
            return zzaed.a;
        }
        byte[] bArr = new byte[d];
        m(d, bArr);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return mz1.o(mz1.q(d(), "<ByteString@", hexString, " size=", " contents=\""), d() <= 50 ? l4a.U(s()) : l4a.U(e(0, 47).s()).concat("..."), "\">");
    }
}
