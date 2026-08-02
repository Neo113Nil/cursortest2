package C5;

import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.P;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.C;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.x;
import s5.C6339a;
import u5.C6523d;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static C0 f1148e;

    /* renamed from: h, reason: collision with root package name */
    public static final x f1151h;

    /* renamed from: i, reason: collision with root package name */
    public static final InterfaceC5321f f1152i;

    /* renamed from: j, reason: collision with root package name */
    public static final x f1153j;

    /* renamed from: k, reason: collision with root package name */
    public static final InterfaceC5321f f1154k;

    /* renamed from: l, reason: collision with root package name */
    public static final x f1155l;

    /* renamed from: m, reason: collision with root package name */
    public static final InterfaceC5321f f1156m;

    /* renamed from: n, reason: collision with root package name */
    public static final x f1157n;

    /* renamed from: o, reason: collision with root package name */
    public static final InterfaceC5321f f1158o;

    /* renamed from: p, reason: collision with root package name */
    public static GestureDetector f1159p;

    /* renamed from: q, reason: collision with root package name */
    public static float f1160q;

    /* renamed from: r, reason: collision with root package name */
    public static float f1161r;

    /* renamed from: s, reason: collision with root package name */
    public static float f1162s;

    /* renamed from: t, reason: collision with root package name */
    public static float f1163t;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f1164u;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f1165v;

    /* renamed from: a, reason: collision with root package name */
    public static final d f1144a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f1145b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1146c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final P f1147d = C6339a.f64787a.a();

    /* renamed from: f, reason: collision with root package name */
    public static final Set f1149f = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: g, reason: collision with root package name */
    public static final Map f1150g = Collections.synchronizedMap(new WeakHashMap());

    public static final class a extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            d dVar = d.f1144a;
            d.f1160q = e10.getRawX();
            d.f1161r = e10.getRawY();
            d.f1162s = 0.0f;
            d.f1163t = 0.0f;
            d.f1164u = false;
            d.f1165v = false;
            d.f1151h.a(C5.b.f1132h.a(e10));
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
            Intrinsics.checkNotNullParameter(e22, "e2");
            d.f1165v = true;
            d.f1157n.a(new C5.a(motionEvent != null ? motionEvent.getRawX() : d.f1160q, motionEvent != null ? motionEvent.getRawY() : d.f1161r, f10, f11));
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
            Intrinsics.checkNotNullParameter(e22, "e2");
            d.f1162s += f10;
            d.f1163t += f11;
            d.f1164u = true;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            d.f1153j.a(C5.b.f1132h.a(e10));
            return false;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f1166n;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f1167n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f1168o;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(continuation);
                aVar.f1168o = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(List list, Continuation continuation) {
                return ((a) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f1167n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                for (Window window : (List) this.f1168o) {
                    E5.b.f3006a.a("setting touch interceptor for window: " + window.getClass().getSimpleName());
                    d.f1144a.z(window);
                }
                return Unit.INSTANCE;
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f1166n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C h10 = C6523d.f66138a.h();
                a aVar = new a(null);
                this.f1166n = 1;
                if (AbstractC5323h.h(h10, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {
        public c(Object obj) {
            super(1, obj, d.class, "onUserTouchEvent", "onUserTouchEvent(Landroid/view/MotionEvent;)V", 0);
        }

        public final void a(MotionEvent p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((d) this.receiver).y(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((MotionEvent) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: C5.d$d, reason: collision with other inner class name */
    public static final class C0031d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f1169n;

        public C0031d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0031d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C0031d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1169n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            d.f1164u = false;
            d.f1165v = false;
            for (Window window : new ArrayList(d.f1150g.keySet())) {
                WeakReference weakReference = (WeakReference) d.f1150g.remove(window);
                if (weakReference != null && (window.getCallback() instanceof e)) {
                    window.setCallback((Window.Callback) weakReference.get());
                }
            }
            d.f1149f.clear();
            return Unit.INSTANCE;
        }
    }

    static {
        Rh.d dVar = Rh.d.f10308b;
        x a10 = E.a(0, 64, dVar);
        f1151h = a10;
        f1152i = a10;
        x a11 = E.a(0, 64, dVar);
        f1153j = a11;
        f1154k = a11;
        x a12 = E.a(0, 64, dVar);
        f1155l = a12;
        f1156m = a12;
        x a13 = E.a(0, 64, dVar);
        f1157n = a13;
        f1158o = a13;
    }

    public final void A() {
        synchronized (f1146c) {
            try {
                if (f1145b.getAndSet(false)) {
                    C0 c02 = f1148e;
                    if (c02 != null) {
                        C0.a.b(c02, null, 1, null);
                    }
                    f1159p = null;
                    AbstractC1459k.d(f1147d, C1452g0.c().e2(), null, new C0031d(null), 2, null);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r(Window window) {
        if (f1159p != null) {
            return;
        }
        f1159p = new GestureDetector(window.getDecorView().getContext(), new a());
    }

    public final InterfaceC5321f s() {
        return f1152i;
    }

    public final InterfaceC5321f t() {
        return f1158o;
    }

    public final InterfaceC5321f u() {
        return f1156m;
    }

    public final InterfaceC5321f v() {
        return f1154k;
    }

    public final void w() {
        C0 d10;
        synchronized (f1146c) {
            try {
                if (!f1145b.getAndSet(true)) {
                    d10 = AbstractC1459k.d(f1147d, C1452g0.c().e2(), null, new b(null), 2, null);
                    f1148e = d10;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void x() {
        if (f1164u) {
            if (f1165v) {
                f1164u = false;
                f1165v = false;
            } else {
                f1155l.a(new C5.c(f1160q, f1161r, f1162s, f1163t));
                f1164u = false;
            }
        }
    }

    public final void y(MotionEvent motionEvent) {
        E5.b.f3006a.a("onUserTouchEvent: " + motionEvent);
        GestureDetector gestureDetector = f1159p;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            x();
        } else if (motionEvent.getActionMasked() == 3) {
            f1164u = false;
            f1165v = false;
            f1162s = 0.0f;
            f1163t = 0.0f;
        }
    }

    public final void z(Window window) {
        synchronized (f1146c) {
            try {
                Set set = f1149f;
                if (set.contains(window)) {
                    E5.b.f3006a.a("Touch interceptor already set for window: " + window.getClass().getSimpleName());
                } else {
                    d dVar = f1144a;
                    dVar.r(window);
                    Window.Callback callback = window.getCallback();
                    Map originalCallbacks = f1150g;
                    Intrinsics.checkNotNullExpressionValue(originalCallbacks, "originalCallbacks");
                    originalCallbacks.put(window, new WeakReference(callback));
                    Intrinsics.checkNotNull(callback);
                    window.setCallback(new e(callback, new c(dVar)));
                    set.add(window);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
