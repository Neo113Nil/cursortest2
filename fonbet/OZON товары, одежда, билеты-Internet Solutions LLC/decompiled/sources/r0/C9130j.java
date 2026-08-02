package r0;

import S0.C3991w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n0.C8374O;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import r0.C9131k;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {201}, m = "invokeSuspend")
/* renamed from: r0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C9130j extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f82616d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9131k f82617e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ EnumC8372M f82618f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC9106G, kotlin.coroutines.d<? super Unit>, Object> f82619g;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {204}, m = "invokeSuspend")
    /* renamed from: r0.j$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9106G, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f82620d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f82621e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C9131k f82622f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC9106G, kotlin.coroutines.d<? super Unit>, Object> f82623g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(C9131k c9131k, Function2<? super InterfaceC9106G, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f82622f = c9131k;
            this.f82623g = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f82622f, this.f82623g, dVar);
            aVar.f82621e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC9106G interfaceC9106G, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(interfaceC9106G, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            C3991w0 c3991w0;
            C3991w0 c3991w02;
            C3991w0 c3991w03;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f82620d;
            C9131k c9131k = this.f82622f;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    InterfaceC9106G interfaceC9106G = (InterfaceC9106G) this.f82621e;
                    c3991w02 = c9131k.f82627d;
                    c3991w02.setValue(Boolean.TRUE);
                    Function2<InterfaceC9106G, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f82623g;
                    this.f82620d = 1;
                    if (function2.invoke(interfaceC9106G, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                c3991w03 = c9131k.f82627d;
                c3991w03.setValue(Boolean.FALSE);
                return Unit.f71690a;
            } catch (Throwable th2) {
                c3991w0 = c9131k.f82627d;
                c3991w0.setValue(Boolean.FALSE);
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C9130j(C9131k c9131k, EnumC8372M enumC8372M, Function2<? super InterfaceC9106G, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C9130j> dVar) {
        super(2, dVar);
        this.f82617e = c9131k;
        this.f82618f = enumC8372M;
        this.f82619g = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C9130j(this.f82617e, this.f82618f, this.f82619g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9130j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        C8374O c8374o;
        C9131k.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f82616d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C9131k c9131k = this.f82617e;
            c8374o = c9131k.f82626c;
            aVar = c9131k.f82625b;
            a aVar3 = new a(c9131k, this.f82619g, null);
            this.f82616d = 1;
            if (c8374o.e(aVar, this.f82618f, aVar3, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
