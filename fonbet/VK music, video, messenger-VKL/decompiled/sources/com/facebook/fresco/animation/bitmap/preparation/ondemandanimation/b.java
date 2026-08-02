package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.FrameResult;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.b;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptySet;
import xsna.bn2;
import xsna.c5g;
import xsna.cj2;
import xsna.gzs;
import xsna.has;
import xsna.hta0;
import xsna.j5g;
import xsna.j9x;
import xsna.jfs;
import xsna.jgp;
import xsna.k9x;
import xsna.ldc;
import xsna.on00;
import xsna.q1t;
import xsna.s3q0;
import xsna.swe0;
import xsna.uvf;
import xsna.wp2;

/* compiled from: BufferFrameLoader.kt */
/* loaded from: classes12.dex */
public final class b implements jfs {
    public final hta0 a;
    public final cj2 b;
    public final has c;
    public final q1t d;
    public final int e;
    public final ConcurrentHashMap<Integer, a> f;
    public volatile int g;
    public volatile boolean h;
    public final ldc i;
    public int j;
    public Object k;
    public Set<Integer> l;

    /* compiled from: BufferFrameLoader.kt */
    public static final class a {
        public final uvf<Bitmap> a;
        public boolean b;

        public a(uvf<Bitmap> uvfVar) {
            this.a = uvfVar;
        }
    }

    public b(hta0 hta0Var, cj2 cj2Var, has hasVar, q1t q1tVar, int i) {
        this.a = hta0Var;
        this.b = cj2Var;
        this.c = hasVar;
        this.d = q1tVar;
        int f = (f(q1tVar) * i) / 1000;
        f = f < 1 ? 1 : f;
        this.e = f;
        this.f = new ConcurrentHashMap<>();
        this.i = new ldc(q1tVar.getFrameCount());
        this.j = -1;
        this.k = jgp.b;
        this.l = EmptySet.b;
        a(f(q1tVar));
        this.g = (int) (f * 0.5f);
    }

    public static int f(q1t q1tVar) {
        long millis = TimeUnit.SECONDS.toMillis(1L) / (q1tVar.getLoopDurationMs() / q1tVar.getFrameCount());
        return (int) (millis >= 1 ? millis : 1L);
    }

    @Override // xsna.jfs
    public final void a(int i) {
        q1t q1tVar = this.d;
        int loopDurationMs = q1tVar.getLoopDurationMs();
        int loopCount = q1tVar.getLoopCount();
        if (loopCount < 1) {
            loopCount = 1;
        }
        int i2 = loopDurationMs * loopCount;
        int frameCount = q1tVar.getFrameCount();
        int f = f(q1tVar);
        if (i > f) {
            i = f;
        }
        int i3 = i >= 1 ? i : 1;
        int i4 = this.c.a;
        if (i3 > i4) {
            i3 = i4;
        }
        float f2 = (i2 / 1000.0f) * i3;
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = 0.0f;
        }
        float f3 = frameCount;
        if (f2 > f3) {
            f2 = f3;
        }
        float f4 = f3 / f2;
        int i5 = 0;
        k9x q = swe0.q(0, frameCount);
        int e = on00.e(c5g.u(q, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        j9x it = q.iterator();
        while (it.d) {
            Object next = it.next();
            int intValue = ((Number) next).intValue();
            if (((int) (intValue % f4)) == 0) {
                i5 = intValue;
            }
            linkedHashMap.put(next, Integer.valueOf(i5));
        }
        this.k = linkedHashMap;
        this.l = j5g.S0(linkedHashMap.values());
    }

    @Override // xsna.jfs
    public final void b(int i, int i2, gzs<s3q0> gzsVar) {
        g(i, i2);
        gzsVar.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.jfs
    public final FrameResult c(int i, int i2, int i3) {
        Integer num = (Integer) this.k.get(Integer.valueOf(i));
        if (num == null) {
            return e(i);
        }
        int intValue = num.intValue();
        this.j = intValue;
        a aVar = this.f.get(num);
        if (aVar == null || aVar.b || !aVar.a.s()) {
            aVar = null;
        }
        if (aVar == null) {
            g(i2, i3);
            return e(intValue);
        }
        ldc ldcVar = this.i;
        int i4 = this.g;
        int a2 = ldcVar.a(this.e + i4);
        if (i4 >= a2 ? !((i4 > intValue || intValue > ldcVar.a) && (intValue < 0 || intValue > a2)) : !(i4 > intValue || intValue > a2)) {
            g(i2, i3);
        }
        return new FrameResult(aVar.a.clone(), FrameResult.FrameType.SUCCESS);
    }

    @Override // xsna.jfs
    public final void clear() {
        ConcurrentHashMap<Integer, a> concurrentHashMap = this.f;
        Iterator<T> it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            uvf.q(((a) it.next()).a);
        }
        concurrentHashMap.clear();
        this.j = -1;
    }

    public final bn2 d(int i) {
        bn2 bn2Var;
        ldc ldcVar = this.i;
        j9x it = new k9x(0, ldcVar.a, 1).iterator();
        do {
            bn2Var = null;
            if (!it.d) {
                break;
            }
            int a2 = ldcVar.a(i - it.nextInt());
            a aVar = this.f.get(Integer.valueOf(a2));
            if (aVar != null) {
                if (aVar.b || !aVar.a.s()) {
                    aVar = null;
                }
                if (aVar != null) {
                    bn2Var = new bn2(a2, aVar.a);
                }
            }
        } while (bn2Var == null);
        return bn2Var;
    }

    public final FrameResult e(int i) {
        bn2 d = d(i);
        if (d == null) {
            return new FrameResult(null, FrameResult.FrameType.MISSING);
        }
        uvf<Bitmap> clone = d.c.clone();
        this.j = d.b;
        return new FrameResult(clone, FrameResult.FrameType.NEAREST);
    }

    public final void g(final int i, final int i2) {
        if (this.h) {
            return;
        }
        this.h = true;
        wp2.a.execute(new Runnable() { // from class: xsna.cm8
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList;
                int intValue;
                uvf<Bitmap> uvfVar;
                com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.b bVar = com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.b.this;
                int i3 = i;
                int i4 = i2;
                loop0: while (true) {
                    int i5 = bVar.j;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    ldc ldcVar = bVar.i;
                    int i6 = bVar.e;
                    ldcVar.getClass();
                    k9x q = swe0.q(0, i6);
                    ArrayList arrayList2 = new ArrayList(c5g.u(q, 10));
                    j9x it = q.iterator();
                    while (it.d) {
                        arrayList2.add(Integer.valueOf(ldcVar.a(it.nextInt() + i5)));
                    }
                    arrayList = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (bVar.l.contains(Integer.valueOf(((Number) next).intValue()))) {
                            arrayList.add(next);
                        }
                    }
                    Set S0 = j5g.S0(arrayList);
                    ArrayDeque arrayDeque = new ArrayDeque(izi0.g(bVar.f.keySet(), S0));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        int intValue2 = ((Number) it3.next()).intValue();
                        if (bVar.f.get(Integer.valueOf(intValue2)) == null) {
                            int i7 = bVar.j;
                            if (i7 == -1 || S0.contains(Integer.valueOf(i7))) {
                                Integer num = (Integer) arrayDeque.pollFirst();
                                int intValue3 = num != null ? num.intValue() : -1;
                                b.a aVar = bVar.f.get(Integer.valueOf(intValue3));
                                uvf<Bitmap> n = (aVar == null || (uvfVar = aVar.a) == null) ? null : uvfVar.n();
                                if (n == null) {
                                    hta0 hta0Var = bVar.a;
                                    hta0Var.getClass();
                                    uvf<Bitmap> c = hta0Var.c(i3, i4, Bitmap.Config.ARGB_8888);
                                    aVar = new b.a(c);
                                    n = c.clone();
                                }
                                aVar.b = true;
                                try {
                                    bVar.h(intValue2, n);
                                    s3q0 s3q0Var = s3q0.a;
                                    n.close();
                                    bVar.f.remove(Integer.valueOf(intValue3));
                                    aVar.b = false;
                                    bVar.f.put(Integer.valueOf(intValue2), aVar);
                                } finally {
                                }
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    intValue = (int) (bVar.e * 0.5f);
                } else {
                    int size = arrayList.size();
                    intValue = ((Number) arrayList.get(swe0.g((int) (size * 0.5f), 0, size - 1))).intValue();
                }
                bVar.g = intValue;
                bVar.h = false;
            }
        });
    }

    public final void h(int i, uvf uvfVar) {
        uvf<Bitmap> uvfVar2;
        uvf<Bitmap> n;
        bn2 d = d(i);
        cj2 cj2Var = this.b;
        if (d != null && (uvfVar2 = d.c) != null && (n = uvfVar2.n()) != null) {
            try {
                int i2 = d.b;
                if (i2 < i) {
                    Bitmap r = n.r();
                    if (uvfVar.s() && !uvfVar.r().equals(r)) {
                        Canvas canvas = new Canvas((Bitmap) uvfVar.r());
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas.drawBitmap(r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
                    }
                    j9x it = new k9x(i2 + 1, i, 1).iterator();
                    while (it.d) {
                        cj2Var.a(it.nextInt(), (Bitmap) uvfVar.r());
                    }
                    n.close();
                    return;
                }
                s3q0 s3q0Var = s3q0.a;
                n.close();
            } finally {
            }
        }
        if (uvfVar.s()) {
            new Canvas((Bitmap) uvfVar.r()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
        j9x it2 = new k9x(0, i, 1).iterator();
        while (it2.d) {
            cj2Var.a(it2.nextInt(), (Bitmap) uvfVar.r());
        }
    }
}
