package v00;

import Ae.C2399j;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.o;
import Sc.s;
import androidx.lifecycle.w0;
import j00.C7234a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p00.C8829e;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import t00.C9722d;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class g extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7234a f101620a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<C9722d<? extends Object>> f101621b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final M0<C9722d<? extends Object>> f101622c;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.debug.menu.ui.screens.submit.SubmitFlagViewModel$1", f = "SubmitFlagViewModel.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f101623d;

        /* renamed from: v00.g$a$a, reason: collision with other inner class name */
        static final class C2214a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f101625a;

            C2214a(g gVar) {
                this.f101625a = gVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                g gVar = this.f101625a;
                x0 x0Var = gVar.f101621b;
                C9722d c9722d = (C9722d) gVar.f101621b.getValue();
                x0Var.setValue(c9722d != null ? C9722d.a(c9722d, booleanValue) : null);
                return Unit.f71690a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f101623d;
            if (i11 == 0) {
                s.b(obj);
                g gVar = g.this;
                n00.e S11 = gVar.f101620a.S();
                C2214a c2214a = new C2214a(gVar);
                this.f101623d = 1;
                Object collect = S11.collect(new h(c2214a), this);
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

    public g(@NotNull C7234a sdk) {
        Intrinsics.checkNotNullParameter(sdk, "sdk");
        this.f101620a = sdk;
        x0<C9722d<? extends Object>> a11 = O0.a(null);
        this.f101621b = a11;
        this.f101622c = C2399j.b(a11);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new a(null), 3);
    }

    @NotNull
    public final M0<C9722d<? extends Object>> f0() {
        return this.f101622c;
    }

    public final void g0(@NotNull C8829e flagInfo, @NotNull String valueToSubmit) {
        Intrinsics.checkNotNullParameter(flagInfo, "flagInfo");
        Intrinsics.checkNotNullParameter(valueToSubmit, "valueToSubmit");
        this.f101621b.setValue(new C9722d<>(flagInfo, valueToSubmit, false));
    }

    public final void h0(@NotNull C8829e flagInfo, @NotNull String value) {
        Intrinsics.checkNotNullParameter(flagInfo, "flagInfo");
        Intrinsics.checkNotNullParameter(value, "value");
        C7234a c7234a = this.f101620a;
        if (flagInfo != null) {
            kotlin.reflect.e.a(flagInfo.a(), value);
            c7234a.P(value);
        } else {
            if (flagInfo == null) {
                throw new o();
            }
            kotlin.reflect.e.a(flagInfo.a(), value);
            c7234a.R(flagInfo, value);
        }
    }
}
