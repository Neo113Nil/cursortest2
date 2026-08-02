package v5;

import android.os.Looper;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.C10749t0;
import xe.H0;
import xe.M;
import xe.U;

/* renamed from: v5.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnAttachStateChangeListenerC10247u implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f102285a;

    /* renamed from: b, reason: collision with root package name */
    private C10245s f102286b;

    /* renamed from: c, reason: collision with root package name */
    private B0 f102287c;

    /* renamed from: d, reason: collision with root package name */
    private C10246t f102288d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f102289e;

    @kotlin.coroutines.jvm.internal.e(c = "coil.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: v5.u$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return ViewOnAttachStateChangeListenerC10247u.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            ViewOnAttachStateChangeListenerC10247u.this.c(null);
            return Unit.f71690a;
        }
    }

    public ViewOnAttachStateChangeListenerC10247u(@NotNull View view) {
        this.f102285a = view;
    }

    public final synchronized void a() {
        B0 b02 = this.f102287c;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        C10749t0 c10749t0 = C10749t0.f105499a;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f102287c = C10727i.c(c10749t0, De.s.f6650a.x(), null, new a(null), 2);
        this.f102286b = null;
    }

    @NotNull
    public final synchronized C10245s b(@NotNull U<? extends AbstractC10235i> u11) {
        C10245s c10245s = this.f102286b;
        if (c10245s != null) {
            int i11 = A5.k.f430d;
            if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper()) && this.f102289e) {
                this.f102289e = false;
                c10245s.a(u11);
                return c10245s;
            }
        }
        B0 b02 = this.f102287c;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f102287c = null;
        C10245s c10245s2 = new C10245s(this.f102285a, u11);
        this.f102286b = c10245s2;
        return c10245s2;
    }

    public final void c(C10246t c10246t) {
        C10246t c10246t2 = this.f102288d;
        if (c10246t2 != null) {
            c10246t2.a();
        }
        this.f102288d = c10246t;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View view) {
        C10246t c10246t = this.f102288d;
        if (c10246t == null) {
            return;
        }
        this.f102289e = true;
        c10246t.b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View view) {
        C10246t c10246t = this.f102288d;
        if (c10246t != null) {
            c10246t.a();
        }
    }
}
