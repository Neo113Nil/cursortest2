package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.cell.compose;

import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.checkoutcomposer.split.di.SplitWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.cell.CellVO;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/cell/CellVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class CellComposeWidgetKt$cellComposeWidget$3 extends AbstractC7737t implements Function1<k<CellVO>, Unit> {
    final /* synthetic */ SplitWidgetComponent $component;
    final /* synthetic */ j<Object, CellVO> $this_cellComposeWidget;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/cell/CellVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.checkoutcomposer.split.presentation.elements.cell.compose.CellComposeWidgetKt$cellComposeWidget$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<CellVO>, g.a, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ SplitWidgetComponent $component;
        final /* synthetic */ j<Object, CellVO> $this_cellComposeWidget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(j<Object, CellVO> jVar, SplitWidgetComponent splitWidgetComponent) {
            super(4);
            this.$this_cellComposeWidget = jVar;
            this.$component = splitWidgetComponent;
        }

        @Override // fd.InterfaceC6512o
        public /* bridge */ /* synthetic */ Unit invoke(i<CellVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(iVar, aVar, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(i<CellVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
            Intrinsics.checkNotNullParameter(content, "$this$content");
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i11 & 6) == 0) {
                i11 |= interfaceC3967k.n(content) ? 4 : 2;
            }
            if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                interfaceC3967k.j();
            } else {
                CellContentKt.CellContent(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_cellComposeWidget.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), this.$component.getCustomActionHandlersStoreFactory().create(ComposerActionWithActionHandler.class))), interfaceC3967k, 0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellComposeWidgetKt$cellComposeWidget$3(j<Object, CellVO> jVar, SplitWidgetComponent splitWidgetComponent) {
        super(1);
        this.$this_cellComposeWidget = jVar;
        this.$component = splitWidgetComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(k<CellVO> kVar) {
        invoke2(kVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(k<CellVO> widgetSpec) {
        Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
        widgetSpec.a(new C4912a(true, 1771490124, new AnonymousClass1(this.$this_cellComposeWidget, this.$component)));
    }
}
