package com.ironsource;

import com.ironsource.AbstractC4085g3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Tg<Smash extends AbstractC4085g3<?>> {

    @NotNull
    private final W a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Integer.valueOf(((AbstractC4085g3) t).i().l()).compareTo(Integer.valueOf(((AbstractC4085g3) t2).i().l()));
        }
    }

    public Tg(@NotNull W w) {
        w.getClass();
        this.a = w;
    }

    public final boolean a(@NotNull List<? extends Smash> list) {
        int i;
        list.getClass();
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((AbstractC4085g3) it.next()).y() && (i = i + 1) < 0) {
                    kotlin.collections.b.p();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        return i >= this.a.i();
    }

    @NotNull
    public final List<Smash> b(@NotNull List<? extends Smash> list) {
        list.getClass();
        return CollectionsKt.H0(list, new a());
    }

    @Nullable
    public final Smash c(@NotNull List<? extends Smash> list) {
        Object obj;
        list.getClass();
        Iterator<T> it = b(list).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AbstractC4085g3) obj).B()) {
                break;
            }
        }
        return (Smash) obj;
    }

    @NotNull
    public final Ug<Smash> d(@NotNull List<? extends Smash> list) {
        list.getClass();
        IronLog.INTERNAL.verbose(this.a.b().name() + " waterfall size: " + list.size());
        Zg a2 = Zg.g.a(this.a.c() ? Qg.BIDDER_SENSITIVE : Qg.DEFAULT, this.a.i(), this.a.m(), list);
        Iterator<? extends Smash> it = list.iterator();
        while (it.hasNext()) {
            a2.d(it.next());
            if (a2.e()) {
                return new Ug<>(a2);
            }
        }
        return new Ug<>(a2);
    }

    public final boolean a(@NotNull AbstractC4085g3<?> abstractC4085g3, @NotNull List<? extends Smash> list) {
        Object obj;
        abstractC4085g3.getClass();
        list.getClass();
        Iterator<T> it = b(list).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((AbstractC4085g3) obj).x()) {
                break;
            }
        }
        return Intrinsics.c(obj, abstractC4085g3);
    }
}
