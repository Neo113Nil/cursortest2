package ru.ozon.android.messenger.framework.presentation.search;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.search.InterfaceC9524d;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel$restartSearch$3", f = "ChatSearchViewModel.kt", l = {416}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class D extends kotlin.coroutines.jvm.internal.j implements Function2<Boolean, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f91577d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ boolean f91578e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9527g f91579f;

    static final class a extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f91580b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
            ru.ozon.android.messenger.framework.presentation.models.q it = qVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(ru.ozon.android.messenger.framework.presentation.models.r.b(it) instanceof ru.ozon.android.messenger.blocks.emptystate.v2.g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(C9527g c9527g, kotlin.coroutines.d<? super D> dVar) {
        super(2, dVar);
        this.f91579f = c9527g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        D d11 = new D(this.f91579f, dVar);
        d11.f91578e = ((Boolean) obj).booleanValue();
        return d11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, kotlin.coroutines.d<? super Unit> dVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((D) create(bool2, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91577d;
        C9527g c9527g = this.f91579f;
        if (i11 == 0) {
            Sc.s.b(obj);
            if (this.f91578e) {
                this.f91577d = 1;
                if (C9527g.C0(c9527g, a.f91580b, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Sc.s.b(obj);
        c9527g.T0(InterfaceC9524d.a.f91713a);
        c9527g.T0(new InterfaceC9524d.b(null));
        return Unit.f71690a;
    }
}
