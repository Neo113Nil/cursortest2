package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class H {
    public static final a c = new a(null);
    private final AbstractC2731x0 a;
    private final Jg b;

    public static final class a {

        /* renamed from: com.ironsource.H$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0177a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[Ng.values().length];
                try {
                    iArr[Ng.BIDDER_SENSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Ng.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final H a(AbstractC2731x0 adUnitData, Jg waterfallInstances) {
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            int i = C0177a.a[(adUnitData.d() ? Ng.BIDDER_SENSITIVE : Ng.DEFAULT).ordinal()];
            if (i == 1) {
                return new C2573o3(adUnitData, waterfallInstances);
            }
            if (i == 2) {
                return adUnitData.q() ? new C2746xf(adUnitData, waterfallInstances) : new G4(adUnitData, waterfallInstances);
            }
            throw new NoWhenBranchMatchedException();
        }

        private a() {
        }
    }

    public static final class b {
        private final List<B> a = new ArrayList();
        private final List<B> b = new ArrayList();
        private final List<B> c = new ArrayList();
        private boolean d;

        public final List<B> a() {
            return this.a;
        }

        public final List<B> b() {
            return this.b;
        }

        public final List<B> c() {
            return this.c;
        }

        public final boolean d() {
            return this.d;
        }

        public final boolean e() {
            return g() == 0;
        }

        public final boolean f() {
            return this.a.isEmpty() && this.c.isEmpty();
        }

        public final int g() {
            return this.a.size() + this.b.size() + this.c.size();
        }

        public final void a(boolean z) {
            this.d = z;
        }
    }

    public static final class c {
        private final B a;
        private final List<B> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(B b, List<? extends B> orderedInstances) {
            Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
            this.a = b;
            this.b = orderedInstances;
        }

        public final B a() {
            return this.a;
        }

        public final List<B> b() {
            return this.b;
        }

        public final B c() {
            return this.a;
        }

        public final List<B> d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.a, cVar.a) && Intrinsics.areEqual(this.b, cVar.b);
        }

        public int hashCode() {
            B b = this.a;
            return ((b == null ? 0 : b.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            return "ShowSelection(instanceToShow=" + this.a + ", orderedInstances=" + this.b + ")";
        }

        public final c a(B b, List<? extends B> orderedInstances) {
            Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
            return new c(b, orderedInstances);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, B b, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                b = cVar.a;
            }
            if ((i & 2) != 0) {
                list = cVar.b;
            }
            return cVar.a(b, list);
        }
    }

    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((B) t).h().l()), Integer.valueOf(((B) t2).h().l()));
        }
    }

    public H(AbstractC2731x0 adUnitData, Jg waterfallInstances) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.a = adUnitData;
        this.b = waterfallInstances;
    }

    private final List<B> b() {
        return CollectionsKt.sortedWith(this.b.b(), new d());
    }

    public abstract void a(B b2, b bVar);

    protected boolean a(B instance, Jg waterfallInstances) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return false;
    }

    public final c c() {
        Object obj;
        List<B> b2 = b();
        Iterator<T> it = b2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((B) obj).x()) {
                break;
            }
        }
        return new c((B) obj, b2);
    }

    public final b d() {
        IronLog.INTERNAL.verbose(this.a.b().a().name() + " waterfall size: " + this.b.b().size());
        b bVar = new b();
        boolean l = Jb.u.d().h().l();
        Iterator<B> it = this.b.b().iterator();
        while (it.hasNext() && !a(it.next(), bVar, l)) {
        }
        return bVar;
    }

    public final boolean a(B instance) {
        Object obj;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Iterator<T> it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((B) obj).w()) {
                break;
            }
        }
        return Intrinsics.areEqual(obj, instance);
    }

    public final boolean a() {
        int i;
        List<B> b2 = this.b.b();
        if ((b2 instanceof Collection) && b2.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = b2.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((B) it.next()).x() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i >= this.a.k();
    }

    public boolean a(b loadSelection) {
        Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        return loadSelection.g() >= this.a.k();
    }

    private final boolean a(B b2, b bVar, boolean z) {
        if (b2.w()) {
            IronLog.INTERNAL.verbose(b2.d().name() + " - Instance " + b2.q() + " is failed to load");
        } else if (b2.x() && !b2.A()) {
            IronLog.INTERNAL.verbose(b2.d().name() + " - Instance " + b2.q() + " is already loaded");
            bVar.b().add(b2);
        } else if (b2.y()) {
            IronLog.INTERNAL.verbose(b2.d().name() + " - Instance " + b2.q() + " still loading");
            bVar.c().add(b2);
        } else if (a(b2, this.b) && !z) {
            IronLog.INTERNAL.verbose(b2.d().name() + " - Instance " + b2.q() + " is not better than already loaded instances");
        } else {
            a(b2, bVar);
        }
        return a(bVar);
    }
}
