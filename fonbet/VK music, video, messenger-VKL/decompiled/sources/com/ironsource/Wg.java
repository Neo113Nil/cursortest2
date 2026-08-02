package com.ironsource;

import com.ironsource.AbstractC4379j3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import xsna.e43;
import xsna.epx;
import xsna.j5g;
import xsna.jw5;

/* loaded from: classes13.dex */
public final class Wg<Smash extends AbstractC4379j3<?>> {
    private final W a;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((AbstractC4379j3) t).i().l()), Integer.valueOf(((AbstractC4379j3) t2).i().l()));
        }
    }

    public Wg(W w) {
        this.a = w;
    }

    public final boolean a(AbstractC4379j3<?> abstractC4379j3, List<? extends Smash> list) {
        Object obj;
        Iterator<T> it = b(list).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((AbstractC4379j3) obj).x()) {
                break;
            }
        }
        return epx.f(obj, abstractC4379j3);
    }

    public final List<Smash> b(List<? extends Smash> list) {
        return j5g.D0(new a(), list);
    }

    public final Smash c(List<? extends Smash> list) {
        Object obj;
        Iterator<T> it = b(list).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AbstractC4379j3) obj).B()) {
                break;
            }
        }
        return (Smash) obj;
    }

    public final Xg<Smash> d(List<? extends Smash> list) {
        IronLog.INTERNAL.verbose(this.a.b().name() + " waterfall size: " + list.size());
        ch a2 = ch.g.a(this.a.c() ? Tg.BIDDER_SENSITIVE : Tg.DEFAULT, this.a.i(), this.a.m(), list);
        Iterator<? extends Smash> it = list.iterator();
        while (it.hasNext()) {
            a2.d(it.next());
            if (a2.e()) {
                return new Xg<>(a2);
            }
        }
        return new Xg<>(a2);
    }

    public final boolean a(List<? extends Smash> list) {
        int i;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((AbstractC4379j3) it.next()).y() && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        return i >= this.a.i();
    }
}
