package ru.ozon.android.messenger.framework.presentation.ai;

import S0.InterfaceC3978p0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantScreenKt$AiAssistantScreen$1$3$1", f = "AiAssistantScreen.kt", l = {138}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class S extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89341d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ List<ru.ozon.android.messenger.framework.presentation.models.q> f89342e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ v0.I f89343f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f89344g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S(List<ru.ozon.android.messenger.framework.presentation.models.q> list, v0.I i11, InterfaceC3978p0<Boolean> interfaceC3978p0, kotlin.coroutines.d<? super S> dVar) {
        super(2, dVar);
        this.f89342e = list;
        this.f89343f = i11;
        this.f89344g = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new S(this.f89342e, this.f89343f, this.f89344g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((S) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89341d;
        InterfaceC3978p0<Boolean> interfaceC3978p0 = this.f89344g;
        if (i11 == 0) {
            Sc.s.b(obj);
            int i12 = U.f89357b;
            if (interfaceC3978p0.getValue().booleanValue()) {
                List<ru.ozon.android.messenger.framework.presentation.models.q> list = this.f89342e;
                if (!list.isEmpty()) {
                    int P11 = C7714v.P(list);
                    this.f89341d = 1;
                    int i13 = v0.I.f101468y;
                    if (this.f89343f.k(P11, 0, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Sc.s.b(obj);
        int i14 = U.f89357b;
        interfaceC3978p0.setValue(Boolean.FALSE);
        return Unit.f71690a;
    }
}
