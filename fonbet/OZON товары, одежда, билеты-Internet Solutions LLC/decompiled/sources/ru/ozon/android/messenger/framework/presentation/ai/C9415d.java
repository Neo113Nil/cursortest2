package ru.ozon.android.messenger.framework.presentation.ai;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import J0.C3326o1;
import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.android.messenger.framework.presentation.ai.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantFragment$SourcesCurtainContainer$1$1$1", f = "AiAssistantFragment.kt", l = {598}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9415d extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89535d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9413c f89536e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<AiMessageActionsDTO.SourcesBadge.MenuInfo> f89537f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3326o1 f89538g;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.d$a */
    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<AiMessageActionsDTO.SourcesBadge.MenuInfo> f89539a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3326o1 f89540b;

        a(InterfaceC3978p0<AiMessageActionsDTO.SourcesBadge.MenuInfo> interfaceC3978p0, C3326o1 c3326o1) {
            this.f89539a = interfaceC3978p0;
            this.f89540b = c3326o1;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            Y y11 = (Y) obj;
            if (!(y11 instanceof Y.b)) {
                return Unit.f71690a;
            }
            this.f89539a.setValue(((Y.b) y11).a());
            Object i11 = this.f89540b.i(dVar);
            return i11 == Wc.a.COROUTINE_SUSPENDED ? i11 : Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9415d(C9413c c9413c, InterfaceC3978p0<AiMessageActionsDTO.SourcesBadge.MenuInfo> interfaceC3978p0, C3326o1 c3326o1, kotlin.coroutines.d<? super C9415d> dVar) {
        super(2, dVar);
        this.f89536e = c9413c;
        this.f89537f = interfaceC3978p0;
        this.f89538g = c3326o1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9415d(this.f89536e, this.f89537f, this.f89538g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9415d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89535d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2395h<Y> K02 = C9413c.A(this.f89536e).K0();
            a aVar2 = new a(this.f89537f, this.f89538g);
            this.f89535d = 1;
            if (K02.collect(aVar2, this) == aVar) {
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
