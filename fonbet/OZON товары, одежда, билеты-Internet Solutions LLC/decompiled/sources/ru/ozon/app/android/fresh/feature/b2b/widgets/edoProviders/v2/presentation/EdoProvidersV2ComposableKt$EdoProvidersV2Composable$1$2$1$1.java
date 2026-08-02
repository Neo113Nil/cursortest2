package ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.presentation;

import A00.a;
import S0.A1;
import S0.InterfaceC3978p0;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.presentation.EdoProvidersV2ComposableKt$EdoProvidersV2Composable$1$2$1$1", f = "EdoProvidersV2Composable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EdoProvidersV2ComposableKt$EdoProvidersV2Composable$1$2$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC3978p0<Boolean> $areAllProvidersVisible$delegate;
    final /* synthetic */ A1<a> $composerEvent$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EdoProvidersV2ComposableKt$EdoProvidersV2Composable$1$2$1$1(A1<? extends a> a12, InterfaceC3978p0<Boolean> interfaceC3978p0, d<? super EdoProvidersV2ComposableKt$EdoProvidersV2Composable$1$2$1$1> dVar) {
        super(2, dVar);
        this.$composerEvent$delegate = a12;
        this.$areAllProvidersVisible$delegate = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new EdoProvidersV2ComposableKt$EdoProvidersV2Composable$1$2$1$1(this.$composerEvent$delegate, this.$areAllProvidersVisible$delegate, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r2 instanceof A00.a.u.c) != false) goto L8;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a EdoProvidersV2Composable_LLhsUjk$lambda$22$lambda$14$lambda$4;
        a EdoProvidersV2Composable_LLhsUjk$lambda$22$lambda$14$lambda$42;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        EdoProvidersV2Composable_LLhsUjk$lambda$22$lambda$14$lambda$4 = EdoProvidersV2ComposableKt.EdoProvidersV2Composable_LLhsUjk$lambda$22$lambda$14$lambda$4(this.$composerEvent$delegate);
        if (!(EdoProvidersV2Composable_LLhsUjk$lambda$22$lambda$14$lambda$4 instanceof a.u.b)) {
            EdoProvidersV2Composable_LLhsUjk$lambda$22$lambda$14$lambda$42 = EdoProvidersV2ComposableKt.EdoProvidersV2Composable_LLhsUjk$lambda$22$lambda$14$lambda$4(this.$composerEvent$delegate);
        }
        EdoProvidersV2ComposableKt.EdoProvidersV2Composable_LLhsUjk$lambda$22$lambda$14$lambda$7(this.$areAllProvidersVisible$delegate, false);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((EdoProvidersV2ComposableKt$EdoProvidersV2Composable$1$2$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
