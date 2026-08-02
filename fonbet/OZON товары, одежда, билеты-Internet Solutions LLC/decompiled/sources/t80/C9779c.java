package t80;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r80.C9216a;
import ru.ozon.fintech.features.updatewall.presentation.UpdateWallFragment;
import xe.M;
import xe.N;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.updatewall.presentation.UpdateWallFragment$initScreenState$$inlined$observe$2", f = "UpdateWallFragment.kt", l = {33}, m = "invokeSuspend")
/* renamed from: t80.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9779c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f99256d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f99257e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ UpdateWallFragment f99258f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f99259g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ UpdateWallFragment f99260h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.updatewall.presentation.UpdateWallFragment$initScreenState$$inlined$observe$2$1", f = "UpdateWallFragment.kt", l = {34}, m = "invokeSuspend")
    /* renamed from: t80.c$a */
    public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f99261d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f99262e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ UpdateWallFragment f99263f;

        /* renamed from: t80.c$a$a, reason: collision with other inner class name */
        public static final class C2180a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UpdateWallFragment f99264a;

            public C2180a(UpdateWallFragment updateWallFragment) {
                this.f99264a = updateWallFragment;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ae.InterfaceC2397i
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                C9216a c9216a;
                UpdateWallFragment updateWallFragment = this.f99264a;
                c9216a = updateWallFragment.f96348c;
                E30.g.a(new d(updateWallFragment), c9216a, (e) t2);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, UpdateWallFragment updateWallFragment) {
            super(2, dVar);
            this.f99262e = interfaceC2395h;
            this.f99263f = updateWallFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f99262e, dVar, this.f99263f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f99261d;
            if (i11 == 0) {
                s.b(obj);
                C2180a c2180a = new C2180a(this.f99263f);
                this.f99261d = 1;
                if (this.f99262e.collect(c2180a, this) == aVar) {
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
    public C9779c(UpdateWallFragment updateWallFragment, InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, UpdateWallFragment updateWallFragment2) {
        super(2, dVar);
        this.f99258f = updateWallFragment;
        this.f99259g = interfaceC2395h;
        this.f99260h = updateWallFragment2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C9779c c9779c = new C9779c(this.f99258f, this.f99259g, dVar, this.f99260h);
        c9779c.f99257e = obj;
        return c9779c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9779c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f99256d;
        if (i11 == 0) {
            s.b(obj);
            if (N.f((M) this.f99257e)) {
                J viewLifecycleOwner = this.f99258f.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(this.f99259g, null, this.f99260h);
                this.f99256d = 1;
                if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        return Unit.f71690a;
    }
}
