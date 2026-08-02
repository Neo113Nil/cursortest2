package x30;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import C2.a0;
import Sc.InterfaceC4008j;
import Sc.s;
import android.app.Activity$ScreenCaptureCallback;
import android.content.Context;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.K;
import d80.C6101b;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f104995a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<r> f104996b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0<Long> f104997c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f104998d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.antifraud.internal.domain.screen.ScreenshotManager$startScreenshotDetection$1", f = "ScreenshotManager.kt", l = {63}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f104999d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ r f105000e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f105001f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.antifraud.internal.domain.screen.ScreenshotManager$startScreenshotDetection$1$1", f = "ScreenshotManager.kt", l = {70}, m = "invokeSuspend")
        /* renamed from: x30.j$a$a, reason: collision with other inner class name */
        static final class C2272a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f105002d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ j f105003e;

            /* renamed from: x30.j$a$a$a, reason: collision with other inner class name */
            static final class C2273a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ j f105004a;

                C2273a(j jVar) {
                    this.f105004a = jVar;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    this.f105004a.e().setValue(new Long(System.currentTimeMillis() / 1000));
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2272a(j jVar, kotlin.coroutines.d<? super C2272a> dVar) {
                super(2, dVar);
                this.f105003e = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2272a(this.f105003e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2272a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f105002d;
                if (i11 == 0) {
                    s.b(obj);
                    j jVar = this.f105003e;
                    jVar.getClass();
                    InterfaceC2395h l11 = C2399j.l(C2399j.f(new i(jVar, null)), 500L);
                    C2273a c2273a = new C2273a(jVar);
                    this.f105002d = 1;
                    Object collect = l11.collect(new k(c2273a, jVar), this);
                    if (collect != aVar) {
                        collect = Unit.f71690a;
                    }
                    if (collect == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r rVar, j jVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f105000e = rVar;
            this.f105001f = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f105000e, this.f105001f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f104999d;
            if (i11 == 0) {
                s.b(obj);
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                C2272a c2272a = new C2272a(this.f105001f, null);
                this.f104999d = 1;
                if (C5412d0.b(this.f105000e, bVar, c2272a, this) == aVar) {
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

    public j(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f104995a = context;
        this.f104997c = O0.a(0L);
        this.f104998d = Sc.k.b(new C6101b(this, 4));
    }

    public static void a(j jVar) {
        jVar.f104997c.setValue(Long.valueOf(System.currentTimeMillis() / 1000));
    }

    public final Activity$ScreenCaptureCallback d() {
        return a0.a(this.f104998d.getValue());
    }

    @NotNull
    public final x0<Long> e() {
        return this.f104997c;
    }

    public final void f(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f104996b = new WeakReference<>(activity);
        C10727i.c(K.a(activity), null, null, new a(activity, this, null), 3);
    }
}
