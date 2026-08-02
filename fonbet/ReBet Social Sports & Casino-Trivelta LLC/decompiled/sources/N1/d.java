package N1;

import H1.C1181n;
import e1.J;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public long f7874b;
    private long[] keyFrameTagPositions;
    private long[] keyFrameTimesUs;

    public d() {
        super(new C1181n());
        this.f7874b = -9223372036854775807L;
        this.keyFrameTimesUs = new long[0];
        this.keyFrameTagPositions = new long[0];
    }

    public static Boolean g(J j10) {
        return Boolean.valueOf(j10.M() == 1);
    }

    public static Object h(J j10, int i10) {
        if (i10 == 0) {
            return j(j10);
        }
        if (i10 == 1) {
            return g(j10);
        }
        if (i10 == 2) {
            return n(j10);
        }
        if (i10 == 3) {
            return l(j10);
        }
        if (i10 == 8) {
            return k(j10);
        }
        if (i10 == 10) {
            return m(j10);
        }
        if (i10 != 11) {
            return null;
        }
        return i(j10);
    }

    public static Date i(J j10) {
        Date date = new Date((long) j(j10).doubleValue());
        j10.c0(2);
        return date;
    }

    public static Double j(J j10) {
        return Double.valueOf(Double.longBitsToDouble(j10.F()));
    }

    public static HashMap k(J j10) {
        int Q10 = j10.Q();
        HashMap hashMap = new HashMap(Q10);
        for (int i10 = 0; i10 < Q10; i10++) {
            String n10 = n(j10);
            Object h10 = h(j10, o(j10));
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
        return hashMap;
    }

    public static HashMap l(J j10) {
        HashMap hashMap = new HashMap();
        while (true) {
            String n10 = n(j10);
            int o10 = o(j10);
            if (o10 == 9) {
                return hashMap;
            }
            Object h10 = h(j10, o10);
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
    }

    public static ArrayList m(J j10) {
        int Q10 = j10.Q();
        ArrayList arrayList = new ArrayList(Q10);
        for (int i10 = 0; i10 < Q10; i10++) {
            Object h10 = h(j10, o(j10));
            if (h10 != null) {
                arrayList.add(h10);
            }
        }
        return arrayList;
    }

    public static String n(J j10) {
        int U10 = j10.U();
        int g10 = j10.g();
        j10.c0(U10);
        return new String(j10.f(), g10, U10);
    }

    public static int o(J j10) {
        return j10.M();
    }

    @Override // N1.e
    public boolean b(J j10) {
        return true;
    }

    @Override // N1.e
    public boolean c(J j10, long j11) {
        if (o(j10) != 2 || !"onMetaData".equals(n(j10)) || j10.a() == 0 || o(j10) != 8) {
            return false;
        }
        HashMap k10 = k(j10);
        Object obj = k10.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f7874b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k10.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.keyFrameTimesUs = new long[size];
                this.keyFrameTagPositions = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.keyFrameTimesUs = new long[0];
                        this.keyFrameTagPositions = new long[0];
                        break;
                    }
                    this.keyFrameTimesUs[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.keyFrameTagPositions[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f7874b;
    }

    public long[] e() {
        return this.keyFrameTagPositions;
    }

    public long[] f() {
        return this.keyFrameTimesUs;
    }
}
