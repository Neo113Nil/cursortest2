package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class H {

    @NotNull
    public static final a c = new a(null);

    @NotNull
    private final AbstractC4386x0 a;

    @NotNull
    private final Mg b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Integer.valueOf(((B) t).h().l()).compareTo(Integer.valueOf(((B) t2).h().l()));
        }
    }

    public H(@NotNull AbstractC4386x0 abstractC4386x0, @NotNull Mg mg) {
        abstractC4386x0.getClass();
        mg.getClass();
        this.a = abstractC4386x0;
        this.b = mg;
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
        } else if (!a(b2, this.b) || z) {
            a(b2, bVar);
        } else {
            IronLog.INTERNAL.verbose(b2.d().name() + " - Instance " + b2.q() + " is not better than already loaded instances");
        }
        return a(bVar);
    }

    private final List<B> b() {
        return CollectionsKt.H0(this.b.b(), new d());
    }

    public abstract void a(@NotNull B b2, @NotNull b bVar);

    @NotNull
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

    @NotNull
    public final b d() {
        IronLog.INTERNAL.verbose(this.a.b().a().name() + " waterfall size: " + this.b.b().size());
        b bVar = new b();
        boolean m = Ib.v.d().h().m();
        Iterator<B> it = this.b.b().iterator();
        while (it.hasNext() && !a(it.next(), bVar, m)) {
        }
        return bVar;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {

        @NotNull
        private final List<B> a = new ArrayList();

        @NotNull
        private final List<B> b = new ArrayList();

        @NotNull
        private final List<B> c = new ArrayList();
        private boolean d;

        @NotNull
        public final List<B> a() {
            return this.a;
        }

        @NotNull
        public final List<B> b() {
            return this.b;
        }

        @NotNull
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
            return this.c.size() + this.b.size() + this.a.size();
        }

        public final void a(boolean z) {
            this.d = z;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.H$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0183a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[Qg.values().length];
                try {
                    iArr[Qg.BIDDER_SENSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Qg.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final H a(@NotNull AbstractC4386x0 abstractC4386x0, @NotNull Mg mg) {
            abstractC4386x0.getClass();
            mg.getClass();
            int i = C0183a.a[(abstractC4386x0.d() ? Qg.BIDDER_SENSITIVE : Qg.DEFAULT).ordinal()];
            if (i == 1) {
                return new C4174l3(abstractC4386x0, mg);
            }
            if (i == 2) {
                return abstractC4386x0.q() ? new C4365vf(abstractC4386x0, mg) : new D4(abstractC4386x0, mg);
            }
            zzl.b();
            return null;
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c {

        @Nullable
        private final B a;

        @NotNull
        private final List<B> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@Nullable B b, @NotNull List<? extends B> list) {
            list.getClass();
            this.a = b;
            this.b = list;
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

        @NotNull
        public final List<B> b() {
            return this.b;
        }

        @Nullable
        public final B c() {
            return this.a;
        }

        @NotNull
        public final List<B> d() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.c(this.a, cVar.a) && Intrinsics.c(this.b, cVar.b);
        }

        public int hashCode() {
            B b = this.a;
            return this.b.hashCode() + ((b == null ? 0 : b.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "ShowSelection(instanceToShow=" + this.a + ", orderedInstances=" + this.b + ")";
        }

        @NotNull
        public final c a(@Nullable B b, @NotNull List<? extends B> list) {
            list.getClass();
            return new c(b, list);
        }

        @Nullable
        public final B a() {
            return this.a;
        }
    }

    public boolean a(@NotNull B b2, @NotNull Mg mg) {
        b2.getClass();
        mg.getClass();
        return false;
    }

    public final boolean a(@NotNull B b2) {
        Object obj;
        b2.getClass();
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
        return Intrinsics.c(obj, b2);
    }

    public final boolean a() {
        int i;
        List<B> b2 = this.b.b();
        if (b2 == null || !b2.isEmpty()) {
            Iterator<T> it = b2.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((B) it.next()).x() && (i = i + 1) < 0) {
                    kotlin.collections.b.p();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        return i >= this.a.k();
    }

    public boolean a(@NotNull b bVar) {
        bVar.getClass();
        return bVar.g() >= this.a.k();
    }
}
