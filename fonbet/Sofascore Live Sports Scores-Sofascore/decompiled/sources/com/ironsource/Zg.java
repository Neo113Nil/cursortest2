package com.ironsource;

import com.ironsource.AbstractC4085g3;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Zg<Smash extends AbstractC4085g3<?>> {

    @NotNull
    public static final a g = new a(null);
    private final int a;
    private final boolean b;

    @NotNull
    private final List<Smash> c;

    @NotNull
    private final List<Smash> d;

    @NotNull
    private final List<Smash> e;

    @NotNull
    private final List<Smash> f;

    /* JADX WARN: Multi-variable type inference failed */
    public Zg(int i, boolean z, @NotNull List<? extends Smash> list) {
        list.getClass();
        this.a = i;
        this.b = z;
        this.c = list;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    private final int a(Smash smash) {
        return smash.i().l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int b() {
        Integer num;
        List<Smash> list = this.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC4085g3) obj).y()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(a((AbstractC4085g3) it.next()));
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(a((AbstractC4085g3) it.next()));
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

    @NotNull
    public final List<Smash> c() {
        return this.d;
    }

    public abstract void c(@NotNull Smash smash);

    public final void d(@NotNull Smash smash) {
        smash.getClass();
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

    public boolean e() {
        return d() >= this.a;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.Zg$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0196a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[Qg.values().length];
                try {
                    iArr[Qg.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Qg.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <Smash extends AbstractC4085g3<?>> Zg<Smash> a(@NotNull Qg qg, int i, boolean z, @NotNull List<? extends Smash> list) {
            qg.getClass();
            list.getClass();
            int i2 = C0196a.a[qg.ordinal()];
            if (i2 == 1) {
                return new F4(i, z, list);
            }
            if (i2 == 2) {
                return new C4192m3(i, z, list, false, 8, null);
            }
            zzl.b();
            return null;
        }

        private a() {
        }
    }

    @NotNull
    public final List<Smash> a() {
        return this.f;
    }

    private final boolean b(Smash smash) {
        return b() < a(smash);
    }

    public final int d() {
        return this.f.size() + this.e.size() + this.d.size();
    }
}
