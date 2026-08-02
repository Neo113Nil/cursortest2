package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class s implements e {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Map.Entry f17440c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile Map.Entry f17441d;

    /* renamed from: a, reason: collision with root package name */
    public final j$.time.x f17442a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17443b;

    public m a(v vVar) {
        Set<String> set = j$.time.zone.i.f17600d;
        int size = set.size();
        Map.Entry entry = vVar.f17459b ? f17440c : f17441d;
        if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    entry = vVar.f17459b ? f17440c : f17441d;
                    if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                        Integer valueOf = Integer.valueOf(size);
                        m mVar = vVar.f17459b ? new m("", null, null) : new l("", null, null);
                        for (String str : set) {
                            mVar.a(str, str);
                        }
                        entry = new AbstractMap.SimpleImmutableEntry(valueOf, mVar);
                        if (vVar.f17459b) {
                            f17440c = entry;
                        } else {
                            f17441d = entry;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (m) entry.getValue();
    }

    public s(j$.time.x xVar, String str) {
        this.f17442a = xVar;
        this.f17443b = str;
    }

    @Override // j$.time.format.e
    public boolean i(y yVar, StringBuilder sb2) {
        ZoneId zoneId = (ZoneId) yVar.b(this.f17442a);
        if (zoneId == null) {
            return false;
        }
        sb2.append(zoneId.getId());
        return true;
    }

    @Override // j$.time.format.e
    public final int j(v vVar, CharSequence charSequence, int i5) {
        int i10;
        int length = charSequence.length();
        if (i5 > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i5 == length) {
            return ~i5;
        }
        char charAt = charSequence.charAt(i5);
        if (charAt == '+' || charAt == '-') {
            return b(vVar, charSequence, i5, i5, j.f17413e);
        }
        int i11 = i5 + 2;
        if (length >= i11) {
            char charAt2 = charSequence.charAt(i5 + 1);
            if (vVar.a(charAt, 'U') && vVar.a(charAt2, 'T')) {
                int i12 = i5 + 3;
                if (length >= i12 && vVar.a(charSequence.charAt(i11), 'C')) {
                    return b(vVar, charSequence, i5, i12, j.f17414f);
                }
                return b(vVar, charSequence, i5, i11, j.f17414f);
            }
            if (vVar.a(charAt, 'G') && length >= (i10 = i5 + 3) && vVar.a(charAt2, 'M') && vVar.a(charSequence.charAt(i11), 'T')) {
                int i13 = i5 + 4;
                if (length >= i13 && vVar.a(charSequence.charAt(i10), '0')) {
                    vVar.e(ZoneId.R("GMT0", true));
                    return i13;
                }
                return b(vVar, charSequence, i5, i10, j.f17414f);
            }
        }
        m a7 = a(vVar);
        ParsePosition parsePosition = new ParsePosition(i5);
        String c2 = a7.c(charSequence, parsePosition);
        if (c2 == null) {
            if (!vVar.a(charAt, 'Z')) {
                return ~i5;
            }
            vVar.e(ZoneOffset.UTC);
            return i5 + 1;
        }
        vVar.e(ZoneId.R(c2, true));
        return parsePosition.getIndex();
    }

    public static int b(v vVar, CharSequence charSequence, int i5, int i10, j jVar) {
        String upperCase = charSequence.subSequence(i5, i10).toString().toUpperCase();
        if (i10 >= charSequence.length()) {
            vVar.e(ZoneId.R(upperCase, true));
            return i10;
        }
        if (charSequence.charAt(i10) != '0' && !vVar.a(charSequence.charAt(i10), 'Z')) {
            v vVar2 = new v(vVar.f17458a);
            vVar2.f17459b = vVar.f17459b;
            vVar2.f17460c = vVar.f17460c;
            int j = jVar.j(vVar2, charSequence, i10);
            try {
                if (j < 0) {
                    if (jVar == j.f17413e) {
                        return ~i5;
                    }
                    vVar.e(ZoneId.R(upperCase, true));
                    return i10;
                }
                vVar.e(ZoneId.S(upperCase, ZoneOffset.X((int) vVar2.d(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return j;
            } catch (j$.time.b unused) {
                return ~i5;
            }
        }
        vVar.e(ZoneId.R(upperCase, true));
        return i10;
    }

    public final String toString() {
        return this.f17443b;
    }
}
