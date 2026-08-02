package androidx.health.connect.client.aggregate;

import androidx.health.connect.client.aggregate.AggregateMetric;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.izi0;
import xsna.luk;
import xsna.pn00;
import xsna.ur;
import xsna.v11;

/* compiled from: AggregationResult.kt */
/* loaded from: classes12.dex */
public final class c {
    public final Map<String, Long> a;
    public final Map<String, Double> b;
    public final Set<luk> c;

    public c(Map<String, Long> map, Map<String, Double> map2, Set<luk> set) {
        this.a = map;
        this.b = map2;
        this.c = set;
    }

    public final <T> T a(AggregateMetric<? extends T> aggregateMetric) {
        AggregateMetric.b<?, ? extends T> bVar = aggregateMetric.a;
        if (bVar instanceof AggregateMetric.b.InterfaceC0035b) {
            Long l = this.a.get(aggregateMetric.a());
            if (l != null) {
                return bVar.invoke(l);
            }
            return null;
        }
        if (!(bVar instanceof AggregateMetric.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Double d = this.b.get(aggregateMetric.a());
        if (d != null) {
            return bVar.invoke(d);
        }
        return null;
    }

    public final Set<luk> b() {
        return this.c;
    }

    public final c c(c cVar) {
        return new c(pn00.n(this.a, cVar.a), pn00.n(this.b, cVar.b), izi0.j(this.c, cVar.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        c cVar = (c) obj;
        return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + v11.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregationResult(longValues=");
        sb.append(this.a);
        sb.append(", doubleValues=");
        sb.append(this.b);
        sb.append(", dataOrigins=");
        return ur.c(sb, this.c, ')');
    }
}
