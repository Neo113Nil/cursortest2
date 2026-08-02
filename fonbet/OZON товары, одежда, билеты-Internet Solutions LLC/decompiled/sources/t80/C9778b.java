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
import ru.ozon.fintech.ui.screenstate.ScreenState;
import xe.M;
import xe.N;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.updatewall.presentation.UpdateWallFragment$initScreenState$$inlined$observe$1", f = "UpdateWallFragment.kt", l = {33}, m = "invokeSuspend")
/* renamed from: t80.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9778b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f99247d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f99248e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ UpdateWallFragment f99249f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f99250g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ UpdateWallFragment f99251h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.updatewall.presentation.UpdateWallFragment$initScreenState$$inlined$observe$1$1", f = "UpdateWallFragment.kt", l = {34}, m = "invokeSuspend")
    /* renamed from: t80.b$a */
    public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f99252d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f99253e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ UpdateWallFragment f99254f;

        /* renamed from: t80.b$a$a, reason: collision with other inner class name */
        public static final class C2179a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UpdateWallFragment f99255a;

            public C2179a(UpdateWallFragment updateWallFragment) {
                this.f99255a = updateWallFragment;
            }

            /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
            
                r0 = r3.f96348c;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                C9216a c9216a;
                C9216a c9216a2;
                ScreenState screenState = (ScreenState) t2;
                UpdateWallFragment updateWallFragment = this.f99255a;
                if (screenState != null && c9216a2 != null) {
                    c9216a2.f83212f.bindState(screenState);
                }
                c9216a = updateWallFragment.f96348c;
                if (c9216a != null) {
                    c9216a.f83212f.setVisibility(screenState != null ? 0 : 8);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, UpdateWallFragment updateWallFragment) {
            super(2, dVar);
            this.f99253e = interfaceC2395h;
            this.f99254f = updateWallFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f99253e, dVar, this.f99254f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f99252d;
            if (i11 == 0) {
                s.b(obj);
                C2179a c2179a = new C2179a(this.f99254f);
                this.f99252d = 1;
                if (this.f99253e.collect(c2179a, this) == aVar) {
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
    public C9778b(UpdateWallFragment updateWallFragment, InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, UpdateWallFragment updateWallFragment2) {
        super(2, dVar);
        this.f99249f = updateWallFragment;
        this.f99250g = interfaceC2395h;
        this.f99251h = updateWallFragment2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C9778b c9778b = new C9778b(this.f99249f, this.f99250g, dVar, this.f99251h);
        c9778b.f99248e = obj;
        return c9778b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9778b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f99247d;
        if (i11 == 0) {
            s.b(obj);
            if (N.f((M) this.f99248e)) {
                J viewLifecycleOwner = this.f99249f.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(this.f99250g, null, this.f99251h);
                this.f99247d = 1;
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
