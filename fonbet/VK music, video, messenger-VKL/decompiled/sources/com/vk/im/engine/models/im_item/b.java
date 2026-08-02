package com.vk.im.engine.models.im_item;

import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.movika.sdk.base.ui.v;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.d2;
import xsna.epx;
import xsna.msy;
import xsna.qoy;
import xsna.shy;
import xsna.x7w;
import xsna.xo9;

/* compiled from: ImItemWeightCodec.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final Pair<Integer, Integer> a = new Pair<>(53, 62);
    public static final Pair<Integer, Integer> b = new Pair<>(57, 59);
    public static final Pair<Integer, Integer> c = new Pair<>(52, 52);
    public static final Pair<Integer, Integer> d = new Pair<>(21, 51);
    public static final Pair<Integer, Integer> e = new Pair<>(15, 20);
    public static final Pair<Integer, Integer> f = new Pair<>(32, 62);
    public static final Pair<Integer, Integer> g = new Pair<>(12, 31);
    public static final Pair<Integer, Integer> h = new Pair<>(1, 63);
    public static final Pair<Integer, Integer> i = new Pair<>(0, 0);
    public static final Object j;
    public static final Object k;

    /* compiled from: ImItemWeightCodec.kt */
    public static final class a {
        public final int a;
        public final boolean b;
        public final int c;
        public final ImItemType d;
        public final int e;
        public final int f;
        public final Long g;

        public a(int i, boolean z, int i2, ImItemType imItemType, int i3, int i4, Long l) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = imItemType;
            this.e = i3;
            this.f = i4;
            this.g = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            int a = shy.a(this.f, shy.a(this.e, (this.d.hashCode() + shy.a(this.c, qoy.b(Integer.hashCode(this.a) * 31, 31, this.b), 31)) * 31, 31), 31);
            Long l = this.g;
            return a + (l == null ? 0 : l.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append('|');
            sb.append(this.b ? 1 : 0);
            sb.append('|');
            sb.append(this.c);
            sb.append('|');
            sb.append(this.d);
            sb.append('|');
            sb.append(this.e);
            sb.append('|');
            sb.append(this.f);
            sb.append('|');
            Long l = this.g;
            sb.append(l != null ? l.longValue() : 0L);
            return sb.toString();
        }
    }

    static {
        d2 d2Var = new d2(19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        j = msy.a(lazyThreadSafetyMode, d2Var);
        k = msy.a(lazyThreadSafetyMode, new v(20));
    }

    public static final a a(x7w x7wVar) {
        int j2 = (int) xo9.j(x7wVar.b, a);
        boolean b2 = b(x7wVar);
        long j3 = x7wVar.b;
        int j4 = (int) xo9.j(j3, d);
        ImItemType.a aVar = ImItemType.Companion;
        int j5 = (int) xo9.j(j3, e);
        aVar.getClass();
        return new a(j2, b2, j4, ImItemType.a.a(j5), d(x7wVar), (int) xo9.j(x7wVar.c, g), c(x7wVar));
    }

    public static final boolean b(x7w x7wVar) {
        return xo9.j(x7wVar.b, c) != 0;
    }

    public static final Long c(x7w x7wVar) {
        long j2 = x7wVar.d;
        long j3 = xo9.j(j2, h);
        if (j3 == 0) {
            return null;
        }
        return xo9.j(j2, i) == 1 ? Long.valueOf(-j3) : Long.valueOf(j3);
    }

    public static final int d(x7w x7wVar) {
        return (int) xo9.j(x7wVar.c, f);
    }

    public static final x7w e(int i2, boolean z, int i3, ImItemType imItemType, int i4, int i5, long j2) {
        if (j2 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("ItemId overflow");
        }
        long j3 = 0;
        long x = xo9.x(xo9.x(xo9.x(xo9.x(0L, a, i2), c, z ? 1L : 0L), d, i3), e, imItemType.h());
        long x2 = xo9.x(xo9.x(0L, f, i4), g, i5);
        if (j2 != 0) {
            j3 = xo9.x(xo9.x(0L, h, Math.abs(j2)), i, j2 >= 0 ? 0L : 1L);
        }
        return new x7w(x, x2, j3);
    }

    public static final boolean f(x7w x7wVar) {
        return xo9.j(x7wVar.b, b) > 0;
    }
}
