package j$.time.format;

import j$.time.ZoneId;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final DateTimeFormatter f17458a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17459b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17460c = true;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f17461d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f17462e;

    public v(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f17461d = arrayList;
        this.f17462e = null;
        this.f17458a = dateTimeFormatter;
        arrayList.add(new d0());
    }

    public final boolean a(char c2, char c8) {
        if (this.f17459b) {
            return c2 == c8;
        }
        return b(c2, c8);
    }

    public final boolean g(CharSequence charSequence, int i5, CharSequence charSequence2, int i10, int i11) {
        if (i5 + i11 <= charSequence.length() && i10 + i11 <= charSequence2.length()) {
            if (this.f17459b) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (charSequence.charAt(i5 + i12) == charSequence2.charAt(i10 + i12)) {
                    }
                }
                return true;
            }
            for (int i13 = 0; i13 < i11; i13++) {
                char charAt = charSequence.charAt(i5 + i13);
                char charAt2 = charSequence2.charAt(i10 + i13);
                if (charAt == charAt2 || Character.toUpperCase(charAt) == Character.toUpperCase(charAt2) || Character.toLowerCase(charAt) == Character.toLowerCase(charAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(char c2, char c8) {
        return c2 == c8 || Character.toUpperCase(c2) == Character.toUpperCase(c8) || Character.toLowerCase(c2) == Character.toLowerCase(c8);
    }

    public final d0 c() {
        return (d0) this.f17461d.get(r0.size() - 1);
    }

    public final Long d(j$.time.temporal.a aVar) {
        return (Long) ((HashMap) c().f17384a).get(aVar);
    }

    public final int f(j$.time.temporal.p pVar, long j, int i5, int i10) {
        Objects.requireNonNull(pVar, "field");
        Long l6 = (Long) ((HashMap) c().f17384a).put(pVar, Long.valueOf(j));
        return (l6 == null || l6.longValue() == j) ? i10 : ~i5;
    }

    public final void e(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        c().f17385b = zoneId;
    }

    public final String toString() {
        return c().toString();
    }
}
