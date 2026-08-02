package ru.ozon.android.messenger.framework.composer.demo.configurator;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.InterfaceC4003e;
import Sc.s;
import android.widget.Toast;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.W;
import androidx.lifecycle.w0;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.InterfaceC7851b;
import l10.r;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.configuration.f;
import xe.C10727i;
import xe.M;

/* loaded from: classes10.dex */
public final class a extends f {

    @e(c = "ru.ozon.android.messenger.framework.composer.demo.configurator.DemoPageConfigurator$onComposerInitialized$1", f = "DemoPageConfigurator.kt", l = {94}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.composer.demo.configurator.a$a, reason: collision with other inner class name */
    static final class C1538a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f86630d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.composer.configuration.e f86631e;

        /* renamed from: ru.ozon.android.messenger.framework.composer.demo.configurator.a$a$a, reason: collision with other inner class name */
        static final class C1539a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ru.ozon.android.messenger.framework.composer.configuration.e f86632a;

            C1539a(ru.ozon.android.messenger.framework.composer.configuration.e eVar) {
                this.f86632a = eVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                Toast.makeText(this.f86632a.c().g().getApplicationContext(), "ComposerStoreEvent from DemoPageConfigurator " + ((A00.a) obj), 0).show();
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1538a(ru.ozon.android.messenger.framework.composer.configuration.e eVar, kotlin.coroutines.d<? super C1538a> dVar) {
            super(2, dVar);
            this.f86631e = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C1538a(this.f86631e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1538a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f86630d;
            if (i11 == 0) {
                s.b(obj);
                ru.ozon.android.messenger.framework.composer.configuration.e eVar = this.f86631e;
                InterfaceC2395h<A00.a> events = eVar.a().getEvents();
                C1539a c1539a = new C1539a(eVar);
                this.f86630d = 1;
                if (events.collect(c1539a, this) == aVar) {
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

    static final class b extends AbstractC7737t implements Function1<Unit, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.composer.configuration.e f86633b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.composer.demo.configurator.c f86634c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ru.ozon.android.messenger.framework.composer.configuration.e eVar, ru.ozon.android.messenger.framework.composer.demo.configurator.c cVar) {
            super(1);
            this.f86633b = eVar;
            this.f86634c = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Unit unit) {
            if (unit != null) {
                InterfaceC7851b.a.a(this.f86633b.b(), null, null, null, null, 15);
                this.f86634c.getLiveData().setValue(null);
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function0<ru.ozon.android.messenger.framework.composer.demo.configurator.c> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f86635b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.framework.composer.demo.configurator.c invoke() {
            return new ru.ozon.android.messenger.framework.composer.demo.configurator.c();
        }
    }

    static final class d implements W, InterfaceC7732n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f86636a;

        d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f86636a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
                return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        @NotNull
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return this.f86636a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.W
        public final /* synthetic */ void onChanged(Object obj) {
            this.f86636a.invoke(obj);
        }
    }

    @Override // ru.ozon.android.messenger.framework.composer.configuration.f
    protected final void c() {
        ru.ozon.android.messenger.framework.composer.configuration.e b11 = b();
        if (b11 == null) {
            return;
        }
        C10727i.c(K.a(b11.c().h()), null, null, new C1538a(b11, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        ru.ozon.android.messenger.framework.composer.configuration.e b11 = b();
        if (b11 == null) {
            return;
        }
        Toast.makeText(b11.c().g().getApplicationContext(), "DemoPageConfigurator lifecycle callback onCreate", 0).show();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        ru.ozon.android.messenger.framework.composer.configuration.e b11 = b();
        if (b11 == null) {
            return;
        }
        Toast.makeText(b11.c().g().getApplicationContext(), "DemoPageConfigurator lifecycle callback onDestroy", 0).show();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
        ru.ozon.android.messenger.framework.composer.configuration.e b11 = b();
        if (b11 == null) {
            return;
        }
        Toast.makeText(b11.c().g().getApplicationContext(), "DemoPageConfigurator lifecycle callback onPause", 0).show();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        ru.ozon.android.messenger.framework.composer.configuration.e b11 = b();
        if (b11 == null) {
            return;
        }
        ru.ozon.android.messenger.framework.composer.demo.configurator.c cVar = (ru.ozon.android.messenger.framework.composer.demo.configurator.c) ((w0) a00.j.a(((r) b11.d()).a(), N.b(ru.ozon.android.messenger.framework.composer.demo.configurator.c.class), c.f86635b).getValue());
        cVar.getLiveData().observe(b11.c().h().getViewLifecycleOwner(), new d(new b(b11, cVar)));
        Toast.makeText(b11.c().g().getApplicationContext(), "DemoPageConfigurator lifecycle callback onResume", 0).show();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        ru.ozon.android.messenger.framework.composer.configuration.e b11 = b();
        if (b11 == null) {
            return;
        }
        Toast.makeText(b11.c().g().getApplicationContext(), "DemoPageConfigurator lifecycle callback onStart", 0).show();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        ru.ozon.android.messenger.framework.composer.configuration.e b11 = b();
        if (b11 == null) {
            return;
        }
        Toast.makeText(b11.c().g().getApplicationContext(), "DemoPageConfigurator lifecycle callback onStop", 0).show();
    }
}
