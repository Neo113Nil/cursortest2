package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.ReportAbuseFormContentKt$ReportAbuseFormContent$1$1", f = "ReportAbuseFormContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ p f87095d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ o f87096e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(p pVar, o oVar, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f87095d = pVar;
        this.f87096e = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f87095d, this.f87096e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        this.f87095d.g0(new a.C1556a(this.f87096e));
        return Unit.f71690a;
    }
}
