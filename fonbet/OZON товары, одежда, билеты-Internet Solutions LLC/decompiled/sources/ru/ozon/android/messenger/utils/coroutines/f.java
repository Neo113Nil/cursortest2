package ru.ozon.android.messenger.utils.coroutines;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.M;

/* loaded from: classes10.dex */
public final class f<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<T> f91897a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f91898b;

    /* renamed from: c, reason: collision with root package name */
    private B0 f91899c;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.utils.coroutines.FlowObserver$1$1", f = "FlowExt.kt", l = {42}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f91900d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f<T> f91901e;

        /* renamed from: ru.ozon.android.messenger.utils.coroutines.f$a$a, reason: collision with other inner class name */
        static final class C1722a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f<T> f91902a;

            C1722a(f<T> fVar) {
                this.f91902a = fVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                Object invoke = ((f) this.f91902a).f91898b.invoke(t2, dVar);
                return invoke == Wc.a.COROUTINE_SUSPENDED ? invoke : Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<T> fVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f91901e = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f91901e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f91900d;
            if (i11 == 0) {
                s.b(obj);
                f<T> fVar = this.f91901e;
                InterfaceC2395h interfaceC2395h = ((f) fVar).f91897a;
                C1722a c1722a = new C1722a(fVar);
                this.f91900d = 1;
                if (interfaceC2395h.collect(c1722a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91903a;

        static {
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC5434v.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f91903a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull J lifecycleOwner, @NotNull InterfaceC2395h<? extends T> flow, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> collector) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(collector, "collector");
        this.f91897a = flow;
        this.f91898b = collector;
        lifecycleOwner.getLifecycle().a(new G() { // from class: ru.ozon.android.messenger.utils.coroutines.e
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                f.a(f.this, j11, aVar);
            }
        });
    }

    public static void a(f fVar, J source, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i11 = b.f91903a[event.ordinal()];
        if (i11 == 1) {
            fVar.f91899c = C10727i.c(K.a(source), null, null, new a(fVar, null), 3);
        } else {
            if (i11 != 2) {
                return;
            }
            B0 b02 = fVar.f91899c;
            if (b02 != null) {
                ((H0) b02).j(null);
            }
            fVar.f91899c = null;
        }
    }
}
