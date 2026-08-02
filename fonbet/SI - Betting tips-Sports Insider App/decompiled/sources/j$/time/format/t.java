package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class t extends s {

    /* renamed from: i, reason: collision with root package name */
    public static final ConcurrentHashMap f17444i = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final g0 f17445e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17446f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f17447g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f17448h;

    public t(g0 g0Var, boolean z5) {
        super(j$.time.temporal.q.f17534e, "ZoneText(" + g0Var + ")");
        this.f17447g = new HashMap();
        this.f17448h = new HashMap();
        this.f17445e = (g0) Objects.requireNonNull(g0Var, "textStyle");
        this.f17446f = z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
    @Override // j$.time.format.s, j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(y yVar, StringBuilder sb2) {
        boolean z5;
        g0 g0Var;
        g0 g0Var2;
        String[] strArr;
        ZoneId zoneId = (ZoneId) yVar.b(j$.time.temporal.q.f17530a);
        if (zoneId == null) {
            return false;
        }
        String id2 = zoneId.getId();
        if (!(zoneId instanceof ZoneOffset)) {
            TemporalAccessor temporalAccessor = yVar.f17467a;
            String str = null;
            Map map = null;
            if (!this.f17446f) {
                if (temporalAccessor.e(j$.time.temporal.a.INSTANT_SECONDS)) {
                    z5 = zoneId.Q().g(Instant.Q(temporalAccessor));
                } else {
                    j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                    if (temporalAccessor.e(aVar)) {
                        j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                        if (temporalAccessor.e(aVar2)) {
                            LocalDateTime S = LocalDateTime.S(j$.time.g.a0(temporalAccessor.C(aVar)), j$.time.j.U(temporalAccessor.C(aVar2)));
                            Object e7 = zoneId.Q().e(S);
                            if ((e7 instanceof j$.time.zone.b ? (j$.time.zone.b) e7 : null) == null) {
                                z5 = zoneId.Q().g(Instant.R(j$.com.android.tools.r8.a.x(ZonedDateTime.P(S, zoneId, null)), r0.f17299a.f17288b.f17485d));
                            }
                        }
                    }
                }
                Locale locale = yVar.f17468b.f17369b;
                g0Var = g0.NARROW;
                g0Var2 = this.f17445e;
                if (g0Var2 != g0Var) {
                    ConcurrentHashMap concurrentHashMap = f17444i;
                    SoftReference softReference = (SoftReference) concurrentHashMap.get(id2);
                    if (softReference == null || (map = (Map) softReference.get()) == null || (strArr = (String[]) map.get(locale)) == null) {
                        TimeZone timeZone = TimeZone.getTimeZone(id2);
                        String[] strArr2 = {id2, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), id2, id2};
                        if (map == null) {
                            map = new ConcurrentHashMap();
                        }
                        map.put(locale, strArr2);
                        concurrentHashMap.put(id2, new SoftReference(map));
                        strArr = strArr2;
                    }
                    str = z5 ? !z5 ? strArr[g0Var2.f17396a + 5] : strArr[g0Var2.f17396a + 3] : strArr[g0Var2.f17396a + 1];
                }
                if (str != null) {
                    id2 = str;
                }
            }
            z5 = 2;
            Locale locale2 = yVar.f17468b.f17369b;
            g0Var = g0.NARROW;
            g0Var2 = this.f17445e;
            if (g0Var2 != g0Var) {
            }
            if (str != null) {
            }
        }
        sb2.append(id2);
        return true;
    }

    @Override // j$.time.format.s
    public final m a(v vVar) {
        m mVar;
        if (this.f17445e == g0.NARROW) {
            return super.a(vVar);
        }
        Locale locale = vVar.f17458a.f17369b;
        boolean z5 = vVar.f17459b;
        Set set = j$.time.zone.i.f17600d;
        int size = set.size();
        Map map = z5 ? this.f17447g : this.f17448h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (mVar = (m) ((SoftReference) entry.getValue()).get()) != null) {
            return mVar;
        }
        m mVar2 = vVar.f17459b ? new m("", null, null) : new l("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                mVar2.a(str, str);
                HashMap hashMap = (HashMap) h0.f17402d;
                String str2 = (String) hashMap.get(str);
                if (str2 == null) {
                    HashMap hashMap2 = (HashMap) h0.f17405g;
                    if (hashMap2.containsKey(str)) {
                        str = (String) hashMap2.get(str);
                        str2 = (String) hashMap.get(str);
                    }
                }
                if (str2 != null) {
                    Map map2 = (Map) ((HashMap) h0.f17404f).get(str2);
                    str = (map2 == null || !map2.containsKey(locale.getCountry())) ? (String) ((HashMap) h0.f17403e).get(str2) : (String) map2.get(locale.getCountry());
                }
                HashMap hashMap3 = (HashMap) h0.f17405g;
                if (hashMap3.containsKey(str)) {
                    str = (String) hashMap3.get(str);
                }
                for (int i5 = this.f17445e == g0.FULL ? 1 : 2; i5 < strArr.length; i5 += 2) {
                    mVar2.a(strArr[i5], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(mVar2)));
        return mVar2;
    }
}
