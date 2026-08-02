package defpackage;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class a6n {
    public static final w4n A;
    public static final w4n B;
    public static final sdp C;
    public static final w4n a = new w4n(Class.class, new hgp().nullSafe(), 0);
    public static final w4n b = new w4n(BitSet.class, new x4n().nullSafe(), 0);
    public static final k5n c;
    public static final z4n d;
    public static final z4n e;
    public static final z4n f;
    public static final z4n g;
    public static final w4n h;
    public static final w4n i;
    public static final w4n j;
    public static final nfp k;
    public static final qfp l;
    public static final tfp m;
    public static final z4n n;
    public static final agp o;
    public static final cgp p;
    public static final dgp q;
    public static final w4n r;
    public static final w4n s;
    public static final w4n t;
    public static final w4n u;
    public static final w4n v;
    public static final w4n w;
    public static final w4n x;
    public static final w4n y;
    public static final a5n z;

    static {
        h5n h5nVar = new h5n();
        c = new k5n();
        d = new z4n(Boolean.TYPE, Boolean.class, h5nVar);
        e = new z4n(Byte.TYPE, Byte.class, new n5n());
        f = new z4n(Short.TYPE, Short.class, new q5n());
        g = new z4n(Integer.TYPE, Integer.class, new s5n());
        h = new w4n(AtomicInteger.class, new t5n().nullSafe(), 0);
        i = new w4n(AtomicBoolean.class, new v5n().nullSafe(), 0);
        j = new w4n(AtomicIntegerArray.class, new lfp().nullSafe(), 0);
        k = new nfp();
        l = new qfp();
        m = new tfp();
        n = new z4n(Character.TYPE, Character.class, new vfp());
        yfp yfpVar = new yfp();
        o = new agp();
        p = new cgp();
        q = new dgp();
        r = new w4n(String.class, yfpVar, 0);
        s = new w4n(StringBuilder.class, new fgp(), 0);
        t = new w4n(StringBuffer.class, new jgp(), 0);
        u = new w4n(URL.class, new lgp(), 0);
        v = new w4n(URI.class, new ngp(), 0);
        w = new w4n(InetAddress.class, new pgp(), 1);
        x = new w4n(UUID.class, new q4n(), 0);
        y = new w4n(Currency.class, new t4n().nullSafe(), 0);
        z = new a5n(new f9p(new String[]{"year", "month", "dayOfMonth", "hourOfDay", "minute", "second"}), 0);
        A = new w4n(Locale.class, new u4n(), 0);
        B = new w4n(m9p.class, aep.a, 1);
        C = udp.d;
    }

    public static /* synthetic */ int a(long j2) {
        int i2 = (int) j2;
        if (i2 == j2) {
            return i2;
        }
        a70.p(x5n.m(j2, "Value out of range for int: ", new StringBuilder(String.valueOf(j2).length() + 28)));
        return 0;
    }
}
