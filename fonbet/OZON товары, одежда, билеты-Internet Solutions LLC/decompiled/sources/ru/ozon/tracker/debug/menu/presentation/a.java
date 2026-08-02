package ru.ozon.tracker.debug.menu.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.k;
import Sc.n;
import Sc.s;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import ei0.InterfaceC6369b;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import lj0.C7967a;
import ni0.C8599a;
import oi0.InterfaceC8743a;
import oi0.f;
import org.jetbrains.annotations.NotNull;
import pi0.h;
import ri0.C9282a;
import ri0.InterfaceC9284c;
import ui0.C10062a;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class a extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f97748a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f97749b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f97750c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M0<Boolean> f97751d;

    @e(c = "ru.ozon.tracker.debug.menu.presentation.DaggerComponentViewModel$1", f = "DaggerComponentViewModel.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 47, 51}, m = "invokeSuspend")
    /* renamed from: ru.ozon.tracker.debug.menu.presentation.a$a, reason: collision with other inner class name */
    static final class C2146a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97752d;

        C2146a(kotlin.coroutines.d<? super C2146a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C2146a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C2146a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
        
            if (r7.emit(r1, r6) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        
            if (r7.a(r1, r6) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        
            if (r7.b(r6) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97752d;
            a aVar2 = a.this;
            if (i11 == 0) {
                s.b(obj);
                xi0.d a11 = a.e0(aVar2).a();
                this.f97752d = 1;
            } else if (i11 == 1) {
                s.b(obj);
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
                x0 x0Var = aVar2.f97750c;
                Boolean bool = Boolean.TRUE;
                this.f97752d = 3;
            }
            a.e0(aVar2).b().b();
            oi0.e actionHandler = a.e0(aVar2).getActionHandler();
            InterfaceC8743a b11 = aVar2.f97748a.b();
            this.f97752d = 2;
        }
    }

    public static final class b implements z0.b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final h.a f97754a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C7967a f97755b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final InterfaceC6369b f97756c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final f f97757d;

        public b(@NotNull h.a externalConfigurationsFactory, @NotNull C7967a serviceLocator, @NotNull InterfaceC6369b tracker, @NotNull f actionProvider) {
            Intrinsics.checkNotNullParameter(externalConfigurationsFactory, "externalConfigurationsFactory");
            Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            Intrinsics.checkNotNullParameter(actionProvider, "actionProvider");
            this.f97754a = externalConfigurationsFactory;
            this.f97755b = serviceLocator;
            this.f97756c = tracker;
            this.f97757d = actionProvider;
        }

        @Override // androidx.lifecycle.z0.b
        @NotNull
        public final <T extends w0> T create(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            if (!Intrinsics.d(modelClass, a.class)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            return new a(this.f97754a, this.f97755b, this.f97756c, this.f97757d);
        }
    }

    static final class c extends AbstractC7737t implements Function0<InterfaceC9284c> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.a f97758b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7967a f97759c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6369b f97760d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h.a aVar, C7967a c7967a, InterfaceC6369b interfaceC6369b) {
            super(0);
            this.f97758b = aVar;
            this.f97759c = c7967a;
            this.f97760d = interfaceC6369b;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC9284c invoke() {
            return C9282a.a().a(this.f97759c, this.f97760d, C8599a.a(), this.f97758b.a());
        }
    }

    public a(@NotNull h.a externalConfigurationsFactory, @NotNull C7967a serviceLocator, @NotNull InterfaceC6369b tracker, @NotNull f actionProvider) {
        Intrinsics.checkNotNullParameter(externalConfigurationsFactory, "externalConfigurationsFactory");
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(actionProvider, "actionProvider");
        this.f97748a = actionProvider;
        this.f97749b = k.a(n.NONE, new c(externalConfigurationsFactory, serviceLocator, tracker));
        x0<Boolean> a11 = O0.a(Boolean.FALSE);
        this.f97750c = a11;
        this.f97751d = C2399j.b(a11);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new C2146a(null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final InterfaceC9284c e0(a aVar) {
        return (InterfaceC9284c) aVar.f97749b.getValue();
    }

    @NotNull
    public final M0<Boolean> g0() {
        return this.f97751d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final C10062a h0() {
        return ((InterfaceC9284c) this.f97749b.getValue()).getViewModelFactory();
    }
}
