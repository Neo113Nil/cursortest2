package com.ironsource;

import com.ironsource.AbstractC4379j3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.zcl;

/* loaded from: classes13.dex */
public abstract class ch<Smash extends AbstractC4379j3<?>> {
    public static final a g = new a(null);
    private final int a;
    private final boolean b;
    private final List<Smash> c;
    private final List<Smash> d = new ArrayList();
    private final List<Smash> e = new ArrayList();
    private final List<Smash> f = new ArrayList();

    public static final class a {

        /* renamed from: com.ironsource.ch$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0215a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[Tg.values().length];
                try {
                    iArr[Tg.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Tg.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final <Smash extends AbstractC4379j3<?>> ch<Smash> a(Tg tg, int i, boolean z, List<? extends Smash> list) {
            int i2 = C0215a.a[tg.ordinal()];
            if (i2 == 1) {
                return new I4(i, z, list);
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return new C4487p3(i, z, list, false, 8, null);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ch(int i, boolean z, List<? extends Smash> list) {
        this.a = i;
        this.b = z;
        this.c = list;
    }

    private final boolean b(Smash smash) {
        return b() < a(smash);
    }

    public final List<Smash> a() {
        return this.f;
    }

    public final List<Smash> c() {
        return this.d;
    }

    public abstract void c(Smash smash);

    public final int d() {
        return this.f.size() + this.e.size() + this.d.size();
    }

    public boolean e() {
        return d() >= this.a;
    }

    private final int a(Smash smash) {
        return smash.i().l();
    }

    public final void d(Smash smash) {
        if (smash.x()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - smash " + smash.k() + " is failed to load");
            return;
        }
        if (smash.y()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is already loaded");
            this.e.add(smash);
            return;
        }
        if (smash.z()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " still loading");
            this.f.add(smash);
            return;
        }
        if (smash.A().get()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " marked as loading candidate");
            this.f.add(smash);
            return;
        }
        if (!this.b || !b(smash)) {
            c(smash);
            return;
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is not better than already loaded smashes");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int b() {
        Integer num;
        List<Smash> list = this.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC4379j3) obj).y()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(a((AbstractC4379j3) it.next()));
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(a((AbstractC4379j3) it.next()));
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
