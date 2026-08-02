package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation;

import A00.a;
import Sc.s;
import android.os.Handler;
import i10.h;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import l10.i;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "refreshCount", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.AdvRefreshWithDelayWidgetHolder$observeRefreshEvent$1", f = "AdvRefreshWithDelayWidgetHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class AdvRefreshWithDelayWidgetHolder$observeRefreshEvent$1 extends j implements Function2<Integer, d<? super Unit>, Object> {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ AdvRefreshWithDelayWidgetHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvRefreshWithDelayWidgetHolder$observeRefreshEvent$1(AdvRefreshWithDelayWidgetHolder advRefreshWithDelayWidgetHolder, d<? super AdvRefreshWithDelayWidgetHolder$observeRefreshEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = advRefreshWithDelayWidgetHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(AdvRefreshWithDelayWidgetHolder advRefreshWithDelayWidgetHolder) {
        boolean isSilent;
        i iVar;
        i iVar2;
        isSilent = advRefreshWithDelayWidgetHolder.isSilent();
        if (isSilent) {
            iVar2 = advRefreshWithDelayWidgetHolder.screenContainer;
            InterfaceC7851b.a.e(iVar2.M(), null, null, null, 7);
        } else {
            iVar = advRefreshWithDelayWidgetHolder.screenContainer;
            InterfaceC7851b.a.a(iVar.M(), null, null, null, new h.b(new a.C.C0000a(), new l.a.C1079a(0L, null, 3)), 7);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AdvRefreshWithDelayWidgetHolder$observeRefreshEvent$1 advRefreshWithDelayWidgetHolder$observeRefreshEvent$1 = new AdvRefreshWithDelayWidgetHolder$observeRefreshEvent$1(this.this$0, dVar);
        advRefreshWithDelayWidgetHolder$observeRefreshEvent$1.I$0 = ((Number) obj).intValue();
        return advRefreshWithDelayWidgetHolder$observeRefreshEvent$1;
    }

    public final Object invoke(int i11, d<? super Unit> dVar) {
        return ((AdvRefreshWithDelayWidgetHolder$observeRefreshEvent$1) create(Integer.valueOf(i11), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Handler handler;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        int i11 = this.I$0;
        handler = this.this$0.handler;
        final AdvRefreshWithDelayWidgetHolder advRefreshWithDelayWidgetHolder = this.this$0;
        handler.post(new Runnable() { // from class: ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.a
            @Override // java.lang.Runnable
            public final void run() {
                AdvRefreshWithDelayWidgetHolder$observeRefreshEvent$1.invokeSuspend$lambda$0(AdvRefreshWithDelayWidgetHolder.this);
            }
        });
        this.this$0.trackPageReload(i11);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Integer num, d<? super Unit> dVar) {
        return invoke(num.intValue(), dVar);
    }
}
