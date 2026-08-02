package l00;

import Ae.C2399j;
import Ae.C2408n0;
import H00.b;
import Sc.s;
import androidx.lifecycle.K;
import androidx.lifecycle.ProcessLifecycleOwner;
import j00.C7234a;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m00.C8029a;
import org.jetbrains.annotations.NotNull;
import p00.C8825a;

/* renamed from: l00.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7782a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7234a f72183a;

    @e(c = "ru.ozon.composer.debug.menu.data.initializer.LoggerTogglerActionInitializer$init$1", f = "LoggerTogglerActionInitializer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: l00.a$a, reason: collision with other inner class name */
    static final class C1195a extends j implements Function2<C8029a, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f72184d;

        C1195a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            C1195a c1195a = new C1195a(2, dVar);
            c1195a.f72184d = obj;
            return c1195a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C8029a c8029a, d<? super Unit> dVar) {
            return ((C1195a) create(c8029a, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            C8029a c8029a = (C8029a) this.f72184d;
            boolean a11 = c8029a.a();
            int i11 = H00.d.f10454c;
            H00.d.c(a11 && c8029a.f(C8825a.f80002b));
            b.f(a11);
            return Unit.f71690a;
        }
    }

    public C7782a(@NotNull C7234a composerDebugMenuSDK) {
        Intrinsics.checkNotNullParameter(composerDebugMenuSDK, "composerDebugMenuSDK");
        this.f72183a = composerDebugMenuSDK;
    }

    public final void a() {
        ProcessLifecycleOwner processLifecycleOwner;
        C2408n0 c2408n0 = new C2408n0(this.f72183a.S(), new C1195a(2, null));
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        C2399j.C(c2408n0, K.a(processLifecycleOwner));
    }
}
