package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.math.BigInteger;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hok implements Comparable {
    public static final hok f;
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final mqi e = ypa.b(new ndk(this, 2));

    static {
        new hok(0, 0, 0, "");
        f = new hok(0, 1, 0, "");
        new hok(1, 0, 0, "");
    }

    public hok(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        hok hokVar = (hok) obj;
        hokVar.getClass();
        Object value = this.e.getValue();
        value.getClass();
        Object value2 = hokVar.e.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hok)) {
            return false;
        }
        hok hokVar = (hok) obj;
        return this.a == hokVar.a && this.b == hokVar.b && this.c == hokVar.c;
    }

    public final int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.a) * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        String str = this.d;
        String q = !StringsKt.R(str) ? dmi.q("-", str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        return fc6.h(this.c, q, sb);
    }
}
