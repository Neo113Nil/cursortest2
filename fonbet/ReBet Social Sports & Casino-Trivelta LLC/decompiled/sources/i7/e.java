package i7;

import android.os.Handler;
import android.os.HandlerThread;
import i7.l;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f48139a;

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicInteger f48140b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicInteger f48141c;

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f48142d;

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f48143e;

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f48144f;

    /* renamed from: g, reason: collision with root package name */
    public static final Runnable f48145g;

    /* renamed from: h, reason: collision with root package name */
    public static final Runnable f48146h;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[l.a.values().length];
            try {
                iArr[l.a.f48174a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.a.f48175b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.a.f48176c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        e eVar = new e();
        f48139a = eVar;
        f48140b = new AtomicInteger(0);
        f48141c = new AtomicInteger(0);
        f48142d = new AtomicInteger(0);
        f48143e = new ConcurrentHashMap();
        f48144f = LazyKt.lazy(new Function0() { // from class: i7.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Handler g10;
                g10 = e.g();
                return g10;
            }
        });
        Runnable runnable = new Runnable() { // from class: i7.c
            @Override // java.lang.Runnable
            public final void run() {
                e.d();
            }
        };
        f48145g = runnable;
        Runnable runnable2 = new Runnable() { // from class: i7.d
            @Override // java.lang.Runnable
            public final void run() {
                e.e();
            }
        };
        f48146h = runnable2;
        eVar.f().post(runnable);
        eVar.f().post(runnable2);
    }

    public static final void d() {
        float andSet = f48140b.getAndSet(0);
        float andSet2 = f48141c.getAndSet(0);
        float andSet3 = f48142d.getAndSet(0);
        float f10 = andSet + andSet2 + andSet3;
        if (f10 > 0.0f) {
            float f11 = andSet / f10;
            float f12 = andSet3 / f10;
            if (andSet2 / f10 > 0.25f || f12 > 0.1f) {
                for (Map.Entry entry : f48143e.entrySet()) {
                    f48139a.k((i) entry.getKey(), -((Number) entry.getValue()).intValue());
                }
            } else if (f11 > 0.98f) {
                for (Map.Entry entry2 : f48143e.entrySet()) {
                    f48139a.k((i) entry2.getKey(), ((Number) entry2.getValue()).intValue());
                }
            }
            f48143e.clear();
        }
        f48139a.j();
    }

    public static final void e() {
        k.f48167d.a(new Date(System.currentTimeMillis() - 10000));
        f48139a.i();
    }

    public static final Handler g() {
        HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    public final Handler f() {
        return (Handler) f48144f.getValue();
    }

    public final void h(i animation, l frameResult) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(frameResult, "frameResult");
        ConcurrentHashMap concurrentHashMap = f48143e;
        if (!concurrentHashMap.contains(animation)) {
            concurrentHashMap.put(animation, Integer.valueOf((int) (animation.c() * 0.2f)));
        }
        int i10 = a.$EnumSwitchMapping$0[frameResult.b().ordinal()];
        if (i10 == 1) {
            f48140b.incrementAndGet();
        } else if (i10 == 2) {
            f48141c.incrementAndGet();
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f48142d.incrementAndGet();
        }
    }

    public final boolean i() {
        return f().postDelayed(f48146h, 10000L);
    }

    public final boolean j() {
        return f().postDelayed(f48145g, 2000L);
    }

    public final void k(i iVar, int i10) {
        int coerceIn = RangesKt.coerceIn(iVar.a() + i10, (int) RangesKt.coerceAtLeast(iVar.c() * 0.5f, 1.0f), iVar.c());
        if (coerceIn != iVar.a()) {
            iVar.b(coerceIn);
        }
    }
}
