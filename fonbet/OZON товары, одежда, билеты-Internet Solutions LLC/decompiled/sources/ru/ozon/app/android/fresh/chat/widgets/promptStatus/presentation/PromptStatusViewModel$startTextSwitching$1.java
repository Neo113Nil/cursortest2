package ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusViewModel$startTextSwitching$1", f = "PromptStatusViewModel.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class PromptStatusViewModel$startTextSwitching$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ PromptStatusVO $item;
    int I$0;
    int label;
    final /* synthetic */ PromptStatusViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromptStatusViewModel$startTextSwitching$1(PromptStatusVO promptStatusVO, PromptStatusViewModel promptStatusViewModel, d<? super PromptStatusViewModel$startTextSwitching$1> dVar) {
        super(2, dVar);
        this.$item = promptStatusVO;
        this.this$0 = promptStatusViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PromptStatusViewModel$startTextSwitching$1(this.$item, this.this$0, dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0057 -> B:5:0x000e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            Wc.a r0 = Wc.a.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            int r1 = r6.I$0
            Sc.s.b(r7)
        Le:
            r7 = r1
            goto L1c
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            Sc.s.b(r7)
            r7 = 0
        L1c:
            int r7 = r7 + r2
            ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusVO r1 = r6.$item
            java.util.List r1 = r1.getLoadingTitles()
            int r1 = r1.size()
            int r1 = r7 % r1
            ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusViewModel r7 = r6.this$0
            Ae.x0 r7 = ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusViewModel.access$get_state$p(r7)
            ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusState$Progress r3 = new ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusState$Progress
            ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusVO r4 = r6.$item
            ru.ozon.uni.atoms.data.icon.IconDTO r4 = r4.getLoadingIcon()
            ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusVO r5 = r6.$item
            java.util.List r5 = r5.getLoadingTitles()
            java.lang.Object r5 = r5.get(r1)
            ru.ozon.uni.atoms.data.text.TextDTO r5 = (ru.ozon.uni.atoms.data.text.TextDTO) r5
            r3.<init>(r4, r5)
            r7.setValue(r3)
            ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusVO r7 = r6.$item
            long r3 = r7.getTextSwitchingTime()
            r6.I$0 = r1
            r6.label = r2
            java.lang.Object r7 = xe.Y.b(r3, r6)
            if (r7 != r0) goto Le
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusViewModel$startTextSwitching$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PromptStatusViewModel$startTextSwitching$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
