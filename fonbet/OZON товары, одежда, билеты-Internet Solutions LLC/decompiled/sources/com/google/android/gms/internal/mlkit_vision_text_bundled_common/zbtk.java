package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
public abstract class zbtk extends zbst {
    private static final Logger zbb = Logger.getLogger(zbtk.class.getName());
    private static final boolean zbc = zbws.zbx();
    zbtl zba;

    private zbtk() {
        throw null;
    }

    public static int zbA(zbvm zbvmVar) {
        int zbo = zbvmVar.zbo();
        return zbD(zbo) + zbo;
    }

    static int zbB(zbvm zbvmVar, zbvx zbvxVar) {
        int zbj = ((zbsj) zbvmVar).zbj(zbvxVar);
        return zbD(zbj) + zbj;
    }

    public static int zbC(String str) {
        int length;
        try {
            length = zbwv.zbc(str);
        } catch (zbwu unused) {
            length = str.getBytes(zbuo.zba).length;
        }
        return zbD(length) + length;
    }

    public static int zbD(int i11) {
        return (352 - (Integer.numberOfLeadingZeros(i11) * 9)) >>> 6;
    }

    public static int zbE(long j11) {
        return (640 - (Long.numberOfLeadingZeros(j11) * 9)) >>> 6;
    }

    @Deprecated
    static int zbz(int i11, zbvm zbvmVar, zbvx zbvxVar) {
        int zbD = zbD(i11 << 3);
        return zbD + zbD + ((zbsj) zbvmVar).zbj(zbvxVar);
    }

    public final void zbF() {
        if (zba() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zbG(String str, zbwu zbwuVar) throws IOException {
        zbb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zbwuVar);
        byte[] bytes = str.getBytes(zbuo.zba);
        try {
            int length = bytes.length;
            zbw(length);
            zbn(bytes, 0, length);
        } catch (IndexOutOfBoundsException e11) {
            throw new zbti(e11);
        }
    }

    public abstract int zba();

    public abstract void zbb(byte b11) throws IOException;

    public abstract void zbd(int i11, boolean z11) throws IOException;

    abstract void zbe(byte[] bArr, int i11, int i12) throws IOException;

    public abstract void zbf(int i11, zbtc zbtcVar) throws IOException;

    public abstract void zbg(zbtc zbtcVar) throws IOException;

    public abstract void zbh(int i11, int i12) throws IOException;

    public abstract void zbi(int i11) throws IOException;

    public abstract void zbj(int i11, long j11) throws IOException;

    public abstract void zbk(long j11) throws IOException;

    public abstract void zbl(int i11, int i12) throws IOException;

    public abstract void zbm(int i11) throws IOException;

    public abstract void zbn(byte[] bArr, int i11, int i12) throws IOException;

    abstract void zbo(int i11, zbvm zbvmVar, zbvx zbvxVar) throws IOException;

    public abstract void zbp(zbvm zbvmVar) throws IOException;

    public abstract void zbq(int i11, zbvm zbvmVar) throws IOException;

    public abstract void zbr(int i11, zbtc zbtcVar) throws IOException;

    public abstract void zbs(int i11, String str) throws IOException;

    public abstract void zbt(String str) throws IOException;

    public abstract void zbu(int i11, int i12) throws IOException;

    public abstract void zbv(int i11, int i12) throws IOException;

    public abstract void zbw(int i11) throws IOException;

    public abstract void zbx(int i11, long j11) throws IOException;

    public abstract void zby(long j11) throws IOException;

    /* synthetic */ zbtk(zbtj zbtjVar) {
    }
}
