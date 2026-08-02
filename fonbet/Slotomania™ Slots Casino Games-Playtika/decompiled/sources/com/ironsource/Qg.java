package com.ironsource;

import com.ironsource.AbstractC2483j3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Qg<Smash extends AbstractC2483j3<?>> {
    private final W a;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((AbstractC2483j3) t).i().l()), Integer.valueOf(((AbstractC2483j3) t2).i().l()));
        }
    }

    public Qg(W managerData) {
        Intrinsics.checkNotNullParameter(managerData, "managerData");
        this.a = managerData;
    }

    public final boolean a(AbstractC2483j3<?> smash, List<? extends Smash> waterfall) {
        Object obj;
        Intrinsics.checkNotNullParameter(smash, "smash");
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((AbstractC2483j3) obj).x()) {
                break;
            }
        }
        return Intrinsics.areEqual(obj, smash);
    }

    public final List<Smash> b(List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        return CollectionsKt.sortedWith(waterfall, new a());
    }

    public final Smash c(List<? extends Smash> waterfall) {
        Object obj;
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AbstractC2483j3) obj).B()) {
                break;
            }
        }
        return (Smash) obj;
    }

    public final Rg<Smash> d(List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        IronLog.INTERNAL.verbose(this.a.b().name() + " waterfall size: " + waterfall.size());
        Wg a2 = Wg.g.a(this.a.c() ? Ng.BIDDER_SENSITIVE : Ng.DEFAULT, this.a.i(), this.a.m(), waterfall);
        Iterator<? extends Smash> it = waterfall.iterator();
        while (it.hasNext()) {
            a2.d(it.next());
            if (a2.e()) {
                return new Rg<>(a2);
            }
        }
        return new Rg<>(a2);
    }

    public final boolean a(List<? extends Smash> waterfall) {
        int i;
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        if ((waterfall instanceof Collection) && waterfall.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = waterfall.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((AbstractC2483j3) it.next()).y() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i >= this.a.i();
    }
}
