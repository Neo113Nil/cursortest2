package v10;

import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Sc.s;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* renamed from: v10.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10185c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC6511n<Object, Object, kotlin.coroutines.d<? super Boolean>, Object> f101655a = new a(3, null);

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ext.FlowExtKt$defaultAreEquivalent$1", f = "FlowExt.kt", l = {19}, m = "invokeSuspend")
    /* renamed from: v10.c$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<Object, Object, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f101656d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f101657e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f101658f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ext.FlowExtKt$defaultAreEquivalent$1$1", f = "FlowExt.kt", l = {}, m = "invokeSuspend")
        /* renamed from: v10.c$a$a, reason: collision with other inner class name */
        static final class C2217a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Boolean>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f101659d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f101660e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2217a(Object obj, Object obj2, kotlin.coroutines.d<? super C2217a> dVar) {
                super(2, dVar);
                this.f101659d = obj;
                this.f101660e = obj2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2217a(this.f101659d, this.f101660e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((C2217a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                return Boolean.valueOf(Intrinsics.d(this.f101659d, this.f101660e));
            }
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(Object obj, Object obj2, kotlin.coroutines.d<? super Boolean> dVar) {
            a aVar = new a(3, dVar);
            aVar.f101657e = obj;
            aVar.f101658f = obj2;
            return aVar.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f101656d;
            boolean z11 = true;
            if (i11 == 0) {
                s.b(obj);
                Object obj2 = this.f101657e;
                Object obj3 = this.f101658f;
                if (obj2 != obj3) {
                    He.c a11 = C10720e0.a();
                    C2217a c2217a = new C2217a(obj2, obj3, null);
                    this.f101657e = null;
                    this.f101656d = 1;
                    obj = C10727i.f(a11, c2217a, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Boolean.valueOf(z11);
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            z11 = ((Boolean) obj).booleanValue();
            return Boolean.valueOf(z11);
        }
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> a(@NotNull InterfaceC2395h<? extends T> interfaceC2395h) {
        Intrinsics.checkNotNullParameter(interfaceC2395h, "<this>");
        return new C10184b(interfaceC2395h, f101655a);
    }

    @NotNull
    public static final void b(@NotNull C2408n0 c2408n0, @NotNull M scope) {
        Intrinsics.checkNotNullParameter(c2408n0, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        C10727i.c(scope, C10720e0.b(), null, new d(c2408n0, null), 2);
    }

    @NotNull
    public static final C2408n0 c(@NotNull InterfaceC2395h interfaceC2395h, @NotNull Function2 operation) {
        Intrinsics.checkNotNullParameter(interfaceC2395h, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return new C2408n0(interfaceC2395h, new e(operation, null));
    }
}
