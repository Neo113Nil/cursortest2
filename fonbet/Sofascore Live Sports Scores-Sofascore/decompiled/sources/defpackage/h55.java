package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h55 {
    public final g55 a;

    static {
        new h55("", 0, 0);
    }

    public h55(String str, int i, int i2) {
        this.a = new g55(str, i, i2);
    }

    public static h55 a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String sb;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            StringBuilder s = lnb.s(i8, i7, "M0,", " A", BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            me4.q(s, i8, " 0 1,1 ", i, BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            me4.q(s, i8, " A", i7, BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            sb = me4.i(s, i8, " 0 1,1 0,", i8, " Z");
        } else {
            StringBuilder sb2 = new StringBuilder("M ");
            int min = Math.min(i / 2, i2 / 2);
            int min2 = Math.min(min, i3);
            int min3 = Math.min(min, i4);
            int min4 = Math.min(min, i5);
            int min5 = Math.min(min, i6);
            sb2.append(min2);
            sb2.append(",0 L ");
            sb2.append(i - min3);
            sb2.append(",0");
            if (min3 > 0) {
                me4.r(sb2, " A ", min3, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, min3);
                me4.r(sb2, " 0 0,1 ", i, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, min3);
            }
            sb2.append(" L ");
            sb2.append(i);
            sb2.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            sb2.append(i2 - min4);
            if (min4 > 0) {
                me4.r(sb2, " A ", min4, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, min4);
                sb2.append(" 0 0,1 ");
                sb2.append(i - min4);
                sb2.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                sb2.append(i2);
            }
            me4.r(sb2, " L ", min5, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, i2);
            if (min5 > 0) {
                me4.r(sb2, " A ", min5, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, min5);
                sb2.append(" 0 0,1 0,");
                sb2.append(i2 - min5);
            }
            if (min2 > 0) {
                me4.r(sb2, " L 0,", min2, " A ", min2);
                me4.r(sb2, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, min2, " 0 0,1 ", min2);
                sb2.append(",0");
            }
            sb2.append(" Z");
            sb = sb2.toString();
        }
        return new h55(sb, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h55) {
            return this.a.equals(((h55) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
