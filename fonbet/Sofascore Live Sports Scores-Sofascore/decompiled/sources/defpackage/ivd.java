package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ivd {
    public static final uxf e = new uxf(29);
    public final Object a;
    public final hvd b;
    public final String c;
    public volatile byte[] d;

    public ivd(String str, Object obj, hvd hvdVar) {
        if (TextUtils.isEmpty(str)) {
            a70.p("Must not be null or empty");
            throw null;
        }
        this.c = str;
        this.a = obj;
        this.b = hvdVar;
    }

    public static ivd a(Object obj, String str) {
        return new ivd(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ivd) {
            return this.c.equals(((ivd) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return mz1.o(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
