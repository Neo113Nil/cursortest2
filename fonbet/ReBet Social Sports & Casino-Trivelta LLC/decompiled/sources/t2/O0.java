package t2;

import W1.c;
import b1.C2334C;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class O0 implements c1.x {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.common.collect.G f65117a;

    /* renamed from: b, reason: collision with root package name */
    public final float f65118b;

    public O0(C2334C c2334c) {
        float e10 = e(c2334c);
        float f10 = e10 == -3.4028235E38f ? 1.0f : e10 / 30.0f;
        this.f65118b = f10;
        this.f65117a = c(c2334c, f10);
    }

    public static com.google.common.collect.G c(C2334C c2334c, float f10) {
        AbstractC3445z d10 = d(c2334c);
        if (d10.isEmpty()) {
            return com.google.common.collect.G.H();
        }
        TreeMap treeMap = new TreeMap();
        for (int i10 = 0; i10 < d10.size(); i10++) {
            treeMap.put(Long.valueOf(e1.Z.a1(((c.a) d10.get(i10)).f12970a)), Float.valueOf(f10 / r3.f12972c));
        }
        for (int i11 = 0; i11 < d10.size(); i11++) {
            c.a aVar = (c.a) d10.get(i11);
            if (!treeMap.containsKey(Long.valueOf(e1.Z.a1(aVar.f12971b)))) {
                treeMap.put(Long.valueOf(e1.Z.a1(aVar.f12971b)), Float.valueOf(f10));
            }
        }
        return com.google.common.collect.G.v(treeMap);
    }

    public static AbstractC3445z d(C2334C c2334c) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c2334c.e(); i10++) {
            C2334C.a d10 = c2334c.d(i10);
            if (d10 instanceof W1.c) {
                arrayList.addAll(((W1.c) d10).f12968a);
            }
        }
        return AbstractC3445z.E(c.a.f12969d, arrayList);
    }

    public static float e(C2334C c2334c) {
        for (int i10 = 0; i10 < c2334c.e(); i10++) {
            C2334C.a d10 = c2334c.d(i10);
            if (d10 instanceof W1.d) {
                return ((W1.d) d10).f12973a;
            }
        }
        return -3.4028235E38f;
    }

    @Override // c1.x
    public float a(long j10) {
        AbstractC4134a.a(j10 >= 0);
        Map.Entry floorEntry = this.f65117a.floorEntry(Long.valueOf(j10));
        return floorEntry != null ? ((Float) floorEntry.getValue()).floatValue() : this.f65118b;
    }

    @Override // c1.x
    public long b(long j10) {
        AbstractC4134a.a(j10 >= 0);
        Long l10 = (Long) this.f65117a.higherKey(Long.valueOf(j10));
        if (l10 != null) {
            return l10.longValue();
        }
        return -9223372036854775807L;
    }
}
