package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import B0.A0;
import C.o0;
import N3.C3660k;
import T7.E;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes9.dex */
public abstract class zbtc implements Iterable, Serializable {
    public static final zbtc zbb = new zbtb(zbuo.zbb);
    private int zba = 0;

    static {
        int i11 = zbsm.zba;
    }

    zbtc() {
    }

    static int zbh(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(E.a(i11, "Beginning index: ", " < 0"));
        }
        if (i12 < i11) {
            throw new IndexOutOfBoundsException(A0.a(i11, i12, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(A0.a(i12, i13, "End index: ", " >= "));
    }

    public static zbtc zbj(byte[] bArr, int i11, int i12) {
        zbh(i11, i11 + i12, bArr.length);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new zbtb(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i11 = this.zba;
        if (i11 == 0) {
            int zbd = zbd();
            i11 = zbe(zbd, 0, zbd);
            if (i11 == 0) {
                i11 = 1;
            }
            this.zba = i11;
        }
        return i11;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zbsu(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return o0.c(C3660k.c(zbd(), "<ByteString@", hexString, " size=", " contents=\""), zbd() <= 50 ? zbwj.zba(this) : zbwj.zba(zbf(0, 47)).concat("..."), "\">");
    }

    public abstract byte zba(int i11);

    abstract byte zbb(int i11);

    public abstract int zbd();

    protected abstract int zbe(int i11, int i12, int i13);

    public abstract zbtc zbf(int i11, int i12);

    abstract void zbg(zbst zbstVar) throws IOException;

    protected final int zbi() {
        return this.zba;
    }
}
