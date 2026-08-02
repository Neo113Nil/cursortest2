package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n58 implements m58 {
    public final String a;
    public final int b;

    public n58(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean a() {
        if (this.b != 0) {
            String trim = d().trim();
            if (ki3.e.matcher(trim).matches()) {
                return true;
            }
            if (!ki3.f.matcher(trim).matches()) {
                a70.p(lnb.o("[Value: ", trim, "] cannot be converted to a boolean."));
                return false;
            }
        }
        return false;
    }

    public final double b() {
        if (this.b == 0) {
            return 0.0d;
        }
        String trim = d().trim();
        try {
            return Double.valueOf(trim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(lnb.o("[Value: ", trim, "] cannot be converted to a double."), e);
        }
    }

    public final long c() {
        if (this.b == 0) {
            return 0L;
        }
        String trim = d().trim();
        try {
            return Long.valueOf(trim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(lnb.o("[Value: ", trim, "] cannot be converted to a long."), e);
        }
    }

    public final String d() {
        return this.b == 0 ? "" : this.a;
    }
}
