package com.fyber.inneractive.sdk.protobuf;

import defpackage.dmi;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.zzl;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class s implements Iterable, Serializable {
    public static final q b = new q(l1.b);
    public static final o c;
    public int a = 0;

    static {
        c = d.a() ? new r() : new m();
    }

    public static int a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            zzl.r(lnb.k(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            zzl.r(dmi.k(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        zzl.r(dmi.k(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public abstract int a(int i, int i2);

    public abstract void a(int i, byte[] bArr);

    public abstract void a(k kVar);

    public abstract byte c(int i);

    public abstract boolean c();

    public abstract byte d(int i);

    public abstract w d();

    public abstract s e(int i);

    public abstract String e();

    public final String f() {
        Charset charset = l1.a;
        return size() == 0 ? "" : e();
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int size = size();
            i = a(size, size);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = h3.a(this);
        } else {
            str = h3.a(e(47)) + "...";
        }
        return mz1.o(mz1.q(size, "<ByteString@", hexString, " size=", " contents=\""), str, "\">");
    }

    public static q a(String str) {
        return new q(str.getBytes(l1.a));
    }
}
