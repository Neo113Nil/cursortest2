package yg0;

import Sc.s;
import io.sentry.U;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.ozonSentryHelper.internal.usecase.SendTestSentryEventUseCase$execute$2", f = "SendTestSentryEventUseCase.kt", l = {}, m = "invokeSuspend")
/* renamed from: yg0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10899b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10900c f106623d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC10902e f106624e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ U f106625f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f106626g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f106627h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10899b(C10900c c10900c, AbstractC10902e abstractC10902e, U u11, String str, String str2, kotlin.coroutines.d<? super C10899b> dVar) {
        super(2, dVar);
        this.f106623d = c10900c;
        this.f106624e = abstractC10902e;
        this.f106625f = u11;
        this.f106626g = str;
        this.f106627h = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C10899b(this.f106623d, this.f106624e, this.f106625f, this.f106626g, this.f106627h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C10899b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        String str = this.f106626g;
        String str2 = this.f106627h;
        C10900c.a(this.f106623d, this.f106624e, this.f106625f, str, str2);
        return Unit.f71690a;
    }
}
