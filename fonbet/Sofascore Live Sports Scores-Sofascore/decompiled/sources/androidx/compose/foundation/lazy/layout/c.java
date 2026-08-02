package androidx.compose.foundation.lazy.layout;

import defpackage.b10;
import defpackage.h0d;
import defpackage.h9a;
import defpackage.i1d;
import defpackage.i9a;
import defpackage.lnb;
import defpackage.u3a;
import defpackage.vjd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c {
    public final h0d a;
    public final Object[] b;
    public final int c;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c9, code lost:
    
        if (r9 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(IntRange intRange, b bVar) {
        Object defaultLazyKey;
        b10 h = bVar.h();
        int i = intRange.a;
        if (i < 0) {
            u3a.c("negative nearestRange.first");
        }
        int min = Math.min(intRange.b, h.b - 1);
        if (min < i) {
            h0d h0dVar = vjd.a;
            h0dVar.getClass();
            this.a = h0dVar;
            this.b = new Object[0];
            this.c = 0;
            return;
        }
        int i2 = (min - i) + 1;
        this.b = new Object[i2];
        this.c = i;
        h0d h0dVar2 = new h0d(i2);
        i1d i1dVar = (i1d) h.c;
        if (i < 0 || i >= h.b) {
            StringBuilder t = lnb.t(i, "Index ", ", size ");
            t.append(h.b);
            u3a.e(t.toString());
        }
        if (min < 0 || min >= h.b) {
            StringBuilder t2 = lnb.t(min, "Index ", ", size ");
            t2.append(h.b);
            u3a.e(t2.toString());
        }
        if (min < i) {
            u3a.a("toIndex (" + min + ") should be not smaller than fromIndex (" + i + ')');
        }
        int q = i9a.q(i, i1dVar);
        int i3 = ((h9a) i1dVar.a[q]).a;
        while (i3 <= min) {
            h9a h9aVar = (h9a) i1dVar.a[q];
            Function1 key = h9aVar.c.getKey();
            int i4 = h9aVar.a;
            int max = Math.max(i, i4);
            int min2 = Math.min(min, (h9aVar.b + i4) - 1);
            if (max <= min2) {
                while (true) {
                    if (key != null) {
                        defaultLazyKey = key.invoke(Integer.valueOf(max - i4));
                    }
                    defaultLazyKey = new DefaultLazyKey(max);
                    h0dVar2.g(max, defaultLazyKey);
                    this.b[max - this.c] = defaultLazyKey;
                    max = max != min2 ? max + 1 : max;
                }
            }
            Unit unit = Unit.a;
            i3 += h9aVar.b;
            q++;
        }
        this.a = h0dVar2;
    }

    public final int a(Object obj) {
        h0d h0dVar = this.a;
        int d = h0dVar.d(obj);
        if (d >= 0) {
            return h0dVar.c[d];
        }
        return -1;
    }

    public final Object b(int i) {
        int i2 = i - this.c;
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = this.b;
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }
}
