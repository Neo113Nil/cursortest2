package com.google.android.gms.internal.consent_sdk;

import defpackage.d6p;
import defpackage.f6p;
import defpackage.g6p;
import defpackage.muo;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzpv extends zzpe {
    public static final Logger b = Logger.getLogger(zzpv.class.getName());
    public static final boolean c = d6p.e;
    public muo a;

    private zzpv() {
        throw null;
    }

    public static int b(String str) {
        int length;
        try {
            length = g6p.b(str);
        } catch (f6p unused) {
            length = str.getBytes(zzqs.a).length;
        }
        return c(length) + length;
    }

    public static int c(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int d(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void e(String str, f6p f6pVar) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) f6pVar);
        byte[] bytes = str.getBytes(zzqs.a);
        try {
            int length = bytes.length;
            x(length);
            a(length, bytes);
        } catch (IndexOutOfBoundsException e) {
            throw new zzps(e);
        }
    }

    public abstract void f(byte b2);

    public abstract void g(int i, boolean z);

    public abstract void h(int i, byte[] bArr);

    public abstract void i(int i, zzpm zzpmVar);

    public abstract void j(zzpm zzpmVar);

    public abstract void k(int i, int i2);

    public abstract void l(int i);

    public abstract void m(int i, long j);

    public abstract void n(long j);

    public abstract void o(int i, int i2);

    public abstract void p(int i);

    public abstract void q(zzrq zzrqVar);

    public abstract void r(int i, zzrq zzrqVar);

    public abstract void s(int i, zzpm zzpmVar);

    public abstract void t(int i, String str);

    public abstract void u(String str);

    public abstract void v(int i, int i2);

    public abstract void w(int i, int i2);

    public abstract void x(int i);

    public abstract void y(int i, long j);

    public abstract void z(long j);
}
