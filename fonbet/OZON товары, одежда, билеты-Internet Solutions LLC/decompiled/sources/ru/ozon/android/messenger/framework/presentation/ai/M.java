package ru.ozon.android.messenger.framework.presentation.ai;

import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import r0.C9115P;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantListKt$messageBubble$1$2$2", f = "AiAssistantList.kt", l = {319}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class M extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89291d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f89292e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f89293f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ xe.M f89294g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ v0.I f89295h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ String f89296i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Function0<Integer> f89297j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Function1<ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o, Unit> f89298k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ Function0<String> f89299l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ boolean f89300m;

    static final class a extends AbstractC7737t implements Function1<C7459e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f89301b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ xe.M f89302c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v0.I f89303d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f89304e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Integer> f89305f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o, Unit> f89306g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<String> f89307h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f89308i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<Unit> function0, xe.M m11, v0.I i11, String str, Function0<Integer> function02, Function1<? super ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o, Unit> function1, Function0<String> function03, boolean z11) {
            super(1);
            this.f89301b = function0;
            this.f89302c = m11;
            this.f89303d = i11;
            this.f89304e = str;
            this.f89305f = function02;
            this.f89306g = function1;
            this.f89307h = function03;
            this.f89308i = z11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7459e c7459e) {
            c7459e.getClass();
            this.f89301b.invoke();
            C10727i.c(this.f89302c, null, null, new L(this.f89303d, this.f89304e, this.f89305f, this.f89306g, this.f89307h, this.f89308i, null), 3);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    M(Function0<Unit> function0, xe.M m11, v0.I i11, String str, Function0<Integer> function02, Function1<? super ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o, Unit> function1, Function0<String> function03, boolean z11, kotlin.coroutines.d<? super M> dVar) {
        super(2, dVar);
        this.f89293f = function0;
        this.f89294g = m11;
        this.f89295h = i11;
        this.f89296i = str;
        this.f89297j = function02;
        this.f89298k = function1;
        this.f89299l = function03;
        this.f89300m = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        M m11 = new M(this.f89293f, this.f89294g, this.f89295h, this.f89296i, this.f89297j, this.f89298k, this.f89299l, this.f89300m, dVar);
        m11.f89292e = obj;
        return m11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
        return ((M) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object f7;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89291d;
        if (i11 == 0) {
            Sc.s.b(obj);
            x1.F f11 = (x1.F) this.f89292e;
            a aVar2 = new a(this.f89293f, this.f89294g, this.f89295h, this.f89296i, this.f89297j, this.f89298k, this.f89299l, this.f89300m);
            this.f89291d = 1;
            f7 = C9115P.f(C9115P.f82441a, this, null, (r12 & 2) != 0 ? null : aVar2, (r12 & 8) != 0 ? null : null, f11);
            if (f7 == aVar) {
                return aVar;
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
