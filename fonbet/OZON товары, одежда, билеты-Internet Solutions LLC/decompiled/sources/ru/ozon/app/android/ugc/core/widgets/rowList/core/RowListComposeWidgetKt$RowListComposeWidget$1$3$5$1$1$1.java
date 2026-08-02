package ru.ozon.app.android.ugc.core.widgets.rowList.core;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorUpdateKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.UnsubscribeAuthorUpdateKey;
import ru.ozon.app.android.pdp.utils.CellExtKt;
import ru.ozon.app.android.ugc.core.widgets.rowList.di.RowListComponent;
import ru.ozon.app.android.ugc.core.widgets.rowList.presentation.RowListItemVO;
import ru.ozon.composer.compose.widget.i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.rowList.core.RowListComposeWidgetKt$RowListComposeWidget$1$3$5$1$1$1", f = "RowListComposeWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RowListComposeWidgetKt$RowListComposeWidget$1$3$5$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ RowListComponent $component;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ i<RowListItemVO> $this_content;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RowListComposeWidgetKt$RowListComposeWidget$1$3$5$1$1$1(i<RowListItemVO> iVar, RowListComponent rowListComponent, InterfaceC7851b interfaceC7851b, d<? super RowListComposeWidgetKt$RowListComposeWidget$1$3$5$1$1$1> dVar) {
        super(2, dVar);
        this.$this_content = iVar;
        this.$component = rowListComponent;
        this.$controller = interfaceC7851b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RowListComposeWidgetKt$RowListComposeWidget$1$3$5$1$1$1(this.$this_content, this.$component, this.$controller, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String rightBlockParam = CellExtKt.getRightBlockParam(this.$this_content.b().getNormal(), "authorId");
        Boolean isAuthorSubscribed = this.$component.getSubscribeAuthorsIdStorage().isAuthorSubscribed(rightBlockParam);
        boolean isSelected = this.$this_content.b().getIsSelected();
        if (Intrinsics.d(isAuthorSubscribed, Boolean.TRUE) && !isSelected) {
            this.$controller.update(new SubscribeAuthorUpdateKey(rightBlockParam));
        } else if (Intrinsics.d(isAuthorSubscribed, Boolean.FALSE) && isSelected) {
            this.$controller.update(new UnsubscribeAuthorUpdateKey(rightBlockParam));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((RowListComposeWidgetKt$RowListComposeWidget$1$3$5$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
