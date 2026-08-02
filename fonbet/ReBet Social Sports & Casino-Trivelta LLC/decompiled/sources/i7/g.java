package i7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import d7.InterfaceC4015d;
import h7.C4486b;
import h7.C4487c;
import i7.j;
import i7.l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import z7.AbstractC6940d;

/* loaded from: classes2.dex */
public final class g implements j {

    /* renamed from: n, reason: collision with root package name */
    public static final b f48150n = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC6940d f48151a;

    /* renamed from: b, reason: collision with root package name */
    public final e7.c f48152b;

    /* renamed from: c, reason: collision with root package name */
    public final C4487c f48153c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4015d f48154d;

    /* renamed from: e, reason: collision with root package name */
    public final int f48155e;

    /* renamed from: f, reason: collision with root package name */
    public final int f48156f;

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f48157g;

    /* renamed from: h, reason: collision with root package name */
    public volatile int f48158h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f48159i;

    /* renamed from: j, reason: collision with root package name */
    public final h f48160j;

    /* renamed from: k, reason: collision with root package name */
    public int f48161k;

    /* renamed from: l, reason: collision with root package name */
    public Map f48162l;

    /* renamed from: m, reason: collision with root package name */
    public Set f48163m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final H6.a f48164a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f48165b;

        public a(H6.a bitmapRef) {
            Intrinsics.checkNotNullParameter(bitmapRef, "bitmapRef");
            this.f48164a = bitmapRef;
        }

        public final H6.a a() {
            return this.f48164a;
        }

        public final boolean b() {
            return !this.f48165b && this.f48164a.isValid();
        }

        public final void c() {
            H6.a.U(this.f48164a);
        }

        public final void d(boolean z10) {
            this.f48165b = z10;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public g(AbstractC6940d platformBitmapFactory, e7.c bitmapFrameRenderer, C4487c fpsCompressor, InterfaceC4015d animationInformation, int i10) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(fpsCompressor, "fpsCompressor");
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        this.f48151a = platformBitmapFactory;
        this.f48152b = bitmapFrameRenderer;
        this.f48153c = fpsCompressor;
        this.f48154d = animationInformation;
        this.f48155e = i10;
        int coerceAtLeast = RangesKt.coerceAtLeast((k(l()) * i10) / 1000, 1);
        this.f48156f = coerceAtLeast;
        this.f48157g = new ConcurrentHashMap();
        this.f48160j = new h(l().a());
        this.f48161k = -1;
        this.f48162l = MapsKt.emptyMap();
        this.f48163m = SetsKt.emptySet();
        d(k(l()));
        this.f48158h = (int) (coerceAtLeast * 0.5f);
    }

    public static /* synthetic */ boolean h(g gVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return gVar.g(i10, i11, i12, i13);
    }

    public static final void n(g this$0, int i10, int i11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        while (true) {
            g gVar = this$0;
            int i12 = i10;
            int i13 = i11;
            if (h(gVar, RangesKt.coerceAtLeast(this$0.f48161k, 0), i12, i13, 0, 8, null)) {
                gVar.f48159i = false;
                return;
            } else {
                this$0 = gVar;
                i10 = i12;
                i11 = i13;
            }
        }
    }

    @Override // i7.j
    public void a(int i10, int i11, Function0 onAnimationLoaded) {
        Intrinsics.checkNotNullParameter(onAnimationLoaded, "onAnimationLoaded");
        m(i10, i11);
        onAnimationLoaded.invoke();
    }

    @Override // i7.j
    public void b() {
        j.a.a(this);
    }

    @Override // i7.j
    public l c(int i10, int i11, int i12) {
        Integer num = (Integer) this.f48162l.get(Integer.valueOf(i10));
        if (num == null) {
            return j(i10);
        }
        int intValue = num.intValue();
        this.f48161k = intValue;
        a aVar = (a) this.f48157g.get(num);
        if (aVar == null || !aVar.b()) {
            aVar = null;
        }
        if (aVar == null) {
            m(i11, i12);
            return j(intValue);
        }
        if (this.f48160j.c(this.f48158h, intValue, this.f48156f)) {
            m(i11, i12);
        }
        return new l(aVar.a().clone(), l.a.f48174a);
    }

    @Override // i7.j
    public void clear() {
        Collection values = this.f48157g.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((a) it.next()).c();
        }
        this.f48157g.clear();
        this.f48161k = -1;
    }

    @Override // i7.j
    public void d(int i10) {
        Map a10 = this.f48153c.a(l().c() * RangesKt.coerceAtLeast(l().b(), 1), l().a(), RangesKt.coerceAtMost(i10, k(l())));
        this.f48162l = a10;
        this.f48163m = CollectionsKt.toSet(a10.values());
    }

    public final void f(H6.a aVar) {
        if (aVar.isValid()) {
            new Canvas((Bitmap) aVar.z0()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
    }

    public final boolean g(int i10, int i11, int i12, int i13) {
        int intValue;
        H6.a a10;
        List d10 = this.f48160j.d(i10, this.f48156f);
        ArrayList arrayList = new ArrayList();
        for (Object obj : d10) {
            if (this.f48163m.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        Set set = CollectionsKt.toSet(arrayList);
        Set keySet = this.f48157g.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        ArrayDeque arrayDeque = new ArrayDeque(SetsKt.minus(keySet, (Iterable) set));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Number) it.next()).intValue();
            if (this.f48157g.get(Integer.valueOf(intValue2)) == null) {
                int i14 = this.f48161k;
                if (i14 != -1 && !set.contains(Integer.valueOf(i14))) {
                    return false;
                }
                Integer num = (Integer) arrayDeque.pollFirst();
                int intValue3 = num != null ? num.intValue() : -1;
                a aVar = (a) this.f48157g.get(Integer.valueOf(intValue3));
                H6.a r10 = (aVar == null || (a10 = aVar.a()) == null) ? null : a10.r();
                if (r10 == null) {
                    H6.a a11 = this.f48151a.a(i11, i12);
                    Intrinsics.checkNotNullExpressionValue(a11, "createBitmap(...)");
                    aVar = new a(a11);
                    r10 = aVar.a().clone();
                }
                aVar.d(true);
                try {
                    o(r10, intValue2, i11, i12);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(r10, null);
                    this.f48157g.remove(Integer.valueOf(intValue3));
                    aVar.d(false);
                    this.f48157g.put(Integer.valueOf(intValue2), aVar);
                } finally {
                }
            }
        }
        if (arrayList.isEmpty()) {
            intValue = (int) (this.f48156f * 0.5f);
        } else {
            int size = arrayList.size();
            intValue = ((Number) arrayList.get(RangesKt.coerceIn((int) (size * 0.5f), 0, size - 1))).intValue();
        }
        this.f48158h = intValue;
        return true;
    }

    public final C4533a i(int i10) {
        C4533a c4533a;
        Iterator<Integer> it = new IntRange(0, this.f48160j.b()).iterator();
        do {
            c4533a = null;
            if (!it.hasNext()) {
                break;
            }
            int a10 = this.f48160j.a(i10 - ((IntIterator) it).nextInt());
            a aVar = (a) this.f48157g.get(Integer.valueOf(a10));
            if (aVar != null) {
                if (!aVar.b()) {
                    aVar = null;
                }
                if (aVar != null) {
                    c4533a = new C4533a(a10, aVar.a());
                }
            }
        } while (c4533a == null);
        return c4533a;
    }

    public final l j(int i10) {
        C4533a i11 = i(i10);
        if (i11 == null) {
            return new l(null, l.a.f48176c);
        }
        H6.a clone = i11.d().clone();
        Intrinsics.checkNotNullExpressionValue(clone, "clone(...)");
        this.f48161k = i11.k();
        return new l(clone, l.a.f48175b);
    }

    public final int k(InterfaceC4015d interfaceC4015d) {
        return (int) RangesKt.coerceAtLeast(TimeUnit.SECONDS.toMillis(1L) / (interfaceC4015d.c() / interfaceC4015d.a()), 1L);
    }

    public InterfaceC4015d l() {
        return this.f48154d;
    }

    public final void m(final int i10, final int i11) {
        if (this.f48159i) {
            return;
        }
        this.f48159i = true;
        C4486b.f47823a.b(new Runnable() { // from class: i7.f
            @Override // java.lang.Runnable
            public final void run() {
                g.n(g.this, i10, i11);
            }
        });
    }

    public final void o(H6.a aVar, int i10, int i11, int i12) {
        H6.a d10;
        H6.a r10;
        C4533a i13 = i(i10);
        if (i13 != null && (d10 = i13.d()) != null && (r10 = d10.r()) != null) {
            try {
                int k10 = i13.k();
                if (k10 < i10) {
                    Object z02 = r10.z0();
                    Intrinsics.checkNotNullExpressionValue(z02, "get(...)");
                    p(aVar, (Bitmap) z02);
                    Iterator<Integer> it = new IntRange(k10 + 1, i10).iterator();
                    while (it.hasNext()) {
                        int nextInt = ((IntIterator) it).nextInt();
                        e7.c cVar = this.f48152b;
                        Object z03 = aVar.z0();
                        Intrinsics.checkNotNullExpressionValue(z03, "get(...)");
                        cVar.a(nextInt, (Bitmap) z03);
                    }
                    CloseableKt.closeFinally(r10, null);
                    return;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(r10, null);
            } finally {
            }
        }
        f(aVar);
        Iterator<Integer> it2 = new IntRange(0, i10).iterator();
        while (it2.hasNext()) {
            int nextInt2 = ((IntIterator) it2).nextInt();
            e7.c cVar2 = this.f48152b;
            Object z04 = aVar.z0();
            Intrinsics.checkNotNullExpressionValue(z04, "get(...)");
            cVar2.a(nextInt2, (Bitmap) z04);
        }
    }

    public final H6.a p(H6.a aVar, Bitmap bitmap) {
        if (aVar.isValid() && !Intrinsics.areEqual(aVar.z0(), bitmap)) {
            Canvas canvas = new Canvas((Bitmap) aVar.z0());
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        return aVar;
    }
}
