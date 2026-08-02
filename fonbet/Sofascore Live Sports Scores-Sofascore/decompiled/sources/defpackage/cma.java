package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cma {
    public static final ug5 g = new ug5();
    public final Context a;
    public final LinkedHashMap b;
    public int c;
    public final int d;
    public final LinkedHashSet e;
    public final LinkedHashSet f;

    public cma(Context context, LinkedHashMap linkedHashMap, int i, int i2, LinkedHashSet linkedHashSet) {
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        this.a = context;
        this.b = linkedHashMap;
        this.c = i;
        this.d = i2;
        this.e = linkedHashSet2;
        this.f = linkedHashSet;
    }

    public final int a(mk5 mk5Var) {
        una r = wba.r(mk5Var);
        synchronized (this) {
            Integer num = (Integer) this.b.get(r);
            if (num != null) {
                int intValue = num.intValue();
                this.e.add(Integer.valueOf(intValue));
                return intValue;
            }
            int i = this.c;
            while (this.f.contains(Integer.valueOf(i))) {
                i = (i + 1) % aoa.c;
                if (i == this.c) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.c = (i + 1) % aoa.c;
            this.e.add(Integer.valueOf(i));
            this.f.add(Integer.valueOf(i));
            this.b.put(r, Integer.valueOf(i));
            return i;
        }
    }

    public final Object b(we0 we0Var) {
        Object d = dz8.a.d(this.a, doa.b, ljg.j(this.d, "appWidgetLayout-"), new qa7(this, (rq3) null, 18), we0Var);
        return d == lu3.a ? d : Unit.a;
    }
}
